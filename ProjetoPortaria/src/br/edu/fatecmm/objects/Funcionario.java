package br.edu.fatecmm.objects;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String endereco;
    private int cod_funcionario;
    private String senha;
    private int idade;
    private String sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        if (cod_funcionario != that.cod_funcionario) return false;
        return senha.equals(that.senha);
    }

    @Override
    public int hashCode() {
        Scanner sc = new Scanner(Integer.toString(this.cod_funcionario));
        return Integer.parseInt(String.valueOf(sc.next().charAt(0)));
    }
}
