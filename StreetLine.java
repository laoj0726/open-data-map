/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opendatamap;

import java.awt.Graphics;
import static opendatamap.Opendatamap.coordinate;

/**
 *
 * @author ljhou
 */
public class StreetLine {
    private static String category;
    private static String connection;
    private static int color;
    
    public static float totalLength(){
         float total;
         return total = coordinate*coordinate;
    }
     public static void drawStreet(){
         Graphics g;
         g.drawLine(coordinate,coordinate,coordinate,coordinate);
     }
     public static void showConnection(){
      //provide with an option for user to click the target area and rediert user to open data webiste for more imformation
     }
}
