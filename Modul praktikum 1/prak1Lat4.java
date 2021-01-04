/**
* Aplikasi untuk melakukan penambahan 2 nilai integer
* yang dimasukkan melalui layar konsol sewaktu run program
* dengan memanfaatkan method pada class Scanner
*/
import java.util.Scanner;
public class prak1Lat4{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int nilai1, nilai2, hasil;
System.out.print("Masukkan integer pertama:");
nilai1 = input.nextInt();
System.out.print("Masukkan integer kedua:");
nilai2 = input.nextInt();
hasil = nilai1 + nilai2;
System.out.println("Hasil " +nilai1+ " + " +nilai2+ " = "
+hasil);
} 
//Input dari konsol pengguna dapat menggunakan berbagai cara. Salah satu cara dengan bantuan kelas Scanner. 
//Kelas Scanner memiliki banyak method untuk input tergantung keperluan. 
//Karena pada program ini kita memerlukan nilai integer maka method yang kita gunakan nextInt().
//Untuk menggunakan kelas Scanner, kita perlu melakukan import paket java.util atau langsung import kelas
//paket Scanner dengan import java.util.Scanner.