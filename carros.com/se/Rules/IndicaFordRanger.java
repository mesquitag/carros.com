package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica FORD RANGER ", description = "regra criada para indicar"
        + " o FORD RANGER para o cliente")
public class IndicaFordRanger {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.ALTA_6_OU_MAIS_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.FORTE &&
           carro.getQtdePortas() == Carros.QtdePortas.CINCO_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.ALTA_ATE_R$300_OU_ACIMA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o FORD RANGER !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.RANGER);
    }

    public IndicaFordRanger(Carros carro) {
        this.carro = carro;
    }
}