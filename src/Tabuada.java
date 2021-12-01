public class Tabuada {
	private int numero;
	
	public void setNumero(int vNumero) {
		numero = vNumero;
	}
	public int getNumero() {
		return numero;
	}
	public String retTabuada(int vTabuada) {
		String tabuada = "";
		int numeracao = 0;
		while(numeracao <= vTabuada) {
			tabuada = tabuada + numeracao + "x" + tabuada + "=" +(numeracao*vTabuada) +"\n";
			numeracao++;
		}
		return tabuada;
		
	}
}
	
