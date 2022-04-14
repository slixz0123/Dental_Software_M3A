/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Saul
 */
public class Linea_entrecortada {
    private Color color;
    private int x, y;
    
    private static final int d=50;
    
    public Linea_entrecortada(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
     public void pintarlineaent(Graphics g){
        Graphics2D fig = (Graphics2D) g;
        fig.setStroke(new BasicStroke(2, 
                    BasicStroke.CAP_BUTT, // terminación: recta
                    BasicStroke.JOIN_ROUND, // unión: redondeada 
                    1f, // ángulo: 1 grado
                    new float[]{10, 5, 10, 5}, // línea de 10, 5 blancos, línea de 10, 5 blancos
                    2 // fase
            ));
        fig.setColor(getColor());
        fig.drawLine(getX(), getY(), getX()+50,getY());

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
