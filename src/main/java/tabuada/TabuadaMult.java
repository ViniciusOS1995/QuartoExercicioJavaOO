package tabuada;

public class TabuadaMult implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        System.out.println("Essa é a tabuada do: " + num);
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num +" X " + i +" = " + resultado);
        }
    }
}
