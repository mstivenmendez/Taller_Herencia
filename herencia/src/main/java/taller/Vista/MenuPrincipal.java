package taller.Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import taller.Animal.Animal;
import taller.Animal.Gato;
import taller.Animal.Perro;
import taller.Ave.Aguila;
import taller.Ave.Aves;
import taller.Ayuda.Validar;
import taller.Banco.Cuenta;
import taller.Banco.Intereses;
import taller.Dispositivo.Dispositivo;
import taller.Dispositivo.Telefono;
import taller.Empresa.Empleado;
import taller.Forma.Circulo;
import taller.Forma.Figura;
import taller.Forma.Rectangulo;
import taller.Forma.Triangulo;
import taller.Vehiculo.*;
import taller.Persona.Estudiante;

public class MenuPrincipal extends Validar {

   List<Vehiculo> vehiculos = new ArrayList<>();
   List<Estudiante> grado = new ArrayList<>();
   List<Animal> animales = new ArrayList<>();
   List<Empleado> empleados = new ArrayList<>();
   List<Figura> figuras = new ArrayList<>();
   List<Aves> aves = new ArrayList<>();
   List<Dispositivo> dispositivos = new ArrayList<>();
   List<Cuenta> cuentas = new ArrayList<>();

   public void inciar() {

      int opcion;

      do {

         String resultado = VistaMenu();
         opcion = solicitarEntero(resultado, 8);

         if (opcion == 0) {
            break;
         }

         opcionIngreseMenuPrcipal(opcion);

      } while (true);

      JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
   }

   public String VistaMenu() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE MANEJO DE HERENCIA :\n"
                  + "1. Crear Vehiculo \n"
                  + "2. Ingresar los estudiantes\n"
                  + "3. Comportamiento de los animales\n"
                  + "4. Saber salario y Departamento que trabaja un empleado\n"
                  + "5. Area y perimetro de unas figuras\n"
                  + "6. Aves\n"
                  + "7. Crear Dispositivo\n"
                  + "8. Crear Cuenta Bancario\n"
                  + "0. Salir\n");
      return ingreso;
   }

   private void opcionIngreseMenuPrcipal(int valor) {
      switch (valor) {
         case 1:
            String opcionVehiculo = VistaVehiculo();
            int resultadoVehiculo = solicitarEntero(opcionVehiculo, 4);
            opcionIngreseVehiculo(resultadoVehiculo);
            break;
         case 2:
            String opcionEstudiante = VistaEstudiante();
            int resultadoEstudiante = solicitarEntero(opcionEstudiante, 2);
            opcionIngreseEstudiante(resultadoEstudiante);
            break;
         case 3:
            String opcionAnimal = VistaAnimal();
            int resultadoAnimal = solicitarEntero(opcionAnimal, 3);
            opcionIngreseAnimal(resultadoAnimal);
            break;
         case 4:
            String opcionEmpleado = VistaEmpleado();
            int resultadoEmpleado = solicitarEntero(opcionEmpleado, 3);
            opcionIngreseEmpleado(resultadoEmpleado);
            break;
         case 5:
            String opcionFigura = VistaFigura();
            int resultadoFigura = solicitarEntero(opcionFigura, 4);
            opcionIngreseFigura(resultadoFigura);
            break;
         case 6:
            String opcionAve = VistaAve();
            int resultadoAve = solicitarEntero(opcionAve, 2);
            opcionIngreseAve(resultadoAve);
            break;
         case 7:
            String opcionDispositivo = VistaDispositivo();
            int resultadoDispositivo = solicitarEntero(opcionDispositivo, 2);
            opcionIngreseDispositivo(resultadoDispositivo);
            break;
         case 8:
            String opcionCuenta = VistaCuenta();
            int resultadoCuenta = solicitarEntero(opcionCuenta, 5);
            opcionIngreseCuenta(resultadoCuenta);
            break;
         case 9:
            mostrarDescripcionVehiculos();
            break;
         case 10:
            mostrarLista("LISTA DE ANIMALES:", animales);
            break;
         case 0:
            break;
         default:
            break;
      }
   }

   // ==================== VEHICULOS ====================
   public String VistaVehiculo() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE VEHICULOS :\n"
                  + "1. Crear Carro \n"
                  + "2. Crear Bicicleta\n"
                  + "3. Crear Camion\n"
                  + "4. Ver vehiculos\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseVehiculo(int valor) {

      int opcionVehiculo = -1;

      while (opcionVehiculo != 0) {

         opcionVehiculo = solicitarEntero(VistaVehiculo(), 4);

         switch (opcionVehiculo) {
            case 1:
               crearVehiculoCarro(vehiculos, new Carro());
               break;
            case 2:
               crearVehiculoBicicleta(vehiculos, new Bicicleta());
               break;
            case 3:
               crearVehiculoCarro(vehiculos, new Camion());
               break;
            case 4:
               mostrarLista("VEHICULOS:", vehiculos);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Vehiculo> void crearVehiculoCarro(List<T> lista, T objeto) {

      String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
      String color = JOptionPane.showInputDialog("Ingrese el color del vehiculo: ");
      String cilindraje = JOptionPane.showInputDialog("Ingrese el cilindraje del vehiculo: ");
      String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
      String peso = JOptionPane.showInputDialog("Ingrese el peso del vehiculo: ");

      double cilindrajeResultado = solicitarDouble(cilindraje, 5000);
      double pesoResultado = solicitarDouble(peso, 10000);

      objeto.setMarca(marca);
      objeto.setColor(color);
      objeto.setCilindraje(cilindrajeResultado);
      objeto.setPlaca(placa);
      objeto.setPeso(pesoResultado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Vehiculo agregado correctamente:\n");
   }

   public <T extends Vehiculo> void crearVehiculoBicicleta(List<T> lista, T objeto) {

      String marca = JOptionPane.showInputDialog("Ingrese la marca de la bicicleta: ");
      String color = JOptionPane.showInputDialog("Ingrese el color de la bicicleta: ");
      String peso = JOptionPane.showInputDialog("Ingrese el peso de la bicicleta: ");

      double pesoResultado = solicitarDouble(peso, 10000);

      objeto.setMarca(marca);
      objeto.setColor(color);
      objeto.setPeso(pesoResultado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Vehiculo agregado correctamente:\n");
   }

   private void mostrarDescripcionVehiculos() {
      if (vehiculos.isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay vehiculos registrados.");
         return;
      }

      StringBuilder sb = new StringBuilder("DESCRIPCIÓN DE VEHICULOS:\n\n");
      for (Vehiculo v : vehiculos) {
         sb.append(v.toString()).append("\n\n");
      }
      JOptionPane.showMessageDialog(null, sb.toString());
   }

   // ==================== ESTUDIANTES ====================
   public String VistaEstudiante() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE ESTUDIANTES :\n"
                  + "1. Crear Estudiante\n"
                  + "2. Ver estudiantes\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseEstudiante(int valor) {

      int opcionEstudiante = -1;

      while (opcionEstudiante != 0) {

         opcionEstudiante = solicitarEntero(VistaEstudiante(), 2);

         switch (opcionEstudiante) {
            case 1:
               crearEstudiante(grado, new Estudiante());
               break;
            case 2:
               mostrarLista("ESTUDIANTES:", grado);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Estudiante> void crearEstudiante(List<T> lista, T objeto) {

      String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
      String edad = JOptionPane.showInputDialog("Ingrese la edad del estudiante: ");
      String grado = JOptionPane.showInputDialog("Ingrese el grado ");

      int edadResultado = solicitarEntero(edad, 100);

      objeto.setNombre(nombre);
      objeto.setEdad(edadResultado);
      objeto.setGrado(grado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente:\n");
   }

   // ==================== ANIMALES ====================
   public String VistaAnimal() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE ANIMALES :\n"
                  + "1. Crear Perro \n"
                  + "2. Crear Gato\n"
                  + "3. Ver Lista\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseAnimal(int valor) {

      int opcionAnimal = -1;

      while (opcionAnimal != 0) {

         opcionAnimal = solicitarEntero(VistaAnimal(), 3);

         switch (opcionAnimal) {
            case 1:
               crearAnimal(animales, new Perro());
               break;
            case 2:
               crearAnimal(animales, new Gato());
               break;
            case 3:
               mostrarLista("ANIMALES", animales);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Animal> void crearAnimal(List<T> lista, T objeto) {

      String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal: ");
      String raza = JOptionPane.showInputDialog("Ingrese la raza del animal: ");
      String color = JOptionPane.showInputDialog("Ingrese el color del animal: ");

      objeto.setNombre(nombre);
      objeto.setRaza(raza);
      objeto.setColor(color);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Animal agregado correctamente:\n");
   }

   // ==================== EMPLEADOS ====================
   public String VistaEmpleado() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE EMPLEADOS :\n"
                  + "1. Crear Empleado\n"
                  + "2. Ver empleados\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseEmpleado(int valor) {

      int opcionEmpleado = -1;

      while (opcionEmpleado != 0) {

         opcionEmpleado = solicitarEntero(VistaEmpleado(), 2);

         switch (opcionEmpleado) {
            case 1:
               crearEmpleado(empleados, new Empleado());
               break;
            case 2:
               mostrarLista("EMPLEADOS", empleados);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Empleado> void crearEmpleado(List<T> lista, T objeto) {

      String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
      String edad = JOptionPane.showInputDialog("Ingrese la edad del empleado: ");
      String salario = JOptionPane.showInputDialog("Ingrese el salario: ");

      double salarioResultado = solicitarDouble(salario, 100000000);
      int edadResultado = solicitarEntero(edad, 100);

      objeto.setNombre(nombre);
      objeto.setEdad(edadResultado);
      objeto.setSalario(salarioResultado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Empleado agregado correctamente:\n");
   }

   // ==================== FIGURAS ====================
   public String VistaFigura() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE FIGURAS GEOMÉTRICAS :\n"
                  + "1. Crear Círculo \n"
                  + "2. Crear Rectángulo\n"
                  + "3. Crear Triángulo\n"
                  + "4. Ver figuras \n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseFigura(int valor) {

      int opcionFigura = -1;

      while (opcionFigura != 0) {

         opcionFigura = solicitarEntero(VistaFigura(), 4);

         switch (opcionFigura) {
            case 1:
               crearCirculo(figuras);
               break;
            case 2:
               crearRectangulo(figuras);
               break;
            case 3:
               crearTriangulo(figuras);
               break;
            case 4:
               mostrarLista("FIGURAS", figuras);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   private void crearCirculo(List<Figura> lista) {
      String radio = JOptionPane.showInputDialog("Ingrese el radio del círculo: ");
      double radioResultado = solicitarDouble(radio, 10000);

      Circulo circulo = new Circulo();
      circulo.setRadio(radioResultado);
      lista.add(circulo);

      circulo.CalcularArea();
      circulo.CalcularPerimetro();
      circulo.Describir();

      JOptionPane.showMessageDialog(null, "Círculo agregado correctamente:\n");
   }

   private void crearRectangulo(List<Figura> lista) {
      String base = JOptionPane.showInputDialog("Ingrese la base del rectángulo: ");
      String altura = JOptionPane.showInputDialog("Ingrese la altura del rectángulo: ");

      double baseResultado = solicitarDouble(base, 10000);
      double alturaResultado = solicitarDouble(altura, 10000);

      Rectangulo rectangulo = new Rectangulo();
      rectangulo.setBase(baseResultado);
      rectangulo.setAltura(alturaResultado);
      lista.add(rectangulo);

      rectangulo.CalcularArea();
      rectangulo.CalcularPerimetro();
      rectangulo.Describir();

      JOptionPane.showMessageDialog(null, "Rectángulo agregado correctamente:\n");
   }

   private void crearTriangulo(List<Figura> lista) {
      String base = JOptionPane.showInputDialog("Ingrese la base del triángulo: ");
      String altura = JOptionPane.showInputDialog("Ingrese la altura del triángulo: ");
      String lado1 = JOptionPane.showInputDialog("Ingrese la lado1 del triángulo: ");
      String lado2 = JOptionPane.showInputDialog("Ingrese la lado2 del triángulo: ");
      String lado3 = JOptionPane.showInputDialog("Ingrese la lado3 del triángulo: ");


      double baseResultado = solicitarDouble(base, 10000);
      double alturaResultado = solicitarDouble(altura, 10000);
      double lado1r = solicitarDouble(lado1, 10000);
      double lado2r = solicitarDouble(lado2, 10000);
      double lado3r = solicitarDouble(lado3, 10000);

      Triangulo triangulo = new Triangulo();
      triangulo.setBase(baseResultado);
      triangulo.setAltura(alturaResultado);
      triangulo.setLado1(lado1r);
      triangulo.setLado2(lado2r);
      triangulo.setLado3(lado3r);

      lista.add(triangulo);

      triangulo.CalcularArea();
      triangulo.CalcularPerimetro();
      triangulo.Describir();

      JOptionPane.showMessageDialog(null, "Triángulo agregado correctamente:\n");
   }

   // ==================== AVES ====================
   public String VistaAve() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE AVES :\n"
                  + "1. Crear Águila \n"
                  + "2. Ver aves\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseAve(int valor) {

      int opcionAve = -1;

      while (opcionAve != 0) {

         opcionAve = solicitarEntero(VistaAve(), 2);

         switch (opcionAve) {
            case 1:
               crearAve(aves, new Aguila());
               break;
            case 2:
               mostrarLista("AVES:", aves);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Aves> void crearAve(List<T> lista, T objeto) {

      String nombre = JOptionPane.showInputDialog("Ingrese el nombre del ave: ");
      String especie = JOptionPane.showInputDialog("Ingrese la especie : ");
      String color = JOptionPane.showInputDialog("Ingrese el color de la especie:  " + especie);
      String peso = JOptionPane.showInputDialog("Ingrese el peso de la ave ");

      int pesoResultado = solicitarEntero(peso, 1000);

      objeto.setNombre(nombre);
      objeto.setEspecie(especie);
      objeto.setColor(color);
      objeto.setPeso(pesoResultado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Ave agregada correctamente:\n");
   }

   // ==================== DISPOSITIVOS ====================
   public String VistaDispositivo() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA DE DISPOSITIVOS :\n"
                  + "1. Crear Teléfono \n"
                  + "2. Ver dispositivos\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseDispositivo(int valor) {

      int opcionDispositivo = -1;

      while (opcionDispositivo != 0) {

         opcionDispositivo = solicitarEntero(VistaDispositivo(), 2);

         switch (opcionDispositivo) {
            case 1:
               crearDispositivo(dispositivos, new Telefono());
               break;
            case 2:
               mostrarLista("DISPOSITIVOS:", dispositivos);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
               return;
         }
      }
   }

   public <T extends Dispositivo> void crearDispositivo(List<T> lista, T objeto) {

      String marca = JOptionPane.showInputDialog("Ingrese la marca del dispositivo: ");
      String modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
      String sistemaOperativo = JOptionPane.showInputDialog("Ingrese el sistema operativo: ");
      String almacenamiento = JOptionPane.showInputDialog("Ingrese el almacenamiento: ");
      String ram = JOptionPane.showInputDialog("Ingrese la RAM: ");

      int almacenamientoResultado = solicitarEntero(almacenamiento, 1200);
      int ramResultado = solicitarEntero(ram, 200);

      objeto.setMarca(marca);
      objeto.setModelo(modelo);
      objeto.setSistemaOperativo(sistemaOperativo);
      objeto.setAlmacenamiento(almacenamientoResultado);
      objeto.setRam(ramResultado);

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente:\n");
   }

   // ==================== CUENTAS BANCARIAS ====================
   public String VistaCuenta() {
      String ingreso = JOptionPane.showInputDialog(null,
            "SISTEMA BANCARIO\n"
                  + "1. Crear cuenta\n"
                  + "2. Depositar\n"
                  + "3. Retirar\n"
                  + "4. Agregar intereses\n"
                  + "5. Ver cuentas\n"
                  + "0. Salir\n");
      return ingreso;
   }

   public void opcionIngreseCuenta(int valor) {

      int opcionCuenta = -1;

      while (opcionCuenta != 0) {

         opcionCuenta = solicitarEntero(VistaCuenta(), 5);

         switch (opcionCuenta) {
            case 1:
                  crearCuenta(cuentas, new Intereses(0, "", 0.0));
               break;
            case 2:
               depositar(cuentas);
               break;
            case 3:
               retirar(cuentas);
               break;
            case 4:
               agregarIntereses(cuentas);
               break;
            case 5:
               mostrarLista("CUENTAS", cuentas);
               break;
            case 0:
               JOptionPane.showMessageDialog(null, "Saliendo...");
               return;
         }
      }
   }

   public <T extends Cuenta> void crearCuenta(List<T> lista, T objeto) {

      String saldoTexto = JOptionPane.showInputDialog("Ingrese el saldo inicial:");
      double saldo = solicitarDouble(saldoTexto, 1000000000);
      objeto.setSaldo(saldo);

      String clave = JOptionPane.showInputDialog("Cree una clave para esta cuenta:");
      objeto.setClave(clave);

      if (objeto instanceof Intereses) {
         String interesTxt = JOptionPane.showInputDialog("Ingrese el interés (ej: 0.05 = 5%):");
         double interes = solicitarDouble(interesTxt, 1);
         ((Intereses) objeto).setIntereses(interes);
      }

      lista.add(objeto);

      JOptionPane.showMessageDialog(null, "Cuenta creada correctamente:\n");
   }

   public <T extends Cuenta> T seleccionarCuenta(List<T> lista) {
      if (lista.isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay cuentas registradas.");
         return null;
      }

      String menu = "Seleccione una cuenta:\n";
      for (int i = 0; i < lista.size(); i++) {
         menu += (i + 1) + ". Cuenta " + (i + 1) + " (Saldo: " + lista.get(i).getSaldo() + ")\n";
      }

      int indice = solicitarEntero(menu, lista.size()) - 1;
      T seleccionada = lista.get(indice);

      String claveIngresada = JOptionPane.showInputDialog("Ingrese la clave de la cuenta:");
      if (!claveIngresada.equals(seleccionada.getClave())) {
         JOptionPane.showMessageDialog(null, "Clave incorrecta");
         return null;
      }

      return seleccionada;
   }

   public <T extends Cuenta> void depositar(List<T> lista) {
      T cuenta = seleccionarCuenta(lista);
      if (cuenta == null)
         return;

      String valorTxt = JOptionPane.showInputDialog("Ingrese el valor a depositar:");
      double valor = solicitarDouble(valorTxt, 100000000);

      cuenta.Deposito(valor);

      JOptionPane.showMessageDialog(null, "Depósito realizado. Nuevo saldo: " + cuenta.getSaldo());
   }

   public <T extends Cuenta> void retirar(List<T> lista) {
      T cuenta = seleccionarCuenta(lista);
      if (cuenta == null)
         return;

      String valorTxt = JOptionPane.showInputDialog("Ingrese el valor a retirar:");
      double valor = solicitarDouble(valorTxt, 100000000);

      cuenta.Retiro(valor);

      JOptionPane.showMessageDialog(null, "Retiro realizado. Nuevo saldo: " + cuenta.getSaldo());
   }

   public <T extends Cuenta> void agregarIntereses(List<T> lista) {
      T cuenta = seleccionarCuenta(lista);
      if (cuenta == null)
         return;

      if (cuenta instanceof Intereses) {
         ((Intereses) cuenta).agregarIntereses();
         JOptionPane.showMessageDialog(null, "Intereses aplicados. Nuevo saldo: " + cuenta.getSaldo());
      } else {
         JOptionPane.showMessageDialog(null, "Esta cuenta no genera intereses.");
      }
   }

   public static <T> void mostrarLista(String titulo, List<T> lista) {

      StringBuilder sb = new StringBuilder(titulo + "\n\n");

      if (lista == null || lista.isEmpty()) {
         sb.append("La lista está vacía.");
         JOptionPane.showMessageDialog(null, sb.toString());
         return;
      }

      for (int i = 0; i < lista.size(); i++) {

         T objeto = lista.get(i);
         Class<?> clase = objeto.getClass();

         sb.append("===== OBJETO EN POSICIÓN ").append(i).append(" =====\n");
         sb.append("Clase: ").append(clase.getSimpleName()).append("\n");

         var campos = clase.getDeclaredFields();

         for (var campo : campos) {
            campo.setAccessible(true);
            try {
               Object valor = campo.get(objeto);
               sb.append(campo.getName()).append(": ").append(valor).append("\n");
            } catch (Exception e) {
               sb.append(campo.getName()).append(": <error al leer>\n");
            }
         }

         sb.append("\n");
      }

      JOptionPane.showMessageDialog(null, sb.toString());
   }

}
