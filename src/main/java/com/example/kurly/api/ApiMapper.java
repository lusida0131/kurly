package com.example.kurly.api;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApiMapper {
    // api
    public void apiSave(ApiDTO api);
}
