//package Observables;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecrement;
    private AlarmListener alarmListener;
    public AlarmClockRecord(int a_interval, AlarmListener pal) {
        interval=intervalDecrement=a_interval;
        alarmListener=pal;
    }

    public int getIntervalDecrement()
    {
        return intervalDecrement;
    }

    public AlarmListener getAlarmListener()
    {
        return alarmListener;
    }

    public int getInterval()
    {
        return interval;
    }

    public void setIntervalDecrement(int intervalDecrement)
    {
        this.intervalDecrement = intervalDecrement;
    }
}
