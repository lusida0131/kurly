package com.example.kurly.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/auth")
public class MemberController {

    private final MemberService memberService;

    // 회원 가입 폼
    @GetMapping("/joinForm")
    public String joinForm() {
        return "/auth/joinForm";
    }

    // 회원 가입 폼
    @PostMapping("/joinForm")
    public String joinForm(@ModelAttribute MemberDTO member) {
        memberService.register(member);
        log.info("member={}", member);
        return "redirect:/auth/loginForm";
    }

    // 로그인 폼
    @GetMapping("/loginForm")
    public String login() {
        return "/auth/loginForm";
    }

    // 로그인 폼
    @PostMapping("/loginForm")
    public String loginForm(HttpSession session, @ModelAttribute MemberDTO member) throws Exception {
        MemberDTO user = memberService.login(member);
        if (member != null && member.getPasswd().equals(user.getPasswd())) {   // BCrypt.checkpw(member.getPasswd(), user.getPasswd())
            session.setAttribute("user", user);
            return "redirect:/";
        } else {
            return "redirect:/auth/loginForm";
        }
    }
}
