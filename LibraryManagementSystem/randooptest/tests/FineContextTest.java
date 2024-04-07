package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FineContextTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test002");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        java.lang.Class<?> wildcardClass3 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test003");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        java.lang.Class<?> wildcardClass5 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test004");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test005");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test006");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test007");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        java.lang.Class<?> wildcardClass1 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test008");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        java.lang.Class<?> wildcardClass7 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test009");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        java.lang.Class<?> wildcardClass9 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test010");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        java.lang.Class<?> wildcardClass11 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test011");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test012");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test013");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test014");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        java.lang.Class<?> wildcardClass13 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test015");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test016");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        java.lang.Class<?> wildcardClass15 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test017");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        java.lang.Class<?> wildcardClass17 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test018");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test019");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test020");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        java.lang.Class<?> wildcardClass21 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test021");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        java.lang.Class<?> wildcardClass19 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test022");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test023");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        java.lang.Class<?> wildcardClass23 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test024");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test025");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        java.lang.Class<?> wildcardClass25 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test026");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test027");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test028");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        java.lang.Class<?> wildcardClass27 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test029");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test030");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        java.lang.Class<?> wildcardClass29 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test031");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test032");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        java.lang.Class<?> wildcardClass31 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test033");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test034");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        java.lang.Class<?> wildcardClass35 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test035");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        java.lang.Class<?> wildcardClass33 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test036");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        java.lang.Class<?> wildcardClass37 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test037");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        java.lang.Class<?> wildcardClass41 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test038");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test039");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        java.lang.Class<?> wildcardClass39 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test040");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test041");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test042");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test043");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        java.lang.Class<?> wildcardClass43 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test044");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        java.lang.Class<?> wildcardClass45 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test045");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        java.lang.Class<?> wildcardClass47 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test046");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test047");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test048");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test049");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test050");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test051");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        java.lang.Class<?> wildcardClass49 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test052");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        // The following exception was thrown during execution in test generation
        try {
            double double53 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test053");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        java.lang.Class<?> wildcardClass51 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test054");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test055");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        java.lang.Class<?> wildcardClass55 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test056");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        java.lang.Class<?> wildcardClass59 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test057");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        java.lang.Class<?> wildcardClass57 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test058");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        // The following exception was thrown during execution in test generation
        try {
            double double59 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test059");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        // The following exception was thrown during execution in test generation
        try {
            double double61 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test060");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        java.lang.Class<?> wildcardClass61 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test061");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test062");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        java.lang.Class<?> wildcardClass53 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test063");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        // The following exception was thrown during execution in test generation
        try {
            double double65 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test064");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        java.lang.Class<?> wildcardClass65 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test065");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        // The following exception was thrown during execution in test generation
        try {
            double double67 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test066");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test067");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        java.lang.Class<?> wildcardClass67 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test068");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        java.lang.Class<?> wildcardClass63 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test069");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        java.lang.Class<?> wildcardClass69 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test070");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test071");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        java.lang.Class<?> wildcardClass71 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test072");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test073");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        java.lang.Class<?> wildcardClass75 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test074");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        // The following exception was thrown during execution in test generation
        try {
            double double75 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test075");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        java.lang.Class<?> wildcardClass73 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test076");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        java.lang.Class<?> wildcardClass77 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test077");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test078");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        java.lang.Class<?> wildcardClass79 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test079");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        // The following exception was thrown during execution in test generation
        try {
            double double79 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test080");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test081");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        java.lang.Class<?> wildcardClass81 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test082");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        java.lang.Class<?> wildcardClass83 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test083");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test084");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        // The following exception was thrown during execution in test generation
        try {
            double double83 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test085");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        java.lang.Class<?> wildcardClass85 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test086");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        // The following exception was thrown during execution in test generation
        try {
            double double85 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test087");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test088");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        java.lang.Class<?> wildcardClass87 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test089");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        java.lang.Class<?> wildcardClass89 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test090");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test091");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        // The following exception was thrown during execution in test generation
        try {
            double double91 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test092");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        java.lang.Class<?> wildcardClass91 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test093");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test094");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        java.lang.Class<?> wildcardClass95 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test095");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        java.lang.Class<?> wildcardClass93 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test096");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        userTypes.FineStrategy fineStrategy95 = null;
        fineContext0.setStrategy(fineStrategy95);
        userTypes.FineStrategy fineStrategy97 = null;
        fineContext0.setStrategy(fineStrategy97);
        // The following exception was thrown during execution in test generation
        try {
            double double99 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test097");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        userTypes.FineStrategy fineStrategy95 = null;
        fineContext0.setStrategy(fineStrategy95);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test098");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        userTypes.FineStrategy fineStrategy95 = null;
        fineContext0.setStrategy(fineStrategy95);
        userTypes.FineStrategy fineStrategy97 = null;
        fineContext0.setStrategy(fineStrategy97);
        java.lang.Class<?> wildcardClass99 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test099");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        userTypes.FineStrategy fineStrategy93 = null;
        fineContext0.setStrategy(fineStrategy93);
        userTypes.FineStrategy fineStrategy95 = null;
        fineContext0.setStrategy(fineStrategy95);
        java.lang.Class<?> wildcardClass97 = fineContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FineContextTest.test100");
        userTypes.FineContext fineContext0 = new userTypes.FineContext();
        userTypes.FineStrategy fineStrategy1 = null;
        fineContext0.setStrategy(fineStrategy1);
        userTypes.FineStrategy fineStrategy3 = null;
        fineContext0.setStrategy(fineStrategy3);
        userTypes.FineStrategy fineStrategy5 = null;
        fineContext0.setStrategy(fineStrategy5);
        userTypes.FineStrategy fineStrategy7 = null;
        fineContext0.setStrategy(fineStrategy7);
        userTypes.FineStrategy fineStrategy9 = null;
        fineContext0.setStrategy(fineStrategy9);
        userTypes.FineStrategy fineStrategy11 = null;
        fineContext0.setStrategy(fineStrategy11);
        userTypes.FineStrategy fineStrategy13 = null;
        fineContext0.setStrategy(fineStrategy13);
        userTypes.FineStrategy fineStrategy15 = null;
        fineContext0.setStrategy(fineStrategy15);
        userTypes.FineStrategy fineStrategy17 = null;
        fineContext0.setStrategy(fineStrategy17);
        userTypes.FineStrategy fineStrategy19 = null;
        fineContext0.setStrategy(fineStrategy19);
        userTypes.FineStrategy fineStrategy21 = null;
        fineContext0.setStrategy(fineStrategy21);
        userTypes.FineStrategy fineStrategy23 = null;
        fineContext0.setStrategy(fineStrategy23);
        userTypes.FineStrategy fineStrategy25 = null;
        fineContext0.setStrategy(fineStrategy25);
        userTypes.FineStrategy fineStrategy27 = null;
        fineContext0.setStrategy(fineStrategy27);
        userTypes.FineStrategy fineStrategy29 = null;
        fineContext0.setStrategy(fineStrategy29);
        userTypes.FineStrategy fineStrategy31 = null;
        fineContext0.setStrategy(fineStrategy31);
        userTypes.FineStrategy fineStrategy33 = null;
        fineContext0.setStrategy(fineStrategy33);
        userTypes.FineStrategy fineStrategy35 = null;
        fineContext0.setStrategy(fineStrategy35);
        userTypes.FineStrategy fineStrategy37 = null;
        fineContext0.setStrategy(fineStrategy37);
        userTypes.FineStrategy fineStrategy39 = null;
        fineContext0.setStrategy(fineStrategy39);
        userTypes.FineStrategy fineStrategy41 = null;
        fineContext0.setStrategy(fineStrategy41);
        userTypes.FineStrategy fineStrategy43 = null;
        fineContext0.setStrategy(fineStrategy43);
        userTypes.FineStrategy fineStrategy45 = null;
        fineContext0.setStrategy(fineStrategy45);
        userTypes.FineStrategy fineStrategy47 = null;
        fineContext0.setStrategy(fineStrategy47);
        userTypes.FineStrategy fineStrategy49 = null;
        fineContext0.setStrategy(fineStrategy49);
        userTypes.FineStrategy fineStrategy51 = null;
        fineContext0.setStrategy(fineStrategy51);
        userTypes.FineStrategy fineStrategy53 = null;
        fineContext0.setStrategy(fineStrategy53);
        userTypes.FineStrategy fineStrategy55 = null;
        fineContext0.setStrategy(fineStrategy55);
        userTypes.FineStrategy fineStrategy57 = null;
        fineContext0.setStrategy(fineStrategy57);
        userTypes.FineStrategy fineStrategy59 = null;
        fineContext0.setStrategy(fineStrategy59);
        userTypes.FineStrategy fineStrategy61 = null;
        fineContext0.setStrategy(fineStrategy61);
        userTypes.FineStrategy fineStrategy63 = null;
        fineContext0.setStrategy(fineStrategy63);
        userTypes.FineStrategy fineStrategy65 = null;
        fineContext0.setStrategy(fineStrategy65);
        userTypes.FineStrategy fineStrategy67 = null;
        fineContext0.setStrategy(fineStrategy67);
        userTypes.FineStrategy fineStrategy69 = null;
        fineContext0.setStrategy(fineStrategy69);
        userTypes.FineStrategy fineStrategy71 = null;
        fineContext0.setStrategy(fineStrategy71);
        userTypes.FineStrategy fineStrategy73 = null;
        fineContext0.setStrategy(fineStrategy73);
        userTypes.FineStrategy fineStrategy75 = null;
        fineContext0.setStrategy(fineStrategy75);
        userTypes.FineStrategy fineStrategy77 = null;
        fineContext0.setStrategy(fineStrategy77);
        userTypes.FineStrategy fineStrategy79 = null;
        fineContext0.setStrategy(fineStrategy79);
        userTypes.FineStrategy fineStrategy81 = null;
        fineContext0.setStrategy(fineStrategy81);
        userTypes.FineStrategy fineStrategy83 = null;
        fineContext0.setStrategy(fineStrategy83);
        userTypes.FineStrategy fineStrategy85 = null;
        fineContext0.setStrategy(fineStrategy85);
        userTypes.FineStrategy fineStrategy87 = null;
        fineContext0.setStrategy(fineStrategy87);
        userTypes.FineStrategy fineStrategy89 = null;
        fineContext0.setStrategy(fineStrategy89);
        userTypes.FineStrategy fineStrategy91 = null;
        fineContext0.setStrategy(fineStrategy91);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = fineContext0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.FineStrategy.calculateFine()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

