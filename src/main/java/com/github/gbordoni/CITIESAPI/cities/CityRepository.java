package com.github.gbordoni.CITIESAPI.cities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT ((WITH local AS (SELECT cidade.lat_lon, cidade.nome, estado.uf FROM cidade JOIN estado ON cidade.uf = estado.id) SELECT lat_lon FROM local WHERE nome=?1 AND uf=?2) <@> (WITH local AS (SELECT cidade.lat_lon, cidade.nome, estado.uf FROM cidade JOIN estado ON cidade.uf = estado.id) SELECT lat_lon FROM local WHERE nome=?3 AND uf=?4)) AS distance", nativeQuery = true )
    Double distanceByName( String city1, String uf1, String city2, String uf2);
}
