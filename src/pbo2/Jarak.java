/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

public class Jarak {
     double bulan;
    double matahari;
    double cahaya;
    
    public void Waktutempuh(){
        double wtb=bulan/cahaya;
        double wtm=matahari/cahaya;
        System.out.println("Waktu Tempuh Bumi Ke Bulan Adalah : "+ wtb);
        System.out.println("Waktu Tempuh Bumi Ke Matahari Adalah : "+ wtm);
        }
}
