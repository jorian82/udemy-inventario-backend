package com.ssde.rest.inventarioapi.service;

import com.ssde.rest.inventarioapi.response.CategoriaResponseRest;
import org.springframework.http.ResponseEntity;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:51.
 * inventario-api
 */
public interface ICategoriaService {
    public ResponseEntity<CategoriaResponseRest> search();
}
