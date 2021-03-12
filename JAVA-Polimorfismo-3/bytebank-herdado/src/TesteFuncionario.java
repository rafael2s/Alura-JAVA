
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario rafael = new Gerente();
		rafael.setNome("Rafael Souza");
		rafael.setCpf("11122233300");
		rafael.setSalario(10000.00);
		
		System.out.println(rafael.getNome());
		System.out.println(rafael.getBonificacao());
		
		//rafael.salario = 500.0;
	}
}
