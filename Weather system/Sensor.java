//package Observables;

public abstract class Sensor extends Observable
{
    private int lastReading;
    private int interval;
    private String type;

    public Sensor(String s_type, int s_interval)
    {
        type = s_type;
        interval = s_interval;
        lastReading = 0;
        AlarmClock.instance.register(interval,new SensorAlarmListener(this));
        if(this.getClass().getName().contains("Temeprature"))
            System.out.println("temperature registered to clock");
        if(this.getClass().getName().contains("Pressure"))
            System.out.println("pressure registered to clock");
    }

    public abstract int read();
    public void check()
    {
        int tmp = read();
        if(tmp!=lastReading)
        {
            lastReading = tmp;
            notifyObservers(tmp);
        }
    }
}
