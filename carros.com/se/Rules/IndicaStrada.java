package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica Strada ", description = "regra criada para indicar"
        + " o Strada para o cliente")
public class IndicaStrada {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.BAIXA_ATE_2_OCUPANTES &&
           carro.getForcaMotor() == Carros.ForcaMotor.COMUM &&
           carro.getQtdePortas() == Carros.QtdePortas.TRES_PORTAS &&
           carro.getFlexAbastecimento() == Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca() == Carros.DisponibilidadeFinanceira.MEDIA_ATE_R$300){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o STRADA !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.STRADA);
    }

    public IndicaStrada(Carros carro) {
        this.carro = carro;
    }
}