/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openclosenocumple;

/**
 *
 * @author jharif
 */
public class OpenClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[] ArregloCoches = {
            new Coche("Renault"), 
            new Coche("Audi"),
            new Coche("Mercedes")
        };
        
        imprimirCoche(ArregloCoches);
    }
    
    public static void imprimirCoche(Coche[] arregloCoche){
        for(Coche coche:arregloCoche){
            if(coche.getMarca().equals("Renault")) 
                System.out.println("precio 18000$");
            if (coche.getMarca().equals("Audi"))
                System.out.println("precio 20000$");
            if (coche.getMarca().equals("Mercedes"))
                System.out.println("precio 27000$");
        }
    }

}
