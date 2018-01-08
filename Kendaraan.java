package HariKe5Oop.Oop;

public class Kendaraan{

public Kendaraan(Integer jumlahRoda){
  this.jumlahRoda = jumlahRoda;
}

private Integer jumlahRoda=4;
private String pabrik;

public Integer getjumlahRoda(){
  return this.jumlahRoda;
}

public void setJumlahRoda(Integer x){
  this.jumlahRoda=x;
}

public String getNamaPabrik(){
  return this.pabrik;
}
public void setNamaPabrik(String pabrik){
  this.pabrik=pabrik;
}
}
