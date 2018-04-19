package com.muyicheng.wluck.generator;

import com.muyicheng.wluck.generator.config.WLuckGeneratorConfig;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/11
 */
public class WLuckCodeGenerator {
    public static void main(String[] args){
        //mybatisplus代码生成
        WLuckGeneratorConfig wluckGeneratorConfig = new WLuckGeneratorConfig();
        wluckGeneratorConfig.doMpGeneration();


        //wluckGeneratorConfig.doWLuckGeneration();
    }
}
