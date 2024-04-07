package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PurchaseTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test001");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        purchase2.setUserId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test002");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test003");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test004");
        actions.Purchase purchase3 = new actions.Purchase(10, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test005");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setItemId(10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test006");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 52);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test007");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) -1, (int) (byte) -1, 101);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test008");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        java.lang.Class<?> wildcardClass5 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test009");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        java.lang.Class<?> wildcardClass6 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test010");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, 10);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test011");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getItemId();
        int int6 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test012");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test013");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 100, (int) (short) 1, 101);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test014");
        actions.Purchase purchase2 = new actions.Purchase(102, 32);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test015");
        actions.Purchase purchase2 = new actions.Purchase(6, (int) (short) -1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test016");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test017");
        actions.Purchase purchase3 = new actions.Purchase((int) ' ', (int) (byte) 0, 1);
        purchase3.setItemId(32);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test018");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) (short) -1, 101);
        purchase3.setPurchaseId(32);
        java.lang.Class<?> wildcardClass6 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test019");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(1);
        purchase2.setPurchaseId((int) 'a');
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test020");
        actions.Purchase purchase3 = new actions.Purchase(10, (int) (short) 0, 6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test021");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(1);
        int int5 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test022");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) (short) -1, 101);
        purchase3.setPurchaseId(98);
        int int6 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test023");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getItemId();
        java.lang.Class<?> wildcardClass5 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test024");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) -1, 52);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test025");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) (byte) -1);
        purchase3.setItemId((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test026");
        actions.Purchase purchase2 = new actions.Purchase(9, 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test027");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setUserId(97);
        int int5 = purchase2.getItemId();
        java.lang.Class<?> wildcardClass6 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test028");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getItemId();
        int int5 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test029");
        actions.Purchase purchase2 = new actions.Purchase(101, 98);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test030");
        actions.Purchase purchase2 = new actions.Purchase(9, 9);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test031");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) 10, (int) '#');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test032");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setUserId(103);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test033");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 1, 6);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test034");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        int int10 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test035");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getItemId();
        purchase3.setPurchaseId(3);
        java.lang.Class<?> wildcardClass7 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test036");
        actions.Purchase purchase2 = new actions.Purchase(101, (int) (byte) -1);
        purchase2.setPurchaseId(1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test037");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 0, 35, (int) (byte) 10);
        int int4 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test038");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        int int6 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test039");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, (-1));
        int int3 = purchase2.getPurchaseId();
        int int4 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test040");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        int int11 = purchase3.getUserId();
        int int12 = purchase3.getUserId();
        int int13 = purchase3.getItemId();
        java.lang.Class<?> wildcardClass14 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test041");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setPurchaseId(0);
        int int7 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test042");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId(98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test043");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId(1);
        purchase2.setItemId((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test044");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setItemId((int) (byte) 0);
        purchase3.setPurchaseId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test045");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        purchase2.setUserId(0);
        int int12 = purchase2.getPurchaseId();
        java.lang.Class<?> wildcardClass13 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test046");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId((int) (short) 100);
        purchase2.setPurchaseId((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test047");
        actions.Purchase purchase3 = new actions.Purchase(1, 100, 99);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test048");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        purchase3.setUserId(9);
        java.lang.Class<?> wildcardClass14 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test049");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) 100);
        purchase2.setUserId(0);
        java.lang.Class<?> wildcardClass5 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test050");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test051");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        purchase3.setPurchaseId(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test052");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId((int) (short) 100);
        purchase2.setItemId((int) (short) 1);
        purchase2.setPurchaseId((int) (short) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test053");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 10, (int) 'a', 7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test054");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 10, 97, (int) ' ');
        purchase3.setPurchaseId(102);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test055");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        purchase3.setUserId(9);
        purchase3.setItemId(7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test056");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) (byte) 100, 100);
        purchase3.setUserId((int) (short) 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test057");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        java.lang.Class<?> wildcardClass6 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test058");
        actions.Purchase purchase3 = new actions.Purchase(9, 97, 101);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test059");
        actions.Purchase purchase2 = new actions.Purchase(0, 98);
        purchase2.setUserId((int) (byte) -1);
        purchase2.setPurchaseId((int) (short) -1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test060");
        actions.Purchase purchase2 = new actions.Purchase(97, (int) (short) 1);
        purchase2.setItemId((int) (byte) 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test061");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) -1, (int) (byte) 100);
        purchase2.setUserId((int) (byte) -1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test062");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test063");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 100, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test064");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 99);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test065");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test066");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 0, 35, (int) (byte) 10);
        purchase3.setPurchaseId(97);
        java.lang.Class<?> wildcardClass6 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test067");
        actions.Purchase purchase2 = new actions.Purchase(101, (int) (byte) -1);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test068");
        actions.Purchase purchase2 = new actions.Purchase(9, 9);
        int int3 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test069");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 99);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test070");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        java.lang.Class<?> wildcardClass9 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test071");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        purchase3.setUserId(100);
        int int13 = purchase3.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test072");
        actions.Purchase purchase3 = new actions.Purchase(0, 7, 101);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test073");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setItemId((int) (byte) 0);
        int int11 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test074");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((-1));
        int int7 = purchase3.getPurchaseId();
        java.lang.Class<?> wildcardClass8 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test075");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        int int9 = purchase3.getItemId();
        java.lang.Class<?> wildcardClass10 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test076");
        actions.Purchase purchase2 = new actions.Purchase((int) '4', (int) (short) 10);
        purchase2.setItemId(100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test077");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId(1);
        purchase2.setItemId((int) (byte) 100);
        int int9 = purchase2.getUserId();
        int int10 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test078");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 98);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test079");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) -1, (int) (byte) 100);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test080");
        actions.Purchase purchase2 = new actions.Purchase(3, (int) (byte) 1);
        int int3 = purchase2.getItemId();
        purchase2.setUserId(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test081");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 100, 32, (int) (short) -1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test082");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        purchase2.setItemId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test083");
        actions.Purchase purchase2 = new actions.Purchase(0, 98);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test084");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test085");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) (short) -1, 101);
        purchase3.setPurchaseId(32);
        purchase3.setPurchaseId(99);
        purchase3.setItemId(2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test086");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        purchase3.setItemId(10);
        purchase3.setUserId((int) (short) 100);
        int int15 = purchase3.getUserId();
        purchase3.setPurchaseId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test087");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        int int6 = purchase3.getItemId();
        purchase3.setUserId(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test088");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 99);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        purchase2.setItemId(104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test089");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) (byte) 100, 100);
        purchase3.setUserId((int) (byte) 10);
        purchase3.setUserId((int) (byte) 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test090");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        purchase2.setPurchaseId(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test091");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getUserId();
        purchase2.setItemId((int) (byte) 10);
        int int11 = purchase2.getUserId();
        int int12 = purchase2.getUserId();
        purchase2.setPurchaseId((int) '#');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test092");
        actions.Purchase purchase2 = new actions.Purchase(10, 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test093");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) 10, 9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test094");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) '#', (int) (short) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test095");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 99);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test096");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) 100);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test097");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        int int12 = purchase3.getUserId();
        purchase3.setPurchaseId(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test098");
        actions.Purchase purchase3 = new actions.Purchase(5, 102, (int) 'a');
        int int4 = purchase3.getUserId();
        int int5 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test099");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((-1));
        int int7 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 1);
        int int10 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test100");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        int int11 = purchase3.getUserId();
        java.lang.Class<?> wildcardClass12 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test101");
        actions.Purchase purchase2 = new actions.Purchase(0, 7);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test102");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setUserId((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test103");
        actions.Purchase purchase2 = new actions.Purchase((-1), 7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test104");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        purchase3.setPurchaseId((-1));
        purchase3.setUserId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test105");
        actions.Purchase purchase2 = new actions.Purchase(98, 10);
        purchase2.setUserId(32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test106");
        actions.Purchase purchase2 = new actions.Purchase(5, 100);
        purchase2.setItemId(32);
        int int5 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test107");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 0, 35, (int) (byte) 10);
        purchase3.setPurchaseId(97);
        purchase3.setItemId(97);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test108");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 100, 104, 97);
        purchase3.setUserId(101);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test109");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) 100);
        purchase2.setUserId((int) '#');
        int int5 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test110");
        actions.Purchase purchase3 = new actions.Purchase(99, (int) (short) 0, (int) (short) -1);
        int int4 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test111");
        actions.Purchase purchase3 = new actions.Purchase(1, 3, (int) '#');
        purchase3.setUserId(0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test112");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setPurchaseId((int) '#');
        int int9 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test113");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) (short) -1, 101);
        purchase3.setPurchaseId(98);
        purchase3.setUserId(9);
        java.lang.Class<?> wildcardClass8 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test114");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setUserId((int) (byte) 1);
        purchase3.setPurchaseId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test115");
        actions.Purchase purchase2 = new actions.Purchase(3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test116");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test117");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) (short) 100, (int) (byte) 0);
        purchase3.setPurchaseId(35);
        java.lang.Class<?> wildcardClass6 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test118");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getUserId();
        int int9 = purchase2.getItemId();
        purchase2.setPurchaseId(5);
        int int12 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test119");
        actions.Purchase purchase3 = new actions.Purchase(101, 98, (int) (byte) 1);
        purchase3.setPurchaseId((int) (byte) -1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test120");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 1, 6);
        purchase2.setPurchaseId((int) (byte) 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test121");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        purchase2.setItemId((int) '#');
        int int5 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test122");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setPurchaseId((int) (byte) -1);
        purchase3.setUserId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test123");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((-1));
        int int7 = purchase3.getPurchaseId();
        purchase3.setPurchaseId((int) (byte) -1);
        int int10 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test124");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        int int6 = purchase3.getItemId();
        purchase3.setPurchaseId(102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test125");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 3, (int) '#');
        int int4 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test126");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        int int8 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test127");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 10, 97, (int) ' ');
        int int4 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test128");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(97);
        purchase2.setItemId(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test129");
        actions.Purchase purchase2 = new actions.Purchase(101, 99);
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId((int) (byte) 1);
        purchase2.setPurchaseId(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test130");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        purchase3.setPurchaseId(0);
        purchase3.setPurchaseId(32);
        int int8 = purchase3.getPurchaseId();
        purchase3.setUserId(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test131");
        actions.Purchase purchase2 = new actions.Purchase(98, 10);
        purchase2.setUserId(99);
        purchase2.setItemId(97);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test132");
        actions.Purchase purchase3 = new actions.Purchase(2, 10, (int) '4');
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test133");
        actions.Purchase purchase2 = new actions.Purchase(4, 6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test134");
        actions.Purchase purchase2 = new actions.Purchase(98, 10);
        purchase2.setUserId(99);
        int int5 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test135");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 101, (-1));
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (byte) 10);
        int int8 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test136");
        actions.Purchase purchase3 = new actions.Purchase(0, (int) (short) 1, 9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test137");
        actions.Purchase purchase2 = new actions.Purchase((int) '#', 101);
        int int3 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test138");
        actions.Purchase purchase2 = new actions.Purchase(52, 98);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test139");
        actions.Purchase purchase2 = new actions.Purchase(32, 53);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test140");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getUserId();
        purchase2.setItemId((int) (byte) 10);
        int int11 = purchase2.getUserId();
        int int12 = purchase2.getUserId();
        int int13 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test141");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        int int6 = purchase3.getPurchaseId();
        purchase3.setPurchaseId(52);
        purchase3.setItemId((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test142");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) '4', (int) (byte) 0);
        purchase3.setPurchaseId(52);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test143");
        actions.Purchase purchase2 = new actions.Purchase((-1), 98);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test144");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getUserId();
        int int9 = purchase2.getItemId();
        purchase2.setUserId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test145");
        actions.Purchase purchase3 = new actions.Purchase((int) '4', (int) (short) 10, (int) (short) 10);
        int int4 = purchase3.getPurchaseId();
        purchase3.setUserId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test146");
        actions.Purchase purchase3 = new actions.Purchase(9, 7, 99);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test147");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        java.lang.Class<?> wildcardClass5 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test148");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        int int6 = purchase3.getItemId();
        purchase3.setPurchaseId(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test149");
        actions.Purchase purchase2 = new actions.Purchase(98, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test150");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) (short) -1, 101);
        purchase3.setPurchaseId(32);
        purchase3.setPurchaseId(99);
        int int8 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test151");
        actions.Purchase purchase2 = new actions.Purchase((int) '4', 0);
        int int3 = purchase2.getItemId();
        int int4 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test152");
        actions.Purchase purchase2 = new actions.Purchase(10, 102);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test153");
        actions.Purchase purchase3 = new actions.Purchase(53, 2, 97);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test154");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test155");
        actions.Purchase purchase2 = new actions.Purchase(98, 10);
        purchase2.setUserId(99);
        purchase2.setPurchaseId((int) (byte) -1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test156");
        actions.Purchase purchase2 = new actions.Purchase(6, (int) (byte) 1);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test157");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 98);
        purchase2.setItemId((int) (short) 1);
        purchase2.setPurchaseId(2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test158");
        actions.Purchase purchase2 = new actions.Purchase(6, (int) (byte) 1);
        int int3 = purchase2.getUserId();
        purchase2.setUserId(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test159");
        actions.Purchase purchase2 = new actions.Purchase(6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test160");
        actions.Purchase purchase3 = new actions.Purchase(0, 5, (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test161");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, (-1));
        int int3 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test162");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        int int11 = purchase3.getUserId();
        purchase3.setPurchaseId(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test163");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getItemId();
        purchase3.setPurchaseId(3);
        purchase3.setUserId((int) '4');
        int int9 = purchase3.getItemId();
        purchase3.setPurchaseId((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test164");
        actions.Purchase purchase2 = new actions.Purchase(103, 0);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test165");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        java.lang.Class<?> wildcardClass6 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test166");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 104);
        purchase2.setPurchaseId(101);
        java.lang.Class<?> wildcardClass5 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test167");
        actions.Purchase purchase3 = new actions.Purchase((int) '4', 103, 97);
        int int4 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test168");
        actions.Purchase purchase3 = new actions.Purchase(5, 102, (int) 'a');
        purchase3.setUserId(0);
        purchase3.setPurchaseId(4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test169");
        actions.Purchase purchase2 = new actions.Purchase(3, 5);
        purchase2.setUserId((int) (byte) -1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test170");
        actions.Purchase purchase3 = new actions.Purchase(101, 98, (int) (byte) 1);
        int int4 = purchase3.getItemId();
        java.lang.Class<?> wildcardClass5 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test171");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setItemId(9);
        purchase3.setItemId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test172");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(97);
        int int11 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test173");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 0, (int) (short) -1, 58);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test174");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) (byte) 100, 100);
        purchase3.setPurchaseId(5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test175");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) 100);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test176");
        actions.Purchase purchase2 = new actions.Purchase(101, 99);
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId((int) (byte) 1);
        int int6 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test177");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        purchase2.setUserId(0);
        purchase2.setItemId((int) ' ');
        purchase2.setPurchaseId((int) (byte) -1);
        purchase2.setPurchaseId(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test178");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (byte) 10);
        int int7 = purchase3.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test179");
        actions.Purchase purchase2 = new actions.Purchase((int) '#', (int) 'a');
        purchase2.setPurchaseId((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test180");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test181");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        int int12 = purchase3.getPurchaseId();
        purchase3.setUserId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test182");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 3, (int) '#');
        purchase3.setItemId(1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test183");
        actions.Purchase purchase2 = new actions.Purchase(3, (int) (byte) 1);
        int int3 = purchase2.getItemId();
        java.lang.Class<?> wildcardClass4 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test184");
        actions.Purchase purchase3 = new actions.Purchase(5, (int) (byte) 100, 100);
        int int4 = purchase3.getPurchaseId();
        purchase3.setUserId(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test185");
        actions.Purchase purchase3 = new actions.Purchase(10, (int) (short) 10, (int) (byte) 1);
        purchase3.setUserId(101);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test186");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) (byte) -1);
        int int9 = purchase3.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test187");
        actions.Purchase purchase3 = new actions.Purchase(6, (int) '#', (int) (short) 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test188");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        int int6 = purchase3.getItemId();
        purchase3.setItemId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test189");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        purchase2.setItemId((int) (byte) -1);
        purchase2.setItemId((int) (short) 100);
        int int9 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test190");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, 5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test191");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setUserId(97);
        purchase2.setItemId(101);
        purchase2.setUserId((int) (byte) 10);
        purchase2.setPurchaseId((int) (short) 100);
        purchase2.setUserId(35);
        purchase2.setItemId((int) (short) 100);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test192");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        int int6 = purchase3.getPurchaseId();
        purchase3.setPurchaseId(52);
        int int9 = purchase3.getItemId();
        purchase3.setItemId(58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test193");
        actions.Purchase purchase3 = new actions.Purchase(101, (int) '4', (int) (byte) 0);
        purchase3.setItemId((int) (short) 0);
        int int6 = purchase3.getUserId();
        int int7 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test194");
        actions.Purchase purchase2 = new actions.Purchase((-1), 99);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test195");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId((int) (short) 100);
        purchase2.setItemId((int) (short) 1);
        purchase2.setUserId((int) (byte) 0);
        purchase2.setPurchaseId((int) (short) -1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test196");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 101, (-1));
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setItemId(2);
        purchase3.setPurchaseId(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test197");
        actions.Purchase purchase3 = new actions.Purchase((int) ' ', (int) '4', (-1));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test198");
        actions.Purchase purchase2 = new actions.Purchase(103, 0);
        int int3 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test199");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(100);
        int int11 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test200");
        actions.Purchase purchase3 = new actions.Purchase(11, 104, (int) (byte) 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test201");
        actions.Purchase purchase3 = new actions.Purchase(0, 100, 32);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test202");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 1, 32, 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test203");
        actions.Purchase purchase3 = new actions.Purchase(102, 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test204");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        purchase3.setUserId(9);
        purchase3.setUserId(7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test205");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) -1);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test206");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getItemId();
        purchase3.setPurchaseId(3);
        purchase3.setUserId((int) '4');
        java.lang.Class<?> wildcardClass9 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test207");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        int int5 = purchase2.getPurchaseId();
        int int6 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test208");
        actions.Purchase purchase2 = new actions.Purchase((-1), 0);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test209");
        actions.Purchase purchase3 = new actions.Purchase(100, 9, 35);
        purchase3.setPurchaseId(101);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test210");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 99);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test211");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((-1));
        int int7 = purchase3.getPurchaseId();
        purchase3.setPurchaseId((int) (byte) -1);
        int int10 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test212");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        int int5 = purchase2.getPurchaseId();
        purchase2.setItemId(99);
        purchase2.setPurchaseId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test213");
        actions.Purchase purchase3 = new actions.Purchase(52, 1, 98);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test214");
        actions.Purchase purchase2 = new actions.Purchase(0, 35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test215");
        actions.Purchase purchase2 = new actions.Purchase(10, 3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test216");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 98);
        purchase2.setItemId((int) (short) 1);
        purchase2.setUserId(98);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test217");
        actions.Purchase purchase3 = new actions.Purchase(58, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test218");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((-1));
        java.lang.Class<?> wildcardClass7 = purchase3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test219");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        int int6 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test220");
        actions.Purchase purchase2 = new actions.Purchase(4, 34);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test221");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(97);
        java.lang.Class<?> wildcardClass11 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test222");
        actions.Purchase purchase2 = new actions.Purchase((int) '#', 101);
        purchase2.setItemId((int) (byte) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test223");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        int int10 = purchase2.getItemId();
        purchase2.setPurchaseId(102);
        int int13 = purchase2.getUserId();
        java.lang.Class<?> wildcardClass14 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test224");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId(35);
        purchase2.setItemId((int) (short) 0);
        purchase2.setPurchaseId(7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test225");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(100);
        purchase2.setUserId(104);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 106 + "'", int7 == 106);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test226");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 3, (int) '#');
        purchase3.setItemId(58);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test227");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getUserId();
        purchase2.setItemId((int) (byte) 10);
        int int11 = purchase2.getUserId();
        int int12 = purchase2.getUserId();
        int int13 = purchase2.getUserId();
        purchase2.setItemId((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test228");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setUserId((int) '#');
        int int11 = purchase3.getPurchaseId();
        purchase3.setUserId(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test229");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 101, (-1));
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (byte) 10);
        purchase3.setItemId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test230");
        actions.Purchase purchase2 = new actions.Purchase(2, 7);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test231");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId(1);
        purchase2.setItemId((int) (byte) 100);
        int int9 = purchase2.getUserId();
        purchase2.setPurchaseId(3);
        purchase2.setUserId((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test232");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        purchase2.setItemId((int) (byte) 100);
        int int7 = purchase2.getPurchaseId();
        int int8 = purchase2.getPurchaseId();
        purchase2.setUserId(100);
        purchase2.setUserId(58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test233");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        int int3 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test234");
        actions.Purchase purchase2 = new actions.Purchase((int) '#', (int) 'a');
        purchase2.setPurchaseId((int) (byte) 0);
        int int5 = purchase2.getUserId();
        purchase2.setUserId(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test235");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId(1);
        purchase2.setItemId((int) (byte) 100);
        purchase2.setItemId((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test236");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId(35);
        purchase2.setItemId((int) (short) 0);
        int int8 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test237");
        actions.Purchase purchase3 = new actions.Purchase(100, 9, 35);
        purchase3.setUserId(57);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test238");
        actions.Purchase purchase2 = new actions.Purchase(52, 5);
        int int3 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test239");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        purchase2.setItemId((int) '#');
        int int5 = purchase2.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test240");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) -1, (int) (short) 10, 58);
        purchase3.setPurchaseId(5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test241");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 10);
        int int11 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test242");
        actions.Purchase purchase3 = new actions.Purchase((int) '4', 36, (int) '4');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test243");
        actions.Purchase purchase3 = new actions.Purchase(9, 9, 32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test244");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', (int) (byte) 100);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test245");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (byte) 1);
        purchase2.setPurchaseId(11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test246");
        actions.Purchase purchase3 = new actions.Purchase((int) (byte) 10, 97, (int) ' ');
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test247");
        actions.Purchase purchase3 = new actions.Purchase(37, (int) (byte) 10, 9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test248");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, (-1));
        int int3 = purchase2.getItemId();
        purchase2.setPurchaseId(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test249");
        actions.Purchase purchase3 = new actions.Purchase(35, 99, (int) (short) 100);
        int int4 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test250");
        actions.Purchase purchase3 = new actions.Purchase(2, (int) ' ', (int) (byte) -1);
        purchase3.setUserId((int) ' ');
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test251");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getItemId();
        purchase3.setItemId((int) (short) -1);
        int int7 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test252");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId((int) (short) 100);
        purchase2.setPurchaseId((int) (short) 100);
        purchase2.setItemId(53);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test253");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setUserId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test254");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 99);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((int) (byte) -1);
        purchase2.setPurchaseId((int) '#');
        purchase2.setPurchaseId(36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test255");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) -1, (-1), 34);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test256");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(99);
        int int5 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test257");
        actions.Purchase purchase2 = new actions.Purchase(97, 97);
        purchase2.setUserId(97);
        int int5 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test258");
        actions.Purchase purchase2 = new actions.Purchase((int) ' ', 99);
        int int3 = purchase2.getUserId();
        purchase2.setItemId(6);
        purchase2.setUserId(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test259");
        actions.Purchase purchase3 = new actions.Purchase((int) (short) 0, 101, (-1));
        purchase3.setItemId(99);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test260");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) '4');
        purchase3.setPurchaseId((int) (short) 1);
        purchase3.setItemId(10);
        int int13 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test261");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 100, 1);
        int int3 = purchase2.getItemId();
        int int4 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test262");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getItemId();
        purchase2.setItemId((int) ' ');
        int int6 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test263");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId((int) (short) 100);
        purchase2.setItemId((int) (short) 1);
        purchase2.setUserId((int) (byte) 0);
        purchase2.setPurchaseId(99);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test264");
        actions.Purchase purchase2 = new actions.Purchase(101, (int) (byte) 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test265");
        actions.Purchase purchase2 = new actions.Purchase((int) (byte) -1, 104);
        java.lang.Class<?> wildcardClass3 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test266");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (-1), 1);
        int int4 = purchase3.getPurchaseId();
        int int5 = purchase3.getItemId();
        purchase3.setUserId(102);
        int int8 = purchase3.getItemId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test267");
        actions.Purchase purchase2 = new actions.Purchase(3, 5);
        purchase2.setUserId((int) (short) -1);
        purchase2.setItemId(0);
        purchase2.setUserId((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test268");
        actions.Purchase purchase2 = new actions.Purchase((int) (short) 0, (int) ' ');
        purchase2.setItemId(99);
        purchase2.setUserId(52);
        purchase2.setUserId((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = purchase2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test269");
        actions.Purchase purchase2 = new actions.Purchase((int) 'a', 99);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getPurchaseId();
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((int) (byte) -1);
        purchase2.setPurchaseId((int) '#');
        purchase2.setPurchaseId(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test270");
        actions.Purchase purchase3 = new actions.Purchase(1, 3, (int) '#');
        int int4 = purchase3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test271");
        actions.Purchase purchase3 = new actions.Purchase(5, 35, 1);
        purchase3.setUserId(0);
        int int6 = purchase3.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test272");
        actions.Purchase purchase2 = new actions.Purchase(9, 104);
        int int3 = purchase2.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test273");
        actions.Purchase purchase3 = new actions.Purchase((int) 'a', (int) (short) 1, 0);
        int int4 = purchase3.getPurchaseId();
        purchase3.setItemId((int) (short) 10);
        purchase3.setUserId((int) (byte) -1);
        purchase3.setItemId((int) (short) -1);
        int int11 = purchase3.getUserId();
        purchase3.setPurchaseId((int) (byte) 0);
        int int14 = purchase3.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test274");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        purchase2.setItemId(100);
        int int5 = purchase2.getPurchaseId();
        purchase2.setPurchaseId((-1));
        purchase2.setPurchaseId((int) (short) 100);
        purchase2.setItemId(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test275");
        actions.Purchase purchase2 = new actions.Purchase(0, (int) (short) -1);
        int int3 = purchase2.getUserId();
        int int4 = purchase2.getUserId();
        purchase2.setUserId(1);
        purchase2.setItemId((int) (byte) 100);
        int int9 = purchase2.getUserId();
        int int10 = purchase2.getPurchaseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test276");
        actions.Purchase purchase3 = new actions.Purchase((int) '#', (int) (byte) 10, 34);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PurchaseTest.test277");
        actions.Purchase purchase3 = new actions.Purchase(101, 9, (int) (byte) 100);
        int int4 = purchase3.getItemId();
        purchase3.setItemId(106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }
}
