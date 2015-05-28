package builderExampleExtended;

public class BuildComboApp {

	public static void main(String[] args) {

		// Combo Pequeno
		ComboPequenoBuilder combo = new ComboPequenoBuilder();
		Director dir = new Director();
		dir.construct(combo);
		System.out.println(combo.getResult());
		
		// Combo Grande
		ComboGrandeBuilder comboGrande = new ComboGrandeBuilder();
		dir.construct(comboGrande);
		System.out.println(comboGrande.getResult());
	}
}

