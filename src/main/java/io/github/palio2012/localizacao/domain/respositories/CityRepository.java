package io.github.palio2012.localizacao.domain.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.palio2012.localizacao.domain.entities.City;

public interface CityRepository extends JpaRepository <City, Long> {

}
