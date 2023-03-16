package view;

import java.util.concurrent.Semaphore;

import controller.corrida;
import object.escuderia;

public class main {

	public static void main(String[] args) {
		
		int permissao = 1;
		Semaphore farol = new Semaphore(permissao);
		int permissao2 = 5;
		Semaphore farol2 = new Semaphore(permissao2);
		escuderia [] escuderia = new escuderia [7];
		
		for(int i = 0; i <= 6; i++) {
			escuderia[i] = new escuderia();
		}
		
		for(int piloto = 1; piloto <= 14; piloto++) {
			Thread corrida = new corrida(piloto, escuderia, farol, farol2);
			corrida.start();
		}
	}
}
