/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Panel_Odontograma;
import Model.model_Odontograma;
import View.MenuPrincipal;
import View.Odontograma;
import View.vista_Odontograma;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import View.vista_Odontograma;

/**
 *
 * @author Saul
 */
public class Controller_odonto {
    private model_Odontograma modelo;
    private Odontograma vista;
    private MenuPrincipal vistaMenu ;
    private String circu_rojo, x_rojo;
    private String circu_azul, x_azul;
    private String rayas_inter, rayas_cont;
    private String triangulo;
    private String aster_rojo, aster_azul;
    Panel_Odontograma miod=new Panel_Odontograma();
    public Controller_odonto(model_Odontograma modelo , Odontograma vista , MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
       this.vistaMenu = vistaMenu;
        vista.setVisible(true);
        iniciar ();
   
    }
    public void iniciar (){
    agregarimagen();
    }
     private void agregarimagen(){
    vista.getPanelod().add(miod);
    
    }
    //
    private byte[] convertirimagen(JLabel jl){
    try {
        Icon icons = jl.getIcon();
        BufferedImage bi = new BufferedImage(icons.getIconWidth(), icons.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        icons.paintIcon(null, g, 0, 0);
        g.setColor(Color.WHITE);
        g.drawString(jl.getText(), 10, 20);
        g.dispose();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(bi, "jpg", os);
        InputStream fis = new ByteArrayInputStream(os.toByteArray());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        for (int readNum; (readNum = fis.read(buf)) != -1;) {
            bos.write(buf, 0, readNum);
            System.out.println("read " + readNum + " bytes,");
            }
         byte[] bytes = bos.toByteArray();
         return bytes;
        //photo = bytes;
    } catch (IOException d) {
        JOptionPane.showMessageDialog(null, d);
        return null;
    }

    }
    
}
