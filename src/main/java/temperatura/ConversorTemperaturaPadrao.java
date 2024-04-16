package temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void fahrenheitParaCelsius(double temp) {
        double celsius = (temp - 32)/ 1.8;

        System.out.println("A conversao de: " +temp+"°F para Celsius é: "+celsius+"°C");

    }

    @Override
    public void celsiusParaFahrenheit (double temp) {
        double fahren = (temp*1.8) + 32;

        System.out.println("A conversao de: " +temp+"°C para Fahrenheit é: "+fahren+"°F");
    }
}

