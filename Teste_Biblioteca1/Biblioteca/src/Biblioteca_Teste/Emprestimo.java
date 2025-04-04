package Biblioteca_Teste;
import java.util.Date;
public class Emprestimo {
    public Usuario usuario;
    public Livro livro;
    private Date dataEmprestimo;
    public Date dataDevolucao;
    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
        livro.setEmprestado(true);
    }
    public void devolverLivro() {
        this.dataDevolucao = new Date();
        livro.setEmprestado(false);
    }
}