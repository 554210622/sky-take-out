package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;

/**
 * @Author WR
 * @Version 1.0
 */

public interface DishService {
    /**
     * 新增菜品和对应口味
     * @param dishDTO
     * @return
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
