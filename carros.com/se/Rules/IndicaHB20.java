package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica HB20 ", description = "regra criada para indicar"
        + " o HB20 para o cliente")
public class IndicaHB20 {

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().DOMESTICO_PASSEIO &&
                cliente.getQtdePassageiro() == cliente.getQtdePassageiro().	QUATRO_A_CINCO_PESSOAS &&
                cliente.getRendaMensal() == cliente.getRendaMensal().COMUM_ATE_2_SALARIOS &&
                cliente.getTipoCombustivel() == cliente.getTipoCombustivel().FLEX_ETANOL_E_GASOLINA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o HB20 !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.HB20);
    }

    public IndicaHB20(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }

}
