/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author 041406846
 */
public class ConverterFrame extends javax.swing.JFrame {

    /**
     * ConverterFrame is extended class form JFrame, containing ConverterPanel class.
     * main class calls ConverterFrame class
     */
    public ConverterFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //get the screen size
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); //to show the display at center of screens
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        converterView1 = new converterapp.ConverterView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(converterView1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private converterapp.ConverterView converterView1;
    // End of variables declaration//GEN-END:variables
}
