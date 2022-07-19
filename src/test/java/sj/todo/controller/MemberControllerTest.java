package sj.todo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import sj.todo.domain.Member;
import sj.todo.dto.MemberDto;
import sj.todo.mapper.MemberMapper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberControllerTest {

    @Autowired
    MemberController memberController;

    @Test
    public void joinTest() {
        ResponseEntity<MemberDto> responseJoin = memberController.joinMember(createMemberDto());
        MemberDto newMember = responseJoin.getBody();
        MemberDto getMember = memberController.findMember(newMember.getUserId()).getBody();
        assertEquals(newMember.getUsername(), getMember.getUsername());
    }

    private MemberDto createMemberDto() {

        Member member = Member.builder()
                .userId("test")
                .username("jake11")
                .password("1234")
                .build();

        return MemberMapper.INSTANCE.toDto(member);
    }
}