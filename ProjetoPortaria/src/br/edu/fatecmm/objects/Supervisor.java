package br.edu.fatecmm.objects;

public class Supervisor extends Funcionario{
    private static int permissao = 2;

    public static int getPermissao() {
        return permissao;
    }
}
