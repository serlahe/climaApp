package clima;


public class App {

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static boolean esClimaFrio(double temperaturaCelsius) {
        return temperaturaCelsius < 15;
    }

    public static void main(String[] args) {
        System.out.println("ClimaApp");
    }
}