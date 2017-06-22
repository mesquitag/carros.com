package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo capacidade de passageiros média e alta", description="Regra criada para definir qual a quantide de assentos")

public class DefineCapacidadeMediaAlta {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getQtdePassageiro()== Cliente.QtdePassageiro.QUATRO_A_CINCO_PESSOAS || cliente.getQtdePassageiro()==Cliente.QtdePassageiro.ACIMA_DE_CINCO){
			return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeriaAcao()throws Exception{
		
		if(cliente.getQtdePassageiro()==Cliente.QtdePassageiro.QUATRO_A_CINCO_PESSOAS){
			System.out.println("Capacidade de passageiros definida como -MEDIA");
			carro.setCapacidadePassageiros(Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES);
		}
		System.out.println("Capacidade de passageiros definida como -ALTA");
		carro.setCapacidadePassageiros(Carros.CapacidadePassageiros.ALTA_6_OU_MAIS_OCUPANTES);
		
	}
	
	public DefineCapacidadeMediaAlta(Carros carro, Cliente cliente){
		this.carro = carro;
		this.cliente = cliente;
	}

}
