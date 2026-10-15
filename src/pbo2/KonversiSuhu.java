/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

public class KonversiSuhu {
    double c;
    double f;
    double r;
    
    
    public void hasilkon(){
        System.out.println("Celcius ke fahrenhait : "+((9/5*c)+32));
        System.out.println("fahrenhait ke Celcius : "+(5/9*(f-32)));
        System.out.println("Celcius ke Reamur : "+(4/5*c));
        System.out.println("Reamur ke Celcius : "+(5/4*r));
        System.out.println("fahrenhait ke Reamur : "+(4/9*(f-32)));
        System.out.println("Reamur ke fahrenhait : "+((9/4*r)+32));
    }
}
