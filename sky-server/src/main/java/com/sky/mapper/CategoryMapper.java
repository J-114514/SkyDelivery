package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

    /**
     * 新增菜品/套餐分类
     * @param
     */
    @Insert("insert into category (name, type, sort, create_time, update_time, create_user, update_user,status) " +
            "values " +
            "(#{name}, #{type}, #{sort}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser}, #{status})")

    void insert(Category category);

    /**
     * 分页查询菜品/套餐分类
     * @param categoryPageQueryDTO
     * @return
     */
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
}
