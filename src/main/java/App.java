public class App {

    public static void main(String[] args){
        QueueImpl q = new QueueImpl();

      //  q.checkCapacity();
        System.out.println(q.add("Joker"));
        System.out.println(q.add("Batman"));
        System.out.println(q.showlast());
        System.out.println(q.showFirst());
        System.out.println(q.checkCapacity());
        System.out.println(q.remove());


    }
}
