package com.muyicheng.wluck.generator.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.muyicheng.wluck.core.support.StrKit;
import com.muyicheng.wluck.core.util.FileUtil;
import com.muyicheng.wluck.generator.config.pluginconfig.ContextConfig;
import com.muyicheng.wluck.generator.engine.SimpleTemplateEngine;

import java.io.File;
import java.util.List;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/11
 */
public abstract class AbstractGeneratorConfig {

    GlobalConfig globalConfig = new GlobalConfig();

    DataSourceConfig dataSourceConfig = new DataSourceConfig();

    StrategyConfig strategyConfig = new StrategyConfig();

    PackageConfig packageConfig = new PackageConfig();

    TableInfo tableInfo = null;

    AutoGenerator autoGenerator = new AutoGenerator();

    /**
     * Guns代码生成器配置
     */
    ContextConfig contextConfig = new ContextConfig();

    //SqlConfig sqlConfig = new SqlConfig();

    protected abstract void config();

    public void init() {
        config();

        //packageConfig.setService(contextConfig.getProPackage() + "." + contextConfig.getModuleName() + ".service");
        //packageConfig.setServiceImpl(contextConfig.getProPackage() + "." + contextConfig.getModuleName() + ".service.impl");

        //controller没用掉,生成之后会自动删掉
       /* packageConfig.setController("TTT");

        if (!contextConfig.getEntitySwitch()) {
            packageConfig.setEntity("TTT");
        }

        if (!contextConfig.getDaoSwitch()) {
            packageConfig.setMapper("TTT");
            packageConfig.setXml("TTT");
        }

        if (!contextConfig.getServiceSwitch()) {
            packageConfig.setService("TTT");
            packageConfig.setServiceImpl("TTT");
        }*/

    }

    /**
     * 删除不必要的代码
     */
    public void destory() {
        String outputDir = globalConfig.getOutputDir() + "/TTT";
        FileUtil.deleteDir(new File(outputDir));
    }

    public AbstractGeneratorConfig() {
    }

    public void doMpGeneration() {
        init();
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();
        destory();

        //获取table信息,
        List<TableInfo> tableInfoList = autoGenerator.getConfig().getTableInfoList();
        if (tableInfoList != null && tableInfoList.size() > 0) {
            for (TableInfo tableInfo : tableInfoList){
                contextConfig.setBizChName(tableInfo.getComment());
                contextConfig.setBizEnName(StrKit.firstCharToLowerCase(tableInfo.getEntityName()));
                contextConfig.setEntityName(tableInfo.getEntityName());
                SimpleTemplateEngine wluckTemplateEngine = new SimpleTemplateEngine();
                wluckTemplateEngine.setContextConfig(contextConfig);
                //sqlConfig.setConnection(dataSourceConfig.getConn());
                // wluckTemplateEngine.setSqlConfig(sqlConfig);
                wluckTemplateEngine.setTableInfo(tableInfo);
                wluckTemplateEngine.start();

            }
        }
    }

    public void doWLuckGeneration() {
        SimpleTemplateEngine wluckTemplateEngine = new SimpleTemplateEngine();
        wluckTemplateEngine.setContextConfig(contextConfig);
        //sqlConfig.setConnection(dataSourceConfig.getConn());
        // wluckTemplateEngine.setSqlConfig(sqlConfig);
        wluckTemplateEngine.setTableInfo(tableInfo);
        wluckTemplateEngine.start();
    }
}
