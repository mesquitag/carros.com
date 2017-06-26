package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica AIR CROSS ", description = "regra criada para indicar"
        + " o AIR CROSS para o cliente")
public class IndicaAirCross{

    private Carros carro;
    private Cliente cliente;
    @Condition
    public boolean when() {

        if(cliente.getFinalidade() ==  cliente.getFinalidade().DOMESTICO_PASSEIO &&
           cliente.getQtdePassageiro() == cliente.getQtdePassageiro().	QUATRO_A_CINCO_PESSOAS &&
           cliente.getRendaMensal() == cliente.getRendaMensal().MEDIA_ATE_4_SALARIOS &&
           cliente.getTipoCombustivel() == cliente.getTipoCombustivel().GASOLINA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o AIR CROSS !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.AIR_CROSS);
    }

    public IndicaAirCross(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}