package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

public interface EnderecoService{

    Iterable<Endereco> buscarTodos();
    void deletar(String cep);

    Endereco buscarPorCep(String cep);
}
