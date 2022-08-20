package com.example.searchsubway.service.subway;

import com.example.searchsubway.dto.subway.SubwayLocationRequestDto;
import com.example.searchsubway.dto.subway.SubwayLocationResponseDto;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@RequiredArgsConstructor
class SubwayLocationServiceTest {
    @Autowired
    private SubwayLocationService subwayLocationService;


    @Test
    public void getSubwayStationList(){
        List<SubwayLocationResponseDto> subwayLocationList = subwayLocationService.getSubwayStationList(new SubwayLocationRequestDto(126.9019532,37.5170112));
        System.out.println(subwayLocationList);
    }

}