/**
 * @author (Sri Rita Utami)
 * @version (Januari 2021)
 */
public class Siswa2 { 
 	private int nrp;
  
 	public Siswa(int nrp) 
 	{
 		 nrp = nrp; 
 	}
  
 	public void setNrp(int nrp)
 	{
  		this.nrp = nrp; //untuk menghilangkan ambigu kita memakai this
 	}
  
 	public int getNrp()
 	{ 
 		return nrp;
 	} 
} 

/*Guna penambahan this adalah agar manusia yang melihat bisa mengerti bahwa this.nrp itu merujuk kepada 
atribut nrp yang ada pada objek sekarang. Sedangkan nrp yang kedua merupakan nrp dari parameter
*/