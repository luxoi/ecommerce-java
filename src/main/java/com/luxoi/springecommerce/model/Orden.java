package com.luxoi.springecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Orden {
    private long id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;

    private double total;

}
