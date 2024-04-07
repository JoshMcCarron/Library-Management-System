package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagementTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test002");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.Class<?> wildcardClass1 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test003");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test004");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.Class<?> wildcardClass2 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test005");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass3 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test006");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test007");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test008");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test009");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test010");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test011");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test012");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test013");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test014");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass2 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test015");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test016");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test017");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test018");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test019");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test020");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test021");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test022");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test023");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test024");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test025");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test026");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test027");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test028");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test029");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test030");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test031");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test032");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

//    @Test
//    public void test033() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "ManagementTest.test033");
//        structure.Management management0 = structure.Management.getManagement();
//        java.lang.String str1 = management0.getManagerCode();
//        int int2 = management0.simulateRequest();
//        java.lang.String str3 = management0.getManagerCode();
//        int int4 = management0.simulateRequest();
//        java.lang.Class<?> wildcardClass5 = management0.getClass();
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertNotNull(management0);
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
//        // Regression assertion (captures the current behavior of the code)
//// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
//        // Regression assertion (captures the current behavior of the code)
//// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertNotNull(wildcardClass5);
//    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test034");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        int int3 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test035");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test036");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test037");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test038");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test039");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        java.lang.String str3 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test040");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test041");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test042");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test043");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test044");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test045");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test046");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.validate();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test047");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test048");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test049");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test050");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test051");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test052");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test053");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test054");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test055");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test056");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test057");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass3 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test058");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test059");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test060");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test061");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test062");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test063");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test064");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test065");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test066");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test067");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test068");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test069");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test070");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test071");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test072");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test073");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test074");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test075");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test076");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test077");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test078");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test079");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test080");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        int int11 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test081");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test082");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test083");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test084");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test085");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test086");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test087");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test088");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.validate();
        int int4 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test089");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test090");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test091");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test092");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test093");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test094");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        java.lang.Class<?> wildcardClass3 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test095");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test096");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test097");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test098");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test099");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test100");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test101");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test102");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        java.lang.String str4 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test103");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test104");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test105");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test106");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test107");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test108");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test109");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test110");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        int int5 = management0.validate();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test111");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test112");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test113");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test114");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test115");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        int int11 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test116");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.validate();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test117");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        int int2 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass3 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test118");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test119");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        int int11 = management0.validate();
        int int12 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test120");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test121");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test122");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test123");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test124");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.validate();
        java.lang.String str12 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test125");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test126");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.validate();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test127");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        int int11 = management0.validate();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test128");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.String str12 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass13 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test129");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test130");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass6 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test131");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test132");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test133");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test134");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test135");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test136");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test137");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test138");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test139");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test140");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test141");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test142");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test143");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test144");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        int int12 = management0.validate();
        java.lang.String str13 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1357" + "'", str13.equals("1357"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test145");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test146");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test147");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test148");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test149");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test150");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test151");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test152");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        int int10 = management0.validate();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test153");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test154");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.simulateRequest();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test155");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test156");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test157");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test158");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test159");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.simulateRequest();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test160");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test161");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass7 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test162");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test163");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test164");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test165");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        int int11 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test166");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.validate();
        int int11 = management0.simulateRequest();
        java.lang.String str12 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test167");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test168");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test169");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test170");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        int int10 = management0.validate();
        int int11 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test171");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test172");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test173");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test174");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test175");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test176");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test177");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test178");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        int int12 = management0.validate();
        java.lang.Class<?> wildcardClass13 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test179");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test180");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test181");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test182");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test183");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.validate();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test184");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.String str12 = management0.getManagerCode();
        int int13 = management0.validate();
        java.lang.String str14 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1357" + "'", str14.equals("1357"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test185");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test186");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.String str12 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass13 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test187");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test188");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test189");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.validate();
        int int11 = management0.validate();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test190");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test191");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test192");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test193");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test194");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test195");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        int int6 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test196");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test197");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass11 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test198");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test199");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test200");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test201");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test202");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        int int11 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test203");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass2 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test204");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test205");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.validate();
        int int12 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test206");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test207");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        int int11 = management0.validate();
        java.lang.Class<?> wildcardClass12 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test208");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test209");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        java.lang.String str11 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test210");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test211");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test212");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        int int11 = management0.simulateRequest();
        int int12 = management0.validate();
        int int13 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test213");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        int int11 = management0.validate();
        int int12 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test214");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        java.lang.String str9 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test215");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test216");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test217");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.simulateRequest();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test218");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test219");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test220");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test221");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        java.lang.String str11 = management0.getManagerCode();
        java.lang.String str12 = management0.getManagerCode();
        int int13 = management0.validate();
        int int14 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test222");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test223");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test224");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test225");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.simulateRequest();
        int int5 = management0.simulateRequest();
        int int6 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test226");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test227");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.validate();
        int int3 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass4 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test228");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test229");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test230");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.validate();
        java.lang.String str12 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1357" + "'", str12.equals("1357"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test231");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass10 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test232");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        int int11 = management0.simulateRequest();
        int int12 = management0.validate();
        int int13 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test233");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.simulateRequest();
        int int11 = management0.simulateRequest();
        int int12 = management0.validate();
        int int13 = management0.simulateRequest();
        java.lang.String str14 = management0.getManagerCode();
        int int15 = management0.simulateRequest();
        int int16 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1357" + "'", str14.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test234");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test235");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test236");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        java.lang.String str7 = management0.getManagerCode();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test237");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.validate();
        int int10 = management0.validate();
        int int11 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test238");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test239");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        java.lang.String str3 = management0.getManagerCode();
        java.lang.String str4 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test240");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        int int12 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test241");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.simulateRequest();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.String str9 = management0.getManagerCode();
        java.lang.String str10 = management0.getManagerCode();
        int int11 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1357" + "'", str9.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1357" + "'", str10.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test242");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        int int6 = management0.validate();
        int int7 = management0.validate();
        int int8 = management0.validate();
        int int9 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test243");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.validate();
        int int4 = management0.simulateRequest();
        java.lang.Class<?> wildcardClass5 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test244");
        structure.Management management0 = structure.Management.getManagement();
        int int1 = management0.validate();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        int int4 = management0.simulateRequest();
        int int5 = management0.validate();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.validate();
        int int10 = management0.validate();
        java.lang.String str11 = management0.getManagerCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1357" + "'", str11.equals("1357"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test245");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.validate();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        int int8 = management0.simulateRequest();
        int int9 = management0.simulateRequest();
        int int10 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test246");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        java.lang.String str2 = management0.getManagerCode();
        int int3 = management0.simulateRequest();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.simulateRequest();
        java.lang.String str8 = management0.getManagerCode();
        int int9 = management0.simulateRequest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1357" + "'", str2.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1357" + "'", str8.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test247");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        java.lang.String str3 = management0.getManagerCode();
        int int4 = management0.validate();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        int int7 = management0.simulateRequest();
        int int8 = management0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1357" + "'", str3.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test248");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        java.lang.String str5 = management0.getManagerCode();
        java.lang.String str6 = management0.getManagerCode();
        int int7 = management0.validate();
        int int8 = management0.validate();
        java.lang.Class<?> wildcardClass9 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1357" + "'", str5.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1357" + "'", str6.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagementTest.test249");
        structure.Management management0 = structure.Management.getManagement();
        java.lang.String str1 = management0.getManagerCode();
        int int2 = management0.simulateRequest();
        int int3 = management0.validate();
        java.lang.String str4 = management0.getManagerCode();
        int int5 = management0.simulateRequest();
        int int6 = management0.validate();
        java.lang.String str7 = management0.getManagerCode();
        java.lang.Class<?> wildcardClass8 = management0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(management0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1357" + "'", str1.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1357" + "'", str4.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1357" + "'", str7.equals("1357"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}
