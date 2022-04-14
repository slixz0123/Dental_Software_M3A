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
public class Linea {
    private Color color;
    private int x, y;
    private static final int d=50;
    public Linea(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
     public void pintarlinea(Graphics g){
        Graphics2D fig = (Graphics2D) g;
        fig.setColor(getColor());
        fig.setStroke(new BasicStroke(2));
        fig.drawLine(getX(), getY(), getX()+50,getY());
        fig.drawLine(getX(), getY()+10, getX()+50,getY()+10);
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
