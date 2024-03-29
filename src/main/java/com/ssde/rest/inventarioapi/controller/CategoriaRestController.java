package com.ssde.rest.inventarioapi.controller;

import com.ssde.rest.inventarioapi.response.CategoriaResponseRest;
import com.ssde.rest.inventarioapi.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 1:12.
 * inventario-api
 */
@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaRestController {
    @Autowired
    private ICategoriaService categoriaService;
    @GetMapping("/findAll")
    public ResponseEntity<CategoriaResponseRest> searchCategorias() {

        return categoriaService.search();
    }
}
