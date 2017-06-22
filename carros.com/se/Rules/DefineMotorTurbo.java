package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;

@Rule
(name="Definindo forca do motor TURBO", description="Regra criada para definir melhor motor para o carro alugado")
public class DefineMotorTurbo {
	
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
		System.out.println("Força do motor definida como - TURBO");
		carro.setForcaMotor(Carros.ForcaMotor.TURBO);
	}

	public DefineMotorTurbo(Cliente cliente, Carros carro){
		this.cliente = cliente;
		this.carro = carro;
	}
}

