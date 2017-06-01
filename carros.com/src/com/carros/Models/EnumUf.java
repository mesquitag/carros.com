package com.carros.Models;

public enum EnumUf {
	
		 AC, AL, AM, AP, BA, CE, DF, ES, GO,   
		 MA, MG, MS, MT, PA, PB, PE, PI, PR,   
		 RJ, RN, RO, RR, RS, SC, SE, SP, TO ;
		  

	 
	private EnumUf(){}
	
	private String label;

    private EnumUf(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

	public void setLabel(String label) {
		this.label = label;
	}
	
    
}

