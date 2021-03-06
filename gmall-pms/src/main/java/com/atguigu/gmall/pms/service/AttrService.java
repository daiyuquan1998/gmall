package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.AttrVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品属性
 *
 * @author daiyuquan
 * @email 1206445365@qq.com
 * @date 2020-11-05 16:11:14
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryAttrsByCidOrTypePage(QueryCondition queryCondition, Long cid, Integer type);

    void saveAttrVO(AttrVO attr);
}

