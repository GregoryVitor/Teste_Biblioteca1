package CRUD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Biblioteca_Teste.Livro;

public class GerenciadorLivros {
    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        livros.sort(Comparator.comparing(Livro::getTitulo));
        System.out.println("Livro cadastrado: " + livro.getTitulo() + " | ID: " + livro.getIdLivro());
    }

    public Livro buscarLivro(int idLivro) {
        for (Livro l : livros) {
            if (l.getIdLivro() == idLivro) {
                return l;
            }
        }
        return null;
    }

    public void removerLivro(int idLivro) {
        livros.removeIf(l -> l.getIdLivro() == idLivro);
        System.out.println("Livro removido.");
    }
}
