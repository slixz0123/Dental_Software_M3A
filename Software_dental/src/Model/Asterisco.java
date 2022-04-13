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
public class Asterisco {
   private Color color;
    private int x, y;

    public Asterisco(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    } 
    public void pintarasterisco(Graphics g){
       Graphics2D fig = (Graphics2D) g;
       int[] x={getX(), getX()-40,getX()-20,getX(),getX()-40,getX()-20,getX()-40,getX(),getX()-20,getX()-20,getX()-20,getX()-20};
       int[] y={getY()-40,getY(),getY()-20,getY(),getY()-40,getY()-20,getY()-20,getY()-20,getY()-20,getY(),getY()-40,getY()-20};
       fig.setColor(getColor());
       fig.setStroke(new BasicStroke(3));
       fig.drawPolygon(x, y, 12);
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
