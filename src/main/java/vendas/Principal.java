package vendas;

public class Principal {
    public static void main(String[] args) {
        //Objeto Serviço:
        var terapia = new Servico("Terapia", 150, 4);
        terapia.exibeInfo();
        System.out.println("O valor desse Pacote será: " + terapia.desconto());
        //Objeto Produto:
        var stella = new Produto("Vestido SM", 589.99, 2);
        stella.exibeInfo();
        System.out.println("Valor final da compra: "+ stella.desconto());
    }
}
