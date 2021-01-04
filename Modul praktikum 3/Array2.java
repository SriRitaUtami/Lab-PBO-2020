/**
* Program berikut untuk mencoba array dua dimensi
*/
public class Array2 {
public static void main(String args[]) {
int[][] arrx = new int[3][3];
arrx[0][0] = 1;
arrx[0][1] = 2;
arrx[0][2] = 3;
arrx[1][0] = 4;
arrx[1][1] = 5;
arrx[1][2] = 6;
arrx[2][0] = 7;
arrx[2][1] = 8;
arrx[2][2] = 9;
System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);
}
} 
//Program ini berisi code yang akan mengoperasikan array 2 dimensi
//dapat kita lihat arrx berisi 2 kurungan siku yang artinya array yang dapat dijalankan berjumlah 2 
//arti dari angka 3 yang ada dalam kurungan siku diatas adalah jumlah elemen yang bisa dioperasikan berjumlah 3 elemen.
//Dengan Hasil :
//Nilai arrx[0][0] : 1
//Nilai arrx[0][1] : 2
//Nilai arrx[0][2] : 3
//Nilai arrx[1][0] : 4
//Nilai arrx[1][1] : 5
//Nilai arrx[1][2] : 6
//Nilai arrx[2][0] : 7
//Nilai arrx[2][1] : 8
//Nilai arrx[2][2] : 9 