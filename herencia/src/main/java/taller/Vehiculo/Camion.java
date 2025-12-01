package taller.Vehiculo;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;
import taller.Ayuda.ISonido;

public class Camion extends Vehiculo implements ISonido, IDescribir {

   public void Sonido() {
      JOptionPane.showMessageDialog(null, "Suena Bocina del Camion");
   }

   public void Describir() {
      JOptionPane.showMessageDialog(null, "La marca del Camion es: " + getMarca() + "\n"
                                       +  "El color del Camion es: " + getColor() + "\n"
                                       +  "El cilindraje del Camion es: " + getCilindraje() + "\n"
                                       +  "La placa del Camion es: " + getPlaca() + "\n"
                                       +  "El peso del Camion es: " + getPeso() + "\n");
   }
}
