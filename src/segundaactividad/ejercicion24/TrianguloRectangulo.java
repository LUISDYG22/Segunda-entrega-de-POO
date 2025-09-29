/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion24;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    
    TrianguloRectangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
    }
    
    double calcularArea (){
        return (altura * base)/2;
    }
    
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura,0.5);
    }
    
    double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    void determinarTipoTriangulo(){
        if ((base == altura )&& (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero");
        
        else if ((base != altura )&& (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno");
        
        else
            System.out.println("Es un triangulo isoceles");
    }
    
}
