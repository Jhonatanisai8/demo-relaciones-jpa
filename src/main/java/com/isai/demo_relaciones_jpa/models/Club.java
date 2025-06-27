package com.isai.demo_relaciones_jpa.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club")
    private Long idClub;

    private String nombre;

    @OneToOne(targetEntity = Entrenador.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_entrenador")
    private Entrenador entrenador;

    @OneToMany(targetEntity = Jugador.class, fetch = FetchType.LAZY, mappedBy = "club")
    private List<Jugador> jugadores;

    @ManyToOne(targetEntity = ConfederacionFutbol.class)
    @JoinColumn(name = "id_confederacion")
    private ConfederacionFutbol confederacionFutbol;

}
