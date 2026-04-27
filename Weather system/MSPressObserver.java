//package Observers;

public class MSPressObserver implements Observer
{

    private MonitoringScreen itsMonitoringScreen;

    public MSPressObserver(MonitoringScreen monitoringScreen)
    {
        System.out.println("MSPressObserver was created");
        itsMonitoringScreen=monitoringScreen;
    }

    @Override
    public void update(int data)
    {
        itsMonitoringScreen.displayPressure(data);
    }
}
