package com.github.gbordoni.CITIESAPI.cities;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {@TypeDef(name = "point", typeClass = PointType.class)})
public class City {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    private Integer uf;
    private Integer ibge;
    @Column(name = "lat_lon")
    private String geolocation;

    public City() { }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getUf() {
        return uf;
    }
    public Integer getIbge() {
        return ibge;
    }
    public String getGeolocation() {
        return geolocation;
    }

}
