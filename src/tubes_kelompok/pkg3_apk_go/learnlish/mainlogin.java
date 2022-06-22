/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_kelompok.pkg3_apk_go.learnlish;


import javax.swing.JOptionPane;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;
/**
 *
 * @author Dewa
 */
public class mainlogin {
 public static void main(String arg[])  
    {  
        try  
        {    
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(300,100);  
            form.setVisible(true);    
        }  
        catch(Exception e)  
        {        
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }     
}

