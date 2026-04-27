//package Observables;

//import Observers.Observer;

enum Trend
{
    RISING, FALLING, STABLE
}

public class PressureTrendSensor extends Observable implements Observer
{
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    private Trend pressureState;
    private Trend lastState;

    public PressureTrendSensor()
    {
        pressureState=Trend.STABLE;
        System.out.println("PressureTrendSensor observes pressure");
    }

    public Trend calc()
    {
        if(lastReading1<lastReading2 && lastReading2<lastReading3)
            return Trend.FALLING;
        if(lastReading1>lastReading2 && lastReading2>lastReading3)
            return Trend.RISING;
        return Trend.STABLE;
    }

    public void check()
    {
        Trend tmp = calc();
        if(tmp!=pressureState)
            notifyObservers(tmp.ordinal());
        lastState = pressureState;
        pressureState = tmp;
    }

    @Override
    public void update(int data)
    {
        lastReading3 = lastReading2;
        lastReading2 = lastReading1;
        lastReading1 = data;
        check();
    }
}
