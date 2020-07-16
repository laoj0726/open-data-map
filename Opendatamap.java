/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opendatamap;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




public class Opendatamap {

 

    public static float coordinate;
    public static String keyword;
    int id;
    

    public static void setLocation(){
        int checker;
        Scanner n = new Scanner(System.in);
       
        System.out.println("Please click or select an area on the map to start ");
        //get the coodinate data from the map
        coordinate = 0;
        showResult();
    }
    public static void directSearch(){
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a keyword for direct search: ");
        keyword = n.next();
        showResult();
    }
     public static void showResult() {
        if (keyword != null){
            //point out the search area on the map and redirect the user to the open data website
        }
        if(coordinate >= -1024 || coordinate <= 1024){
            //point out the search area on the map and redirect the user to the open data website
        }
    }
    
    public static void resetMap(Runnable runBeforeRestart) throws IOException {
        //reset the progtram by restarting the program 
    }
    
    public static void main(String[] args) throws InterruptedException {
        int choice;
        Scanner n = new Scanner(System.in);
        System.out.println("enter 1 for using map, press 2 for direct search");
        choice = n.nextInt();
        switch (choice) {
            case 1:
                setLocation();
                break;
            case 2:
                directSearch();
                break;
            default:
                System.out.println("you did sth wrong program would restart shortly...");
                TimeUnit.SECONDS.sleep(3);
                //resetMap();
                break;
        }
    }
    
}
