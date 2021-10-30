package org.danilorocha.domain.service;

import javax.enterprise.context.Dependent;

@Dependent
public class ViaCepService extends AbstractCepService {

    //Faz-se necessario construtor sem parâmetro
    public ViaCepService() {
        super("https://viacep.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
}
