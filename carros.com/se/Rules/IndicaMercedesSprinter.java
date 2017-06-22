package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica SPRINTER ", description = "regra criada para indicar"
        + " o SPRINTER para o cliente")
public class IndicaMercedesSprinter {

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
        System.out.println("O modelo indicado e o SPRINTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.MERCEDES_SPRINTER);
    }

    public IndicaMercedesSprinter(Carros carro) {
        this.carro = carro;
    }
}