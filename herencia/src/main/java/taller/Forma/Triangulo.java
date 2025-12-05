package taller.Forma;

import javax.swing.JOptionPane;

import taller.Ayuda.IDescribir;

public class Triangulo extends Figura implements IArea, IPerimetro, IDescribir {

   public double lado1, lado2, lado3, base, altura;



   public Triangulo(String nombre, double lado1, double lado2, double lado3, double base, double altura) {
      super(nombre);
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
      this.base = base;
      this.altura = altura;
   }

   public double getLado1() {
      return lado1;
   }

   public void setLado1(double lado1) {
      this.lado1 = lado1;
   }

   public double getLado2() {
      return lado2;
   }

   public void setLado2(double lado2) {
      this.lado2 = lado2;
   }

   public double getLado3() {
      return lado3;
   }

   public void setLado3(double lado3) {
      this.lado3 = lado3;
   }

   public double getBase() {
      return base;
   }

   public void setBase(double base) {
      this.base = base;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public double CalcularPerimetro() {
      return lado1 + lado2 + lado3;
   }

   public double CalcularArea() {
      return (base * altura)/ 2;
   }

   public Triangulo(){}

   @Override
   public void Describir() {
      JOptionPane.showMessageDialog(null, " El area de triangulo es: " + CalcularArea());
      JOptionPane.showMessageDialog(null, " El perimetro de triangulo es: " + CalcularPerimetro());
   }
}
