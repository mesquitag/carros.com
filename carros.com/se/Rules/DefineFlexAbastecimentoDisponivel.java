package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo Combustivel ", description="Regra criada para definir se o carro será flex ou não")

public class DefineFlexAbastecimentoDisponivel {
	
	private Carros carro;
	private Cliente cliente;
	
	@Condition
	public boolean when(){
		
		if(cliente.getTipoCombustivel() == Cliente.TipoCombustivel.GASOLINA &&
           cliente.getTipoCombustivel() == Cliente.TipoCombustivel.ETANOL){
			
            return true;
		}
		return false;
	}
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Flexibilidade de Abastecimento definida como - DISPONIVEL");
		carro.setFlexAbastecimento(Carros.FlexAbastecimento.DISPONIVEL);
			
	}
	
	public DefineFlexAbastecimentoDisponivel(Carros carro, Cliente cliente){
		this.carro = carro;
		this.cliente = cliente;
	}

}