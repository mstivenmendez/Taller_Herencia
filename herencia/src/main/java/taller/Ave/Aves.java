package taller.Ave;

public class Aves {

   String nombre, especie, color;
   int peso;

   

   public Aves(String nombre, String especie, String color, int peso) {
      this.nombre = nombre;
      this.especie = especie;
      this.color = color;
      this.peso = peso;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public String getEspecie() {
      return especie;
   }
   public void setEspecie(String especie) {
      this.especie = especie;
   }
   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public int getPeso() {
      return peso;
   }
   public void setPeso(int peso) {
      this.peso = peso;
   }



}
