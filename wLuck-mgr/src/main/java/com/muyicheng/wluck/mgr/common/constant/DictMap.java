package com.muyicheng.wluck.mgr.common.constant;


import com.muyicheng.wluck.mgr.common.constant.base.AbstractDictMap;

/**
 * 字典map
 *
 * @author fengshuonan
 * @date 2017-05-06 15:43
 */
public class DictMap extends AbstractDictMap {

    @Override
    public void init() {
        put("dictId","字典名称");
        put("dictName","字典名称");
        put("dictValues","字典内容");
    }

    @Override
    protected void initBeWrapped() {

    }
}
