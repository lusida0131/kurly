package com.example.kurly.member;

import org.apache.ibatis.annotations.Mapper;

import java.io.IOException;

@Mapper
public interface MemberMapper {
    // 회원 등록
    public void register(MemberDTO member);
    // 회원 로그인
    public MemberDTO login(MemberDTO member) throws Exception;
}
