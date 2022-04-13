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
public class Cuadrado {
    private Color color;
    private int x, y;
    private boolean relleno;
    private static final int d=14;

    public Cuadrado(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
    public void pintar(Graphics g){
        Graphics2D fig = (Graphics2D) g;
        fig.setColor(getColor());
        fig.fillRect(getX(), getY(), d, d);
        fig.setColor(Color.black);
        fig.drawRect(getX(), getY(), d, d);   
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

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
}
