package sj.todo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sj.todo.domain.Member;
import sj.todo.domain.Todo;
import sj.todo.dto.MemberDto;
import sj.todo.dto.TodoDto;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    Member toEntity(MemberDto dto);
    MemberDto toDto(Member entity);
}
