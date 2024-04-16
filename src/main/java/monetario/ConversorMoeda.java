package monetario;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double dolar) {
        double real = dolar*5.35;
        return real;
    }
}
