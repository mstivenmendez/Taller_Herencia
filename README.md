# 📘 Proyecto: Taller de Herencia y Programación Orientada a Objetos en Java

## 📌 Descripción General

Este proyecto tiene como objetivo aplicar los conceptos fundamentales de la Programación Orientada a Objetos (POO) en Java, incluyendo:

- ✔️ Herencia
- ✔️ Polimorfismo
- ✔️ Interfaces
- ✔️ Clases abstractas
- ✔️ Encapsulamiento
- ✔️ Colecciones (ArrayList)
- ✔️ Arreglos (Arrays)
- ✔️ Manejo de excepciones (try – catch)
- ✔️ Uso de JOptionPane para interacción con el usuario

La estructura del proyecto está dividida por paquetes que representan distintos módulos o ejercicios prácticos relacionados con herencia y POO.

Además, se incluye una carpeta llamada **vista**, donde se manejará el menú principal del sistema usando JOptionPane.

---

## 📂 Estructura del Proyecto

La organización general del proyecto es:

```
TALLER_HERENCIA/
│
├── src/
│   └── main/
│       └── java/
│           └── taller/
│               ├── Animal/
│               │   ├── Animal.java
│               │   ├── Gato.java
│               │   ├── Perro.java
│               │
│               ├── Ave/
│               │   ├── Ave.java
│               │   ├── Aguila.java
│               │
│               ├── Ayuda/
│               │   ├── IDescribir.java
│               │   ├── ISonido.java
│               │   ├── Vista.java
│               │
│               ├── Banco/
│               │   ├── Cuenta.java
│               │   ├── Intereses.java
│               │
│               ├── Dispositivo/
│               │   ├── Dispositivo.java
│               │   ├── Telefono.java
│               │
│               ├── Empresa/
│               │   ├── Empleado.java
│               │   ├── Gerente.java
│               │
│               ├── Forma/
│               │   ├── Figura.java
│               │   ├── Circulo.java
│               │   ├── Cuadrado.java
│               │   ├── Rectangulo.java
│               │   ├── Triangulo.java
│               │   ├── IArea.java
│               │   ├── IPerimetro.java
│               │
│               ├── Persona/
│               │   ├── Persona.java
│               │   ├── Estudiante.java
│               │
│               ├── Vehiculo/
│               │   ├── Vehiculo.java
│               │   ├── Carro.java
│               │   ├── Camion.java
│               │   ├── Bicicleta.java
│               │
│               ├── vista/
│               │   ├── MenuPrincipal.java
│               │
│               ├── Main.java
│
├── resources/
├── test/
├── pom.xml
```

---

## 🧩 Conceptos Aplicados

### 🔹 1. Clases abstractas

Se usan para definir comportamientos generales que deben ser implementados por las subclases.

**Ejemplo:** `Animal.java`, `Figura.java`, `Dispositivo.java`

### 🔹 2. Interfaces

Se emplean para garantizar métodos obligatorios.

**Ejemplo:** `IArea`, `IPerimetro`, `ISonido`, `IDescribir`

### 🔹 3. Herencia

Cada paquete contiene clases padre y clases hijas que extienden comportamientos.

**Ejemplo:**
- `Animal` → `Perro`, `Gato`
- `Vehiculo` → `Carro`, `Camion`, `Bicicleta`
- `Figura` → `Rectangulo`, `Circulo`, `Triangulo`

### 🔹 4. Colecciones y Arreglos

Se usan para almacenar objetos de diferentes clases mediante:
- `ArrayList<>`
- `Arrays[]`

### 🔹 5. Manejo de Excepciones

Bloques `try – catch` aplicados para controlar errores, especialmente en interacción con el usuario mediante JOptionPane.

---

## 🖼️ Interfaz (vista)

La carpeta **vista** contiene el menú principal:

### 📁 vista/MenuPrincipal.java

Este archivo debe contener un menú como:

```java
JOptionPane.showInputDialog(
    "===== MENÚ PRINCIPAL =====\n" +
    "1. Gestión de Animales\n" +
    "2. Gestión de Vehículos\n" +
    "3. Figuras Geométricas\n" +
    "4. Empresa (Empleados/Gerentes)\n" +
    "5. Dispositivos\n" +
    "6. Banco\n" +
    "0. Salir"
);
```

Este menú redirige a las clases de cada paquete mediante llamadas al controlador o directamente a métodos específicos.

---

## ▶️ Ejecución del Proyecto

El punto de entrada está en:

```
src/main/java/taller/Main.java
```

Este archivo debe llamar a la clase MenuPrincipal:

```java
public class Main {
    public static void main(String[] args) {
        MenuPrincipal.mostrar();
    }
}
```

---

## 🧪 Pruebas y Verificación

El proyecto incluye:
- Métodos de impresión por medio de JOptionPane
- Validaciones mediante try/catch
- Casos de uso de cada clase del proyecto

---

## ✔️ Objetivos del Taller

1. Implementar correctamente los conceptos de POO
2. Entender y aplicar interfaces y clases abstractas
3. Organizar código mediante paquetes
4. Usar colecciones para manejar listas de objetos
5. Aplicar buenas prácticas de manejo de excepciones
6. Utilizar una interfaz basada en JOptionPane para todas las interacciones
7. Integrar un menú gráfico en la carpeta vista
