package com.example.searchsubway.domain.subway.repository;

import com.example.searchsubway.domain.subway.SubwayLocation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubwayLocationCustomRepository {
//    @Query(value="SELECT sub_name, ST_Distance_Sphere(@location, POINT(:lng, :lat)) AS distance " +
//            "FROM sub_location " +
//            "WHERE ST_Distance_Sphere(@location, POINT(:lng, :lat)) <= 2000 " +
//            "ORDER BY distance")
//    public List<SubwayLocation> findCurrentSubwayStationByPosition(@Param("lat") Double lat,@Param("lng") Double lng);
}
