package br.senac.go.resources;

import br.senac.go.generics.GenericOperationsResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping(path = "/endereco")
public class EnderecoResource implements GenericOperationsResource<EnderecoResource,Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public EnderecoResource post(EnderecoResource entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<EnderecoResource> get() {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public void put(EnderecoResource entity, Integer id) {

    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public void patch(EnderecoResource entity, Integer id) {

    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(EnderecoResource entity) {

    }

    /**
     * Deleta um registro no banco pelo identificador
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {

    }
}
