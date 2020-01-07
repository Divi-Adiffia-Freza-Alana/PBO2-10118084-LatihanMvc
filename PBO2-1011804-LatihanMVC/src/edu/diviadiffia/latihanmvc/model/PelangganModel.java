/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diviadiffia.latihanmvc.model;

import edu.diviadiffia.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String nomor;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
        fireOnChange();
    }
    
    protected void fireOnChange(){
    if(pelangganListener!=null){
       pelangganListener.onChange(this);
    }
    
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNomor("");
}
    public void simpanForm(){
    JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
    resetForm();
    }
    
}
