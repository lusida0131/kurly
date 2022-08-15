package com.example.member;

import com.example.kurly.KurlyApplication;
import com.example.kurly.member.MemberDTO;
import com.example.kurly.member.MemberMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = KurlyApplication.class)
@Transactional
public class memberMapperTest {
    @Autowired
    MemberMapper memberMapper;

    //@Autowired
    //BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    void 회원가입() {
        MemberDTO member = new MemberDTO();
        member.setId("test");
        String pass = "1234";
        //String passwd = bCryptPasswordEncoder.encode(pass);
        member.setPasswd(pass);
        member.setName("박현성");
        memberMapper.register(member);
    }
    @Test
    void 로그인() throws Exception {
        //given
        MemberDTO member = new MemberDTO();
        member.setId("test");
        String pass = "1234";
        //String passwd = bCryptPasswordEncoder.encode(pass);
        member.setPasswd(pass);
        member.setName("박현성");

        //when
        MemberDTO memberTest = memberMapper.login(member);

        //then
        Assertions.assertEquals(memberTest.getId(), member.getId());
        Assertions.assertEquals(memberTest.getPasswd(), member.getPasswd());
    }
}
