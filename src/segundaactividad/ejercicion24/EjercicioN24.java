/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion24;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class EjercicioN24 {
    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Cuadrado figura2 = new Cuadrado(3);
        Rectangulo figura3 = new Rectangulo(1,2);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("El area del rectangulo es = " + figura3.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura3.calcularPerimetro());
        System.out.println();  
        
        System.out.println("El area del cuadrado es = " + figura2.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura2.calcularPerimetro());
        System.out.println(); 
        
        System.out.println("El area del triangulo rectangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo rectangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo(); 
    }
}
