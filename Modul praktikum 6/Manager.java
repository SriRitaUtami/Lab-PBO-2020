/**
 * Tentang Inheritance, Compilasi dan jalankan class ini
 * @author (Sri Rita Utami)
 * @version (Januari 2021)
 */
public class Manager extends Pegawai {
 	private String departemen; 
 
 	public Manager(String nama, double gaji, String departemen)
 	{ 
  		Pegawai p = new Pegawai(nama, gaji);
  		this.departemen = departemen;
 	}
  
 	public void setDepartemen(String departemen)
 	{
  		this.departemen = departemen;
 	}
  
 	public String getDepartemen()
 	{ 
  		return this.departemen;
 	}
} 

//code ini berisi eror karena method constructor tidak diturunkan pada subclass