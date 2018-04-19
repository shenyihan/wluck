package com.muyicheng.wluck.mgr.common.constant;


import com.muyicheng.wluck.mgr.common.constant.base.AbstractDictMap;

/**
 * 日志的字典
 *
 * @author fengshuonan
 * @date 2017-05-06 15:01
 */
public class LogDict extends AbstractDictMap {

    @Override
    public void init() {
        put("tips","备注");
    }

    @Override
    protected void initBeWrapped() {

    }
}
