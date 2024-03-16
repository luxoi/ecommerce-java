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
public class DetalleOrden {
    private Long id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
}
