package HariKe5Oop.Oop.Model;

import HariKe5Oop.Oop.Kendaraan;

public class Motor extends Kendaraan{
  public motor(){
    super(4);
  }
  public string getNamaPabrik(){

  return "Yamaha";
  }

  public void setNamaPabrik(){
  super.setNamaPabrik("Kendaraan belum di isi!");
  System.out.println(
    String.format("Dari kelas motor: %s",this.getNamaPabrik())
    );
  System.out.println(
  String.format("Dari kelas Kendaraan : s%",super.getNamaPabrik())
  );

  }

  public static void main(String[] args){
  Motor yamaha = new yamaha();
  yamaha.setNamaPabrik(yamaha.getNamaPabrik());
  }
}
