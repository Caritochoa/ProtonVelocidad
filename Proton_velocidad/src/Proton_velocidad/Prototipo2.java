package Proton_velocidad;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Prototipo2 {
	
	
	static double velocidad;
	static double potencia_q =  Math.pow(10, -19);
	static double potencia_m = 	Math.pow(10, -27);
	static double q = 1.6 * potencia_q;
	static double masa = 1.5 * potencia_m;
	static double vel_angular;
	static double frecuencia;
	
	
	
	
	static double b = Double.parseDouble(JOptionPane.showInputDialog("Digita el valor del campo magnético en Teslas"));
	static double r = Double.parseDouble(JOptionPane.showInputDialog("Digita el valor del radio en m "));
	
	
	
	
	 public static void calcular_velocidad() {
		 
		 velocidad = (q * b * r)/masa;
		 
		 JOptionPane.showMessageDialog(null, "La velocidad del protón es" + " " + velocidad + " m/s ");
		 		 
		
	}
	 
	 public static void calcular_velocidad_angular() {
		 
		 vel_angular = velocidad / r;
		 
		 JOptionPane.showMessageDialog(null, "La velocidad angular  es" + " " + vel_angular + " "+ "s" );
		 
		 
	 }
	 
	 public static void calcular_frecuencia() {
		 
		 frecuencia = vel_angular / 2 * Math.PI;
		 JOptionPane.showMessageDialog(null, "La frecuencia   es" + " " + frecuencia + " "+ "rps" );
		 
	 }
	
	public static void main(String[] args) {
		
		
		
		calcular_velocidad();
		calcular_velocidad_angular();
		calcular_frecuencia();
	
		
		
		
		

}
}

