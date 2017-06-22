package Rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import Models.Carros;


@Rule(name = "Indica CARRERA COUPE 911 ", description = "regra criada para indicar"
        + " o CARRERA COUPE 911 FOX para o cliente")
public class IndicaCarreraCoupe911 {

    private Carros carro;

    @Condition
    public boolean when() {

        if(carro.getCapacidadePassageiros() == Carros.CapacidadePassageiros.MEDIA_5_OCUPANTES &&
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
        System.out.println("O modelo indicado e o CARRERA COUPE 911!");
        carro.setCarroIndicavel(Carros.CarroIndicavel.CARRERA_COUPE_911);
    }

    public IndicaCarreraCoupe911(Carros carro) {
        this.carro = carro;
    }
}
