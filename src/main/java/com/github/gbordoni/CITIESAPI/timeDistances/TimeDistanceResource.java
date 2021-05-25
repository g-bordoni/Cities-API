package com.github.gbordoni.CITIESAPI.timeDistances;

import com.github.gbordoni.CITIESAPI.timeDistances.service.TimeDistanceResponse;
import com.github.gbordoni.CITIESAPI.timeDistances.service.TimeDistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timeDistance")
public class TimeDistanceResource {

    private final TimeDistanceService service;
    Logger log = LoggerFactory.getLogger(TimeDistanceResource.class);

    public TimeDistanceResource(TimeDistanceService service) {
        this.service = service;
    }

    @GetMapping("/byName")
    public ResponseEntity byPoints(@RequestParam(name = "from") final String city1,
                                   @RequestParam(name = "to") final String city2) {
        log.info("byName");
        TimeDistanceResponse timeDistanceResponse = new TimeDistanceResponse(city1,city2);
        timeDistanceResponse.setDistance(service.distanceByName(city1,city2));

        return ResponseEntity.status(HttpStatus.OK).body(timeDistanceResponse.toString());
    }
}
