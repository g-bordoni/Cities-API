package com.github.gbordoni.CITIESAPI.timeDistances.service;

import com.github.gbordoni.CITIESAPI.cities.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.lang.String;

@Service
public class TimeDistanceService {
    private final CityRepository cityRepository;
    Logger log = LoggerFactory.getLogger(TimeDistanceService.class);

    public TimeDistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Double distanceByName(final String city1, final String city2) {
        String[] place1 = city1.split("-");
        String[] place2 = city2.split("-");

        log.info("nativePostgresInMiles({} :: {}, {} :: {})", place1[0], place1[1], place2[0], place2[1]);
        return cityRepository.distanceByName(place1[0], place1[1], place2[0], place2[1]);
    }
}
