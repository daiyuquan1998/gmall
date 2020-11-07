package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.GroupVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * 属性分组
 *
 * @author daiyuquan
 * @email 1206445365@qq.com
 * @date 2020-11-05 16:11:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryCroupByCid(QueryCondition queryCondition, Long catId);

    GroupVO queryGroupVOById(Long id);

    List<GroupVO> queryGroupWithAttrByCid(Long catId);
}

