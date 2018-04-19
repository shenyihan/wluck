package com.muyicheng.wluck.beetl;

import com.muyicheng.wluck.core.util.ToolUtil;
import com.muyicheng.wluck.shiro.ShiroExt;
import com.muyicheng.wluck.util.KaptchaUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/13
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
    }
}
