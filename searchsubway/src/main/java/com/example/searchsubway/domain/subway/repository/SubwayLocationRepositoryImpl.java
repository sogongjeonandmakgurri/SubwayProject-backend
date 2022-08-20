package com.example.searchsubway.domain.subway.repository;

import com.example.searchsubway.domain.subway.SubwayLocation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SubwayLocationRepositoryImpl implements SubwayLocationCustomRepository{
//    @Override
//    public List<SubwayLocation> findCurrentSubwayStationByPosition(Double lat, Double lng) {
//        // 현재 위치 값 기준으로 근처 역 리스트 목록 가져오기
//
//        return null;
//    }
}
