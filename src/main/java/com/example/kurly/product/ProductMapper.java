package com.example.kurly.product;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductMapper {
    public List<ProductDTO> selectAll(ProductDTO productDTO);
    public ProductDTO selectOne(ProductDTO productDTO);


}
