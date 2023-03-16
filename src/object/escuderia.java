package object;

public class escuderia {
	
	public int numescuderia;
	public int carro1;
	public int carro2;
	public double VoltaCarro1;
	public double VoltaCarro2;
	
	public escuderia(){
		this(0, 0, 0, 0.0, 0.0);
	}
	
	escuderia(int numescuderia, int carro1, int carro2, double VoltaCarro1, double VoltaCarro2){
		this.numescuderia = numescuderia;
		this.carro1 = carro1;
		this.carro2 = carro2;
		this.VoltaCarro1 = VoltaCarro1;
		this.VoltaCarro2 = VoltaCarro2;
	}

}
