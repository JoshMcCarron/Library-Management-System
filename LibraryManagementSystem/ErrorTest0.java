import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = fineContext0.executeStrategy();
    }
}

