package calculaSala;

public class CalculaSalaRetanguar implements CalculoGeometrico {


    @Override
    public double calculaArea(double l, double c) {
        double area = l * c;
        return area;
    }

    @Override
    public double calculaperimetro(double l, double c) {
        double perimetro = l + c;
        return perimetro;
    }
}
