//Designer � um Funcionario, Designer herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Designer");
		return 200;
	}
}
