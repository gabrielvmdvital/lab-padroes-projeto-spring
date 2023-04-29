package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Endereco> buscarTodos() {
        return  enderecoRepository.findAll();
    }

    @Override
    public void deletar(String cep) {
        enderecoRepository.deletar(cep);
    }

    @Override
    public Endereco buscarPorCep(String cep) {
        return enderecoRepository.findById(cep).get();
    }
}
