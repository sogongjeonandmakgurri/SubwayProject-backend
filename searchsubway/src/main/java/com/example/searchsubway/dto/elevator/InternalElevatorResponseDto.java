package com.example.searchsubway.dto.elevator;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InternalElevatorResponseDto {
    String elevator_loc;

    String next_sub_name;
}
