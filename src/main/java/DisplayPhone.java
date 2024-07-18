public class DisplayPhone implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("DisplayPhone: Температура обновилась: " + temperature + " градусов.");
    }
}
