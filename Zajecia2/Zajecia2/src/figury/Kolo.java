package figury;

public class Kolo implements Figura {
	
	public double promien;
	
	Kolo(double promien) {
		this.promien = promien;
	}
	
	@Override
	public double obliczPole() {
		double pole = Figura.PI * (promien * promien);
		return pole;
	}
	
	@Override
	public double obliczObwod() {
		double obwod = 2 * Figura.PI * promien;
		return obwod;
	}
}
