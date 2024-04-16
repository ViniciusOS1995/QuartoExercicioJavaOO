package monetario;

public class Principal {
    public static void main(String[] args) {
        var conversorMoeda = new ConversorMoeda();
        System.out.println("Convertendo 12,00 Dolares para real: " + conversorMoeda.converterDolarParaReal(12));
    }
}
