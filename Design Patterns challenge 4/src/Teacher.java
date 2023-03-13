import java.util.Arrays;

public class Teacher implements ObservedSubject {

    private Observer[] observers = new Observer[0];

    public void register(Observer obj){
        this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
        this.observers[this.observers.length - 1] = obj;
    }

    public void unregister(Observer obj){
        int removedIndex = -1;

        for(int i = 0; i < this.observers.length; i++){
            if(this.observers[i].equals(obj)){
                removedIndex = i;
                break;
            }
        }
    }

    public void notifyObservers(String message){
        for(int i = 0; i < this.observers.length; i++)
            this.observers[i].update(message);
    }

    public void teach(String topic){
        for(int i = 0; i < this.observers.length ; i++)
            this.observers[i].update(topic);
    }
}
