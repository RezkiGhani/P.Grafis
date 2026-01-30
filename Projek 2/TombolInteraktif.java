package praktik_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TombolInteraktif extends javax.swing.JFrame {

    public TombolInteraktif() {
        // Set judul frame
        setTitle("Tombol Interaktif");

        // Set ukuran frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Agar frame muncul di tengah layar

        // Buat JLabel
        JLabel label = new JLabel("Halo, klik tombol di bawah!");
        label.setBounds(50, 50, 250, 30);

        // Buat JButton
        JButton button = new JButton("Klik Saya");
        button.setBounds(50, 100, 200, 30);

        // Tambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol sudah diklik!");
            }
        });

        // Tambahkan komponen ke frame 
        add(label);
        add(button);

        // Set layout menjadi null agar bisa atur posisi manual
        setLayout(null);
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
        TombolInteraktif frame = new TombolInteraktif();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
