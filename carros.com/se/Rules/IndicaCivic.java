package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica CIVIC ", description = "regra criada para indicar"
        + " o CIVIC para o cliente")
public class IndicaCivic {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros()==Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES &&
           carro.getForcaMotor()==Carros.ForcaMotor.COMUM &&
           carro.getQtdePortas()==Carros.QtdePortas.CINCO_PORTAS &&
           carro.getFlexAbastecimento()==Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca()==Carros.DisponibilidadeFinanceira.ALTA_ATE_R$300_OU_ACIMA){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o CIVIC !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.CIVIC);
    }

    public IndicaCivic(Carros carro) {
        this.carro = carro;
    }
}    