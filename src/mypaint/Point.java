/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypaint;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Tao
 */
public class Point implements Drawable{
    public int x;
    public int y;
    public int size;
    public Color color;
    public Point(int xx,int yy,int ss, Color cc){
        x = xx;
        y = yy;
        size = ss;
        color = cc;
      
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x-size/2, y-size/2, size, size);
    }
}
