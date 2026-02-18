package Entidades;

public class FuncTerceirizado extends Funcionario{

    public Double gettaxaAdicional() {
        return taxaAdicional;
    }

    public void settaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    private Double taxaAdicional;

    public FuncTerceirizado(){
        super();
    }
    public FuncTerceirizado(String nome, int horas, double valorPorHora, Double additionalCharge) {
        super(nome, horas, valorPorHora);
        this.taxaAdicional = taxaAdicional;
    }
    @Override
    public double pagamento() {
        return super.pagamento() + taxaAdicional * 1.1;
    }
}
