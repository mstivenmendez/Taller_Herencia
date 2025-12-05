package taller.Vehiculo;

import taller.Ayuda.ISonido;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;

public class Bicicleta extends Vehiculo implements ISonido, IDescribir {

   public void Sonido() {
      JOptionPane.showMessageDialog(null, "Suena la bicicleta ");
   }
   public Bicicleta() { }

   public void Describir() {
      JOptionPane.showMessageDialog(null, "La marca del bicicleta es: " + getMarca() + "\n"
                                       +  "El color del bicicleta es: " + getColor() + "\n"
                                       +  "El peso del bicicleta es: " + getPeso() + "\n");
   }

}
