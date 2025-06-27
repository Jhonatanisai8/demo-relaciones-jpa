package com.isai.demo_relaciones_jpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "confederacion_futbol")
public class ConfederacionFutbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_confederacion")
    private Long idConfederacion;

    @Column(name = "nombre_confederacion", nullable = false)
    private String nombreConfederacion;

    private String pais;

    private String presidente;

    @OneToMany(targetEntity = Club.class, fetch = FetchType.LAZY,
    mappedBy = "confederacionFutbol")
    private List<Club> clubes;
}
