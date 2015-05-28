package builderExampleExtended;

public class ComboPequenoBuilder implements ComboBuilderInterface {

	private String combo = "";
	private int preço = 0;
	
	@Override
	public void criarLanche() {
		combo = combo + "Lanche pequeno + ";
		preço = preço + 12;
	}

	@Override
	public void criarBatatas() {
		combo = combo + "Batatas pequenas + ";
		preço = preço + 5;
	}

	@Override
	public void criarRefri() {
		combo = combo + "Refrigerante pequeno = ";
		preço = preço + 4;
	}
	
	public String getResult() {
		combo = combo + "R$" + Integer.toString(preço);
		return combo;
	}
}