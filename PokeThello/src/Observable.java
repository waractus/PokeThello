
public interface Observable {

	public void registerObs(Observer obs);
	public void unregisterObs(Observer obs);
	public void notifyObs();
	
}
