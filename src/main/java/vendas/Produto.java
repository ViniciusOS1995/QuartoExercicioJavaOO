package vendas;

import java.util.Scanner;

public class Produto implements Vendavel{
    public Produto(String nome, double valor, double quant) {
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }

    private String nome;
    private double valor;
    private double quant;

    public void exibeInfo(){
        System.out.println("Serviço aplicado: "+ nome);
        System.out.println("Valor hora: "+ valor);
        System.out.println("Quantidades de hora do serviço: "+ quant +"\n");
    }

    @Override
    public double precoTotal() {
        return valor * quant;
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
