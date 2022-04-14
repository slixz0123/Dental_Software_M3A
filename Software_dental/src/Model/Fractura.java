/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Saul
 */
public class Fractura {
    private Color color;
    private int x, y;
    
    public Fractura(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
     public void pintarFractura(Graphics g){
       Graphics2D fig = (Graphics2D) g;
       int[] x={getX()+25, getX()+40,getX()+25,getX()+25,getX()+18,getX()+17,getX(),getX()+14,getX()+15,getX()+21,getX()+21};
       int[] y={getY(),getY()+7,getY()+16,getY()+13,getY()+21,getY()+19,getY()+35,getY()+10,getY()+13,getY()+4,getY()+7};
       fig.setColor(Color.black);
       fig.setStroke(new BasicStroke(2));
       fig.drawPolygon(x, y, 11);
       fig.setColor(Color.red);
       fig.fillPolygon(x, y, 11);
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
