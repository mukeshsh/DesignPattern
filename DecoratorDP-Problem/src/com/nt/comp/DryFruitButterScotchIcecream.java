package com.nt.comp;

public class DryFruitButterScotchIcecream extends ButterScotchIcecream {
    
	@Override
    public void prepare() {
    	super.prepare();
    	addTopings();
    }
	private void addTopings() {
		System.out.println("Dry fruit addings........");
	}
}
