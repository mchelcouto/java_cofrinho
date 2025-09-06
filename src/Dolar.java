public class Dolar extends Moeda {
    
    public Dolar(double valor) {
        super(valor);
    }
    
    @Override
    public String info() {
        return "Dólar - Valor: $" + String.format("%.2f", valor);
    }
    
    @Override
    public double converter() {
        return valor * 5.20;
    }
    
    @Override
    public String toString() {
        return info();
    }
}