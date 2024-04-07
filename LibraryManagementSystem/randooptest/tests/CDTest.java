package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test001");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test002");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        cD3.setId(12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test003");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test004");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        java.lang.String str10 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test005");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setTitle("hi!");
        java.lang.Class<?> wildcardClass12 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test006");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        java.lang.Class<?> wildcardClass6 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test007");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        cD3.setAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test008");
        items.CD cD3 = new items.CD("UNKOWN", "hi!", "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test009");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        cD3.setAuthor("hi!");
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test010");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        java.lang.Class<?> wildcardClass9 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test011");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        java.lang.String str10 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test012");
        items.CD cD3 = new items.CD("", "UNKOWN", "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test013");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("");
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test014");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        java.lang.String str12 = cD3.getPurchasable();
        java.lang.String str13 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test015");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test016");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test017");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        int int10 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test018");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.increaseCopies();
        java.lang.Class<?> wildcardClass11 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test019");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        java.lang.String str10 = cD3.getTitle();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test020");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        int int6 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test021");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        java.lang.String str14 = cD3.getAuthor();
        java.lang.String str15 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test022");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test023");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        java.lang.String str12 = cD3.getPurchasable();
        int int13 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test024");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setNumOfCopies((int) '#');
        cD7.increaseCopies();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test025");
        items.CD cD7 = new items.CD(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        cD7.setLocation("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test026");
        items.CD cD3 = new items.CD("UNKOWN", "hi!", "UNKOWN");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test027");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        cD7.decreaseCopies();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test028");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        java.lang.String str10 = cD3.getTitle();
        java.lang.String str11 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test029");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setId(0);
        cD3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test030");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.Class<?> wildcardClass5 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test031");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setItemType("UNKOWN");
        cD3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test032");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        java.lang.Class<?> wildcardClass10 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test033");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test034");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test035");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        java.lang.String str6 = cD3.getAuthor();
        int int7 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test036");
        items.CD cD7 = new items.CD(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        cD7.setTitle("UNKOWN");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test037");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test038");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.decreaseCopies();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test039");
        items.CD cD3 = new items.CD("UNKOWN", "", "hi!");
        cD3.setItemType("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test040");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        java.lang.String str9 = cD3.getTitle();
        cD3.setPurchasable("");
        java.lang.String str12 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test041");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test042");
        items.CD cD7 = new items.CD(0, "", "UNKOWN", "hi!", 0, "", "");
        cD7.setNumOfCopies((int) (byte) 100);
        cD7.setNumOfCopies((int) '#');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test043");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        java.lang.String str9 = cD3.getLocation();
        java.lang.String str10 = cD3.getLocation();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test044");
        items.CD cD3 = new items.CD("", "hi!", "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test045");
        items.CD cD7 = new items.CD(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        cD7.setPurchasable("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test046");
        items.CD cD7 = new items.CD(13, "", "hi!", "UNKOWN", 5, "UNKOWN", "hi!");
        java.lang.String str8 = cD7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test047");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        cD3.setId(16);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test048");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setTitle("hi!");
        java.lang.String str9 = cD3.getLocation();
        java.lang.String str10 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test049");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        java.lang.String str6 = cD3.getAuthor();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test050");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        int int5 = cD3.getId();
        cD3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test051");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        java.lang.Class<?> wildcardClass10 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test052");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.decreaseCopies();
        java.lang.String str11 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test053");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        cD3.setAuthor("hi!");
        cD3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test054");
        items.CD cD7 = new items.CD(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test055");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        cD3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test056");
        items.CD cD7 = new items.CD((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        cD7.setAuthor("");
        java.lang.Class<?> wildcardClass10 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test057");
        items.CD cD3 = new items.CD("hi!", "", "");
        java.lang.String str4 = cD3.getLocation();
        cD3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test058");
        items.CD cD7 = new items.CD(14, "UNKOWN", "", "", 12, "", "hi!");
        int int8 = cD7.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test059");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setTitle("hi!");
        java.lang.String str9 = cD3.getLocation();
        java.lang.Class<?> wildcardClass10 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test060");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        cD3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test061");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test062");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        int int12 = cD7.getNumOfCopies();
        cD7.setItemType("hi!");
        cD7.setId(23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test063");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        cD3.setPurchasable("");
        cD3.setTitle("UNKOWN");
        java.lang.String str11 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test064");
        items.CD cD7 = new items.CD((int) (byte) 100, "hi!", "", "hi!", 10, "hi!", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test065");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        java.lang.Class<?> wildcardClass6 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test066");
        items.CD cD3 = new items.CD("UNKOWN", "UNKOWN", "UNKOWN");
        int int4 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test067");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setPurchasable("");
        cD3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test068");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        cD3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 105 + "'", int6 == 105);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test069");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        cD3.setId(14);
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test070");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        cD3.increaseCopies();
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test071");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        int int12 = cD7.getNumOfCopies();
        cD7.setItemType("hi!");
        java.lang.String str15 = cD7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test072");
        items.CD cD7 = new items.CD((int) (short) 0, "UNKOWN", "hi!", "", (int) (short) -1, "hi!", "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test073");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        java.lang.String str9 = cD3.getTitle();
        cD3.setPurchasable("");
        cD3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test074");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        cD3.setAuthor("hi!");
        cD3.setPurchasable("hi!");
        cD3.setId(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test075");
        items.CD cD3 = new items.CD("hi!", "hi!", "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test076");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        java.lang.String str9 = cD3.getLocation();
        java.lang.String str10 = cD3.getLocation();
        java.lang.Class<?> wildcardClass11 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test077");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setAuthor("");
        int int15 = cD3.getId();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test078");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("");
        java.lang.Class<?> wildcardClass13 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test079");
        items.CD cD7 = new items.CD(5, "", "UNKOWN", "hi!", 9, "UNKOWN", "");
        java.lang.Class<?> wildcardClass8 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test080");
        items.CD cD7 = new items.CD(7, "hi!", "hi!", "hi!", (int) (byte) 100, "hi!", "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test081");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        java.lang.String str10 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test082");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("UNKOWN");
        cD3.decreaseCopies();
        int int8 = cD3.getNumOfCopies();
        cD3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test083");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        cD3.increaseCopies();
        cD3.setLocation("");
        java.lang.String str13 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test084");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        java.lang.String str10 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test085");
        items.CD cD3 = new items.CD("UNKOWN", "UNKOWN", "UNKOWN");
        cD3.increaseCopies();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test086");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        cD3.increaseCopies();
        java.lang.Class<?> wildcardClass15 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test087");
        items.CD cD7 = new items.CD(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        int int8 = cD7.getNumOfCopies();
        java.lang.Class<?> wildcardClass9 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test088");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        java.lang.String str14 = cD3.getAuthor();
        cD3.setId(16);
        java.lang.String str17 = cD3.getLocation();
        cD3.setId(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UNKOWN" + "'", str17.equals("UNKOWN"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test089");
        items.CD cD7 = new items.CD(0, "", "UNKOWN", "hi!", 0, "", "");
        cD7.setNumOfCopies((int) (byte) 100);
        cD7.setPurchasable("hi!");
        java.lang.String str12 = cD7.getTitle();
        java.lang.String str13 = cD7.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test090");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setNumOfCopies(2);
        cD3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test091");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        int int15 = cD3.getId();
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test092");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        cD3.setAuthor("");
        java.lang.String str8 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test093");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        cD3.setPurchasable("");
        cD3.setTitle("UNKOWN");
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test094");
        items.CD cD7 = new items.CD(105, "UNKOWN", "", "hi!", 106, "", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test095");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        java.lang.String str9 = cD3.getPurchasable();
        cD3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test096");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        int int11 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test097");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.setNumOfCopies(8);
        cD7.setTitle("UNKOWN");
        java.lang.String str13 = cD7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test098");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        int int5 = cD3.getId();
        cD3.setNumOfCopies((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test099");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        java.lang.String str6 = cD3.getAuthor();
        java.lang.Class<?> wildcardClass7 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test100");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        java.lang.String str14 = cD3.getAuthor();
        cD3.setId(16);
        cD3.setId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test101");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setTitle("hi!");
        java.lang.String str9 = cD3.getLocation();
        cD3.setNumOfCopies(10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test102");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        java.lang.String str11 = cD3.getTitle();
        cD3.setItemType("hi!");
        cD3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test103");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        java.lang.String str10 = cD3.getTitle();
        java.lang.String str11 = cD3.getPurchasable();
        cD3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test104");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setPurchasable("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test105");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("UNKOWN");
        cD3.decreaseCopies();
        cD3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test106");
        items.CD cD3 = new items.CD("UNKOWN", "", "");
        cD3.setTitle("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test107");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setNumOfCopies((int) '#');
        cD7.setLocation("UNKOWN");
        cD7.setId(4);
        java.lang.String str16 = cD7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test108");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        java.lang.String str9 = cD3.getTitle();
        cD3.setNumOfCopies(106);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test109");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        java.lang.String str5 = cD3.getTitle();
        cD3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test110");
        items.CD cD7 = new items.CD(1, "UNKOWN", "hi!", "", 6, "", "UNKOWN");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test111");
        items.CD cD7 = new items.CD(9, "", "hi!", "hi!", (int) (short) 100, "UNKOWN", "");
        cD7.setTitle("");
        java.lang.String str10 = cD7.getItemType();
        cD7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test112");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        int int7 = cD3.getId();
        java.lang.Class<?> wildcardClass8 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test113");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setAuthor("UNKOWN");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test114");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "hi!", 8, "UNKOWN", "hi!");
        cD7.setTitle("");
        java.lang.String str10 = cD7.getLocation();
        java.lang.String str11 = cD7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test115");
        items.CD cD7 = new items.CD(14, "UNKOWN", "", "", 12, "", "hi!");
        cD7.setAuthor("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test116");
        items.CD cD3 = new items.CD("UNKOWN", "UNKOWN", "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test117");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        cD3.increaseCopies();
        java.lang.String str15 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test118");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.increaseCopies();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test119");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        cD3.setPurchasable("");
        cD3.setNumOfCopies((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test120");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        java.lang.String str12 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test121");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        java.lang.String str5 = cD3.getLocation();
        cD3.setItemType("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UNKOWN" + "'", str5.equals("UNKOWN"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test122");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setId(0);
        java.lang.String str12 = cD3.getAuthor();
        int int13 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test123");
        items.CD cD7 = new items.CD((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        java.lang.Class<?> wildcardClass8 = cD7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test124");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test125");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        java.lang.String str11 = cD3.getTitle();
        java.lang.String str12 = cD3.getItemType();
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test126");
        items.CD cD7 = new items.CD(109, "", "hi!", "hi!", 109, "hi!", "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test127");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        int int7 = cD3.getNumOfCopies();
        java.lang.String str8 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test128");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        cD3.setAuthor("");
        int int16 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test129");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setTitle("hi!");
        int int9 = cD3.getId();
        cD3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 113 + "'", int6 == 113);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 113 + "'", int9 == 113);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test130");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        java.lang.String str12 = cD7.getAuthor();
        java.lang.String str13 = cD7.getLocation();
        java.lang.String str14 = cD7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test131");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        int int5 = cD3.getId();
        java.lang.String str6 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test132");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.increaseCopies();
        cD3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test133");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        java.lang.String str9 = cD3.getLocation();
        cD3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test134");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        int int15 = cD3.getId();
        int int16 = cD3.getId();
        cD3.setPurchasable("");
        int int19 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test135");
        items.CD cD3 = new items.CD("hi!", "UNKOWN", "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test136");
        items.CD cD7 = new items.CD(0, "", "UNKOWN", "hi!", 0, "", "");
        cD7.setLocation("");
        java.lang.String str10 = cD7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test137");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        cD3.decreaseCopies();
        java.lang.String str7 = cD3.getTitle();
        java.lang.String str8 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test138");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        cD3.setAuthor("hi!");
        int int12 = cD3.getNumOfCopies();
        cD3.setId(8);
        java.lang.String str15 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "UNKOWN" + "'", str15.equals("UNKOWN"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test139");
        items.CD cD3 = new items.CD("UNKOWN", "", "");
        java.lang.String str4 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test140");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        int int15 = cD3.getId();
        int int16 = cD3.getId();
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test141");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        cD3.decreaseCopies();
        cD3.setNumOfCopies(112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test142");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getLocation();
        cD3.increaseCopies();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test143");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setNumOfCopies(2);
        java.lang.String str11 = cD3.getPurchasable();
        cD3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test144");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        int int14 = cD3.getNumOfCopies();
        java.lang.String str15 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test145");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.setItemType("UNKOWN");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test146");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        cD3.setNumOfCopies(22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test147");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        cD3.setAuthor("");
        cD3.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test148");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getPurchasable();
        java.lang.String str8 = cD3.getAuthor();
        int int9 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test149");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        cD3.setId(17);
        int int11 = cD3.getNumOfCopies();
        java.lang.String str12 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test150");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setItemType("UNKOWN");
        cD3.decreaseCopies();
        cD3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test151");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test152");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass15 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test153");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.setNumOfCopies(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test154");
        items.CD cD3 = new items.CD("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setLocation("hi!");
        cD3.increaseCopies();
        cD3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test155");
        items.CD cD7 = new items.CD(22, "UNKOWN", "UNKOWN", "", 0, "", "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test156");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        cD3.setId(14);
        java.lang.String str11 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test157");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        int int7 = cD3.getNumOfCopies();
        cD3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test158");
        items.CD cD7 = new items.CD(12, "UNKOWN", "UNKOWN", "hi!", (int) (short) -1, "UNKOWN", "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test159");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setNumOfCopies(2);
        cD3.setPurchasable("");
        java.lang.String str13 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test160");
        items.CD cD3 = new items.CD("hi!", "UNKOWN", "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test161");
        items.CD cD7 = new items.CD(113, "", "", "hi!", 10, "UNKOWN", "UNKOWN");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test162");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setItemType("UNKOWN");
        int int12 = cD3.getId();
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 114 + "'", int12 == 114);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test163");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getLocation();
        cD3.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test164");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        java.lang.String str10 = cD3.getPurchasable();
        java.lang.String str11 = cD3.getTitle();
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test165");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        java.lang.String str14 = cD3.getAuthor();
        cD3.setId(16);
        java.lang.String str17 = cD3.getLocation();
        java.lang.Class<?> wildcardClass18 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 118 + "'", int6 == 118);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UNKOWN" + "'", str17.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test166");
        items.CD cD7 = new items.CD((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        int int8 = cD7.getNumOfCopies();
        cD7.increaseCopies();
        cD7.setNumOfCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test167");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        cD3.setAuthor("");
        java.lang.String str16 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test168");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setPurchasable("UNKOWN");
        java.lang.Class<?> wildcardClass11 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test169");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test170");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test171");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        int int7 = cD3.getId();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test172");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        int int12 = cD7.getNumOfCopies();
        java.lang.String str13 = cD7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test173");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        int int13 = cD3.getNumOfCopies();
        cD3.increaseCopies();
        cD3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass17 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test174");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        java.lang.String str6 = cD3.getLocation();
        java.lang.String str7 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UNKOWN" + "'", str6.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test175");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        cD3.setPurchasable("");
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test176");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        cD3.setId((-1));
        int int14 = cD3.getId();
        int int15 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test177");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        cD3.setPurchasable("");
        cD3.setTitle("UNKOWN");
        cD3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test178");
        items.CD cD3 = new items.CD("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies(108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test179");
        items.CD cD7 = new items.CD(16, "hi!", "hi!", "hi!", 13, "UNKOWN", "hi!");
        cD7.setPurchasable("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test180");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.increaseCopies();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test181");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        java.lang.String str5 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test182");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        java.lang.String str13 = cD3.getLocation();
        cD3.setNumOfCopies((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test183");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.increaseCopies();
        int int12 = cD3.getId();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test184");
        items.CD cD7 = new items.CD(0, "", "UNKOWN", "hi!", 0, "", "");
        cD7.setNumOfCopies((int) (byte) 100);
        cD7.setPurchasable("hi!");
        java.lang.String str12 = cD7.getTitle();
        cD7.setNumOfCopies(109);
        cD7.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test185");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        java.lang.String str10 = cD3.getItemType();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test186");
        items.CD cD7 = new items.CD(109, "hi!", "hi!", "", 112, "", "UNKOWN");
        cD7.setItemType("");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test187");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        java.lang.String str7 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test188");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        cD3.decreaseCopies();
        java.lang.Class<?> wildcardClass11 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 111 + "'", int6 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test189");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getPurchasable();
        java.lang.String str10 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test190");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        java.lang.String str9 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test191");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        cD3.setPurchasable("hi!");
        java.lang.String str12 = cD3.getLocation();
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115 + "'", int9 == 115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "UNKOWN" + "'", str12.equals("UNKOWN"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test192");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        int int7 = cD3.getId();
        cD3.setNumOfCopies((int) '4');
        cD3.setPurchasable("UNKOWN");
        int int12 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 118 + "'", int7 == 118);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test193");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test194");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getPurchasable();
        cD3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test195");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        cD3.setAuthor("hi!");
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 121 + "'", int6 == 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test196");
        items.CD cD3 = new items.CD("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = cD3.getAuthor();
        cD3.increaseCopies();
        int int6 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test197");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setNumOfCopies(2);
        cD3.decreaseCopies();
        cD3.setId(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test198");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.decreaseCopies();
        cD3.decreaseCopies();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 124 + "'", int6 == 124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test199");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getAuthor();
        cD3.setId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test200");
        items.CD cD7 = new items.CD((int) (short) -1, "hi!", "hi!", "hi!", 111, "", "UNKOWN");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test201");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        java.lang.String str9 = cD3.getTitle();
        cD3.setPurchasable("");
        cD3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test202");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        java.lang.String str15 = cD3.getAuthor();
        cD3.setItemType("hi!");
        java.lang.Class<?> wildcardClass18 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test203");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getItemType();
        cD3.setPurchasable("");
        cD3.setId(124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test204");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        int int10 = cD3.getNumOfCopies();
        java.lang.String str11 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test205");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setId(0);
        java.lang.String str12 = cD3.getAuthor();
        cD3.setId(15);
        cD3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test206");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        int int10 = cD3.getNumOfCopies();
        int int11 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test207");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setAuthor("hi!");
        cD3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test208");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        java.lang.String str11 = cD3.getTitle();
        cD3.setItemType("hi!");
        cD3.decreaseCopies();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test209");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        cD3.setId((-1));
        java.lang.Class<?> wildcardClass14 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test210");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.setId(0);
        java.lang.String str12 = cD3.getAuthor();
        cD3.setId(15);
        java.lang.String str15 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test211");
        items.CD cD7 = new items.CD(105, "UNKOWN", "UNKOWN", "UNKOWN", (int) (short) 10, "hi!", "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test212");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        cD3.setId(14);
        cD3.increaseCopies();
        java.lang.String str12 = cD3.getAuthor();
        cD3.setId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test213");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getItemType();
        java.lang.String str6 = cD3.getAuthor();
        cD3.setItemType("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test214");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.increaseCopies();
        cD3.setTitle("UNKOWN");
        java.lang.String str13 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 109 + "'", int6 == 109);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test215");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        cD3.setId(14);
        cD3.increaseCopies();
        java.lang.String str12 = cD3.getAuthor();
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test216");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getLocation();
        java.lang.String str5 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test217");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        int int12 = cD7.getNumOfCopies();
        cD7.setItemType("hi!");
        cD7.setPurchasable("");
        cD7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test218");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        int int15 = cD3.getId();
        int int16 = cD3.getId();
        cD3.setPurchasable("");
        int int19 = cD3.getId();
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test219");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        java.lang.String str11 = cD3.getTitle();
        cD3.setItemType("hi!");
        cD3.decreaseCopies();
        java.lang.String str15 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test220");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        cD3.setPurchasable("UNKOWN");
        cD3.setTitle("hi!");
        cD3.decreaseCopies();
        java.lang.String str9 = cD3.getLocation();
        cD3.decreaseCopies();
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test221");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getLocation();
        java.lang.String str10 = cD3.getAuthor();
        cD3.decreaseCopies();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test222");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "", 10, "", "hi!");
        cD7.increaseCopies();
        cD7.decreaseCopies();
        cD7.setPurchasable("UNKOWN");
        int int12 = cD7.getNumOfCopies();
        cD7.setItemType("hi!");
        cD7.setPurchasable("");
        java.lang.String str17 = cD7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test223");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        java.lang.String str7 = cD3.getPurchasable();
        cD3.increaseCopies();
        java.lang.String str9 = cD3.getPurchasable();
        java.lang.String str10 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test224");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test225");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setTitle("hi!");
        int int9 = cD3.getId();
        int int10 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test226");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        int int5 = cD3.getId();
        java.lang.String str6 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test227");
        items.CD cD7 = new items.CD(3, "hi!", "hi!", "hi!", (int) (byte) 0, "UNKOWN", "");
        cD7.increaseCopies();
        java.lang.String str9 = cD7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test228");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        java.lang.String str10 = cD3.getPurchasable();
        java.lang.String str11 = cD3.getTitle();
        cD3.setNumOfCopies((int) (short) -1);
        cD3.setLocation("");
        java.lang.String str16 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test229");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test230");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        cD3.setTitle("hi!");
        cD3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test231");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        java.lang.String str10 = cD3.getPurchasable();
        java.lang.String str11 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test232");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        cD3.setTitle("UNKOWN");
        cD3.setAuthor("UNKOWN");
        cD3.setTitle("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test233");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        int int7 = cD3.getId();
        java.lang.String str8 = cD3.getAuthor();
        cD3.setAuthor("");
        cD3.setTitle("UNKOWN");
        cD3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test234");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setAuthor("UNKOWN");
        cD3.setAuthor("");
        cD3.setAuthor("");
        cD3.setAuthor("");
        cD3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test235");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        cD3.setId(14);
        cD3.increaseCopies();
        java.lang.String str12 = cD3.getAuthor();
        cD3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test236");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        java.lang.String str10 = cD3.getPurchasable();
        cD3.setAuthor("UNKOWN");
        int int13 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test237");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = cD3.getItemType();
        java.lang.String str8 = cD3.getLocation();
        java.lang.String str9 = cD3.getItemType();
        java.lang.String str10 = cD3.getPurchasable();
        java.lang.String str11 = cD3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UNKOWN" + "'", str11.equals("UNKOWN"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test238");
        items.CD cD3 = new items.CD("hi!", "", "UNKOWN");
        int int4 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test239");
        items.CD cD7 = new items.CD(12, "UNKOWN", "UNKOWN", "", 12, "", "");
        java.lang.String str8 = cD7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test240");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        java.lang.String str9 = cD3.getTitle();
        cD3.setPurchasable("");
        java.lang.String str12 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test241");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        int int9 = cD3.getNumOfCopies();
        int int10 = cD3.getId();
        java.lang.String str11 = cD3.getTitle();
        cD3.setItemType("hi!");
        cD3.decreaseCopies();
        java.lang.String str15 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test242");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        java.lang.String str5 = cD3.getPurchasable();
        int int6 = cD3.getNumOfCopies();
        java.lang.String str7 = cD3.getPurchasable();
        cD3.decreaseCopies();
        int int9 = cD3.getId();
        cD3.setPurchasable("hi!");
        cD3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test243");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        java.lang.String str13 = cD3.getLocation();
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test244");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getPurchasable();
        java.lang.String str8 = cD3.getAuthor();
        cD3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test245");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test246");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.increaseCopies();
        java.lang.Class<?> wildcardClass12 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test247");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("");
        int int7 = cD3.getId();
        cD3.setNumOfCopies(8);
        cD3.setLocation("UNKOWN");
        cD3.setItemType("UNKOWN");
        java.lang.String str14 = cD3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test248");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        int int15 = cD3.getId();
        int int16 = cD3.getId();
        cD3.setPurchasable("");
        cD3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test249");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        cD3.setItemType("hi!");
        java.lang.String str13 = cD3.getLocation();
        int int14 = cD3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test250");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setAuthor("");
        cD3.setItemType("");
        java.lang.Class<?> wildcardClass17 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test251");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        cD3.decreaseCopies();
        cD3.setTitle("");
        cD3.setAuthor("UNKOWN");
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test252");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        cD3.setItemType("");
        java.lang.String str11 = cD3.getAuthor();
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setLocation("");
        java.lang.String str15 = cD3.getAuthor();
        cD3.setItemType("hi!");
        int int18 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test253");
        items.CD cD3 = new items.CD("hi!", "", "");
        cD3.setNumOfCopies(0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test254");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        cD3.decreaseCopies();
        java.lang.String str10 = cD3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test255");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = cD3.getTitle();
        cD3.setItemType("");
        cD3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test256");
        items.CD cD7 = new items.CD(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.String str8 = cD7.getLocation();
        java.lang.String str9 = cD7.getItemType();
        cD7.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test257");
        items.CD cD3 = new items.CD("", "UNKOWN", "");
        java.lang.String str4 = cD3.getItemType();
        cD3.setLocation("");
        java.lang.String str7 = cD3.getPurchasable();
        cD3.setId(0);
        cD3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test258");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setLocation("hi!");
        java.lang.String str9 = cD3.getTitle();
        cD3.setId((int) (byte) -1);
        java.lang.String str12 = cD3.getPurchasable();
        cD3.setId(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test259");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.setTitle("hi!");
        int int6 = cD3.getId();
        cD3.setId((int) (short) 100);
        int int9 = cD3.getNumOfCopies();
        cD3.setAuthor("hi!");
        java.lang.String str12 = cD3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test260");
        items.CD cD3 = new items.CD("", "UNKOWN", "UNKOWN");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test261");
        items.CD cD7 = new items.CD((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        cD7.setNumOfCopies(23);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test262");
        items.CD cD3 = new items.CD("hi!", "", "hi!");
        java.lang.String str4 = cD3.getAuthor();
        cD3.setAuthor("UNKOWN");
        cD3.increaseCopies();
        java.lang.String str8 = cD3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test263");
        items.CD cD3 = new items.CD("hi!", "hi!", "hi!");
        cD3.increaseCopies();
        cD3.setPurchasable("UNKOWN");
        java.lang.String str7 = cD3.getPurchasable();
        java.lang.String str8 = cD3.getAuthor();
        java.lang.Class<?> wildcardClass9 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CDTest.test264");
        items.CD cD7 = new items.CD(0, "UNKOWN", "", "", 1, "", "hi!");
    }
}
