public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayPhone displayPhone = new DisplayPhone();
        DisplayTV displayTV = new DisplayTV();

        weatherStation.addObserver(displayPhone);
        weatherStation.addObserver(displayTV);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
