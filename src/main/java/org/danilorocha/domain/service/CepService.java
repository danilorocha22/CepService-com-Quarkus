package org.danilorocha.domain.service;

import org.danilorocha.domain.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
