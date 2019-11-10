package ej2;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double prod,iva,s=0,desc;
        for(int i=1;i<=5;i++){
            System.out.println("Escribe el producto "+i);
            prod=sc.nextDouble();
            s+=prod;
        }
        iva=s+(s*0.16);
        System.out.println("El precio con iva es: "+iva);
        if(iva>500){
            desc=iva-(iva*0.05);
         System.out.println("Su total a pagar con descuento es de: "+desc);
        }else{
        System.out.println("Su total a pagar es: "+iva);
        }
    }
    
}
