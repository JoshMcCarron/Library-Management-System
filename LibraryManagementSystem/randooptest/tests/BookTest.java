package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test001");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test002");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        book3.setId(12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test003");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test004");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        java.lang.String str10 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test005");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setTitle("hi!");
        java.lang.Class<?> wildcardClass12 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test006");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        java.lang.Class<?> wildcardClass6 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test007");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        book3.setAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test008");
        items.Book book3 = new items.Book("UNKOWN", "hi!", "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test009");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        book3.setAuthor("hi!");
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test010");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        java.lang.Class<?> wildcardClass9 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test011");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        java.lang.String str10 = book3.getPurchasable();
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
            System.out.format("%n%s%n", "BookTest.test012");
        items.Book book3 = new items.Book("", "UNKOWN", "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test013");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("");
        book3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test014");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setId((int) (byte) -1);
        java.lang.String str12 = book3.getPurchasable();
        java.lang.String str13 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test015");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        book3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test016");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
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
            System.out.format("%n%s%n", "BookTest.test017");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        int int10 = book3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test018");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.increaseCopies();
        java.lang.Class<?> wildcardClass11 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test019");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        java.lang.String str10 = book3.getTitle();
        book3.decreaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test020");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        int int6 = book3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test021");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        java.lang.String str14 = book3.getAuthor();
        java.lang.String str15 = book3.getPurchasable();
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
            System.out.format("%n%s%n", "BookTest.test022");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test023");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setId((int) (byte) -1);
        java.lang.String str12 = book3.getPurchasable();
        int int13 = book3.getId();
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
            System.out.format("%n%s%n", "BookTest.test024");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setNumOfCopies((int) '#');
        book7.increaseCopies();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test025");
        items.Book book7 = new items.Book(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        book7.setLocation("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test026");
        items.Book book3 = new items.Book("UNKOWN", "hi!", "UNKOWN");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test027");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        book7.decreaseCopies();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test028");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        java.lang.String str10 = book3.getTitle();
        java.lang.String str11 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test029");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setId(0);
        book3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test030");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.Class<?> wildcardClass5 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test031");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setItemType("UNKOWN");
        book3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test032");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        java.lang.Class<?> wildcardClass10 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test033");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test034");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test035");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        java.lang.String str6 = book3.getAuthor();
        int int7 = book3.getId();
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
            System.out.format("%n%s%n", "BookTest.test036");
        items.Book book7 = new items.Book(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        book7.setTitle("UNKOWN");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test037");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test038");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.decreaseCopies();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test039");
        items.Book book3 = new items.Book("UNKOWN", "", "hi!");
        book3.setItemType("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test040");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        java.lang.String str9 = book3.getTitle();
        book3.setPurchasable("");
        java.lang.String str12 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test041");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test042");
        items.Book book7 = new items.Book(0, "", "UNKOWN", "hi!", 0, "", "");
        book7.setNumOfCopies((int) (byte) 100);
        book7.setNumOfCopies((int) '#');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test043");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        java.lang.String str9 = book3.getLocation();
        java.lang.String str10 = book3.getLocation();
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test044");
        items.Book book3 = new items.Book("", "hi!", "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test045");
        items.Book book7 = new items.Book(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        book7.setPurchasable("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test046");
        items.Book book7 = new items.Book(13, "", "hi!", "UNKOWN", 5, "UNKOWN", "hi!");
        java.lang.String str8 = book7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test047");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        book3.setId(16);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test048");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setTitle("hi!");
        java.lang.String str9 = book3.getLocation();
        java.lang.String str10 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test049");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        java.lang.String str6 = book3.getAuthor();
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test050");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        int int5 = book3.getId();
        book3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test051");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        java.lang.Class<?> wildcardClass10 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test052");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.decreaseCopies();
        java.lang.String str11 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test053");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        book3.setAuthor("hi!");
        book3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test054");
        items.Book book7 = new items.Book(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test055");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        book3.setTitle("hi!");
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
            System.out.format("%n%s%n", "BookTest.test056");
        items.Book book7 = new items.Book((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        book7.setAuthor("");
        java.lang.Class<?> wildcardClass10 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test057");
        items.Book book3 = new items.Book("hi!", "", "");
        java.lang.String str4 = book3.getLocation();
        book3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test058");
        items.Book book7 = new items.Book(14, "UNKOWN", "", "", 12, "", "hi!");
        int int8 = book7.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test059");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setTitle("hi!");
        java.lang.String str9 = book3.getLocation();
        java.lang.Class<?> wildcardClass10 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test060");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        int int9 = book3.getId();
        book3.setTitle("hi!");
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
            System.out.format("%n%s%n", "BookTest.test061");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test062");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        int int12 = book7.getNumOfCopies();
        book7.setItemType("hi!");
        book7.setId(23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test063");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        book3.setPurchasable("");
        book3.setTitle("UNKOWN");
        java.lang.String str11 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test064");
        items.Book book7 = new items.Book((int) (byte) 100, "hi!", "", "hi!", 10, "hi!", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test065");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        java.lang.Class<?> wildcardClass6 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test066");
        items.Book book3 = new items.Book("UNKOWN", "UNKOWN", "UNKOWN");
        int int4 = book3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test067");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setPurchasable("");
        book3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test068");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        book3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 105 + "'", int6 == 105);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test069");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        book3.setId(14);
        book3.setPurchasable("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test070");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        book3.increaseCopies();
        book3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test071");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        int int12 = book7.getNumOfCopies();
        book7.setItemType("hi!");
        java.lang.String str15 = book7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test072");
        items.Book book7 = new items.Book((int) (short) 0, "UNKOWN", "hi!", "", (int) (short) -1, "hi!", "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test073");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        java.lang.String str9 = book3.getTitle();
        book3.setPurchasable("");
        book3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test074");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        book3.setAuthor("hi!");
        book3.setPurchasable("hi!");
        book3.setId(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test075");
        items.Book book3 = new items.Book("hi!", "hi!", "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test076");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        java.lang.String str9 = book3.getLocation();
        java.lang.String str10 = book3.getLocation();
        java.lang.Class<?> wildcardClass11 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test077");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setAuthor("");
        int int15 = book3.getId();
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test078");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("");
        java.lang.Class<?> wildcardClass13 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test079");
        items.Book book7 = new items.Book(5, "", "UNKOWN", "hi!", 9, "UNKOWN", "");
        java.lang.Class<?> wildcardClass8 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test080");
        items.Book book7 = new items.Book(7, "hi!", "hi!", "hi!", (int) (byte) 100, "hi!", "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test081");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        java.lang.String str10 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test082");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("UNKOWN");
        book3.decreaseCopies();
        int int8 = book3.getNumOfCopies();
        book3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test083");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        int int9 = book3.getId();
        book3.increaseCopies();
        book3.setLocation("");
        java.lang.String str13 = book3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test084");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        int int9 = book3.getId();
        java.lang.String str10 = book3.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test085");
        items.Book book3 = new items.Book("UNKOWN", "UNKOWN", "UNKOWN");
        book3.increaseCopies();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test086");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        book3.increaseCopies();
        java.lang.Class<?> wildcardClass15 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test087");
        items.Book book7 = new items.Book(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        int int8 = book7.getNumOfCopies();
        java.lang.Class<?> wildcardClass9 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test088");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        java.lang.String str14 = book3.getAuthor();
        book3.setId(16);
        java.lang.String str17 = book3.getLocation();
        book3.setId(3);
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
            System.out.format("%n%s%n", "BookTest.test089");
        items.Book book7 = new items.Book(0, "", "UNKOWN", "hi!", 0, "", "");
        book7.setNumOfCopies((int) (byte) 100);
        book7.setPurchasable("hi!");
        java.lang.String str12 = book7.getTitle();
        java.lang.String str13 = book7.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test090");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setNumOfCopies(2);
        book3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test091");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        int int15 = book3.getId();
        book3.setAuthor("");
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
            System.out.format("%n%s%n", "BookTest.test092");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        book3.setAuthor("");
        java.lang.String str8 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test093");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        book3.setPurchasable("");
        book3.setTitle("UNKOWN");
        book3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test094");
        items.Book book7 = new items.Book(105, "UNKOWN", "", "hi!", 106, "", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test095");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        java.lang.String str9 = book3.getPurchasable();
        book3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test096");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        int int11 = book3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test097");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.setNumOfCopies(8);
        book7.setTitle("UNKOWN");
        java.lang.String str13 = book7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test098");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        int int5 = book3.getId();
        book3.setNumOfCopies((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test099");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        java.lang.String str6 = book3.getAuthor();
        java.lang.Class<?> wildcardClass7 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test100");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        java.lang.String str14 = book3.getAuthor();
        book3.setId(16);
        book3.setId((int) (short) 1);
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
            System.out.format("%n%s%n", "BookTest.test101");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setTitle("hi!");
        java.lang.String str9 = book3.getLocation();
        book3.setNumOfCopies(10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test102");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
        java.lang.String str11 = book3.getTitle();
        book3.setItemType("hi!");
        book3.setTitle("hi!");
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
            System.out.format("%n%s%n", "BookTest.test103");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        java.lang.String str10 = book3.getTitle();
        java.lang.String str11 = book3.getPurchasable();
        book3.setItemType("hi!");
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
            System.out.format("%n%s%n", "BookTest.test104");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setPurchasable("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test105");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("UNKOWN");
        book3.decreaseCopies();
        book3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test106");
        items.Book book3 = new items.Book("UNKOWN", "", "");
        book3.setTitle("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test107");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setNumOfCopies((int) '#');
        book7.setLocation("UNKOWN");
        book7.setId(4);
        java.lang.String str16 = book7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test108");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        java.lang.String str9 = book3.getTitle();
        book3.setNumOfCopies(106);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test109");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        java.lang.String str5 = book3.getTitle();
        book3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test110");
        items.Book book7 = new items.Book(1, "UNKOWN", "hi!", "", 6, "", "UNKOWN");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test111");
        items.Book book7 = new items.Book(9, "", "hi!", "hi!", (int) (short) 100, "UNKOWN", "");
        book7.setTitle("");
        java.lang.String str10 = book7.getItemType();
        book7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test112");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        int int7 = book3.getId();
        java.lang.Class<?> wildcardClass8 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test113");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setAuthor("UNKOWN");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test114");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "hi!", 8, "UNKOWN", "hi!");
        book7.setTitle("");
        java.lang.String str10 = book7.getLocation();
        java.lang.String str11 = book7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test115");
        items.Book book7 = new items.Book(14, "UNKOWN", "", "", 12, "", "hi!");
        book7.setAuthor("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test116");
        items.Book book3 = new items.Book("UNKOWN", "UNKOWN", "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test117");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        book3.increaseCopies();
        java.lang.String str15 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test118");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.increaseCopies();
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test119");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        book3.setPurchasable("");
        book3.setNumOfCopies((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test120");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setId((int) (byte) -1);
        java.lang.String str12 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test121");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        java.lang.String str5 = book3.getLocation();
        book3.setItemType("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UNKOWN" + "'", str5.equals("UNKOWN"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test122");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setId(0);
        java.lang.String str12 = book3.getAuthor();
        int int13 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test123");
        items.Book book7 = new items.Book((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        java.lang.Class<?> wildcardClass8 = book7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test124");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test125");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
        java.lang.String str11 = book3.getTitle();
        java.lang.String str12 = book3.getItemType();
        book3.setAuthor("");
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
            System.out.format("%n%s%n", "BookTest.test126");
        items.Book book7 = new items.Book(109, "", "hi!", "hi!", 109, "hi!", "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test127");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        int int7 = book3.getNumOfCopies();
        java.lang.String str8 = book3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test128");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        book3.setAuthor("");
        int int16 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test129");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setTitle("hi!");
        int int9 = book3.getId();
        book3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 113 + "'", int6 == 113);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 113 + "'", int9 == 113);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test130");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        java.lang.String str12 = book7.getAuthor();
        java.lang.String str13 = book7.getLocation();
        java.lang.String str14 = book7.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test131");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        int int5 = book3.getId();
        java.lang.String str6 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test132");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.increaseCopies();
        book3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test133");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        java.lang.String str9 = book3.getLocation();
        book3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test134");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        int int15 = book3.getId();
        int int16 = book3.getId();
        book3.setPurchasable("");
        int int19 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test135");
        items.Book book3 = new items.Book("hi!", "UNKOWN", "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test136");
        items.Book book7 = new items.Book(0, "", "UNKOWN", "hi!", 0, "", "");
        book7.setLocation("");
        java.lang.String str10 = book7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test137");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        book3.decreaseCopies();
        java.lang.String str7 = book3.getTitle();
        java.lang.String str8 = book3.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test138");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        book3.setAuthor("hi!");
        int int12 = book3.getNumOfCopies();
        book3.setId(8);
        java.lang.String str15 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test139");
        items.Book book3 = new items.Book("UNKOWN", "", "");
        java.lang.String str4 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test140");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        int int15 = book3.getId();
        int int16 = book3.getId();
        book3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test141");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        book3.decreaseCopies();
        book3.setNumOfCopies(112);
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
            System.out.format("%n%s%n", "BookTest.test142");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getLocation();
        book3.increaseCopies();
        book3.decreaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test143");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setNumOfCopies(2);
        java.lang.String str11 = book3.getPurchasable();
        book3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test144");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        int int14 = book3.getNumOfCopies();
        java.lang.String str15 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test145");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.setItemType("UNKOWN");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test146");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        int int9 = book3.getId();
        book3.setNumOfCopies(22);
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
            System.out.format("%n%s%n", "BookTest.test147");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        book3.setAuthor("");
        book3.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test148");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getPurchasable();
        java.lang.String str8 = book3.getAuthor();
        int int9 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test149");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        book3.setId(17);
        int int11 = book3.getNumOfCopies();
        java.lang.String str12 = book3.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test150");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setItemType("UNKOWN");
        book3.decreaseCopies();
        book3.setAuthor("hi!");
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
            System.out.format("%n%s%n", "BookTest.test151");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test152");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass15 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test153");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.setNumOfCopies(10);
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
            System.out.format("%n%s%n", "BookTest.test154");
        items.Book book3 = new items.Book("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = book3.getAuthor();
        book3.setLocation("hi!");
        book3.increaseCopies();
        book3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test155");
        items.Book book7 = new items.Book(22, "UNKOWN", "UNKOWN", "", 0, "", "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test156");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        book3.setId(14);
        java.lang.String str11 = book3.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test157");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        int int7 = book3.getNumOfCopies();
        book3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test158");
        items.Book book7 = new items.Book(12, "UNKOWN", "UNKOWN", "hi!", (int) (short) -1, "UNKOWN", "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test159");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setNumOfCopies(2);
        book3.setPurchasable("");
        java.lang.String str13 = book3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test160");
        items.Book book3 = new items.Book("hi!", "UNKOWN", "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test161");
        items.Book book7 = new items.Book(113, "", "", "hi!", 10, "UNKOWN", "UNKOWN");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test162");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setItemType("UNKOWN");
        int int12 = book3.getId();
        book3.setAuthor("");
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
            System.out.format("%n%s%n", "BookTest.test163");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getLocation();
        book3.setId((int) (byte) -1);
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
            System.out.format("%n%s%n", "BookTest.test164");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        java.lang.String str10 = book3.getPurchasable();
        java.lang.String str11 = book3.getTitle();
        book3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test165");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        java.lang.String str14 = book3.getAuthor();
        book3.setId(16);
        java.lang.String str17 = book3.getLocation();
        java.lang.Class<?> wildcardClass18 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test166");
        items.Book book7 = new items.Book((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        int int8 = book7.getNumOfCopies();
        book7.increaseCopies();
        book7.setNumOfCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test167");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        book3.setAuthor("");
        java.lang.String str16 = book3.getPurchasable();
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
            System.out.format("%n%s%n", "BookTest.test168");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setPurchasable("UNKOWN");
        java.lang.Class<?> wildcardClass11 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test169");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test170");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test171");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        int int7 = book3.getId();
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test172");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        int int12 = book7.getNumOfCopies();
        java.lang.String str13 = book7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test173");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        int int13 = book3.getNumOfCopies();
        book3.increaseCopies();
        book3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass17 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test174");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        java.lang.String str6 = book3.getLocation();
        java.lang.String str7 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test175");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        book3.setPurchasable("");
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test176");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        book3.setId((-1));
        int int14 = book3.getId();
        int int15 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test177");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        book3.setPurchasable("");
        book3.setTitle("UNKOWN");
        book3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test178");
        items.Book book3 = new items.Book("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies(108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test179");
        items.Book book7 = new items.Book(16, "hi!", "hi!", "hi!", 13, "UNKOWN", "hi!");
        book7.setPurchasable("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test180");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.increaseCopies();
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test181");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        java.lang.String str5 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test182");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        java.lang.String str13 = book3.getLocation();
        book3.setNumOfCopies((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test183");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.increaseCopies();
        int int12 = book3.getId();
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test184");
        items.Book book7 = new items.Book(0, "", "UNKOWN", "hi!", 0, "", "");
        book7.setNumOfCopies((int) (byte) 100);
        book7.setPurchasable("hi!");
        java.lang.String str12 = book7.getTitle();
        book7.setNumOfCopies(109);
        book7.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test185");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        java.lang.String str10 = book3.getItemType();
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test186");
        items.Book book7 = new items.Book(109, "hi!", "hi!", "", 112, "", "UNKOWN");
        book7.setItemType("");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test187");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        java.lang.String str7 = book3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test188");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        book3.decreaseCopies();
        java.lang.Class<?> wildcardClass11 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test189");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getPurchasable();
        java.lang.String str10 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test190");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        java.lang.String str9 = book3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test191");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        int int9 = book3.getId();
        book3.setPurchasable("hi!");
        java.lang.String str12 = book3.getLocation();
        book3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test192");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        int int7 = book3.getId();
        book3.setNumOfCopies((int) '4');
        book3.setPurchasable("UNKOWN");
        int int12 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test193");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test194");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getPurchasable();
        book3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test195");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        book3.setAuthor("hi!");
        book3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 121 + "'", int6 == 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test196");
        items.Book book3 = new items.Book("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = book3.getAuthor();
        book3.increaseCopies();
        int int6 = book3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test197");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setNumOfCopies(2);
        book3.decreaseCopies();
        book3.setId(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test198");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.decreaseCopies();
        book3.decreaseCopies();
        book3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 124 + "'", int6 == 124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test199");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getAuthor();
        book3.setId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test200");
        items.Book book7 = new items.Book((int) (short) -1, "hi!", "hi!", "hi!", 111, "", "UNKOWN");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test201");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        java.lang.String str9 = book3.getTitle();
        book3.setPurchasable("");
        book3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test202");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        java.lang.String str15 = book3.getAuthor();
        book3.setItemType("hi!");
        java.lang.Class<?> wildcardClass18 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test203");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getItemType();
        book3.setPurchasable("");
        book3.setId(124);
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
            System.out.format("%n%s%n", "BookTest.test204");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        int int10 = book3.getNumOfCopies();
        java.lang.String str11 = book3.getPurchasable();
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
            System.out.format("%n%s%n", "BookTest.test205");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setId(0);
        java.lang.String str12 = book3.getAuthor();
        book3.setId(15);
        book3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test206");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        int int10 = book3.getNumOfCopies();
        int int11 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test207");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setAuthor("hi!");
        book3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test208");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
        java.lang.String str11 = book3.getTitle();
        book3.setItemType("hi!");
        book3.decreaseCopies();
        book3.decreaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test209");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        book3.setId((-1));
        java.lang.Class<?> wildcardClass14 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test210");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.setId(0);
        java.lang.String str12 = book3.getAuthor();
        book3.setId(15);
        java.lang.String str15 = book3.getPurchasable();
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
            System.out.format("%n%s%n", "BookTest.test211");
        items.Book book7 = new items.Book(105, "UNKOWN", "UNKOWN", "UNKOWN", (int) (short) 10, "hi!", "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test212");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        book3.setId(14);
        book3.increaseCopies();
        java.lang.String str12 = book3.getAuthor();
        book3.setId(10);
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
            System.out.format("%n%s%n", "BookTest.test213");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getItemType();
        java.lang.String str6 = book3.getAuthor();
        book3.setItemType("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test214");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.increaseCopies();
        book3.setTitle("UNKOWN");
        java.lang.String str13 = book3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 109 + "'", int6 == 109);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test215");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        book3.setId(14);
        book3.increaseCopies();
        java.lang.String str12 = book3.getAuthor();
        book3.setPurchasable("UNKOWN");
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
            System.out.format("%n%s%n", "BookTest.test216");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getLocation();
        java.lang.String str5 = book3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test217");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        int int12 = book7.getNumOfCopies();
        book7.setItemType("hi!");
        book7.setPurchasable("");
        book7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test218");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        int int15 = book3.getId();
        int int16 = book3.getId();
        book3.setPurchasable("");
        int int19 = book3.getId();
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test219");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
        java.lang.String str11 = book3.getTitle();
        book3.setItemType("hi!");
        book3.decreaseCopies();
        java.lang.String str15 = book3.getAuthor();
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
            System.out.format("%n%s%n", "BookTest.test220");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        book3.setPurchasable("UNKOWN");
        book3.setTitle("hi!");
        book3.decreaseCopies();
        java.lang.String str9 = book3.getLocation();
        book3.decreaseCopies();
        book3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test221");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getLocation();
        java.lang.String str10 = book3.getAuthor();
        book3.decreaseCopies();
        book3.decreaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test222");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "", 10, "", "hi!");
        book7.increaseCopies();
        book7.decreaseCopies();
        book7.setPurchasable("UNKOWN");
        int int12 = book7.getNumOfCopies();
        book7.setItemType("hi!");
        book7.setPurchasable("");
        java.lang.String str17 = book7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test223");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        java.lang.String str7 = book3.getPurchasable();
        book3.increaseCopies();
        java.lang.String str9 = book3.getPurchasable();
        java.lang.String str10 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test224");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test225");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setTitle("hi!");
        int int9 = book3.getId();
        int int10 = book3.getId();
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
            System.out.format("%n%s%n", "BookTest.test226");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        int int5 = book3.getId();
        java.lang.String str6 = book3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test227");
        items.Book book7 = new items.Book(3, "hi!", "hi!", "hi!", (int) (byte) 0, "UNKOWN", "");
        book7.increaseCopies();
        java.lang.String str9 = book7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test228");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        java.lang.String str10 = book3.getPurchasable();
        java.lang.String str11 = book3.getTitle();
        book3.setNumOfCopies((int) (short) -1);
        book3.setLocation("");
        java.lang.String str16 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test229");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test230");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setId((int) (byte) -1);
        book3.setTitle("hi!");
        book3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test231");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        java.lang.String str10 = book3.getPurchasable();
        java.lang.String str11 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test232");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        book3.setTitle("UNKOWN");
        book3.setAuthor("UNKOWN");
        book3.setTitle("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test233");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        int int7 = book3.getId();
        java.lang.String str8 = book3.getAuthor();
        book3.setAuthor("");
        book3.setTitle("UNKOWN");
        book3.setTitle("");
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
            System.out.format("%n%s%n", "BookTest.test234");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setAuthor("UNKOWN");
        book3.setAuthor("");
        book3.setAuthor("");
        book3.setAuthor("");
        book3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test235");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        book3.setId(14);
        book3.increaseCopies();
        java.lang.String str12 = book3.getAuthor();
        book3.setTitle("");
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
            System.out.format("%n%s%n", "BookTest.test236");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        java.lang.String str10 = book3.getPurchasable();
        book3.setAuthor("UNKOWN");
        int int13 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test237");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = book3.getItemType();
        java.lang.String str8 = book3.getLocation();
        java.lang.String str9 = book3.getItemType();
        java.lang.String str10 = book3.getPurchasable();
        java.lang.String str11 = book3.getLocation();
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
            System.out.format("%n%s%n", "BookTest.test238");
        items.Book book3 = new items.Book("hi!", "", "UNKOWN");
        int int4 = book3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test239");
        items.Book book7 = new items.Book(12, "UNKOWN", "UNKOWN", "", 12, "", "");
        java.lang.String str8 = book7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test240");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        java.lang.String str9 = book3.getTitle();
        book3.setPurchasable("");
        java.lang.String str12 = book3.getTitle();
        book3.setId((int) (byte) -1);
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
            System.out.format("%n%s%n", "BookTest.test241");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        int int9 = book3.getNumOfCopies();
        int int10 = book3.getId();
        java.lang.String str11 = book3.getTitle();
        book3.setItemType("hi!");
        book3.decreaseCopies();
        java.lang.String str15 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test242");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getPurchasable();
        int int6 = book3.getNumOfCopies();
        java.lang.String str7 = book3.getPurchasable();
        book3.decreaseCopies();
        int int9 = book3.getId();
        book3.setPurchasable("hi!");
        book3.setAuthor("");
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
            System.out.format("%n%s%n", "BookTest.test243");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        java.lang.String str13 = book3.getLocation();
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test244");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getPurchasable();
        java.lang.String str8 = book3.getAuthor();
        book3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test245");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test246");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.increaseCopies();
        java.lang.Class<?> wildcardClass12 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test247");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("");
        int int7 = book3.getId();
        book3.setNumOfCopies(8);
        book3.setLocation("UNKOWN");
        book3.setItemType("UNKOWN");
        java.lang.String str14 = book3.getTitle();
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
            System.out.format("%n%s%n", "BookTest.test248");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        int int15 = book3.getId();
        int int16 = book3.getId();
        book3.setPurchasable("");
        book3.increaseCopies();
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
            System.out.format("%n%s%n", "BookTest.test249");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        book3.setItemType("hi!");
        java.lang.String str13 = book3.getLocation();
        int int14 = book3.getNumOfCopies();
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
            System.out.format("%n%s%n", "BookTest.test250");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setAuthor("");
        book3.setItemType("");
        java.lang.Class<?> wildcardClass17 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test251");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        book3.decreaseCopies();
        book3.setTitle("");
        book3.setAuthor("UNKOWN");
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test252");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        book3.setItemType("");
        java.lang.String str11 = book3.getAuthor();
        java.lang.String str12 = book3.getPurchasable();
        book3.setLocation("");
        java.lang.String str15 = book3.getAuthor();
        book3.setItemType("hi!");
        int int18 = book3.getId();
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
            System.out.format("%n%s%n", "BookTest.test253");
        items.Book book3 = new items.Book("hi!", "", "");
        book3.setNumOfCopies(0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test254");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        book3.decreaseCopies();
        java.lang.String str10 = book3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test255");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = book3.getTitle();
        book3.setItemType("");
        book3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test256");
        items.Book book7 = new items.Book(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.String str8 = book7.getLocation();
        java.lang.String str9 = book7.getItemType();
        book7.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test257");
        items.Book book3 = new items.Book("", "UNKOWN", "");
        java.lang.String str4 = book3.getItemType();
        book3.setLocation("");
        java.lang.String str7 = book3.getPurchasable();
        book3.setId(0);
        book3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test258");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setLocation("hi!");
        java.lang.String str9 = book3.getTitle();
        book3.setId((int) (byte) -1);
        java.lang.String str12 = book3.getPurchasable();
        book3.setId(3);
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
            System.out.format("%n%s%n", "BookTest.test259");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.setTitle("hi!");
        int int6 = book3.getId();
        book3.setId((int) (short) 100);
        int int9 = book3.getNumOfCopies();
        book3.setAuthor("hi!");
        java.lang.String str12 = book3.getItemType();
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
            System.out.format("%n%s%n", "BookTest.test260");
        items.Book book3 = new items.Book("", "UNKOWN", "UNKOWN");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test261");
        items.Book book7 = new items.Book((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        book7.setNumOfCopies(23);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test262");
        items.Book book3 = new items.Book("hi!", "", "hi!");
        java.lang.String str4 = book3.getAuthor();
        book3.setAuthor("UNKOWN");
        book3.increaseCopies();
        java.lang.String str8 = book3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookTest.test263");
        items.Book book3 = new items.Book("hi!", "hi!", "hi!");
        book3.increaseCopies();
        book3.setPurchasable("UNKOWN");
        java.lang.String str7 = book3.getPurchasable();
        java.lang.String str8 = book3.getAuthor();
        java.lang.Class<?> wildcardClass9 = book3.getClass();
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
            System.out.format("%n%s%n", "BookTest.test264");
        items.Book book7 = new items.Book(0, "UNKOWN", "", "", 1, "", "hi!");
    }
}
