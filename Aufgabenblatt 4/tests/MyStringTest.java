import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    MyString myString;
    Object anObject;
    Boolean result;


    @Test
    public void sameObject(){
        // Setup
        this.myString = new MyString("a");
        this.anObject = myString;
        // Exercise
        this.result = myString.equals(myString);
        // Verify
        assertTrue(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void differentInstance() {
        // Setup
        this.myString = new MyString("a");
        this.anObject = "a";
        // Exercise
        this.result = myString.equals(anObject);
        // Verify
        assertFalse(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void sameString(){
        // Setup
        this.myString = new MyString("a");
        this.anObject = new MyString("a");
        // Exercise
        this.result = myString.equals(anObject);
        // Verify
        assertTrue(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void differentString(){
        // Setup
        this.myString = new MyString("a");
        this.anObject = new MyString("b");
        // Exercise
        this.result = myString.equals(anObject);
        // Verify
        assertFalse(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void emptyString(){
        // Setup
        this.myString = new MyString("");
        this.anObject = new MyString("");
        // Exercise
        result = myString.equals(anObject);
        // Verify
        assertTrue(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }
}