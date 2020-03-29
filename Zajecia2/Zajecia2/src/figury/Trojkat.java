package figury;

public class Trojkat implements Figura {
	
	public double dlugoscBokuA;
	public double dlugoscBokuB;
	public double dlugoscBokuC;
	
	Trojkat(double dlugoscBokuA, double dlugoscBokuB, double dlugoscBokuC) {
		this.dlugoscBokuA = dlugoscBokuA;
		this.dlugoscBokuB = dlugoscBokuB;
		this.dlugoscBokuC = dlugoscBokuC;
	}
	
	@Override
	public double obliczPole() {
		int pole = 0;
		return pole;
	}
	
	@Override
	public double obliczObwod() {
		int obwod = 0;
		return obwod;
	}
}
