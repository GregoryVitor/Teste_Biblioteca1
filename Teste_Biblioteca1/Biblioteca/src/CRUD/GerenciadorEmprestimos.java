package CRUD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Biblioteca_Teste.Emprestimo;
import Biblioteca_Teste.Livro;
import Biblioteca_Teste.Usuario;

public class GerenciadorEmprestimos {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (!livro.isEmprestado()) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, new Date());
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado: " + usuario.getNomeCompleto() + " pegou " + livro.getTitulo());
        } else {
            System.out.println("Livro já emprestado.");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        for (Emprestimo e : emprestimos) {
            if (e.usuario.equals(usuario) && e.livro.equals(livro) && e.dataDevolucao == null) {
                e.devolverLivro();
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Empréstimo não encontrado.");
    }
}
