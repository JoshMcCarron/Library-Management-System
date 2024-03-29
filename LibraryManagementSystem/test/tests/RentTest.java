package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RentTest.test1");
        userTypes.User user0 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems3 = null;
        // The following exception was thrown during execution in test generation
        try {
            actions.Rent rent4 = new actions.Rent(user0, "", "hi!", maintainPhysicalItems3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RentTest.test2");
        userTypes.User user0 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems3 = null;
        // The following exception was thrown during execution in test generation
        try {
            actions.Rent rent4 = new actions.Rent(user0, "", "", maintainPhysicalItems3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RentTest.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RentTest.test4");
        userTypes.User user0 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems3 = null;
        // The following exception was thrown during execution in test generation
        try {
            actions.Rent rent4 = new actions.Rent(user0, "hi!", "hi!", maintainPhysicalItems3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RentTest.test5");
        userTypes.User user0 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems3 = null;
        // The following exception was thrown during execution in test generation
        try {
            actions.Rent rent4 = new actions.Rent(user0, "hi!", "", maintainPhysicalItems3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

