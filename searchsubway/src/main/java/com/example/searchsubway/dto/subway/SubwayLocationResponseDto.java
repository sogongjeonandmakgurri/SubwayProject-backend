package com.example.searchsubway.dto.subway;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubwayLocationResponseDto {
    private Integer line;

    private String sub_name;

}
