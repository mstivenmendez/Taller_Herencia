package taller.Forma;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;

public class Rectangulo extends Figura implements IArea, IPerimetro, IDescribir{

   public double base, altura;

   public Rectangulo(String nombre, double base, double altura) {
      super(nombre);
      this.base = base;
      this.altura = altura;
   }

   public double getBase() {
      return base;
   }

   public void setBase(double largo) {
      this.base = largo;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double ancho) {
      this.altura = ancho;
   }

   public double CalcularPerimetro() {
      return 2 * (base + altura);
   }

   public double CalcularArea() {
      return base * altura ;
   }

   @Override
   public void Describir() {
      JOptionPane.showMessageDialog(null, " El area de rectangulo es: " + CalcularArea());
      JOptionPane.showMessageDialog(null, " El perimetro de rectangulo es: " + CalcularPerimetro());
   }

}
