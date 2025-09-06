import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;
    
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }
    
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }
    
    public void remover(Moeda moeda) {
        boolean removida = listaMoedas.remove(moeda);
        if (removida) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada no cofrinho!");
        }
    }
    
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }
        
        System.out.println("\n=== MOEDAS NO COFRINHO ===");
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.println((i + 1) + ". " + listaMoedas.get(i).info());
        }
        System.out.println("========================\n");
    }
    
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
    
    public Moeda getMoeda(int indice) {
        if (indice >= 0 && indice < listaMoedas.size()) {
            return listaMoedas.get(indice);
        }
        return null;
    }
    
    public boolean estaVazio() {
        return listaMoedas.isEmpty();
    }
    
    public int tamanho() {
        return listaMoedas.size();
    }
}