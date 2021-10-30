package org.danilorocha.api.rest;

import org.danilorocha.domain.model.Endereco;
import org.danilorocha.domain.service.CepService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endereco")
public class CepResource {

    @Inject
    CepService service;

    @GET
    @Path("{cep}")//barra é opcional
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep) {
        return service.buscaEndereco(cep);
    }
}