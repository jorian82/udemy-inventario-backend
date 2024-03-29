package com.ssde.rest.inventarioapi.response;

import com.ssde.rest.inventarioapi.model.Categoria;
import lombok.Data;

import java.util.List;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:41.
 * inventario-api
 */
@Data
public class CategoriaResponse {

    private List<Categoria> categorias;
}
