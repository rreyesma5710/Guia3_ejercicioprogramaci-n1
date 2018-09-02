package paquete;
//import static java.lang.Math.pow;

public class Pendulo {
	
	double l; //Longitud
	double g;//aceleracionGravitacional
	double t;//periodo
	
	public Pendulo() {
		
	}
	
	public Pendulo(double l, double g, double t) {
		this.l = l;
		this.g = g;
		this.t = t;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
	public String toString() {
		return "Longitud: " + l + "\n"+
				"AceleracionGravitacional: "+ g+"\n"+
				"Periodo: "+ t+"\n";
	}
	
	public void calcularPeriodo(Double l, Double g)
	{
		double periodo;
		periodo = (2*3.1415)*Math.sqrt(g/l);
		this.t = periodo;
	}

}
