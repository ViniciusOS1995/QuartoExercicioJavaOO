package calculaSala;

public class Principal {
    public static void main(String[] args) {
        var calculaSalaAula = new CalculaSalaRetanguar();

        System.out.println("Esta sala de aula tem: ");
        System.out.println(calculaSalaAula.calculaArea(12,8)+ "m² de area e");
        System.out.println(calculaSalaAula.calculaperimetro(12,8)+"m de perimetro");
    }
}
