/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion24;

/**
 *
 * @author Luis Daniel Yepez G
 */
public class Rectangulo {
    int base;
    int altura;
    
    Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    
    double calcularArea(){
        return base*altura;
    }
    
    double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
