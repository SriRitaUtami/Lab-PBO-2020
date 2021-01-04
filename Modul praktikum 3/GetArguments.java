/**
* Program berikut untuk mendapatkan nilai argumen pada method main
*/
public class GetArguments {
public static void main(String args[]) {
System.out.println("Tanggal : " + args[0]);
System.out.println("Bulan : " + args[1]);
System.out.println("Tahun : " + args[2]);
}
}
//Program ini bertujuan untuk mendapatkan nilai argumen pada method lain 
//Method main memiliki parameter berupa array bertipe String. Berapapun argumen yang diketik saat running, akan disimpan dalam array tersebut dan diakses dengan menggunakan indeks.