package br.com.projeto.api.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Repositorio.Repositorio;
import br.com.projeto.api.modelo.Cliente;

@RestController
@CrossOrigin(origins = "*")
public class ApiController {
    @Autowired
    private Repositorio acao;


    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    }
    

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }
    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);

    }
    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
    }
    
}
