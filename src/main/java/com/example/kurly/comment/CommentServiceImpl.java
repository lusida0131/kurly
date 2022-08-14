package com.example.kurly.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{

    public final CommentMapper commentMapper;
    @Override
    public void insertComment(CommentDTO commentDTO) {
        commentMapper.insertComment(commentDTO);
    }

    @Override
    public void deleteComment(CommentDTO commentDTO) {
        commentMapper.deleteComment(commentDTO);
    }

    @Override
    public List<CommentDTO> selectAll(CommentDTO commentDTO) {
        return commentMapper.selectAll(commentDTO);
    }

    @Override
    public CommentDTO selectOne(CommentDTO commentDTO) {
        return commentMapper.selectOne(commentDTO);
    }
}
