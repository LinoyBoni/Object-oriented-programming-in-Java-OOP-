//package Nimbus1;

//import Observables.Sensor;
import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor
{
    private Random md;
    public Nimbus1TemepratureSensor(String s_type, int s_interval)
    {
        super(s_type, s_interval);
    }

    @Override
    public int read() {
        md = RandomSupplier.getRnd();
        return md.nextInt(40);
    }
}
