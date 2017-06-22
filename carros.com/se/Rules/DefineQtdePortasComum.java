package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo quantidade de porta COMUM", description="Regra criada para auxilio na escolha do modelo do carro apartir da quantidade de portas")

public class DefineQtdePortasComum {
	
	private Carros carro;
	private Cliente cliente;

	@Condition
	public boolean when(){
		
		if(cliente.getFinalidade()==Cliente.Finalidade.DOMESTICO_PASSEIO){
			return true;
		}
		return false;
	}
	
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Quantidade de portas do carro definida - COMUM");
		carro.setQtdePortas(Carros.QtdePortas.CINCO_PORTAS);
	}

	public DefineQtdePortasComum(Cliente cliente, Carros carro){
		this.cliente = cliente;
		this.carro = carro;
	}
}
