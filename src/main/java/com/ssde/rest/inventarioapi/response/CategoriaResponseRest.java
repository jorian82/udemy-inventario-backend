package com.ssde.rest.inventarioapi.response;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:43.
 * inventario-api
 */
@Getter
@Setter
public class CategoriaResponseRest extends ResponseRest{
    private CategoriaResponse categoriaResponse = new CategoriaResponse();
}
