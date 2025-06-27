package com.isai.demo_relaciones_jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "entrenador")
public class Entrenador {
    
    private Long idEntrenador;
    
    private String nombre;
    
    private String apellido;
    
    private String nacionalidad;
    
    private Integer edad;
}
