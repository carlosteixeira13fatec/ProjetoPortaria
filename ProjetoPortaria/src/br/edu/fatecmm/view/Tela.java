package br.edu.fatecmm.view;

import br.edu.fatecmm.objects.Visitante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Tela {
    private JPanel panel1;
    private JTextField textVisitanteCpf;
    private JTextField textVisitanteNome;
    private JTextField textVisitanteContato;
    private JButton entradaButton;
    private JButton saidaButton;
    private JButton cadastrarVisitanteButton;
    private JTextArea textArea1;

    Visitante visitante = new Visitante();

    List<Visitante> visitantesCadastrados = new ArrayList();
    List<Visitante> visitantesDentro = new ArrayList();



    public Tela() {
        limparCampos();
        entradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visitante.setCpf(textVisitanteCpf.getText());
                visitante.setNome(textVisitanteNome.getText());
                visitante.setContato(textVisitanteContato.getText());

                if (visitante.getCpf() != null) {
                    if (visitantesCadastrados.contains(visitante)) {
                        if (visitantesDentro.contains(visitante)) {
                            textArea1.setText("Um Visitante de mesmo CPF ja se encontra no local!");
                        } else {
                            visitantesDentro.add(visitante);
                            textArea1.setText("Entrada realizada!");
                        }
                    } else {
                        textArea1.setText("CPF nao cadastrado");
                    }
                } else {
                    textArea1.setText("Insira o CPF do visitante");
                }

            }

        });
        saidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visitante.setCpf(textVisitanteCpf.getText());
                visitante.setNome(textVisitanteNome.getText());
                visitante.setContato(textVisitanteContato.getText());

                if(visitante.getCpf()!=null){
                    if(visitantesDentro.contains(visitante)){
                        visitantesDentro.remove(visitante);
                        textArea1.setText("Saida realizada!");
                    }else{
                        textArea1.setText("Visitante nao encontrado!");
                    }
                }else {
                    textArea1.setText("Insira o CPF do visitante");
                }

            }
        });
        cadastrarVisitanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visitante.setNome(textVisitanteNome.getText());
                visitante.setCpf(textVisitanteCpf.getText());
                visitante.setContato(textVisitanteContato.getText());

                if(visitantesCadastrados.contains(visitante)){
                    textArea1.setText("Visitante ja cadastrado");
                }else{
                    textArea1.setText("Visitante cadastrado com sucesso:\n"+visitante.toString());
                    visitantesCadastrados.add(visitante);
                    limparCampos();
                }


                System.out.println("inicio do for");
                System.out.println(visitantesCadastrados.size());
                for (Visitante item: visitantesCadastrados){
                    System.out.println(item.toString());
                }
                    
                

            }
        });
    }

    public void limparCampos(){
        textVisitanteNome.setText(null);
        textVisitanteCpf.setText(null);
        textVisitanteContato.setText(null);
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
