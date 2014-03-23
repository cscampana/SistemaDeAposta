package br.com.extremeApps.SistemadeAposta;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SirExtreme
 */
public class Tela /*extends JFrame*/ {

    Tratamento t1 = new Tratamento();
    Calculo c1 = new Calculo(t1);
    String numeroCpu = "o numero era ";

    public void Janela() {
        final JFrame frame = new JFrame("Sistema de aposta");
        JPanel panel = new JPanel();
        final JTextField txtValordaAposta = new JTextField("", 20);
        final JTextField txtNumeroEscolha = new JTextField("", 20);
        JLabel lbNumero = new JLabel("Escolha o Numero: ");
        JLabel lbValorAposta = new JLabel("Valor a Apostar: ");
        JButton apostar = new JButton("Apostar");

        panel.setUI(new PanelFormIU());

        panel.setLayout(new GridLayout(3, 2));
        panel.add(lbValorAposta);
        panel.add(txtValordaAposta);
        panel.add(lbNumero);
        panel.add(txtNumeroEscolha);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\SirExtreme\\Documents\\NetBeansProjects\\SistemaDeAposta\\src\\br\\com\\extremeApps\\SistemadeAposta\\favcon.png");
        frame.setIconImage(icon);

        apostar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t1.setValorAposta(Integer.parseInt(txtValordaAposta.getText()));
                t1.setNumeroEscolhido(Integer.parseInt(txtNumeroEscolha.getText()));
                c1.calculaNumeroCpu();
                c1.resultado();
JOptionPane.showMessageDialog(frame, ("O numero era : "+t1.getNumeroCpu() + " , você escolheu " + t1.getNumeroEscolhido() + " , você ganhou ? " + t1.isGanhouOuPerdeu() + " você ganhou " + t1.getValorGanho() ));
            }
        });

        frame.add(panel);
        frame.getContentPane().add(BorderLayout.SOUTH, apostar);
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
