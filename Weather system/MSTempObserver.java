//package Observers;

public class MSTempObserver implements Observer
{
    private MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen monitoringScreen)
    {
        System.out.println("MSTempObserver was created");
        itsMonitoringScreen = monitoringScreen;
    }

    @Override
    public void update(int data)
    {
        itsMonitoringScreen.displayTemp(data);
    }
}
