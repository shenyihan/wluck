package com.muyicheng.wluck.mgr.system.warpper;

import com.muyicheng.wluck.core.util.ToolUtil;
import com.muyicheng.wluck.core.warpper.BaseControllerWarpper;
import com.muyicheng.wluck.mgr.common.constant.factory.ConstantFactory;
import com.muyicheng.wluck.mgr.system.entity.Dict;

import java.util.List;
import java.util.Map;

/**
 * 字典列表的包装
 *
 * @author fengshuonan
 * @date 2017年4月25日 18:10:31
 */
public class DictWarpper extends BaseControllerWarpper {

    public DictWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        StringBuffer detail = new StringBuffer();
        Integer id = (Integer) map.get("id");
        List<Dict> dicts = ConstantFactory.me().findInDict(id);
        if(dicts != null){
            for (Dict dict : dicts) {
                detail.append(dict.getNum() + ":" +dict.getName() + ",");
            }
            map.put("detail", ToolUtil.removeSuffix(detail.toString(),","));
        }
    }

}
