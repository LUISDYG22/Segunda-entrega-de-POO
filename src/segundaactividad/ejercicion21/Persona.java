package ejercicion21;

public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    
Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,int anoNacimiento){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    this.anoNacimiento = anoNacimiento;
}

void imprimir(){
    System.out.println("Nombre = "+nombre);
    System.out.println("Apellidos = "+apellidos);
    System.out.println("DNI = "+ numeroDocumentoIdentidad);
    System.out.println("Año de nacimiento = "+anoNacimiento);
    System.out.println();
}

}
