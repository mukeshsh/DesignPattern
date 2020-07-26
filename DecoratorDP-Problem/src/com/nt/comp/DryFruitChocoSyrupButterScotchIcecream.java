package com.nt.comp;

public class DryFruitChocoSyrupButterScotchIcecream extends DryFruitButterScotchIcecream {
    @Override
    public void prepare() {
    	super.prepare();
    	addTopings();
    }
    private void addTopings() {
    	System.out.println("adding dryfruits....................");
    }
    
}
