package com.muyicheng.wluck.mgr.system.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.muyicheng.wluck.mgr.common.node.ZTreeNode;
import com.muyicheng.wluck.mgr.system.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
public interface DeptMapper extends BaseMapper<Dept> {

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    List<Map<String, Object>> list(@Param("condition") String condition);

}