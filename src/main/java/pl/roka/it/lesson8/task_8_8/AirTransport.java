package pl.roka.it.lesson8.task_8_8;

public abstract class AirTransport extends Transport{
    private double wingspan;
    private double minRunwayLength;

    public double getWingspan() {
        return wingspan;
    }

    public double getMinRunwayLength() {
        return minRunwayLength;
    }

    @Override
    public String showInfo() {
        return "AirTransport{" +
                "wingspan=" + wingspan +
                ", minRunwayLength=" + minRunwayLength +
                 super.showInfo() +
                '}';
    }
}
