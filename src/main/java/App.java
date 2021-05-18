public class App {

    public static void main(String[] args){
        QueueImpl q = new QueueImpl();

      //  q.checkCapacity();
        System.out.println(q.addQueue("Joker"));
        System.out.println(q.addQueue("Batman"));
        System.out.println(q.addQueue("two-Faces"));



    }
}
