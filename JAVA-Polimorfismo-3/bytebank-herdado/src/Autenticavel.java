//Contrato Autenticavel
	//Quem assina esse contrato, precisa implementar
		//M�todo setSenha
		//M�todo autentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
