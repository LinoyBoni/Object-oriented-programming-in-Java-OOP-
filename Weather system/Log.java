//package Observers;

//import Observables.WeatherMonitoringSystem;

public class Log
{
    public Log(WeatherMonitoringSystem ws)
    {
        System.out.println("Log was created");
        ws.addPressureObserver(new LogPressObserver(this));
        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
    }

    public void printPressure(int data)
    {
        System.out.println("Log: pressure = "+data+" millibars");
    }

    public void printTrend(int trend)
    {
        String tmp="";
        if(trend==0)
            tmp="RISING";
        if(trend==1)
            tmp="FALLING";
        if(trend==2)
            tmp="STABLE";
        System.out.println("Log: pressure trend = "+tmp);
    }
}
