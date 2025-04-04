package Biblioteca_Teste;
import java.util.Random;
public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private boolean emprestado;
    public Livro(String titulo, String autor) {
        this.idLivro = gerarIdUnico();
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
    private int gerarIdUnico() {
        return 10000000 + new Random().nextInt(90000000);
    }
    public int getIdLivro() {
        return idLivro;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
