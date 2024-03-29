package com.ssde.rest.inventarioapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by jra, SSDE Inc,
 * on Thu, 28/03/24 at 23:44.
 * inventario-api
 */
@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    @Serial
    private static final long serialVersionUID = -29729867815781L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
