package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica CIVIC ", description = "regra criada para indicar"
        + " o CIVIC para o cliente")
public class IndicaCivic {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().DOMESTICO_PASSEIO &&
     	       cliente.getQtdePassageiro() == cliente.getQtdePassageiro().QUATRO_A_CINCO_PESSOAS &&
     	       cliente.getRendaMensal() == cliente.getRendaMensal().MEDIA_ATE_4_SALARIOS &&
     	       cliente.getTipoCombustivel() == cliente.getTipoCombustivel().GASOLINA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o CIVIC !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.CIVIC);
    }

    public IndicaCivic(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}    