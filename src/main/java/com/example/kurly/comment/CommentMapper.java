package com.example.kurly.comment;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    public void insertComment(CommentDTO commentDTO);

    public void deleteComment(CommentDTO commentDTO);

    public List<CommentDTO> selectAll(CommentDTO commentDTO);

    public CommentDTO selectOne(CommentDTO commentDTO);


}
