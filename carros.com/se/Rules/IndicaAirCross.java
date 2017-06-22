package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica AIR CROSS ", description = "regra criada para indicar"
        + " o AIR CROSS para o cliente")
public class IndicaAirCross{

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.COMUM &&
           carro.getQtdePortas() == Carros.QtdePortas.CINCO_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.MEDIA_ATE_R$300){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o AIR CROSS !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.AIR_CROSS);
    }

    public IndicaAirCross(Carros carro) {
        this.carro = carro;
    }
}