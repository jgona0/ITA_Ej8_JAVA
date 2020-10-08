package com.cohets.cohet;

public class MueveCohetes implements Runnable{

	// Variables de clase
	private Cohet cohet;
	private int prop;
	private char mov;
	
	
	//CONSTRUCTOR
	public MueveCohetes(Cohet cohet, int prop, char mov) {
		
		this.cohet = cohet;
		this.prop = prop;
		this.mov = mov;
	}
	
	
	
	public void run() {
		
		// Si la opción mov = A , llamamos al método acelerar, sinó al método frenar
		if(mov == 'A') {
			
			try {
				cohet.acelera(prop);
			} catch (Exception e) {
				System.out.println("ERROR ---> No se puede acelerar el propulsor porque ya está en su potencia máxima o no existe");
			}
				
		}else {
			
			try {
				cohet.frena(prop);
			} catch (Exception e) {
				System.out.println("ERROR ---> No se puede frenar el propulsor porque ya está en su potencia mínima o no existe");

			}
		}
		
		
	}	
	
}
