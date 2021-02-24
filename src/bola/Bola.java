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
public class Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       //membuat objek math dari class TestBola
       TestBola math = new TestBola();
        math.showJarijari(10);
        math.showDiameter(2*10);
        math.showLuasPermukaan(4*3.14*10*10);
        math.showVolume(0.75*3.14*10*10*10);
       
        System.out.println("Jari-Jari : "+math.getJarijari());
        System.out.println("Diameter : "+math.getDiameter());
        System.out.println("Luas Permukaan Bola : "+math.getLuasPermukaan());
        System.out.println("Volume Bola: "+math.getVolume());
       
    }
    
}
