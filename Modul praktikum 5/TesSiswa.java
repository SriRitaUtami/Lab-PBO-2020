/**
 * Tentang Enskapsulasi
 * @author (Sri Rita Utami)
 * @version (Januari 2021)
 */
public class TesSiswa
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa(12345);
 		s.nrp = 8030001; //atribut nrp yang dapat diubah-ubah
 		System.out.println(s.nrp);

 		s.nrp = 8030002;
 		System.out.println(s.nrp);
 	}
}

/*
Dapat kita lihat pada class TesSiswa, atribut nrp dapat dengan mudahnya diubah di luar dari class Siswa.
Berarti nilai nrp bisa sangat bebas diubah dimanapun. Hal ini sangat berbahaya.  Oleh karena itu atribut 
di-enkaps ulasi dengan hak akses private. Ubah hak akses atribut nrp menjadi private. Kemudian coba
kompilasi class TesSiswa maka akan muncul error.  
*Hal yang sama jga berlaku pada method. Jika method dibuat private maka akan muncul error pada
class Tesiswa.
*/