package com.example.kurly.product;

import java.util.List;

public interface ProductService {
    public List<ProductDTO> selectAll(ProductDTO productDTO);
    public ProductDTO selectOne(ProductDTO productDTO);

}
