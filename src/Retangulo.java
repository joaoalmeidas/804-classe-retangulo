
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
		return getAltura() * 2 + getLargura() * 2;
	}
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		
		try {
			
			testaLimite(altura);
			this.altura = altura;
			
		}catch(IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
			
		try {
			
			testaLimite(largura);
			this.largura = largura;
			
		}catch(IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public void testaLimite(Double lado) {
		
		if(lado <= 0.0 || lado >= 20.0) {
			throw new IllegalArgumentException("Valor fora dos limites de 0 a 20");
		}
		
	}
	
}
