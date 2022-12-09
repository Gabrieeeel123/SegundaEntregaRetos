package Salud;

public class ejecucion {
    public static void main(String[] args) {
     persona per = new persona();
     per.pedirdatos();
     per.mostrarpersona();
     per.mayoredad();
     double resultado = per.calcularmc(0);
     if(resultado < 20) {System.out.println("Esta por debajo del peso actual");}
    else if(resultado > 20 && resultado < 25) {System.out.println("El peso es ideal");}
    else {System.out.println("TIene sobrepeso");}

    }
    
}
