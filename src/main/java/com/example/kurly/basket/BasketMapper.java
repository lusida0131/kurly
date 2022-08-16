package com.example.kurly.basket;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BasketMapper {
    public void register(BasketDTO basket);

    public void delete(int bno);

    public List<BasketDTO> list();
}
