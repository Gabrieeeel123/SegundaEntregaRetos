package Salud;
import java.util.*;
public class persona{
    Scanner s = new Scanner(System.in);
    public String tipoDoc;
    public int documento;
    public String Nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;
    
    public void pedirdatos() {
        System.out.println("Que tipo de documento tiene");
        tipoDoc = s.nextLine();
        System.out.println("Ingrese su numero de documento");
        documento = s.nextInt();
        System.out.println("Ingrese su nombre");
        Nombre = s.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = s.nextLine();
        System.out.println("Ingrese su peso en kg");
        peso = s.nextDouble();
        System.out.println("Ingrese su altura en metros");
        peso = s.nextDouble();
        System.out.println("Ingrese su edad ");
        edad = s.nextInt();
        System.out.println("Ingrese su sexo");
        sexo = s.nextLine();
    }
    public void mostrarpersona() {
        System.out.println("los datos ingresados fueron:");
        System.out.println(tipoDoc+"\n"+documento+"\n"+Nombre+"\n"+apellido+"\n"+peso+"\n"+estatura+"\n"+edad+"\n"+sexo);
    }
    public void calcularmc() {
        double pesoactual = peso/(estatura*2);
        if(pesoactual < 20) {System.out.println("Esta por debajo del peso actual");}
        else if(pesoactual > 20 && pesoactual < 25) {System.out.println("El peso es ideal");}
        else {System.out.println("TIene sobrepeso");}
    }
    public void mayoredad() {
        if(edad > 18) {
            System.out.println("Es mayor de edad");
        }
        else {System.out.println("Es menor de edad");}
    }
        
    //persona calcular = new persona();
    //calcular.pedirdatos(); 
    //calcular.mostrarpersona();
    //calcular.calcularmc();
    //calcular.mayoredad;
    
}