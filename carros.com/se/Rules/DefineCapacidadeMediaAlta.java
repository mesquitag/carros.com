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
		
		if(cliente.getQtdePassageiro()== cliente.getQtdePassageiro().QUATRO_A_CINCO_PESSOAS){
			return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeriaAcao()throws Exception{
		
			System.out.println("Capacidade de passageiros definida como -QUATRO A CINCO OCUPANTES");
			carro.setCapacidadePassageiros(Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES);
				
	}
	
	public DefineCapacidadeMediaAlta(Cliente cliente,Carros carro){
		super();
		this.carro = carro;
		this.cliente = cliente;
	}

}
