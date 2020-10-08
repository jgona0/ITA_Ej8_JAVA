package com.cohets.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cohets.cohet.*;

public class MainApp {

	// creamos un repositorio de cohetes estático
	static CohetRepository cohets = new CohetRepository();
	
	public static void main(String[] args) {

		//Creamos "los propulsores" y les asignamos sus potencias
		List<Integer> props1 = new ArrayList <Integer>();
		List<Integer> props2 = new ArrayList <Integer>();
		
		props1.add(5);
		props1.add(7);
		props1.add(8);
		
		props2.add(3);
		props2.add(5);
		props2.add(7);
		props2.add(8);
		props2.add(9);
		props2.add(10);
		
		//Creamos los cohetes con sus propulsores(sus potencias) y los añadimos a la lista (repositorio) de cohetes
		Cohet c1 = new Cohet("A", props1);
		Cohet c2 = new Cohet("B", props2);
		
		cohets.addCohet(c1);
		cohets.addCohet(c2);
		
		
		//Imprimimos los cohetes disponibles
		System.out.println("--- FASE 3 ---");
		System.out.println("Estos son los cohetes disponibles:");
		System.out.println("Cohet:" +c1.getId()+ ", \t Num props:" +c1.getNumProps() +", \t Potencias_max: " +c1.getAllPotencias() +" \t\t  Potencias_actuales: " +c1.getAllPotenciasActs());
		System.out.println("Cohet:" +c2.getId()+ ", \t Num props:" +c2.getNumProps() +", \t Potencias_max: " +c2.getAllPotencias() +" \t Potencias_actuales: " +c2.getAllPotenciasActs());
		
		
		Scanner action_input = new Scanner(System.in);
		int accion=0;
		
		// Menú del porgrama
		while(true) {
			
			
			System.out.println("Que quieres hacer (elige la opción con su número): \n 1 - Acelerar un propulsor de un cohete \n 2 - Frenar un propulsor de un cohete \n 3 - Obtener información acutal \n 4 - Salir");
			accion = action_input.nextInt();

			switch (accion){

			// Caso 1 aceleramos un propulsor de un cohete
			case 1:
				
				Scanner user_input = new Scanner(System.in);
				System.out.println("Qué cohete quieres acelerar");
				String input_cohet = user_input.nextLine();
				
				System.out.println("Qué propulsor quieres acelerar. Elige el número del propulsor (1, 2, 3...)");
				int input_prop = user_input.nextInt();
				
				// creamos el objeto MueveCohetes que implementa el método run() para ejecutar el hilo de un cohete y un propulsor, con parametro 'A' para acelerar
				// llamamos al constructor con el input_pop-1 porque la lista empieza con index=0 en lugar de index=1
				try {
				
					MueveCohetes r = new MueveCohetes (cohets.getCohet(input_cohet), input_prop-1, 'A');
					Thread t = new Thread (r, "-c:"+input_cohet+" -p:"+(input_prop-1));
					t.start();
				
				
				} catch (Exception e) {
					System.out.println("ERROR --> El cohete no existe, elige uno que exista");
				}
				
				break;
				
				
			// Caso 2 frenamos un propulsor de un cohete
			case 2:
				
				Scanner user_input2 = new Scanner(System.in);
				System.out.println("Qué cohete quieres frenar");
				String input_cohet2 = user_input2.nextLine();
				
				System.out.println("Qué propulsor quieres frenar. Elige el número del propulsor (1, 2, 3...)");
				int input_prop2 = user_input2.nextInt();	
				
				// creamos el objeto MueveCohetes que implementa el método run() para ejecutar el hilo de un cohete y un propulsor, con parametro 'F' para frenar
				// llamamos al constructor con el input_pop-1 porque la lista empieza con index=0 en lugar de index=1				
				try {
					
					MueveCohetes r = new MueveCohetes (cohets.getCohet(input_cohet2), input_prop2-1, 'F');
					Thread t = new Thread (r, "-c:"+input_cohet2+" -p:"+(input_prop2-1));
					t.start();
				
				
				} catch (Exception e) {
					System.out.println("ERROR --> El cohete no existe, elige uno que exista");
				}
				
				
				break;
			
			// Caso 3, obtenemos la información de estado de los propulsores de los cohetes
			case 3:
				System.out.println("Esta es la situación actual:");
				System.out.println("Cohet:" +c1.getId()+ ", \t Num props:" +c1.getNumProps() +", \t Potencias_max: " +c1.getAllPotencias() +" \t\t  Potencias_actuales: " +c1.getAllPotenciasActs());
				System.out.println("Cohet:" +c2.getId()+ ", \t Num props:" +c2.getNumProps() +", \t Potencias_max: " +c2.getAllPotencias() +" \t Potencias_actuales: " +c2.getAllPotenciasActs());
				
				break;
				
				
			// Caso 4, salimos del programa
			case 4:
				System.exit(0);
			
				
			// Si el usuario no elige ninguna opción válida, imprimimos el error	
			default:
				System.out.println("Opción invalida. Elige una opción del 1 al 3");
			}
			
		}
		
		
		
		
	}

}
