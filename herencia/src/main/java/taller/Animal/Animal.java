package taller.Animal;

public class Animal {
   String nombre, raza, color;
   int edad, peso;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getRaza() {
      return raza;
   }

   public void setRaza(String raza) {
      this.raza = raza;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public int getPeso() {
      return peso;
   }

   public void setPeso(int peso) {
      this.peso = peso;
   }

   public Animal(String nombre, String raza, String color, int edad, int peso) {
      this.nombre = nombre;
      this.raza = raza;
      this.color = color;
      this.edad = edad;
      this.peso = peso;
   }
}
