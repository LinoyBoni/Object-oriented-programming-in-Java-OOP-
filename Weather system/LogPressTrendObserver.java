//package Observers;

public class LogPressTrendObserver implements Observer
{
    private Log myLog;

    public LogPressTrendObserver(Log log1)
    {
        System.out.println("LogPressTrendObserver was created");
        myLog = log1;
    }
    @Override
    public void update(int trend)
    {
        myLog.printTrend(trend);
    }
}
