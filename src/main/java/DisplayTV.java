public class DisplayTV implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("DisplayTv: Температура обновилась: " + temperature + " градусов.");
    }
}

