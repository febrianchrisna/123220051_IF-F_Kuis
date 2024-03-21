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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import totalbeli.TotalPembelian;

/**
 *
 * @author Lab Informatika
 */
public class HalamanMajalah extends JFrame implements ActionListener {

    JLabel judul = new JLabel("Halaman Pembelian");
    JLabel kategori = new JLabel("Kategori");
    JLabel majalah = new JLabel();
    JLabel labelHarga1 = new JLabel("Harga Satuan");
    JLabel harga1 = new JLabel();
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField jumlah = new JTextField();
    
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    
    JLabel labelTotal = new JLabel("Total Pembelian");
    JLabel labelHarga2 = new JLabel("Harga Satuan");
    JLabel harga2 = new JLabel();
    JLabel labelPcs = new JLabel("Jumlah");
    JLabel totalJumlah = new JLabel("[Hasil]");
    JLabel labelHargaTotal = new JLabel("Total Harga");
    JLabel hargaTotal = new JLabel("[Hasil]");
    public HalamanMajalah(int hargaSatuan, String kategoriMajalah) {
        setVisible(true);
        setSize(480,520);
        setTitle("Halaman Majalah");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        String hargaMajalah = String.valueOf(hargaSatuan);
        
        add(judul);
        judul.setBounds(30, 20, 200, 40);
        
        add(kategori);
        kategori.setBounds(30, 70, 100, 20);
        
        add(majalah);
        majalah.setText(kategoriMajalah);
        majalah.setBounds(150, 70, 150, 20);
        
        add(labelHarga1);
        labelHarga1.setBounds(30, 100, 100, 20);
        
        add(harga1);
        harga1.setText(hargaMajalah);
        harga1.setBounds(150, 100, 100, 20);
        
        add(labelJumlah);
        labelJumlah.setBounds(30, 130, 100, 20);
        
        add(jumlah);
        jumlah.setBounds(150, 130, 100, 20);
        
        add(kembali);
        kembali.setBounds(30, 160, 100, 25);
        kembali.addActionListener(this);
        
        add(beli);
        beli.setBounds(150, 160, 100, 25);
        beli.addActionListener(this);
        
        add(labelTotal);
        labelTotal.setBounds(30, 200, 100, 25);
        
        add(labelHarga2);
        labelHarga2.setBounds(30, 230, 100, 25);
        
        add(harga2);
        harga2.setText(hargaMajalah);
        harga2.setBounds(150, 230, 100, 25);
        
        add(labelPcs);
        labelPcs.setBounds(30, 260, 100, 25);
        
        add(totalJumlah);
        totalJumlah.setBounds(150, 260, 100, 25);
        
        add(labelHargaTotal);
        labelHargaTotal.setBounds(30, 290, 100, 25);
        
        add(hargaTotal);
        hargaTotal.setBounds(150, 290, 100, 25);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == kembali){
                new HalamanLogin();
                this.dispose();
            }else if(e.getSource() == beli){
                int banyakMajalah = Integer.parseInt(jumlah.getText());
                int hargaBanget = Integer.parseInt(harga1.getText());
                String banyakBanget = String.valueOf(banyakMajalah);
                
                TotalPembelian totalBanget = new TotalPembelian(banyakMajalah, hargaBanget);
                String hitung = String.valueOf(totalBanget.PembelianTotal());
                
                totalJumlah.setText(banyakBanget + " pcs");
                hargaTotal.setText("Rp" + hitung);
            }
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
