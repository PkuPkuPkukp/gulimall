package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jimfeng
 * @email 1586373711@qq.com
 * @date 2025-06-28 14:35:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
