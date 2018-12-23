
public class Retangulo {
	
	private double altura;
	private double largura;
	
	public Retangulo() {
		this(1, 1);
	}
	
	public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calculaArea() {
		return getAltura() * getLargura();
	}
	
	public double calculaPerimetro() {
		return (getAltura() * 2) + (getLargura() * 2);
	}
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	
	
}
