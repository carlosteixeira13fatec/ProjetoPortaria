package br.edu.fatecmm;

import br.edu.fatecmm.objects.Login;
import br.edu.fatecmm.view.Tela;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Portaria {

    private static int capacidadeTotal = 5;

    public static void main(String[] args) {

        Login.login();

        JFrame tela = new JFrame();
        tela.setContentPane(new Tela().getPanel1());
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        tela.setVisible(true);

        //System.out.println(Login.isAutenticado());

    }

    public static int getCapacidadeTotal() {
        return capacidadeTotal;
    }
}
