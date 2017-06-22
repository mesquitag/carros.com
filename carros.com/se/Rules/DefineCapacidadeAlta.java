package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo capacidade de passageiros Alta", description="Regra criada para definir qual a quantide de assentos")

public class DefineCapacidadeAlta {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getQtdePassageiro() == Cliente.QtdePassageiro.ACIMA_DE_CINCO){
			return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Capacidade de passageiros definida como - ALTA");
		carro.setCapacidadePassageiros(Carros.CapacidadePassageiros.ALTA_6_OU_MAIS_OCUPANTES);
			
	}
	
	public DefineCapacidadeAlta(Carros carro, Cliente cliente){
		this.carro = carro;
		this.cliente = cliente;
	}

}