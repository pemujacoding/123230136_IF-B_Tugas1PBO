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
public class Pembelian extends JFrame implements ActionListener{
    String username, kategori; int harga; 
    JLabel Desc1 = new JLabel("Halaman Pembelian");
    JLabel Desc2 = new JLabel("Kategori");
    JLabel Desc3 = new JLabel("Harga");
    JLabel Desc4 = new JLabel("Jumlah");
    JLabel Kategori = new JLabel();
    JLabel Harga = new JLabel();
    JTextField Jumlah = new JTextField();
    JButton Kembali = new JButton("Kembali");
    JButton Beli = new JButton("Beli");
    JLabel Desc5 = new JLabel("Total Pembelian");
    JLabel Desc6 = new JLabel("Harga satuan");
    JLabel Desc7 = new JLabel("Jumlah");
    JLabel Desc8 = new JLabel("Total Harga");
    JLabel HargaKonfirm = new JLabel();
    JLabel JumlahKonfirm = new JLabel();
    JLabel Total = new JLabel();
    public Pembelian(String kategori,int harga, String username ){
        setVisible(true);
        setSize(480,480);
        setTitle("Order Page");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(Desc1);
        add(Desc2);
        add(Desc3);
        add(Desc4);
        add(Kategori);
        add(Harga);
        add(Jumlah);
        add(Kembali);
        add(Beli);
        Kategori.setText(kategori);
        Harga.setText("Rp "+ harga + "/pcs");
        Desc1.setBounds(20,40,400,32);
        Desc2.setBounds(40,80,100,32);
        Kategori.setBounds(200,80,100,32);
        Desc3.setBounds(40,120,100,32);
        Harga.setBounds(200,120,100,32);
        Desc4.setBounds(40,160,100,32);
        Jumlah.setBounds(200,160,100,32);
        Kembali.setBounds(40,200,100,32);
        Beli.setBounds(180,200,100,32);
        Kembali.addActionListener((ActionListener)this);
        Beli.addActionListener((ActionListener)this);
        
        this.username = username;
        this.kategori = kategori;
        this.harga = harga;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String jumlah = Jumlah.getText();
            if(e.getSource()==Kembali){
                new HomePage(this.username);
                this.dispose();
            }
            else if(e.getSource()==Beli){
                if(!isNumeric(jumlah)){
                    JOptionPane.showMessageDialog(this, "Jumlah Harus Angka");
                }
                else{
                    int jumlahint = Integer.parseInt(jumlah);
                    add(Desc5);
                    add(Desc6);
                    add(Desc7);
                    add(Desc8);
                    add(HargaKonfirm);
                    add(JumlahKonfirm);
                    add(Total);
                    
                    HargaKonfirm.setText("Rp "+ this.harga);
                    JumlahKonfirm.setText(jumlahint + " pcs");
                    Total.setText("Rp "+ this.harga * jumlahint);
                    Desc5.setBounds(20,240,100,32);
                    Desc6.setBounds(40,280,100,32);
                    HargaKonfirm.setBounds(150,280,100,32);
                    Desc7.setBounds(40,320,100,32);
                    JumlahKonfirm.setBounds(150,320,100,32);
                    Desc8.setBounds(40,360,100,32);
                    Total.setBounds(150,360,100,32);
                    
                }
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    private boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
