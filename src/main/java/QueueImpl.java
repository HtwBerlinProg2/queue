import java.util.ArrayList;

public class QueueImpl implements Queue {
   private  int Size = 6;
    private final ArrayList<String> Queue = new ArrayList<>(Size);

    public QueueImpl(){

    }

    @Override
    public ArrayList<String> removeQueue(ArrayList<String> place) { // remove the first element from the queue
        place.remove(0);
        return place;
    }

   @Override
    public ArrayList<String> addQueue(String element) {
     if(Queue.size()!= Size){
       int i=Queue.size();
       Queue.add(i,element);}
     else { Size++;
         int i=Queue.size();
         Queue.add(i,element);
     }
       return this.Queue;
    }

    @Override // show the first element
    public String showFirst(ArrayList<String> place) {
        return place.get(0);
    }

    @Override // show  the last element
    public String showlast(ArrayList<String> place) {
        return place.get(place.size() -1);
    }

    @Override
    public String checkCapacity(ArrayList<String> place) {// Queue capacity checks if its full or empty
        if(place.size() -1 == 0){return "queue is empty";}
        if(place.size() -1 == place.lastIndexOf(place)){return "queue is full";}
        return "The Queue has ("+place.size()+") elements.";
    }

}