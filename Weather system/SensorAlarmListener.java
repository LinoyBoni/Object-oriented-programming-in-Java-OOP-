//package Observables;

public class SensorAlarmListener implements AlarmListener
{

    private Sensor itsSensor;
    public SensorAlarmListener(Sensor sensor )
    {
        itsSensor=sensor;
    }

    @Override
    public void wakeUp()
    {
        itsSensor.check();
    }
}
