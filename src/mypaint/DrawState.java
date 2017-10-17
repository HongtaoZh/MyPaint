/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypaint;
import java.awt.Color;
/**
 *
 * @author Tao
 */
enum Mode {pen,rect}

enum Size {s1,s2,s3,s4,s5}
    


public class DrawState {
    Mode mode;
    Color color;
    Size size;
    public DrawState(Mode m, Color c,Size s){
    mode = m;
    color = c;
    size = s;
}
}
