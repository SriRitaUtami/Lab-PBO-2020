/**
* Program berikut untuk mengecek tipe data primitive pada Java
*/
public class prak1Lat2 {
public static void main(String[] args) {
// Tipe data primitif
long data1 = 767226531;
int data2 = 2235641;
short data3 = 714;
byte data4 = 34;
float data6 = (float) 1.733; // tipe data pecahan
double data5 = 4.967; // tipe data pecahan
char data7 = 'C';
boolean data8 = true;
System.out.println("Nilai Long : "+ data1);
System.out.println("Nilai Int : "+ data2);
System.out.println("Nilai Short : "+ data3);
System.out.println("Nilai Byte : "+ data4);
System.out.println("Nilai Double : "+ data5);
System.out.println("Nilai Float : "+ data6);
System.out.println("Nilai Char : "+ data7);
System.out.println("Nilai Boolean : "+ data8);
}
}
//Pengubahan data4 dari 34 menjadi 500 akan menyebabkan eror karena type data byte tidak sanggup menyimpan value sebesar 500
//Pengubahan data8 dari true menjadi 1 akan menyebabkan eror karena type data boolean tidak bisa menakses data dengan type //integer