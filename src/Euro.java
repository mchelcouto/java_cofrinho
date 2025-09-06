public class Euro extends Moeda {
    
    public Euro(double valor) {
        super(valor);
    }
    
    @Override
    public String info() {
        return "Euro - Valor: €" + String.format("%.2f", valor);
    }
    
    @Override
    public double converter() {
        return valor * 5.65;
    }
    
    @Override
    public String toString() {
        return info();
    }
}