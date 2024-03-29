package com.ssde.rest.inventarioapi.service;

import com.ssde.rest.inventarioapi.dao.ICategoriaDAO;
import com.ssde.rest.inventarioapi.model.Categoria;
import com.ssde.rest.inventarioapi.response.CategoriaResponseRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:53.
 * inventario-api
 */
@Service
public class CategoriaServiceImpl implements ICategoriaService{
    @Autowired
    private ICategoriaDAO categoriaDAO;
    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<CategoriaResponseRest> search() {
        CategoriaResponseRest response = new CategoriaResponseRest();

        try {
            List<Categoria> categorias = (List<Categoria>) categoriaDAO.findAll();

            response.getCategoriaResponse().setCategorias(categorias);
            response.setMetadata("Response OK", "00", "Response successful");

        } catch(Exception e) {
            response.setMetadata("Response Fail", "-1", "Error retrieving categorias list");
            e.getStackTrace();
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
