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
import java.awt.RenderingHints;

/**
 *
 * @author Saul
 */
public class Extraccion {
    private int x, y;
    public Extraccion(int x, int y) {
        setX(x);
        setY(y);
    }
    public void pintar_extrac(Graphics g){
       Graphics2D fig = (Graphics2D) g;
        int[] x={ getX()+50,getX()+37,getX()+40,getX(),getX()+5,getX()+45,getX()+48,getX()+50};
       int[] y={getY(),getY()+3,getY()+5,getY()+45,getY()+50,getY()+10,getY()+12,getY()};
       fig.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       fig.setColor(new Color(255,51,57));
       fig.setStroke(new BasicStroke(2));
       fig.drawPolygon(x, y, 8);
       fig.setColor(new Color(204,0,0));
       fig.fillPolygon(x, y, 8);
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
