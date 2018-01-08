package HariKe5Oop.Oop;

public class Mobil extends Kendaraan{

private String nama;

public void setNama(String nama){
 System.out.println(super.getjumlahRoda());
 // tidak bisa di akses karena private
 //System.out.println(pabrik);
 this.nama = nama;

}

public String nama(){
return this.nama;
   }

public void setNamaPabri(String pabrik){

  super.setNamaPabrik(pabrik);

}

public String pabrik(){
  return super.getNamaPabrik();
}


public static void main(String[] args){

Mobil honda= new Mobil();
honda.setNama("Honda Civic");
honda.setNamaPabrik("Honda jepang");
System.out.println(
String.format("nama pabrik %s",honda.getNamaPabrik()));

System.out.println(honda.nama());
}
}
