package com.example.kurly.buy;

import com.example.kurly.product.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuyServiceImpl implements BuyService{

    public final BuyMapper buyMapper;
    @Override
    public void insertBuy(BuyDTO buyDTO) {
        buyMapper.insertBuy(buyDTO);
    }

    @Override
    public List<BuyDTO> selectAll(BuyDTO buyDTO) {
        return buyMapper.selectAll(buyDTO);
    }

    @Override
    public ProductDTO selectOne(BuyDTO buyDTO) {
        return buyMapper.selectOne(buyDTO);
    }
}
