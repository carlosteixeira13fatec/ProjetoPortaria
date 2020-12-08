package br.edu.fatecmm.objects;

import java.util.Scanner;

public class Visitante {
    private String nome;
    private String cpf;
    private String contato;
    private boolean dentro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isDentro() {
        return dentro;
    }

    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitante visitante = (Visitante) o;

        return cpf.equals(visitante.cpf);
    }

    @Override
    public int hashCode() {
        Scanner sc = new Scanner(this.cpf);
        return Integer.parseInt(String.valueOf(sc.next().charAt(0)));
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf +"\nContato: " + contato;
    }
}
