import java.util.Stack;
import java.util.EmptyStackException;


public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		//create a stack
		Stack< Number > stack = new Stack< Number >();

		//use push method
            //push long value
        stack.push(69L);
        System.out.println("Pushed 69L");
        printStack( stack );
        stack.push(5250);
        System.out.println(" Pushed 5250");
        printStack( stack );
        stack.push( 6.9F );
        System.out.println("Pushed out 6.9F");
        printStack( stack );
        stack.push( 1234.567 );
        System.out.println("Pushed out 1234.567");
        printStack( stack );


        //remove items from stack
        try
        {
            Number removedObject = null;

            // pop elements from stack
            while ( true )
            {
                // use pop method
                removedObject = stack.pop();
                System.out.printf( "Popped %s\n", removedObject );
                printStack( stack );
            }
        }
        catch ( EmptyStackException emptyStackException )
        {
            emptyStackException.printStackTrace();
        }

	}


	// display Stack contents
    private static void printStack( Stack< Number > stack)
    {
        if (stack.isEmpty() )
            System.out.println( "stack is empty" );

    }
}
