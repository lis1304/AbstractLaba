package Abstr;

public class MainClass {
    public static void main(String[] args) {
        EarthRun bus = new EarthRun("наземный", "гражданское");
        EarthRun track = new EarthRun("наземный", "военное");

        AirRun tu154 = new AirRun("воздужный","гражданское");
        AirRun su34 = new AirRun("воздужный","военное");

        DownWater akula = new DownWater("подводный","военное");

        RainRun poezd = new RainRun("железнодорожный","гражданское");

        WaterRun meteor = new WaterRun("морской","гражданское");

        System.out.println(bus);

        if (tu154.equals(su34)){
            System.out.println("равны");
        }

    }
}
