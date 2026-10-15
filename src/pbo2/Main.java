
package pbo2;


public class Main {
    
        public static void main(String[] args) {
        System.out.println("1.");
        Increment i =new Increment();
        i.tambah=1;
        i.Tampil();
        System.out.println("2.");
        
        Persegipanjang pp =new Persegipanjang();
        pp.lebar=45;
        pp.panjang=50;
        pp.Hitungluas();
        System.out.println("3.");
        
        PersamaanKuadrat pk =new PersamaanKuadrat();
        pk.a=2;
        pk.b=10;
        pk.c=5;
        pk.Hasil();
        System.out.println("4.");
        
        OperasiMatematika Mt =new OperasiMatematika();
        Mt.x=22;
        Mt.y=33;
        Mt.mtk();
        System.out.println("5."); 
        
        Segitiga sg =new Segitiga();
        sg.a=6;
        sg.b=8;
        sg.Luas();
        System.out.println("6."); 
        
        Segitiga kl =new Segitiga();
        kl.a=6;
        kl.b=8;
        kl.Keliling();
        System.out.println("7.");   
        
        Belajarjava B = new Belajarjava();
        B.tampil();       
        System.out.println("8.");
        
        Jarak j =new Jarak();
        j.bulan=384400;
        j.matahari=152100000;
        j.cahaya=300000;
        j.Waktutempuh();       
        System.out.println("9.");
        
        KonversiSuhu KS =new KonversiSuhu();
        KS.c=10;
        KS.f=15;
        KS.r=5;
        KS.hasilkon();
    }
    
}

