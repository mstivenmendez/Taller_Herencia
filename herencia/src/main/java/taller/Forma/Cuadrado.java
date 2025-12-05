package taller.Forma;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;

public class Cuadrado extends Figura implements IArea, IPerimetro,  IDescribir {

   public double lado;

   public Cuadrado(String nombre, double lado) {
      super(nombre) ;
      this.lado = lado;

   }

   public double getLado() {
      return lado;
   }

   public void setLado(double lado) {
      this.lado = lado;
   }

   public double CalcularPerimetro() {
      return 4 * lado;
   }

   public double CalcularArea() {
      return Math.pow(lado, 2);
   }

   public Cuadrado(){}

   @Override
   public void Describir() {
      JOptionPane.showMessageDialog(null, " El area de cuadrado es: " + CalcularArea());
      JOptionPane.showMessageDialog(null, " El perimetro de cuadrado es: " + CalcularPerimetro());
   }



}
