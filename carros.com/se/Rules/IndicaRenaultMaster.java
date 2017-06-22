package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica RENAULT MASTER  ", description = "regra criada para indicar"
        + " o RENAULT MASTER para o cliente")
public class IndicaRenaultMaster{

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.BAIXA_ATE_2_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.FORTE &&
           carro.getQtdePortas() == Carros.QtdePortas.QUATRO_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.INDISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.MEDIA_ATE_R$300){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o RENAULT MASTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.RENAULT_MASTER);
    }

    public IndicaRenaultMaster(Carros carro) {
        this.carro = carro;
    }
}