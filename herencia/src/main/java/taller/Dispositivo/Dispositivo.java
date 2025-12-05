package taller.Dispositivo;

public class Dispositivo {

   String marca, modelo, sistemaOperativo;
   int almacenamiento, ram;


   public Dispositivo(String marca, String modelo, String sistemaOperativo, int almacenamiento, int ram) {
      this.marca = marca;
      this.modelo = modelo;
      this.sistemaOperativo = sistemaOperativo;
      this.almacenamiento = almacenamiento;
      this.ram = ram;
   }

   public String getMarca() {
      return marca;
   }
   public void setMarca(String marca) {
      this.marca = marca;
   }
   public String getModelo() {
      return modelo;
   }
   public void setModelo(String modelo) {
      this.modelo = modelo;
   }
   public String getSistemaOperativo() {
      return sistemaOperativo;
   }
   public void setSistemaOperativo(String sistemaOperativo) {
      this.sistemaOperativo = sistemaOperativo;
   }
   public int getAlmacenamiento() {
      return almacenamiento;
   }
   public void setAlmacenamiento(int almacenamiento) {
      this.almacenamiento = almacenamiento;
   }
   public int getRam() {
      return ram;
   }
   public void setRam(int ram) {
      this.ram = ram;
   }

   public Dispositivo (){}



}
