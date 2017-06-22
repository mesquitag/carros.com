package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica HB20 ", description = "regra criada para indicar"
        + " o HB20 para o cliente")
public class IndicaHB20 {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros()==Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES &&
           carro.getForcaMotor()==Carros.ForcaMotor.COMUM &&
           carro.getQtdePortas()==Carros.QtdePortas.CINCO_PORTAS &&
           carro.getFlexAbastecimento()==Carros.FlexAbastecimento.DISPONIVEL &&
           carro.getDisponibilidadeFinaca()==Carros.DisponibilidadeFinanceira.BAIXA_ATE_R$100){

           return true;    
        }
        
        return false;

    }

    @Action(order = 1)
    public void primeiraAcao() throws Exception {
        System.out.println("O modelo indicado e o HB20 !");
        carro.setCarroIndicavel(Carros.CarroIndicavel.HB20);
    }

    public IndicaHB20(Carros carro) {
        this.carro = carro;
    }

}
