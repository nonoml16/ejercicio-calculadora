package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int menu;
		double num1, num2, resul;
		
		System.out.println("Bienvenido a la Calculadora");
		do {
			System.out.println("\n===================");
			System.out.println("Elija una operacion");
			System.out.println("===================");
			System.out.println(" SUMAR         (+)");
			System.out.println(" RESTAR        (-)");
			System.out.println(" MULTIPLICAR   (*)");
			System.out.println(" DIVIDIR       (/)");
			System.out.println(" RESTO         (%)");
			System.out.println("===================");
			menu = Leer.datoInt();
			
		}while(menu!=0);
	}
}
