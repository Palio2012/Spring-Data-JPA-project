package io.github.palio2012.localizacao.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_city")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @Column (name = "id_city")
    private Long id;

    @Column (name = "name", length = 50)
    private String name;

    @Column (name = "qtt_population")
    private Integer population;
}
