package com.example.kurly.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductMapper productMapper;
    @Override
    public List<ProductDTO> selectAll(ProductDTO productDTO) {
        return productMapper.selectAll(productDTO);
    }

    @Override
    public ProductDTO selectOne(ProductDTO productDTO) {
        return productMapper.selectOne(productDTO);
    }
}
