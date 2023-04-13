package fibonacci;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingresa numero hasta e cual se generará secuencia Fibonacci
			
		System.out.println("Ingrese un número");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//i es la variable que contará hasta el número ingresado
		int i = 0;
		//
		int siguiente = 1;
		int actual = 0;
		int temporal = 0;
		while (i < n+1){
		i+=1;
		// primero muestra el 0
		System.out.printf("%d\n",actual);
		// en temporal guarda el valor de actual parte con 0
	    temporal = actual;
	    // en actual guarda valor de siguiente que la primera vez viene con 1
	    actual= siguiente;
	    // y en siguiente suma siguiente 1 viene con 1 + temporal
	    siguiente = siguiente + temporal;
		}
		}
	}


