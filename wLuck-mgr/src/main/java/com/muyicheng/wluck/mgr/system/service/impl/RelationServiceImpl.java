package com.muyicheng.wluck.mgr.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.muyicheng.wluck.mgr.system.entity.Relation;
import com.muyicheng.wluck.mgr.system.mapper.RelationMapper;
import com.muyicheng.wluck.mgr.system.service.IRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-02-22
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
