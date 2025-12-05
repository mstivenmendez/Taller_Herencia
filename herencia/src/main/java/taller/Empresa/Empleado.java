package taller.Empresa;

import taller.Persona.Persona;

public class Empleado extends Persona{

   private double salario;

   public Empleado(String nombre, int edad, double salario) {
      super(nombre, edad);
      this.salario = salario;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public Empleado(){}





}
