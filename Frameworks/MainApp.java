package sortingClean;

// TODO: Add java classes (in separate files for annotations and aspects)
import.javax.inject.Named;
import.javax.enterprise.inject.produces;
import org.jboss.weld.environment.se.weldcontainer;

public class MainApp {
    public static void main(String[] args) {
        // TODO: Change this line to initialize an injected AlgorithmRunner
        WeldContainer c = new Weld().initialize();
        AlgorithmRunner algorithmRunner = c.select(AlgorithmRunner.class).get();
        algorithmRunner.runAlgorithms();
    }
    // TODO: Add producers}
    @Produces
    public int arrSize()
    { return 100000;}

    @Produces
    public @Named("Quadraticalgorithm") sortingAlgorithm<Integer> QuadraticAlgorithmGenerator()
    {return new BubbleSort();}

    @Produces
    public @Named("NlogNalgorithm") SortingAlgorithm<integer> NlogNAlgorithmGenerator()
    {return new QuickSort();}