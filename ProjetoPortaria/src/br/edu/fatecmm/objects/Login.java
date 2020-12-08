package br.edu.fatecmm.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    private static int usuario;
    private static String senha;
    private static boolean autenticado=false;

    public static void login(){

        Porteiro f1 = new Porteiro();
        f1.setCod_funcionario(1);
        f1.setNome("Jonas");
        f1.setIdade(30);
        f1.setEndereco("Rua do Jonas");
        f1.setSexo("Masculino");
        f1.setSenha("senha123");

        Supervisor f2 = new Supervisor();
        f2.setNome("Marina");
        f2.setCod_funcionario(2);
        f2.setIdade(35);
        f2.setEndereco("Rua da Marina");
        f2.setSexo("Feminino");
        f2.setSenha("senha321");

        List<Funcionario> funcionarioList = new ArrayList();
        funcionarioList.add(f1);
        funcionarioList.add(f2);

        List<Porteiro> porteiroList = new ArrayList();
        porteiroList.add(f1);

        List<Supervisor> supervisorList = new ArrayList();
        supervisorList.add(f2);


        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o Codigo de Funcionario: ");
            usuario = sc.nextInt();
            sc.nextLine();

            System.out.println("Insira a senha: ");
            senha = sc.nextLine();

            //System.out.println(usuario+"\n"+senha);

            Porteiro pLogin = new Porteiro();
            pLogin.setCod_funcionario(Login.getUsuario());
            pLogin.setSenha(Login.getSenha());
            if(funcionarioList.contains(pLogin)){
                Login.setAutenticado(true);
                System.out.println("Acesso Liberado!\n");
            }else{
                Supervisor sLogin = new Supervisor();
                sLogin.setCod_funcionario(Login.getUsuario());
                sLogin.setSenha(Login.getSenha());
                if(funcionarioList.contains(sLogin)) {
                    Login.setAutenticado(true);
                    System.out.println("Acesso Liberado!\n");
                }else {
                    System.out.println("Acesso negado, tente novamente.\n");
                }
            }

        }while (!autenticado);






       /* JFrame telaLogin = new JFrame();
        telaLogin.setContentPane(new TelaLogin().getPanel1());
        telaLogin.pack();
        telaLogin.setLocationRelativeTo(null);
        telaLogin.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        telaLogin.setVisible(true);*/


    }

    public static int getUsuario() {
        return usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static boolean isAutenticado() {
        return autenticado;
    }

    public static void setAutenticado(boolean autenticado) {
        Login.autenticado = autenticado;
    }
}
