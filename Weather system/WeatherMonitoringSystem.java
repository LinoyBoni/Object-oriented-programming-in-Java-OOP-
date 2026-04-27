//package Observables;

//import Nimbus1.Nimbus1Clock;
//import Nimbus1.Nimbus1PressureSensor;
//import Nimbus1.Nimbus1TemepratureSensor;
//import Observers.Observer;

public class WeatherMonitoringSystem
{
    private static WeatherMonitoringSystem weatherMonitoringSystem = null;
    private Nimbus1TemepratureSensor nimbus1TemepratureSensor;
    private Nimbus1PressureSensor nimbus1PressureSensor;
    private PressureTrendSensor pressureTrendSensor;
    private Nimbus1Clock nimbus1Clock;

    public WeatherMonitoringSystem()
    {
        System.out.println("WeatherMonitoringSystem was created");
        nimbus1Clock = (Nimbus1Clock) Nimbus1Clock.theInstance();
        nimbus1PressureSensor = new Nimbus1PressureSensor("nimbus1",1100);
        nimbus1TemepratureSensor = new Nimbus1TemepratureSensor("nimbus1",700);
        pressureTrendSensor = new PressureTrendSensor();
        addPressureObserver(pressureTrendSensor);
    }

    public static WeatherMonitoringSystem theInstance()
    {
        if (weatherMonitoringSystem == null)
            weatherMonitoringSystem = new WeatherMonitoringSystem();
        return weatherMonitoringSystem;
    }

    public void addPressureObserver(Observer observer)
    {
        nimbus1PressureSensor.register(observer);
    }

    public void addPressureTrendObserver(Observer observer)
    {
        pressureTrendSensor.register(observer);
    }

    public void addTempObserver(Observer observer)
    {
        nimbus1TemepratureSensor.register(observer);
    }
}
