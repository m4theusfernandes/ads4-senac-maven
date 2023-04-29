package br.senac.go.resources;

import br.senac.go.domain.Pessoa;
import br.senac.go.generics.GenericOperationsResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/pessoa")
@Api(value = "Oprações para manipulação dos dados pessoas",tags = "pessoa")
public class PessoaResource implements GenericOperationsResource<Pessoa,Integer> {
    private static final Logger LOGGER =
            Logger.getLogger(PessoaResource.class.getName());
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    @ApiOperation(value = "${resource.pessoa-post}", notes = "Criar dados de pessoa.")
    @ApiResponses(value={
            @ApiResponse(code = 200, message = "Requisição feita com sucesso.", response = Pessoa.class),
            @ApiResponse(code = 201, message = "Registro criado com sucesso.", response = Pessoa.class),
            @ApiResponse(code = 204, message = "O servidor processou a solicitação com sucesso e não está retornando nenhum conteúdo.", response = Pessoa.class),
            @ApiResponse(code = 301, message = "Redirecionamento permanente.", response = Pessoa.class),
            @ApiResponse(code = 401, message = "Não autorizado.", response = Pessoa.class),
            @ApiResponse(code = 404, message = "Registro não encontrado.", response = Pessoa.class),
            @ApiResponse(code = 500, message = "Erro na requisão, verifique configurações do servidor.", response = Pessoa.class)
    })
    public Pessoa post(@RequestBody @Validated Pessoa entity) {

        LOGGER.log(Level.INFO,"Exemplo de imprimir", entity);

        return entity;
    }
    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<Pessoa> get() {

        LOGGER.log(Level.INFO, String.format("Exemplo do PUT:"));

        return null;
    }

    @Override
    @PutMapping(value = "/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void put(@RequestBody @Validated Pessoa entity, @PathVariable("id") Integer id) {
        LOGGER.log(Level.INFO, String.format("Exemplo do PUT: %s | %d", entity, id));
    }

    @Override
    @PatchMapping(value = "/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void patch(@RequestBody @Validated Pessoa entity,@PathVariable("id") Integer id) {
        LOGGER.log(Level.INFO,String.format("Exemplo do PATCH: %s | %d"));
    }

    @Override
    @DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void delete(@RequestBody @Validated Pessoa entity) {
        LOGGER.log(Level.INFO,String.format("Exemplo do DELETE: %s", entity));
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        LOGGER.log(Level.INFO,String.format("Exemplo do DELETE: %d", id));
    }
}
