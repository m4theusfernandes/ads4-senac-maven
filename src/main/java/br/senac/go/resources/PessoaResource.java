package br.senac.go.resources;

import br.senac.go.domain.Pessoa;
import br.senac.go.generics.GenericOperationsResource;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/pessoa")
public class PessoaResource implements GenericOperationsResource<Pessoa,Integer> {
    private static final Logger LOGGER =
            Logger.getLogger(PessoaResource.class.getName());
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Pessoa post(@RequestBody @Validated Pessoa entity) {

        LOGGER.log(Level.INFO,"Exemplo de imprimir", entity);

        return entity;
    }
    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<Pessoa> get() {

        return null;
    }

    @Override
    @PutMapping(value = "/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void put(@RequestBody @Validated Pessoa entity, @PathVariable("id") Integer id) {
        LOGGER.log(Level.INFO, String.format("Exemplo do PUT: %s | %d", entity, id));
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
