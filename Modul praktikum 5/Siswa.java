/**
 * @author (Sri Rita Utami)
 * @version (Januari 2021)
 */

public class Siswa { 
 	public int nrp; //atribut yang diubah menjadi public
  
 	public Siswa(int nrpx)
 	{ 
  		nrp = nrpx; 
  	}
  
 	public void setNrp(int nrpx)
 	{ 
 		nrp = nrpx;
 	}
 	
 	public int getNrp()
 	{ 
  	return nrp;
 	} 
} 

/*Enkapsulasi adalah proses untuk menyembunyikan hal yang harus
disembunyikan dan menampakkan hal yang boleh ditampakkan. Hal-hal yang perlu disembunyikan 
adalah atribut/ instance variable dan implementasi yang ada dalam method.  Sedangkan yang boleh
ditampakkan adalah nama method.