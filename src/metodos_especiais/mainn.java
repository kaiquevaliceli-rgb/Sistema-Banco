package metodos_especiais;
public class mainn {
	public static void main(String[] args) {

	Canetaa c1 = new Canetaa("Bic", "Azul", 0.5f);
	c1.status();
	
	System.out.println();
	
	Canetaa c2 = new Canetaa("Bic", "Vermelha", 1.0f);
	c2.status();
	
	System.out.println();
	
	Canetaa c3 = new Canetaa("Bic", "Preta", 1.5f);
	c3.status();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Desta forma abixo o codigo ficou antes de acrescentar coisas no cod base
	
	//c1.setModelo("bic");
	//c1.modelo = "bic";
	// acima deu certo, porque modelo esta publico no cod base
	
	//c1.setPonta(0.5f);
	//c1.ponta = 0.5f;
	//para a chamada sem o set daria erro, afinal ponta esta privado no cod base
	
	//c1.status();
	
	
	}
}
