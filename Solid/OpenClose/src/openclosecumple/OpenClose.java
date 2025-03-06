/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openclosecumple;

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
            new Renault(),
            new audi(),
            new Toyota()
        };
        
        imprimirCoche(ArregloCoches);
    }
    
    public static void imprimirCoche(Coche[] arregloCoche){
        for(Coche coche:arregloCoche){
            System.out.println(coche.getPrecioMedioCoche());
        }
    }

}
