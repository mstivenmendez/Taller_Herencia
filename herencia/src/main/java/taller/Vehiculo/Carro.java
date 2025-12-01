package taller.Vehiculo;

import javax.swing.JOptionPane;

import taller.Ayuda.ISonido;
import taller.Ayuda.IDescribir;

public class Carro extends Vehiculo implements ISonido, IDescribir{

   public void Sonido() {
      JOptionPane.showMessageDialog(null, "Suena Bocina");
   }

   public void Describir() {
      JOptionPane.showMessageDialog(null, "La marca del carro es: " + getMarca() + "\n"
                                       +  "El color del carro es: " + getColor() + "\n"
                                       +  "El cilindraje del carro es: " + getCilindraje() + "\n"
                                       +  "La placa del carro es: " + getPlaca() + "\n"
                                       +  "El peso del carro es: " + getPeso() + "\n");
   }

}
