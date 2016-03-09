package Praktikum2;
import java.util.Scanner;
public class MainBerlari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int jumlah = in.nextInt();
        MahasiswaLari mhs[] = new MahasiswaLari[jumlah];

        int panjang = in.nextInt();
        int lebar = in.nextInt();
        Lapangan lpg = new Lapangan(panjang, lebar);
       
        for (int i = 0; i < mhs.length; i++) {

            
            
            String nama;
            String nim;
            int jumlahPutaran;
            int jumlah_waktu;
          

            String h = in.next();
            String y = in.next();
            String j = in.next();
            String k = in.next();
           
            
            
            String Tulisan = h +","+ y +","+ j +","+ k;
            String[] pecah = Tulisan.split(",");
            
            int j1 = Integer.parseInt(pecah[4]);
            int k1 = Integer.parseInt(pecah[6]);
            
            nim= pecah[0];

            nama = pecah[2];

            jumlahPutaran = j1;

            jumlah_waktu = k1;
            
            
            mhs[i] = new MahasiswaLari(nim, nama, jumlahPutaran, jumlah_waktu);
            
            
          
        }
        for(int i =0;i<mhs.length;i++){
            mhs[i].Tampil(lpg);
        }
        mhs[0].Pemenang(mhs,lpg);
 
    
}
         
    }
