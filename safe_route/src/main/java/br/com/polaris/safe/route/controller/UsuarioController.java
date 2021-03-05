package br.com.polaris.safe.route.controller;

import br.com.polaris.safe.route.domain.Comum;
import br.com.polaris.safe.route.domain.ContatoConfianca;
import br.com.polaris.safe.route.domain.Documento;
import br.com.polaris.safe.route.domain.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/saferoute")
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<ContatoConfianca> contatos = new ArrayList<>();
    private List<Documento> documentos = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Comum(
                1,
                "Larissa",
                "larissazica@",
                "123456",
                "foto",
                "21/05/1998",
                "1234-0987"));
        usuarios.add(new Comum(
                1,
                "Camila",
                "Camila@camila",
                "54321",
                "foto",
                "03/07/1997",
                "1234-0987"));
        contatos.add(new ContatoConfianca(
                1,
                "Adelaide",
                "ade@gmail.com",
                "1234-0987"));
        contatos.add(new ContatoConfianca(
                2,
                "Gustavo",
                "gusta@gmail.com",
                "1234-0987"));
        documentos.add(new Documento(
                1,
                "RG",
                "fotofrente",
                "fotoverso"));
        documentos.add(new Documento(
                2,
                "CNH",
                "fotofrente",
                "fotoverso"));

    }

    @GetMapping()
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @PostMapping("/cadastro")
    public String cadastraUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return "Cadastro realizado com sucesso";
    }

    @PostMapping("/login")
    public String logaUsuario(@RequestBody Usuario usuario) {
        boolean valida = false;
        for (Usuario u : usuarios) {
            if (u.getemail().equals(usuario.getemail()) && u.getSenha().equals(usuario.getSenha())  ) {
                valida = true;
            } else {
                valida = false;

            }
        }
        return valida ? "Logado com sucesso" : "Usuario(a) ou senha incorretos";
    }

    @GetMapping("/contatos")
    public List<ContatoConfianca> getContatos() {
        return contatos;
    }

    @DeleteMapping("contatos/{posicao}")
    public String deletarContato(@PathVariable int posicao) {
        if(posicao < contatos.size()){
            contatos.remove(posicao);
            return "Contato removido com sucesso.";
        }else {
            return "Contato não encontrado.";
        }
    }

    @PutMapping("contatos/{posicao}")
    public String atualizarContato(@PathVariable int posicao, ContatoConfianca c) {
        if(posicao < contatos.size()){
            contatos.set(posicao, c);
            return "Contato atualizado com sucesso.";
        }else {
            return "Contato não encontrado.";
        }
    }

    @GetMapping("contatos/{id}")
    public ContatoConfianca getContatoPorId(@PathVariable int id) {
        if(id < contatos.size()){
            return contatos.get(id);
        }else {
            return null;
        }
    }

    @PutMapping("documento/{id}")
    public String atualizarDocumento(@PathVariable int id, @RequestBody Documento documento) {
        if(id < usuarios.size()){
            documentos.set(id, documento);
            return "Documento atualizado com sucesso.";
        }else {
            return "Documento não encontrado.";
        }
    }

    @GetMapping("documento/{id}")
    public Documento getDocumentoPorId(@PathVariable int id) {
        if(id < documentos.size()){
            return documentos.get(id);
        }else {
            return null;
        }
    }
}
