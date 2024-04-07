package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaintainPurchasesTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test001");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass5 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test002");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass9 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test003");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.Class<?> wildcardClass11 = purchaseList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test004");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass14 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test005");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.Class<?> wildcardClass20 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test006");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        java.lang.Class<?> wildcardClass5 = purchaseList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test007");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.lang.Class<?> wildcardClass66 = purchaseList64.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test008");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        java.lang.Class<?> wildcardClass41 = purchaseList38.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test009");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass6 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test010");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.lang.Class<?> wildcardClass60 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test011");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass2 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test012");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass17 = purchaseList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test013");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass23 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test014");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.Class<?> wildcardClass20 = purchaseList18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test015");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass5 = purchaseList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test016");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test017");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        java.lang.String str11 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test018");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass18 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test019");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass25 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test020");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        java.lang.Class<?> wildcardClass35 = purchaseList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test021");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test022");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass12 = purchaseList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test023");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test024");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass13 = purchaseList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test025");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray21 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList22 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList22, purchaseArray21);
        maintainPurchases20.purchases = purchaseList22;
        maintainPurchases20.path = "hi!";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        maintainPurchases0.purchases = purchaseList28;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test026");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass12 = purchaseList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test027");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str27 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test028");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.lang.Class<?> wildcardClass72 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test029");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.lang.String str14 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test030");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.String str10 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test031");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases61 = new maintaining.MaintainPurchases();
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases61.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases61.purchases;
        maintainPurchases61.path = "hi!";
        maintainPurchases61.path = "hi!";
        maintainPurchases61.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases76 = new maintaining.MaintainPurchases();
        maintainPurchases76.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList79 = maintainPurchases76.purchases;
        maintainPurchases61.purchases = purchaseList79;
        maintaining.MaintainPurchases maintainPurchases81 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray82 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList83 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList83, purchaseArray82);
        maintainPurchases81.purchases = purchaseList83;
        maintainPurchases81.path = "hi!";
        actions.Purchase[] purchaseArray88 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList89 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList89, purchaseArray88);
        maintainPurchases81.purchases = purchaseList89;
        maintainPurchases61.purchases = purchaseList89;
        maintainPurchases0.purchases = purchaseList89;
        java.lang.Class<?> wildcardClass94 = purchaseList89.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test032");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test033");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.lang.String str72 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass73 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test034");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases12 = new maintaining.MaintainPurchases();
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases12.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases12.purchases;
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases27 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray28 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList29 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList29, purchaseArray28);
        maintainPurchases27.purchases = purchaseList29;
        maintainPurchases27.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.lang.String str39 = maintainPurchases34.path;
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        actions.Purchase[] purchaseArray47 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList48 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList48, purchaseArray47);
        maintainPurchases40.purchases = purchaseList48;
        java.lang.String str51 = maintainPurchases40.path;
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases40.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases27.purchases = purchaseList52;
        maintainPurchases12.purchases = purchaseList52;
        maintainPurchases0.purchases = purchaseList52;
        java.lang.Class<?> wildcardClass57 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test035");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.lang.String str66 = maintainPurchases0.path;
        java.lang.String str67 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test036");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass20 = purchaseList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test037");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        java.lang.String str13 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass14 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test038");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.lang.String str16 = maintainPurchases11.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases17.purchases;
        maintainPurchases11.purchases = purchaseList29;
        maintaining.MaintainPurchases maintainPurchases31 = new maintaining.MaintainPurchases();
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases31.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases31.purchases;
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases46.purchases;
        maintainPurchases31.purchases = purchaseList49;
        maintainPurchases11.purchases = purchaseList49;
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        actions.Purchase[] purchaseArray59 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList60 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList60, purchaseArray59);
        maintainPurchases52.purchases = purchaseList60;
        java.lang.String str63 = maintainPurchases52.path;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases52.purchases;
        maintainPurchases11.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases11.purchases;
        maintaining.MaintainPurchases maintainPurchases67 = new maintaining.MaintainPurchases();
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList74 = maintainPurchases67.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList75 = maintainPurchases67.purchases;
        maintainPurchases11.purchases = purchaseList75;
        maintainPurchases0.purchases = purchaseList75;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList75);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test039");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintaining.MaintainPurchases maintainPurchases70 = new maintaining.MaintainPurchases();
        maintainPurchases70.path = "";
        maintainPurchases70.path = "";
        maintainPurchases70.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList77 = maintainPurchases70.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList78 = maintainPurchases70.purchases;
        maintainPurchases14.purchases = purchaseList78;
        java.lang.String str80 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases81 = new maintaining.MaintainPurchases();
        maintainPurchases81.path = "";
        maintainPurchases81.path = "";
        maintainPurchases81.path = "";
        actions.Purchase[] purchaseArray88 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList89 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList89, purchaseArray88);
        maintainPurchases81.purchases = purchaseList89;
        maintainPurchases14.purchases = purchaseList89;
        maintainPurchases0.purchases = purchaseList89;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test040");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass23 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test041");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases5 = new maintaining.MaintainPurchases();
        maintainPurchases5.path = "";
        maintainPurchases5.path = "";
        java.lang.String str10 = maintainPurchases5.path;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases11.purchases;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases13.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases13.purchases;
        maintainPurchases11.purchases = purchaseList21;
        maintainPurchases5.purchases = purchaseList21;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases5.purchases;
        maintainPurchases0.purchases = purchaseList24;
        maintaining.MaintainPurchases maintainPurchases26 = new maintaining.MaintainPurchases();
        maintainPurchases26.path = "";
        maintainPurchases26.path = "";
        java.lang.String str31 = maintainPurchases26.path;
        maintaining.MaintainPurchases maintainPurchases32 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases32.purchases;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases32.purchases = purchaseList42;
        maintainPurchases26.purchases = purchaseList42;
        java.util.ArrayList<actions.Purchase> purchaseList45 = maintainPurchases26.purchases;
        maintainPurchases0.purchases = purchaseList45;
        maintaining.MaintainPurchases maintainPurchases47 = new maintaining.MaintainPurchases();
        maintainPurchases47.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList50 = maintainPurchases47.purchases;
        maintainPurchases0.purchases = purchaseList50;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList50);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test042");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        java.lang.String str5 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test043");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass5 = purchaseList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test044");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        java.lang.String str11 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass12 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test045");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test046");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        java.lang.String str56 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test047");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.lang.String str16 = maintainPurchases11.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases17.purchases;
        maintainPurchases11.purchases = purchaseList29;
        maintaining.MaintainPurchases maintainPurchases31 = new maintaining.MaintainPurchases();
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases31.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases31.purchases;
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases46.purchases;
        maintainPurchases31.purchases = purchaseList49;
        maintainPurchases11.purchases = purchaseList49;
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        actions.Purchase[] purchaseArray59 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList60 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList60, purchaseArray59);
        maintainPurchases52.purchases = purchaseList60;
        java.lang.String str63 = maintainPurchases52.path;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases52.purchases;
        maintainPurchases11.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList66;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test048");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass14 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test049");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass5 = purchaseList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test050");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        maintaining.MaintainPurchases maintainPurchases32 = new maintaining.MaintainPurchases();
        maintainPurchases32.path = "";
        maintainPurchases32.path = "";
        maintainPurchases32.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases32.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases32.purchases;
        maintainPurchases32.path = "hi!";
        maintainPurchases32.path = "hi!";
        maintainPurchases32.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases47 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases47.purchases = purchaseList49;
        maintainPurchases47.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases54 = new maintaining.MaintainPurchases();
        maintainPurchases54.path = "";
        maintainPurchases54.path = "";
        java.lang.String str59 = maintainPurchases54.path;
        maintaining.MaintainPurchases maintainPurchases60 = new maintaining.MaintainPurchases();
        maintainPurchases60.path = "";
        maintainPurchases60.path = "";
        maintainPurchases60.path = "";
        actions.Purchase[] purchaseArray67 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList68 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList68, purchaseArray67);
        maintainPurchases60.purchases = purchaseList68;
        java.lang.String str71 = maintainPurchases60.path;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases60.purchases;
        maintainPurchases54.purchases = purchaseList72;
        maintainPurchases47.purchases = purchaseList72;
        maintainPurchases32.purchases = purchaseList72;
        maintainPurchases17.purchases = purchaseList72;
        java.util.ArrayList<actions.Purchase> purchaseList77 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList77;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList77);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test051");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test052");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test053");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.String str12 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases0.purchases;
        java.lang.String str14 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test054");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray16 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList17 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList17, purchaseArray16);
        maintainPurchases15.purchases = purchaseList17;
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        java.lang.String str27 = maintainPurchases22.path;
        maintaining.MaintainPurchases maintainPurchases28 = new maintaining.MaintainPurchases();
        maintainPurchases28.path = "";
        maintainPurchases28.path = "";
        maintainPurchases28.path = "";
        actions.Purchase[] purchaseArray35 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList36 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList36, purchaseArray35);
        maintainPurchases28.purchases = purchaseList36;
        java.lang.String str39 = maintainPurchases28.path;
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases28.purchases;
        maintainPurchases22.purchases = purchaseList40;
        maintainPurchases15.purchases = purchaseList40;
        maintainPurchases0.purchases = purchaseList40;
        java.lang.Class<?> wildcardClass44 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test055");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases23 = new maintaining.MaintainPurchases();
        maintainPurchases23.path = "";
        maintainPurchases23.path = "";
        java.lang.String str28 = maintainPurchases23.path;
        maintaining.MaintainPurchases maintainPurchases29 = new maintaining.MaintainPurchases();
        maintainPurchases29.path = "";
        maintainPurchases29.path = "";
        maintainPurchases29.path = "";
        actions.Purchase[] purchaseArray36 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList37 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList37, purchaseArray36);
        maintainPurchases29.purchases = purchaseList37;
        java.lang.String str40 = maintainPurchases29.path;
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases29.purchases;
        maintainPurchases23.purchases = purchaseList41;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList50 = maintainPurchases43.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList51 = maintainPurchases43.purchases;
        maintainPurchases43.path = "hi!";
        maintainPurchases43.path = "hi!";
        maintainPurchases43.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases58 = new maintaining.MaintainPurchases();
        maintainPurchases58.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases58.purchases;
        maintainPurchases43.purchases = purchaseList61;
        maintainPurchases23.purchases = purchaseList61;
        maintaining.MaintainPurchases maintainPurchases64 = new maintaining.MaintainPurchases();
        maintainPurchases64.path = "";
        maintainPurchases64.path = "";
        maintainPurchases64.path = "";
        actions.Purchase[] purchaseArray71 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList72 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList72, purchaseArray71);
        maintainPurchases64.purchases = purchaseList72;
        java.lang.String str75 = maintainPurchases64.path;
        java.util.ArrayList<actions.Purchase> purchaseList76 = maintainPurchases64.purchases;
        maintainPurchases23.purchases = purchaseList76;
        java.util.ArrayList<actions.Purchase> purchaseList78 = maintainPurchases23.purchases;
        java.lang.String str79 = maintainPurchases23.path;
        maintainPurchases23.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases82 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList83 = maintainPurchases82.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList84 = maintainPurchases82.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList85 = maintainPurchases82.purchases;
        java.lang.String str86 = maintainPurchases82.path;
        maintainPurchases82.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList89 = maintainPurchases82.purchases;
        maintainPurchases23.purchases = purchaseList89;
        maintainPurchases0.purchases = purchaseList89;
        java.util.ArrayList<actions.Purchase> purchaseList92 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList92);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test056");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "hi!";
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test057");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass7 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test058");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.String str19 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        maintainPurchases22.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases22.purchases;
        maintainPurchases0.purchases = purchaseList25;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test059");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test060");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass7 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test061");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test062");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str25 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass28 = purchaseList27.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test063");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.String str31 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test064");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass3 = purchaseList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test065");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass58 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test066");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass12 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test067");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray21 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList22 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList22, purchaseArray21);
        maintainPurchases20.purchases = purchaseList22;
        maintainPurchases20.path = "hi!";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        maintainPurchases0.purchases = purchaseList28;
        maintaining.MaintainPurchases maintainPurchases32 = new maintaining.MaintainPurchases();
        maintainPurchases32.path = "";
        maintainPurchases32.path = "";
        java.lang.String str37 = maintainPurchases32.path;
        maintaining.MaintainPurchases maintainPurchases38 = new maintaining.MaintainPurchases();
        maintainPurchases38.path = "";
        maintainPurchases38.path = "";
        maintainPurchases38.path = "";
        actions.Purchase[] purchaseArray45 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList46 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList46, purchaseArray45);
        maintainPurchases38.purchases = purchaseList46;
        java.lang.String str49 = maintainPurchases38.path;
        java.util.ArrayList<actions.Purchase> purchaseList50 = maintainPurchases38.purchases;
        maintainPurchases32.purchases = purchaseList50;
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases52.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases52.purchases;
        maintainPurchases52.path = "hi!";
        maintainPurchases52.path = "hi!";
        maintainPurchases52.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases67 = new maintaining.MaintainPurchases();
        maintainPurchases67.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases67.purchases;
        maintainPurchases52.purchases = purchaseList70;
        maintainPurchases32.purchases = purchaseList70;
        maintainPurchases0.purchases = purchaseList70;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test068");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.lang.Class<?> wildcardClass28 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test069");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        java.lang.String str56 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases59 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases59.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases59.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases59.purchases;
        java.lang.String str63 = maintainPurchases59.path;
        maintainPurchases59.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases59.purchases;
        maintainPurchases0.purchases = purchaseList66;
        java.lang.String str68 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test070");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        java.lang.String str5 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test071");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass25 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test072");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass12 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test073");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass21 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test074");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases0.purchases;
        java.lang.String str67 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test075");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass5 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test076");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test077");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass23 = purchaseList22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test078");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass3 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test079");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass11 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test080");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases57.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test081");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass21 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test082");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass5 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test083");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.lang.String str8 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test084");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass7 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test085");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases22.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases22.purchases;
        maintainPurchases0.purchases = purchaseList30;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test086");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.lang.String str22 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test087");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases4 = new maintaining.MaintainPurchases();
        maintainPurchases4.path = "";
        maintainPurchases4.path = "";
        java.lang.String str9 = maintainPurchases4.path;
        maintaining.MaintainPurchases maintainPurchases10 = new maintaining.MaintainPurchases();
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        actions.Purchase[] purchaseArray17 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList18 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList18, purchaseArray17);
        maintainPurchases10.purchases = purchaseList18;
        java.lang.String str21 = maintainPurchases10.path;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases10.purchases;
        maintainPurchases4.purchases = purchaseList22;
        maintaining.MaintainPurchases maintainPurchases24 = new maintaining.MaintainPurchases();
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases24.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases24.purchases;
        maintainPurchases24.path = "hi!";
        maintainPurchases24.path = "hi!";
        maintainPurchases24.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases39 = new maintaining.MaintainPurchases();
        maintainPurchases39.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases39.purchases;
        maintainPurchases24.purchases = purchaseList42;
        maintainPurchases4.purchases = purchaseList42;
        maintaining.MaintainPurchases maintainPurchases45 = new maintaining.MaintainPurchases();
        maintainPurchases45.path = "";
        maintainPurchases45.path = "";
        maintainPurchases45.path = "";
        actions.Purchase[] purchaseArray52 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList53 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList53, purchaseArray52);
        maintainPurchases45.purchases = purchaseList53;
        java.lang.String str56 = maintainPurchases45.path;
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases45.purchases;
        maintainPurchases4.purchases = purchaseList57;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases4.purchases;
        maintainPurchases0.purchases = purchaseList59;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test088");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        maintainPurchases0.path = "";
        java.lang.String str37 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass40 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test089");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList5 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList6 = maintainPurchases3.purchases;
        java.lang.String str7 = maintainPurchases3.path;
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.lang.String str16 = maintainPurchases11.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases17.purchases;
        maintainPurchases11.purchases = purchaseList29;
        maintaining.MaintainPurchases maintainPurchases31 = new maintaining.MaintainPurchases();
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases31.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases31.purchases;
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases46.purchases;
        maintainPurchases31.purchases = purchaseList49;
        maintainPurchases11.purchases = purchaseList49;
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        actions.Purchase[] purchaseArray59 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList60 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList60, purchaseArray59);
        maintainPurchases52.purchases = purchaseList60;
        java.lang.String str63 = maintainPurchases52.path;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases52.purchases;
        maintainPurchases11.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases11.purchases;
        java.lang.String str67 = maintainPurchases11.path;
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases11.purchases;
        maintainPurchases3.purchases = purchaseList68;
        maintainPurchases0.purchases = purchaseList68;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test090");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass16 = purchaseList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test091");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases7.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases7.purchases;
        maintainPurchases7.path = "hi!";
        maintainPurchases7.path = "hi!";
        maintainPurchases7.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray23 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList24 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList24, purchaseArray23);
        maintainPurchases22.purchases = purchaseList24;
        maintainPurchases22.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases29 = new maintaining.MaintainPurchases();
        maintainPurchases29.path = "";
        maintainPurchases29.path = "";
        java.lang.String str34 = maintainPurchases29.path;
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        maintainPurchases35.path = "";
        maintainPurchases35.path = "";
        actions.Purchase[] purchaseArray42 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList43 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList43, purchaseArray42);
        maintainPurchases35.purchases = purchaseList43;
        java.lang.String str46 = maintainPurchases35.path;
        java.util.ArrayList<actions.Purchase> purchaseList47 = maintainPurchases35.purchases;
        maintainPurchases29.purchases = purchaseList47;
        maintainPurchases22.purchases = purchaseList47;
        maintainPurchases7.purchases = purchaseList47;
        maintainPurchases0.purchases = purchaseList47;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList47);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test092");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        maintaining.MaintainPurchases maintainPurchases12 = new maintaining.MaintainPurchases();
        maintainPurchases12.path = "";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        maintainPurchases30.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases30.purchases;
        maintainPurchases15.purchases = purchaseList33;
        java.lang.String str35 = maintainPurchases15.path;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "";
        java.lang.String str40 = maintainPurchases15.path;
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases15.purchases;
        maintainPurchases12.purchases = purchaseList41;
        maintainPurchases0.purchases = purchaseList41;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test093");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test094");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test095");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test096");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str13 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test097");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.lang.Class<?> wildcardClass72 = purchaseList69.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test098");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        java.lang.String str56 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases59 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases59.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases59.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases59.purchases;
        java.lang.String str63 = maintainPurchases59.path;
        maintainPurchases59.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases59.purchases;
        maintainPurchases0.purchases = purchaseList66;
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test099");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases17.purchases;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases19.purchases;
        maintainPurchases17.purchases = purchaseList27;
        maintainPurchases0.purchases = purchaseList27;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test100");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass15 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test101");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.lang.String str72 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases73 = new maintaining.MaintainPurchases();
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList80 = maintainPurchases73.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList81 = maintainPurchases73.purchases;
        maintainPurchases73.path = "hi!";
        maintainPurchases73.path = "hi!";
        maintainPurchases73.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases88 = new maintaining.MaintainPurchases();
        maintainPurchases88.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList91 = maintainPurchases88.purchases;
        maintainPurchases73.purchases = purchaseList91;
        maintainPurchases0.purchases = purchaseList91;
        java.lang.Class<?> wildcardClass94 = purchaseList91.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test102");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test103");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        java.lang.Class<?> wildcardClass35 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test104");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        java.lang.String str19 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test105");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList17 = maintainPurchases14.purchases;
        maintainPurchases0.purchases = purchaseList17;
        java.lang.Class<?> wildcardClass19 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test106");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases24 = new maintaining.MaintainPurchases();
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases24.purchases = purchaseList32;
        java.lang.String str35 = maintainPurchases24.path;
        maintainPurchases24.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases24.purchases;
        maintainPurchases0.purchases = purchaseList38;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test107");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.lang.String str29 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test108");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        java.lang.String str56 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test109");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test110");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray56 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList57 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList57, purchaseArray56);
        maintainPurchases55.purchases = purchaseList57;
        maintainPurchases55.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases62 = new maintaining.MaintainPurchases();
        maintainPurchases62.path = "";
        maintainPurchases62.path = "";
        java.lang.String str67 = maintainPurchases62.path;
        maintaining.MaintainPurchases maintainPurchases68 = new maintaining.MaintainPurchases();
        maintainPurchases68.path = "";
        maintainPurchases68.path = "";
        maintainPurchases68.path = "";
        actions.Purchase[] purchaseArray75 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList76 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList76, purchaseArray75);
        maintainPurchases68.purchases = purchaseList76;
        java.lang.String str79 = maintainPurchases68.path;
        java.util.ArrayList<actions.Purchase> purchaseList80 = maintainPurchases68.purchases;
        maintainPurchases62.purchases = purchaseList80;
        maintainPurchases55.purchases = purchaseList80;
        java.util.ArrayList<actions.Purchase> purchaseList83 = maintainPurchases55.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList84 = maintainPurchases55.purchases;
        maintainPurchases0.purchases = purchaseList84;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList84);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test111");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        java.lang.String str57 = maintainPurchases0.path;
        java.lang.String str58 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test112");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str13 = maintainPurchases0.path;
        java.lang.String str14 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test113");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.lang.Class<?> wildcardClass60 = purchaseList55.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test114");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass17 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test115");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.String str7 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test116");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str25 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass27 = purchaseList26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test117");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass13 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test118");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test119");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str25 = maintainPurchases0.path;
        java.lang.String str26 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test120");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        java.lang.String str20 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test121");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass10 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test122");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.lang.Class<?> wildcardClass22 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test123");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.String str63 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test124");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.String str19 = maintainPurchases0.path;
        java.lang.String str20 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass22 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test125");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test126");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        java.lang.String str57 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test127");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.Class<?> wildcardClass19 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test128");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases18 = new maintaining.MaintainPurchases();
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        actions.Purchase[] purchaseArray25 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList26 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList26, purchaseArray25);
        maintainPurchases18.purchases = purchaseList26;
        java.lang.String str29 = maintainPurchases18.path;
        maintainPurchases18.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases18.purchases;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        maintainPurchases33.path = "";
        maintainPurchases33.path = "";
        maintainPurchases33.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases33.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases33.purchases;
        maintainPurchases33.path = "hi!";
        maintainPurchases33.path = "hi!";
        maintainPurchases33.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases48 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray49 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList50 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList50, purchaseArray49);
        maintainPurchases48.purchases = purchaseList50;
        maintainPurchases48.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        java.lang.String str60 = maintainPurchases55.path;
        maintaining.MaintainPurchases maintainPurchases61 = new maintaining.MaintainPurchases();
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        actions.Purchase[] purchaseArray68 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList69 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList69, purchaseArray68);
        maintainPurchases61.purchases = purchaseList69;
        java.lang.String str72 = maintainPurchases61.path;
        java.util.ArrayList<actions.Purchase> purchaseList73 = maintainPurchases61.purchases;
        maintainPurchases55.purchases = purchaseList73;
        maintainPurchases48.purchases = purchaseList73;
        maintainPurchases33.purchases = purchaseList73;
        maintainPurchases18.purchases = purchaseList73;
        java.util.ArrayList<actions.Purchase> purchaseList78 = maintainPurchases18.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList79 = maintainPurchases18.purchases;
        maintainPurchases0.purchases = purchaseList79;
        java.lang.String str81 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test129");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test130");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases17.purchases;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases19.purchases;
        maintainPurchases17.purchases = purchaseList27;
        maintainPurchases0.purchases = purchaseList27;
        java.lang.Class<?> wildcardClass30 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test131");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str14 = maintainPurchases0.path;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass17 = purchaseList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test132");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass62 = purchaseList61.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test133");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.lang.String str66 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases67 = new maintaining.MaintainPurchases();
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        actions.Purchase[] purchaseArray74 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList75 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList75, purchaseArray74);
        maintainPurchases67.purchases = purchaseList75;
        maintainPurchases0.purchases = purchaseList75;
        java.lang.Class<?> wildcardClass79 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test134");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases68 = new maintaining.MaintainPurchases();
        maintainPurchases68.path = "";
        maintainPurchases68.path = "";
        maintainPurchases68.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList75 = maintainPurchases68.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList76 = maintainPurchases68.purchases;
        maintainPurchases68.path = "hi!";
        maintainPurchases68.path = "hi!";
        maintainPurchases68.path = "hi!";
        java.lang.String str83 = maintainPurchases68.path;
        java.util.ArrayList<actions.Purchase> purchaseList84 = maintainPurchases68.purchases;
        maintainPurchases0.purchases = purchaseList84;
        maintainPurchases0.path = "hi!";
        java.lang.String str88 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!" + "'", str83.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!" + "'", str88.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test135");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass13 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test136");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.lang.String str58 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass59 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test137");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.String str19 = maintainPurchases0.path;
        java.lang.String str20 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases0.purchases;
        java.lang.String str22 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test138");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass37 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test139");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray21 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList22 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList22, purchaseArray21);
        maintainPurchases20.purchases = purchaseList22;
        maintainPurchases20.path = "hi!";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str32 = maintainPurchases0.path;
        java.lang.String str33 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test140");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass63 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test141");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray12 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList13 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList13, purchaseArray12);
        maintainPurchases11.purchases = purchaseList13;
        maintainPurchases11.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases18 = new maintaining.MaintainPurchases();
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        java.lang.String str23 = maintainPurchases18.path;
        maintaining.MaintainPurchases maintainPurchases24 = new maintaining.MaintainPurchases();
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases24.purchases = purchaseList32;
        java.lang.String str35 = maintainPurchases24.path;
        java.util.ArrayList<actions.Purchase> purchaseList36 = maintainPurchases24.purchases;
        maintainPurchases18.purchases = purchaseList36;
        maintainPurchases11.purchases = purchaseList36;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList40;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test142");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList73 = maintainPurchases0.purchases;
        java.lang.String str74 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test143");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList29 = null;
        maintainPurchases0.purchases = purchaseList29;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test144");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass30 = purchaseList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test145");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test146");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases57.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintaining.MaintainPurchases maintainPurchases63 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases63.purchases;
        java.lang.String str67 = maintainPurchases63.path;
        maintainPurchases63.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases63.purchases;
        maintainPurchases0.purchases = purchaseList70;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases73 = new maintaining.MaintainPurchases();
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        actions.Purchase[] purchaseArray80 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList81 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList81, purchaseArray80);
        maintainPurchases73.purchases = purchaseList81;
        java.lang.String str84 = maintainPurchases73.path;
        maintainPurchases73.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList87 = maintainPurchases73.purchases;
        maintainPurchases0.purchases = purchaseList87;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList87);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test147");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases59 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray60 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList61 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList61, purchaseArray60);
        maintainPurchases59.purchases = purchaseList61;
        maintainPurchases59.path = "hi!";
        actions.Purchase[] purchaseArray66 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList67 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList67, purchaseArray66);
        maintainPurchases59.purchases = purchaseList67;
        maintainPurchases0.purchases = purchaseList67;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test148");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test149");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList15 = null;
        maintainPurchases0.purchases = purchaseList15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test150");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases5 = new maintaining.MaintainPurchases();
        maintainPurchases5.path = "";
        maintainPurchases5.path = "";
        java.lang.String str10 = maintainPurchases5.path;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases11.purchases;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases13.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases13.purchases;
        maintainPurchases11.purchases = purchaseList21;
        maintainPurchases5.purchases = purchaseList21;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases5.purchases;
        maintainPurchases0.purchases = purchaseList24;
        java.lang.String str26 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass27 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test151");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList9;
        maintainPurchases0.path = "hi!";
        java.lang.String str13 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test152");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass15 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test153");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList73 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList73);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test154");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases5 = new maintaining.MaintainPurchases();
        maintainPurchases5.path = "";
        maintainPurchases5.path = "";
        java.lang.String str10 = maintainPurchases5.path;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases11.purchases;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases13.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases13.purchases;
        maintainPurchases11.purchases = purchaseList21;
        maintainPurchases5.purchases = purchaseList21;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases5.purchases;
        maintainPurchases0.purchases = purchaseList24;
        maintaining.MaintainPurchases maintainPurchases26 = new maintaining.MaintainPurchases();
        maintainPurchases26.path = "";
        maintainPurchases26.path = "";
        java.lang.String str31 = maintainPurchases26.path;
        maintaining.MaintainPurchases maintainPurchases32 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases32.purchases;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases32.purchases = purchaseList42;
        maintainPurchases26.purchases = purchaseList42;
        java.util.ArrayList<actions.Purchase> purchaseList45 = maintainPurchases26.purchases;
        maintainPurchases0.purchases = purchaseList45;
        java.util.ArrayList<actions.Purchase> purchaseList47 = null;
        maintainPurchases0.purchases = purchaseList47;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(purchaseList53);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test155");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases16 = new maintaining.MaintainPurchases();
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases16.purchases;
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases16.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        java.lang.String str31 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass32 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test156");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.lang.String str66 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases67 = new maintaining.MaintainPurchases();
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        actions.Purchase[] purchaseArray74 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList75 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList75, purchaseArray74);
        maintainPurchases67.purchases = purchaseList75;
        maintainPurchases0.purchases = purchaseList75;
        maintaining.MaintainPurchases maintainPurchases79 = new maintaining.MaintainPurchases();
        maintainPurchases79.path = "";
        maintainPurchases79.path = "";
        java.lang.String str84 = maintainPurchases79.path;
        maintaining.MaintainPurchases maintainPurchases85 = new maintaining.MaintainPurchases();
        maintainPurchases85.path = "";
        maintainPurchases85.path = "";
        maintainPurchases85.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList92 = maintainPurchases85.purchases;
        maintainPurchases85.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList95 = maintainPurchases85.purchases;
        maintainPurchases79.purchases = purchaseList95;
        maintainPurchases0.purchases = purchaseList95;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList95);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test157");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str14 = maintainPurchases0.path;
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test158");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList17 = maintainPurchases14.purchases;
        maintainPurchases0.purchases = purchaseList17;
        maintainPurchases0.path = "";
        java.lang.String str21 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test159");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.lang.String str1 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass3 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test160");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray12 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList13 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList13, purchaseArray12);
        maintainPurchases11.purchases = purchaseList13;
        maintainPurchases11.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases18 = new maintaining.MaintainPurchases();
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        java.lang.String str23 = maintainPurchases18.path;
        maintaining.MaintainPurchases maintainPurchases24 = new maintaining.MaintainPurchases();
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases24.purchases = purchaseList32;
        java.lang.String str35 = maintainPurchases24.path;
        java.util.ArrayList<actions.Purchase> purchaseList36 = maintainPurchases24.purchases;
        maintainPurchases18.purchases = purchaseList36;
        maintainPurchases11.purchases = purchaseList36;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList40;
        java.lang.Class<?> wildcardClass42 = purchaseList40.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test161");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.lang.String str8 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test162");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test163");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases5 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList6 = maintainPurchases5.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases5.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases5.purchases;
        java.lang.String str9 = maintainPurchases5.path;
        maintainPurchases5.path = "";
        maintainPurchases5.path = "";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        java.util.ArrayList<actions.Purchase> purchaseList36 = maintainPurchases14.purchases;
        maintainPurchases5.purchases = purchaseList36;
        maintainPurchases0.purchases = purchaseList36;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test164");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.lang.String str58 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test165");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases16 = new maintaining.MaintainPurchases();
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases16.purchases;
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases16.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        java.lang.String str31 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test166");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray21 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList22 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList22, purchaseArray21);
        maintainPurchases20.purchases = purchaseList22;
        maintainPurchases20.path = "hi!";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str32 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test167");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test168");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        actions.Purchase[] purchaseArray10 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList11 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList11, purchaseArray10);
        maintainPurchases3.purchases = purchaseList11;
        java.lang.String str14 = maintainPurchases3.path;
        maintainPurchases3.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList17 = maintainPurchases3.purchases;
        maintaining.MaintainPurchases maintainPurchases18 = new maintaining.MaintainPurchases();
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases18.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases18.purchases;
        maintainPurchases18.path = "hi!";
        maintainPurchases18.path = "hi!";
        maintainPurchases18.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray34 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList35 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList35, purchaseArray34);
        maintainPurchases33.purchases = purchaseList35;
        maintainPurchases33.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        java.lang.String str45 = maintainPurchases40.path;
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        maintainPurchases46.path = "";
        maintainPurchases46.path = "";
        actions.Purchase[] purchaseArray53 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList54 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList54, purchaseArray53);
        maintainPurchases46.purchases = purchaseList54;
        java.lang.String str57 = maintainPurchases46.path;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases46.purchases;
        maintainPurchases40.purchases = purchaseList58;
        maintainPurchases33.purchases = purchaseList58;
        maintainPurchases18.purchases = purchaseList58;
        maintainPurchases3.purchases = purchaseList58;
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases3.purchases;
        maintainPurchases0.purchases = purchaseList64;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test169");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass11 = purchaseList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test170");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases21 = new maintaining.MaintainPurchases();
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases21.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases21.purchases;
        maintainPurchases21.path = "hi!";
        maintainPurchases21.path = "hi!";
        maintainPurchases21.path = "hi!";
        java.lang.String str36 = maintainPurchases21.path;
        java.util.ArrayList<actions.Purchase> purchaseList37 = maintainPurchases21.purchases;
        java.lang.String str38 = maintainPurchases21.path;
        java.lang.String str39 = maintainPurchases21.path;
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases40.purchases;
        maintainPurchases21.purchases = purchaseList41;
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases21.purchases;
        maintainPurchases0.purchases = purchaseList43;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test171");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintaining.MaintainPurchases maintainPurchases1 = new maintaining.MaintainPurchases();
        maintainPurchases1.path = "";
        maintainPurchases1.path = "";
        java.lang.String str6 = maintainPurchases1.path;
        maintainPurchases1.path = "";
        maintainPurchases1.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases1.purchases;
        maintainPurchases0.purchases = purchaseList11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test172");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases16 = new maintaining.MaintainPurchases();
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases16.purchases;
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases16.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        java.lang.String str31 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.lang.String str39 = maintainPurchases34.path;
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases40.purchases;
        maintaining.MaintainPurchases maintainPurchases42 = new maintaining.MaintainPurchases();
        maintainPurchases42.path = "";
        maintainPurchases42.path = "";
        maintainPurchases42.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases42.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList50 = maintainPurchases42.purchases;
        maintainPurchases40.purchases = purchaseList50;
        maintainPurchases34.purchases = purchaseList50;
        java.lang.String str53 = maintainPurchases34.path;
        java.lang.String str54 = maintainPurchases34.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases34.purchases;
        maintainPurchases0.purchases = purchaseList55;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test173");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test174");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.String str19 = maintainPurchases0.path;
        java.lang.String str20 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases21 = new maintaining.MaintainPurchases();
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases21.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases21.purchases;
        maintainPurchases21.path = "hi!";
        maintainPurchases21.path = "hi!";
        maintainPurchases21.path = "hi!";
        java.lang.String str36 = maintainPurchases21.path;
        maintainPurchases21.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases21.purchases;
        maintainPurchases0.purchases = purchaseList39;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test175");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        java.lang.String str60 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test176");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        java.lang.String str56 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases58 = new maintaining.MaintainPurchases();
        maintainPurchases58.path = "";
        maintainPurchases58.path = "";
        java.lang.String str63 = maintainPurchases58.path;
        maintaining.MaintainPurchases maintainPurchases64 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases64.purchases;
        maintaining.MaintainPurchases maintainPurchases66 = new maintaining.MaintainPurchases();
        maintainPurchases66.path = "";
        maintainPurchases66.path = "";
        maintainPurchases66.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList73 = maintainPurchases66.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList74 = maintainPurchases66.purchases;
        maintainPurchases64.purchases = purchaseList74;
        maintainPurchases58.purchases = purchaseList74;
        java.lang.String str77 = maintainPurchases58.path;
        java.lang.String str78 = maintainPurchases58.path;
        java.util.ArrayList<actions.Purchase> purchaseList79 = maintainPurchases58.purchases;
        maintainPurchases0.purchases = purchaseList79;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList79);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test177");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str13 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases36.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases36.purchases;
        maintainPurchases14.purchases = purchaseList44;
        maintainPurchases0.purchases = purchaseList44;
        java.lang.Class<?> wildcardClass47 = purchaseList44.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test178");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.String str12 = maintainPurchases0.path;
        java.lang.String str13 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test179");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test180");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintainPurchases3.path = "hi!";
        maintainPurchases3.path = "hi!";
        java.lang.String str18 = maintainPurchases3.path;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases3.purchases;
        java.lang.String str20 = maintainPurchases3.path;
        java.lang.String str21 = maintainPurchases3.path;
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases22.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases22.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases22.purchases;
        maintainPurchases3.purchases = purchaseList31;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        maintainPurchases33.path = "";
        maintainPurchases33.path = "";
        java.lang.String str38 = maintainPurchases33.path;
        maintaining.MaintainPurchases maintainPurchases39 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases39.purchases;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList48 = maintainPurchases41.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases41.purchases;
        maintainPurchases39.purchases = purchaseList49;
        maintainPurchases33.purchases = purchaseList49;
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases33.purchases;
        maintaining.MaintainPurchases maintainPurchases53 = new maintaining.MaintainPurchases();
        maintainPurchases53.path = "";
        maintainPurchases53.path = "";
        maintainPurchases53.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases53.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases53.purchases;
        maintainPurchases53.path = "hi!";
        maintainPurchases53.path = "hi!";
        maintainPurchases53.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases68 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray69 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList70 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList70, purchaseArray69);
        maintainPurchases68.purchases = purchaseList70;
        maintainPurchases68.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases75 = new maintaining.MaintainPurchases();
        maintainPurchases75.path = "";
        maintainPurchases75.path = "";
        java.lang.String str80 = maintainPurchases75.path;
        maintaining.MaintainPurchases maintainPurchases81 = new maintaining.MaintainPurchases();
        maintainPurchases81.path = "";
        maintainPurchases81.path = "";
        maintainPurchases81.path = "";
        actions.Purchase[] purchaseArray88 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList89 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList89, purchaseArray88);
        maintainPurchases81.purchases = purchaseList89;
        java.lang.String str92 = maintainPurchases81.path;
        java.util.ArrayList<actions.Purchase> purchaseList93 = maintainPurchases81.purchases;
        maintainPurchases75.purchases = purchaseList93;
        maintainPurchases68.purchases = purchaseList93;
        maintainPurchases53.purchases = purchaseList93;
        maintainPurchases33.purchases = purchaseList93;
        maintainPurchases3.purchases = purchaseList93;
        maintainPurchases0.purchases = purchaseList93;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList93);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test181");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test182");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.lang.String str16 = maintainPurchases11.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases17.purchases;
        maintainPurchases11.purchases = purchaseList29;
        maintaining.MaintainPurchases maintainPurchases31 = new maintaining.MaintainPurchases();
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        maintainPurchases31.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases31.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases31.purchases;
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintainPurchases31.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases46.purchases;
        maintainPurchases31.purchases = purchaseList49;
        maintainPurchases11.purchases = purchaseList49;
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        maintainPurchases52.path = "";
        actions.Purchase[] purchaseArray59 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList60 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList60, purchaseArray59);
        maintainPurchases52.purchases = purchaseList60;
        java.lang.String str63 = maintainPurchases52.path;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases52.purchases;
        maintainPurchases11.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList66;
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases0.purchases;
        java.lang.String str69 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test183");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass26 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test184");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases0.purchases = purchaseList32;
        java.lang.String str34 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test185");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test186");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases0.purchases;
        java.lang.String str59 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test187");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.String str14 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test188");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test189");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.lang.String str20 = maintainPurchases15.path;
        maintaining.MaintainPurchases maintainPurchases21 = new maintaining.MaintainPurchases();
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        actions.Purchase[] purchaseArray28 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList29 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList29, purchaseArray28);
        maintainPurchases21.purchases = purchaseList29;
        java.lang.String str32 = maintainPurchases21.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases21.purchases;
        maintainPurchases15.purchases = purchaseList33;
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        maintainPurchases35.path = "";
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases35.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases35.purchases;
        maintainPurchases35.path = "hi!";
        maintainPurchases35.path = "hi!";
        maintainPurchases35.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases50 = new maintaining.MaintainPurchases();
        maintainPurchases50.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases50.purchases;
        maintainPurchases35.purchases = purchaseList53;
        maintainPurchases15.purchases = purchaseList53;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        actions.Purchase[] purchaseArray63 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList64 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList64, purchaseArray63);
        maintainPurchases56.purchases = purchaseList64;
        java.lang.String str67 = maintainPurchases56.path;
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases56.purchases;
        maintainPurchases15.purchases = purchaseList68;
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases15.purchases;
        maintaining.MaintainPurchases maintainPurchases71 = new maintaining.MaintainPurchases();
        maintainPurchases71.path = "";
        maintainPurchases71.path = "";
        maintainPurchases71.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList78 = maintainPurchases71.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList79 = maintainPurchases71.purchases;
        maintainPurchases15.purchases = purchaseList79;
        java.lang.String str81 = maintainPurchases15.path;
        maintaining.MaintainPurchases maintainPurchases82 = new maintaining.MaintainPurchases();
        maintainPurchases82.path = "";
        maintainPurchases82.path = "";
        maintainPurchases82.path = "";
        actions.Purchase[] purchaseArray89 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList90 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList90, purchaseArray89);
        maintainPurchases82.purchases = purchaseList90;
        maintainPurchases15.purchases = purchaseList90;
        maintainPurchases0.purchases = purchaseList90;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test190");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray21 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList22 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList22, purchaseArray21);
        maintainPurchases20.purchases = purchaseList22;
        maintainPurchases20.path = "hi!";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str32 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass33 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test191");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        java.util.ArrayList<actions.Purchase> purchaseList5 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases8.path = "hi!";
        maintainPurchases8.path = "hi!";
        maintainPurchases8.path = "hi!";
        java.lang.String str23 = maintainPurchases8.path;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases8.purchases;
        maintainPurchases0.purchases = purchaseList24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test192");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList12 = null;
        maintainPurchases0.purchases = purchaseList12;
        java.lang.String str14 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test193");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        java.lang.String str60 = maintainPurchases55.path;
        maintaining.MaintainPurchases maintainPurchases61 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases61.purchases;
        maintaining.MaintainPurchases maintainPurchases63 = new maintaining.MaintainPurchases();
        maintainPurchases63.path = "";
        maintainPurchases63.path = "";
        maintainPurchases63.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList71 = maintainPurchases63.purchases;
        maintainPurchases61.purchases = purchaseList71;
        maintainPurchases55.purchases = purchaseList71;
        maintainPurchases0.purchases = purchaseList71;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList71);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test194");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray36 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList37 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList37, purchaseArray36);
        maintainPurchases35.purchases = purchaseList37;
        maintainPurchases35.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases42 = new maintaining.MaintainPurchases();
        maintainPurchases42.path = "";
        maintainPurchases42.path = "";
        java.lang.String str47 = maintainPurchases42.path;
        maintaining.MaintainPurchases maintainPurchases48 = new maintaining.MaintainPurchases();
        maintainPurchases48.path = "";
        maintainPurchases48.path = "";
        maintainPurchases48.path = "";
        actions.Purchase[] purchaseArray55 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList56 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList56, purchaseArray55);
        maintainPurchases48.purchases = purchaseList56;
        java.lang.String str59 = maintainPurchases48.path;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases48.purchases;
        maintainPurchases42.purchases = purchaseList60;
        maintainPurchases35.purchases = purchaseList60;
        maintainPurchases20.purchases = purchaseList60;
        maintainPurchases0.purchases = purchaseList60;
        maintainPurchases0.path = "";
        java.lang.String str67 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test195");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.String str12 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass14 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test196");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases57.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintaining.MaintainPurchases maintainPurchases63 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases63.purchases;
        java.lang.String str67 = maintainPurchases63.path;
        maintainPurchases63.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases63.purchases;
        maintainPurchases0.purchases = purchaseList70;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases0.purchases;
        java.lang.String str73 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test197");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray36 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList37 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList37, purchaseArray36);
        maintainPurchases35.purchases = purchaseList37;
        maintainPurchases35.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases42 = new maintaining.MaintainPurchases();
        maintainPurchases42.path = "";
        maintainPurchases42.path = "";
        java.lang.String str47 = maintainPurchases42.path;
        maintaining.MaintainPurchases maintainPurchases48 = new maintaining.MaintainPurchases();
        maintainPurchases48.path = "";
        maintainPurchases48.path = "";
        maintainPurchases48.path = "";
        actions.Purchase[] purchaseArray55 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList56 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList56, purchaseArray55);
        maintainPurchases48.purchases = purchaseList56;
        java.lang.String str59 = maintainPurchases48.path;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases48.purchases;
        maintainPurchases42.purchases = purchaseList60;
        maintainPurchases35.purchases = purchaseList60;
        maintainPurchases20.purchases = purchaseList60;
        maintainPurchases0.purchases = purchaseList60;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test198");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases16 = new maintaining.MaintainPurchases();
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases16.purchases;
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases16.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        java.lang.String str31 = maintainPurchases0.path;
        java.lang.String str32 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray34 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList35 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList35, purchaseArray34);
        maintainPurchases33.purchases = purchaseList35;
        maintainPurchases33.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        java.lang.String str45 = maintainPurchases40.path;
        maintaining.MaintainPurchases maintainPurchases46 = new maintaining.MaintainPurchases();
        maintainPurchases46.path = "";
        maintainPurchases46.path = "";
        maintainPurchases46.path = "";
        actions.Purchase[] purchaseArray53 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList54 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList54, purchaseArray53);
        maintainPurchases46.purchases = purchaseList54;
        java.lang.String str57 = maintainPurchases46.path;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases46.purchases;
        maintainPurchases40.purchases = purchaseList58;
        maintainPurchases33.purchases = purchaseList58;
        java.lang.String str61 = maintainPurchases33.path;
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases33.purchases;
        maintainPurchases0.purchases = purchaseList62;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test199");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test200");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.lang.String str1 = maintainPurchases0.path;
        actions.Purchase[] purchaseArray2 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList3 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList3, purchaseArray2);
        maintainPurchases0.purchases = purchaseList3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test201");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str13 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases36.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases36.purchases;
        maintainPurchases14.purchases = purchaseList44;
        maintainPurchases0.purchases = purchaseList44;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList49 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList49);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test202");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        maintaining.MaintainPurchases maintainPurchases32 = new maintaining.MaintainPurchases();
        maintainPurchases32.path = "";
        maintainPurchases32.path = "";
        maintainPurchases32.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases32.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases32.purchases;
        maintainPurchases32.path = "hi!";
        maintainPurchases32.path = "hi!";
        maintainPurchases32.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases47 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases47.purchases = purchaseList49;
        maintainPurchases47.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases54 = new maintaining.MaintainPurchases();
        maintainPurchases54.path = "";
        maintainPurchases54.path = "";
        java.lang.String str59 = maintainPurchases54.path;
        maintaining.MaintainPurchases maintainPurchases60 = new maintaining.MaintainPurchases();
        maintainPurchases60.path = "";
        maintainPurchases60.path = "";
        maintainPurchases60.path = "";
        actions.Purchase[] purchaseArray67 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList68 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList68, purchaseArray67);
        maintainPurchases60.purchases = purchaseList68;
        java.lang.String str71 = maintainPurchases60.path;
        java.util.ArrayList<actions.Purchase> purchaseList72 = maintainPurchases60.purchases;
        maintainPurchases54.purchases = purchaseList72;
        maintainPurchases47.purchases = purchaseList72;
        maintainPurchases32.purchases = purchaseList72;
        maintainPurchases17.purchases = purchaseList72;
        maintainPurchases0.purchases = purchaseList72;
        java.lang.String str78 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test203");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList12 = null;
        maintainPurchases0.purchases = purchaseList12;
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(purchaseList14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test204");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases18 = new maintaining.MaintainPurchases();
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        maintainPurchases18.path = "";
        actions.Purchase[] purchaseArray25 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList26 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList26, purchaseArray25);
        maintainPurchases18.purchases = purchaseList26;
        java.lang.String str29 = maintainPurchases18.path;
        maintainPurchases18.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases18.purchases;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        maintainPurchases33.path = "";
        maintainPurchases33.path = "";
        maintainPurchases33.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList40 = maintainPurchases33.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases33.purchases;
        maintainPurchases33.path = "hi!";
        maintainPurchases33.path = "hi!";
        maintainPurchases33.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases48 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray49 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList50 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList50, purchaseArray49);
        maintainPurchases48.purchases = purchaseList50;
        maintainPurchases48.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        java.lang.String str60 = maintainPurchases55.path;
        maintaining.MaintainPurchases maintainPurchases61 = new maintaining.MaintainPurchases();
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        maintainPurchases61.path = "";
        actions.Purchase[] purchaseArray68 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList69 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList69, purchaseArray68);
        maintainPurchases61.purchases = purchaseList69;
        java.lang.String str72 = maintainPurchases61.path;
        java.util.ArrayList<actions.Purchase> purchaseList73 = maintainPurchases61.purchases;
        maintainPurchases55.purchases = purchaseList73;
        maintainPurchases48.purchases = purchaseList73;
        maintainPurchases33.purchases = purchaseList73;
        maintainPurchases18.purchases = purchaseList73;
        java.util.ArrayList<actions.Purchase> purchaseList78 = maintainPurchases18.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList79 = maintainPurchases18.purchases;
        maintainPurchases0.purchases = purchaseList79;
        java.util.ArrayList<actions.Purchase> purchaseList81 = maintainPurchases0.purchases;
        java.lang.String str82 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test205");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        java.lang.String str60 = maintainPurchases55.path;
        maintaining.MaintainPurchases maintainPurchases61 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases61.purchases;
        maintaining.MaintainPurchases maintainPurchases63 = new maintaining.MaintainPurchases();
        maintainPurchases63.path = "";
        maintainPurchases63.path = "";
        maintainPurchases63.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList71 = maintainPurchases63.purchases;
        maintainPurchases61.purchases = purchaseList71;
        maintainPurchases55.purchases = purchaseList71;
        maintainPurchases0.purchases = purchaseList71;
        java.lang.String str75 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test206");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList5 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases0.purchases = purchaseList16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test207");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases37.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList45 = maintainPurchases37.purchases;
        maintainPurchases37.path = "hi!";
        maintainPurchases37.path = "hi!";
        maintainPurchases37.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        maintainPurchases52.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases52.purchases;
        maintainPurchases37.purchases = purchaseList55;
        java.lang.String str57 = maintainPurchases37.path;
        maintainPurchases37.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases37.purchases;
        maintainPurchases0.purchases = purchaseList60;
        java.util.ArrayList<actions.Purchase> purchaseList62 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList62);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test208");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str25 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.lang.Class<?> wildcardClass30 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test209");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str25 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass26 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test210");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.lang.String str14 = maintainPurchases0.path;
        java.lang.String str15 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test211");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList18;
        java.lang.String str20 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.lang.String str23 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test212");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = null;
        maintainPurchases0.purchases = purchaseList16;
        maintainPurchases0.path = "";
        java.lang.String str20 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases22 = new maintaining.MaintainPurchases();
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        maintainPurchases22.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases22.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases22.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases22.purchases;
        maintainPurchases22.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases22.purchases;
        java.lang.String str35 = maintainPurchases22.path;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases36.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases36.purchases;
        maintainPurchases36.path = "hi!";
        maintainPurchases36.path = "hi!";
        maintainPurchases36.path = "hi!";
        java.lang.String str51 = maintainPurchases36.path;
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases36.purchases;
        java.lang.String str53 = maintainPurchases36.path;
        java.lang.String str54 = maintainPurchases36.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases36.purchases;
        maintainPurchases22.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test213");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass11 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test214");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        java.lang.String str57 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases58 = new maintaining.MaintainPurchases();
        maintainPurchases58.path = "";
        maintainPurchases58.path = "";
        maintainPurchases58.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases58.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases58.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases58.purchases;
        maintainPurchases0.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test215");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.String str19 = maintainPurchases0.path;
        java.lang.String str20 = maintainPurchases0.path;
        java.lang.Class<?> wildcardClass21 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test216");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases12 = new maintaining.MaintainPurchases();
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        actions.Purchase[] purchaseArray19 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList20 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList20, purchaseArray19);
        maintainPurchases12.purchases = purchaseList20;
        maintaining.MaintainPurchases maintainPurchases23 = new maintaining.MaintainPurchases();
        maintainPurchases23.path = "";
        maintainPurchases23.path = "";
        maintainPurchases23.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases23.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases23.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases23.purchases;
        maintainPurchases12.purchases = purchaseList32;
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases12.purchases;
        maintainPurchases0.purchases = purchaseList34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test217");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases0.purchases;
        java.lang.String str29 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        maintainPurchases30.path = "";
        maintainPurchases30.path = "";
        java.lang.String str35 = maintainPurchases30.path;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        actions.Purchase[] purchaseArray43 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList44 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList44, purchaseArray43);
        maintainPurchases36.purchases = purchaseList44;
        java.lang.String str47 = maintainPurchases36.path;
        java.util.ArrayList<actions.Purchase> purchaseList48 = maintainPurchases36.purchases;
        maintainPurchases30.purchases = purchaseList48;
        maintaining.MaintainPurchases maintainPurchases50 = new maintaining.MaintainPurchases();
        maintainPurchases50.path = "";
        maintainPurchases50.path = "";
        maintainPurchases50.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases50.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases50.purchases;
        maintainPurchases50.path = "hi!";
        maintainPurchases50.path = "hi!";
        maintainPurchases50.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases65 = new maintaining.MaintainPurchases();
        maintainPurchases65.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList68 = maintainPurchases65.purchases;
        maintainPurchases50.purchases = purchaseList68;
        maintainPurchases30.purchases = purchaseList68;
        maintaining.MaintainPurchases maintainPurchases71 = new maintaining.MaintainPurchases();
        maintainPurchases71.path = "";
        maintainPurchases71.path = "";
        maintainPurchases71.path = "";
        actions.Purchase[] purchaseArray78 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList79 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList79, purchaseArray78);
        maintainPurchases71.purchases = purchaseList79;
        java.lang.String str82 = maintainPurchases71.path;
        java.util.ArrayList<actions.Purchase> purchaseList83 = maintainPurchases71.purchases;
        maintainPurchases30.purchases = purchaseList83;
        java.util.ArrayList<actions.Purchase> purchaseList85 = maintainPurchases30.purchases;
        java.lang.String str86 = maintainPurchases30.path;
        java.util.ArrayList<actions.Purchase> purchaseList87 = maintainPurchases30.purchases;
        maintainPurchases0.purchases = purchaseList87;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "" + "'", str82.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList87);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test218");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases17.purchases;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases19.purchases;
        maintainPurchases17.purchases = purchaseList27;
        maintainPurchases0.purchases = purchaseList27;
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases30.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases30.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases30.purchases;
        java.lang.String str34 = maintainPurchases30.path;
        maintainPurchases30.path = "";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases37.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList45 = maintainPurchases37.purchases;
        maintainPurchases37.path = "hi!";
        maintainPurchases37.path = "hi!";
        maintainPurchases37.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases52 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray53 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList54 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList54, purchaseArray53);
        maintainPurchases52.purchases = purchaseList54;
        maintainPurchases52.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases59 = new maintaining.MaintainPurchases();
        maintainPurchases59.path = "";
        maintainPurchases59.path = "";
        java.lang.String str64 = maintainPurchases59.path;
        maintaining.MaintainPurchases maintainPurchases65 = new maintaining.MaintainPurchases();
        maintainPurchases65.path = "";
        maintainPurchases65.path = "";
        maintainPurchases65.path = "";
        actions.Purchase[] purchaseArray72 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList73 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList73, purchaseArray72);
        maintainPurchases65.purchases = purchaseList73;
        java.lang.String str76 = maintainPurchases65.path;
        java.util.ArrayList<actions.Purchase> purchaseList77 = maintainPurchases65.purchases;
        maintainPurchases59.purchases = purchaseList77;
        maintainPurchases52.purchases = purchaseList77;
        maintainPurchases37.purchases = purchaseList77;
        maintainPurchases30.purchases = purchaseList77;
        maintainPurchases0.purchases = purchaseList77;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList77);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test219");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str7 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.lang.Class<?> wildcardClass9 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test220");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        java.lang.String str7 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test221");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        java.lang.Class<?> wildcardClass5 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test222");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str13 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases36.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases36.purchases;
        maintainPurchases14.purchases = purchaseList44;
        maintainPurchases0.purchases = purchaseList44;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test223");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases12 = new maintaining.MaintainPurchases();
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases12.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases12.purchases;
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases27 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray28 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList29 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList29, purchaseArray28);
        maintainPurchases27.purchases = purchaseList29;
        maintainPurchases27.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.lang.String str39 = maintainPurchases34.path;
        maintaining.MaintainPurchases maintainPurchases40 = new maintaining.MaintainPurchases();
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        maintainPurchases40.path = "";
        actions.Purchase[] purchaseArray47 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList48 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList48, purchaseArray47);
        maintainPurchases40.purchases = purchaseList48;
        java.lang.String str51 = maintainPurchases40.path;
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases40.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases27.purchases = purchaseList52;
        maintainPurchases12.purchases = purchaseList52;
        maintainPurchases0.purchases = purchaseList52;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test224");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases56.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList64;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test225");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases6.purchases;
        maintainPurchases6.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList16;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test226");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        maintainPurchases0.path = "";
        java.lang.String str57 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases58 = new maintaining.MaintainPurchases();
        maintainPurchases58.path = "";
        maintainPurchases58.path = "";
        maintainPurchases58.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases58.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases58.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases58.purchases;
        maintainPurchases0.purchases = purchaseList67;
        maintainPurchases0.path = "";
        java.lang.String str71 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test227");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test228");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        java.lang.String str15 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test229");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases57.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test230");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test231");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList4 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test232");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList60 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases57.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintaining.MaintainPurchases maintainPurchases63 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases63.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases63.purchases;
        java.lang.String str67 = maintainPurchases63.path;
        maintainPurchases63.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList70 = maintainPurchases63.purchases;
        maintainPurchases0.purchases = purchaseList70;
        java.util.ArrayList<actions.Purchase> purchaseList72 = null;
        maintainPurchases0.purchases = purchaseList72;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList70);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test233");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.lang.String str12 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList13 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        java.util.ArrayList<actions.Purchase> purchaseList36 = maintainPurchases14.purchases;
        maintainPurchases0.purchases = purchaseList36;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test234");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.lang.String str1 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.lang.String str7 = maintainPurchases2.path;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases8.purchases;
        maintaining.MaintainPurchases maintainPurchases10 = new maintaining.MaintainPurchases();
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList17 = maintainPurchases10.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases10.purchases;
        maintainPurchases8.purchases = purchaseList18;
        maintainPurchases2.purchases = purchaseList18;
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList21;
        java.lang.String str23 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test235");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test236");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases6.purchases;
        maintaining.MaintainPurchases maintainPurchases8 = new maintaining.MaintainPurchases();
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        maintainPurchases8.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList15 = maintainPurchases8.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases8.purchases;
        maintainPurchases6.purchases = purchaseList16;
        maintainPurchases0.purchases = purchaseList16;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test237");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList56 = maintainPurchases0.purchases;
        java.lang.String str57 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList58 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases59 = new maintaining.MaintainPurchases();
        maintainPurchases59.path = "";
        maintainPurchases59.path = "";
        java.lang.String str64 = maintainPurchases59.path;
        maintaining.MaintainPurchases maintainPurchases65 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList66 = maintainPurchases65.purchases;
        maintaining.MaintainPurchases maintainPurchases67 = new maintaining.MaintainPurchases();
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        maintainPurchases67.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList74 = maintainPurchases67.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList75 = maintainPurchases67.purchases;
        maintainPurchases65.purchases = purchaseList75;
        maintainPurchases59.purchases = purchaseList75;
        maintainPurchases59.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases80 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList81 = maintainPurchases80.purchases;
        maintaining.MaintainPurchases maintainPurchases82 = new maintaining.MaintainPurchases();
        maintainPurchases82.path = "";
        maintainPurchases82.path = "";
        maintainPurchases82.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList89 = maintainPurchases82.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList90 = maintainPurchases82.purchases;
        maintainPurchases80.purchases = purchaseList90;
        maintainPurchases59.purchases = purchaseList90;
        maintainPurchases0.purchases = purchaseList90;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList90);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test238");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        java.lang.String str18 = maintainPurchases13.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintaining.MaintainPurchases maintainPurchases21 = new maintaining.MaintainPurchases();
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        maintainPurchases21.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases21.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases21.purchases;
        maintainPurchases19.purchases = purchaseList29;
        maintainPurchases13.purchases = purchaseList29;
        maintainPurchases13.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList35 = maintainPurchases34.purchases;
        maintaining.MaintainPurchases maintainPurchases36 = new maintaining.MaintainPurchases();
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        maintainPurchases36.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases36.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList44 = maintainPurchases36.purchases;
        maintainPurchases34.purchases = purchaseList44;
        maintainPurchases13.purchases = purchaseList44;
        maintainPurchases0.purchases = purchaseList44;
        java.lang.Class<?> wildcardClass48 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test239");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test240");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        java.lang.String str13 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases14.purchases;
        maintainPurchases0.purchases = purchaseList33;
        java.lang.Class<?> wildcardClass35 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test241");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test242");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.lang.String str2 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases3 = new maintaining.MaintainPurchases();
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        maintainPurchases3.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases3.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases3.purchases;
        maintainPurchases3.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.lang.String str19 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        actions.Purchase[] purchaseArray27 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList28 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList28, purchaseArray27);
        maintainPurchases20.purchases = purchaseList28;
        java.lang.String str31 = maintainPurchases20.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases20.purchases;
        maintainPurchases14.purchases = purchaseList32;
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        maintainPurchases34.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList41 = maintainPurchases34.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases34.purchases;
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases49 = new maintaining.MaintainPurchases();
        maintainPurchases49.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList52 = maintainPurchases49.purchases;
        maintainPurchases34.purchases = purchaseList52;
        maintainPurchases14.purchases = purchaseList52;
        maintaining.MaintainPurchases maintainPurchases55 = new maintaining.MaintainPurchases();
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        maintainPurchases55.path = "";
        actions.Purchase[] purchaseArray62 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList63 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList63, purchaseArray62);
        maintainPurchases55.purchases = purchaseList63;
        java.lang.String str66 = maintainPurchases55.path;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases55.purchases;
        maintainPurchases14.purchases = purchaseList67;
        java.util.ArrayList<actions.Purchase> purchaseList69 = maintainPurchases14.purchases;
        maintainPurchases3.purchases = purchaseList69;
        maintainPurchases0.purchases = purchaseList69;
        java.lang.String str72 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases73 = new maintaining.MaintainPurchases();
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        maintainPurchases73.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList80 = maintainPurchases73.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList81 = maintainPurchases73.purchases;
        maintainPurchases73.path = "hi!";
        maintainPurchases73.path = "hi!";
        maintainPurchases73.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases88 = new maintaining.MaintainPurchases();
        maintainPurchases88.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList91 = maintainPurchases88.purchases;
        maintainPurchases73.purchases = purchaseList91;
        maintainPurchases0.purchases = purchaseList91;
        java.util.ArrayList<actions.Purchase> purchaseList94 = maintainPurchases0.purchases;
        java.lang.String str95 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test243");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        java.lang.String str35 = maintainPurchases20.path;
        java.lang.String str36 = maintainPurchases20.path;
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        actions.Purchase[] purchaseArray44 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList45 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList45, purchaseArray44);
        maintainPurchases37.purchases = purchaseList45;
        java.lang.String str48 = maintainPurchases37.path;
        maintainPurchases37.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList51 = maintainPurchases37.purchases;
        java.lang.String str52 = maintainPurchases37.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases37.purchases;
        maintainPurchases20.purchases = purchaseList53;
        maintainPurchases20.path = "";
        maintaining.MaintainPurchases maintainPurchases57 = new maintaining.MaintainPurchases();
        maintainPurchases57.path = "";
        maintainPurchases57.path = "";
        maintainPurchases57.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList64 = maintainPurchases57.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList65 = maintainPurchases57.purchases;
        maintainPurchases57.path = "hi!";
        maintainPurchases57.path = "hi!";
        maintainPurchases57.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases72 = new maintaining.MaintainPurchases();
        maintainPurchases72.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList75 = maintainPurchases72.purchases;
        maintainPurchases57.purchases = purchaseList75;
        java.lang.String str77 = maintainPurchases57.path;
        maintainPurchases57.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList80 = maintainPurchases57.purchases;
        maintainPurchases20.purchases = purchaseList80;
        maintainPurchases0.purchases = purchaseList80;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList80);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test244");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases16 = new maintaining.MaintainPurchases();
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList24 = maintainPurchases16.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases16.purchases;
        maintainPurchases16.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases16.purchases;
        maintainPurchases0.purchases = purchaseList28;
        java.lang.String str30 = maintainPurchases0.path;
        java.lang.String str31 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test245");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test246");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases0.purchases;
        java.lang.String str17 = maintainPurchases0.path;
        java.lang.String str18 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases19.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test247");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.util.ArrayList<actions.Purchase> purchaseList16 = null;
        maintainPurchases0.purchases = purchaseList16;
        java.lang.Class<?> wildcardClass18 = maintainPurchases0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test248");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases4 = new maintaining.MaintainPurchases();
        maintainPurchases4.path = "";
        maintainPurchases4.path = "";
        java.lang.String str9 = maintainPurchases4.path;
        maintaining.MaintainPurchases maintainPurchases10 = new maintaining.MaintainPurchases();
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        maintainPurchases10.path = "";
        actions.Purchase[] purchaseArray17 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList18 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList18, purchaseArray17);
        maintainPurchases10.purchases = purchaseList18;
        java.lang.String str21 = maintainPurchases10.path;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases10.purchases;
        maintainPurchases4.purchases = purchaseList22;
        maintaining.MaintainPurchases maintainPurchases24 = new maintaining.MaintainPurchases();
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        maintainPurchases24.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases24.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList32 = maintainPurchases24.purchases;
        maintainPurchases24.path = "hi!";
        maintainPurchases24.path = "hi!";
        maintainPurchases24.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases39 = new maintaining.MaintainPurchases();
        maintainPurchases39.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList42 = maintainPurchases39.purchases;
        maintainPurchases24.purchases = purchaseList42;
        maintainPurchases4.purchases = purchaseList42;
        maintaining.MaintainPurchases maintainPurchases45 = new maintaining.MaintainPurchases();
        maintainPurchases45.path = "";
        maintainPurchases45.path = "";
        maintainPurchases45.path = "";
        actions.Purchase[] purchaseArray52 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList53 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList53, purchaseArray52);
        maintainPurchases45.purchases = purchaseList53;
        java.lang.String str56 = maintainPurchases45.path;
        java.util.ArrayList<actions.Purchase> purchaseList57 = maintainPurchases45.purchases;
        maintainPurchases4.purchases = purchaseList57;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases4.purchases;
        java.lang.String str60 = maintainPurchases4.path;
        java.util.ArrayList<actions.Purchase> purchaseList61 = maintainPurchases4.purchases;
        maintainPurchases0.purchases = purchaseList61;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList61);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test249");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        java.lang.String str15 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test250");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.lang.String str3 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases4 = new maintaining.MaintainPurchases();
        maintainPurchases4.path = "";
        maintainPurchases4.path = "";
        maintainPurchases4.path = "";
        actions.Purchase[] purchaseArray11 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList12 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList12, purchaseArray11);
        maintainPurchases4.purchases = purchaseList12;
        java.lang.String str15 = maintainPurchases4.path;
        maintainPurchases4.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases4.purchases;
        maintaining.MaintainPurchases maintainPurchases19 = new maintaining.MaintainPurchases();
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        maintainPurchases19.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases19.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases19.purchases;
        maintainPurchases19.path = "hi!";
        maintainPurchases19.path = "hi!";
        maintainPurchases19.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases34 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray35 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList36 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList36, purchaseArray35);
        maintainPurchases34.purchases = purchaseList36;
        maintainPurchases34.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        java.lang.String str46 = maintainPurchases41.path;
        maintaining.MaintainPurchases maintainPurchases47 = new maintaining.MaintainPurchases();
        maintainPurchases47.path = "";
        maintainPurchases47.path = "";
        maintainPurchases47.path = "";
        actions.Purchase[] purchaseArray54 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList55 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList55, purchaseArray54);
        maintainPurchases47.purchases = purchaseList55;
        java.lang.String str58 = maintainPurchases47.path;
        java.util.ArrayList<actions.Purchase> purchaseList59 = maintainPurchases47.purchases;
        maintainPurchases41.purchases = purchaseList59;
        maintainPurchases34.purchases = purchaseList59;
        maintainPurchases19.purchases = purchaseList59;
        maintainPurchases4.purchases = purchaseList59;
        maintainPurchases0.purchases = purchaseList59;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList59);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test251");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        java.lang.String str16 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases17 = new maintaining.MaintainPurchases();
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        maintainPurchases17.path = "";
        actions.Purchase[] purchaseArray24 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList25 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList25, purchaseArray24);
        maintainPurchases17.purchases = purchaseList25;
        java.lang.String str28 = maintainPurchases17.path;
        maintainPurchases17.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases17.purchases;
        java.lang.String str32 = maintainPurchases17.path;
        java.util.ArrayList<actions.Purchase> purchaseList33 = maintainPurchases17.purchases;
        maintainPurchases0.purchases = purchaseList33;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList39 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList39);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test252");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList2 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList11 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases12 = new maintaining.MaintainPurchases();
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        maintainPurchases12.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases12.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases12.purchases;
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        maintainPurchases12.path = "hi!";
        java.lang.String str27 = maintainPurchases12.path;
        java.lang.String str28 = maintainPurchases12.path;
        maintaining.MaintainPurchases maintainPurchases29 = new maintaining.MaintainPurchases();
        maintainPurchases29.path = "";
        maintainPurchases29.path = "";
        maintainPurchases29.path = "";
        actions.Purchase[] purchaseArray36 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList37 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList37, purchaseArray36);
        maintainPurchases29.purchases = purchaseList37;
        java.lang.String str40 = maintainPurchases29.path;
        maintainPurchases29.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList43 = maintainPurchases29.purchases;
        java.lang.String str44 = maintainPurchases29.path;
        java.util.ArrayList<actions.Purchase> purchaseList45 = maintainPurchases29.purchases;
        maintainPurchases12.purchases = purchaseList45;
        maintainPurchases0.purchases = purchaseList45;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList45);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test253");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList3 = maintainPurchases0.purchases;
        java.lang.String str4 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test254");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases5 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList6 = maintainPurchases5.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases5.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases5.purchases;
        java.lang.String str9 = maintainPurchases5.path;
        maintainPurchases5.path = "";
        maintainPurchases5.path = "";
        maintaining.MaintainPurchases maintainPurchases14 = new maintaining.MaintainPurchases();
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        maintainPurchases14.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList21 = maintainPurchases14.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases14.purchases;
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        maintainPurchases14.path = "hi!";
        java.lang.String str29 = maintainPurchases14.path;
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases14.purchases;
        java.lang.String str31 = maintainPurchases14.path;
        java.lang.String str32 = maintainPurchases14.path;
        maintaining.MaintainPurchases maintainPurchases33 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList34 = maintainPurchases33.purchases;
        maintainPurchases14.purchases = purchaseList34;
        java.util.ArrayList<actions.Purchase> purchaseList36 = maintainPurchases14.purchases;
        maintainPurchases5.purchases = purchaseList36;
        maintainPurchases0.purchases = purchaseList36;
        java.lang.Class<?> wildcardClass39 = purchaseList36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test255");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray1 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList2 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList2, purchaseArray1);
        maintainPurchases0.purchases = purchaseList2;
        maintainPurchases0.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases7 = new maintaining.MaintainPurchases();
        maintainPurchases7.path = "";
        maintainPurchases7.path = "";
        java.lang.String str12 = maintainPurchases7.path;
        maintaining.MaintainPurchases maintainPurchases13 = new maintaining.MaintainPurchases();
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        maintainPurchases13.path = "";
        actions.Purchase[] purchaseArray20 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList21 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList21, purchaseArray20);
        maintainPurchases13.purchases = purchaseList21;
        java.lang.String str24 = maintainPurchases13.path;
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases13.purchases;
        maintainPurchases7.purchases = purchaseList25;
        maintainPurchases0.purchases = purchaseList25;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList29 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList29);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test256");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList16 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList17 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test257");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test258");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        maintaining.MaintainPurchases maintainPurchases11 = new maintaining.MaintainPurchases();
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        maintainPurchases11.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList19 = maintainPurchases11.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList20 = maintainPurchases11.purchases;
        maintainPurchases0.purchases = purchaseList20;
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases23 = new maintaining.MaintainPurchases();
        maintainPurchases23.path = "";
        maintainPurchases23.path = "";
        maintainPurchases23.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList30 = maintainPurchases23.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList31 = maintainPurchases23.purchases;
        maintainPurchases23.path = "hi!";
        maintainPurchases23.path = "hi!";
        maintainPurchases23.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases38 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray39 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList40 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList40, purchaseArray39);
        maintainPurchases38.purchases = purchaseList40;
        maintainPurchases38.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases45 = new maintaining.MaintainPurchases();
        maintainPurchases45.path = "";
        maintainPurchases45.path = "";
        java.lang.String str50 = maintainPurchases45.path;
        maintaining.MaintainPurchases maintainPurchases51 = new maintaining.MaintainPurchases();
        maintainPurchases51.path = "";
        maintainPurchases51.path = "";
        maintainPurchases51.path = "";
        actions.Purchase[] purchaseArray58 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList59 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList59, purchaseArray58);
        maintainPurchases51.purchases = purchaseList59;
        java.lang.String str62 = maintainPurchases51.path;
        java.util.ArrayList<actions.Purchase> purchaseList63 = maintainPurchases51.purchases;
        maintainPurchases45.purchases = purchaseList63;
        maintainPurchases38.purchases = purchaseList63;
        maintainPurchases23.purchases = purchaseList63;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases23.purchases;
        maintainPurchases0.purchases = purchaseList67;
        java.lang.String str69 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test259");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList7 = maintainPurchases0.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList8 = maintainPurchases0.purchases;
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        maintainPurchases0.path = "hi!";
        java.lang.String str15 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        java.lang.String str18 = maintainPurchases0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test260");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        java.lang.String str5 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases6 = new maintaining.MaintainPurchases();
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        maintainPurchases6.path = "";
        actions.Purchase[] purchaseArray13 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList14 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList14, purchaseArray13);
        maintainPurchases6.purchases = purchaseList14;
        java.lang.String str17 = maintainPurchases6.path;
        java.util.ArrayList<actions.Purchase> purchaseList18 = maintainPurchases6.purchases;
        maintainPurchases0.purchases = purchaseList18;
        maintaining.MaintainPurchases maintainPurchases20 = new maintaining.MaintainPurchases();
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        maintainPurchases20.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList27 = maintainPurchases20.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList28 = maintainPurchases20.purchases;
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintainPurchases20.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases35 = new maintaining.MaintainPurchases();
        maintainPurchases35.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList38 = maintainPurchases35.purchases;
        maintainPurchases20.purchases = purchaseList38;
        maintainPurchases0.purchases = purchaseList38;
        maintaining.MaintainPurchases maintainPurchases41 = new maintaining.MaintainPurchases();
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        maintainPurchases41.path = "";
        actions.Purchase[] purchaseArray48 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList49 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList49, purchaseArray48);
        maintainPurchases41.purchases = purchaseList49;
        java.lang.String str52 = maintainPurchases41.path;
        java.util.ArrayList<actions.Purchase> purchaseList53 = maintainPurchases41.purchases;
        maintainPurchases0.purchases = purchaseList53;
        java.lang.String str55 = maintainPurchases0.path;
        maintaining.MaintainPurchases maintainPurchases56 = new maintaining.MaintainPurchases();
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        maintainPurchases56.path = "";
        actions.Purchase[] purchaseArray63 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList64 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList64, purchaseArray63);
        maintainPurchases56.purchases = purchaseList64;
        java.util.ArrayList<actions.Purchase> purchaseList67 = maintainPurchases56.purchases;
        maintainPurchases0.purchases = purchaseList67;
        maintainPurchases0.path = "";
        java.lang.String str71 = maintainPurchases0.path;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test261");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        java.util.ArrayList<actions.Purchase> purchaseList1 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases2 = new maintaining.MaintainPurchases();
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        maintainPurchases2.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList9 = maintainPurchases2.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList10 = maintainPurchases2.purchases;
        maintainPurchases0.purchases = purchaseList10;
        java.util.ArrayList<actions.Purchase> purchaseList12 = maintainPurchases0.purchases;
        maintainPurchases0.path = "";
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList25 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList26 = maintainPurchases15.purchases;
        maintainPurchases0.purchases = purchaseList26;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList26);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainPurchasesTest.test262");
        maintaining.MaintainPurchases maintainPurchases0 = new maintaining.MaintainPurchases();
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        maintainPurchases0.path = "";
        actions.Purchase[] purchaseArray7 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList8 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList8, purchaseArray7);
        maintainPurchases0.purchases = purchaseList8;
        java.lang.String str11 = maintainPurchases0.path;
        maintainPurchases0.path = "hi!";
        java.util.ArrayList<actions.Purchase> purchaseList14 = maintainPurchases0.purchases;
        maintaining.MaintainPurchases maintainPurchases15 = new maintaining.MaintainPurchases();
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        maintainPurchases15.path = "";
        java.util.ArrayList<actions.Purchase> purchaseList22 = maintainPurchases15.purchases;
        java.util.ArrayList<actions.Purchase> purchaseList23 = maintainPurchases15.purchases;
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintainPurchases15.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases30 = new maintaining.MaintainPurchases();
        actions.Purchase[] purchaseArray31 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList32 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList32, purchaseArray31);
        maintainPurchases30.purchases = purchaseList32;
        maintainPurchases30.path = "hi!";
        maintaining.MaintainPurchases maintainPurchases37 = new maintaining.MaintainPurchases();
        maintainPurchases37.path = "";
        maintainPurchases37.path = "";
        java.lang.String str42 = maintainPurchases37.path;
        maintaining.MaintainPurchases maintainPurchases43 = new maintaining.MaintainPurchases();
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        maintainPurchases43.path = "";
        actions.Purchase[] purchaseArray50 = new actions.Purchase[] {};
        java.util.ArrayList<actions.Purchase> purchaseList51 = new java.util.ArrayList<actions.Purchase>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<actions.Purchase>) purchaseList51, purchaseArray50);
        maintainPurchases43.purchases = purchaseList51;
        java.lang.String str54 = maintainPurchases43.path;
        java.util.ArrayList<actions.Purchase> purchaseList55 = maintainPurchases43.purchases;
        maintainPurchases37.purchases = purchaseList55;
        maintainPurchases30.purchases = purchaseList55;
        maintainPurchases15.purchases = purchaseList55;
        maintainPurchases0.purchases = purchaseList55;
        maintainPurchases0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(purchaseList55);
    }
}

