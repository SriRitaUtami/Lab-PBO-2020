/**
* Aplikasi untuk melakukan penambahan 2 nilai integer
* yang diambil dari parameter method main
*/
public class prak1Lat3 {
public static void main(String[] args) {
int nilai1 = Integer.parseInt(args[0]);
int nilai2 = Integer.parseInt(args[1]);
int hasil = nilai1 + nilai2;
System.out.println("Hasil " +nilai1+ " + " +nilai2+ " = "
+hasil);
}
}
//Method main pada Java memiliki parameter array bertipe string. Nilai yang disimpan pada parameter
//Nilai parameter yang dikirimkan tersebut akan diakses dengan menggunakan indeksnya (sama seperti
//array biasanya). Pada program di atas nilai parameter pertama diakses sebagai args[0], dan nilai
//Seperti yang dijelaskan sebelumnya, parameter tersebut bertipe String. Karena pada program di atas
//yang kita perlukan adalah nilai integer, maka nilai String tersebut dapat diubah menjadi integer dengan
//menggunakan bantuan kelas Integer. Kelas Integer memiliki method parseInt(String nilai) yang memiliki
//fungsi untuk mengubah nilai String menjadi integer. 