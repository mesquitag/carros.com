package Models;

public class Carros {

	private CapacidadePassageiros capacidade;
	private CarroIndicavel carro;
	private DisponibilidadeFinaceira diponibilidadeFinanca;
	private FlexAbastecimento flexAbastecimetno;
	private ForcaMotor motor;
	private QtdePortas qtdePortas;
	
	public enum CapacidadePassageiros{
		BAIXA_ATE_2_OCUPANTES(1), MEDIA_5_OCUPANTES(2),ALTA_6_OU_MAIS_OCUPANTES(3);
		
		private final int valor;
		
		CapacidadePassageiros(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum CarroIndicavel{
		GOL_G6(1), HB20(2), SIENA(3), CIVIC(4), RANGER(5), STRADA(6), TUCSON(7), SPORTAGE(8), AIR_CROSS(9), DOBLO(10),
		SPACE_FOX(11), PORSCHE_BOXSTER(12), CARRERA_COUPE_911(13), MERCEDEZ_SPRINTER(14), RENAULT_MASTER(15);
		
		private final int valor;
		
		CarroIndicavel(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum DisponibilidadeFinaceira{
		BAIXA_ATE_R$100(1), MEDIA_ATE_R$300(2), ALTA_ATE_R$300_OU_ACIMA(3);
		
		private final int valor;
		
		DisponibilidadeFinaceira(int valorOpcao) {
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum FlexAbastecimento{
		DISPONIVEL(1), INDISPONIVEL(2);
		
		private final int valor;
		
		FlexAbastecimento(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum ForcaMotor{
		COMUM(1), FORTE(2), TURBO(3);
		
		private final int valor;
		
		ForcaMotor(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
		
	}
	
	public enum QtdePortas{
		CINCO_PORTAS(1), QUATRO_PORTAS(2), TRES_PORTAS(3);
		
		private final int valor;
		
		QtdePortas(int valorOpcao){
			valor = valorOpcao; 
		}
		
		public int getValor(){
			return valor;
		}
	}
	
}
