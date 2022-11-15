package io.github.palio2012.localizacao.domain.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.palio2012.localizacao.domain.entities.City;

import java.util.List;

public interface CityRepository extends JpaRepository <City, Long> {

    List<City> findByName (String name);

    List <City> findByNameStartingWith(String name);

    List <City> findByNameEndingWith(String name);

    List <City> findByNameContaining(String name);

    List<City> findByPopulation (Integer population);
}
