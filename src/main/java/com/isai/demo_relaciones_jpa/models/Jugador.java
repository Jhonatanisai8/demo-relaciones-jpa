package com.isai.demo_relaciones_jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;

    @Column(name = "nombre_jugador", nullable = false)
    private String nombreJugador;

    @Column(name = "apellido_jugador", nullable = false)
    private String apellidoJugador;

    private String nacionalidad;

    private Integer edad;

    private String posicion;

    @ManyToOne(targetEntity = Club.class)
    @JoinColumn(name = "id_club")
    private Club club;

}
