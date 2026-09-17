package teste_pratico;

public class mainbanco {
	public static void main(String [] args) {
	Banco c1 = new Banco();
	c1.setConta(1);
	c1.setDono("Kaique");
	c1.abrirConta("CC");
	c1.depositar(500);
	c1.estadoAtual();
	
	System.out.println();
	
	Banco c2 = new Banco();
	c2.setConta(2);
	c2.setDono("Fernanda");
	c2.abrirConta("CP");
	c2.depositar(2000);
	c2.sacar(40);
	c2.depositar(2000);
	c2.sacar(75);
	c2.depositar(10);
	c2.sacar(25);
	c2.estadoAtual();
}
}
