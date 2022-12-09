import java.util.Scanner;
public class Persona{
    Scanner s = new Scanner(System.in);
    private String tipoDoc;
    private int documento;
    private String Nombre;
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
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
        Nombre = s.next();
        System.out.println("Ingrese su apellido");
        apellido = s.next();
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
public Persona(){}
public Persona(String tipoDoc,int documento,String Nombre,String apellido,double peso,double estatura,int edad,String sexo){
this.tipoDoc = tipoDoc;
this.documento = documento;
this.Nombre = Nombre;
this.apellido = apellido;
this.peso = peso;
this.estatura = estatura;
this.edad = edad;
this.sexo = sexo;
}   
}
