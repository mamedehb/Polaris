package br.com.polaris.safe.route.controller;

import br.com.polaris.safe.route.domain.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/saferoute")
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Usuario("Larissa", "larissa@zikadact", "12345"));
        usuarios.add(new Usuario("Camila", "camila@zikadact", "123456"));


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

}
