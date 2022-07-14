package sj.todo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sj.todo.domain.Todo;
import sj.todo.dto.TodoDto;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    Todo toEntity(TodoDto dto);
    TodoDto toDto(Todo entity);
}
