package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo capacidade de passageiros BAIXA", description="Regra criada para definir qual a quantide de assentos")

public class DefineCapacidadeBMA {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getQtdePassageiro() == Cliente.QtdePassageiro.DUAS_PESSOAS){
			return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		
		System.out.println("Capacidade de passageiros definida como - Baixa");
		carro.setCapacidadePassageiros(Carros.CapacidadePassageiros.BAIXA_ATE_2_OCUPANTES);
				
	}
	
	public DefineCapacidadeBMA(Cliente cliente, Carros carro){
		this.cliente = cliente;
		this.carro = carro;		
	}

}
