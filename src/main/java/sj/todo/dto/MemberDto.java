package sj.todo.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class MemberDto {

    private Long id;

    private String userId;

    private String username;

    private String password;

}
