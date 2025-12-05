package taller.Animal;

import javax.swing.JOptionPane;

import taller.Ayuda.ISonido;

public class Perro extends Animal implements ISonido{


   public Perro(String nombre, String raza, String color, int edad, int peso) {
      super(nombre, raza, color, edad, peso);
   }

   public void Sonido() {
      JOptionPane.showMessageDialog(null, "Woof");
   }

    public Perro(){}

}
