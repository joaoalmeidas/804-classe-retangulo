
public class Retangulo {
	
	private double altura;
	private double largura;
	
	public Retangulo() {
		this(1, 1);
	}
	
	public Retangulo(double altura, double largura) {
		super();
		setAltura(altura);
		setLargura(largura);
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
		
		if(largura > 0.0 && largura < 20.0) {
			
			this.altura = altura;
			
		}else {
			
			new IllegalArgumentException("A altura deve estar entre 0 e 20");
			
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		
		if(largura > 0.0 && largura < 20.0) {
			
			this.largura = largura;
			
		}else {
			
			new IllegalArgumentException("A largura deve estar entre 0 e 20");
			
		}
		
	}
	
	
	
}
