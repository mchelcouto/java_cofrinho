public class Real extends Moeda {
    
    public Real(double valor) {
        super(valor);
    }
    
    @Override
    public String info() {
        return "Real - Valor: R$" + String.format("%.2f", valor);
    }
    
    @Override
    public double converter() {
        return valor;
    }
    
    @Override
    public String toString() {
        return info();
    }
}