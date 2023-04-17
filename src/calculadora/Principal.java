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
			
			switch (menu) {
			case 1:
				System.out.println("Diga el primer número");
				num1=Leer.datoDouble();
				System.out.println("Diga el segundo número");
				num2=Leer.datoDouble();
				resul=num1+num2;
				System.out.printf("El resultado de la suma es %.2f", resul);
				break;
			case 2:
				System.out.println("Diga el primer número");
				num1=Leer.datoDouble();
				System.out.println("Diga el segundo número");
				num2=Leer.datoDouble();
				resul=num1-num2;
				System.out.printf("El resultado de la resta es %.2f", resul);
				break;
			case 3:
				System.out.println("Diga el primer número");
				num1=Leer.datoDouble();
				System.out.println("Diga el segundo número");
				num2=Leer.datoDouble();
				resul=num1*num2;
				System.out.printf("El resultado de la multiplicación es %.2f", resul);
				break;
			}
		}while(menu!=0);
	}
}
