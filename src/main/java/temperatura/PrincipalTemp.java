package temperatura;

public class PrincipalTemp {
    public static void main(String[] args) {
        var conversor = new ConversorTemperaturaPadrao();

        conversor.fahrenheitParaCelsius(68);
        conversor.celsiusParaFahrenheit(0);
    }
}
