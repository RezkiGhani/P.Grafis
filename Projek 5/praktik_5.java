/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktik_5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VICTUS
 */
public class praktik_5 extends javax.swing.JFrame {

    public praktik_5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        // Membuat frame
        JFrame frame = new JFrame("Form Input Nama");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat label
        JLabel label = new JLabel("Masukkan Nama:");
        label.setBounds(20, 20, 120, 20);
        frame.add(label);

        // Membuat text field
        JTextField textField = new JTextField();
        textField.setBounds(200, 20, 120, 20);
        frame.add(textField);

        // Membuat label
        JLabel label_pw = new JLabel("Masukkan password:");
        label_pw.setBounds(20, 50, 140, 20);
        frame.add(label_pw);

        // Membuat text field
        JTextField textField_pw = new JTextField();
        textField_pw.setBounds(200, 50, 120, 20);
        frame.add(textField_pw);

        // Membuat button
        JButton button = new JButton("Submit");
        button.setBounds(100, 90, 80, 30);
        frame.add(button);

        // Menambahkan action listener untuk button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String pw = textField_pw.getText();

                if ( nama.equals("admin") && pw.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login berhasil");
                } else {
                    JOptionPane.showMessageDialog(frame, "Username atau password salah");
                }
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
