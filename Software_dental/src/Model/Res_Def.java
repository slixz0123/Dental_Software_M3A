/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Saul
 */
public class Res_Def {
    private Color color;
    private int x, y;
    private static final int d=30;
    public Res_Def(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
     public void pintarresstauracion(Graphics g){
        Graphics2D fig = (Graphics2D) g;
        fig.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        fig.setColor(new Color(255,0,0,200));
        fig.drawOval(getX()-4, getY()-12, d+8, d);
        fig.fillOval(getX()-4, getY()-12, d+8, d);
        
        fig.setColor(new Color(0,51,255,200));
        fig.drawOval(getX(), getY(), d, d);
        fig.fillOval(getX(), getY(), d, d);
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
