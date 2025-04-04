package Biblioteca_Teste;
import java.util.Random;
public class Usuario {
    private String cpf;
    private String nomeCompleto;
    private String nomePai;
    private String nomeMae;
    private int idUsuario;
    public Usuario(String cpf, String nomeCompleto, String nomePai, String nomeMae) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.idUsuario = gerarIdUnico();
    }
    private int gerarIdUnico() {
        return 10000000 + new Random().nextInt(90000000);
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
}
