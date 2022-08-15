package com.example.kurly.buy;

import com.example.kurly.product.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {

    public void insertBuy(BuyDTO buyDTO);
    public List<BuyDTO> selectAll(BuyDTO buyDTO);
    public ProductDTO selectOne(BuyDTO buyDTO);
}
