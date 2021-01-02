import java.util.*;
import java.util.ArrayList;

public class Bus
{
    ArrayList <Penumpang> penumpangBiasa;
    ArrayList <Penumpang> penumpangPrioritas;
    ArrayList <Penumpang> Totalpenumpang;

    public Bus()
    {
        penumpangBiasa = new ArrayList <Penumpang>();
        penumpangPrioritas = new ArrayList <Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;

    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumlahBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang dengan kategori Biasa adalah " + jumlahBiasa);
        return jumlahBiasa;

    }

    public int getJumlahPenumpangPrioritas(){
        int jumlahPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang dengan kategori Prioritas adalah " + jumlahPrioritas);
        return jumlahPrioritas;
    }

    public int getJumlahTotalPenumpang(){
        int t = penumpangBiasa.size() + penumpangPrioritas.size();
        System.out.println("Total penumpang yang ada di dalam bus : " +t);
        return t;
    }

    public boolean NaikPenumpang(Penumpang penumpang){
        
        if(penumpangPrioritas.size() < 1 && penumpang.getUmur() < 10 || penumpang.getUmur() > 60 || penumpang.getHamil()==true){
            System.out.println("Penumpang dengan nama " +penumpang.getNama()+ " BERHASIL ditambahkan");
            return penumpangPrioritas.add(penumpang);
        }

        else if((penumpangBiasa.size() < 5 ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang dengan nama " +penumpang.getNama()+ " BERHASIL ditambahkan");
            return penumpangBiasa.add(penumpang);
        }
        else if(penumpangBiasa.size() < 5 ){
            System.out.println("Penumpang dengan nama " +penumpang.getNama()+ " BERHASIL ditambahkan");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.print("Penumpang dengan nama " +penumpang.getNama()+ " TIDAK BERHASIL ditambahkan");
            System.out.println("Mohon maaf! silahkan naik bus lain dan sampai jumpa lagi\n");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("penumpang dengan nama "+nama+" telah diturunkan");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Penumpang " +nama+ "Tidak Ada di dalam bus ");
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("penumpang dengan nama "+nama+" telah diturunkan");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Penumpang dengan nama " +nama+ "Tidak Ada di dalam bus");
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String P =" ";
        String B =" ";
        boolean A = penumpangBiasa.isEmpty();
        boolean C = penumpangPrioritas.isEmpty();

        for(Penumpang penumpang : penumpangPrioritas){
            P += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : penumpangBiasa){
            B += penumpang.getNama().toString();
        }

        if(A == true){
            System.out.println("Penumpang dengan kategori prioritas : TIDAK ADA");
        }
        else{
            System.out.println("Penumpang dengan kategori prioritas : " +P);
        }

        if(C == true){
            System.out.println("Penumpang dengan kategori biasa: TIDAK ADA");
        }
        else{
            System.out.println("Penumpang dengan kategori biasa : " +B);
        }

        return "Daftar nama penumpang dengan kategori prioritas = "+P+ "Daftar nama penumpang dengan kategori biasa = "+B+ "\n";
    }
} 