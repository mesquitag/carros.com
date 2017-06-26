package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica RENAULT MASTER  ", description = "regra criada para indicar"
        + " o RENAULT MASTER para o cliente")
public class IndicaRenaultMaster{

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().TRANPORTE_CARGAS &&
      	       cliente.getQtdePassageiro() == cliente.getQtdePassageiro().DUAS_PESSOAS &&
      	       cliente.getRendaMensal() == cliente.getRendaMensal().ALTA_ACIMA_DE_4_SALARIOS &&
      	       cliente.getTipoCombustivel() == cliente.getTipoCombustivel().DIESEL){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o RENAULT MASTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.RENAULT_MASTER);
    }

    public IndicaRenaultMaster(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}