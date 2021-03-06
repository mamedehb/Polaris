package br.com.polaris.safe.route.controller;

import br.com.polaris.safe.route.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/saferoute")
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Comum(
                "Larissa",
                "larissazica@",
                "123456",
                "foto",
                "21/05/1998",
                "1234-0987"));
        usuarios.add(new Comum(

                "Camila",
                "Camila@camila",
                "54321",
                "foto",
                "03/07/1997",
                "1234-0987"));
    }

    List<Cadastro> cadastros = new ArrayList<>();

    @GetMapping()
    public List<Cadastro> getCadastros() {
        return cadastros;
    }

    @PostMapping("/cadastro")
    public String cadastraUsuario(@RequestBody Cadastro cadastro) {

        cadastros.add(cadastro);
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

}
