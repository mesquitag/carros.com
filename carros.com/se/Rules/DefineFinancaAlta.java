package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo finança alta para aluguel", description="Regra criada para definir quanto o cliente estima gastar")

public class DefineFinancaAlta {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	
	public boolean when(){
		
		if(cliente.getRendaMensal()== Cliente.RendaMensal.ALTA_ACIMA_DE_4_SALARIOS){
			return true;
		}
		return false;
		
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Disponibilidade financeira para aluguel definida - ALTA");
		carro.setDisponibilidadeFinaceira(Carros.DisponibilidadeFinanceira.ALTA_ATE_R$300_OU_ACIMA);

	}
	
	public DefineFinancaAlta(Carros carro, Cliente cliente){
		this.carro = carro;
		this.cliente = cliente;
	}

}
