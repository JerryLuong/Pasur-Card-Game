package pasur;
import java.util.ArrayList;
public class Publisher {
    private ArrayList<Observer> observers;
    public Publisher(){
        observers = new ArrayList<Observer>();
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    /**
     *
     * @param source the publisher of the event
     * @param value the text the publisher wants to publish in the output text file
     */
    public void publishEvent(Publisher source,String value){
        for(Observer o: observers){
            o.onPropertyEvent(this, value);
        }
    }
}
