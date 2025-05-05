package entidades;

import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    Date getDataNascimento() {
        return dataNascimento;
    }

    private void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
    }
}
