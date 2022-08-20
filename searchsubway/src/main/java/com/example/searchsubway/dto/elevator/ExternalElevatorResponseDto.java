package com.example.searchsubway.dto.elevator;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExternalElevatorResponseDto {
    String elevator_loc;
}
