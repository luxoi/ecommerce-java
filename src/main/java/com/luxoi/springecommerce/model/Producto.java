package com.luxoi.springecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;
}
