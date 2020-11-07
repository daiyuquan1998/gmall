package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author daiyuquan
 * @email 1206445365@qq.com
 * @date 2020-11-05 16:11:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
