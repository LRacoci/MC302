package builderExampleExtended;

public class Director 
{
	public void construct(ComboBuilderInterface combo)
	{
		combo.criarLanche();
		combo.criarBatatas();
		combo.criarRefri();
	}
}

