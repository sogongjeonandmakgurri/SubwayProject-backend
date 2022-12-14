package com.example.searchsubway.service.elevator;

import com.example.searchsubway.domain.elevator.ElevatorLocation;
import com.example.searchsubway.domain.elevator.repository.ElevatorLocationRepository;
import com.example.searchsubway.dto.elevator.InternalElevatorResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 지하철에서 나가는 경우 다음역에 따라 무슨 방면인지, 방향(상행, 하행, 외선, 내선)
 * ex) 논현 방면, 상행 4-2
 */

@Service
@RequiredArgsConstructor
public class ElevatorLocationOutService {
    private final ElevatorLocationRepository elevatorLocationRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public List<InternalElevatorResponseDto> getInternalElevator(Map<String, Integer> line, Map<String, String> sub_name) {
        // 예외처리 필요 (NULL일 경우 "업데이트 중입니다.")
        return entityListToResponseList(elevatorLocationRepository.findInternalEVBySubName(line.get("line"),sub_name.get("sub_name")));
    }


    @Transactional
    public List<InternalElevatorResponseDto> entityListToResponseList(List<ElevatorLocation> elevatorLocationList){
        return elevatorLocationList
                .stream()
                .map(elevatorLocation -> modelMapper.map(elevatorLocation, InternalElevatorResponseDto.class))
                .collect(Collectors.toList());
    }
}
