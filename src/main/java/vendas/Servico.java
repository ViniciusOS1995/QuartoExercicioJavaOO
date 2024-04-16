package vendas;

import java.util.Scanner;

public class Servico implements Vendavel{
    public Servico(String nome, double valorHora, double quantiHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.quantiHora = quantiHora;
    }

    private String nome;
    private double valorHora;
    private double quantiHora;

    public void exibeInfo(){
        System.out.println("Serviço aplicado: "+ nome);
        System.out.println("Valor hora: "+ valorHora);
        System.out.println("Quantidades de hora do serviço: "+ quantiHora +"\n");
    }

    @Override
    public double precoTotal() {
        return valorHora * quantiHora;
    }

    @Override
    public double desconto() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("O valor vai ser pago a vista? ");
        System.out.println("Se sim precione o digito 1 ");
        System.out.println("(qualquer outra coisa digitada será desconsiderado o desconto)");
        int ler = leitura.nextInt();
        if (ler == 1){
            System.out.println("Aplicando 10% de desconto: ");
            return precoTotal() - ((10.0/100.0)*precoTotal());
        }else {
            return precoTotal();
        }
    }
}
