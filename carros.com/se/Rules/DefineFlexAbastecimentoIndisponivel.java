package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo Combustivel ", description="Regra criada para definir se o carro será flex ou não")

public class DefineFlexAbastecimentoIndisponivel {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getTipoCombustivel() == Cliente.TipoCombustivel.GASOLINA ||
           cliente.getTipoCombustivel() == Cliente.TipoCombustivel.ETANOL ||
           cliente.getTipoCombustivel() == Cliente.TipoCombustivel.DIESEL){
			
            return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Flexibilidade de Abastecimento definida como - INDISPONIVEL");
		carro.setFlexAbastecimento(Carros.FlexAbastecimento.INDISPONIVEL);
			
	}
	
	public DefineFlexAbastecimentoIndisponivel(Carros carro, Cliente cliente){
		this.carro = carro;
		this.cliente = cliente;
	}

}