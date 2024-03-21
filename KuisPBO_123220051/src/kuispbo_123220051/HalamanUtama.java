/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo_123220051;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel judul = new JLabel();
    JLabel judul2 = new JLabel("Silahkan pilih menu dibawah ini untuk membeli majalah");
    
    JButton majalahAnak = new JButton("Majalah Anak");
    JButton majalahRemaja = new JButton("Majalah Remaja");
    JButton majalahDewasa = new JButton("Majalah Dewasa");
    public HalamanUtama(String username) {
        setVisible(true);
        setSize(480,520);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setText("Selamat Datang, " + username);
        judul.setBounds(50, 20, 300, 30);
        judul.setFont(judul.getFont().deriveFont(20f));
        
        add(judul2);
        judul2.setBounds(50, 40, 400, 30);
        
        add(majalahAnak);
        majalahAnak.setBounds(150, 100, 150, 30);
        majalahAnak.addActionListener(this);
        
        add(majalahRemaja);
        majalahRemaja.setBounds(150, 150, 150, 30);
        majalahRemaja.addActionListener(this);
        
        add(majalahDewasa);
        majalahDewasa.setBounds(150, 200, 150, 30);
        majalahDewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int hargaSatuan = 0;
        String kategoriMajalah = "";
        
        if(e.getSource() == majalahAnak){
            kategoriMajalah = "Majalah Anak";
            hargaSatuan = 10800;
        }else if(e.getSource() == majalahRemaja){
            kategoriMajalah = "Majalah Remaja";
            hargaSatuan = 13100;
        }else if(e.getSource() == majalahDewasa){
            kategoriMajalah = "Majalah Dewasa";
            hargaSatuan = 69400;
        }
        
        new HalamanMajalah(hargaSatuan, kategoriMajalah);
        this.dispose();
    }
    
}
