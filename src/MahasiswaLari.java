package Praktikum2;
public class MahasiswaLari {
    String nim, nama;
    int jumlahPutaran;  
    int jumlah_waktu;
   

    
    public MahasiswaLari(String nim, String nama, int jumlahPutaran, int jumlah_waktu){
        this.nim = nim;
   
        this.nama = nama;
 
        this.jumlahPutaran = jumlahPutaran;
   
        this.jumlah_waktu = jumlah_waktu;
        
       
        
    }
    
    public int hitungJarak(Lapangan a){
        return this.jumlahPutaran*a.getKeliling();
    }
    public void Tampil(Lapangan a){
        System.out.println(nama+" " + hitungJarak(a));

    }
    public int hitung(Lapangan a){
        return hitungJarak(a)/jumlah_waktu;
    }
    public void Pemenang(MahasiswaLari b[],Lapangan a){
        double min;
        int k = 0;
        min = b[0].hitung(a);
        for(int i=0;i<b.length;i++){
           if(min < b[i].hitung(a)) {
               min = b[i].hitung(a);
               k++;
           }
        }
        System.out.println((b[k].nama)+" "+b[k].hitung(a));
    }   
}
    
//    public int hitungJarak(Lapangan a, int i){
//        return this.jumlahPutaran[i] * a.getKeliling();
//    }
//    public void Tampil(Lapangan b, int i){
//        System.out.println(nama[i] + " " + hitungJarak(b,i));
//    }
//}
        
