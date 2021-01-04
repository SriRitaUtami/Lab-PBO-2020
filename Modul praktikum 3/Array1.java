public class Array1 {
public static void main(String args[]) {
int nilai[]= new int[3];
nilai[0]=70;
nilai[1]=80;
nilai[2]=65;
double ratarata=0.0;
for(int i=0; i<nilai.length; i++)
ratarata+=nilai[i];
ratarata/=nilai.length;
System.out.println("Nilai rata-rata = " + ratarata);
}
}
//Nilai rata-rata = 71.66666666666667
//Program ini berisi code untuk menghitung nilai rata-rata dari 70, 80 dan 65.