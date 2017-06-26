package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica Gol G6 ", description = "regra criada para indicar"
        + " o Gol G6 para o cliente")
public class IndicaGolG6 {

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
        System.out.println("O modelo indicado e o GOL G6 !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.GOL_G6);
    }

    public IndicaGolG6(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }

}
