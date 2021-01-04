/**
* Program berikut untuk melihat panjang array
*/
public class CariPanjangElemen {
public static void main(String args[]) {
int x[][][][]=new int[2][][][];
x[0]=new int[1][][];
x[0][0]=new int[2][];
x[0][0][0]=new int[3];
x[0][0][1]=new int[2];
x[1]=new int[2][][];
x[1][0]=new int[1][];
x[1][0][0]=new int[2];
x[1][1]=new int[2][];
x[1][1][0]=new int[1];
x[1][1][1]=new int[3];
System.out.println(x.length);
System.out.println(x[0].length);
System.out.println(x[0][0].length);
System.out.println(x[0][0][0].length);
System.out.println(x[0][0][1].length);
System.out.println();
System.out.println(x[1].length);
System.out.println(x[1][0].length);
System.out.println(x[1][0][0].length);
System.out.println(x[1][1].length);
System.out.println(x[1][1][0].length);
System.out.println(x[1][1][1].length);
}
}
//Program ini adalah program yang berisi code untuk mencari panjang elemen dengan menggunakan konsep array
//menggunakan konsep array artinya tidak jauh dari konsep length yang mana length adalah konsep yang akan digunakan untuk 
//mengoperasikan panjang elemen.
//Dengan hasil :
//2
//1
//2
//3
//2

//2
//1
//2
//2
//1
//3