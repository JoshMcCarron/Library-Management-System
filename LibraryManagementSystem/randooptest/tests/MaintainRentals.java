package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaintainRentals {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test001");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.Class<?> wildcardClass1 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test002");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.Class<?> wildcardClass5 = rentList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test003");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass7 = rentList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test004");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass10 = rentList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test005");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test006");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass6 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test007");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList13 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test008");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test009");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass2 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test010");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals0.rentals = rentList8;
        java.lang.Class<?> wildcardClass11 = rentList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test011");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList10;
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test012");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        java.lang.Class<?> wildcardClass17 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test013");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList7 = null;
        maintainRentals0.rentals = rentList7;
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test014");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        java.lang.String str9 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test015");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test016");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test017");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test018");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test019");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test020");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        java.lang.String str12 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass13 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test021");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintainRentals0.returnDate(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test022");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass14 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test023");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintaining.MaintainRentals maintainRentals32 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray33 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList34 = new java.util.ArrayList<actions.Rent>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList34, rentArray33);
        maintainRentals32.rentals = rentList34;
        maintainRentals32.returnDate((int) (byte) -1);
        maintainRentals32.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals41 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray42 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList43 = new java.util.ArrayList<actions.Rent>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList43, rentArray42);
        maintainRentals41.rentals = rentList43;
        java.lang.String str46 = maintainRentals41.path;
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals41.rentals;
        maintainRentals32.rentals = rentList47;
        maintainRentals32.path = "";
        maintaining.MaintainRentals maintainRentals51 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray52 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList53 = new java.util.ArrayList<actions.Rent>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList53, rentArray52);
        maintainRentals51.rentals = rentList53;
        java.lang.String str56 = maintainRentals51.path;
        maintaining.MaintainRentals maintainRentals57 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray58 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList59 = new java.util.ArrayList<actions.Rent>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList59, rentArray58);
        maintainRentals57.rentals = rentList59;
        maintainRentals51.rentals = rentList59;
        maintainRentals32.rentals = rentList59;
        maintainRentals32.returnDate(1);
        maintaining.MaintainRentals maintainRentals66 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray67 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList68 = new java.util.ArrayList<actions.Rent>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList68, rentArray67);
        maintainRentals66.rentals = rentList68;
        maintainRentals32.rentals = rentList68;
        maintainRentals0.rentals = rentList68;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test024");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test025");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.lang.String str6 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test026");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test027");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test028");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        java.lang.String str8 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test029");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList12;
        java.lang.Class<?> wildcardClass14 = rentList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test030");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals0.rentals = rentList8;
        maintainRentals0.returnDate(1);
        java.lang.Class<?> wildcardClass13 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test031");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals18.returnDate(0);
        maintainRentals18.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals18.rentals = rentList29;
        maintainRentals18.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals18.rentals;
        maintainRentals0.rentals = rentList35;
        maintainRentals0.returnDate((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test032");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test033");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) ' ');
        java.lang.Class<?> wildcardClass13 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test034");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test035");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate(1);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals0.rentals = rentList36;
        java.lang.Class<?> wildcardClass40 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test036");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass2 = rentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test037");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals18.returnDate(0);
        maintainRentals18.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals18.rentals = rentList29;
        maintainRentals18.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals18.rentals;
        maintainRentals0.rentals = rentList35;
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray38 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList39 = new java.util.ArrayList<actions.Rent>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList39, rentArray38);
        maintainRentals37.rentals = rentList39;
        maintainRentals37.returnDate(0);
        maintainRentals37.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals46 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray47 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList48 = new java.util.ArrayList<actions.Rent>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList48, rentArray47);
        maintainRentals46.rentals = rentList48;
        maintainRentals37.rentals = rentList48;
        maintainRentals37.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList54 = maintainRentals37.rentals;
        maintaining.MaintainRentals maintainRentals55 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray56 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList57 = new java.util.ArrayList<actions.Rent>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList57, rentArray56);
        maintainRentals55.rentals = rentList57;
        maintainRentals55.returnDate(0);
        maintainRentals55.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals64 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray65 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList66 = new java.util.ArrayList<actions.Rent>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList66, rentArray65);
        maintainRentals64.rentals = rentList66;
        maintainRentals55.rentals = rentList66;
        maintainRentals55.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList72 = maintainRentals55.rentals;
        maintainRentals37.rentals = rentList72;
        maintainRentals0.rentals = rentList72;
        java.lang.Class<?> wildcardClass75 = rentList72.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test038");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.lang.String str9 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test039");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList10;
        java.lang.String str12 = maintainRentals0.path;
        maintainRentals0.returnDate(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test040");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) ' ');
        maintainRentals0.returnDate((int) (short) 100);
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test041");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test042");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (short) 0);
        maintainRentals0.returnDate((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test043");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) 'a');
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test044");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (short) 0);
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate((int) (byte) -1);
        maintainRentals11.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals20 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        maintainRentals20.rentals = rentList22;
        java.lang.String str25 = maintainRentals20.path;
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals20.rentals;
        maintainRentals11.rentals = rentList26;
        maintainRentals11.path = "";
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.lang.String str35 = maintainRentals30.path;
        maintaining.MaintainRentals maintainRentals36 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray37 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList38 = new java.util.ArrayList<actions.Rent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList38, rentArray37);
        maintainRentals36.rentals = rentList38;
        maintainRentals30.rentals = rentList38;
        maintainRentals11.rentals = rentList38;
        maintainRentals11.returnDate(1);
        maintaining.MaintainRentals maintainRentals45 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray46 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList47 = new java.util.ArrayList<actions.Rent>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList47, rentArray46);
        maintainRentals45.rentals = rentList47;
        maintainRentals11.rentals = rentList47;
        java.util.ArrayList<actions.Rent> rentList51 = maintainRentals11.rentals;
        maintainRentals0.rentals = rentList51;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList51);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test045");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList10;
        java.lang.Class<?> wildcardClass12 = rentList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test046");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.lang.String str9 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test047");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test048");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (short) 1);
        java.lang.String str19 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test049");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals7.returnDate(0);
        maintainRentals7.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals7.rentals = rentList18;
        maintainRentals7.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList24;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test050");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.lang.String str6 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals7.returnDate(0);
        maintainRentals7.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        java.lang.String str21 = maintainRentals16.path;
        java.lang.String str22 = maintainRentals16.path;
        maintainRentals16.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals16.rentals;
        maintainRentals7.rentals = rentList25;
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test051");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (short) 1);
        maintainRentals0.path = "hi!";
        java.lang.Class<?> wildcardClass21 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test052");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test053");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        java.lang.String str11 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test054");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintainRentals0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test055");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (short) 1);
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList21 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals22 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        maintainRentals22.rentals = rentList24;
        java.util.ArrayList<actions.Rent> rentList27 = null;
        maintainRentals22.rentals = rentList27;
        java.util.ArrayList<actions.Rent> rentList29 = maintainRentals22.rentals;
        maintainRentals22.path = "hi!";
        maintainRentals22.path = "hi!";
        maintainRentals22.path = "";
        maintaining.MaintainRentals maintainRentals36 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray37 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList38 = new java.util.ArrayList<actions.Rent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList38, rentArray37);
        maintainRentals36.rentals = rentList38;
        maintainRentals36.returnDate(0);
        java.lang.String str43 = maintainRentals36.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals36.rentals;
        java.lang.String str45 = maintainRentals36.path;
        java.lang.String str46 = maintainRentals36.path;
        maintainRentals36.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList49 = maintainRentals36.rentals;
        maintainRentals22.rentals = rentList49;
        maintainRentals0.rentals = rentList49;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList49);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test056");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test057");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        maintainRentals0.returnDate(1);
        maintainRentals0.path = "hi!";
        java.lang.String str11 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test058");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals0.rentals = rentList9;
        maintainRentals0.returnDate((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test059");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals6 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals6.rentals = rentList8;
        maintainRentals0.rentals = rentList8;
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test060");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test061");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test062");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test063");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test064");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        java.lang.String str9 = maintainRentals8.path;
        maintaining.MaintainRentals maintainRentals10 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        maintainRentals10.rentals = rentList12;
        maintainRentals10.returnDate(0);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        maintainRentals10.rentals = rentList19;
        maintainRentals8.rentals = rentList19;
        java.lang.String str24 = maintainRentals8.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.util.ArrayList<actions.Rent> rentList30 = null;
        maintainRentals25.rentals = rentList30;
        java.util.ArrayList<actions.Rent> rentList32 = maintainRentals25.rentals;
        maintaining.MaintainRentals maintainRentals33 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray34 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList35 = new java.util.ArrayList<actions.Rent>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList35, rentArray34);
        maintainRentals33.rentals = rentList35;
        java.lang.String str38 = maintainRentals33.path;
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals33.rentals;
        maintainRentals33.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList42 = maintainRentals33.rentals;
        maintainRentals25.rentals = rentList42;
        maintainRentals8.rentals = rentList42;
        maintainRentals0.rentals = rentList42;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList42);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test065");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test066");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        java.lang.String str16 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test067");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList16 = maintainRentals0.rentals;
        java.lang.String str17 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) -1);
        java.lang.Class<?> wildcardClass20 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test068");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate(1);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals0.rentals = rentList36;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test069");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass17 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test070");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals6 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals6.rentals = rentList8;
        maintainRentals0.rentals = rentList8;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        java.lang.String str16 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test071");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (byte) 1);
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test072");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList10;
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals0.rentals = rentList14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test073");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintainRentals0.returnDate((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test074");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test075");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList16 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass17 = rentList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test076");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test077");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.path = "";
        java.lang.String str13 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test078");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (byte) 1);
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test079");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        java.util.ArrayList<actions.Rent> rentList21 = null;
        maintainRentals16.rentals = rentList21;
        maintainRentals16.path = "";
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals25.rentals;
        maintainRentals16.rentals = rentList26;
        maintainRentals0.rentals = rentList26;
        maintainRentals0.path = "";
        java.lang.String str31 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test080");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals6 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals6.rentals = rentList8;
        maintainRentals0.rentals = rentList8;
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass14 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test081");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) (byte) 0);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals21.returnDate(0);
        maintaining.MaintainRentals maintainRentals28 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray29 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList30 = new java.util.ArrayList<actions.Rent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList30, rentArray29);
        maintainRentals28.rentals = rentList30;
        maintainRentals28.returnDate(0);
        maintainRentals28.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray38 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList39 = new java.util.ArrayList<actions.Rent>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList39, rentArray38);
        maintainRentals37.rentals = rentList39;
        maintainRentals28.rentals = rentList39;
        maintainRentals28.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList45 = maintainRentals28.rentals;
        maintainRentals21.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        java.lang.String str48 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test082");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((-1));
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test083");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.lang.String str14 = maintainRentals8.path;
        maintainRentals8.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        java.lang.String str19 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test084");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass8 = rentList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test085");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintaining.MaintainRentals maintainRentals32 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray33 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList34 = new java.util.ArrayList<actions.Rent>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList34, rentArray33);
        maintainRentals32.rentals = rentList34;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals32.rentals;
        maintainRentals0.rentals = rentList37;
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test086");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate((int) (byte) -1);
        maintainRentals8.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.lang.String str22 = maintainRentals17.path;
        java.util.ArrayList<actions.Rent> rentList23 = maintainRentals17.rentals;
        maintainRentals8.rentals = rentList23;
        maintainRentals8.path = "";
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        java.lang.String str32 = maintainRentals27.path;
        maintaining.MaintainRentals maintainRentals33 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray34 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList35 = new java.util.ArrayList<actions.Rent>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList35, rentArray34);
        maintainRentals33.rentals = rentList35;
        maintainRentals27.rentals = rentList35;
        maintainRentals8.rentals = rentList35;
        maintaining.MaintainRentals maintainRentals40 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray41 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList42 = new java.util.ArrayList<actions.Rent>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList42, rentArray41);
        maintainRentals40.rentals = rentList42;
        java.util.ArrayList<actions.Rent> rentList45 = maintainRentals40.rentals;
        maintainRentals8.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList45);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test087");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        java.lang.Class<?> wildcardClass32 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test088");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        java.lang.String str12 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test089");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test090");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        maintainRentals0.path = "hi!";
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test091");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals13 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray14 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList15 = new java.util.ArrayList<actions.Rent>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList15, rentArray14);
        maintainRentals13.rentals = rentList15;
        java.util.ArrayList<actions.Rent> rentList18 = null;
        maintainRentals13.rentals = rentList18;
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals13.rentals;
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        java.lang.String str26 = maintainRentals21.path;
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals21.rentals;
        maintainRentals13.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test092");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test093");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals0.rentals = rentList8;
        maintainRentals0.returnDate(1);
        java.lang.String str13 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass14 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test094");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintainRentals0.returnDate((-1));
        java.lang.Class<?> wildcardClass18 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test095");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals18.returnDate(0);
        maintainRentals18.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals18.rentals = rentList29;
        maintainRentals18.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals18.rentals;
        maintainRentals0.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList37);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test096");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals0.rentals = rentList8;
        java.lang.String str11 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test097");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test098");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        java.lang.String str12 = maintainRentals0.path;
        java.lang.String str13 = maintainRentals0.path;
        java.lang.String str14 = maintainRentals0.path;
        java.lang.String str15 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test099");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        maintainRentals0.path = "";
        java.lang.String str3 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test100");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test101");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass10 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test102");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass7 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test103");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals9.returnDate((int) (byte) -1);
        maintainRentals9.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        java.lang.String str23 = maintainRentals18.path;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals18.rentals;
        maintainRentals9.rentals = rentList24;
        maintainRentals9.path = "";
        maintaining.MaintainRentals maintainRentals28 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray29 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList30 = new java.util.ArrayList<actions.Rent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList30, rentArray29);
        maintainRentals28.rentals = rentList30;
        java.lang.String str33 = maintainRentals28.path;
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals28.rentals = rentList36;
        maintainRentals9.rentals = rentList36;
        maintainRentals9.returnDate(1);
        maintaining.MaintainRentals maintainRentals43 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray44 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList45 = new java.util.ArrayList<actions.Rent>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList45, rentArray44);
        maintainRentals43.rentals = rentList45;
        maintainRentals9.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        maintainRentals0.returnDate(1);
        java.lang.Class<?> wildcardClass52 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test104");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass9 = rentList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test105");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (short) 1);
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList21 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass22 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test106");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test107");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.util.ArrayList<actions.Rent> rentList22 = null;
        maintainRentals17.rentals = rentList22;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals17.rentals;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.lang.String str30 = maintainRentals25.path;
        java.util.ArrayList<actions.Rent> rentList31 = maintainRentals25.rentals;
        maintainRentals25.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList34 = maintainRentals25.rentals;
        maintainRentals17.rentals = rentList34;
        maintainRentals0.rentals = rentList34;
        maintainRentals0.returnDate((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList34);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test108");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate(1);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals0.rentals = rentList36;
        maintainRentals0.returnDate((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test109");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        java.lang.String str19 = maintainRentals0.path;
        java.lang.String str20 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        java.lang.String str26 = maintainRentals21.path;
        java.lang.String str27 = maintainRentals21.path;
        maintainRentals21.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList30 = maintainRentals21.rentals;
        maintainRentals0.rentals = rentList30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList30);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test110");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.util.ArrayList<actions.Rent> rentList22 = null;
        maintainRentals17.rentals = rentList22;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals17.rentals;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.lang.String str30 = maintainRentals25.path;
        java.util.ArrayList<actions.Rent> rentList31 = maintainRentals25.rentals;
        maintainRentals25.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList34 = maintainRentals25.rentals;
        maintainRentals17.rentals = rentList34;
        maintainRentals0.rentals = rentList34;
        maintainRentals0.returnDate(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList34);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test111");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        java.lang.String str12 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass13 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test112");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.lang.String str9 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test113");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        maintainRentals14.returnDate(0);
        java.lang.String str21 = maintainRentals14.path;
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals14.rentals;
        java.lang.String str23 = maintainRentals14.path;
        java.lang.String str24 = maintainRentals14.path;
        maintainRentals14.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals14.rentals;
        maintainRentals0.rentals = rentList27;
        java.lang.String str29 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test114");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass18 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test115");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test116");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.lang.String str14 = maintainRentals8.path;
        maintainRentals8.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        java.lang.Class<?> wildcardClass19 = rentList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test117");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (short) 0);
        java.lang.String str11 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test118");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) '#');
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test119");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rentList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test120");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test121");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test122");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.lang.String str11 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test123");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList17 = null;
        maintainRentals0.rentals = rentList17;
        java.lang.String str19 = maintainRentals0.path;
        java.lang.String str20 = maintainRentals0.path;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test124");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) 'a');
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test125");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList12;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test126");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.lang.String str10 = maintainRentals9.path;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate(0);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals11.rentals = rentList20;
        maintainRentals9.rentals = rentList20;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.util.ArrayList<actions.Rent> rentList30 = null;
        maintainRentals25.rentals = rentList30;
        maintainRentals25.path = "";
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals34.rentals;
        maintainRentals25.rentals = rentList35;
        maintainRentals9.rentals = rentList35;
        maintainRentals0.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList40 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList40);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test127");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.lang.String str10 = maintainRentals9.path;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate(0);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals11.rentals = rentList20;
        maintainRentals9.rentals = rentList20;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.util.ArrayList<actions.Rent> rentList30 = null;
        maintainRentals25.rentals = rentList30;
        maintainRentals25.path = "";
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals34.rentals;
        maintainRentals25.rentals = rentList35;
        maintainRentals9.rentals = rentList35;
        maintainRentals0.rentals = rentList35;
        maintaining.MaintainRentals maintainRentals39 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray40 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList41 = new java.util.ArrayList<actions.Rent>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList41, rentArray40);
        maintainRentals39.rentals = rentList41;
        maintainRentals0.rentals = rentList41;
        maintainRentals0.returnDate(0);
        java.lang.Class<?> wildcardClass47 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test128");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass19 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test129");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test130");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.lang.String str15 = maintainRentals9.path;
        maintainRentals9.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList18 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList18;
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) ' ');
        java.lang.Class<?> wildcardClass25 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test131");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        java.lang.String str12 = maintainRentals0.path;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test132");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.lang.String str22 = maintainRentals17.path;
        java.lang.String str23 = maintainRentals17.path;
        maintainRentals17.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals17.rentals;
        maintainRentals8.rentals = rentList26;
        maintainRentals0.rentals = rentList26;
        maintainRentals0.returnDate((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test133");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintainRentals0.returnDate((-1));
        java.util.ArrayList<actions.Rent> rentList18 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test134");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList17 = null;
        maintainRentals0.rentals = rentList17;
        java.lang.Class<?> wildcardClass19 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test135");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        java.lang.String str19 = maintainRentals14.path;
        maintaining.MaintainRentals maintainRentals20 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        maintainRentals20.rentals = rentList22;
        maintainRentals14.rentals = rentList22;
        maintainRentals14.path = "";
        maintainRentals14.path = "";
        java.util.ArrayList<actions.Rent> rentList30 = maintainRentals14.rentals;
        maintainRentals0.rentals = rentList30;
        maintainRentals0.returnDate((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList30);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test136");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList3 = maintainRentals0.rentals;
        java.lang.String str4 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test137");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintainRentals0.returnDate((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test138");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.lang.String str9 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test139");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.returnDate((int) 'a');
        java.lang.String str19 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test140");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.lang.String str10 = maintainRentals9.path;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate(0);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals11.rentals = rentList20;
        maintainRentals9.rentals = rentList20;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.util.ArrayList<actions.Rent> rentList30 = null;
        maintainRentals25.rentals = rentList30;
        maintainRentals25.path = "";
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals34.rentals;
        maintainRentals25.rentals = rentList35;
        maintainRentals9.rentals = rentList35;
        maintainRentals0.rentals = rentList35;
        maintaining.MaintainRentals maintainRentals39 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray40 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList41 = new java.util.ArrayList<actions.Rent>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList41, rentArray40);
        maintainRentals39.rentals = rentList41;
        java.lang.String str44 = maintainRentals39.path;
        java.util.ArrayList<actions.Rent> rentList45 = maintainRentals39.rentals;
        maintaining.MaintainRentals maintainRentals46 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray47 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList48 = new java.util.ArrayList<actions.Rent>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList48, rentArray47);
        maintainRentals46.rentals = rentList48;
        maintainRentals46.returnDate(0);
        maintainRentals46.returnDate((int) 'a');
        java.lang.String str55 = maintainRentals46.path;
        maintaining.MaintainRentals maintainRentals56 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray57 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList58 = new java.util.ArrayList<actions.Rent>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList58, rentArray57);
        maintainRentals56.rentals = rentList58;
        maintainRentals56.returnDate((int) (byte) -1);
        maintainRentals56.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals65 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray66 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList67 = new java.util.ArrayList<actions.Rent>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList67, rentArray66);
        maintainRentals65.rentals = rentList67;
        java.lang.String str70 = maintainRentals65.path;
        java.util.ArrayList<actions.Rent> rentList71 = maintainRentals65.rentals;
        maintainRentals56.rentals = rentList71;
        maintainRentals56.path = "";
        maintaining.MaintainRentals maintainRentals75 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray76 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList77 = new java.util.ArrayList<actions.Rent>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList77, rentArray76);
        maintainRentals75.rentals = rentList77;
        java.lang.String str80 = maintainRentals75.path;
        maintaining.MaintainRentals maintainRentals81 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray82 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList83 = new java.util.ArrayList<actions.Rent>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList83, rentArray82);
        maintainRentals81.rentals = rentList83;
        maintainRentals75.rentals = rentList83;
        maintainRentals56.rentals = rentList83;
        maintainRentals46.rentals = rentList83;
        maintainRentals39.rentals = rentList83;
        maintainRentals0.rentals = rentList83;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test141");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) (byte) 0);
        java.util.ArrayList<actions.Rent> rentList21 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test142");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        java.lang.String str9 = maintainRentals0.path;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test143");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        java.lang.String str12 = maintainRentals0.path;
        java.lang.String str13 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test144");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        java.lang.String str30 = maintainRentals0.path;
        maintainRentals0.returnDate(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test145");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals7.returnDate(0);
        maintainRentals7.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals7.rentals = rentList18;
        maintainRentals7.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList24;
        java.lang.Class<?> wildcardClass26 = rentList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test146");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList12;
        maintainRentals0.returnDate((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test147");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test148");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test149");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        maintainRentals8.rentals = rentList19;
        maintainRentals0.rentals = rentList19;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test150");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass9 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test151");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.lang.String str6 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) 100);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.lang.String str10 = maintainRentals9.path;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate(0);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals11.rentals = rentList20;
        maintainRentals9.rentals = rentList20;
        maintainRentals0.rentals = rentList20;
        java.lang.Class<?> wildcardClass26 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test152");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.lang.String str14 = maintainRentals8.path;
        maintainRentals8.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        java.util.ArrayList<actions.Rent> rentList19 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test153");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.lang.String str22 = maintainRentals17.path;
        java.lang.String str23 = maintainRentals17.path;
        maintainRentals17.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals17.rentals;
        maintainRentals8.rentals = rentList26;
        maintainRentals0.rentals = rentList26;
        java.lang.Class<?> wildcardClass29 = rentList26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test154");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        maintainRentals0.returnDate((int) (byte) 100);
        java.lang.String str11 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test155");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.lang.String str10 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass11 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test156");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test157");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList17 = null;
        maintainRentals0.rentals = rentList17;
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        maintainRentals19.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals19.rentals;
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals27.returnDate(0);
        maintainRentals27.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals36 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray37 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList38 = new java.util.ArrayList<actions.Rent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList38, rentArray37);
        maintainRentals36.rentals = rentList38;
        java.lang.String str41 = maintainRentals36.path;
        java.lang.String str42 = maintainRentals36.path;
        maintainRentals36.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList45 = maintainRentals36.rentals;
        maintainRentals27.rentals = rentList45;
        maintainRentals19.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        java.lang.String str49 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test158");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test159");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) '4');
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass12 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test160");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        java.lang.String str9 = maintainRentals0.path;
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test161");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        maintainRentals8.rentals = rentList19;
        maintainRentals8.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList25;
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test162");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintaining.MaintainRentals maintainRentals15 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray16 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList17 = new java.util.ArrayList<actions.Rent>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList17, rentArray16);
        maintainRentals15.rentals = rentList17;
        maintainRentals15.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals15.rentals;
        maintaining.MaintainRentals maintainRentals23 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray24 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList25 = new java.util.ArrayList<actions.Rent>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList25, rentArray24);
        maintainRentals23.rentals = rentList25;
        maintainRentals23.returnDate(0);
        maintainRentals23.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals32 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray33 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList34 = new java.util.ArrayList<actions.Rent>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList34, rentArray33);
        maintainRentals32.rentals = rentList34;
        maintainRentals23.rentals = rentList34;
        maintainRentals23.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList40 = maintainRentals23.rentals;
        maintainRentals15.rentals = rentList40;
        maintainRentals0.rentals = rentList40;
        java.lang.Class<?> wildcardClass43 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test163");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) (short) 0);
        java.lang.String str13 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test164");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.util.ArrayList<actions.Rent> rentList14 = null;
        maintainRentals9.rentals = rentList14;
        java.util.ArrayList<actions.Rent> rentList16 = maintainRentals9.rentals;
        maintainRentals9.path = "hi!";
        maintainRentals9.path = "";
        java.util.ArrayList<actions.Rent> rentList21 = maintainRentals9.rentals;
        maintainRentals9.path = "hi!";
        maintaining.MaintainRentals maintainRentals24 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray25 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList26 = new java.util.ArrayList<actions.Rent>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList26, rentArray25);
        maintainRentals24.rentals = rentList26;
        maintainRentals24.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList31 = maintainRentals24.rentals;
        maintaining.MaintainRentals maintainRentals32 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray33 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList34 = new java.util.ArrayList<actions.Rent>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList34, rentArray33);
        maintainRentals32.rentals = rentList34;
        maintainRentals32.returnDate(0);
        maintainRentals32.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals41 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray42 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList43 = new java.util.ArrayList<actions.Rent>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList43, rentArray42);
        maintainRentals41.rentals = rentList43;
        maintainRentals32.rentals = rentList43;
        maintainRentals32.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList49 = maintainRentals32.rentals;
        maintainRentals24.rentals = rentList49;
        maintainRentals9.rentals = rentList49;
        maintainRentals0.rentals = rentList49;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList49);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test165");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintainRentals0.path = "";
        java.lang.String str32 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test166");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.lang.String str12 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test167");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) (byte) 0);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals21.returnDate(0);
        maintaining.MaintainRentals maintainRentals28 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray29 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList30 = new java.util.ArrayList<actions.Rent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList30, rentArray29);
        maintainRentals28.rentals = rentList30;
        maintainRentals28.returnDate(0);
        maintainRentals28.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray38 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList39 = new java.util.ArrayList<actions.Rent>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList39, rentArray38);
        maintainRentals37.rentals = rentList39;
        maintainRentals28.rentals = rentList39;
        maintainRentals28.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList45 = maintainRentals28.rentals;
        maintainRentals21.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        java.lang.Class<?> wildcardClass48 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test168");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList18 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList19 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test169");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.returnDate((int) (short) 1);
        maintainRentals0.returnDate(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test170");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        java.util.ArrayList<actions.Rent> rentList54 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList54);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test171");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (byte) -1);
        java.lang.String str11 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test172");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        maintainRentals0.path = "hi!";
        java.lang.String str10 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test173");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test174");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((int) '4');
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        maintainRentals11.returnDate(100);
        maintainRentals11.returnDate(1);
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals11.rentals;
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals21.returnDate(0);
        maintainRentals21.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        maintainRentals21.rentals = rentList32;
        maintainRentals21.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList38 = maintainRentals21.rentals;
        maintaining.MaintainRentals maintainRentals39 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray40 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList41 = new java.util.ArrayList<actions.Rent>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList41, rentArray40);
        maintainRentals39.rentals = rentList41;
        maintainRentals39.returnDate(0);
        maintainRentals39.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals48 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray49 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList50 = new java.util.ArrayList<actions.Rent>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList50, rentArray49);
        maintainRentals48.rentals = rentList50;
        maintainRentals39.rentals = rentList50;
        maintainRentals39.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList56 = maintainRentals39.rentals;
        maintainRentals21.rentals = rentList56;
        maintaining.MaintainRentals maintainRentals58 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray59 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList60 = new java.util.ArrayList<actions.Rent>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList60, rentArray59);
        maintainRentals58.rentals = rentList60;
        maintainRentals58.returnDate(0);
        maintainRentals58.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals67 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray68 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList69 = new java.util.ArrayList<actions.Rent>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList69, rentArray68);
        maintainRentals67.rentals = rentList69;
        maintainRentals58.rentals = rentList69;
        maintainRentals58.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList75 = maintainRentals58.rentals;
        maintaining.MaintainRentals maintainRentals76 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray77 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList78 = new java.util.ArrayList<actions.Rent>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList78, rentArray77);
        maintainRentals76.rentals = rentList78;
        maintainRentals76.returnDate(0);
        maintainRentals76.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals85 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray86 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList87 = new java.util.ArrayList<actions.Rent>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList87, rentArray86);
        maintainRentals85.rentals = rentList87;
        maintainRentals76.rentals = rentList87;
        maintainRentals76.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList93 = maintainRentals76.rentals;
        maintainRentals58.rentals = rentList93;
        maintainRentals21.rentals = rentList93;
        maintainRentals11.rentals = rentList93;
        maintainRentals0.rentals = rentList93;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList93);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test175");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) ' ');
        maintainRentals0.returnDate((int) (short) 100);
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test176");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        java.lang.Class<?> wildcardClass2 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test177");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals0.rentals = rentList9;
        maintainRentals0.returnDate((int) (short) 0);
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test178");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.path = "";
        maintainRentals0.returnDate(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test179");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList19 = null;
        maintainRentals0.rentals = rentList19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test180");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals16.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList23 = maintainRentals16.rentals;
        maintainRentals0.rentals = rentList23;
        java.lang.Class<?> wildcardClass25 = rentList23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test181");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList9 = null;
        maintainRentals0.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test182");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.lang.String str6 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.lang.String str10 = maintainRentals0.path;
        java.lang.String str11 = maintainRentals0.path;
        maintainRentals0.returnDate(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test183");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList14;
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals16.returnDate(0);
        maintainRentals16.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        java.lang.String str26 = maintainRentals25.path;
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals27.returnDate(0);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals27.rentals = rentList36;
        maintainRentals25.rentals = rentList36;
        maintaining.MaintainRentals maintainRentals41 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray42 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList43 = new java.util.ArrayList<actions.Rent>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList43, rentArray42);
        maintainRentals41.rentals = rentList43;
        java.util.ArrayList<actions.Rent> rentList46 = null;
        maintainRentals41.rentals = rentList46;
        maintainRentals41.path = "";
        maintaining.MaintainRentals maintainRentals50 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList51 = maintainRentals50.rentals;
        maintainRentals41.rentals = rentList51;
        maintainRentals25.rentals = rentList51;
        maintainRentals16.rentals = rentList51;
        java.util.ArrayList<actions.Rent> rentList55 = maintainRentals16.rentals;
        maintainRentals0.rentals = rentList55;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList55);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test184");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals16.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList23 = maintainRentals16.rentals;
        maintainRentals0.rentals = rentList23;
        maintainRentals0.returnDate(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test185");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintainRentals0.path = "hi!";
        actions.Rent[] rentArray16 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList17 = new java.util.ArrayList<actions.Rent>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList17, rentArray16);
        maintainRentals0.rentals = rentList17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test186");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        maintainRentals7.returnDate(0);
        maintainRentals7.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals7.rentals = rentList18;
        maintainRentals7.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList24;
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass29 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test187");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals8.rentals;
        maintainRentals8.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        java.lang.String str19 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test188");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate(1);
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test189");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test190");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals8.rentals;
        maintainRentals8.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        maintainRentals0.path = "hi!";
        java.lang.String str21 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test191");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintainRentals0.path = "hi!";
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals16.returnDate(0);
        maintainRentals16.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        java.lang.String str26 = maintainRentals25.path;
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals27.returnDate(0);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals27.rentals = rentList36;
        maintainRentals25.rentals = rentList36;
        maintaining.MaintainRentals maintainRentals41 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray42 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList43 = new java.util.ArrayList<actions.Rent>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList43, rentArray42);
        maintainRentals41.rentals = rentList43;
        java.util.ArrayList<actions.Rent> rentList46 = null;
        maintainRentals41.rentals = rentList46;
        maintainRentals41.path = "";
        maintaining.MaintainRentals maintainRentals50 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList51 = maintainRentals50.rentals;
        maintainRentals41.rentals = rentList51;
        maintainRentals25.rentals = rentList51;
        maintainRentals16.rentals = rentList51;
        java.util.ArrayList<actions.Rent> rentList55 = maintainRentals16.rentals;
        maintainRentals0.rentals = rentList55;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList55);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test192");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((-1));
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        java.lang.String str13 = maintainRentals12.path;
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        maintainRentals14.returnDate(0);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals14.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str28 = maintainRentals12.path;
        maintaining.MaintainRentals maintainRentals29 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray30 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList31 = new java.util.ArrayList<actions.Rent>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList31, rentArray30);
        maintainRentals29.rentals = rentList31;
        java.util.ArrayList<actions.Rent> rentList34 = null;
        maintainRentals29.rentals = rentList34;
        java.util.ArrayList<actions.Rent> rentList36 = maintainRentals29.rentals;
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray38 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList39 = new java.util.ArrayList<actions.Rent>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList39, rentArray38);
        maintainRentals37.rentals = rentList39;
        java.lang.String str42 = maintainRentals37.path;
        java.util.ArrayList<actions.Rent> rentList43 = maintainRentals37.rentals;
        maintainRentals37.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList46 = maintainRentals37.rentals;
        maintainRentals29.rentals = rentList46;
        maintainRentals12.rentals = rentList46;
        maintainRentals0.rentals = rentList46;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList46);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test193");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        java.lang.String str25 = maintainRentals19.path;
        maintainRentals19.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals19.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.lang.String str35 = maintainRentals30.path;
        java.lang.String str36 = maintainRentals30.path;
        maintainRentals30.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList39;
        java.util.ArrayList<actions.Rent> rentList41 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList41);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test194");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test195");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.lang.String str8 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.util.ArrayList<actions.Rent> rentList14 = null;
        maintainRentals9.rentals = rentList14;
        java.util.ArrayList<actions.Rent> rentList16 = maintainRentals9.rentals;
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.lang.String str22 = maintainRentals17.path;
        java.util.ArrayList<actions.Rent> rentList23 = maintainRentals17.rentals;
        maintainRentals17.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals17.rentals;
        maintainRentals9.rentals = rentList26;
        maintainRentals0.rentals = rentList26;
        java.lang.Class<?> wildcardClass29 = rentList26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test196");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test197");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals13 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray14 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList15 = new java.util.ArrayList<actions.Rent>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList15, rentArray14);
        maintainRentals13.rentals = rentList15;
        java.util.ArrayList<actions.Rent> rentList18 = null;
        maintainRentals13.rentals = rentList18;
        maintaining.MaintainRentals maintainRentals20 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        maintainRentals20.rentals = rentList22;
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals20.rentals;
        maintainRentals13.rentals = rentList25;
        maintainRentals0.rentals = rentList25;
        java.lang.Class<?> wildcardClass28 = rentList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test198");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList13 = maintainRentals0.rentals;
        java.lang.String str14 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test199");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        maintainRentals14.returnDate(0);
        java.lang.String str21 = maintainRentals14.path;
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals14.rentals;
        java.lang.String str23 = maintainRentals14.path;
        java.lang.String str24 = maintainRentals14.path;
        maintainRentals14.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals14.rentals;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test200");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        maintainRentals14.returnDate(0);
        java.lang.String str21 = maintainRentals14.path;
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals14.rentals;
        java.lang.String str23 = maintainRentals14.path;
        java.lang.String str24 = maintainRentals14.path;
        maintainRentals14.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList27 = maintainRentals14.rentals;
        maintainRentals0.rentals = rentList27;
        maintaining.MaintainRentals maintainRentals29 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray30 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList31 = new java.util.ArrayList<actions.Rent>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList31, rentArray30);
        maintainRentals29.rentals = rentList31;
        maintainRentals29.returnDate(0);
        maintainRentals29.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        maintainRentals29.rentals = rentList40;
        maintainRentals29.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList46 = maintainRentals29.rentals;
        maintaining.MaintainRentals maintainRentals47 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray48 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList49 = new java.util.ArrayList<actions.Rent>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList49, rentArray48);
        maintainRentals47.rentals = rentList49;
        maintainRentals47.returnDate(0);
        maintainRentals47.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals56 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray57 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList58 = new java.util.ArrayList<actions.Rent>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList58, rentArray57);
        maintainRentals56.rentals = rentList58;
        maintainRentals47.rentals = rentList58;
        maintainRentals47.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList64 = maintainRentals47.rentals;
        maintainRentals29.rentals = rentList64;
        maintainRentals0.rentals = rentList64;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList64);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test201");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        maintainRentals0.returnDate((-1));
        java.util.ArrayList<actions.Rent> rentList56 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList56);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test202");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test203");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals13 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray14 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList15 = new java.util.ArrayList<actions.Rent>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList15, rentArray14);
        maintainRentals13.rentals = rentList15;
        java.util.ArrayList<actions.Rent> rentList18 = null;
        maintainRentals13.rentals = rentList18;
        maintaining.MaintainRentals maintainRentals20 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        maintainRentals20.rentals = rentList22;
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals20.rentals;
        maintainRentals13.rentals = rentList25;
        maintainRentals0.rentals = rentList25;
        java.lang.String str28 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test204");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.returnDate((int) ' ');
        maintainRentals0.returnDate((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test205");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        java.lang.String str7 = maintainRentals2.path;
        java.lang.String str8 = maintainRentals2.path;
        maintainRentals2.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals2.rentals;
        maintainRentals0.rentals = rentList11;
        maintaining.MaintainRentals maintainRentals13 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray14 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList15 = new java.util.ArrayList<actions.Rent>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList15, rentArray14);
        maintainRentals13.rentals = rentList15;
        maintainRentals13.returnDate((int) (byte) 0);
        maintainRentals13.path = "";
        maintainRentals13.returnDate((int) '4');
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals13.rentals;
        maintainRentals0.rentals = rentList24;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test206");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) ' ');
        maintainRentals0.returnDate((int) (short) 100);
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test207");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList18 = maintainRentals0.rentals;
        java.lang.String str19 = maintainRentals0.path;
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test208");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList19 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test209");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        java.lang.String str3 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test210");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintainRentals0.returnDate((int) 'a');
        java.lang.String str18 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test211");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals9.returnDate((int) (byte) -1);
        maintainRentals9.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        java.lang.String str23 = maintainRentals18.path;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals18.rentals;
        maintainRentals9.rentals = rentList24;
        maintainRentals0.rentals = rentList24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test212");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        maintainRentals18.returnDate(0);
        maintainRentals18.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals27 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        maintainRentals27.rentals = rentList29;
        maintainRentals18.rentals = rentList29;
        maintainRentals18.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList35 = maintainRentals18.rentals;
        maintainRentals0.rentals = rentList35;
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray38 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList39 = new java.util.ArrayList<actions.Rent>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList39, rentArray38);
        maintainRentals37.rentals = rentList39;
        maintainRentals37.returnDate(0);
        maintainRentals37.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals46 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray47 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList48 = new java.util.ArrayList<actions.Rent>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList48, rentArray47);
        maintainRentals46.rentals = rentList48;
        maintainRentals37.rentals = rentList48;
        maintainRentals37.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList54 = maintainRentals37.rentals;
        maintaining.MaintainRentals maintainRentals55 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray56 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList57 = new java.util.ArrayList<actions.Rent>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList57, rentArray56);
        maintainRentals55.rentals = rentList57;
        maintainRentals55.returnDate(0);
        maintainRentals55.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals64 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray65 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList66 = new java.util.ArrayList<actions.Rent>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList66, rentArray65);
        maintainRentals64.rentals = rentList66;
        maintainRentals55.rentals = rentList66;
        maintainRentals55.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList72 = maintainRentals55.rentals;
        maintainRentals37.rentals = rentList72;
        maintainRentals0.rentals = rentList72;
        maintainRentals0.returnDate(1);
        java.lang.Class<?> wildcardClass77 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test213");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        maintainRentals0.returnDate(1);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test214");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test215");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        java.lang.String str13 = maintainRentals8.path;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals8.rentals;
        maintainRentals8.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList17;
        java.lang.String str19 = maintainRentals0.path;
        maintainRentals0.returnDate((int) ' ');
        java.lang.String str22 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test216");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test217");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        maintainRentals0.path = "hi!";
        java.lang.String str19 = maintainRentals0.path;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test218");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals16 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray17 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList18 = new java.util.ArrayList<actions.Rent>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList18, rentArray17);
        maintainRentals16.rentals = rentList18;
        maintainRentals16.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList23 = maintainRentals16.rentals;
        maintainRentals0.rentals = rentList23;
        java.lang.String str25 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test219");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.lang.Class<?> wildcardClass7 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test220");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 100);
        java.lang.String str8 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test221");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        maintainRentals0.returnDate((-1));
        java.util.ArrayList<actions.Rent> rentList11 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        java.lang.String str17 = maintainRentals12.path;
        java.lang.String str18 = maintainRentals12.path;
        maintainRentals12.returnDate((int) (byte) 100);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        java.lang.String str22 = maintainRentals21.path;
        maintaining.MaintainRentals maintainRentals23 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray24 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList25 = new java.util.ArrayList<actions.Rent>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList25, rentArray24);
        maintainRentals23.rentals = rentList25;
        maintainRentals23.returnDate(0);
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        maintainRentals23.rentals = rentList32;
        maintainRentals21.rentals = rentList32;
        maintainRentals12.rentals = rentList32;
        maintainRentals0.rentals = rentList32;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test222");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test223");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) '#');
        maintainRentals0.returnDate(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test224");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.path = "hi!";
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList12 = null;
        maintainRentals7.rentals = rentList12;
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        java.util.ArrayList<actions.Rent> rentList19 = maintainRentals14.rentals;
        maintainRentals7.rentals = rentList19;
        maintainRentals0.rentals = rentList19;
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test225");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        java.lang.String str25 = maintainRentals19.path;
        maintainRentals19.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals19.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.lang.String str35 = maintainRentals30.path;
        java.lang.String str36 = maintainRentals30.path;
        maintainRentals30.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList39;
        maintaining.MaintainRentals maintainRentals41 = new maintaining.MaintainRentals();
        java.lang.String str42 = maintainRentals41.path;
        maintaining.MaintainRentals maintainRentals43 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray44 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList45 = new java.util.ArrayList<actions.Rent>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList45, rentArray44);
        maintainRentals43.rentals = rentList45;
        java.lang.String str48 = maintainRentals43.path;
        java.lang.String str49 = maintainRentals43.path;
        maintainRentals43.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals43.rentals;
        maintainRentals41.rentals = rentList52;
        maintaining.MaintainRentals maintainRentals54 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray55 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList56 = new java.util.ArrayList<actions.Rent>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList56, rentArray55);
        maintainRentals54.rentals = rentList56;
        maintainRentals54.returnDate((int) (byte) 0);
        maintainRentals54.path = "";
        maintainRentals54.returnDate((int) '4');
        java.util.ArrayList<actions.Rent> rentList65 = maintainRentals54.rentals;
        maintainRentals41.rentals = rentList65;
        maintainRentals0.rentals = rentList65;
        maintaining.MaintainRentals maintainRentals68 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray69 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList70 = new java.util.ArrayList<actions.Rent>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList70, rentArray69);
        maintainRentals68.rentals = rentList70;
        java.lang.String str73 = maintainRentals68.path;
        java.util.ArrayList<actions.Rent> rentList74 = maintainRentals68.rentals;
        maintainRentals68.returnDate(100);
        java.lang.String str77 = maintainRentals68.path;
        java.lang.String str78 = maintainRentals68.path;
        java.util.ArrayList<actions.Rent> rentList79 = maintainRentals68.rentals;
        maintainRentals0.rentals = rentList79;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList79);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test226");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        // The following exception was thrown during execution in test generation
        try {
            maintainRentals0.returnDate((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test227");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 10);
        java.lang.String str17 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList18 = null;
        maintainRentals0.rentals = rentList18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test228");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        maintainRentals11.rentals = rentList13;
        java.lang.String str16 = maintainRentals11.path;
        java.util.ArrayList<actions.Rent> rentList17 = maintainRentals11.rentals;
        maintainRentals11.returnDate(100);
        java.lang.String str20 = maintainRentals11.path;
        maintainRentals11.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals23 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray24 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList25 = new java.util.ArrayList<actions.Rent>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList25, rentArray24);
        maintainRentals23.rentals = rentList25;
        maintainRentals23.returnDate(0);
        maintainRentals23.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals32 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray33 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList34 = new java.util.ArrayList<actions.Rent>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList34, rentArray33);
        maintainRentals32.rentals = rentList34;
        java.lang.String str37 = maintainRentals32.path;
        java.lang.String str38 = maintainRentals32.path;
        maintainRentals32.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList41 = maintainRentals32.rentals;
        maintainRentals23.rentals = rentList41;
        maintainRentals11.rentals = rentList41;
        maintainRentals0.rentals = rentList41;
        maintaining.MaintainRentals maintainRentals45 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray46 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList47 = new java.util.ArrayList<actions.Rent>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList47, rentArray46);
        maintainRentals45.rentals = rentList47;
        maintainRentals45.returnDate(0);
        maintainRentals45.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals54 = new maintaining.MaintainRentals();
        java.lang.String str55 = maintainRentals54.path;
        maintaining.MaintainRentals maintainRentals56 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray57 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList58 = new java.util.ArrayList<actions.Rent>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList58, rentArray57);
        maintainRentals56.rentals = rentList58;
        maintainRentals56.returnDate(0);
        maintaining.MaintainRentals maintainRentals63 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray64 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList65 = new java.util.ArrayList<actions.Rent>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList65, rentArray64);
        maintainRentals63.rentals = rentList65;
        maintainRentals56.rentals = rentList65;
        maintainRentals54.rentals = rentList65;
        maintaining.MaintainRentals maintainRentals70 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray71 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList72 = new java.util.ArrayList<actions.Rent>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList72, rentArray71);
        maintainRentals70.rentals = rentList72;
        java.util.ArrayList<actions.Rent> rentList75 = null;
        maintainRentals70.rentals = rentList75;
        maintainRentals70.path = "";
        maintaining.MaintainRentals maintainRentals79 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList80 = maintainRentals79.rentals;
        maintainRentals70.rentals = rentList80;
        maintainRentals54.rentals = rentList80;
        maintainRentals45.rentals = rentList80;
        maintaining.MaintainRentals maintainRentals84 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray85 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList86 = new java.util.ArrayList<actions.Rent>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList86, rentArray85);
        maintainRentals84.rentals = rentList86;
        maintainRentals45.rentals = rentList86;
        maintainRentals0.rentals = rentList86;
        java.lang.Class<?> wildcardClass91 = rentList86.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test229");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        maintainRentals19.rentals = rentList27;
        maintainRentals0.rentals = rentList27;
        maintainRentals0.returnDate(1);
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals0.rentals = rentList36;
        java.util.ArrayList<actions.Rent> rentList40 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass41 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test230");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.lang.String str22 = maintainRentals17.path;
        java.lang.String str23 = maintainRentals17.path;
        maintainRentals17.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList26 = maintainRentals17.rentals;
        maintainRentals8.rentals = rentList26;
        maintainRentals0.rentals = rentList26;
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test231");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList10 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList10;
        java.lang.String str12 = maintainRentals0.path;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test232");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        maintainRentals0.returnDate((int) (byte) 100);
        java.lang.String str17 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        java.lang.String str23 = maintainRentals18.path;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals18.rentals;
        maintainRentals0.rentals = rentList24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test233");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str15 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList16 = maintainRentals0.rentals;
        java.lang.String str17 = maintainRentals0.path;
        java.lang.String str18 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test234");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals0.rentals = rentList8;
        maintaining.MaintainRentals maintainRentals11 = new maintaining.MaintainRentals();
        java.lang.String str12 = maintainRentals11.path;
        maintaining.MaintainRentals maintainRentals13 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray14 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList15 = new java.util.ArrayList<actions.Rent>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList15, rentArray14);
        maintainRentals13.rentals = rentList15;
        java.lang.String str18 = maintainRentals13.path;
        java.lang.String str19 = maintainRentals13.path;
        maintainRentals13.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList22 = maintainRentals13.rentals;
        maintainRentals11.rentals = rentList22;
        maintainRentals0.rentals = rentList22;
        maintainRentals0.returnDate((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test235");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass3 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test236");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals8 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        maintainRentals8.rentals = rentList10;
        maintainRentals8.returnDate(0);
        maintainRentals8.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        maintainRentals8.rentals = rentList19;
        maintainRentals8.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals8.rentals;
        maintainRentals0.rentals = rentList25;
        java.lang.Class<?> wildcardClass27 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test237");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals17 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        maintainRentals17.rentals = rentList19;
        java.util.ArrayList<actions.Rent> rentList22 = null;
        maintainRentals17.rentals = rentList22;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals17.rentals;
        maintaining.MaintainRentals maintainRentals25 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray26 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList27 = new java.util.ArrayList<actions.Rent>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList27, rentArray26);
        maintainRentals25.rentals = rentList27;
        java.lang.String str30 = maintainRentals25.path;
        java.util.ArrayList<actions.Rent> rentList31 = maintainRentals25.rentals;
        maintainRentals25.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList34 = maintainRentals25.rentals;
        maintainRentals17.rentals = rentList34;
        maintainRentals0.rentals = rentList34;
        java.lang.String str37 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test238");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList2 = maintainRentals0.rentals;
        maintaining.MaintainRentals maintainRentals3 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray4 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList5 = new java.util.ArrayList<actions.Rent>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList5, rentArray4);
        maintainRentals3.rentals = rentList5;
        maintainRentals3.returnDate(0);
        maintainRentals3.returnDate((int) 'a');
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        java.lang.String str13 = maintainRentals12.path;
        maintaining.MaintainRentals maintainRentals14 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        maintainRentals14.rentals = rentList16;
        maintainRentals14.returnDate(0);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals14.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        maintaining.MaintainRentals maintainRentals28 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray29 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList30 = new java.util.ArrayList<actions.Rent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList30, rentArray29);
        maintainRentals28.rentals = rentList30;
        java.util.ArrayList<actions.Rent> rentList33 = null;
        maintainRentals28.rentals = rentList33;
        maintainRentals28.path = "";
        maintaining.MaintainRentals maintainRentals37 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList38 = maintainRentals37.rentals;
        maintainRentals28.rentals = rentList38;
        maintainRentals12.rentals = rentList38;
        maintainRentals3.rentals = rentList38;
        java.util.ArrayList<actions.Rent> rentList42 = maintainRentals3.rentals;
        maintainRentals0.rentals = rentList42;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList42);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test239");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) (short) 10);
        java.lang.String str8 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals9.returnDate((int) (byte) -1);
        maintainRentals9.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals18 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray19 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList20 = new java.util.ArrayList<actions.Rent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList20, rentArray19);
        maintainRentals18.rentals = rentList20;
        java.lang.String str23 = maintainRentals18.path;
        java.util.ArrayList<actions.Rent> rentList24 = maintainRentals18.rentals;
        maintainRentals9.rentals = rentList24;
        maintainRentals9.path = "";
        maintaining.MaintainRentals maintainRentals28 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray29 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList30 = new java.util.ArrayList<actions.Rent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList30, rentArray29);
        maintainRentals28.rentals = rentList30;
        java.lang.String str33 = maintainRentals28.path;
        maintaining.MaintainRentals maintainRentals34 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray35 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList36 = new java.util.ArrayList<actions.Rent>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList36, rentArray35);
        maintainRentals34.rentals = rentList36;
        maintainRentals28.rentals = rentList36;
        maintainRentals9.rentals = rentList36;
        maintainRentals9.returnDate(1);
        maintaining.MaintainRentals maintainRentals43 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray44 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList45 = new java.util.ArrayList<actions.Rent>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList45, rentArray44);
        maintainRentals43.rentals = rentList45;
        maintainRentals9.rentals = rentList45;
        maintainRentals0.rentals = rentList45;
        java.util.ArrayList<actions.Rent> rentList50 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass51 = rentList50.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test240");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        java.lang.String str19 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 0);
        java.lang.String str22 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test241");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        maintaining.MaintainRentals maintainRentals15 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray16 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList17 = new java.util.ArrayList<actions.Rent>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList17, rentArray16);
        maintainRentals15.rentals = rentList17;
        maintainRentals15.returnDate(0);
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals15.rentals = rentList23;
        maintainRentals9.rentals = rentList23;
        maintainRentals0.rentals = rentList23;
        maintainRentals0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test242");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        java.lang.String str7 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        java.lang.String str9 = maintainRentals0.path;
        java.lang.String str10 = maintainRentals0.path;
        maintainRentals0.returnDate((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList13 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintainRentals0.returnDate(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test243");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.util.ArrayList<actions.Rent> rentList1 = maintainRentals0.rentals;
        maintainRentals0.returnDate((int) '#');
        java.util.ArrayList<actions.Rent> rentList4 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList5 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test244");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "";
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals0.rentals;
        maintainRentals0.path = "";
        maintainRentals0.path = "";
        java.lang.String str17 = maintainRentals0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test245");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) 'a');
        java.lang.String str9 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals10 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        maintainRentals10.rentals = rentList12;
        maintainRentals10.returnDate((int) (byte) -1);
        maintainRentals10.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        java.util.ArrayList<actions.Rent> rentList25 = maintainRentals19.rentals;
        maintainRentals10.rentals = rentList25;
        maintainRentals10.path = "";
        maintaining.MaintainRentals maintainRentals29 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray30 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList31 = new java.util.ArrayList<actions.Rent>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList31, rentArray30);
        maintainRentals29.rentals = rentList31;
        java.lang.String str34 = maintainRentals29.path;
        maintaining.MaintainRentals maintainRentals35 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray36 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList37 = new java.util.ArrayList<actions.Rent>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList37, rentArray36);
        maintainRentals35.rentals = rentList37;
        maintainRentals29.rentals = rentList37;
        maintainRentals10.rentals = rentList37;
        maintainRentals0.rentals = rentList37;
        maintainRentals0.path = "";
        java.lang.Class<?> wildcardClass45 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test246");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.util.ArrayList<actions.Rent> rentList15 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList15;
        maintainRentals0.path = "";
        maintaining.MaintainRentals maintainRentals19 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray20 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList21 = new java.util.ArrayList<actions.Rent>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList21, rentArray20);
        maintainRentals19.rentals = rentList21;
        java.lang.String str24 = maintainRentals19.path;
        java.lang.String str25 = maintainRentals19.path;
        maintainRentals19.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals19.rentals;
        maintainRentals0.rentals = rentList28;
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test247");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) (byte) 0);
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test248");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate(0);
        maintainRentals0.returnDate((int) (byte) 1);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        java.lang.String str14 = maintainRentals9.path;
        java.lang.String str15 = maintainRentals9.path;
        maintainRentals9.returnDate((int) (byte) 100);
        java.util.ArrayList<actions.Rent> rentList18 = maintainRentals9.rentals;
        maintainRentals0.rentals = rentList18;
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals0.rentals;
        java.lang.Class<?> wildcardClass21 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test249");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        maintaining.MaintainRentals maintainRentals7 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray8 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList9 = new java.util.ArrayList<actions.Rent>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList9, rentArray8);
        maintainRentals7.rentals = rentList9;
        java.util.ArrayList<actions.Rent> rentList12 = maintainRentals7.rentals;
        maintainRentals0.rentals = rentList12;
        java.util.ArrayList<actions.Rent> rentList14 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test250");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.util.ArrayList<actions.Rent> rentList5 = null;
        maintainRentals0.rentals = rentList5;
        java.util.ArrayList<actions.Rent> rentList7 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList8 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test251");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        java.lang.String str30 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals31 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray32 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList33 = new java.util.ArrayList<actions.Rent>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList33, rentArray32);
        maintainRentals31.rentals = rentList33;
        maintainRentals31.returnDate(0);
        java.lang.String str38 = maintainRentals31.path;
        java.util.ArrayList<actions.Rent> rentList39 = maintainRentals31.rentals;
        java.lang.String str40 = maintainRentals31.path;
        java.lang.String str41 = maintainRentals31.path;
        maintainRentals31.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals44 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray45 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList46 = new java.util.ArrayList<actions.Rent>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList46, rentArray45);
        maintainRentals44.rentals = rentList46;
        java.util.ArrayList<actions.Rent> rentList49 = null;
        maintainRentals44.rentals = rentList49;
        maintaining.MaintainRentals maintainRentals51 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray52 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList53 = new java.util.ArrayList<actions.Rent>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList53, rentArray52);
        maintainRentals51.rentals = rentList53;
        java.util.ArrayList<actions.Rent> rentList56 = maintainRentals51.rentals;
        maintainRentals44.rentals = rentList56;
        maintainRentals31.rentals = rentList56;
        maintainRentals0.rentals = rentList56;
        maintainRentals0.returnDate((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList56);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test252");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        maintainRentals0.returnDate((int) (byte) -1);
        maintainRentals0.returnDate((int) (byte) 10);
        maintainRentals0.returnDate((int) (short) 0);
        maintainRentals0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test253");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.returnDate((int) ' ');
        maintainRentals0.returnDate((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test254");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        java.lang.String str1 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals2 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray3 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList4 = new java.util.ArrayList<actions.Rent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList4, rentArray3);
        maintainRentals2.rentals = rentList4;
        maintainRentals2.returnDate(0);
        maintaining.MaintainRentals maintainRentals9 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray10 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList11 = new java.util.ArrayList<actions.Rent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList11, rentArray10);
        maintainRentals9.rentals = rentList11;
        maintainRentals2.rentals = rentList11;
        maintainRentals0.rentals = rentList11;
        java.lang.String str16 = maintainRentals0.path;
        maintainRentals0.returnDate((int) 'a');
        java.util.ArrayList<actions.Rent> rentList19 = maintainRentals0.rentals;
        java.util.ArrayList<actions.Rent> rentList20 = maintainRentals0.rentals;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test255");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        maintaining.MaintainRentals maintainRentals6 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray7 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList8 = new java.util.ArrayList<actions.Rent>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList8, rentArray7);
        maintainRentals6.rentals = rentList8;
        maintainRentals6.returnDate(0);
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals6.rentals = rentList14;
        maintainRentals0.rentals = rentList14;
        java.lang.Class<?> wildcardClass18 = maintainRentals0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainRentals.test256");
        maintaining.MaintainRentals maintainRentals0 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray1 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList2 = new java.util.ArrayList<actions.Rent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList2, rentArray1);
        maintainRentals0.rentals = rentList2;
        java.lang.String str5 = maintainRentals0.path;
        java.util.ArrayList<actions.Rent> rentList6 = maintainRentals0.rentals;
        maintainRentals0.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList9 = maintainRentals0.rentals;
        maintainRentals0.returnDate(10);
        maintaining.MaintainRentals maintainRentals12 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray13 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList14 = new java.util.ArrayList<actions.Rent>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList14, rentArray13);
        maintainRentals12.rentals = rentList14;
        maintainRentals12.returnDate(0);
        maintainRentals12.returnDate((int) (short) 10);
        maintaining.MaintainRentals maintainRentals21 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray22 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList23 = new java.util.ArrayList<actions.Rent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList23, rentArray22);
        maintainRentals21.rentals = rentList23;
        maintainRentals12.rentals = rentList23;
        java.lang.String str27 = maintainRentals12.path;
        java.util.ArrayList<actions.Rent> rentList28 = maintainRentals12.rentals;
        maintainRentals0.rentals = rentList28;
        maintaining.MaintainRentals maintainRentals30 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray31 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList32 = new java.util.ArrayList<actions.Rent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList32, rentArray31);
        maintainRentals30.rentals = rentList32;
        java.util.ArrayList<actions.Rent> rentList35 = null;
        maintainRentals30.rentals = rentList35;
        java.util.ArrayList<actions.Rent> rentList37 = maintainRentals30.rentals;
        maintaining.MaintainRentals maintainRentals38 = new maintaining.MaintainRentals();
        actions.Rent[] rentArray39 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList40 = new java.util.ArrayList<actions.Rent>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList40, rentArray39);
        maintainRentals38.rentals = rentList40;
        java.lang.String str43 = maintainRentals38.path;
        java.util.ArrayList<actions.Rent> rentList44 = maintainRentals38.rentals;
        maintainRentals38.returnDate(100);
        java.util.ArrayList<actions.Rent> rentList47 = maintainRentals38.rentals;
        maintainRentals30.rentals = rentList47;
        maintainRentals30.path = "hi!";
        java.lang.String str51 = maintainRentals30.path;
        java.util.ArrayList<actions.Rent> rentList52 = maintainRentals30.rentals;
        maintainRentals0.rentals = rentList52;
        maintainRentals0.path = "hi!";
        maintainRentals0.path = "hi!";
        maintainRentals0.returnDate((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList52);
    }
}

