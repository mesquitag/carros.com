package Rules;



import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo finança baixa para aluguel", description="Regra criada para definir quanto o cliente estima gastar")

public class DefineFinancaBaixa {
	
	private Cliente cliente;
	private Carros carro;
	
	@Condition
	public boolean when(){
		
		if(cliente.getRendaMensal()==cliente.getRendaMensal().COMUM_ATE_2_SALARIOS){
			return true;
		}
		return false;
	}
	
	@Action(order = 1)
	public void primeiraAcao()throws Exception{
		System.out.println("Disponibilidade financeira para aluguel definida - ATE_R$100");
		carro.setDisponibilidadeFinaceira(Carros.DisponibilidadeFinanceira.BAIXA_ATE_R$100);
		
	}
	
	public DefineFinancaBaixa(Cliente cliente,Carros carro){
		super();
		this.carro = carro;
		this.cliente = cliente;
	}
	
	

}
