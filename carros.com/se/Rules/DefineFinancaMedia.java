package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo finança média para aluguel", description="Regra criada para definir quanto o cliente estima gastar")

public class DefineFinancaMedia {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getRendaMensal()==cliente.getRendaMensal().MEDIA_ATE_4_SALARIOS){
			return true;
		}
		return false;
	}
	
	@Action(order = 1)
	public void primeiraAcao()throws Exception{
		System.out.println("Disponibilidade financeira para aluguel definida - ATE_R$300");
		carro.setDisponibilidadeFinaceira(Carros.DisponibilidadeFinanceira.MEDIA_ATE_R$300);
	}
	
	public DefineFinancaMedia(Cliente cliente,Carros carro){
		super();
		this.carro = carro;
		this.cliente = cliente;
	}

}
