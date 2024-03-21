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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class HalamanLogin extends JFrame implements ActionListener{
    
    JLabel judul = new JLabel("Selamat Datang!");
    JLabel judul2 = new JLabel("Silahkan Login terlebih dahulu");
    JLabel labelUsername = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    JLabel labelPw = new JLabel("Password");
    JPasswordField inputPw = new JPasswordField();
    
    JButton tombolLogin = new JButton("Login");
    public HalamanLogin() {
        setVisible(true);
        setSize(480,520);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(30, 10, 200, 40);
        judul.setFont(judul.getFont().deriveFont(20f));
        
        add(judul2);
        judul2.setBounds(30, 35, 280, 40);
        
        add(labelUsername);
        labelUsername.setBounds(30, 70, 100, 40);
        
        add(inputUsername);
        inputUsername.setBounds(30, 105, 300, 25);
        
        add(labelPw);
        labelPw.setBounds(30, 135, 100, 40);
        
        add(inputPw);
        inputPw.setBounds(30, 170, 300, 25);
        
        add(tombolLogin);
        tombolLogin.setBounds(30, 220, 300, 28);
        tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputUsername.getText();
            String password = String.valueOf(inputPw.getPassword());
            
            if(username.isEmpty()){
                throw new Exception("Username belom diisi!");
            }else if(password.isEmpty()){
                throw new Exception("Password belom diisi!");
            }
            
            if(!"123220051".equals(username)){
                throw new Exception("Username Salah!");
            }else if(!"12345".equals(password)){
                throw new Exception("Password Salah!");
            }
            
            new HalamanUtama(username);
            this.dispose();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
    }
    
}
