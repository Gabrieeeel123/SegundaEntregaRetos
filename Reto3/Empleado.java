import java.util.Scanner;
public class Empleado extends Persona{
    Scanner s = new Scanner(System.in);
    private String cargo;
    private double valorhora;
    public Empleado(){}
    public Empleado(String tipoDoc,int documento,String Nombre,String apellido,double peso,double estatura,int edad,String sexo, String cargo,double valorhora,int horastrabajadas,String departamento){
    super( tipoDoc, documento, Nombre, apellido, peso, estatura, edad, sexo);
    this.cargo = cargo;
    this.valorhora = valorhora;
    this.horastrabajadas = horastrabajadas;
    this.departameto = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public String getDepartameto() {
        return departameto;
    }
    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }
    private int horastrabajadas;
    private String departameto;
    public void calcularHonorarios(){
        System.out.println("Ingrese el valor por hora de su empresa: ");
        valorhora = s.nextDouble();
        System.out.println("Ingrese las horas trabajadas: ");
        horastrabajadas = s.nextInt();
        double valortotal = valorhora * horastrabajadas;
        double reteica = valortotal - ((valortotal * 0.966)/100);
        System.out.println("------------------------------------");
        System.out.println("El tipo de documento es: "+getTipoDoc()+"\nEl numero de documento: "+getDocumento()+"" );
        System.out.println("El nombre es: "+getNombre()+"\nEl apellido es: "+getApellido()+"");
        System.out.println("Las horas trabajadas fueron: "+getHorastrabajadas()+"\nEl valor por hroa: "+getValorhora()+" y el total a pagar es: "+reteica+"");
    }
}
