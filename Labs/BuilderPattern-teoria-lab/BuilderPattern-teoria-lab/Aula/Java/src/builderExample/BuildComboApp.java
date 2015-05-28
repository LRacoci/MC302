package builderExample;

public class BuildComboApp {

	public static void main(String[] args) {

		ComboPequenoBuilder combo = new ComboPequenoBuilder();
		Director dir = new Director();
		dir.construct(combo);
		
		System.out.print(combo.getResult());

	}

}

