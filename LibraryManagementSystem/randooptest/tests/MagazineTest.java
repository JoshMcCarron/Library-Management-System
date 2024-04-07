package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MagazineTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test001");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test002");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        magazine3.setId(12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test003");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test004");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        java.lang.String str10 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test005");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setTitle("hi!");
        java.lang.Class<?> wildcardClass12 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test006");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        java.lang.Class<?> wildcardClass6 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test007");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        magazine3.setAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test008");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "hi!", "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test009");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        magazine3.setAuthor("hi!");
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test010");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        java.lang.Class<?> wildcardClass9 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test011");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        java.lang.String str10 = magazine3.getPurchasable();
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
            System.out.format("%n%s%n", "MagazineTest.test012");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test013");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("");
        magazine3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test014");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
        java.lang.String str12 = magazine3.getPurchasable();
        java.lang.String str13 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test015");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        magazine3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test016");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
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
            System.out.format("%n%s%n", "MagazineTest.test017");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        int int10 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test018");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.increaseCopies();
        java.lang.Class<?> wildcardClass11 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test019");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        java.lang.String str10 = magazine3.getTitle();
        magazine3.decreaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test020");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        int int6 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test021");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        java.lang.String str14 = magazine3.getAuthor();
        java.lang.String str15 = magazine3.getPurchasable();
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
            System.out.format("%n%s%n", "MagazineTest.test022");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test023");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
        java.lang.String str12 = magazine3.getPurchasable();
        int int13 = magazine3.getId();
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
            System.out.format("%n%s%n", "MagazineTest.test024");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setNumOfCopies((int) '#');
        magazine7.increaseCopies();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test025");
        items.Magazine magazine7 = new items.Magazine(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        magazine7.setLocation("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test026");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "hi!", "UNKOWN");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test027");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        magazine7.decreaseCopies();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test028");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        java.lang.String str10 = magazine3.getTitle();
        java.lang.String str11 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test029");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setId(0);
        magazine3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test030");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.Class<?> wildcardClass5 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test031");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setItemType("UNKOWN");
        magazine3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test032");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        java.lang.Class<?> wildcardClass10 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test033");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test034");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test035");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        java.lang.String str6 = magazine3.getAuthor();
        int int7 = magazine3.getId();
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
            System.out.format("%n%s%n", "MagazineTest.test036");
        items.Magazine magazine7 = new items.Magazine(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        magazine7.setTitle("UNKOWN");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test037");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test038");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.decreaseCopies();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test039");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "hi!");
        magazine3.setItemType("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test040");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setPurchasable("");
        java.lang.String str12 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test041");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test042");
        items.Magazine magazine7 = new items.Magazine(0, "", "UNKOWN", "hi!", 0, "", "");
        magazine7.setNumOfCopies((int) (byte) 100);
        magazine7.setNumOfCopies((int) '#');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test043");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        java.lang.String str9 = magazine3.getLocation();
        java.lang.String str10 = magazine3.getLocation();
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test044");
        items.Magazine magazine3 = new items.Magazine("", "hi!", "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test045");
        items.Magazine magazine7 = new items.Magazine(12, "hi!", "", "UNKOWN", (int) (byte) 10, "", "hi!");
        magazine7.setPurchasable("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test046");
        items.Magazine magazine7 = new items.Magazine(13, "", "hi!", "UNKOWN", 5, "UNKOWN", "hi!");
        java.lang.String str8 = magazine7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test047");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        magazine3.setId(16);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test048");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setTitle("hi!");
        java.lang.String str9 = magazine3.getLocation();
        java.lang.String str10 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test049");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        java.lang.String str6 = magazine3.getAuthor();
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test050");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        int int5 = magazine3.getId();
        magazine3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test051");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        java.lang.Class<?> wildcardClass10 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test052");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.decreaseCopies();
        java.lang.String str11 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test053");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        magazine3.setAuthor("hi!");
        magazine3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test054");
        items.Magazine magazine7 = new items.Magazine(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test055");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        magazine3.setTitle("hi!");
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
            System.out.format("%n%s%n", "MagazineTest.test056");
        items.Magazine magazine7 = new items.Magazine((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        magazine7.setAuthor("");
        java.lang.Class<?> wildcardClass10 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test057");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "");
        java.lang.String str4 = magazine3.getLocation();
        magazine3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test058");
        items.Magazine magazine7 = new items.Magazine(14, "UNKOWN", "", "", 12, "", "hi!");
        int int8 = magazine7.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test059");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setTitle("hi!");
        java.lang.String str9 = magazine3.getLocation();
        java.lang.Class<?> wildcardClass10 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test060");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        magazine3.setTitle("hi!");
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
            System.out.format("%n%s%n", "MagazineTest.test061");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test062");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        int int12 = magazine7.getNumOfCopies();
        magazine7.setItemType("hi!");
        magazine7.setId(23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test063");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        magazine3.setPurchasable("");
        magazine3.setTitle("UNKOWN");
        java.lang.String str11 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test064");
        items.Magazine magazine7 = new items.Magazine((int) (byte) 100, "hi!", "", "hi!", 10, "hi!", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test065");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        java.lang.Class<?> wildcardClass6 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test066");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "UNKOWN", "UNKOWN");
        int int4 = magazine3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test067");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setPurchasable("");
        magazine3.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test068");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        magazine3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 105 + "'", int6 == 105);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test069");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        magazine3.setId(14);
        magazine3.setPurchasable("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test070");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        magazine3.increaseCopies();
        magazine3.setAuthor("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test071");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        int int12 = magazine7.getNumOfCopies();
        magazine7.setItemType("hi!");
        java.lang.String str15 = magazine7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test072");
        items.Magazine magazine7 = new items.Magazine((int) (short) 0, "UNKOWN", "hi!", "", (int) (short) -1, "hi!", "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test073");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setPurchasable("");
        magazine3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test074");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        magazine3.setAuthor("hi!");
        magazine3.setPurchasable("hi!");
        magazine3.setId(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test075");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test076");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        java.lang.String str9 = magazine3.getLocation();
        java.lang.String str10 = magazine3.getLocation();
        java.lang.Class<?> wildcardClass11 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test077");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setAuthor("");
        int int15 = magazine3.getId();
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test078");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("");
        java.lang.Class<?> wildcardClass13 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test079");
        items.Magazine magazine7 = new items.Magazine(5, "", "UNKOWN", "hi!", 9, "UNKOWN", "");
        java.lang.Class<?> wildcardClass8 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test080");
        items.Magazine magazine7 = new items.Magazine(7, "hi!", "hi!", "hi!", (int) (byte) 100, "hi!", "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test081");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        java.lang.String str10 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test082");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("UNKOWN");
        magazine3.decreaseCopies();
        int int8 = magazine3.getNumOfCopies();
        magazine3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test083");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        magazine3.increaseCopies();
        magazine3.setLocation("");
        java.lang.String str13 = magazine3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test084");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        java.lang.String str10 = magazine3.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test085");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "UNKOWN", "UNKOWN");
        magazine3.increaseCopies();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test086");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        magazine3.increaseCopies();
        java.lang.Class<?> wildcardClass15 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test087");
        items.Magazine magazine7 = new items.Magazine(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        int int8 = magazine7.getNumOfCopies();
        java.lang.Class<?> wildcardClass9 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test088");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        java.lang.String str14 = magazine3.getAuthor();
        magazine3.setId(16);
        java.lang.String str17 = magazine3.getLocation();
        magazine3.setId(3);
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
            System.out.format("%n%s%n", "MagazineTest.test089");
        items.Magazine magazine7 = new items.Magazine(0, "", "UNKOWN", "hi!", 0, "", "");
        magazine7.setNumOfCopies((int) (byte) 100);
        magazine7.setPurchasable("hi!");
        java.lang.String str12 = magazine7.getTitle();
        java.lang.String str13 = magazine7.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test090");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setNumOfCopies(2);
        magazine3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test091");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        int int15 = magazine3.getId();
        magazine3.setAuthor("");
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
            System.out.format("%n%s%n", "MagazineTest.test092");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        magazine3.setAuthor("");
        java.lang.String str8 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test093");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        magazine3.setPurchasable("");
        magazine3.setTitle("UNKOWN");
        magazine3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test094");
        items.Magazine magazine7 = new items.Magazine(105, "UNKOWN", "", "hi!", 106, "", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test095");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        java.lang.String str9 = magazine3.getPurchasable();
        magazine3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test096");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        int int11 = magazine3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test097");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.setNumOfCopies(8);
        magazine7.setTitle("UNKOWN");
        java.lang.String str13 = magazine7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test098");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        int int5 = magazine3.getId();
        magazine3.setNumOfCopies((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test099");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        java.lang.String str6 = magazine3.getAuthor();
        java.lang.Class<?> wildcardClass7 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test100");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        java.lang.String str14 = magazine3.getAuthor();
        magazine3.setId(16);
        magazine3.setId((int) (short) 1);
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
            System.out.format("%n%s%n", "MagazineTest.test101");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setTitle("hi!");
        java.lang.String str9 = magazine3.getLocation();
        magazine3.setNumOfCopies(10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test102");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setItemType("hi!");
        magazine3.setTitle("hi!");
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
            System.out.format("%n%s%n", "MagazineTest.test103");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        java.lang.String str10 = magazine3.getTitle();
        java.lang.String str11 = magazine3.getPurchasable();
        magazine3.setItemType("hi!");
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
            System.out.format("%n%s%n", "MagazineTest.test104");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setPurchasable("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test105");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("UNKOWN");
        magazine3.decreaseCopies();
        magazine3.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test106");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "");
        magazine3.setTitle("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test107");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setNumOfCopies((int) '#');
        magazine7.setLocation("UNKOWN");
        magazine7.setId(4);
        java.lang.String str16 = magazine7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test108");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setNumOfCopies(106);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test109");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        java.lang.String str5 = magazine3.getTitle();
        magazine3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test110");
        items.Magazine magazine7 = new items.Magazine(1, "UNKOWN", "hi!", "", 6, "", "UNKOWN");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test111");
        items.Magazine magazine7 = new items.Magazine(9, "", "hi!", "hi!", (int) (short) 100, "UNKOWN", "");
        magazine7.setTitle("");
        java.lang.String str10 = magazine7.getItemType();
        magazine7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test112");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        int int7 = magazine3.getId();
        java.lang.Class<?> wildcardClass8 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test113");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setAuthor("UNKOWN");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test114");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "hi!", 8, "UNKOWN", "hi!");
        magazine7.setTitle("");
        java.lang.String str10 = magazine7.getLocation();
        java.lang.String str11 = magazine7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UNKOWN" + "'", str10.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test115");
        items.Magazine magazine7 = new items.Magazine(14, "UNKOWN", "", "", 12, "", "hi!");
        magazine7.setAuthor("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test116");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "UNKOWN", "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test117");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        magazine3.increaseCopies();
        java.lang.String str15 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test118");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.increaseCopies();
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test119");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        magazine3.setPurchasable("");
        magazine3.setNumOfCopies((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test120");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
        java.lang.String str12 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test121");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        java.lang.String str5 = magazine3.getLocation();
        magazine3.setItemType("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UNKOWN" + "'", str5.equals("UNKOWN"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test122");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setId(0);
        java.lang.String str12 = magazine3.getAuthor();
        int int13 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test123");
        items.Magazine magazine7 = new items.Magazine((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        java.lang.Class<?> wildcardClass8 = magazine7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test124");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test125");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
        java.lang.String str11 = magazine3.getTitle();
        java.lang.String str12 = magazine3.getItemType();
        magazine3.setAuthor("");
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
            System.out.format("%n%s%n", "MagazineTest.test126");
        items.Magazine magazine7 = new items.Magazine(109, "", "hi!", "hi!", 109, "hi!", "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test127");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        int int7 = magazine3.getNumOfCopies();
        java.lang.String str8 = magazine3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UNKOWN" + "'", str8.equals("UNKOWN"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test128");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        magazine3.setAuthor("");
        int int16 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test129");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setTitle("hi!");
        int int9 = magazine3.getId();
        magazine3.setItemType("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 113 + "'", int6 == 113);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 113 + "'", int9 == 113);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test130");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        java.lang.String str12 = magazine7.getAuthor();
        java.lang.String str13 = magazine7.getLocation();
        java.lang.String str14 = magazine7.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test131");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        int int5 = magazine3.getId();
        java.lang.String str6 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test132");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.increaseCopies();
        magazine3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test133");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        java.lang.String str9 = magazine3.getLocation();
        magazine3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test134");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        int int15 = magazine3.getId();
        int int16 = magazine3.getId();
        magazine3.setPurchasable("");
        int int19 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test135");
        items.Magazine magazine3 = new items.Magazine("hi!", "UNKOWN", "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test136");
        items.Magazine magazine7 = new items.Magazine(0, "", "UNKOWN", "hi!", 0, "", "");
        magazine7.setLocation("");
        java.lang.String str10 = magazine7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test137");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        java.lang.String str7 = magazine3.getTitle();
        java.lang.String str8 = magazine3.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test138");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        magazine3.setAuthor("hi!");
        int int12 = magazine3.getNumOfCopies();
        magazine3.setId(8);
        java.lang.String str15 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test139");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "");
        java.lang.String str4 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test140");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        int int15 = magazine3.getId();
        int int16 = magazine3.getId();
        magazine3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test141");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        magazine3.decreaseCopies();
        magazine3.setNumOfCopies(112);
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
            System.out.format("%n%s%n", "MagazineTest.test142");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getLocation();
        magazine3.increaseCopies();
        magazine3.decreaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test143");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setNumOfCopies(2);
        java.lang.String str11 = magazine3.getPurchasable();
        magazine3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test144");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        int int14 = magazine3.getNumOfCopies();
        java.lang.String str15 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test145");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.setItemType("UNKOWN");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test146");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        magazine3.setNumOfCopies(22);
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
            System.out.format("%n%s%n", "MagazineTest.test147");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        magazine3.setAuthor("");
        magazine3.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test148");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getPurchasable();
        java.lang.String str8 = magazine3.getAuthor();
        int int9 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test149");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        magazine3.setId(17);
        int int11 = magazine3.getNumOfCopies();
        java.lang.String str12 = magazine3.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test150");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setItemType("UNKOWN");
        magazine3.decreaseCopies();
        magazine3.setAuthor("hi!");
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
            System.out.format("%n%s%n", "MagazineTest.test151");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test152");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass15 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test153");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.setNumOfCopies(10);
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
            System.out.format("%n%s%n", "MagazineTest.test154");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setLocation("hi!");
        magazine3.increaseCopies();
        magazine3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test155");
        items.Magazine magazine7 = new items.Magazine(22, "UNKOWN", "UNKOWN", "", 0, "", "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test156");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        magazine3.setId(14);
        java.lang.String str11 = magazine3.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test157");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        int int7 = magazine3.getNumOfCopies();
        magazine3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test158");
        items.Magazine magazine7 = new items.Magazine(12, "UNKOWN", "UNKOWN", "hi!", (int) (short) -1, "UNKOWN", "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test159");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setNumOfCopies(2);
        magazine3.setPurchasable("");
        java.lang.String str13 = magazine3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test160");
        items.Magazine magazine3 = new items.Magazine("hi!", "UNKOWN", "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test161");
        items.Magazine magazine7 = new items.Magazine(113, "", "", "hi!", 10, "UNKOWN", "UNKOWN");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test162");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setItemType("UNKOWN");
        int int12 = magazine3.getId();
        magazine3.setAuthor("");
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
            System.out.format("%n%s%n", "MagazineTest.test163");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getLocation();
        magazine3.setId((int) (byte) -1);
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
            System.out.format("%n%s%n", "MagazineTest.test164");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        java.lang.String str10 = magazine3.getPurchasable();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test165");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        java.lang.String str14 = magazine3.getAuthor();
        magazine3.setId(16);
        java.lang.String str17 = magazine3.getLocation();
        java.lang.Class<?> wildcardClass18 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test166");
        items.Magazine magazine7 = new items.Magazine((int) (short) 0, "UNKOWN", "hi!", "", (int) (byte) 10, "hi!", "");
        int int8 = magazine7.getNumOfCopies();
        magazine7.increaseCopies();
        magazine7.setNumOfCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test167");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        magazine3.setAuthor("");
        java.lang.String str16 = magazine3.getPurchasable();
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
            System.out.format("%n%s%n", "MagazineTest.test168");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setPurchasable("UNKOWN");
        java.lang.Class<?> wildcardClass11 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test169");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test170");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test171");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        int int7 = magazine3.getId();
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test172");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        int int12 = magazine7.getNumOfCopies();
        java.lang.String str13 = magazine7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test173");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        int int13 = magazine3.getNumOfCopies();
        magazine3.increaseCopies();
        magazine3.setItemType("UNKOWN");
        java.lang.Class<?> wildcardClass17 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test174");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        java.lang.String str6 = magazine3.getLocation();
        java.lang.String str7 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test175");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        magazine3.setPurchasable("");
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test176");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        magazine3.setId((-1));
        int int14 = magazine3.getId();
        int int15 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test177");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        magazine3.setPurchasable("");
        magazine3.setTitle("UNKOWN");
        magazine3.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test178");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies(108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test179");
        items.Magazine magazine7 = new items.Magazine(16, "hi!", "hi!", "hi!", 13, "UNKOWN", "hi!");
        magazine7.setPurchasable("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test180");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.increaseCopies();
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test181");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        java.lang.String str5 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test182");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        java.lang.String str13 = magazine3.getLocation();
        magazine3.setNumOfCopies((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test183");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.increaseCopies();
        int int12 = magazine3.getId();
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test184");
        items.Magazine magazine7 = new items.Magazine(0, "", "UNKOWN", "hi!", 0, "", "");
        magazine7.setNumOfCopies((int) (byte) 100);
        magazine7.setPurchasable("hi!");
        java.lang.String str12 = magazine7.getTitle();
        magazine7.setNumOfCopies(109);
        magazine7.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test185");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        java.lang.String str10 = magazine3.getItemType();
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test186");
        items.Magazine magazine7 = new items.Magazine(109, "hi!", "hi!", "", 112, "", "UNKOWN");
        magazine7.setItemType("");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test187");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        java.lang.String str7 = magazine3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test188");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        magazine3.decreaseCopies();
        java.lang.Class<?> wildcardClass11 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test189");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getPurchasable();
        java.lang.String str10 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test190");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        java.lang.String str9 = magazine3.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test191");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        magazine3.setPurchasable("hi!");
        java.lang.String str12 = magazine3.getLocation();
        magazine3.setTitle("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test192");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        int int7 = magazine3.getId();
        magazine3.setNumOfCopies((int) '4');
        magazine3.setPurchasable("UNKOWN");
        int int12 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test193");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test194");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test195");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        magazine3.setAuthor("hi!");
        magazine3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 121 + "'", int6 == 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test196");
        items.Magazine magazine3 = new items.Magazine("UNKOWN", "", "UNKOWN");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.increaseCopies();
        int int6 = magazine3.getNumOfCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test197");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setNumOfCopies(2);
        magazine3.decreaseCopies();
        magazine3.setId(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test198");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.decreaseCopies();
        magazine3.decreaseCopies();
        magazine3.increaseCopies();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 124 + "'", int6 == 124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test199");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getAuthor();
        magazine3.setId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test200");
        items.Magazine magazine7 = new items.Magazine((int) (short) -1, "hi!", "hi!", "hi!", 111, "", "UNKOWN");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test201");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setPurchasable("");
        magazine3.setAuthor("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test202");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        java.lang.String str15 = magazine3.getAuthor();
        magazine3.setItemType("hi!");
        java.lang.Class<?> wildcardClass18 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test203");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getItemType();
        magazine3.setPurchasable("");
        magazine3.setId(124);
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
            System.out.format("%n%s%n", "MagazineTest.test204");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        int int10 = magazine3.getNumOfCopies();
        java.lang.String str11 = magazine3.getPurchasable();
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
            System.out.format("%n%s%n", "MagazineTest.test205");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setId(0);
        java.lang.String str12 = magazine3.getAuthor();
        magazine3.setId(15);
        magazine3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test206");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        int int10 = magazine3.getNumOfCopies();
        int int11 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test207");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setAuthor("hi!");
        magazine3.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test208");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setItemType("hi!");
        magazine3.decreaseCopies();
        magazine3.decreaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test209");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        magazine3.setId((-1));
        java.lang.Class<?> wildcardClass14 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test210");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.setId(0);
        java.lang.String str12 = magazine3.getAuthor();
        magazine3.setId(15);
        java.lang.String str15 = magazine3.getPurchasable();
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
            System.out.format("%n%s%n", "MagazineTest.test211");
        items.Magazine magazine7 = new items.Magazine(105, "UNKOWN", "UNKOWN", "UNKOWN", (int) (short) 10, "hi!", "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test212");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        magazine3.setId(14);
        magazine3.increaseCopies();
        java.lang.String str12 = magazine3.getAuthor();
        magazine3.setId(10);
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
            System.out.format("%n%s%n", "MagazineTest.test213");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getItemType();
        java.lang.String str6 = magazine3.getAuthor();
        magazine3.setItemType("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test214");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.increaseCopies();
        magazine3.setTitle("UNKOWN");
        java.lang.String str13 = magazine3.getTitle();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 109 + "'", int6 == 109);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test215");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        magazine3.setId(14);
        magazine3.increaseCopies();
        java.lang.String str12 = magazine3.getAuthor();
        magazine3.setPurchasable("UNKOWN");
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
            System.out.format("%n%s%n", "MagazineTest.test216");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getLocation();
        java.lang.String str5 = magazine3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UNKOWN" + "'", str4.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test217");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        int int12 = magazine7.getNumOfCopies();
        magazine7.setItemType("hi!");
        magazine7.setPurchasable("");
        magazine7.setPurchasable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test218");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        int int15 = magazine3.getId();
        int int16 = magazine3.getId();
        magazine3.setPurchasable("");
        int int19 = magazine3.getId();
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test219");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setItemType("hi!");
        magazine3.decreaseCopies();
        java.lang.String str15 = magazine3.getAuthor();
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
            System.out.format("%n%s%n", "MagazineTest.test220");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        magazine3.setPurchasable("UNKOWN");
        magazine3.setTitle("hi!");
        magazine3.decreaseCopies();
        java.lang.String str9 = magazine3.getLocation();
        magazine3.decreaseCopies();
        magazine3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKOWN" + "'", str9.equals("UNKOWN"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test221");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getLocation();
        java.lang.String str10 = magazine3.getAuthor();
        magazine3.decreaseCopies();
        magazine3.decreaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test222");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "", 10, "", "hi!");
        magazine7.increaseCopies();
        magazine7.decreaseCopies();
        magazine7.setPurchasable("UNKOWN");
        int int12 = magazine7.getNumOfCopies();
        magazine7.setItemType("hi!");
        magazine7.setPurchasable("");
        java.lang.String str17 = magazine7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test223");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.increaseCopies();
        java.lang.String str9 = magazine3.getPurchasable();
        java.lang.String str10 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test224");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test225");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setTitle("hi!");
        int int9 = magazine3.getId();
        int int10 = magazine3.getId();
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
            System.out.format("%n%s%n", "MagazineTest.test226");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        int int5 = magazine3.getId();
        java.lang.String str6 = magazine3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test227");
        items.Magazine magazine7 = new items.Magazine(3, "hi!", "hi!", "hi!", (int) (byte) 0, "UNKOWN", "");
        magazine7.increaseCopies();
        java.lang.String str9 = magazine7.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test228");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        java.lang.String str10 = magazine3.getPurchasable();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setNumOfCopies((int) (short) -1);
        magazine3.setLocation("");
        java.lang.String str16 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test229");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setAuthor("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test230");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
        magazine3.setTitle("hi!");
        magazine3.setId(19);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test231");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        java.lang.String str10 = magazine3.getPurchasable();
        java.lang.String str11 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test232");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        magazine3.setTitle("UNKOWN");
        magazine3.setAuthor("UNKOWN");
        magazine3.setTitle("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test233");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        int int7 = magazine3.getId();
        java.lang.String str8 = magazine3.getAuthor();
        magazine3.setAuthor("");
        magazine3.setTitle("UNKOWN");
        magazine3.setTitle("");
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
            System.out.format("%n%s%n", "MagazineTest.test234");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setAuthor("UNKOWN");
        magazine3.setAuthor("");
        magazine3.setAuthor("");
        magazine3.setAuthor("");
        magazine3.setPurchasable("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test235");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        magazine3.setId(14);
        magazine3.increaseCopies();
        java.lang.String str12 = magazine3.getAuthor();
        magazine3.setTitle("");
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
            System.out.format("%n%s%n", "MagazineTest.test236");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        java.lang.String str10 = magazine3.getPurchasable();
        magazine3.setAuthor("UNKOWN");
        int int13 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test237");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setNumOfCopies((int) (byte) 10);
        java.lang.String str7 = magazine3.getItemType();
        java.lang.String str8 = magazine3.getLocation();
        java.lang.String str9 = magazine3.getItemType();
        java.lang.String str10 = magazine3.getPurchasable();
        java.lang.String str11 = magazine3.getLocation();
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
            System.out.format("%n%s%n", "MagazineTest.test238");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "UNKOWN");
        int int4 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test239");
        items.Magazine magazine7 = new items.Magazine(12, "UNKOWN", "UNKOWN", "", 12, "", "");
        java.lang.String str8 = magazine7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test240");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setPurchasable("");
        java.lang.String str12 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
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
            System.out.format("%n%s%n", "MagazineTest.test241");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        int int9 = magazine3.getNumOfCopies();
        int int10 = magazine3.getId();
        java.lang.String str11 = magazine3.getTitle();
        magazine3.setItemType("hi!");
        magazine3.decreaseCopies();
        java.lang.String str15 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test242");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        java.lang.String str5 = magazine3.getPurchasable();
        int int6 = magazine3.getNumOfCopies();
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.decreaseCopies();
        int int9 = magazine3.getId();
        magazine3.setPurchasable("hi!");
        magazine3.setAuthor("");
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
            System.out.format("%n%s%n", "MagazineTest.test243");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        java.lang.String str13 = magazine3.getLocation();
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UNKOWN" + "'", str13.equals("UNKOWN"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test244");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getPurchasable();
        java.lang.String str8 = magazine3.getAuthor();
        magazine3.setTitle("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UNKOWN" + "'", str7.equals("UNKOWN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test245");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test246");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.increaseCopies();
        java.lang.Class<?> wildcardClass12 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test247");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("");
        int int7 = magazine3.getId();
        magazine3.setNumOfCopies(8);
        magazine3.setLocation("UNKOWN");
        magazine3.setItemType("UNKOWN");
        java.lang.String str14 = magazine3.getTitle();
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
            System.out.format("%n%s%n", "MagazineTest.test248");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        int int15 = magazine3.getId();
        int int16 = magazine3.getId();
        magazine3.setPurchasable("");
        magazine3.increaseCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test249");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        magazine3.setItemType("hi!");
        java.lang.String str13 = magazine3.getLocation();
        int int14 = magazine3.getNumOfCopies();
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
            System.out.format("%n%s%n", "MagazineTest.test250");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setAuthor("");
        magazine3.setItemType("");
        java.lang.Class<?> wildcardClass17 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test251");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        magazine3.decreaseCopies();
        magazine3.setTitle("");
        magazine3.setAuthor("UNKOWN");
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test252");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        magazine3.setItemType("");
        java.lang.String str11 = magazine3.getAuthor();
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setLocation("");
        java.lang.String str15 = magazine3.getAuthor();
        magazine3.setItemType("hi!");
        int int18 = magazine3.getId();
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
            System.out.format("%n%s%n", "MagazineTest.test253");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "");
        magazine3.setNumOfCopies(0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test254");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        magazine3.decreaseCopies();
        java.lang.String str10 = magazine3.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test255");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setNumOfCopies((int) (short) 10);
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setItemType("");
        magazine3.decreaseCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test256");
        items.Magazine magazine7 = new items.Magazine(0, "hi!", "hi!", "", (int) (short) 10, "hi!", "hi!");
        java.lang.String str8 = magazine7.getLocation();
        java.lang.String str9 = magazine7.getItemType();
        magazine7.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test257");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "");
        java.lang.String str4 = magazine3.getItemType();
        magazine3.setLocation("");
        java.lang.String str7 = magazine3.getPurchasable();
        magazine3.setId(0);
        magazine3.setLocation("UNKOWN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test258");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setLocation("hi!");
        java.lang.String str9 = magazine3.getTitle();
        magazine3.setId((int) (byte) -1);
        java.lang.String str12 = magazine3.getPurchasable();
        magazine3.setId(3);
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
            System.out.format("%n%s%n", "MagazineTest.test259");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.setTitle("hi!");
        int int6 = magazine3.getId();
        magazine3.setId((int) (short) 100);
        int int9 = magazine3.getNumOfCopies();
        magazine3.setAuthor("hi!");
        java.lang.String str12 = magazine3.getItemType();
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
            System.out.format("%n%s%n", "MagazineTest.test260");
        items.Magazine magazine3 = new items.Magazine("", "UNKOWN", "UNKOWN");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test261");
        items.Magazine magazine7 = new items.Magazine((int) (short) 1, "", "", "hi!", (int) (byte) 100, "", "");
        magazine7.setNumOfCopies(23);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test262");
        items.Magazine magazine3 = new items.Magazine("hi!", "", "hi!");
        java.lang.String str4 = magazine3.getAuthor();
        magazine3.setAuthor("UNKOWN");
        magazine3.increaseCopies();
        java.lang.String str8 = magazine3.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MagazineTest.test263");
        items.Magazine magazine3 = new items.Magazine("hi!", "hi!", "hi!");
        magazine3.increaseCopies();
        magazine3.setPurchasable("UNKOWN");
        java.lang.String str7 = magazine3.getPurchasable();
        java.lang.String str8 = magazine3.getAuthor();
        java.lang.Class<?> wildcardClass9 = magazine3.getClass();
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
            System.out.format("%n%s%n", "MagazineTest.test264");
        items.Magazine magazine7 = new items.Magazine(0, "UNKOWN", "", "", 1, "", "hi!");
    }
}
