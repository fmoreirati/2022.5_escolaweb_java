package br.com.escolaweb.model;

import java.util.Calendar;

public abstract class Pessoa {
    private String _id;
    private String nome;
    private String email;
    private Calendar data_nasc;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getId() {
        return _id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Calendar getDataNasc() {
        return data_nasc;
    }

    public void setDataNasc(Calendar data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
