package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemKeeperTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test001");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = book3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test002");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass4 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test003");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test004");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test006");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test007");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test008");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test009");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = book12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test010");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test011");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test012");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test013");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test014");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test015");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test016");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test017");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass22 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test018");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test019");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass10 = cD9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test020");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test021");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test022");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass4 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test023");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test024");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test025");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass4 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test026");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test027");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        java.lang.Class<?> wildcardClass19 = cD18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test028");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass10 = book9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test029");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.Book book24 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test030");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test031");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass19 = magazine18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test032");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test033");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test034");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test035");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = cD15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test036");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test037");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = cD6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test038");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test039");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.CD cD21 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass22 = cD21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test040");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass19 = magazine18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test041");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass16 = magazine15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test042");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        java.lang.Class<?> wildcardClass10 = book9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test043");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass16 = magazine15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test044");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = magazine9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test045");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD12 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test046");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.CD cD24 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test047");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test048");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test049");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test050");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test051");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test052");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test053");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass19 = book18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test054");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test055");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test056");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test057");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test058");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test059");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass7 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test060");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test061");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "");
        items.CD cD24 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass25 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test062");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass19 = book18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test063");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test064");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = book9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test065");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test066");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test067");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test068");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = magazine12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test069");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = cD18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test070");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test071");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book24 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test072");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test073");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test074");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test075");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("hi!", "");
        items.CD cD27 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD27);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test076");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test077");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test078");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test079");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test080");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass13 = magazine12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test081");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Book book21 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test082");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass16 = magazine15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test083");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.CD cD21 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test084");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test085");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test086");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test087");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.Book book24 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test088");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test089");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test090");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test091");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test092");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test093");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass16 = magazine15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test094");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass19 = book18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test095");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test096");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test097");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        java.lang.Class<?> wildcardClass22 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test098");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test099");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass13 = magazine12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test100");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass25 = magazine24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test101");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test102");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "");
        items.CD cD18 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test103");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = cD15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test104");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test105");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test106");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test107");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test108");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test109");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test110");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test111");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass13 = cD12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test112");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass22 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test113");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test114");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test115");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test116");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test117");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test118");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test119");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test120");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.Book book15 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test121");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass19 = magazine18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test122");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test123");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass7 = cD6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test124");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "");
        java.lang.Class<?> wildcardClass19 = cD18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test125");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test126");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test127");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test128");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test129");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("", "");
        items.CD cD12 = itemKeeper0.createCD("", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test130");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD27 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass28 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test131");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test132");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        items.Book book24 = itemKeeper0.createBook("hi!", "");
        items.Book book27 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test133");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test134");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "");
        items.Book book24 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test135");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test136");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test137");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test138");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Book book21 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test139");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test140");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass4 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test141");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass22 = magazine21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test142");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test143");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = magazine18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test144");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test145");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test146");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test147");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test148");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test149");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test150");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test151");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("", "hi!");
        items.CD cD24 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test152");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test153");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test154");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test155");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test156");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test157");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test158");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test159");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test160");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test161");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test162");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test163");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test164");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test165");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test166");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test167");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test168");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book27 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine30 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine30);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test169");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test170");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.CD cD21 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test171");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        items.Book book24 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test172");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test173");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Book book15 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test174");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test175");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass22 = magazine21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test176");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test177");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("", "");
        items.CD cD12 = itemKeeper0.createCD("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test178");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test179");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test180");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine27 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine27);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test181");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test182");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test183");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test184");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.CD cD15 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test185");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test186");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.CD cD12 = itemKeeper0.createCD("", "");
        items.Book book15 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test187");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test188");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test189");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test190");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book24 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test191");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test192");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test193");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        items.CD cD27 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test194");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.Book book24 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test195");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test196");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test197");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("hi!", "");
        items.Book book27 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test198");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.Book book21 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test199");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test200");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test201");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass10 = book9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test202");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test203");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        items.Book book24 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test204");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test205");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("", "hi!");
        items.Book book24 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test206");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass22 = book21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test207");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test208");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine27 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine27);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test209");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book27 = itemKeeper0.createBook("hi!", "");
        items.CD cD30 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD30);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test210");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test211");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test212");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test213");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test214");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test215");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test216");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test217");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test218");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        items.Book book24 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test219");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test220");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test221");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass22 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test222");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test223");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD27 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine30 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine30);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test224");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test225");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test226");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test227");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test228");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.CD cD15 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test229");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test230");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        items.Book book24 = itemKeeper0.createBook("", "hi!");
        items.Book book27 = itemKeeper0.createBook("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test231");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD21 = itemKeeper0.createCD("", "");
        items.Book book24 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test232");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test233");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        java.lang.Class<?> wildcardClass22 = magazine21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test234");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test235");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test236");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test237");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test238");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test239");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test240");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test241");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass16 = book15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test242");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test243");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test244");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "hi!");
        java.lang.Class<?> wildcardClass19 = cD18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test245");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine27 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine27);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test246");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test247");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Book book15 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test248");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test249");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test250");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test251");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test252");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        items.CD cD24 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test253");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test254");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test255");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD18 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book24 = itemKeeper0.createBook("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test256");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test257");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass10 = magazine9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test258");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "");
        items.CD cD9 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        java.lang.Class<?> wildcardClass16 = cD15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test259");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("", "");
        items.Book book12 = itemKeeper0.createBook("", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("", "hi!");
        java.lang.Class<?> wildcardClass22 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test260");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Book book9 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test261");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD21 = itemKeeper0.createCD("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test262");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.CD cD21 = itemKeeper0.createCD("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test263");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test264");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine6 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD12 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test265");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test266");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine21 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        items.Book book27 = itemKeeper0.createBook("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test267");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.CD cD6 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine12 = itemKeeper0.createMagazine("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        items.CD cD21 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test268");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book27 = itemKeeper0.createBook("hi!", "");
        java.lang.Class<?> wildcardClass28 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test269");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "hi!");
        items.Book book18 = itemKeeper0.createBook("", "hi!");
        items.Book book21 = itemKeeper0.createBook("", "hi!");
        items.CD cD24 = itemKeeper0.createCD("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD24);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test270");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("hi!", "");
        items.Book book21 = itemKeeper0.createBook("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test271");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.CD cD9 = itemKeeper0.createCD("", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "");
        items.Magazine magazine15 = itemKeeper0.createMagazine("", "hi!");
        items.CD cD18 = itemKeeper0.createCD("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test272");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.CD cD3 = itemKeeper0.createCD("hi!", "");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "hi!");
        items.Magazine magazine9 = itemKeeper0.createMagazine("", "");
        items.CD cD12 = itemKeeper0.createCD("", "hi!");
        items.CD cD15 = itemKeeper0.createCD("hi!", "");
        items.Book book18 = itemKeeper0.createBook("", "");
        items.Book book21 = itemKeeper0.createBook("", "hi!");
        items.Magazine magazine24 = itemKeeper0.createMagazine("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine24);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test273");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Magazine magazine6 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test274");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Book book3 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book6 = itemKeeper0.createBook("", "");
        items.Magazine magazine9 = itemKeeper0.createMagazine("hi!", "hi!");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.Book book15 = itemKeeper0.createBook("", "");
        java.lang.Class<?> wildcardClass16 = itemKeeper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ItemKeeperTest.test275");
        items.ItemKeeper itemKeeper0 = new items.ItemKeeper();
        items.Magazine magazine3 = itemKeeper0.createMagazine("", "");
        items.Book book6 = itemKeeper0.createBook("", "hi!");
        items.Book book9 = itemKeeper0.createBook("hi!", "");
        items.Book book12 = itemKeeper0.createBook("hi!", "hi!");
        items.CD cD15 = itemKeeper0.createCD("", "hi!");
        items.Magazine magazine18 = itemKeeper0.createMagazine("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cD15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazine18);
    }
}

