package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;
import Models.Cliente;


@Rule(name = "Indica SPRINTER ", description = "regra criada para indicar"
        + " o SPRINTER para o cliente")
public class IndicaMercedesSprinter {

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
        System.out.println("O modelo indicado e o SPRINTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.MERCEDES_SPRINTER);
    }

    public IndicaMercedesSprinter(Cliente cliente,Carros carro) {
        super();
    	this.cliente = cliente;
    	this.carro = carro;
    }
}