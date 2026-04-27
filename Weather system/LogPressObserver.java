//package Observers;

public class LogPressObserver implements Observer
{
    private Log myLog;
    public LogPressObserver(Log log1)
    {
        System.out.println("LogPressObserver was created");
        myLog = log1;
    }
    @Override
    public void update(int data)
    {
        myLog.printPressure(data);
    }
}
