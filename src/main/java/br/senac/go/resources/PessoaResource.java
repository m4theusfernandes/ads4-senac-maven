package br.senac.go.resources;

import br.senac.go.domain.Pessoa;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class PessoaResource implements GenericOperationsResource<Pessoa,Integer> {
    @Override
    public Pessoa post(Pessoa entity) {
        return null;
    }

    @Override
    public List<Pessoa> get() {
        return null;
    }

    @Override
    public void put(Pessoa entity, Integer id) {

    }

    @Override
    public void patch(Pessoa entity, Integer id) {

    }

    @Override
    public void delete(Pessoa entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
