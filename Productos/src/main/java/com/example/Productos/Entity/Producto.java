package com.example.Productos.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private String nombre;

    private String marca;

    @JoinColumn(name = "idUnidadMedida")
    private UnidadDeMedida unidadDeMedida;

    private Float precio;

    private String codigo;

}
