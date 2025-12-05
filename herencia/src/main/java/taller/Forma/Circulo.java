package taller.Forma;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;

public class Circulo extends Figura implements IArea, IPerimetro, IDescribir{

   public double radio;

   public Circulo(String nombre, double radio) {
      super(nombre);
      this.radio = radio;
   }

   public double getRadio() {
      return radio;
   }

   public void setRadio(double radio) {
      this.radio = radio;
   }

    public Circulo (){}

   @Override
   public double CalcularArea() {
      return Math.PI * Math.pow(radio, 2);
   }

   @Override
   public double CalcularPerimetro() {
      return 2 * Math.PI * radio;
   }

   @Override
   public void Describir() {
      JOptionPane.showMessageDialog(null, " El perimetro  del circulo es :" + CalcularPerimetro());
      JOptionPane.showMessageDialog(null, " El area del circulo es :" + CalcularArea());
   }



}
