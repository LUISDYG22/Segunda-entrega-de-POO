package ejercicion23;

public class EjercicioN23 {
    public static void main(String[] args) {
        Automovil autol = new Automovil ("Ford",2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO,5,6,250,
        tipoColor.NEGRO);
        autol.imprimir();
        autol.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + autol.velocidadActual);
        autol.acelerar(20);
        System.out.println("Velocidad actual = " + autol.velocidadActual);
        autol.desacelerar(50);
        System.out.println("Velocidad actual = " + autol.velocidadActual);
        autol.frenar();
        System.out.println("Velocidad actual = " + autol.velocidadActual);
        autol.desacelerar(20);          
    }
}
