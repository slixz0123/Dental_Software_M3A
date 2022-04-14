/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Saul
 */
public class Triangulo {
    private Color color;
    private int x, y;

    public Triangulo(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    
    public void pintartriangulo(Graphics g){
       Graphics2D fig = (Graphics2D) g;
       int[] x={getX(), getX()-13,getX()-26};
       int[] y={getY()+26,getY(),getY()+26};
       fig.setColor(Color.black);
       fig.drawPolygon(x, y, 3);
       fig.setColor(getColor());
       fig.fillPolygon(x, y, 3);
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
