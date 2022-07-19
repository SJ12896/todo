package sj.todo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sj.todo.dto.MemberDto;
import sj.todo.service.MemberService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberDto> joinMember(MemberDto memberDto) {
        String memberUserId = memberService.joinMember(memberDto);
        return ResponseEntity.ok(memberService.findMember(memberUserId));
    }

    public ResponseEntity<MemberDto> findMember(String userId) {
        MemberDto member = memberService.findMember(userId);
        return ResponseEntity.ok(member);
    }
}
