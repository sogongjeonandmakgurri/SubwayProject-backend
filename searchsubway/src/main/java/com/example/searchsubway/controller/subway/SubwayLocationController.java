package com.example.searchsubway.controller.subway;

import com.example.searchsubway.dto.subway.SubwayLocationRequestDto;
import com.example.searchsubway.dto.subway.SubwayLocationResponseDto;
import com.example.searchsubway.service.subway.SubwayLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SubwayLocationController {

    private final SubwayLocationService subwayLocationService;

    @GetMapping("/subway/loc")
    public List<SubwayLocationResponseDto> currentSubwayLocation(@RequestParam Map<String, Double> lng, Map<String, Double> lat){
        return subwayLocationService.getSubwayStationList(new SubwayLocationRequestDto(lng.get("lng"),lat.get("lat")));
    }

}
