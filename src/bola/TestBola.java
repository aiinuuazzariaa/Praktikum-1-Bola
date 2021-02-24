/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

/**
 *
 * @author MOKLET-2
 */
public class TestBola {
private double jarijari;
private double diameter;
private double luaspermukaan;
private double volume;

   public double getJarijari(){
       return jarijari;
   }
   
   public double getDiameter(){
       diameter = 2*jarijari;
       return diameter;
   }
   
   public double getLuasPermukaan(){
       luaspermukaan = 4*3.14*jarijari*jarijari;
       return luaspermukaan;
   }
   
   public double getVolume(){
       volume = 0.75*3.14*jarijari*jarijari*jarijari;
       return volume;
   }
   
   public void showJarijari (double newJarijari){
    jarijari = newJarijari;
    }
   
   public void showDiameter (double newDiameter){
    diameter = 2*jarijari;
    diameter = newDiameter;
    }
   
   public void showLuasPermukaan (double newLuasPermukaan){
    luaspermukaan = 4*3.14*jarijari*jarijari;
    luaspermukaan = newLuasPermukaan;
    }
   
   public void showVolume (double newVolume){
    volume = 0.75*3.14*jarijari*jarijari*jarijari;
    volume = newVolume;
    }

    
    }

