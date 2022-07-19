package sj.todo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sj.todo.domain.Member;
import sj.todo.dto.MemberDto;
import sj.todo.mapper.MemberMapper;
import sj.todo.repository.MemberRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public String joinMember(MemberDto memberDto) {
        Member member = MemberMapper.INSTANCE.toEntity(memberDto);
        memberRepository.save(member);
        return member.getUserId();
    }

    public MemberDto findMember(String userId) {
        Member member = memberRepository.findByUserId(userId);
        return MemberMapper.INSTANCE.toDto(member);
    }
}
