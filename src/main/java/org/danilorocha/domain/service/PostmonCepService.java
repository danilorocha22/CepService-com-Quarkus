package org.danilorocha.domain.service;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Alternative
@Dependent
public class PostmonCepService extends AbstractCepService {

    //Faz-se necessario construtor sem parâmetro
    public PostmonCepService() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("/v1/cep/%s", cep);
    }
}
