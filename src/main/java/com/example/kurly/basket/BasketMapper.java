package com.example.kurly.basket;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasketMapper {
    public void register(BasketDTO basket);
}
