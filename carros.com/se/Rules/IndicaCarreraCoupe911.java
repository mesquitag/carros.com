package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica CARRERA COUPE 911 ", description = "regra criada para indicar"
        + " o CARRERA COUPE 911  para o cliente")
public class IndicaCarreraCoupe911 {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {
    	
    		if(cliente.getFinalidade() ==  cliente.getFinalidade().LUXO &&
    	       cliente.getQtdePassageiro() == cliente.getQtdePassageiro().DUAS_PESSOAS &&
    	       cliente.getRendaMensal() == cliente.getRendaMensal().ALTA_ACIMA_DE_4_SALARIOS &&
    	       cliente.getTipoCombustivel() == cliente.getTipoCombustivel().GASOLINA){

    	           return true;    
    	        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o CARRERA COUPE 911!");
        carro.setCarroIndicavel(Carros.CarroIndicavel.CARRERA_COUPE_911);
    }

    public IndicaCarreraCoupe911(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}
