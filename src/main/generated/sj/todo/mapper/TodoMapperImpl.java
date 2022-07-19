package sj.todo.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sj.todo.domain.Todo;
import sj.todo.dto.TodoDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-19T21:55:39+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class TodoMapperImpl implements TodoMapper {

    @Override
    public Todo toEntity(TodoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Todo.TodoBuilder todo = Todo.builder();

        todo.id( dto.getId() );
        todo.title( dto.getTitle() );
        todo.howLong( dto.getHowLong() );
        todo.startDate( dto.getStartDate() );
        todo.endDate( dto.getEndDate() );
        todo.howManyWeeks( dto.getHowManyWeeks() );
        todo.dayOfWeek( dto.getDayOfWeek() );
        todo.cycle( dto.getCycle() );

        return todo.build();
    }

    @Override
    public TodoDto toDto(Todo entity) {
        if ( entity == null ) {
            return null;
        }

        TodoDto.TodoDtoBuilder todoDto = TodoDto.builder();

        todoDto.id( entity.getId() );
        todoDto.title( entity.getTitle() );
        todoDto.howLong( entity.getHowLong() );
        todoDto.startDate( entity.getStartDate() );
        todoDto.endDate( entity.getEndDate() );
        todoDto.howManyWeeks( entity.getHowManyWeeks() );
        todoDto.dayOfWeek( entity.getDayOfWeek() );
        todoDto.cycle( entity.getCycle() );

        return todoDto.build();
    }
}
