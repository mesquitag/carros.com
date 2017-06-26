package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo quantidade de porta para SERVICOS", description="Regra criada para auxilio na escolha do modelo do carro apartir da quantidade de portas")

public class DefineQtdePortasServico{
	
	private Carros carro;
	private Cliente cliente;

	@Condition
	public boolean when(){
		
		if(cliente.getFinalidade()==cliente.getFinalidade().TRANPORTE_CARGAS){
			return true;
		}
		return false;
	}
	
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Quantidade de portas do carro definida - SERVICOS QUATRO_PORTAS (MALA INCLUSA)");
		carro.setQtdePortas(Carros.QtdePortas.QUATRO_PORTAS);
	}

	public DefineQtdePortasServico(Cliente cliente, Carros carro){
		super();
		this.cliente = cliente;
		this.carro = carro;
	}
}