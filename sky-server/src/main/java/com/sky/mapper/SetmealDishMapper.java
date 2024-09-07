package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author WR
 * @Version 1.0
 */
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量插入菜品
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除
     * @param ids
     */
    void deleteByDishIds(List<Long> ids);

    @Select("select * from setmeal_dish where setmeal_id=#{setmealId} ")
    List<SetmealDish> getBySetmealId(Long setmealId);
}
