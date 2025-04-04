package CRUD;

import java.util.ArrayList;
import java.util.List;

import Biblioteca_Teste.Usuario;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String cpf, String nomeCompleto, String nomePai, String nomeMae) {
        Usuario usuario = new Usuario(cpf, nomeCompleto, nomePai, nomeMae);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNomeCompleto() + " | ID: " + usuario.getIdUsuario());
    }

    public Usuario buscarUsuario(int idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario() == idUsuario) {
                return u;
            }
        }
        return null;
    }

    public void removerUsuario(int idUsuario) {
        usuarios.removeIf(u -> u.getIdUsuario() == idUsuario);
        System.out.println("Usuário removido.");
    }
}
