		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.

		 */

package datastructure;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;



public class UseMap {
    public static void main(String[] args) {
        Map<Long,List<String>> myMap=new HashMap<Long,List<String>>();
        List<String> myList=new ArrayList<String>();
        myList.add("Kamran");
        myList.add("Salman");
        myMap.put(new Long(1), myList);
        for(int i=0;i<myList.size();i++)
            System.out.println(myMap.get(new Long(1)).get(i));

        // forEach loop as of Java 1.8
        System.out.println("Display using for each loop");
        for (String content:args) {
            System.out.println( myMap.get(content));
        }
    }
}