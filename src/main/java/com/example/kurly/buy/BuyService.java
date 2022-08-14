package com.example.kurly.buy;

import com.example.kurly.product.ProductDTO;

import java.util.List;

public interface BuyService {
    public void insertBuy(BuyDTO buyDTO);
    public List<BuyDTO> selectAll(BuyDTO buyDTO);
    public ProductDTO selectOne(BuyDTO buyDTO);
}
