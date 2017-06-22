package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica PORSCHE BOXSTER ", description = "regra criada para indicar"
        + " o PORSCHE BOXSTER para o cliente")
public class IndicaPorscheBoxster {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.BAIXA_ATE_2_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.TURBO &&
           carro.getQtdePortas() == Carros.QtdePortas.TRES_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.INDISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.ALTA_ATE_R$300_OU_ACIMA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o PORSCHE BOXSTER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.PORSCHE_BOXSTER);
    }

    public IndicaPorscheBoxster(Carros carro) {
        this.carro = carro;
    }
}
