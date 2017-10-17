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
public class Rect implements Drawable{
    public int x;
    public int y;
    public int width;
    public int height;
    public Color color;
    public Rect(int xx, int yy, int w, int h, Color cc){
        x = xx;
        y = yy;
        width = w;
        height = h;
        color = cc;
    }
    public String toString(){
        return("rect: "+"x: "+x+" y: "+y+" width: "+width+" height: "+height);
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
            
}
