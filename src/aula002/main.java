package aula002;

public class main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		c1.destampar();
		c1.rabiscar();
		//c1.status();
		
System.out.println();
System.out.println();
		
		Caneta c2 = new Caneta();
		c2.cor = "vermelha";
		c2.ponta = 0.5f;
		c2.tampada = false;
		
		c2.tampar();
		c2.rabiscar();
		//c2.status();
				
	}

}
