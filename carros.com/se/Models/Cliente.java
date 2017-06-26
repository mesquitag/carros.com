package Models;

public class Cliente {
	
	
	private Finalidade finalidade;
	private QtdePassageiro qtdePassageiro;
	private RendaMensal rendaMensal;
	private TipoCombustivel tipoCombustivel;
	
	public Cliente( Finalidade finalidade, QtdePassageiro qtdePassageiro,
			RendaMensal rendaMensal,TipoCombustivel tipoCombustivel){
		
		
		super();
		this.finalidade = finalidade;
		this.qtdePassageiro = qtdePassageiro;
		this.rendaMensal = rendaMensal;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
		
	public enum Finalidade{
		DOMESTICO_PASSEIO(1), TRANPORTE_CARGAS(2), LUXO(3);
		
		private final int valor;
		
		Finalidade(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum QtdePassageiro{
		DUAS_PESSOAS(1),QUATRO_A_CINCO_PESSOAS(2),ACIMA_DE_CINCO(3);
		
		private final int valor;
		
		QtdePassageiro(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum RendaMensal{
		COMUM_ATE_2_SALARIOS(1), MEDIA_ATE_4_SALARIOS(2), ALTA_ACIMA_DE_4_SALARIOS(3);
		
		private final int valor;
		
		RendaMensal(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum TipoCombustivel{
		GASOLINA(1), ETANOL(2), DIESEL(3), FLEX_ETANOL_E_GASOLINA(4);
		
		private final int valor;
		
		TipoCombustivel(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}

	//GETS e SETS
	
	public Finalidade getFinalidade(){
		return finalidade;
	}
	
	 public void setFinalidade(Finalidade finalidade){
		 this.finalidade = finalidade;
	 }
	 ////////////////
	 public QtdePassageiro getQtdePassageiro(){
		 return qtdePassageiro;
	 }
	 
	 public void setQtdePassageiro(QtdePassageiro qtdePassageiro){
		 this.qtdePassageiro = qtdePassageiro;
	 }
	 ////////////////
	 public RendaMensal getRendaMensal(){
		 return rendaMensal;
	 }
	 public void setRendaMensal(RendaMensal rendaMensal){
		 this.rendaMensal = rendaMensal;
	 }
	 ///////////////
	 public TipoCombustivel getTipoCombustivel(){
		 return tipoCombustivel;
	 }
	 public void setTipoCombustivel(TipoCombustivel tipoCombustivel ){
		 this.tipoCombustivel = tipoCombustivel;
		 
	 }
	 
}
