package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class CalculadoraResistores {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Calculadora de Resistência Equivalente");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,220);
        jFrame.setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5,2,10,10));
        painel.setBorder(new EmptyBorder(15,15,15,15));

        JLabel lblR1 = new JLabel("Resistor R1 (ohms):");
        JTextField inputR1 = new JTextField();

        JLabel lblR2 = new JLabel("Resistor R2 (ohms):");
        JTextField inputR2 = new JTextField();

        JLabel lblTipo = new JLabel("Tipo de Circuito: ");

        JComboBox<String> comboTipo = new JComboBox<>(new String[]{"Série", "Paralelo"});

        JButton btnCalcular = new JButton("Calcular");
        JButton btnSair = new JButton("Sair");

        painel.add(lblR1);
        painel.add(inputR1);
        painel.add(lblR2);
        painel.add(inputR2);
        painel.add(lblTipo);
        painel.add(comboTipo);
        painel.add(btnCalcular);
        painel.add(btnSair);

        jFrame.add(painel);
        jFrame.setVisible(true);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double r1 = Double.parseDouble(inputR1.getText());
                    double r2 = Double.parseDouble(inputR2.getText());
                    String tipo = (String) comboTipo.getSelectedItem();
                    double resultado;

                    if ("Série".equals(tipo)){
                        resultado = r1 + r2;
                    }
                    else{
                        resultado = 1 / (1/r1 + 1/r2);
                    }
                    String mensagem = String.format("A resistência é %2f ohms", resultado);
                    JOptionPane.showMessageDialog(jFrame, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(jFrame,
                            "Insira valores válidos",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              jFrame.dispose();
            }
        });
    }
}
