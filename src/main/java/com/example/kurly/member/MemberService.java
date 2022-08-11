package com.example.kurly.member;


public interface MemberService {
    // 회원 등록
    public void register(MemberDTO member);
    // 로그인
    public MemberDTO login(MemberDTO member) throws Exception;
}
