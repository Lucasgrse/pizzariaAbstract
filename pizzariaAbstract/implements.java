package pizzariaAbstract;



interface Pizza {
    String getIngredientes();
}
class PizzaCalabresa implements Pizza {
    @Override
    public String getIngredientes() {
        return "queijo + calabresa + tomate";
    }
}

class PizzaPresunto implements Pizza {
    @Override
    public String getIngredientes() {
        return "queijo + presunto + tomate";
    }
}

interface Calzone {
    String getIngredientes();
}

class CalzoneCalabresa implements Calzone {
    @Override
    public String getIngredientes() {
        return "queijo + calabresa";
    }
}

class CalzonePresunto implements Calzone {
    @Override
    public String getIngredientes() {
        return "queijo + presunto";
    }
}

interface PizzariaFactory {
    Pizza criarPizza();
    Calzone criarCalzone();
}

class PizzariaPizzaiolo1 implements PizzariaFactory {
    @Override
    public Pizza criarPizza() {
        return new PizzaCalabresa();
    }

    @Override
    public Calzone criarCalzone() {
        return new CalzoneCalabresa();
    }
}

class PizzariaPizzaiolo2 implements PizzariaFactory {
    @Override
    public Pizza criarPizza() {
        return new PizzaPresunto();
    }

    @Override
    public Calzone criarCalzone() {
        return new CalzonePresunto();
    }
}

    