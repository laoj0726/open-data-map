/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opendatamap;


import java.awt.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.util.Scanner;
import static opendatamap.Opendatamap.coordinate;


public class Area {
    private static float coverArea;
    private static int color;
    private static String category;
    
    public static float totalArea(){
        //try to calculate an approximation of the target area, a more adavanve calaculation would be apply later
        float total;
        return total = coordinate*coordinate;
    }
    public static void drawBorder(){
        DrawingPanel panel = new DrawingPanel(1024, -1024);
        Graphics2D g = panel.getGraphics();
        g.setStroke(new BasicStroke(totalArea())); // get result from totalArea method 
        g.setColor(new Color(color, 0, 0));
    }

    public static void selectArea(){
        //provide with an option for user to click the target area and rediert user to open data webiste for more imformation
        
    
    }      
}