/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230136_latihankuis;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class LoginPage extends JFrame implements ActionListener{
    JLabel Login = new JLabel("Silakan Login");
    JLabel UsernameLabel = new JLabel("Username");
    JTextField UsernameInput = new JTextField();
    JLabel PasswordLabel = new JLabel("Password");
    JTextField PasswordInput = new JTextField();
    JButton ButtonLogin = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(480,480);
        setTitle("Login Page");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(Login);
        add(UsernameLabel);
        add(UsernameInput);
        add(PasswordLabel);
        add(PasswordInput);
        add(ButtonLogin);
        Login.setBounds(20, 20, 440, 20);
        UsernameLabel.setBounds(20,60,400,20);
        UsernameInput.setBounds(20,80,400,32);
        PasswordLabel.setBounds(20,120,400,20);
        PasswordInput.setBounds(20,140,400,32);
        ButtonLogin.setBounds(20, 180, 80, 32);
        
        ButtonLogin.addActionListener((ActionListener)this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            String username;
            String password;
            if(e.getSource()== ButtonLogin){
                username = UsernameInput.getText();
                password = PasswordInput.getText();
                if(username.equals("123230136") && password.equals("12345")){
                    System.out.println("Sukses");
                    new HomePage(username);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Username atau password salah");
                }

            }
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}

