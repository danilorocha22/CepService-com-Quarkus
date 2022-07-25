package org.danilorocha.domain.service;

import javax.enterprise.context.Dependent;

@Dependent
public class WidenetService extends AbstractCepService {

    public WidenetService() {
        super("https://apps.widenet.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("busca-cep/api/cep.json?%s", cep);
    }
}
