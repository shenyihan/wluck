package com.muyicheng.wluck.util;

import com.muyicheng.wluck.core.util.SpringContextHolder;
import com.muyicheng.wluck.mgr.common.constant.Const;
import com.muyicheng.wluck.mgr.common.node.MenuNode;
import com.muyicheng.wluck.properties.WLuckProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 *
 * @author fengshuonan
 * @date 2017-08-17 16:55
 */
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        WLuckProperties gunsProperties = SpringContextHolder.getBean(WLuckProperties.class);
        if (!gunsProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
