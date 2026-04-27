//Efrat Kelner 211554043
//Linoy Boni 211820824
public class Plane implements Movable, Comparable{
    public static final int HEIGHT_LIMIT = 1500;
    int licenceNumber;
    Location source, destination;
    int maximalHeight;

    public Plane(int id, Location src, Location dst, int maxHeight) {
        licenceNumber = id;
        source = src;
        destination = dst;
        maximalHeight = maxHeight;
    }

    @Override
	public String toString() {
		return String.format("licence = %d, source = %s, destination = %s, maxHeight = %d",
				licenceNumber, source, destination, maximalHeight);
	}
	
    @Override
    public String getType() {
        return "Plane";
    }

    @Override
    public int getId() {
        return licenceNumber;
    }

    @Override
    public Location getSource() {
        return source;
    }

    @Override
    public Location getDestination() {
        return destination;
    }

    @Override
    public String getCurrentLocation() {
        // TODO: Implement.
        return getSource().toString();
    }

    @Override
    public void move() {
        // TODO: implement;
        Location lastSource = source;
        source = destination;
        destination = lastSource;
    }

    @Override
    public int compareTo(Object o) {
        int MaxHeight2 = ((Plane)o).maximalHeight;
        return maximalHeight - MaxHeight2;
    }
}
