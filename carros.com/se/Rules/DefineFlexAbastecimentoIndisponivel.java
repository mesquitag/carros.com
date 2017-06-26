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
		
		if(cliente.getTipoCombustivel() == cliente.getTipoCombustivel().GASOLINA ||
           cliente.getTipoCombustivel() == cliente.getTipoCombustivel().ETANOL ||
           cliente.getTipoCombustivel() == cliente.getTipoCombustivel().DIESEL){
			
            return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Flexibilidade de Abastecimento definida como - INDISPONIVEL");
		carro.setFlexAbastecimento(Carros.FlexAbastecimento.INDISPONIVEL);
			
	}
	
	public DefineFlexAbastecimentoIndisponivel(Cliente cliente,Carros carro){
		super();
		this.carro = carro;
		this.cliente = cliente;
	}

}