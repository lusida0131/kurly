package com.example.kurly.comment;

import java.util.List;

public interface CommentService {

    public void insertComment(CommentDTO commentDTO);

    public void deleteComment(CommentDTO commentDTO);

    public List<CommentDTO> selectAll(CommentDTO commentDTO);

    public CommentDTO selectOne(CommentDTO commentDTO);
}
