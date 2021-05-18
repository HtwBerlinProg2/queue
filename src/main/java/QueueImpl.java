import java.util.ArrayList;

public class QueueImpl implements Queue {
   private  int Size = 6;
    private final ArrayList<String> Queue = new ArrayList<>(Size);

    public QueueImpl(){

    }

    @Override
    public ArrayList<String> removeQueue() { // remove the first element from the queue
        Queue.remove(0);
        return Queue;
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
    public String showFirst() {
        return this.Queue.get(0);
    }

    @Override // show  the last element
    public String showlast() {
        return this.Queue.get(Queue.size() -1);
    }

    @Override
    public String checkCapacity() {// Queue capacity checks if its full or empty
        if(Queue.size() -1 == 0){return "queue is empty";}
        if(Queue.size() -1 == this.Size){return "queue is full";}
        return "The Queue has ("+this.Queue.size()+") elements.";
    }

}