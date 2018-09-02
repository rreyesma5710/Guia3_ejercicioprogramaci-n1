package paquete;
import java.util.Scanner;
import paquete.Pendulo;
import java.util.ArrayList;

public class Main {

	private static Scanner in  = new Scanner (System.in);
	
	public static void main(String[] args) {
		ArrayList <Pendulo> pendulos = new ArrayList<Pendulo>();
		crearPendulo(pendulos);	
		mostrarObjeto(pendulos);
	}
	
	public static void crearPendulo(ArrayList<Pendulo> pendulos)
	{
        Double l,g;
        g = 9.8;
        System.out.println("Digita longitud del pendulo: ");
        l = in.nextDouble();
        Pendulo p = new Pendulo(l,g,0);
        p.calcularPeriodo(l, g);
        
        pendulos.add(p);
        
	}
	
	public static void mostrarObjeto(ArrayList<Pendulo> pendulos)
	{
		String mensaje;
        for(Pendulo p : pendulos){
            mensaje = p.toString();
            System.out.println(mensaje); 
            System.out.println("*********************");           
         }  
	}

}