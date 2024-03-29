package br.com.fiap.moneyminder.Controller;

import br.com.fiap.moneyminder.Model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoriaController {
    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET , path = "/categoria", produces = "application/json" )
    @ResponseBody
    public List<Categoria> index(){
        return repository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/categoria", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void create(@RequestBody Categoria categoria){
        log.info("cadastrando categoria: {}", categoria );
        repository.add(categoria);
    }

}