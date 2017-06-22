package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica Gol G6 ", description = "regra criada para indicar"
        + " o Gol G6 para o cliente")
public class IndicaGolG6 {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.COMUM &&
           carro.getQtdePortas() == Carros.QtdePortas.CINCO_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.BAIXA_ATE_R$100){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o GOL G6 !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.GOL_G6);
    }

    public IndicaGolG6(Carros carro) {
        this.carro = carro;
    }

}
