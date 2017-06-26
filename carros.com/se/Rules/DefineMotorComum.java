package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo forca do motor", description="Regra criada para definir melhor motor para o carro alugado")

public class DefineMotorComum {
	
	private Carros carro;
	private Cliente cliente;

	@Condition
	public boolean when(){
		
		if(cliente.getFinalidade()==cliente.getFinalidade().DOMESTICO_PASSEIO){
			return true;
		}
		return false;
	}
	
	
	@Action(order=1)
	public void primeiraAcao()throws Exception{
		System.out.println("Força do motor definida como - COMUM 1.0 até 2.0");
		carro.setForcaMotor(Carros.ForcaMotor.COMUM);
	}

	public DefineMotorComum(Cliente cliente,Carros carro){
		super();
		this.cliente = cliente;
		this.carro = carro;
	}
}	