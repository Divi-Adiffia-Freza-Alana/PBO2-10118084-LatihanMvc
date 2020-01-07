/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diviadiffia.latihanmvc.controller;

import edu.diviadiffia.latihanmvc.model.PelangganModel;
import edu.diviadiffia.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String nomor = view.getTxtNomor().getText();
        
        if(nama.equals("") && email.equals("") && nomor.equals("")){
        
        }
        else{
        model.resetForm();
        }
    
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String nomor = view.getTxtNomor().getText();
        
        if(nama.equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        
        } 
        else if(email.trim().equals("")){
           JOptionPane.showMessageDialog(view, "Email Masih Kosong"); 
    
        }
        else if(nomor.trim().equals("")){
           JOptionPane.showMessageDialog(view, "Nomor Masih Kosong"); 
    
        }
        else{
        model.simpanForm();
        }
    }
    
}
