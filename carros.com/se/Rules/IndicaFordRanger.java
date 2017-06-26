package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica FORD RANGER ", description = "regra criada para indicar"
        + " o FORD RANGER para o cliente")
public class IndicaFordRanger {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().TRANPORTE_CARGAS &&
      	       cliente.getQtdePassageiro() == cliente.getQtdePassageiro().ACIMA_DE_CINCO &&
      	       cliente.getRendaMensal() == cliente.getRendaMensal().ALTA_ACIMA_DE_4_SALARIOS &&
      	       cliente.getTipoCombustivel() == cliente.getTipoCombustivel().DIESEL){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e a FORD RANGER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.RANGER);
    }

    public IndicaFordRanger(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}