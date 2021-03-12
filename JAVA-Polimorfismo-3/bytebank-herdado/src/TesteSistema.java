
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(777);
		
		Administrador adm = new Administrador();
		adm.setSenha(777);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);

	}

}
