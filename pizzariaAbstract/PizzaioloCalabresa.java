package pizzariaAbstract;

public class PizzaioloCalabresa implements Pizzaiolo {
    public Pizza criarPizza() {
		return new PizzaCalabresa();
	}

	@Override
	public Calzone criarCalzone() {
		return new CalzoneCalabresa();
	}
    
}
