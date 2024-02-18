// 1-Crear una clase llamada Operacion:

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Métodos get y set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = scanner.nextDouble();
    }

    // Método sumar()
    public double sumar() {
        return numero1 + numero2;
    }

    // Método restar()
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicar()
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: Multiplicación por cero.");
            return 0;
        }
        return numero1 * numero2;
    }

    // Método dividir()
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return numero1 / numero2;
    }
}

//2- Realizar una clase llamada Cuenta (bancaria):

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    // Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés
    public Cuenta() {
        this.numeroCuenta = 0;
        this.dniCliente = 0;
        this.saldoActual = 0;
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta, pidiéndole los datos al usuario
    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        this.numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        this.dniCliente = scanner.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        this.saldoActual = scanner.nextDouble();
    }

    // Método ingresar(double ingreso)
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    // Método retirar(double retiro)
    public void retirar(double retiro) {
        if (saldoActual >= retiro) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    // Método extraccionRapida()
    public void extraccionRapida() {
        double retiro = saldoActual * 0.2; // 20% del saldo actual
        retirar(retiro);
    }

    // Método consultarSaldo()
    public double consultarSaldo() {
        return saldoActual;
    }

    // Método consultarDatos()
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }
}


//3-Crear la interfaz calculosFormas:

public interface CalculosFormas {
    double PI = 3.14159265359; 
    double calcularArea();

    double calcularPerimetro();
}

//Implementación para Círculo:
public class Circulo implements CalculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}


//Implementación para Rectángulo:
public class Rectangulo implements CalculosFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

