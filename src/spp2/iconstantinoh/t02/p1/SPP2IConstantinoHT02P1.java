/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.t02.p1;
import java.util.Scanner;

/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sue, pago;
        int cate, he;
        Scanner kb=new Scanner(System.in);
        System.out.println("Calculadora de pagos a trabajadores");    
        System.out.print("Ingrese el sueldo base del trabajador:\n");
        sue=kb.nextDouble(); 
        System.out.print("Ingrese las horas extras del trabajador:\n");
        he=kb.nextInt();
        pago=sue+he*categorias();
System.out.println("Pago al trabajador: $"+pago+"\n");

    
    }
   public static double categorias(){
        int cate;
        double  phoras=0;
        
        System.out.print("Ingrese la categoría del trabajador:\n");
        Scanner kb=new Scanner(System.in);
        cate=kb.nextInt();
        
        if (cate==1){
            phoras=30;
        }else if(cate==2){
            phoras=38;
        }else if(cate==3){
            phoras=50;
        }else if(cate==4){
            phoras=70;
        }else{
            System.out.println("Su categoría no existe o no genera horas extra");
}
    return phoras;
    }
                        
}
 
