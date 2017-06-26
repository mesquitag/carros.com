package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica PORSCHE BOXSTER ", description = "regra criada para indicar"
        + " o PORSCHE BOXSTER para o cliente")
public class IndicaPorscheBoxster {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().LUXO &&
           cliente.getQtdePassageiro() == cliente.getQtdePassageiro().DUAS_PESSOAS &&
           cliente.getQtdePassageiro() == cliente.getQtdePassageiro().DUAS_PESSOAS &&
           cliente.getRendaMensal() == cliente.getRendaMensal().ALTA_ACIMA_DE_4_SALARIOS &&
           cliente.getTipoCombustivel() == cliente.getTipoCombustivel().GASOLINA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o PORSCHE BOXSTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.PORSCHE_BOXSTER);
    }

    public IndicaPorscheBoxster(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}
