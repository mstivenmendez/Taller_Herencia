package taller.Animal;

import javax.swing.JOptionPane;

import taller.Ayuda.ISonido;

public class Gato extends Animal implements ISonido {

   public Gato(String nombre, String raza, String color, int edad, int peso) {
      super(nombre, raza, color, edad, peso);
   }

   public void Sonido() {
      JOptionPane.showMessageDialog(null, "Meow");
   }



}
