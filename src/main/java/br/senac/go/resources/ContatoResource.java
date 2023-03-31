package br.senac.go.resources;

import br.senac.go.domain.Contato;
import br.senac.go.generics.GenericOperationsResource;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
@RequestMapping(path = "/contato")
public class ContatoResource implements GenericOperationsResource<Contato,Integer> {

    private static final Logger LOGGER =
            Logger.getLogger(PessoaResource.class.getName());

    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */

    /**
     * Consumes é o que o serviço vai receber (json ou xml)
     * Produces é o que o serviço vai entregar (json ou xml)
     * @param entity
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Contato post(@RequestBody @Validated Contato entity) {

        LOGGER.log(Level.INFO,"Exemplo de Impressão", entity);
        return entity;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<Contato> get() {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public void put(Contato entity, Integer id) {

    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public void patch(Contato entity, Integer id) {

    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(Contato entity) {

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
