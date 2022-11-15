package io.github.palio2012.localizacao;

import io.github.palio2012.localizacao.domain.entities.City;
import io.github.palio2012.localizacao.domain.respositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {
        saveCity();
        listAllCity();
    }

    @Transactional
    void saveCity () {
        var city = new City(1L, "São Paulo", 12396372);
        cityRepository.save(city);
    }

    void listAllCity () {
        cityRepository.findAll().forEach(System.out :: println);
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class, args);
    }
}
