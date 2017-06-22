package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo quantidade de porta ESPORTIVO", description="Regra criada para auxilio na escolha do modelo do carro apartir da quantidade de portas")

public class DefineQtdePortasEsportivo {
	
	private Carros carro;
	private Cliente cliente;

	@Condition
	public boolean when(){
		
		if(cliente.getFinalidade()==Cliente.Finalidade.LUXO){
			return true;
		}
		return false;
	}
	
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Quantidade de portas do carro definida - COMUM");
		carro.setQtdePortas(Carros.QtdePortas.TRES_PORTAS);
	}

	public DefineQtdePortasEsportivo(Cliente cliente, Carros carro){
		this.cliente = cliente;
		this.carro = carro;
	}
}
