package pkg123230136_latihankuis;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class HomePage extends JFrame implements ActionListener{
    String username;
    JLabel SelamatDatang = new JLabel();
    JLabel Desc1 = new JLabel("Silakan pilih menu di bawah untuk membeli majalah");
    JButton MAnak = new JButton("Majalah Anak");
    JButton MRemaja = new JButton("Majalah Remaja");
    JButton MDewasa = new JButton("Majalah Dewasa");
    HomePage(String username){
        setVisible(true);
        setSize(480,480);
        setTitle("Home Page");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(SelamatDatang);
        add(Desc1);
        add(MAnak);
        add(MRemaja);
        add(MDewasa);
        SelamatDatang.setText("Selamat Datang, " + username);
        SelamatDatang.setBounds(20, 20, 400, 32);
        Desc1.setBounds(20,52,400,32);
        MAnak.setBounds(40,100,300,32);
        MRemaja.setBounds(40,140,300,32);
        MDewasa.setBounds(40,180,300,32);
        
        MAnak.addActionListener((ActionListener)this);
        MRemaja.addActionListener((ActionListener)this);
        MDewasa.addActionListener((ActionListener)this);
        this.username = username;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String kategori[] = {"Majalah Anak", "Majalah Remaja", "Majalah Dewasa"}; 
        int harga[] = {10800, 15200, 25400};
        try{
            if(e.getSource()==MAnak){
                new Pembelian(kategori[0],harga[0],username);
                this.dispose();
            }
            else if(e.getSource()==MRemaja){
                new Pembelian(kategori[1],harga[1],username);
                this.dispose();
            }
            else if(e.getSource()==MDewasa){
                new Pembelian(kategori[2],harga[2],username);
                this.dispose();
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
