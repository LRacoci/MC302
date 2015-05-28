package builderExampleExtended;

public class ComboGrandeBuilder implements ComboBuilderInterface {

	private String combo = "";
	private int preço = 0;
	
	@Override
	public void criarLanche() {
		combo = combo + "Lanche grande + ";
		preço = preço + 18;
	}

	@Override
	public void criarBatatas() {
		combo = combo + "Batatas grandes + ";
		preço = preço + 10;
	}

	@Override
	public void criarRefri() {
		combo = combo + "Refrigerante grande = ";
		preço = preço + 8;
	}

	public String getResult() {
		combo = combo + "R$" + Integer.toString(preço);
		return combo;
	}
}