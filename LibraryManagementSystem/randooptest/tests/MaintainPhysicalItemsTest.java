package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaintainPhysicalItemsTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test002");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass8 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test003");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.Class<?> wildcardClass4 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test004");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        java.lang.Class<?> wildcardClass10 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test005");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        structure.Management management10 = null;
        items.PhysicalItem physicalItem11 = maintainPhysicalItems0.request("hi!", "hi!", management10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = physicalItem11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test006");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        java.lang.Class<?> wildcardClass4 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test007");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        maintainPhysicalItems0.increaseCopies(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test008");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        java.lang.Class<?> wildcardClass11 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test009");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        java.lang.Class<?> wildcardClass6 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test010");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.Class<?> wildcardClass24 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test011");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        java.lang.String str10 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test012");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems24 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray25 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList26, physicalItemArray25);
        maintainPhysicalItems24.items = physicalItemList26;
        maintainPhysicalItems24.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems24.items;
        maintainPhysicalItems0.items = physicalItemList31;
        java.lang.Class<?> wildcardClass33 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test013");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        java.lang.Class<?> wildcardClass13 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test014");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems0.request("hi!", "", management26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test015");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintainPhysicalItems0.items = physicalItemList9;
        java.lang.Class<?> wildcardClass13 = physicalItemList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test016");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        maintainPhysicalItems0.increaseCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test017");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("", "", management17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test018");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray10 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList11, physicalItemArray10);
        maintainPhysicalItems9.items = physicalItemList11;
        maintainPhysicalItems9.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems9.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = new maintaining.MaintainPhysicalItems();
        java.lang.String str18 = maintainPhysicalItems17.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems17.items;
        maintainPhysicalItems9.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test019");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.Class<?> wildcardClass13 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test020");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        maintainPhysicalItems0.increaseCopies((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test021");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        java.lang.String str16 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test022");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems0.request("", "", management26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test023");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.increaseCopies((int) (short) 1);
        maintainPhysicalItems0.increaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test024");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        java.lang.Class<?> wildcardClass22 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test025");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test026");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test027");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray4 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList5, physicalItemArray4);
        maintainPhysicalItems0.items = physicalItemList5;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = maintainPhysicalItems13.items;
        maintainPhysicalItems8.items = physicalItemList20;
        maintainPhysicalItems0.items = physicalItemList20;
        java.lang.Class<?> wildcardClass23 = physicalItemList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test028");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies(100);
        java.lang.Class<?> wildcardClass10 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test029");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str4 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        java.lang.String str14 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test030");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        java.lang.String str12 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test031");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        java.lang.Class<?> wildcardClass16 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test032");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray7 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList8 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList8, physicalItemArray7);
        maintainPhysicalItems6.items = physicalItemList8;
        maintainPhysicalItems6.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems6.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        maintainPhysicalItems14.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems21 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray22 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList23 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList23, physicalItemArray22);
        maintainPhysicalItems21.items = physicalItemList23;
        maintaining.MaintainPhysicalItems maintainPhysicalItems26 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray27 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList28, physicalItemArray27);
        maintainPhysicalItems26.items = physicalItemList28;
        maintainPhysicalItems26.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems26.items;
        maintainPhysicalItems21.items = physicalItemList33;
        maintainPhysicalItems14.items = physicalItemList33;
        maintainPhysicalItems6.items = physicalItemList33;
        maintainPhysicalItems0.items = physicalItemList33;
        java.lang.Class<?> wildcardClass38 = physicalItemList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test033");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = new maintaining.MaintainPhysicalItems();
        java.lang.String str12 = maintainPhysicalItems11.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems11.items;
        maintainPhysicalItems0.items = physicalItemList13;
        maintainPhysicalItems0.path = "hi!";
        java.lang.String str17 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test034");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test035");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        java.lang.String str33 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test036");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems0.request("", "hi!", management20);
        maintainPhysicalItems0.decreaseCopies((int) (byte) -1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test037");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        java.lang.String str15 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test038");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        structure.Management management10 = null;
        items.PhysicalItem physicalItem11 = maintainPhysicalItems0.request("", "hi!", management10);
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test039");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.increaseCopies(1);
        java.lang.String str13 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test040");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = null;
        maintainPhysicalItems0.items = physicalItemList22;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test041");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        maintainPhysicalItems0.decreaseCopies(10);
        java.lang.Class<?> wildcardClass14 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test042");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        structure.Management management12 = null;
        items.PhysicalItem physicalItem13 = maintainPhysicalItems0.request("hi!", "hi!", management12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test043");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test044");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("", "", management17);
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray20 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList21, physicalItemArray20);
        maintainPhysicalItems19.items = physicalItemList21;
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems19.request("", "", management26);
        maintainPhysicalItems19.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems19.increaseCopies((int) (byte) 10);
        maintainPhysicalItems19.path = "";
        java.lang.String str34 = maintainPhysicalItems19.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems19.items;
        maintainPhysicalItems0.items = physicalItemList35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test045");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        maintainPhysicalItems0.path = "";
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems0.request("hi!", "", management22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test046");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        java.lang.String str8 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test047");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray4 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList5, physicalItemArray4);
        maintainPhysicalItems0.items = physicalItemList5;
        java.lang.Class<?> wildcardClass8 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test048");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems0.items;
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems0.request("hi!", "", management22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test049");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str4 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        java.lang.Class<?> wildcardClass14 = physicalItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test050");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        maintainPhysicalItems0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test051");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test052");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "", management16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test053");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test054");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.increaseCopies((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test055");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "", management9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test056");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.lang.String str22 = maintainPhysicalItems0.path;
        java.lang.String str23 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test057");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("hi!", "hi!", management17);
        java.lang.String str19 = maintainPhysicalItems0.path;
        java.lang.Class<?> wildcardClass20 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test058");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test059");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems0.request("", "hi!", management40);
        maintainPhysicalItems0.increaseCopies((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test060");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray5 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList6, physicalItemArray5);
        maintainPhysicalItems4.items = physicalItemList6;
        maintainPhysicalItems4.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems4.items;
        maintainPhysicalItems0.items = physicalItemList11;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("hi!", "hi!", management17);
        structure.Management management21 = null;
        items.PhysicalItem physicalItem22 = maintainPhysicalItems0.request("hi!", "", management21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test061");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) ' ');
        java.lang.String str17 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList18 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass19 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test062");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str4 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass15 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test063");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass22 = physicalItemList21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test064");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems0.request("", "", management40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test065");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        java.lang.String str15 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList18 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test066");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        java.lang.String str22 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray24 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList25, physicalItemArray24);
        maintainPhysicalItems23.items = physicalItemList25;
        structure.Management management30 = null;
        items.PhysicalItem physicalItem31 = maintainPhysicalItems23.request("", "", management30);
        maintainPhysicalItems23.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems23.increaseCopies((int) (byte) 10);
        maintainPhysicalItems23.path = "";
        java.lang.String str38 = maintainPhysicalItems23.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems23.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList40 = maintainPhysicalItems23.items;
        maintainPhysicalItems0.items = physicalItemList40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList40);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test067");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass10 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test068");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test069");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test070");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        java.lang.Class<?> wildcardClass11 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test071");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test072");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray4 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList5, physicalItemArray4);
        maintainPhysicalItems0.items = physicalItemList5;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = maintainPhysicalItems13.items;
        maintainPhysicalItems8.items = physicalItemList20;
        maintainPhysicalItems0.items = physicalItemList20;
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        maintaining.MaintainPhysicalItems maintainPhysicalItems24 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray25 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList26, physicalItemArray25);
        maintainPhysicalItems24.items = physicalItemList26;
        structure.Management management31 = null;
        items.PhysicalItem physicalItem32 = maintainPhysicalItems24.request("", "", management31);
        maintainPhysicalItems24.decreaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems24.items;
        maintainPhysicalItems23.items = physicalItemList35;
        maintainPhysicalItems0.items = physicalItemList35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test073");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray5 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList6, physicalItemArray5);
        maintainPhysicalItems4.items = physicalItemList6;
        maintainPhysicalItems4.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems4.items;
        maintainPhysicalItems0.items = physicalItemList11;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test074");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        structure.Management management14 = null;
        items.PhysicalItem physicalItem15 = maintainPhysicalItems0.request("", "", management14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test075");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        java.lang.String str5 = maintainPhysicalItems4.path;
        maintainPhysicalItems4.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems8.items;
        maintainPhysicalItems4.items = physicalItemList15;
        maintainPhysicalItems4.path = "";
        maintainPhysicalItems4.path = "";
        java.lang.String str21 = maintainPhysicalItems4.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintainPhysicalItems22.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems22.items;
        maintainPhysicalItems22.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = maintainPhysicalItems22.items;
        maintainPhysicalItems4.items = physicalItemList34;
        maintainPhysicalItems0.items = physicalItemList34;
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass38 = physicalItemList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test076");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test077");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies(100);
        java.lang.String str10 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test078");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        java.lang.Class<?> wildcardClass3 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test079");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test080");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        java.lang.String str11 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems0.items = physicalItemList19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test081");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = new maintaining.MaintainPhysicalItems();
        java.lang.String str12 = maintainPhysicalItems11.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems11.items;
        maintainPhysicalItems0.items = physicalItemList13;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        java.lang.String str16 = maintainPhysicalItems15.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems15.items;
        maintainPhysicalItems15.increaseCopies((int) (byte) 10);
        java.lang.String str20 = maintainPhysicalItems15.path;
        maintainPhysicalItems15.path = "";
        maintainPhysicalItems15.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = maintainPhysicalItems15.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = maintainPhysicalItems15.items;
        java.lang.String str27 = maintainPhysicalItems15.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems28 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray29 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList30, physicalItemArray29);
        maintainPhysicalItems28.items = physicalItemList30;
        maintainPhysicalItems28.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems28.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems36 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray37 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList38 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList38, physicalItemArray37);
        maintainPhysicalItems36.items = physicalItemList38;
        maintainPhysicalItems36.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems43 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray44 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList45 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList45, physicalItemArray44);
        maintainPhysicalItems43.items = physicalItemList45;
        maintaining.MaintainPhysicalItems maintainPhysicalItems48 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray49 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList50 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList50, physicalItemArray49);
        maintainPhysicalItems48.items = physicalItemList50;
        maintainPhysicalItems48.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList55 = maintainPhysicalItems48.items;
        maintainPhysicalItems43.items = physicalItemList55;
        maintainPhysicalItems36.items = physicalItemList55;
        maintainPhysicalItems28.items = physicalItemList55;
        maintainPhysicalItems15.items = physicalItemList55;
        maintainPhysicalItems0.items = physicalItemList55;
        java.lang.String str61 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test082");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "hi!";
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test083");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems0.request("", "hi!", management40);
        structure.Management management44 = null;
        items.PhysicalItem physicalItem45 = maintainPhysicalItems0.request("hi!", "hi!", management44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem45);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test084");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        java.lang.String str10 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass12 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test085");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test086");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test087");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList4 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test088");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test089");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        java.lang.String str13 = maintainPhysicalItems12.path;
        maintainPhysicalItems12.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems12.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintaining.MaintainPhysicalItems maintainPhysicalItems25 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray26 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList27, physicalItemArray26);
        maintainPhysicalItems25.items = physicalItemList27;
        maintainPhysicalItems25.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList32 = maintainPhysicalItems25.items;
        maintainPhysicalItems20.items = physicalItemList32;
        maintainPhysicalItems12.items = physicalItemList32;
        maintainPhysicalItems0.items = physicalItemList32;
        java.lang.Class<?> wildcardClass36 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test090");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        structure.Management management14 = null;
        items.PhysicalItem physicalItem15 = maintainPhysicalItems0.request("hi!", "", management14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test091");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.lang.String str16 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test092");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        java.lang.Class<?> wildcardClass13 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test093");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass7 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test094");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray5 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList6, physicalItemArray5);
        maintainPhysicalItems4.items = physicalItemList6;
        maintainPhysicalItems4.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems4.items;
        maintainPhysicalItems0.items = physicalItemList11;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test095");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test096");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) (short) 0);
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test097");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies(100);
        maintainPhysicalItems0.decreaseCopies((int) (short) 10);
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        structure.Management management21 = null;
        items.PhysicalItem physicalItem22 = maintainPhysicalItems12.request("hi!", "hi!", management21);
        maintainPhysicalItems12.path = "hi!";
        maintainPhysicalItems12.decreaseCopies(0);
        maintainPhysicalItems12.increaseCopies((int) ' ');
        java.lang.String str29 = maintainPhysicalItems12.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems12.items;
        maintainPhysicalItems0.items = physicalItemList30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test098");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test099");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems24 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray25 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList26, physicalItemArray25);
        maintainPhysicalItems24.items = physicalItemList26;
        maintainPhysicalItems24.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems24.items;
        maintainPhysicalItems0.items = physicalItemList31;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        maintainPhysicalItems0.increaseCopies((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test100");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.path = "";
        java.lang.String str9 = maintainPhysicalItems0.path;
        java.lang.Class<?> wildcardClass10 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test101");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("", "hi!", management16);
        maintaining.MaintainPhysicalItems maintainPhysicalItems18 = new maintaining.MaintainPhysicalItems();
        java.lang.String str19 = maintainPhysicalItems18.path;
        maintainPhysicalItems18.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        java.lang.String str23 = maintainPhysicalItems22.path;
        maintainPhysicalItems22.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems26 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray27 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList28, physicalItemArray27);
        maintainPhysicalItems26.items = physicalItemList28;
        maintainPhysicalItems26.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems26.items;
        maintainPhysicalItems22.items = physicalItemList33;
        maintainPhysicalItems22.path = "";
        maintainPhysicalItems22.path = "";
        java.lang.String str39 = maintainPhysicalItems22.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.decreaseCopies(0);
        maintainPhysicalItems40.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList49 = maintainPhysicalItems40.items;
        maintainPhysicalItems40.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList52 = maintainPhysicalItems40.items;
        maintainPhysicalItems22.items = physicalItemList52;
        maintainPhysicalItems18.items = physicalItemList52;
        maintainPhysicalItems0.items = physicalItemList52;
        structure.Management management58 = null;
        items.PhysicalItem physicalItem59 = maintainPhysicalItems0.request("hi!", "", management58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem59);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test102");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass22 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test103");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        structure.Management management3 = null;
        items.PhysicalItem physicalItem4 = maintainPhysicalItems0.request("", "hi!", management3);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        java.lang.String str6 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintainPhysicalItems7.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems7.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        java.lang.String str16 = maintainPhysicalItems15.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems15.items;
        maintainPhysicalItems7.items = physicalItemList17;
        maintainPhysicalItems0.items = physicalItemList17;
        java.lang.String str20 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test104");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList20;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintainPhysicalItems22.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems22.items;
        maintainPhysicalItems22.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = maintainPhysicalItems22.items;
        maintainPhysicalItems0.items = physicalItemList34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList34);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test105");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test106");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test107");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass20 = physicalItemList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test108");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("", "", management16);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test109");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass13 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test110");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.lang.Class<?> wildcardClass21 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test111");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        structure.Management management3 = null;
        items.PhysicalItem physicalItem4 = maintainPhysicalItems0.request("", "hi!", management3);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        java.lang.String str6 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test112");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        maintaining.MaintainPhysicalItems maintainPhysicalItems16 = new maintaining.MaintainPhysicalItems();
        java.lang.String str17 = maintainPhysicalItems16.path;
        maintainPhysicalItems16.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems16.items = physicalItemList27;
        maintainPhysicalItems16.path = "";
        maintainPhysicalItems16.path = "";
        java.lang.String str33 = maintainPhysicalItems16.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintainPhysicalItems34.decreaseCopies(0);
        maintainPhysicalItems34.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList43 = maintainPhysicalItems34.items;
        maintainPhysicalItems34.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList46 = maintainPhysicalItems34.items;
        maintainPhysicalItems16.items = physicalItemList46;
        maintainPhysicalItems0.items = physicalItemList46;
        maintainPhysicalItems0.decreaseCopies((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList46);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test113");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList38 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test114");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems0.request("", "hi!", management40);
        maintainPhysicalItems0.increaseCopies(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test115");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        java.lang.String str6 = maintainPhysicalItems0.path;
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "", management9);
        java.lang.Class<?> wildcardClass11 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test116");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        structure.Management management8 = null;
        items.PhysicalItem physicalItem9 = maintainPhysicalItems0.request("hi!", "hi!", management8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test117");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test118");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.lang.String str7 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test119");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        structure.Management management10 = null;
        items.PhysicalItem physicalItem11 = maintainPhysicalItems0.request("", "hi!", management10);
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test120");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        structure.Management management4 = null;
        items.PhysicalItem physicalItem5 = maintainPhysicalItems0.request("", "hi!", management4);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) '#');
        java.lang.Class<?> wildcardClass10 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test121");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test122");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        java.lang.String str12 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.decreaseCopies(0);
        maintainPhysicalItems13.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems13.items;
        maintainPhysicalItems13.decreaseCopies((int) ' ');
        maintainPhysicalItems13.increaseCopies((int) (byte) 0);
        structure.Management management29 = null;
        items.PhysicalItem physicalItem30 = maintainPhysicalItems13.request("", "", management29);
        maintaining.MaintainPhysicalItems maintainPhysicalItems31 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray32 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList33, physicalItemArray32);
        maintainPhysicalItems31.items = physicalItemList33;
        maintainPhysicalItems31.path = "hi!";
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems31.request("hi!", "hi!", management40);
        maintainPhysicalItems31.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList44 = maintainPhysicalItems31.items;
        maintainPhysicalItems13.items = physicalItemList44;
        maintainPhysicalItems0.items = physicalItemList44;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList44);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test123");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.lang.String str37 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList38 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass39 = physicalItemList38.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test124");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintaining.MaintainPhysicalItems maintainPhysicalItems18 = new maintaining.MaintainPhysicalItems();
        java.lang.String str19 = maintainPhysicalItems18.path;
        maintainPhysicalItems18.decreaseCopies(1);
        java.lang.String str22 = maintainPhysicalItems18.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray24 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList25, physicalItemArray24);
        maintainPhysicalItems23.items = physicalItemList25;
        maintainPhysicalItems23.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems23.items;
        maintainPhysicalItems18.items = physicalItemList30;
        java.util.ArrayList<items.PhysicalItem> physicalItemList32 = maintainPhysicalItems18.items;
        maintainPhysicalItems0.items = physicalItemList32;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList32);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test125");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 1);
        maintainPhysicalItems0.increaseCopies(1);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test126");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        java.lang.String str22 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass26 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test127");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = maintainPhysicalItems0.items;
        java.lang.String str38 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test128");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("", "hi!", management16);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test129");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems0.items;
        java.lang.String str20 = maintainPhysicalItems0.path;
        java.lang.String str21 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test130");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        java.lang.String str6 = maintainPhysicalItems0.path;
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        structure.Management management14 = null;
        items.PhysicalItem physicalItem15 = maintainPhysicalItems0.request("hi!", "hi!", management14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test131");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        java.lang.String str6 = maintainPhysicalItems0.path;
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "", management9);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test132");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str12 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test133");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems0.request("", "hi!", management20);
        maintainPhysicalItems0.decreaseCopies((int) (byte) -1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test134");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.decreaseCopies((int) 'a');
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test135");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test136");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test137");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test138");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies(100);
        maintainPhysicalItems0.decreaseCopies((int) (short) 10);
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test139");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("", "", management17);
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray20 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList21, physicalItemArray20);
        maintainPhysicalItems19.items = physicalItemList21;
        maintainPhysicalItems19.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = maintainPhysicalItems19.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems27 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray28 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList29 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList29, physicalItemArray28);
        maintainPhysicalItems27.items = physicalItemList29;
        maintainPhysicalItems27.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintaining.MaintainPhysicalItems maintainPhysicalItems39 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray40 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList41 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList41, physicalItemArray40);
        maintainPhysicalItems39.items = physicalItemList41;
        maintainPhysicalItems39.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList46 = maintainPhysicalItems39.items;
        maintainPhysicalItems34.items = physicalItemList46;
        maintainPhysicalItems27.items = physicalItemList46;
        maintainPhysicalItems19.items = physicalItemList46;
        maintainPhysicalItems19.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        java.lang.String str53 = maintainPhysicalItems52.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = maintainPhysicalItems52.items;
        maintainPhysicalItems19.items = physicalItemList54;
        java.util.ArrayList<items.PhysicalItem> physicalItemList56 = maintainPhysicalItems19.items;
        maintainPhysicalItems0.items = physicalItemList56;
        java.lang.Class<?> wildcardClass58 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test140");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.increaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass14 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test141");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems0.request("", "hi!", management20);
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems29 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray30 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList31, physicalItemArray30);
        maintainPhysicalItems29.items = physicalItemList31;
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintainPhysicalItems34.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList41 = maintainPhysicalItems34.items;
        maintainPhysicalItems29.items = physicalItemList41;
        maintainPhysicalItems22.items = physicalItemList41;
        maintainPhysicalItems22.decreaseCopies(1);
        maintainPhysicalItems22.decreaseCopies((int) (short) 1);
        structure.Management management50 = null;
        items.PhysicalItem physicalItem51 = maintainPhysicalItems22.request("", "", management50);
        java.util.ArrayList<items.PhysicalItem> physicalItemList52 = maintainPhysicalItems22.items;
        maintainPhysicalItems0.items = physicalItemList52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList52);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test142");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        structure.Management management19 = null;
        items.PhysicalItem physicalItem20 = maintainPhysicalItems12.request("", "", management19);
        maintainPhysicalItems12.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems12.increaseCopies((int) (byte) 10);
        maintainPhysicalItems12.path = "";
        java.lang.String str27 = maintainPhysicalItems12.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = maintainPhysicalItems12.items;
        maintainPhysicalItems12.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems12.items;
        maintainPhysicalItems0.items = physicalItemList31;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test143");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test144");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems0.request("", "hi!", management20);
        maintainPhysicalItems0.decreaseCopies((int) (byte) -1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList25);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test145");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        java.lang.String str18 = maintainPhysicalItems0.path;
        structure.Management management21 = null;
        items.PhysicalItem physicalItem22 = maintainPhysicalItems0.request("", "hi!", management21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test146");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        java.lang.String str11 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.increaseCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test147");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        java.lang.String str22 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test148");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray7 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList8 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList8, physicalItemArray7);
        maintainPhysicalItems6.items = physicalItemList8;
        maintainPhysicalItems6.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems6.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        maintainPhysicalItems14.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems21 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray22 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList23 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList23, physicalItemArray22);
        maintainPhysicalItems21.items = physicalItemList23;
        maintaining.MaintainPhysicalItems maintainPhysicalItems26 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray27 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList28, physicalItemArray27);
        maintainPhysicalItems26.items = physicalItemList28;
        maintainPhysicalItems26.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems26.items;
        maintainPhysicalItems21.items = physicalItemList33;
        maintainPhysicalItems14.items = physicalItemList33;
        maintainPhysicalItems6.items = physicalItemList33;
        maintainPhysicalItems0.items = physicalItemList33;
        java.util.ArrayList<items.PhysicalItem> physicalItemList38 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((-1));
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        java.lang.String str43 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test149");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 0);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        maintainPhysicalItems0.increaseCopies((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test150");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) (short) 10);
        maintainPhysicalItems0.decreaseCopies(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test151");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass18 = physicalItemList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test152");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintaining.MaintainPhysicalItems maintainPhysicalItems1 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray2 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList3 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList3, physicalItemArray2);
        maintainPhysicalItems1.items = physicalItemList3;
        structure.Management management8 = null;
        items.PhysicalItem physicalItem9 = maintainPhysicalItems1.request("", "", management8);
        maintainPhysicalItems1.decreaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems1.items;
        maintainPhysicalItems0.items = physicalItemList12;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        java.lang.String str19 = maintainPhysicalItems14.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems28 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray29 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList30, physicalItemArray29);
        maintainPhysicalItems28.items = physicalItemList30;
        maintainPhysicalItems28.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems35 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray36 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList37, physicalItemArray36);
        maintainPhysicalItems35.items = physicalItemList37;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList47 = maintainPhysicalItems40.items;
        maintainPhysicalItems35.items = physicalItemList47;
        maintainPhysicalItems28.items = physicalItemList47;
        maintainPhysicalItems20.items = physicalItemList47;
        maintainPhysicalItems14.items = physicalItemList47;
        java.util.ArrayList<items.PhysicalItem> physicalItemList52 = maintainPhysicalItems14.items;
        maintainPhysicalItems0.items = physicalItemList52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList52);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test153");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        java.lang.String str21 = maintainPhysicalItems20.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems20.items;
        maintainPhysicalItems20.increaseCopies((int) (byte) 10);
        java.lang.String str25 = maintainPhysicalItems20.path;
        maintainPhysicalItems20.path = "";
        maintainPhysicalItems20.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems20.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems20.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray33 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList34, physicalItemArray33);
        maintainPhysicalItems32.items = physicalItemList34;
        maintainPhysicalItems32.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems32.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems47 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray48 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList49 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList49, physicalItemArray48);
        maintainPhysicalItems47.items = physicalItemList49;
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray53 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList54, physicalItemArray53);
        maintainPhysicalItems52.items = physicalItemList54;
        maintainPhysicalItems52.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList59 = maintainPhysicalItems52.items;
        maintainPhysicalItems47.items = physicalItemList59;
        maintainPhysicalItems40.items = physicalItemList59;
        maintainPhysicalItems32.items = physicalItemList59;
        maintainPhysicalItems20.items = physicalItemList59;
        maintainPhysicalItems0.items = physicalItemList59;
        structure.Management management67 = null;
        items.PhysicalItem physicalItem68 = maintainPhysicalItems0.request("hi!", "", management67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem68);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test154");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        java.lang.String str15 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(0);
        java.lang.String str18 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test155");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.path = "";
        java.lang.Class<?> wildcardClass28 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test156");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        java.lang.String str21 = maintainPhysicalItems20.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems20.items;
        maintainPhysicalItems20.increaseCopies((int) (byte) 10);
        java.lang.String str25 = maintainPhysicalItems20.path;
        maintainPhysicalItems20.path = "";
        maintainPhysicalItems20.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems20.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems20.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray33 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList34, physicalItemArray33);
        maintainPhysicalItems32.items = physicalItemList34;
        maintainPhysicalItems32.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems32.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems47 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray48 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList49 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList49, physicalItemArray48);
        maintainPhysicalItems47.items = physicalItemList49;
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray53 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList54, physicalItemArray53);
        maintainPhysicalItems52.items = physicalItemList54;
        maintainPhysicalItems52.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList59 = maintainPhysicalItems52.items;
        maintainPhysicalItems47.items = physicalItemList59;
        maintainPhysicalItems40.items = physicalItemList59;
        maintainPhysicalItems32.items = physicalItemList59;
        maintainPhysicalItems20.items = physicalItemList59;
        maintainPhysicalItems0.items = physicalItemList59;
        maintainPhysicalItems0.decreaseCopies(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList59);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test157");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        java.lang.String str5 = maintainPhysicalItems4.path;
        maintainPhysicalItems4.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems8.items;
        maintainPhysicalItems4.items = physicalItemList15;
        maintainPhysicalItems4.path = "";
        maintainPhysicalItems4.path = "";
        java.lang.String str21 = maintainPhysicalItems4.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintainPhysicalItems22.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems22.items;
        maintainPhysicalItems22.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = maintainPhysicalItems22.items;
        maintainPhysicalItems4.items = physicalItemList34;
        maintainPhysicalItems0.items = physicalItemList34;
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(0);
        java.lang.Class<?> wildcardClass40 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test158");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test159");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("hi!", "hi!", management17);
        java.lang.String str19 = maintainPhysicalItems0.path;
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems0.request("", "hi!", management22);
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems0.request("hi!", "", management26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test160");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        java.lang.String str13 = maintainPhysicalItems12.path;
        maintainPhysicalItems12.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems12.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintaining.MaintainPhysicalItems maintainPhysicalItems25 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray26 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList27, physicalItemArray26);
        maintainPhysicalItems25.items = physicalItemList27;
        maintainPhysicalItems25.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList32 = maintainPhysicalItems25.items;
        maintainPhysicalItems20.items = physicalItemList32;
        maintainPhysicalItems12.items = physicalItemList32;
        maintainPhysicalItems0.items = physicalItemList32;
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList36);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test161");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str13 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test162");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintaining.MaintainPhysicalItems maintainPhysicalItems5 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray6 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList7, physicalItemArray6);
        maintainPhysicalItems5.items = physicalItemList7;
        maintainPhysicalItems5.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems5.items;
        maintainPhysicalItems0.items = physicalItemList12;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("hi!", "hi!", management16);
        maintainPhysicalItems0.increaseCopies((int) (byte) -1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        java.lang.String str21 = maintainPhysicalItems20.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems20.items;
        maintainPhysicalItems20.increaseCopies((int) (byte) 10);
        java.lang.String str25 = maintainPhysicalItems20.path;
        maintainPhysicalItems20.path = "";
        maintainPhysicalItems20.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems20.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems20.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray33 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList34, physicalItemArray33);
        maintainPhysicalItems32.items = physicalItemList34;
        maintainPhysicalItems32.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems32.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems47 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray48 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList49 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList49, physicalItemArray48);
        maintainPhysicalItems47.items = physicalItemList49;
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray53 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList54, physicalItemArray53);
        maintainPhysicalItems52.items = physicalItemList54;
        maintainPhysicalItems52.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList59 = maintainPhysicalItems52.items;
        maintainPhysicalItems47.items = physicalItemList59;
        maintainPhysicalItems40.items = physicalItemList59;
        maintainPhysicalItems32.items = physicalItemList59;
        maintainPhysicalItems20.items = physicalItemList59;
        maintainPhysicalItems0.items = physicalItemList59;
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList59);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test163");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray5 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList6, physicalItemArray5);
        maintainPhysicalItems4.items = physicalItemList6;
        maintainPhysicalItems4.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems4.items;
        maintainPhysicalItems0.items = physicalItemList11;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.lang.String str17 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems18 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray19 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList20, physicalItemArray19);
        maintainPhysicalItems18.items = physicalItemList20;
        maintainPhysicalItems18.decreaseCopies(0);
        maintainPhysicalItems18.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems18.items;
        maintainPhysicalItems18.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems18.items;
        maintainPhysicalItems0.items = physicalItemList30;
        maintainPhysicalItems0.increaseCopies(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test164");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintainPhysicalItems0.items = physicalItemList9;
        java.lang.String str13 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test165");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 0);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        maintainPhysicalItems0.path = "hi!";
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test166");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) (short) 10);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies(100);
        maintainPhysicalItems0.decreaseCopies(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test167");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management15 = null;
        items.PhysicalItem physicalItem16 = maintainPhysicalItems0.request("", "", management15);
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = new maintaining.MaintainPhysicalItems();
        java.lang.String str18 = maintainPhysicalItems17.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems17.items;
        maintainPhysicalItems17.increaseCopies((int) (byte) 10);
        java.lang.String str22 = maintainPhysicalItems17.path;
        maintainPhysicalItems17.path = "";
        maintainPhysicalItems17.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems17.items;
        maintainPhysicalItems0.items = physicalItemList27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test168");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        java.lang.String str19 = maintainPhysicalItems0.path;
        java.lang.String str20 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.increaseCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test169");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        java.lang.String str13 = maintainPhysicalItems8.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        maintainPhysicalItems14.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems14.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems29 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray30 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList31, physicalItemArray30);
        maintainPhysicalItems29.items = physicalItemList31;
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintainPhysicalItems34.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList41 = maintainPhysicalItems34.items;
        maintainPhysicalItems29.items = physicalItemList41;
        maintainPhysicalItems22.items = physicalItemList41;
        maintainPhysicalItems14.items = physicalItemList41;
        maintainPhysicalItems8.items = physicalItemList41;
        maintaining.MaintainPhysicalItems maintainPhysicalItems46 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray47 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList48 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList48, physicalItemArray47);
        maintainPhysicalItems46.items = physicalItemList48;
        maintainPhysicalItems46.path = "hi!";
        structure.Management management55 = null;
        items.PhysicalItem physicalItem56 = maintainPhysicalItems46.request("hi!", "hi!", management55);
        maintainPhysicalItems46.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList59 = maintainPhysicalItems46.items;
        maintainPhysicalItems8.items = physicalItemList59;
        maintaining.MaintainPhysicalItems maintainPhysicalItems61 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray62 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList63 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList63, physicalItemArray62);
        maintainPhysicalItems61.items = physicalItemList63;
        maintainPhysicalItems61.decreaseCopies(0);
        maintainPhysicalItems61.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList70 = maintainPhysicalItems61.items;
        maintainPhysicalItems8.items = physicalItemList70;
        maintainPhysicalItems0.items = physicalItemList70;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList70);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test170");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test171");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.decreaseCopies(1);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.lang.String str26 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test172");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test173");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray10 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList11, physicalItemArray10);
        maintainPhysicalItems9.items = physicalItemList11;
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems9.request("", "", management16);
        maintainPhysicalItems9.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems9.increaseCopies((int) (byte) 10);
        maintainPhysicalItems9.path = "";
        java.lang.String str24 = maintainPhysicalItems9.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = maintainPhysicalItems9.items;
        maintainPhysicalItems0.items = physicalItemList25;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList25);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test174");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management15 = null;
        items.PhysicalItem physicalItem16 = maintainPhysicalItems0.request("", "", management15);
        structure.Management management19 = null;
        items.PhysicalItem physicalItem20 = maintainPhysicalItems0.request("", "hi!", management19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test175");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        java.lang.String str9 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray11 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList12, physicalItemArray11);
        maintainPhysicalItems10.items = physicalItemList12;
        maintainPhysicalItems0.items = physicalItemList12;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass17 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test176");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        maintainPhysicalItems0.increaseCopies((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test177");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test178");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.decreaseCopies(0);
        maintainPhysicalItems13.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems13.items;
        maintainPhysicalItems13.decreaseCopies((int) ' ');
        maintainPhysicalItems13.increaseCopies((int) (byte) 0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test179");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("", "", management17);
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray20 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList21, physicalItemArray20);
        maintainPhysicalItems19.items = physicalItemList21;
        maintainPhysicalItems19.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = maintainPhysicalItems19.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems27 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray28 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList29 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList29, physicalItemArray28);
        maintainPhysicalItems27.items = physicalItemList29;
        maintainPhysicalItems27.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintaining.MaintainPhysicalItems maintainPhysicalItems39 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray40 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList41 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList41, physicalItemArray40);
        maintainPhysicalItems39.items = physicalItemList41;
        maintainPhysicalItems39.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList46 = maintainPhysicalItems39.items;
        maintainPhysicalItems34.items = physicalItemList46;
        maintainPhysicalItems27.items = physicalItemList46;
        maintainPhysicalItems19.items = physicalItemList46;
        maintainPhysicalItems19.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        java.lang.String str53 = maintainPhysicalItems52.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = maintainPhysicalItems52.items;
        maintainPhysicalItems19.items = physicalItemList54;
        java.util.ArrayList<items.PhysicalItem> physicalItemList56 = maintainPhysicalItems19.items;
        maintainPhysicalItems0.items = physicalItemList56;
        maintainPhysicalItems0.path = "";
        structure.Management management62 = null;
        items.PhysicalItem physicalItem63 = maintainPhysicalItems0.request("", "", management62);
        maintainPhysicalItems0.decreaseCopies((int) 'a');
        java.lang.Class<?> wildcardClass66 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test180");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray7 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList8 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList8, physicalItemArray7);
        maintainPhysicalItems6.items = physicalItemList8;
        maintainPhysicalItems6.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems6.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        maintainPhysicalItems14.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems21 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray22 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList23 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList23, physicalItemArray22);
        maintainPhysicalItems21.items = physicalItemList23;
        maintaining.MaintainPhysicalItems maintainPhysicalItems26 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray27 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList28, physicalItemArray27);
        maintainPhysicalItems26.items = physicalItemList28;
        maintainPhysicalItems26.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems26.items;
        maintainPhysicalItems21.items = physicalItemList33;
        maintainPhysicalItems14.items = physicalItemList33;
        maintainPhysicalItems6.items = physicalItemList33;
        maintainPhysicalItems0.items = physicalItemList33;
        java.util.ArrayList<items.PhysicalItem> physicalItemList38 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((-1));
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList38);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test181");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test182");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        java.lang.String str9 = maintainPhysicalItems8.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList10;
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test183");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        java.lang.String str11 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test184");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.increaseCopies(10);
        java.lang.Class<?> wildcardClass24 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test185");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems8.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems16 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray17 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList18 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList18, physicalItemArray17);
        maintainPhysicalItems16.items = physicalItemList18;
        maintainPhysicalItems16.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray24 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList25, physicalItemArray24);
        maintainPhysicalItems23.items = physicalItemList25;
        maintaining.MaintainPhysicalItems maintainPhysicalItems28 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray29 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList30, physicalItemArray29);
        maintainPhysicalItems28.items = physicalItemList30;
        maintainPhysicalItems28.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems28.items;
        maintainPhysicalItems23.items = physicalItemList35;
        maintainPhysicalItems16.items = physicalItemList35;
        maintainPhysicalItems8.items = physicalItemList35;
        maintainPhysicalItems8.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems41 = new maintaining.MaintainPhysicalItems();
        java.lang.String str42 = maintainPhysicalItems41.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList43 = maintainPhysicalItems41.items;
        maintainPhysicalItems8.items = physicalItemList43;
        java.util.ArrayList<items.PhysicalItem> physicalItemList45 = maintainPhysicalItems8.items;
        maintainPhysicalItems0.items = physicalItemList45;
        java.lang.Class<?> wildcardClass47 = physicalItemList45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test186");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management6 = null;
        items.PhysicalItem physicalItem7 = maintainPhysicalItems0.request("", "hi!", management6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test187");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test188");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList20;
        maintainPhysicalItems0.path = "";
        java.lang.Class<?> wildcardClass24 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test189");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.increaseCopies(10);
        java.lang.String str24 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test190");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        java.lang.String str14 = maintainPhysicalItems13.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintainPhysicalItems15.decreaseCopies((int) (byte) 100);
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems15.items = physicalItemList24;
        maintainPhysicalItems13.items = physicalItemList24;
        structure.Management management31 = null;
        items.PhysicalItem physicalItem32 = maintainPhysicalItems13.request("hi!", "hi!", management31);
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList33;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test191");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test192");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str12 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass14 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test193");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray7 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList8 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList8, physicalItemArray7);
        maintainPhysicalItems6.items = physicalItemList8;
        maintainPhysicalItems6.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems6.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray15 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList16, physicalItemArray15);
        maintainPhysicalItems14.items = physicalItemList16;
        maintainPhysicalItems14.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems21 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray22 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList23 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList23, physicalItemArray22);
        maintainPhysicalItems21.items = physicalItemList23;
        maintaining.MaintainPhysicalItems maintainPhysicalItems26 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray27 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList28, physicalItemArray27);
        maintainPhysicalItems26.items = physicalItemList28;
        maintainPhysicalItems26.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList33 = maintainPhysicalItems26.items;
        maintainPhysicalItems21.items = physicalItemList33;
        maintainPhysicalItems14.items = physicalItemList33;
        maintainPhysicalItems6.items = physicalItemList33;
        maintainPhysicalItems0.items = physicalItemList33;
        maintaining.MaintainPhysicalItems maintainPhysicalItems38 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray39 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList40 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList40, physicalItemArray39);
        maintainPhysicalItems38.items = physicalItemList40;
        maintainPhysicalItems38.path = "hi!";
        structure.Management management47 = null;
        items.PhysicalItem physicalItem48 = maintainPhysicalItems38.request("hi!", "hi!", management47);
        maintainPhysicalItems38.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList51 = maintainPhysicalItems38.items;
        maintainPhysicalItems0.items = physicalItemList51;
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList51);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test194");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList7 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems20.items;
        maintainPhysicalItems15.items = physicalItemList27;
        maintainPhysicalItems8.items = physicalItemList27;
        maintainPhysicalItems0.items = physicalItemList27;
        maintainPhysicalItems0.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        java.lang.String str34 = maintainPhysicalItems33.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = maintainPhysicalItems33.items;
        maintainPhysicalItems0.items = physicalItemList35;
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList35);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test195");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        java.lang.String str19 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        java.lang.String str21 = maintainPhysicalItems20.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems20.items;
        maintainPhysicalItems20.increaseCopies((int) (byte) 10);
        java.lang.String str25 = maintainPhysicalItems20.path;
        maintainPhysicalItems20.path = "";
        maintainPhysicalItems20.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems20.items;
        maintainPhysicalItems0.items = physicalItemList30;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        java.lang.String str33 = maintainPhysicalItems32.path;
        maintainPhysicalItems32.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems36 = new maintaining.MaintainPhysicalItems();
        java.lang.String str37 = maintainPhysicalItems36.path;
        maintainPhysicalItems36.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList47 = maintainPhysicalItems40.items;
        maintainPhysicalItems36.items = physicalItemList47;
        maintainPhysicalItems36.path = "";
        maintainPhysicalItems36.path = "";
        java.lang.String str53 = maintainPhysicalItems36.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems54 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray55 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList56 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList56, physicalItemArray55);
        maintainPhysicalItems54.items = physicalItemList56;
        maintainPhysicalItems54.decreaseCopies(0);
        maintainPhysicalItems54.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList63 = maintainPhysicalItems54.items;
        maintainPhysicalItems54.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList66 = maintainPhysicalItems54.items;
        maintainPhysicalItems36.items = physicalItemList66;
        maintainPhysicalItems32.items = physicalItemList66;
        maintainPhysicalItems0.items = physicalItemList66;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList66);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test196");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies((int) (byte) 1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = new maintaining.MaintainPhysicalItems();
        java.lang.String str18 = maintainPhysicalItems17.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems17.items;
        maintainPhysicalItems17.increaseCopies((int) (byte) 10);
        java.lang.String str22 = maintainPhysicalItems17.path;
        maintainPhysicalItems17.path = "";
        maintainPhysicalItems17.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = maintainPhysicalItems17.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = maintainPhysicalItems17.items;
        java.lang.String str29 = maintainPhysicalItems17.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems30 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray31 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList32 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList32, physicalItemArray31);
        maintainPhysicalItems30.items = physicalItemList32;
        maintainPhysicalItems30.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = maintainPhysicalItems30.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems38 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray39 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList40 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList40, physicalItemArray39);
        maintainPhysicalItems38.items = physicalItemList40;
        maintainPhysicalItems38.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems45 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray46 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList47 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList47, physicalItemArray46);
        maintainPhysicalItems45.items = physicalItemList47;
        maintaining.MaintainPhysicalItems maintainPhysicalItems50 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray51 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList52 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList52, physicalItemArray51);
        maintainPhysicalItems50.items = physicalItemList52;
        maintainPhysicalItems50.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList57 = maintainPhysicalItems50.items;
        maintainPhysicalItems45.items = physicalItemList57;
        maintainPhysicalItems38.items = physicalItemList57;
        maintainPhysicalItems30.items = physicalItemList57;
        maintainPhysicalItems17.items = physicalItemList57;
        maintainPhysicalItems0.items = physicalItemList57;
        maintainPhysicalItems0.increaseCopies((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList57);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test197");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        java.lang.String str13 = maintainPhysicalItems12.path;
        maintainPhysicalItems12.decreaseCopies(1);
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems12.items = physicalItemList17;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintaining.MaintainPhysicalItems maintainPhysicalItems25 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray26 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList27 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList27, physicalItemArray26);
        maintainPhysicalItems25.items = physicalItemList27;
        maintainPhysicalItems25.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList32 = maintainPhysicalItems25.items;
        maintainPhysicalItems20.items = physicalItemList32;
        maintainPhysicalItems12.items = physicalItemList32;
        maintainPhysicalItems0.items = physicalItemList32;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test198");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        structure.Management management15 = null;
        items.PhysicalItem physicalItem16 = maintainPhysicalItems0.request("", "hi!", management15);
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test199");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management11 = null;
        items.PhysicalItem physicalItem12 = maintainPhysicalItems0.request("hi!", "hi!", management11);
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        java.lang.String str15 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test200");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test201");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems27 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray28 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList29 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList29, physicalItemArray28);
        maintainPhysicalItems27.items = physicalItemList29;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray33 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList34, physicalItemArray33);
        maintainPhysicalItems32.items = physicalItemList34;
        maintainPhysicalItems32.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems32.items;
        maintainPhysicalItems27.items = physicalItemList39;
        maintainPhysicalItems20.items = physicalItemList39;
        maintainPhysicalItems12.items = physicalItemList39;
        maintainPhysicalItems0.items = physicalItemList39;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test202");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray21 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList22, physicalItemArray21);
        maintainPhysicalItems20.items = physicalItemList22;
        maintainPhysicalItems20.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems27 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray28 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList29 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList29, physicalItemArray28);
        maintainPhysicalItems27.items = physicalItemList29;
        maintaining.MaintainPhysicalItems maintainPhysicalItems32 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray33 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList34, physicalItemArray33);
        maintainPhysicalItems32.items = physicalItemList34;
        maintainPhysicalItems32.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems32.items;
        maintainPhysicalItems27.items = physicalItemList39;
        maintainPhysicalItems20.items = physicalItemList39;
        maintainPhysicalItems12.items = physicalItemList39;
        maintainPhysicalItems0.items = physicalItemList39;
        maintainPhysicalItems0.increaseCopies((int) (byte) 100);
        maintainPhysicalItems0.increaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test203");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test204");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("", "", management16);
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems0.request("hi!", "", management20);
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray24 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList25, physicalItemArray24);
        maintainPhysicalItems23.items = physicalItemList25;
        structure.Management management30 = null;
        items.PhysicalItem physicalItem31 = maintainPhysicalItems23.request("", "", management30);
        maintainPhysicalItems23.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems23.increaseCopies((int) (byte) 10);
        maintainPhysicalItems23.path = "";
        java.lang.String str38 = maintainPhysicalItems23.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList39 = maintainPhysicalItems23.items;
        maintainPhysicalItems23.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = maintainPhysicalItems23.items;
        java.lang.String str43 = maintainPhysicalItems23.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList44 = maintainPhysicalItems23.items;
        maintainPhysicalItems0.items = physicalItemList44;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList44);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test205");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        java.lang.String str14 = maintainPhysicalItems13.path;
        maintainPhysicalItems13.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray18 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList19, physicalItemArray18);
        maintainPhysicalItems17.items = physicalItemList19;
        maintainPhysicalItems17.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems17.items;
        maintainPhysicalItems13.items = physicalItemList24;
        maintainPhysicalItems13.path = "";
        maintainPhysicalItems13.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test206");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        structure.Management management3 = null;
        items.PhysicalItem physicalItem4 = maintainPhysicalItems0.request("", "hi!", management3);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        java.lang.String str6 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintainPhysicalItems7.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems7.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        java.lang.String str16 = maintainPhysicalItems15.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems15.items;
        maintainPhysicalItems7.items = physicalItemList17;
        maintainPhysicalItems0.items = physicalItemList17;
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems0.request("hi!", "hi!", management22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test207");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) 'a');
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems13.request("hi!", "hi!", management22);
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems13.request("", "hi!", management26);
        maintainPhysicalItems13.increaseCopies(0);
        maintainPhysicalItems13.path = "";
        maintainPhysicalItems13.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList34);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test208");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.decreaseCopies(1);
        structure.Management management15 = null;
        items.PhysicalItem physicalItem16 = maintainPhysicalItems0.request("", "", management15);
        maintainPhysicalItems0.increaseCopies(10);
        structure.Management management21 = null;
        items.PhysicalItem physicalItem22 = maintainPhysicalItems0.request("", "hi!", management21);
        maintaining.MaintainPhysicalItems maintainPhysicalItems23 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray24 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList25 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList25, physicalItemArray24);
        maintainPhysicalItems23.items = physicalItemList25;
        structure.Management management30 = null;
        items.PhysicalItem physicalItem31 = maintainPhysicalItems23.request("", "", management30);
        java.lang.String str32 = maintainPhysicalItems23.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems33 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray34 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList35 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList35, physicalItemArray34);
        maintainPhysicalItems33.items = physicalItemList35;
        maintainPhysicalItems23.items = physicalItemList35;
        maintaining.MaintainPhysicalItems maintainPhysicalItems39 = new maintaining.MaintainPhysicalItems();
        java.lang.String str40 = maintainPhysicalItems39.path;
        maintainPhysicalItems39.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems43 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray44 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList45 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList45, physicalItemArray44);
        maintainPhysicalItems43.items = physicalItemList45;
        maintainPhysicalItems43.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList50 = maintainPhysicalItems43.items;
        maintainPhysicalItems39.items = physicalItemList50;
        maintainPhysicalItems39.path = "";
        maintainPhysicalItems39.path = "";
        java.lang.String str56 = maintainPhysicalItems39.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems57 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray58 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList59 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList59, physicalItemArray58);
        maintainPhysicalItems57.items = physicalItemList59;
        maintainPhysicalItems57.decreaseCopies(0);
        maintainPhysicalItems57.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList66 = maintainPhysicalItems57.items;
        maintainPhysicalItems57.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList69 = maintainPhysicalItems57.items;
        maintainPhysicalItems39.items = physicalItemList69;
        maintainPhysicalItems23.items = physicalItemList69;
        maintainPhysicalItems0.items = physicalItemList69;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList69);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test209");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.increaseCopies(100);
        maintaining.MaintainPhysicalItems maintainPhysicalItems3 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray4 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList5, physicalItemArray4);
        maintainPhysicalItems3.items = physicalItemList5;
        maintainPhysicalItems3.decreaseCopies(0);
        maintainPhysicalItems3.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems3.items;
        maintainPhysicalItems3.decreaseCopies((-1));
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems3.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems3.items;
        maintainPhysicalItems0.items = physicalItemList16;
        maintainPhysicalItems0.increaseCopies(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test210");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((int) ' ');
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        structure.Management management16 = null;
        items.PhysicalItem physicalItem17 = maintainPhysicalItems0.request("", "", management16);
        maintainPhysicalItems0.path = "";
        structure.Management management22 = null;
        items.PhysicalItem physicalItem23 = maintainPhysicalItems0.request("hi!", "", management22);
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass25 = physicalItemList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test211");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems24 = new maintaining.MaintainPhysicalItems();
        java.lang.String str25 = maintainPhysicalItems24.path;
        maintainPhysicalItems24.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = maintainPhysicalItems24.items;
        maintainPhysicalItems0.items = physicalItemList28;
        maintainPhysicalItems0.path = "hi!";
        java.lang.String str32 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test212");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management11 = null;
        items.PhysicalItem physicalItem12 = maintainPhysicalItems0.request("hi!", "hi!", management11);
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray16 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList17, physicalItemArray16);
        maintainPhysicalItems15.items = physicalItemList17;
        maintainPhysicalItems15.decreaseCopies((int) (byte) 100);
        structure.Management management24 = null;
        items.PhysicalItem physicalItem25 = maintainPhysicalItems15.request("hi!", "hi!", management24);
        maintainPhysicalItems15.increaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList28 = maintainPhysicalItems15.items;
        maintainPhysicalItems0.items = physicalItemList28;
        java.lang.Class<?> wildcardClass30 = physicalItemList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test213");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.decreaseCopies((int) (byte) 10);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        maintainPhysicalItems0.path = "";
        java.lang.String str15 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList16 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList17 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test214");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray5 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList6, physicalItemArray5);
        maintainPhysicalItems4.items = physicalItemList6;
        maintainPhysicalItems4.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems4.items;
        maintainPhysicalItems0.items = physicalItemList11;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.lang.Class<?> wildcardClass17 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test215");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies((int) (byte) 1);
        structure.Management management19 = null;
        items.PhysicalItem physicalItem20 = maintainPhysicalItems0.request("hi!", "hi!", management19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem20);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test216");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("", "", management17);
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray20 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList21, physicalItemArray20);
        maintainPhysicalItems19.items = physicalItemList21;
        maintainPhysicalItems19.decreaseCopies((int) (byte) 100);
        java.util.ArrayList<items.PhysicalItem> physicalItemList26 = maintainPhysicalItems19.items;
        maintaining.MaintainPhysicalItems maintainPhysicalItems27 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray28 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList29 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList29, physicalItemArray28);
        maintainPhysicalItems27.items = physicalItemList29;
        maintainPhysicalItems27.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems34 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray35 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList36 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList36, physicalItemArray35);
        maintainPhysicalItems34.items = physicalItemList36;
        maintaining.MaintainPhysicalItems maintainPhysicalItems39 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray40 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList41 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList41, physicalItemArray40);
        maintainPhysicalItems39.items = physicalItemList41;
        maintainPhysicalItems39.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList46 = maintainPhysicalItems39.items;
        maintainPhysicalItems34.items = physicalItemList46;
        maintainPhysicalItems27.items = physicalItemList46;
        maintainPhysicalItems19.items = physicalItemList46;
        maintainPhysicalItems19.increaseCopies((int) (short) 0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        java.lang.String str53 = maintainPhysicalItems52.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = maintainPhysicalItems52.items;
        maintainPhysicalItems19.items = physicalItemList54;
        java.util.ArrayList<items.PhysicalItem> physicalItemList56 = maintainPhysicalItems19.items;
        maintainPhysicalItems0.items = physicalItemList56;
        maintainPhysicalItems0.path = "";
        structure.Management management62 = null;
        items.PhysicalItem physicalItem63 = maintainPhysicalItems0.request("", "", management62);
        java.util.ArrayList<items.PhysicalItem> physicalItemList64 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList64);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test217");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems4 = new maintaining.MaintainPhysicalItems();
        java.lang.String str5 = maintainPhysicalItems4.path;
        maintainPhysicalItems4.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray9 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList10, physicalItemArray9);
        maintainPhysicalItems8.items = physicalItemList10;
        maintainPhysicalItems8.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = maintainPhysicalItems8.items;
        maintainPhysicalItems4.items = physicalItemList15;
        maintainPhysicalItems4.path = "";
        maintainPhysicalItems4.path = "";
        java.lang.String str21 = maintainPhysicalItems4.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.decreaseCopies(0);
        maintainPhysicalItems22.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList31 = maintainPhysicalItems22.items;
        maintainPhysicalItems22.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList34 = maintainPhysicalItems22.items;
        maintainPhysicalItems4.items = physicalItemList34;
        maintainPhysicalItems0.items = physicalItemList34;
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = maintainPhysicalItems0.items;
        structure.Management management40 = null;
        items.PhysicalItem physicalItem41 = maintainPhysicalItems0.request("", "hi!", management40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem41);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test218");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies((int) (byte) 100);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        maintainPhysicalItems0.increaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        maintainPhysicalItems13.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList20 = maintainPhysicalItems13.items;
        maintainPhysicalItems0.items = physicalItemList20;
        maintainPhysicalItems0.path = "";
        structure.Management management26 = null;
        items.PhysicalItem physicalItem27 = maintainPhysicalItems0.request("hi!", "hi!", management26);
        maintaining.MaintainPhysicalItems maintainPhysicalItems28 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray29 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList30, physicalItemArray29);
        maintainPhysicalItems28.items = physicalItemList30;
        maintainPhysicalItems28.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems35 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray36 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList37 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList37, physicalItemArray36);
        maintainPhysicalItems35.items = physicalItemList37;
        maintaining.MaintainPhysicalItems maintainPhysicalItems40 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray41 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList42 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList42, physicalItemArray41);
        maintainPhysicalItems40.items = physicalItemList42;
        maintainPhysicalItems40.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList47 = maintainPhysicalItems40.items;
        maintainPhysicalItems35.items = physicalItemList47;
        maintainPhysicalItems28.items = physicalItemList47;
        maintainPhysicalItems28.increaseCopies(10);
        maintaining.MaintainPhysicalItems maintainPhysicalItems52 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray53 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList54 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList54, physicalItemArray53);
        maintainPhysicalItems52.items = physicalItemList54;
        structure.Management management59 = null;
        items.PhysicalItem physicalItem60 = maintainPhysicalItems52.request("", "", management59);
        maintainPhysicalItems52.decreaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList63 = maintainPhysicalItems52.items;
        maintainPhysicalItems28.items = physicalItemList63;
        maintainPhysicalItems0.items = physicalItemList63;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList63);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test219");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass15 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test220");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies(1);
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray14 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList15 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList15, physicalItemArray14);
        maintainPhysicalItems13.items = physicalItemList15;
        structure.Management management20 = null;
        items.PhysicalItem physicalItem21 = maintainPhysicalItems13.request("", "", management20);
        maintainPhysicalItems13.decreaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = maintainPhysicalItems13.items;
        maintainPhysicalItems12.items = physicalItemList24;
        maintainPhysicalItems0.items = physicalItemList24;
        maintainPhysicalItems0.increaseCopies((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList24);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test221");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList6 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test222");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray23 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList24 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList24, physicalItemArray23);
        maintainPhysicalItems22.items = physicalItemList24;
        maintainPhysicalItems22.path = "hi!";
        structure.Management management31 = null;
        items.PhysicalItem physicalItem32 = maintainPhysicalItems22.request("hi!", "hi!", management31);
        maintainPhysicalItems22.path = "hi!";
        maintainPhysicalItems22.decreaseCopies(0);
        structure.Management management39 = null;
        items.PhysicalItem physicalItem40 = maintainPhysicalItems22.request("", "", management39);
        maintaining.MaintainPhysicalItems maintainPhysicalItems41 = new maintaining.MaintainPhysicalItems();
        java.lang.String str42 = maintainPhysicalItems41.path;
        maintainPhysicalItems41.path = "";
        maintaining.MaintainPhysicalItems maintainPhysicalItems45 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray46 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList47 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList47, physicalItemArray46);
        maintainPhysicalItems45.items = physicalItemList47;
        maintainPhysicalItems45.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList52 = maintainPhysicalItems45.items;
        maintainPhysicalItems41.items = physicalItemList52;
        maintainPhysicalItems41.path = "";
        maintainPhysicalItems41.path = "";
        java.lang.String str58 = maintainPhysicalItems41.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems59 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray60 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList61 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList61, physicalItemArray60);
        maintainPhysicalItems59.items = physicalItemList61;
        maintainPhysicalItems59.decreaseCopies(0);
        maintainPhysicalItems59.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList68 = maintainPhysicalItems59.items;
        maintainPhysicalItems59.decreaseCopies(1);
        java.util.ArrayList<items.PhysicalItem> physicalItemList71 = maintainPhysicalItems59.items;
        maintainPhysicalItems41.items = physicalItemList71;
        maintainPhysicalItems22.items = physicalItemList71;
        maintainPhysicalItems0.items = physicalItemList71;
        java.lang.Class<?> wildcardClass75 = physicalItemList71.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test223");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) (byte) 10);
        java.lang.String str5 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList10 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList11 = maintainPhysicalItems0.items;
        java.lang.Class<?> wildcardClass12 = maintainPhysicalItems0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test224");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.lang.String str22 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList23 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test225");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        maintainPhysicalItems0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test226");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        maintainPhysicalItems0.increaseCopies(10);
        java.lang.String str24 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies((int) (short) -1);
        maintainPhysicalItems0.decreaseCopies((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test227");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.decreaseCopies((int) '#');
        java.util.ArrayList<items.PhysicalItem> physicalItemList21 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test228");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        maintainPhysicalItems0.increaseCopies(100);
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.increaseCopies(100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test229");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        maintainPhysicalItems0.increaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test230");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("", "hi!", management13);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.path = "";
        java.lang.String str19 = maintainPhysicalItems0.path;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = new maintaining.MaintainPhysicalItems();
        java.lang.String str21 = maintainPhysicalItems20.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList22 = maintainPhysicalItems20.items;
        maintainPhysicalItems20.increaseCopies((int) (byte) 10);
        java.lang.String str25 = maintainPhysicalItems20.path;
        maintainPhysicalItems20.path = "";
        maintainPhysicalItems20.path = "";
        java.util.ArrayList<items.PhysicalItem> physicalItemList30 = maintainPhysicalItems20.items;
        maintainPhysicalItems0.items = physicalItemList30;
        structure.Management management34 = null;
        items.PhysicalItem physicalItem35 = maintainPhysicalItems0.request("", "hi!", management34);
        java.lang.String str36 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test231");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray8 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList9, physicalItemArray8);
        maintainPhysicalItems7.items = physicalItemList9;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray13 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList14 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList14, physicalItemArray13);
        maintainPhysicalItems12.items = physicalItemList14;
        maintainPhysicalItems12.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList19 = maintainPhysicalItems12.items;
        maintainPhysicalItems7.items = physicalItemList19;
        maintainPhysicalItems0.items = physicalItemList19;
        structure.Management management24 = null;
        items.PhysicalItem physicalItem25 = maintainPhysicalItems0.request("", "hi!", management24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem25);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test232");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        structure.Management management7 = null;
        items.PhysicalItem physicalItem8 = maintainPhysicalItems0.request("", "", management7);
        maintainPhysicalItems0.increaseCopies(0);
        maintainPhysicalItems0.increaseCopies((int) (byte) 0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test233");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("", "", management9);
        structure.Management management13 = null;
        items.PhysicalItem physicalItem14 = maintainPhysicalItems0.request("hi!", "", management13);
        maintainPhysicalItems0.decreaseCopies(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test234");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        java.lang.String str1 = maintainPhysicalItems0.path;
        maintainPhysicalItems0.decreaseCopies(1);
        java.lang.String str4 = maintainPhysicalItems0.path;
        java.util.ArrayList<items.PhysicalItem> physicalItemList5 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test235");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.path = "hi!";
        structure.Management management9 = null;
        items.PhysicalItem physicalItem10 = maintainPhysicalItems0.request("hi!", "hi!", management9);
        maintainPhysicalItems0.path = "hi!";
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        java.lang.String str14 = maintainPhysicalItems0.path;
        structure.Management management17 = null;
        items.PhysicalItem physicalItem18 = maintainPhysicalItems0.request("hi!", "", management17);
        java.lang.String str19 = maintainPhysicalItems0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(physicalItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPhysicalItemsTest.test236");
        maintaining.MaintainPhysicalItems maintainPhysicalItems0 = new maintaining.MaintainPhysicalItems();
        items.PhysicalItem[] physicalItemArray1 = new items.PhysicalItem[] {};
        java.util.ArrayList<items.PhysicalItem> physicalItemList2 = new java.util.ArrayList<items.PhysicalItem>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<items.PhysicalItem>) physicalItemList2, physicalItemArray1);
        maintainPhysicalItems0.items = physicalItemList2;
        maintainPhysicalItems0.decreaseCopies(0);
        maintainPhysicalItems0.decreaseCopies(0);
        java.util.ArrayList<items.PhysicalItem> physicalItemList9 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.decreaseCopies((-1));
        java.util.ArrayList<items.PhysicalItem> physicalItemList12 = maintainPhysicalItems0.items;
        java.util.ArrayList<items.PhysicalItem> physicalItemList13 = maintainPhysicalItems0.items;
        maintainPhysicalItems0.increaseCopies((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList13);
    }
}

