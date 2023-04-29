package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enderecos")
public class EnderecoRestController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<Iterable<Endereco>> buscarTodos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> buscarPorCep(@PathVariable String cep) {
        return ResponseEntity.ok(enderecoService.buscarPorCep(cep));
    }

    @DeleteMapping("/deletar/{cep}")
    public ResponseEntity<Void> deletar(@PathVariable String cep) {
        enderecoService.deletar(cep);
        return ResponseEntity.ok().build();
    }
}
