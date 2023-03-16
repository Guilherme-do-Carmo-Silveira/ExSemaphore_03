package controller;

import java.util.concurrent.Semaphore;

import object.escuderia;

public class corrida extends Thread{
	
		public int piloto;
		public escuderia [] escu;
		private Semaphore farol;
		private Semaphore farol2;
		private static int x = 0;
		private static int i = 0;
		private int volta = 0;
		private static int y = 0;
		private int compara = 0;
		private int carrospista [] = new int [5];
		private static int vtpilotos [] = new int [14];
	

	public corrida(int piloto, escuderia [] escu, Semaphore farol, Semaphore farol2) {
		this.piloto = piloto;
		this.escu = escu;
		this.farol = farol;	
		this.farol2 = farol2;
	}

	public void run() {
		try {
			farol.acquire();
			sleep(1000);
			Identificaescuderiaepiloto();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			farol.release();
		}
		if(y == 14) {
			try {
				farol2.acquire();
				competicao();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				farol2.release();
			}
		}

	}

	private void Identificaescuderiaepiloto() {
		if(piloto % 2 == 1) {
			escu[i].numescuderia = i + 1;
			escu[i].carro1 = piloto;
			vtpilotos[i] = piloto;
			i++;
		}
		if(piloto % 2 == 0) {
			escu[x].carro2 = piloto;
			vtpilotos[i] = piloto;
			x++;
			System.out.println("os pilotos da escuderia  " + escu[x-1].numescuderia + " sao: " + escu[x-1].carro1 + "  " + escu[x-1].carro2);
			System.out.println(vtpilotos[x-1] + " " + vtpilotos[x]);
		}
		y++;
	}
	
	private void competicao() {
		int x = 1;
		if(piloto % 2 == 1) {
			System.out.println("O piloto " + piloto + " entrou na pista");
			while(x <= 3) {
				if(x == 1) {
				escu[piloto].VoltaCarro1 = (int) (Math.random() * 91) + 30;
				System.out.println("O piloto " + piloto + " fez a " + x + " volta em " + escu[piloto].VoltaCarro1 + ".s");
				}else {
					volta = (int) (Math.random() * 91) + 30;
					System.out.println("O piloto " + piloto + " fez a " + x + " volta em " + volta + ".s");
						if(volta < escu[piloto].VoltaCarro1) {
							escu[piloto].VoltaCarro1 = volta;
						}
				}
				x++;
			}
				System.out.println("O piloto " + piloto + " saiu da pista");
		}else {
			if()
		}
	}
	
	/*
	
	for (int ctd = 0; ctd <7; ctd++){		
		if(piloto == escu[ctd].carro1 || piloto == escu[ctd].carro2){	
			if(
		}
	}		
	*/
}
