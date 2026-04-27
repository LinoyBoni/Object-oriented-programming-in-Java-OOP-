//package Observers;

//import Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws)
    {
        System.out.println("MonitoringScreen was created");
        ws.addTempObserver(new MSTempObserver(this));
        ws.addPressureObserver(new MSPressObserver(this));

    }

    public void displayPressure(int data)
    {
        System.out.println("MonitoringScreen: pressure = "+data+" millibars");
    }

    public void displayTemp(int data)
    {
        System.out.println("MonitoringScreen: temperature = "+data+" Celsius");
    }
}
