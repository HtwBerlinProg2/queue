import java.util.ArrayList;

        public interface Queue {

            ArrayList<String> removeQueue(ArrayList<String> place);
            ArrayList<String> addQueue(String element);
            String  showFirst(ArrayList<String> place);
            String showlast(ArrayList<String> place);
            String checkCapacity(ArrayList<String> place);
        }
