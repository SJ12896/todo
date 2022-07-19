package sj.todo.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sj.todo.domain.Member;
import sj.todo.dto.MemberDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-19T21:55:39+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        Member.MemberBuilder member = Member.builder();

        member.id( dto.getId() );
        member.userId( dto.getUserId() );
        member.username( dto.getUsername() );
        member.password( dto.getPassword() );

        return member.build();
    }

    @Override
    public MemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDto.MemberDtoBuilder memberDto = MemberDto.builder();

        memberDto.id( entity.getId() );
        memberDto.userId( entity.getUserId() );
        memberDto.username( entity.getUsername() );
        memberDto.password( entity.getPassword() );

        return memberDto.build();
    }
}
