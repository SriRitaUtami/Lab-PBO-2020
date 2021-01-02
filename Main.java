import java.util.*;

public class Main {   
    private static Scanner A;
    private boolean t ;
    private int pilihan;

public Main() {
        this.t = true;
    }

    public static void main(String[] args) {
        A = new Scanner(System.in);
        new Main().mainkan();
    }

    public void mainkan(){     
        Bus r = new Bus();
      
    System.out.println("SELAMAT DATANG DI BUS TRANS KOETARADJA");  
    System.out.println("======== BUS TRANS KOETARADJA ========");

    while(t){
        System.out.println("\n<===============================>");
        System.out.println("\t     MENU ");
        System.out.println("<===============================>");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.print("Pilihan = ");
        pilihan = A.nextInt();
  
           if (pilihan == 1) {         
                 System.out.print("\nNama\t\t: ");
                 String nama = A.next(); 
                 System.out.print("Umur\t\t: ");
                 int umur = A.nextInt();
                 System.out.print("Hamil [y/n]\t: "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
                 System.out.println("\n<===============================>"); 
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);                
                 r.NaikPenumpang(penumpang);
                 r.toString();
                 r.getJumlahPenumpangBiasa();
                 r.getJumlahPenumpangPrioritas();
                 r.getJumlahTotalPenumpang();      
                 System.out.println("<===============================>"); 

            }else if (pilihan == 2){ 
                System.out.print("\nNama : ");
                String nama = A.next();
                r.turunkanPenumpang(nama);
                r.toString();
                System.out.println("<===============================>");
                t = true;
            }else if (pilihan == 3){ 
                r.toString();
                System.out.println("<===============================>");
                System.out.println("");
                t = true;
            }else{
                System.out.println("Pilihan Tidak Terdeteksi");
            }
        }  
    }
}
