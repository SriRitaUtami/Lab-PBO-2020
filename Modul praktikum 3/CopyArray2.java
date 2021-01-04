/**
* Program berikut untuk menguji awalan atau akhir suatu string
berntebet
*/
public class CopyArray2 {
public static void main(String args[]) {
String str1 = "Informatika Universitas Syiah Kuala";
System.out.println(str1.startsWith("Inf"));
System.out.println(str1.endsWith("kuala"));
System.out.println(str1.startsWith("Inf",1));
System.out.println(str1.startsWith("Inf",2));
System.out.println(str1.startsWith("Inf",3));
}
}
//Program ini bertujuan untuk menguji awalan atau akhiran suatu String
//Dengan hasil :
//true
//false
//false
//false
//false