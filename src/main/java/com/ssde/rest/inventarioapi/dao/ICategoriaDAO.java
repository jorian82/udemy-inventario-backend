package com.ssde.rest.inventarioapi.dao;

import com.ssde.rest.inventarioapi.model.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:47.
 * inventario-api
 */
public interface ICategoriaDAO extends CrudRepository<Categoria,Long> {
}
