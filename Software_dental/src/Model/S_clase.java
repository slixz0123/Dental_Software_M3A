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
public class S_clase {
    private Color color;
    private int x, y;
    
    public S_clase(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
     public void pintarS(Graphics g){
        Graphics2D fig = (Graphics2D) g;
        Font font=new Font("TimesRoman",Font.BOLD,34);
        fig.setFont(font);
        fig.setColor(getColor());
        fig.drawString("S",getX(),getY());
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
