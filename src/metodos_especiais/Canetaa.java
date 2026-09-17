package metodos_especiais;
public class Canetaa {
	public String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	public Canetaa(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		tampada();
		
		
	}
	
	public String GetModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampada() {
		this.tampada = true;
	}
	
	public void destampada() {
		this.tampada = false;
	}
	
	
	public void status() {
		System.out.println("sobre a canetaa: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Esta tampada? " + this.tampada);
	}

	public Canetaa(String modelo, String cor, float ponta, boolean tampada) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}
	
	
	
}
