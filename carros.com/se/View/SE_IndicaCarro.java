package View;

import org.easyrules.api.RulesEngine;
import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

import Models.Carros;
import Models.Cliente;
import Rules.DefineCapacidadeAlta;
import Rules.DefineCapacidadeBMA;
import Rules.DefineCapacidadeMediaAlta;
import Rules.DefineFinancaAlta;
import Rules.DefineFinancaBaixa;
import Rules.DefineFinancaMedia;
import Rules.DefineFlexAbastecimentoDisponivel;
import Rules.DefineFlexAbastecimentoIndisponivel;
import Rules.DefineMotorComum;
import Rules.DefineMotorForte;
import Rules.DefineMotorTurbo;
import Rules.DefineQtdePortasComum;
import Rules.DefineQtdePortasEsportivo;
import Rules.DefineQtdePortasServico;
import Rules.IndicaAirCross;
import Rules.IndicaCarreraCoupe911;
import Rules.IndicaCivic;
import Rules.IndicaFiatDoblo;
import Rules.IndicaFordRanger;
import Rules.IndicaGolG6;
import Rules.IndicaHB20;
import Rules.IndicaMercedesSprinter;
import Rules.IndicaPorscheBoxster;
import Rules.IndicaRenaultMaster;
import Rules.IndicaSiena;
import Rules.IndicaSpaceFox;
import Rules.IndicaSportage;
import Rules.IndicaStrada;
import Rules.IndicaTucson;

public class SE_IndicaCarro {
	
	public static void main(String[] args){
		
		Cliente cliente = new Cliente(Cliente.Finalidade.DOMESTICO_PASSEIO,Cliente.QtdePassageiro.QUATRO_A_CINCO_PESSOAS,
				Cliente.RendaMensal.COMUM_ATE_2_SALARIOS,Cliente.TipoCombustivel.FLEX_ETANOL_E_GASOLINA);
		
		Carros carro = new Carros();
		
		DefineCapacidadeMediaAlta defineCapacidadeMA = new DefineCapacidadeMediaAlta(cliente, carro);
		DefineCapacidadeBMA defineCapacidadeBMA = new DefineCapacidadeBMA(cliente, carro);
		DefineCapacidadeAlta defineCapcidadeA = new DefineCapacidadeAlta(cliente, carro);
		
		DefineFinancaBaixa financaB = new DefineFinancaBaixa(cliente, carro);
		DefineFinancaMedia financaM = new DefineFinancaMedia(cliente, carro);
		DefineFinancaAlta financaA = new DefineFinancaAlta(cliente, carro);
		
		/*DefineFlexAbastecimentoDisponivel flexD = new DefineFlexAbastecimentoDisponivel(cliente, carro);
		DefineFlexAbastecimentoIndisponivel flexI = new DefineFlexAbastecimentoIndisponivel(cliente, carro);*/
		
		DefineMotorComum motorC = new DefineMotorComum(cliente, carro);
		DefineMotorForte motorF = new DefineMotorForte(cliente, carro);
		DefineMotorTurbo motorT = new DefineMotorTurbo(cliente, carro);
		
		DefineQtdePortasComum portasC = new DefineQtdePortasComum(cliente, carro);
		DefineQtdePortasServico portasS = new DefineQtdePortasServico(cliente, carro);
		DefineQtdePortasEsportivo portasE = new DefineQtdePortasEsportivo(cliente, carro);
		
		IndicaAirCross aircross= new IndicaAirCross(cliente,carro);
		IndicaCarreraCoupe911 carrera = new IndicaCarreraCoupe911(cliente,carro);
		IndicaCivic civic = new IndicaCivic(cliente,carro);
		IndicaFiatDoblo doblo = new IndicaFiatDoblo(cliente,carro);
		IndicaFordRanger ranger = new IndicaFordRanger(cliente,carro);
		IndicaGolG6 gol = new IndicaGolG6(cliente,carro);
		IndicaHB20 hb20 = new IndicaHB20(cliente,carro);
		IndicaMercedesSprinter sprinter = new IndicaMercedesSprinter(cliente,carro);
		IndicaPorscheBoxster porsche = new IndicaPorscheBoxster(cliente,carro);
		IndicaRenaultMaster master = new IndicaRenaultMaster(cliente,carro);
		IndicaSiena siena = new IndicaSiena(cliente,carro);
		IndicaSpaceFox fox = new IndicaSpaceFox(cliente,carro);
		IndicaSportage sportage = new IndicaSportage(cliente,carro);
		IndicaStrada strada = new IndicaStrada(cliente,carro);
		IndicaTucson tucson = new IndicaTucson(cliente,carro);
		
		RulesEngine rulesEngine = aNewRulesEngine().withSilentMode(true).build();
        RulesEngine rulesEngine2= aNewRulesEngine().withSilentMode(true).build();
        
        
        rulesEngine.registerRule(defineCapcidadeA);
        rulesEngine.registerRule(defineCapacidadeMA);
        rulesEngine.registerRule(defineCapacidadeBMA);
        
        rulesEngine.registerRule(financaB);
        rulesEngine.registerRule(financaM);
        rulesEngine.registerRule(financaA);
        
        /*rulesEngine.registerRule(flexD);
        rulesEngine.registerRule(flexI);*/
        
        rulesEngine.registerRule(motorC);
        rulesEngine.registerRule(motorF);
        rulesEngine.registerRule(motorT);
        
        rulesEngine.registerRule(portasC);
        rulesEngine.registerRule(portasS);
        rulesEngine.registerRule(portasE);
        rulesEngine.fireRules();
        
        rulesEngine2.registerRule(aircross);
        rulesEngine2.registerRule(carrera);
        rulesEngine2.registerRule(civic);
        rulesEngine2.registerRule(doblo);
        rulesEngine2.registerRule(ranger);
        rulesEngine2.registerRule(gol);
        rulesEngine2.registerRule(hb20);
        rulesEngine2.registerRule(sprinter);
        rulesEngine2.registerRule(porsche);
        rulesEngine2.registerRule(master);
        rulesEngine2.registerRule(siena);
        rulesEngine2.registerRule(fox);
        rulesEngine2.registerRule(sportage);
        rulesEngine2.registerRule(strada);
        rulesEngine2.registerRule(tucson);
        rulesEngine2.fireRules();
         	
	}

}
