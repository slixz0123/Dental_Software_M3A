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
public class odon {
    private Color color;
    private int x, y;
    private boolean relleno;

    public odon(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }

    public void pintarod(Graphics g){
        Graphics2D fig = (Graphics2D) g;
       int[] x={getX()-27, getX()-26,getX()-38,getX()-25,getX()-38,getX()-40,getX()-28,getX()-41};
       int[] y={getY()-32,getY()-34,getY()-45,getY()-54,getY()-66,getY()-65,getY()-54,getY()-45};
       fig.setColor(Color.black);
       fig.drawPolygon(x, y, 8);
       fig.setColor(Color.blue);
       fig.fillPolygon(x, y, 8);
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
