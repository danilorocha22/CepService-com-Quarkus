package org.danilorocha.domain.service;

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
