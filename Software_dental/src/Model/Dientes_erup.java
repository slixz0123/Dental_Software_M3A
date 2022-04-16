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
public class Dientes_erup {
    private int x, y;
    public Dientes_erup(int x, int y) {
        setX(x);
        setY(y);
    }
    public void pintardientes_erup(Graphics g){
       Graphics2D fig = (Graphics2D) g;
       if(getY()>160 && getY()<348 || getY()>420 && getY()<498){
       int[] x={getX()+13, getX(),getX()+8,getX()+8,getX()+18,getX()+18,getX()+26,getX()+13};
       int[] y={getY(),getY()+15,getY()+15,getY()+30,getY()+30,getY()+15,getY()+15,getY()};
       fig.setColor(Color.black);
       fig.setStroke(new BasicStroke(2));
       fig.drawPolygon(x, y, 8);
       fig.setColor(new Color(0,51,255));
       fig.fillPolygon(x, y, 8);
       }else{
        //   flecha hacia abajo
       int[] x1={getX()+5, getX()+5,getX(),getX()+10,getX()+20,getX()+15,getX()+15};
       int[] y1={getY(),getY()+20,getY()+20,getY()+33,getY()+20,getY()+20,getY()};
       fig.setColor(Color.black);
       fig.setStroke(new BasicStroke(2));
       fig.drawPolygon(x1, y1, 7);
       fig.setColor(new Color(0,51,255));
       fig.fillPolygon(x1, y1, 7);}
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
