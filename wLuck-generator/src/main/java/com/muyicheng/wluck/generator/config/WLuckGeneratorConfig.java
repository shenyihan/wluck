package com.muyicheng.wluck.generator.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/12
 */
public class WLuckGeneratorConfig extends AbstractGeneratorConfig {

    protected void globalConfig() {
        //写自己项目的绝对路径,注意具体到java目录
        globalConfig.setOutputDir("F:\\work\\ideaWorkplace\\wLuck\\wLuck-mgr\\src\\main\\java");
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("yangxc");
    }

    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/wluck?characterEncoding=utf8");
    }

    protected void strategyConfig() {
        // 此处可以修改为您的表前缀
        strategyConfig.setTablePrefix(new String[]{"sys_"});
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);

    }

    protected void packageConfig() {
        packageConfig.setParent("com.muyicheng.wluck.mgr.system");
           /* packageConfig.setEntity("com.muyicheng.guns.admin.common.persistence.model");
            packageConfig.setMapper("com.stylefeng.guns.admin.common.persistence.dao");
            packageConfig.setXml("com.stylefeng.guns.admin.common.persistence.dao.mapping");*/
    }

    protected void contextConfig() {
        contextConfig.setProPackage("com.muyicheng.wluck.mgr");
        contextConfig.setCoreBasePackage("com.muyicheng.wluck.core");
        contextConfig.setBizChName("部门管理");
        contextConfig.setBizEnName("Dept");
        contextConfig.setModuleName("system");
        contextConfig.setProjectPath("F:\\work\\ideaWorkplace\\wLuck\\wLuck-mgr");//写自己项目的绝对路径
        contextConfig.setEntityName("Dept");
        //sqlConfig.setParentMenuName(null);//这里写已有菜单的名称,当做父节点

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        /**
         * guns 生成器开关
         */
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        contextConfig();
        packageConfig();
    }
}

