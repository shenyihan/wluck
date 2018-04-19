package com.muyicheng.wluck.util;

import com.muyicheng.wluck.core.util.SpringContextHolder;
import com.muyicheng.wluck.properties.WLuckProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(WLuckProperties.class).getKaptchaOpen();
    }
}