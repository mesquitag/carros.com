package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica Strada ", description = "regra criada para indicar"
        + " o Strada para o cliente")
public class IndicaStrada {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().DOMESTICO_PASSEIO &&
      	       cliente.getQtdePassageiro() == cliente.getQtdePassageiro().DUAS_PESSOAS &&
      	       cliente.getRendaMensal() == cliente.getRendaMensal().MEDIA_ATE_4_SALARIOS &&
      	       cliente.getTipoCombustivel() == cliente.getTipoCombustivel().FLEX_ETANOL_E_GASOLINA){

           return true;     
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o STRADA !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.STRADA);
    }

    public IndicaStrada(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}