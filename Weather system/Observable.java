//package Observables;

//import Observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class Observable
{
    private List<Observer> myObservers;
    public Observable()
    {
        myObservers = new ArrayList<Observer>();
    }

    public void register(Observer observer)
    {
        myObservers.add(observer);
        if(observer.getClass().getName().contains("LogPressObserver"))
            System.out.println("LogPressObserver observes pressure");
        if(observer.getClass().getName().contains("LogPressTrendObserver"))
            System.out.println("LogPressTrendObserver observes pressure trend");
        if(observer.getClass().getName().contains("MSPressObserver"))
            System.out.println("MSPressObserver observes pressure");
        if(observer.getClass().getName().contains("MSTempObserver"))
            System.out.println("MSTempObserver observes temperature");
    }

    public void notifyObservers(int data)
    {
        for(Observer observer:myObservers)
        {
            observer.update(data);
        }
    }
}
