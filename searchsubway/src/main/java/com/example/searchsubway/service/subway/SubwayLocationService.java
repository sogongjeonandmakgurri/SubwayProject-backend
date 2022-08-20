package com.example.searchsubway.service.subway;

import com.example.searchsubway.domain.subway.SubwayLocation;
import com.example.searchsubway.domain.subway.repository.SubwayLocationRepository;
import com.example.searchsubway.dto.subway.SubwayLocationRequestDto;
import com.example.searchsubway.dto.subway.SubwayLocationResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubwayLocationService {
    private final SubwayLocationRepository subwayLocationRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public List<SubwayLocationResponseDto> getSubwayStationList(SubwayLocationRequestDto subwayLocationRequestDto){
        // repository에서 근처 역 LIST 받아오기
        return entityListToResponseList(subwayLocationRepository.
                findCurrentSubwayStationByPosition(subwayLocationRequestDto.getLng(),subwayLocationRequestDto.getLat()));
    }
    @Transactional
    public List<SubwayLocationResponseDto> entityListToResponseList(List<SubwayLocation> subwayLocationList){
        return subwayLocationList
                .stream()
                .map(subwayLocation -> modelMapper.map(subwayLocation, SubwayLocationResponseDto.class))
                .collect(Collectors.toList());
    }

}
