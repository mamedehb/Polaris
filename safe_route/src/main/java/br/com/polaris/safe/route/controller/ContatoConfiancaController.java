package br.com.polaris.safe.route.controller;
import br.com.polaris.safe.route.domain.ContatoConfianca;
import br.com.polaris.safe.route.domain.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoConfiancaController {
    private List<ContatoConfianca> contatos = new ArrayList<>();

    public ContatoConfiancaController() {
        //usuarios.add(new Usuario(1,"Larissa", "larissa@zikadact", "12345"));
        //usuarios.add(new Usuario(2,"Camila", "camila@zikadact", "123456"));
    }

    @GetMapping()
    public List<ContatoConfianca> getContatos() {
        return contatos;
    }

    @PostMapping
    public String cadastrarContato(@RequestBody ContatoConfianca c) {
        contatos.add(c);
        return "Cadastro realizado com sucesso";
    }

    @DeleteMapping("/{posicao}")
    public String deletarContato(@PathVariable int posicao) {
        if(posicao < contatos.size()){
            contatos.remove(posicao);
            return "Contato removido com sucesso.";
        }else {
            return "Contato não encontrado.";
        }
    }

    @PutMapping("/{posicao}")
    public String atualizarContato(@PathVariable int posicao, ContatoConfianca c) {
        if(posicao < contatos.size()){
            contatos.set(posicao, c);
            return "Contato atualizado com sucesso.";
        }else {
            return "Contato não encontrado.";
        }
    }

    @GetMapping("/{id}")
    public ContatoConfianca getContatoPorId(@PathVariable int id) {
        return contatos.get(id);
    }
}
