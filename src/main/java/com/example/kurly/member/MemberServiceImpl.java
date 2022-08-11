package com.example.kurly.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    //private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void register(MemberDTO member) {
        String rawPassword = member.getPasswd();
        String encodePassword = member.getPasswd();//bCryptPasswordEncoder.encode(rawPassword);
        member.setPasswd(encodePassword);
        memberMapper.register(member);
    }

    @Override
    public MemberDTO login(MemberDTO member) throws Exception {
        return memberMapper.login(member);
    }
}
