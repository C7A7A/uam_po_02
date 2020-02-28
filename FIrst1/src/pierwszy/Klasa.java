package pierwszy;

public class Klasa {

	private Integer b;
	private Klasa a;
	
	public Klasa(int a) {
		this.b = new Integer(a);
	}
	
	public void setB(int _b){
		b=_b;
	}
	
	public int getB(){
		return b;
	}
	
	static Klasa metoda(Klasa kl){
	  kl.b = new Integer(3);
	  return kl;
	}
	
	static Klasa metoda2(Klasa kl){
	  kl=new Klasa(5);
	  return kl;
	}
	
	static int metoda3(int kl){
	  kl= 44;
	  return kl;
	}
}