package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaintainUserTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test002");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test003");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test004");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test005");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        java.lang.Class<?> wildcardClass1 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test006");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test007");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        java.lang.Class<?> wildcardClass4 = userList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test008");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        java.util.ArrayList<userTypes.User> userList8 = maintainUser3.users;
        userTypes.User user11 = maintainUser3.login("hi!", "hi!");
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser3.register("hi!", "", "hi!", management15);
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        maintainUser3.users = userList24;
        maintainUser0.users = userList24;
        java.lang.Class<?> wildcardClass27 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test009");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test010");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "hi!", "", management9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test011");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        userTypes.User user26 = maintainUser0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test012");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        java.lang.Class<?> wildcardClass21 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test013");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        userTypes.User user11 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test014");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        userTypes.User user26 = maintainUser0.login("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = user26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test015");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.lang.Class<?> wildcardClass30 = userList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test016");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        java.lang.Class<?> wildcardClass23 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test017");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        userTypes.User user25 = maintainUser17.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser17.register("", "hi!", "", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        java.util.ArrayList<userTypes.User> userList45 = maintainUser31.users;
        maintainUser17.users = userList45;
        java.util.ArrayList<userTypes.User> userList47 = maintainUser17.users;
        maintainUser0.users = userList47;
        java.lang.Class<?> wildcardClass49 = userList47.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test018");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        java.util.ArrayList<userTypes.User> userList8 = maintainUser3.users;
        userTypes.User user11 = maintainUser3.login("hi!", "hi!");
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser3.register("hi!", "", "hi!", management15);
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        maintainUser3.users = userList24;
        maintainUser0.users = userList24;
        userTypes.User user29 = maintainUser0.login("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test019");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        structure.Management management8 = null;
        userTypes.User user9 = maintainUser0.register("", "", "", management8);
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser0.register("", "", "hi!", management13);
        userTypes.User user17 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test020");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser8 = new maintaining.MaintainUser();
        userTypes.User[] userArray9 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList10 = new java.util.ArrayList<userTypes.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList10, userArray9);
        maintainUser8.users = userList10;
        java.util.ArrayList<userTypes.User> userList13 = maintainUser8.users;
        userTypes.User user16 = maintainUser8.login("hi!", "hi!");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser8.register("", "hi!", "", management20);
        maintaining.MaintainUser maintainUser22 = new maintaining.MaintainUser();
        userTypes.User[] userArray23 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList24 = new java.util.ArrayList<userTypes.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList24, userArray23);
        maintainUser22.users = userList24;
        java.util.ArrayList<userTypes.User> userList27 = maintainUser22.users;
        maintainUser8.users = userList27;
        java.lang.String str29 = maintainUser8.path;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser8.users;
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintaining.MaintainUser maintainUser54 = new maintaining.MaintainUser();
        userTypes.User[] userArray55 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList56 = new java.util.ArrayList<userTypes.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList56, userArray55);
        maintainUser54.users = userList56;
        maintainUser31.users = userList56;
        maintainUser8.users = userList56;
        maintainUser0.users = userList56;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test021");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        java.lang.Class<?> wildcardClass26 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test022");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        userTypes.User user17 = maintainUser0.login("hi!", "hi!");
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser0.register("", "hi!", "hi!", management21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test023");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        maintainUser17.path = "hi!";
        maintaining.MaintainUser maintainUser20 = new maintaining.MaintainUser();
        userTypes.User[] userArray21 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList22 = new java.util.ArrayList<userTypes.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList22, userArray21);
        maintainUser20.users = userList22;
        java.util.ArrayList<userTypes.User> userList25 = maintainUser20.users;
        userTypes.User user28 = maintainUser20.login("hi!", "hi!");
        structure.Management management32 = null;
        userTypes.User user33 = maintainUser20.register("hi!", "", "hi!", management32);
        maintainUser20.path = "";
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        maintainUser20.users = userList41;
        maintainUser17.users = userList41;
        maintainUser0.users = userList41;
        java.lang.Class<?> wildcardClass45 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test024");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        userTypes.User user15 = maintainUser0.login("", "");
        userTypes.User user18 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test025");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        structure.Management management8 = null;
        userTypes.User user9 = maintainUser0.register("", "", "", management8);
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser0.register("", "", "hi!", management13);
        java.lang.String str15 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test026");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test027");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test028");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = user21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test029");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        java.lang.String str26 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test030");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass16 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test031");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        userTypes.User user25 = maintainUser17.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser17.register("", "hi!", "", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        maintainUser17.users = userList36;
        maintainUser0.users = userList36;
        userTypes.User user41 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user41);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test032");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test033");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser0.register("", "", "hi!", management22);
        maintainUser0.path = "";
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "hi!", "hi!", management29);
        userTypes.User user33 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test034");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser0.users = userList35;
        java.lang.Class<?> wildcardClass37 = userList35.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test035");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test036");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "", "hi!", management10);
        maintainUser0.path = "";
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test037");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test038");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        userTypes.User user17 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test039");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = user32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test040");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        structure.Management management6 = null;
        userTypes.User user7 = maintainUser0.register("", "hi!", "", management6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test041");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        userTypes.User user21 = maintainUser0.login("", "");
        java.lang.String str22 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test042");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        maintainUser19.path = "hi!";
        java.lang.String str22 = maintainUser19.path;
        userTypes.User user25 = maintainUser19.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser26 = new maintaining.MaintainUser();
        userTypes.User[] userArray27 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList28 = new java.util.ArrayList<userTypes.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList28, userArray27);
        maintainUser26.users = userList28;
        java.util.ArrayList<userTypes.User> userList31 = maintainUser26.users;
        structure.Management management35 = null;
        userTypes.User user36 = maintainUser26.register("hi!", "", "", management35);
        structure.Management management40 = null;
        userTypes.User user41 = maintainUser26.register("hi!", "hi!", "hi!", management40);
        userTypes.User user44 = maintainUser26.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser26.register("", "", "hi!", management48);
        maintaining.MaintainUser maintainUser50 = new maintaining.MaintainUser();
        userTypes.User[] userArray51 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList52 = new java.util.ArrayList<userTypes.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList52, userArray51);
        maintainUser50.users = userList52;
        java.util.ArrayList<userTypes.User> userList55 = maintainUser50.users;
        userTypes.User user58 = maintainUser50.login("hi!", "hi!");
        structure.Management management62 = null;
        userTypes.User user63 = maintainUser50.register("hi!", "", "hi!", management62);
        maintainUser50.path = "";
        maintaining.MaintainUser maintainUser66 = new maintaining.MaintainUser();
        userTypes.User[] userArray67 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList68 = new java.util.ArrayList<userTypes.User>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList68, userArray67);
        maintainUser66.users = userList68;
        java.util.ArrayList<userTypes.User> userList71 = maintainUser66.users;
        maintainUser50.users = userList71;
        maintainUser26.users = userList71;
        maintainUser19.users = userList71;
        maintainUser0.users = userList71;
        java.lang.Class<?> wildcardClass76 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test043");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        java.lang.String str11 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test044");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test045");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        java.util.ArrayList<userTypes.User> userList8 = maintainUser3.users;
        userTypes.User user11 = maintainUser3.login("hi!", "hi!");
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser3.register("hi!", "", "hi!", management15);
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        maintainUser3.users = userList24;
        maintainUser0.users = userList24;
        structure.Management management30 = null;
        userTypes.User user31 = maintainUser0.register("hi!", "hi!", "hi!", management30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user31);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test046");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test047");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        structure.Management management4 = null;
        userTypes.User user5 = maintainUser0.register("", "hi!", "hi!", management4);
        java.lang.String str6 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test048");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        userTypes.User user65 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test049");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        java.lang.String str6 = maintainUser0.path;
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "hi!", "", management10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test050");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test051");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test052");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        structure.Management management7 = null;
        userTypes.User user8 = maintainUser0.register("", "hi!", "hi!", management7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test053");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        userTypes.User user19 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList20 = null;
        maintainUser0.users = userList20;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.User user24 = maintainUser0.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test054");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        java.lang.Class<?> wildcardClass20 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test055");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        structure.Management management4 = null;
        userTypes.User user5 = maintainUser0.register("", "hi!", "hi!", management4);
        java.util.ArrayList<userTypes.User> userList6 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test056");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList59 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test057");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test058");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser8 = new maintaining.MaintainUser();
        userTypes.User[] userArray9 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList10 = new java.util.ArrayList<userTypes.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList10, userArray9);
        maintainUser8.users = userList10;
        java.util.ArrayList<userTypes.User> userList13 = maintainUser8.users;
        userTypes.User user16 = maintainUser8.login("hi!", "hi!");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser8.register("", "hi!", "", management20);
        maintaining.MaintainUser maintainUser22 = new maintaining.MaintainUser();
        userTypes.User[] userArray23 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList24 = new java.util.ArrayList<userTypes.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList24, userArray23);
        maintainUser22.users = userList24;
        java.util.ArrayList<userTypes.User> userList27 = maintainUser22.users;
        maintainUser8.users = userList27;
        java.lang.String str29 = maintainUser8.path;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser8.users;
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintaining.MaintainUser maintainUser54 = new maintaining.MaintainUser();
        userTypes.User[] userArray55 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList56 = new java.util.ArrayList<userTypes.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList56, userArray55);
        maintainUser54.users = userList56;
        maintainUser31.users = userList56;
        maintainUser8.users = userList56;
        maintainUser0.users = userList56;
        java.lang.String str62 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test059");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "", "hi!", management10);
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList14 = null;
        maintainUser0.users = userList14;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.User user18 = maintainUser0.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test060");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        userTypes.User user15 = maintainUser0.login("", "");
        userTypes.User user18 = maintainUser0.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList19 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test061");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        java.lang.String str21 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser0.users;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test062");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser17.register("hi!", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser17.register("hi!", "hi!", "hi!", management31);
        userTypes.User user35 = maintainUser17.login("hi!", "hi!");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser17.register("", "", "hi!", management39);
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("hi!", "", "hi!", management53);
        maintainUser41.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser57.users;
        maintainUser41.users = userList62;
        maintainUser17.users = userList62;
        maintainUser0.users = userList62;
        java.lang.String str66 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test063");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        userTypes.User user27 = maintainUser19.login("hi!", "hi!");
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser19.register("", "hi!", "", management31);
        maintaining.MaintainUser maintainUser33 = new maintaining.MaintainUser();
        userTypes.User[] userArray34 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList35 = new java.util.ArrayList<userTypes.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList35, userArray34);
        maintainUser33.users = userList35;
        java.util.ArrayList<userTypes.User> userList38 = maintainUser33.users;
        maintainUser19.users = userList38;
        java.lang.String str40 = maintainUser19.path;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser19.users;
        maintaining.MaintainUser maintainUser42 = new maintaining.MaintainUser();
        userTypes.User[] userArray43 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList44 = new java.util.ArrayList<userTypes.User>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList44, userArray43);
        maintainUser42.users = userList44;
        java.util.ArrayList<userTypes.User> userList47 = maintainUser42.users;
        userTypes.User user50 = maintainUser42.login("hi!", "hi!");
        structure.Management management54 = null;
        userTypes.User user55 = maintainUser42.register("hi!", "", "hi!", management54);
        maintainUser42.path = "";
        maintaining.MaintainUser maintainUser58 = new maintaining.MaintainUser();
        userTypes.User[] userArray59 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList60 = new java.util.ArrayList<userTypes.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList60, userArray59);
        maintainUser58.users = userList60;
        java.util.ArrayList<userTypes.User> userList63 = maintainUser58.users;
        maintainUser42.users = userList63;
        maintaining.MaintainUser maintainUser65 = new maintaining.MaintainUser();
        userTypes.User[] userArray66 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList67 = new java.util.ArrayList<userTypes.User>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList67, userArray66);
        maintainUser65.users = userList67;
        maintainUser42.users = userList67;
        maintainUser19.users = userList67;
        maintainUser0.users = userList67;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test064");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test065");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        structure.Management management27 = null;
        userTypes.User user28 = maintainUser0.register("", "", "hi!", management27);
        java.lang.Class<?> wildcardClass29 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test066");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        java.lang.String str41 = maintainUser0.path;
        java.lang.String str42 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test067");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        maintainUser15.path = "hi!";
        java.util.ArrayList<userTypes.User> userList18 = maintainUser15.users;
        maintainUser0.users = userList18;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        maintaining.MaintainUser maintainUser21 = new maintaining.MaintainUser();
        maintainUser21.path = "hi!";
        java.lang.String str24 = maintainUser21.path;
        userTypes.User user27 = maintainUser21.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser28 = new maintaining.MaintainUser();
        userTypes.User[] userArray29 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList30 = new java.util.ArrayList<userTypes.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList30, userArray29);
        maintainUser28.users = userList30;
        java.util.ArrayList<userTypes.User> userList33 = maintainUser28.users;
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser28.register("hi!", "", "", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser28.register("hi!", "hi!", "hi!", management42);
        userTypes.User user46 = maintainUser28.login("hi!", "hi!");
        structure.Management management50 = null;
        userTypes.User user51 = maintainUser28.register("", "", "hi!", management50);
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        userTypes.User user60 = maintainUser52.login("hi!", "hi!");
        structure.Management management64 = null;
        userTypes.User user65 = maintainUser52.register("hi!", "", "hi!", management64);
        maintainUser52.path = "";
        maintaining.MaintainUser maintainUser68 = new maintaining.MaintainUser();
        userTypes.User[] userArray69 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList70 = new java.util.ArrayList<userTypes.User>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList70, userArray69);
        maintainUser68.users = userList70;
        java.util.ArrayList<userTypes.User> userList73 = maintainUser68.users;
        maintainUser52.users = userList73;
        maintainUser28.users = userList73;
        maintainUser21.users = userList73;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser21.users;
        maintainUser0.users = userList77;
        java.lang.Class<?> wildcardClass79 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test068");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintaining.MaintainUser maintainUser1 = new maintaining.MaintainUser();
        userTypes.User[] userArray2 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList3 = new java.util.ArrayList<userTypes.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList3, userArray2);
        maintainUser1.users = userList3;
        java.util.ArrayList<userTypes.User> userList6 = maintainUser1.users;
        userTypes.User user9 = maintainUser1.login("hi!", "hi!");
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser1.register("", "hi!", "", management13);
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        userTypes.User[] userArray16 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList17 = new java.util.ArrayList<userTypes.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList17, userArray16);
        maintainUser15.users = userList17;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser15.users;
        userTypes.User user23 = maintainUser15.login("hi!", "hi!");
        structure.Management management27 = null;
        userTypes.User user28 = maintainUser15.register("hi!", "", "hi!", management27);
        java.util.ArrayList<userTypes.User> userList29 = maintainUser15.users;
        maintainUser1.users = userList29;
        maintainUser0.users = userList29;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        userTypes.User[] userArray33 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList34 = new java.util.ArrayList<userTypes.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList34, userArray33);
        maintainUser32.users = userList34;
        java.util.ArrayList<userTypes.User> userList37 = maintainUser32.users;
        userTypes.User user40 = maintainUser32.login("hi!", "hi!");
        structure.Management management44 = null;
        userTypes.User user45 = maintainUser32.register("", "hi!", "", management44);
        maintaining.MaintainUser maintainUser46 = new maintaining.MaintainUser();
        userTypes.User[] userArray47 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList48 = new java.util.ArrayList<userTypes.User>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList48, userArray47);
        maintainUser46.users = userList48;
        java.util.ArrayList<userTypes.User> userList51 = maintainUser46.users;
        userTypes.User user54 = maintainUser46.login("hi!", "hi!");
        structure.Management management58 = null;
        userTypes.User user59 = maintainUser46.register("hi!", "", "hi!", management58);
        java.util.ArrayList<userTypes.User> userList60 = maintainUser46.users;
        maintainUser32.users = userList60;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser32.users;
        maintainUser0.users = userList62;
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test069");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintaining.MaintainUser maintainUser1 = new maintaining.MaintainUser();
        userTypes.User[] userArray2 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList3 = new java.util.ArrayList<userTypes.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList3, userArray2);
        maintainUser1.users = userList3;
        java.util.ArrayList<userTypes.User> userList6 = maintainUser1.users;
        userTypes.User user9 = maintainUser1.login("hi!", "hi!");
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser1.register("", "hi!", "", management13);
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        userTypes.User[] userArray16 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList17 = new java.util.ArrayList<userTypes.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList17, userArray16);
        maintainUser15.users = userList17;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser15.users;
        userTypes.User user23 = maintainUser15.login("hi!", "hi!");
        structure.Management management27 = null;
        userTypes.User user28 = maintainUser15.register("hi!", "", "hi!", management27);
        java.util.ArrayList<userTypes.User> userList29 = maintainUser15.users;
        maintainUser1.users = userList29;
        maintainUser0.users = userList29;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        userTypes.User[] userArray33 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList34 = new java.util.ArrayList<userTypes.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList34, userArray33);
        maintainUser32.users = userList34;
        java.util.ArrayList<userTypes.User> userList37 = maintainUser32.users;
        userTypes.User user40 = maintainUser32.login("hi!", "hi!");
        structure.Management management44 = null;
        userTypes.User user45 = maintainUser32.register("", "hi!", "", management44);
        maintaining.MaintainUser maintainUser46 = new maintaining.MaintainUser();
        userTypes.User[] userArray47 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList48 = new java.util.ArrayList<userTypes.User>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList48, userArray47);
        maintainUser46.users = userList48;
        java.util.ArrayList<userTypes.User> userList51 = maintainUser46.users;
        userTypes.User user54 = maintainUser46.login("hi!", "hi!");
        structure.Management management58 = null;
        userTypes.User user59 = maintainUser46.register("hi!", "", "hi!", management58);
        java.util.ArrayList<userTypes.User> userList60 = maintainUser46.users;
        maintainUser32.users = userList60;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser32.users;
        maintainUser0.users = userList62;
        java.lang.Class<?> wildcardClass64 = userList62.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test070");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test071");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = user13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test072");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.lang.String str57 = maintainUser0.path;
        maintaining.MaintainUser maintainUser58 = new maintaining.MaintainUser();
        userTypes.User[] userArray59 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList60 = new java.util.ArrayList<userTypes.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList60, userArray59);
        maintainUser58.users = userList60;
        java.util.ArrayList<userTypes.User> userList63 = maintainUser58.users;
        userTypes.User user66 = maintainUser58.login("hi!", "hi!");
        structure.Management management70 = null;
        userTypes.User user71 = maintainUser58.register("", "hi!", "", management70);
        userTypes.User user74 = maintainUser58.login("", "");
        java.util.ArrayList<userTypes.User> userList75 = maintainUser58.users;
        maintainUser0.users = userList75;
        java.lang.Class<?> wildcardClass77 = userList75.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test073");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        userTypes.User user19 = maintainUser0.login("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test074");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass3 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test075");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintaining.MaintainUser maintainUser10 = new maintaining.MaintainUser();
        userTypes.User[] userArray11 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList12 = new java.util.ArrayList<userTypes.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList12, userArray11);
        maintainUser10.users = userList12;
        java.util.ArrayList<userTypes.User> userList15 = maintainUser10.users;
        maintainUser10.path = "";
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser10.register("hi!", "", "", management21);
        java.lang.String str23 = maintainUser10.path;
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        java.util.ArrayList<userTypes.User> userList29 = maintainUser24.users;
        userTypes.User user32 = maintainUser24.login("hi!", "hi!");
        structure.Management management36 = null;
        userTypes.User user37 = maintainUser24.register("hi!", "", "hi!", management36);
        maintainUser24.path = "";
        maintaining.MaintainUser maintainUser40 = new maintaining.MaintainUser();
        userTypes.User[] userArray41 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList42 = new java.util.ArrayList<userTypes.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList42, userArray41);
        maintainUser40.users = userList42;
        java.util.ArrayList<userTypes.User> userList45 = maintainUser40.users;
        maintainUser24.users = userList45;
        maintainUser10.users = userList45;
        maintaining.MaintainUser maintainUser48 = new maintaining.MaintainUser();
        maintainUser48.path = "hi!";
        java.lang.String str51 = maintainUser48.path;
        userTypes.User user54 = maintainUser48.login("hi!", "hi!");
        structure.Management management58 = null;
        userTypes.User user59 = maintainUser48.register("", "", "hi!", management58);
        maintainUser48.path = "";
        java.util.ArrayList<userTypes.User> userList62 = maintainUser48.users;
        maintainUser10.users = userList62;
        maintainUser0.users = userList62;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test076");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass19 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test077");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser0.register("", "hi!", "", management31);
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test078");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        maintainUser15.path = "hi!";
        java.util.ArrayList<userTypes.User> userList18 = maintainUser15.users;
        maintainUser0.users = userList18;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        maintaining.MaintainUser maintainUser21 = new maintaining.MaintainUser();
        maintainUser21.path = "hi!";
        java.lang.String str24 = maintainUser21.path;
        userTypes.User user27 = maintainUser21.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser28 = new maintaining.MaintainUser();
        userTypes.User[] userArray29 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList30 = new java.util.ArrayList<userTypes.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList30, userArray29);
        maintainUser28.users = userList30;
        java.util.ArrayList<userTypes.User> userList33 = maintainUser28.users;
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser28.register("hi!", "", "", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser28.register("hi!", "hi!", "hi!", management42);
        userTypes.User user46 = maintainUser28.login("hi!", "hi!");
        structure.Management management50 = null;
        userTypes.User user51 = maintainUser28.register("", "", "hi!", management50);
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        userTypes.User user60 = maintainUser52.login("hi!", "hi!");
        structure.Management management64 = null;
        userTypes.User user65 = maintainUser52.register("hi!", "", "hi!", management64);
        maintainUser52.path = "";
        maintaining.MaintainUser maintainUser68 = new maintaining.MaintainUser();
        userTypes.User[] userArray69 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList70 = new java.util.ArrayList<userTypes.User>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList70, userArray69);
        maintainUser68.users = userList70;
        java.util.ArrayList<userTypes.User> userList73 = maintainUser68.users;
        maintainUser52.users = userList73;
        maintainUser28.users = userList73;
        maintainUser21.users = userList73;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser21.users;
        maintainUser0.users = userList77;
        structure.Management management82 = null;
        userTypes.User user83 = maintainUser0.register("hi!", "hi!", "hi!", management82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user83);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test079");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        userTypes.User user21 = maintainUser14.login("hi!", "hi!");
        java.lang.String str22 = maintainUser14.path;
        java.lang.String str23 = maintainUser14.path;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser14.users;
        maintainUser0.users = userList24;
        java.lang.String str26 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test080");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser0.register("hi!", "", "", management31);
        java.util.ArrayList<userTypes.User> userList33 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test081");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        userTypes.User user15 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test082");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        userTypes.User user35 = maintainUser0.login("", "");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser0.register("hi!", "hi!", "", management39);
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser43 = new maintaining.MaintainUser();
        maintainUser43.path = "hi!";
        java.lang.String str46 = maintainUser43.path;
        userTypes.User user49 = maintainUser43.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser43.register("", "", "hi!", management53);
        maintainUser43.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        maintainUser43.users = userList59;
        maintainUser0.users = userList59;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test083");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        userTypes.User user19 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList20 = null;
        maintainUser0.users = userList20;
        java.lang.Class<?> wildcardClass22 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test084");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        java.lang.String str31 = maintainUser0.path;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        userTypes.User[] userArray33 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList34 = new java.util.ArrayList<userTypes.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList34, userArray33);
        maintainUser32.users = userList34;
        java.util.ArrayList<userTypes.User> userList37 = maintainUser32.users;
        structure.Management management41 = null;
        userTypes.User user42 = maintainUser32.register("hi!", "", "", management41);
        structure.Management management46 = null;
        userTypes.User user47 = maintainUser32.register("hi!", "hi!", "hi!", management46);
        userTypes.User user50 = maintainUser32.login("hi!", "hi!");
        structure.Management management54 = null;
        userTypes.User user55 = maintainUser32.register("", "", "hi!", management54);
        maintaining.MaintainUser maintainUser56 = new maintaining.MaintainUser();
        userTypes.User[] userArray57 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList58 = new java.util.ArrayList<userTypes.User>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList58, userArray57);
        maintainUser56.users = userList58;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser56.users;
        userTypes.User user64 = maintainUser56.login("hi!", "hi!");
        structure.Management management68 = null;
        userTypes.User user69 = maintainUser56.register("hi!", "", "hi!", management68);
        maintainUser56.path = "";
        maintaining.MaintainUser maintainUser72 = new maintaining.MaintainUser();
        userTypes.User[] userArray73 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList74 = new java.util.ArrayList<userTypes.User>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList74, userArray73);
        maintainUser72.users = userList74;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser72.users;
        maintainUser56.users = userList77;
        maintainUser32.users = userList77;
        maintaining.MaintainUser maintainUser80 = new maintaining.MaintainUser();
        userTypes.User[] userArray81 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList82 = new java.util.ArrayList<userTypes.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList82, userArray81);
        maintainUser80.users = userList82;
        userTypes.User user87 = maintainUser80.login("hi!", "hi!");
        java.lang.String str88 = maintainUser80.path;
        structure.Management management92 = null;
        userTypes.User user93 = maintainUser80.register("hi!", "hi!", "", management92);
        userTypes.User user96 = maintainUser80.login("", "hi!");
        java.util.ArrayList<userTypes.User> userList97 = maintainUser80.users;
        maintainUser32.users = userList97;
        maintainUser0.users = userList97;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList97);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test085");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser0.register("", "hi!", "", management15);
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test086");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("hi!", "hi!", "", management26);
        maintaining.MaintainUser maintainUser28 = new maintaining.MaintainUser();
        userTypes.User[] userArray29 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList30 = new java.util.ArrayList<userTypes.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList30, userArray29);
        maintainUser28.users = userList30;
        userTypes.User user35 = maintainUser28.login("hi!", "hi!");
        java.lang.String str36 = maintainUser28.path;
        structure.Management management40 = null;
        userTypes.User user41 = maintainUser28.register("hi!", "hi!", "", management40);
        maintaining.MaintainUser maintainUser42 = new maintaining.MaintainUser();
        userTypes.User[] userArray43 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList44 = new java.util.ArrayList<userTypes.User>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList44, userArray43);
        maintainUser42.users = userList44;
        userTypes.User user49 = maintainUser42.login("hi!", "hi!");
        java.lang.String str50 = maintainUser42.path;
        java.lang.String str51 = maintainUser42.path;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser42.users;
        maintainUser28.users = userList52;
        maintainUser0.users = userList52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test087");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        maintainUser0.path = "";
        java.util.ArrayList<userTypes.User> userList35 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test088");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        structure.Management management4 = null;
        userTypes.User user5 = maintainUser0.register("", "hi!", "hi!", management4);
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "hi!", management9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test089");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList11 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test090");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("", "", "hi!", management9);
        userTypes.User user13 = maintainUser0.login("", "");
        java.lang.String str14 = maintainUser0.path;
        java.lang.String str15 = maintainUser0.path;
        java.lang.String str16 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test091");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test092");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        userTypes.User user35 = maintainUser0.login("", "");
        userTypes.User user38 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test093");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test094");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        userTypes.User user21 = maintainUser0.login("", "");
        structure.Management management25 = null;
        userTypes.User user26 = maintainUser0.register("", "", "hi!", management25);
        java.lang.Class<?> wildcardClass27 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test095");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser0.register("", "hi!", "", management15);
        userTypes.User user19 = maintainUser0.login("hi!", "");
        userTypes.User user22 = maintainUser0.login("", "");
        java.lang.String str23 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test096");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "", "hi!", management10);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        maintainUser0.users = userList16;
        java.lang.String str20 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test097");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        maintainUser0.path = "hi!";
        structure.Management management62 = null;
        userTypes.User user63 = maintainUser0.register("", "", "hi!", management62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user63);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test098");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser0.register("", "hi!", "", management31);
        structure.Management management36 = null;
        userTypes.User user37 = maintainUser0.register("hi!", "", "", management36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user37);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test099");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        java.lang.String str31 = maintainUser0.path;
        userTypes.User user34 = maintainUser0.login("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user34);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test100");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        structure.Management management33 = null;
        userTypes.User user34 = maintainUser0.register("hi!", "hi!", "hi!", management33);
        java.lang.Class<?> wildcardClass35 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test101");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.lang.Class<?> wildcardClass56 = userList52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test102");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser67 = new maintaining.MaintainUser();
        userTypes.User[] userArray68 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList69 = new java.util.ArrayList<userTypes.User>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList69, userArray68);
        maintainUser67.users = userList69;
        java.util.ArrayList<userTypes.User> userList72 = maintainUser67.users;
        userTypes.User user75 = maintainUser67.login("hi!", "hi!");
        structure.Management management79 = null;
        userTypes.User user80 = maintainUser67.register("hi!", "", "hi!", management79);
        maintainUser67.path = "";
        maintaining.MaintainUser maintainUser83 = new maintaining.MaintainUser();
        userTypes.User[] userArray84 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList85 = new java.util.ArrayList<userTypes.User>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList85, userArray84);
        maintainUser83.users = userList85;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser83.users;
        maintainUser67.users = userList88;
        maintainUser0.users = userList88;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test103");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test104");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.lang.Class<?> wildcardClass30 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test105");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        java.lang.String str21 = maintainUser0.path;
        structure.Management management25 = null;
        userTypes.User user26 = maintainUser0.register("", "", "hi!", management25);
        java.lang.String str27 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test106");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        userTypes.User user9 = maintainUser0.login("hi!", "");
        maintaining.MaintainUser maintainUser10 = new maintaining.MaintainUser();
        userTypes.User[] userArray11 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList12 = new java.util.ArrayList<userTypes.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList12, userArray11);
        maintainUser10.users = userList12;
        userTypes.User user17 = maintainUser10.login("hi!", "hi!");
        java.lang.String str18 = maintainUser10.path;
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser10.register("hi!", "hi!", "", management22);
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        userTypes.User user31 = maintainUser24.login("hi!", "hi!");
        java.lang.String str32 = maintainUser24.path;
        java.lang.String str33 = maintainUser24.path;
        java.util.ArrayList<userTypes.User> userList34 = maintainUser24.users;
        maintainUser10.users = userList34;
        maintainUser0.users = userList34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test107");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "hi!", "", management26);
        userTypes.User user30 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test108");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList9 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test109");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test110");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        maintaining.MaintainUser maintainUser38 = new maintaining.MaintainUser();
        maintainUser38.path = "hi!";
        java.lang.String str41 = maintainUser38.path;
        userTypes.User user44 = maintainUser38.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser38.register("", "", "hi!", management48);
        maintainUser38.path = "";
        java.util.ArrayList<userTypes.User> userList52 = maintainUser38.users;
        maintainUser0.users = userList52;
        java.lang.String str54 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test111");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        structure.Management management7 = null;
        userTypes.User user8 = maintainUser0.register("hi!", "", "hi!", management7);
        maintaining.MaintainUser maintainUser9 = new maintaining.MaintainUser();
        maintainUser9.path = "hi!";
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        userTypes.User user20 = maintainUser12.login("hi!", "hi!");
        structure.Management management24 = null;
        userTypes.User user25 = maintainUser12.register("hi!", "", "hi!", management24);
        maintainUser12.path = "";
        maintaining.MaintainUser maintainUser28 = new maintaining.MaintainUser();
        userTypes.User[] userArray29 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList30 = new java.util.ArrayList<userTypes.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList30, userArray29);
        maintainUser28.users = userList30;
        java.util.ArrayList<userTypes.User> userList33 = maintainUser28.users;
        maintainUser12.users = userList33;
        maintainUser9.users = userList33;
        maintainUser0.users = userList33;
        java.lang.String str37 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test112");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("hi!", "hi!", "hi!", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser0.register("hi!", "", "", management42);
        java.lang.String str44 = maintainUser0.path;
        userTypes.User user47 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user47);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test113");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintaining.MaintainUser maintainUser6 = new maintaining.MaintainUser();
        maintainUser6.path = "hi!";
        java.util.ArrayList<userTypes.User> userList9 = maintainUser6.users;
        maintainUser6.path = "hi!";
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser6.register("", "", "hi!", management15);
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser6.register("hi!", "", "hi!", management20);
        java.util.ArrayList<userTypes.User> userList22 = maintainUser6.users;
        maintainUser0.users = userList22;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test114");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("hi!", "");
        userTypes.User user19 = maintainUser0.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        java.lang.String str21 = maintainUser0.path;
        java.lang.String str22 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test115");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        maintainUser15.path = "hi!";
        java.util.ArrayList<userTypes.User> userList18 = maintainUser15.users;
        maintainUser0.users = userList18;
        userTypes.User user22 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test116");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser0.users;
        java.lang.Class<?> wildcardClass58 = userList57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test117");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "hi!", "", management26);
        userTypes.User user30 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test118");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        userTypes.User user26 = maintainUser0.login("hi!", "hi!");
        userTypes.User user29 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test119");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        userTypes.User user25 = maintainUser17.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser17.register("", "hi!", "", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        maintainUser17.users = userList36;
        maintainUser0.users = userList36;
        java.util.ArrayList<userTypes.User> userList39 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test120");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("", "", "", management26);
        userTypes.User user30 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test121");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        structure.Management management23 = null;
        userTypes.User user24 = maintainUser0.register("hi!", "", "", management23);
        userTypes.User user27 = maintainUser0.login("hi!", "hi!");
        java.lang.String str28 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test122");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintaining.MaintainUser maintainUser1 = new maintaining.MaintainUser();
        userTypes.User[] userArray2 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList3 = new java.util.ArrayList<userTypes.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList3, userArray2);
        maintainUser1.users = userList3;
        java.util.ArrayList<userTypes.User> userList6 = maintainUser1.users;
        userTypes.User user9 = maintainUser1.login("hi!", "hi!");
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser1.register("", "hi!", "", management13);
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        userTypes.User[] userArray16 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList17 = new java.util.ArrayList<userTypes.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList17, userArray16);
        maintainUser15.users = userList17;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser15.users;
        userTypes.User user23 = maintainUser15.login("hi!", "hi!");
        structure.Management management27 = null;
        userTypes.User user28 = maintainUser15.register("hi!", "", "hi!", management27);
        java.util.ArrayList<userTypes.User> userList29 = maintainUser15.users;
        maintainUser1.users = userList29;
        maintainUser0.users = userList29;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        userTypes.User[] userArray33 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList34 = new java.util.ArrayList<userTypes.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList34, userArray33);
        maintainUser32.users = userList34;
        java.util.ArrayList<userTypes.User> userList37 = maintainUser32.users;
        userTypes.User user40 = maintainUser32.login("hi!", "hi!");
        structure.Management management44 = null;
        userTypes.User user45 = maintainUser32.register("", "hi!", "", management44);
        maintaining.MaintainUser maintainUser46 = new maintaining.MaintainUser();
        userTypes.User[] userArray47 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList48 = new java.util.ArrayList<userTypes.User>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList48, userArray47);
        maintainUser46.users = userList48;
        java.util.ArrayList<userTypes.User> userList51 = maintainUser46.users;
        userTypes.User user54 = maintainUser46.login("hi!", "hi!");
        structure.Management management58 = null;
        userTypes.User user59 = maintainUser46.register("hi!", "", "hi!", management58);
        java.util.ArrayList<userTypes.User> userList60 = maintainUser46.users;
        maintainUser32.users = userList60;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser32.users;
        maintainUser0.users = userList62;
        structure.Management management67 = null;
        userTypes.User user68 = maintainUser0.register("hi!", "hi!", "", management67);
        java.util.ArrayList<userTypes.User> userList69 = maintainUser0.users;
        java.lang.Class<?> wildcardClass70 = userList69.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test123");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass23 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test124");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        structure.Management management23 = null;
        userTypes.User user24 = maintainUser0.register("hi!", "", "", management23);
        userTypes.User user27 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test125");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.lang.String str57 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test126");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("hi!", "hi!", "hi!", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser0.register("hi!", "", "", management42);
        userTypes.User user46 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user46);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test127");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.util.ArrayList<userTypes.User> userList13 = maintainUser0.users;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        userTypes.User[] userArray16 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList17 = new java.util.ArrayList<userTypes.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList17, userArray16);
        maintainUser15.users = userList17;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser15.users;
        userTypes.User user23 = maintainUser15.login("hi!", "hi!");
        structure.Management management27 = null;
        userTypes.User user28 = maintainUser15.register("", "hi!", "", management27);
        maintaining.MaintainUser maintainUser29 = new maintaining.MaintainUser();
        userTypes.User[] userArray30 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList31 = new java.util.ArrayList<userTypes.User>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList31, userArray30);
        maintainUser29.users = userList31;
        java.util.ArrayList<userTypes.User> userList34 = maintainUser29.users;
        userTypes.User user37 = maintainUser29.login("hi!", "hi!");
        structure.Management management41 = null;
        userTypes.User user42 = maintainUser29.register("hi!", "", "hi!", management41);
        java.util.ArrayList<userTypes.User> userList43 = maintainUser29.users;
        maintainUser15.users = userList43;
        maintainUser14.users = userList43;
        structure.Management management49 = null;
        userTypes.User user50 = maintainUser14.register("", "hi!", "hi!", management49);
        userTypes.User user53 = maintainUser14.login("", "hi!");
        java.util.ArrayList<userTypes.User> userList54 = maintainUser14.users;
        maintainUser0.users = userList54;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList54);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test128");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser0.register("hi!", "hi!", "", management21);
        java.lang.String str23 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test129");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        java.lang.String str20 = maintainUser0.path;
        java.lang.Class<?> wildcardClass21 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test130");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("hi!", "hi!", "hi!", management37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test131");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        userTypes.User user25 = maintainUser17.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser17.register("", "hi!", "", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        java.util.ArrayList<userTypes.User> userList45 = maintainUser31.users;
        maintainUser17.users = userList45;
        java.util.ArrayList<userTypes.User> userList47 = maintainUser17.users;
        maintainUser0.users = userList47;
        userTypes.User user51 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user51);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test132");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList8 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test133");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        maintainUser0.path = "";
        maintainUser0.path = "";
        structure.Management management70 = null;
        userTypes.User user71 = maintainUser0.register("hi!", "hi!", "", management70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test134");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test135");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test136");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str26 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test137");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        userTypes.User user19 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test138");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test139");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        userTypes.User user21 = maintainUser0.login("", "");
        structure.Management management25 = null;
        userTypes.User user26 = maintainUser0.register("hi!", "", "hi!", management25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test140");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        userTypes.User user19 = maintainUser0.login("", "");
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test141");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        maintainUser19.path = "hi!";
        java.lang.String str22 = maintainUser19.path;
        userTypes.User user25 = maintainUser19.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser26 = new maintaining.MaintainUser();
        userTypes.User[] userArray27 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList28 = new java.util.ArrayList<userTypes.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList28, userArray27);
        maintainUser26.users = userList28;
        java.util.ArrayList<userTypes.User> userList31 = maintainUser26.users;
        structure.Management management35 = null;
        userTypes.User user36 = maintainUser26.register("hi!", "", "", management35);
        structure.Management management40 = null;
        userTypes.User user41 = maintainUser26.register("hi!", "hi!", "hi!", management40);
        userTypes.User user44 = maintainUser26.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser26.register("", "", "hi!", management48);
        maintaining.MaintainUser maintainUser50 = new maintaining.MaintainUser();
        userTypes.User[] userArray51 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList52 = new java.util.ArrayList<userTypes.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList52, userArray51);
        maintainUser50.users = userList52;
        java.util.ArrayList<userTypes.User> userList55 = maintainUser50.users;
        userTypes.User user58 = maintainUser50.login("hi!", "hi!");
        structure.Management management62 = null;
        userTypes.User user63 = maintainUser50.register("hi!", "", "hi!", management62);
        maintainUser50.path = "";
        maintaining.MaintainUser maintainUser66 = new maintaining.MaintainUser();
        userTypes.User[] userArray67 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList68 = new java.util.ArrayList<userTypes.User>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList68, userArray67);
        maintainUser66.users = userList68;
        java.util.ArrayList<userTypes.User> userList71 = maintainUser66.users;
        maintainUser50.users = userList71;
        maintainUser26.users = userList71;
        maintainUser19.users = userList71;
        maintainUser0.users = userList71;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList71);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test142");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        java.lang.String str16 = maintainUser0.path;
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test143");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser35 = new maintaining.MaintainUser();
        userTypes.User[] userArray36 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList37 = new java.util.ArrayList<userTypes.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList37, userArray36);
        maintainUser35.users = userList37;
        java.util.ArrayList<userTypes.User> userList40 = maintainUser35.users;
        structure.Management management44 = null;
        userTypes.User user45 = maintainUser35.register("hi!", "", "", management44);
        structure.Management management49 = null;
        userTypes.User user50 = maintainUser35.register("hi!", "hi!", "hi!", management49);
        userTypes.User user53 = maintainUser35.login("hi!", "hi!");
        structure.Management management57 = null;
        userTypes.User user58 = maintainUser35.register("", "hi!", "hi!", management57);
        maintainUser35.path = "hi!";
        java.util.ArrayList<userTypes.User> userList61 = maintainUser35.users;
        maintainUser0.users = userList61;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test144");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        structure.Management management17 = null;
        userTypes.User user18 = maintainUser0.register("hi!", "hi!", "hi!", management17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test145");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        structure.Management management23 = null;
        userTypes.User user24 = maintainUser0.register("hi!", "hi!", "", management23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test146");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList28 = null;
        maintainUser0.users = userList28;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test147");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        userTypes.User user65 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList66 = maintainUser0.users;
        java.lang.Class<?> wildcardClass67 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test148");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser17.register("hi!", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser17.register("hi!", "hi!", "hi!", management31);
        userTypes.User user35 = maintainUser17.login("hi!", "hi!");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser17.register("", "", "hi!", management39);
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("hi!", "", "hi!", management53);
        maintainUser41.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser57.users;
        maintainUser41.users = userList62;
        maintainUser17.users = userList62;
        maintainUser0.users = userList62;
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test149");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        maintainUser17.path = "";
        structure.Management management28 = null;
        userTypes.User user29 = maintainUser17.register("hi!", "", "", management28);
        java.lang.String str30 = maintainUser17.path;
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser17.users = userList52;
        maintainUser0.users = userList52;
        structure.Management management59 = null;
        userTypes.User user60 = maintainUser0.register("hi!", "hi!", "", management59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user60);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test150");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        structure.Management management17 = null;
        userTypes.User user18 = maintainUser0.register("hi!", "hi!", "hi!", management17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test151");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        userTypes.User user19 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList20 = null;
        maintainUser0.users = userList20;
        maintaining.MaintainUser maintainUser22 = new maintaining.MaintainUser();
        userTypes.User[] userArray23 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList24 = new java.util.ArrayList<userTypes.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList24, userArray23);
        maintainUser22.users = userList24;
        java.util.ArrayList<userTypes.User> userList27 = maintainUser22.users;
        userTypes.User user30 = maintainUser22.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser22.register("hi!", "", "hi!", management34);
        java.util.ArrayList<userTypes.User> userList36 = maintainUser22.users;
        maintaining.MaintainUser maintainUser37 = new maintaining.MaintainUser();
        maintainUser37.path = "hi!";
        java.util.ArrayList<userTypes.User> userList40 = maintainUser37.users;
        maintainUser22.users = userList40;
        maintainUser0.users = userList40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test152");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        maintainUser32.path = "hi!";
        java.lang.String str35 = maintainUser32.path;
        userTypes.User user38 = maintainUser32.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser39 = new maintaining.MaintainUser();
        userTypes.User[] userArray40 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList41 = new java.util.ArrayList<userTypes.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList41, userArray40);
        maintainUser39.users = userList41;
        java.util.ArrayList<userTypes.User> userList44 = maintainUser39.users;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser39.register("hi!", "", "", management48);
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser39.register("hi!", "hi!", "hi!", management53);
        userTypes.User user57 = maintainUser39.login("hi!", "hi!");
        structure.Management management61 = null;
        userTypes.User user62 = maintainUser39.register("", "", "hi!", management61);
        maintaining.MaintainUser maintainUser63 = new maintaining.MaintainUser();
        userTypes.User[] userArray64 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList65 = new java.util.ArrayList<userTypes.User>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList65, userArray64);
        maintainUser63.users = userList65;
        java.util.ArrayList<userTypes.User> userList68 = maintainUser63.users;
        userTypes.User user71 = maintainUser63.login("hi!", "hi!");
        structure.Management management75 = null;
        userTypes.User user76 = maintainUser63.register("hi!", "", "hi!", management75);
        maintainUser63.path = "";
        maintaining.MaintainUser maintainUser79 = new maintaining.MaintainUser();
        userTypes.User[] userArray80 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList81 = new java.util.ArrayList<userTypes.User>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList81, userArray80);
        maintainUser79.users = userList81;
        java.util.ArrayList<userTypes.User> userList84 = maintainUser79.users;
        maintainUser63.users = userList84;
        maintainUser39.users = userList84;
        maintainUser32.users = userList84;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser32.users;
        maintainUser0.users = userList88;
        userTypes.User user92 = maintainUser0.login("", "");
        userTypes.User user95 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user95);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test153");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser0.register("hi!", "hi!", "hi!", management21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test154");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        userTypes.User user9 = maintainUser0.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList10 = maintainUser0.users;
        userTypes.User user13 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test155");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        maintainUser15.path = "hi!";
        java.util.ArrayList<userTypes.User> userList18 = maintainUser15.users;
        maintainUser0.users = userList18;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        maintaining.MaintainUser maintainUser21 = new maintaining.MaintainUser();
        maintainUser21.path = "hi!";
        java.lang.String str24 = maintainUser21.path;
        userTypes.User user27 = maintainUser21.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser28 = new maintaining.MaintainUser();
        userTypes.User[] userArray29 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList30 = new java.util.ArrayList<userTypes.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList30, userArray29);
        maintainUser28.users = userList30;
        java.util.ArrayList<userTypes.User> userList33 = maintainUser28.users;
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser28.register("hi!", "", "", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser28.register("hi!", "hi!", "hi!", management42);
        userTypes.User user46 = maintainUser28.login("hi!", "hi!");
        structure.Management management50 = null;
        userTypes.User user51 = maintainUser28.register("", "", "hi!", management50);
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        userTypes.User user60 = maintainUser52.login("hi!", "hi!");
        structure.Management management64 = null;
        userTypes.User user65 = maintainUser52.register("hi!", "", "hi!", management64);
        maintainUser52.path = "";
        maintaining.MaintainUser maintainUser68 = new maintaining.MaintainUser();
        userTypes.User[] userArray69 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList70 = new java.util.ArrayList<userTypes.User>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList70, userArray69);
        maintainUser68.users = userList70;
        java.util.ArrayList<userTypes.User> userList73 = maintainUser68.users;
        maintainUser52.users = userList73;
        maintainUser28.users = userList73;
        maintainUser21.users = userList73;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser21.users;
        maintainUser0.users = userList77;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test156");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test157");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass24 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test158");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        java.util.ArrayList<userTypes.User> userList8 = maintainUser3.users;
        userTypes.User user11 = maintainUser3.login("hi!", "hi!");
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser3.register("hi!", "", "hi!", management15);
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        maintainUser3.users = userList24;
        maintainUser0.users = userList24;
        java.lang.String str27 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test159");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.lang.String str57 = maintainUser0.path;
        maintaining.MaintainUser maintainUser58 = new maintaining.MaintainUser();
        userTypes.User[] userArray59 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList60 = new java.util.ArrayList<userTypes.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList60, userArray59);
        maintainUser58.users = userList60;
        java.util.ArrayList<userTypes.User> userList63 = maintainUser58.users;
        userTypes.User user66 = maintainUser58.login("hi!", "hi!");
        structure.Management management70 = null;
        userTypes.User user71 = maintainUser58.register("", "hi!", "", management70);
        userTypes.User user74 = maintainUser58.login("", "");
        java.util.ArrayList<userTypes.User> userList75 = maintainUser58.users;
        maintainUser0.users = userList75;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser0.users;
        maintainUser0.path = "";
        userTypes.User user82 = maintainUser0.login("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user82);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test160");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("", "", "hi!", management37);
        java.util.ArrayList<userTypes.User> userList39 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test161");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        maintainUser0.path = "hi!";
        structure.Management management62 = null;
        userTypes.User user63 = maintainUser0.register("hi!", "", "", management62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user63);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test162");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        userTypes.User user26 = maintainUser0.login("hi!", "");
        java.lang.String str27 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test163");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test164");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        maintaining.MaintainUser maintainUser29 = new maintaining.MaintainUser();
        maintainUser29.path = "hi!";
        java.lang.String str32 = maintainUser29.path;
        userTypes.User user35 = maintainUser29.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        structure.Management management45 = null;
        userTypes.User user46 = maintainUser36.register("hi!", "", "", management45);
        structure.Management management50 = null;
        userTypes.User user51 = maintainUser36.register("hi!", "hi!", "hi!", management50);
        userTypes.User user54 = maintainUser36.login("hi!", "hi!");
        structure.Management management58 = null;
        userTypes.User user59 = maintainUser36.register("", "", "hi!", management58);
        maintaining.MaintainUser maintainUser60 = new maintaining.MaintainUser();
        userTypes.User[] userArray61 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList62 = new java.util.ArrayList<userTypes.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList62, userArray61);
        maintainUser60.users = userList62;
        java.util.ArrayList<userTypes.User> userList65 = maintainUser60.users;
        userTypes.User user68 = maintainUser60.login("hi!", "hi!");
        structure.Management management72 = null;
        userTypes.User user73 = maintainUser60.register("hi!", "", "hi!", management72);
        maintainUser60.path = "";
        maintaining.MaintainUser maintainUser76 = new maintaining.MaintainUser();
        userTypes.User[] userArray77 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList78 = new java.util.ArrayList<userTypes.User>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList78, userArray77);
        maintainUser76.users = userList78;
        java.util.ArrayList<userTypes.User> userList81 = maintainUser76.users;
        maintainUser60.users = userList81;
        maintainUser36.users = userList81;
        maintainUser29.users = userList81;
        java.util.ArrayList<userTypes.User> userList85 = maintainUser29.users;
        maintainUser24.users = userList85;
        maintainUser0.users = userList85;
        userTypes.User user90 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user90);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test165");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("", "hi!", "", management53);
        maintaining.MaintainUser maintainUser55 = new maintaining.MaintainUser();
        userTypes.User[] userArray56 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList57 = new java.util.ArrayList<userTypes.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList57, userArray56);
        maintainUser55.users = userList57;
        java.util.ArrayList<userTypes.User> userList60 = maintainUser55.users;
        maintainUser41.users = userList60;
        java.lang.String str62 = maintainUser41.path;
        java.util.ArrayList<userTypes.User> userList63 = maintainUser41.users;
        maintainUser0.users = userList63;
        java.util.ArrayList<userTypes.User> userList65 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList65);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test166");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser17.register("hi!", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser17.register("hi!", "hi!", "hi!", management31);
        userTypes.User user35 = maintainUser17.login("hi!", "hi!");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser17.register("", "", "hi!", management39);
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("hi!", "", "hi!", management53);
        maintainUser41.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser57.users;
        maintainUser41.users = userList62;
        maintainUser17.users = userList62;
        maintainUser0.users = userList62;
        java.util.ArrayList<userTypes.User> userList66 = maintainUser0.users;
        java.lang.Class<?> wildcardClass67 = userList66.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test167");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        maintainUser32.path = "hi!";
        java.lang.String str35 = maintainUser32.path;
        userTypes.User user38 = maintainUser32.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser39 = new maintaining.MaintainUser();
        userTypes.User[] userArray40 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList41 = new java.util.ArrayList<userTypes.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList41, userArray40);
        maintainUser39.users = userList41;
        java.util.ArrayList<userTypes.User> userList44 = maintainUser39.users;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser39.register("hi!", "", "", management48);
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser39.register("hi!", "hi!", "hi!", management53);
        userTypes.User user57 = maintainUser39.login("hi!", "hi!");
        structure.Management management61 = null;
        userTypes.User user62 = maintainUser39.register("", "", "hi!", management61);
        maintaining.MaintainUser maintainUser63 = new maintaining.MaintainUser();
        userTypes.User[] userArray64 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList65 = new java.util.ArrayList<userTypes.User>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList65, userArray64);
        maintainUser63.users = userList65;
        java.util.ArrayList<userTypes.User> userList68 = maintainUser63.users;
        userTypes.User user71 = maintainUser63.login("hi!", "hi!");
        structure.Management management75 = null;
        userTypes.User user76 = maintainUser63.register("hi!", "", "hi!", management75);
        maintainUser63.path = "";
        maintaining.MaintainUser maintainUser79 = new maintaining.MaintainUser();
        userTypes.User[] userArray80 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList81 = new java.util.ArrayList<userTypes.User>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList81, userArray80);
        maintainUser79.users = userList81;
        java.util.ArrayList<userTypes.User> userList84 = maintainUser79.users;
        maintainUser63.users = userList84;
        maintainUser39.users = userList84;
        maintainUser32.users = userList84;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser32.users;
        maintainUser0.users = userList88;
        java.util.ArrayList<userTypes.User> userList90 = maintainUser0.users;
        structure.Management management94 = null;
        userTypes.User user95 = maintainUser0.register("", "", "", management94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user95);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test168");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        structure.Management management8 = null;
        userTypes.User user9 = maintainUser0.register("", "", "", management8);
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser0.register("", "", "hi!", management13);
        userTypes.User user17 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test169");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "", "hi!", management10);
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass16 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test170");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        java.lang.String str7 = maintainUser0.path;
        maintaining.MaintainUser maintainUser8 = new maintaining.MaintainUser();
        userTypes.User[] userArray9 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList10 = new java.util.ArrayList<userTypes.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList10, userArray9);
        maintainUser8.users = userList10;
        java.util.ArrayList<userTypes.User> userList13 = maintainUser8.users;
        userTypes.User user16 = maintainUser8.login("hi!", "hi!");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser8.register("hi!", "", "hi!", management20);
        maintainUser8.path = "";
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        java.util.ArrayList<userTypes.User> userList29 = maintainUser24.users;
        maintainUser8.users = userList29;
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser8.register("", "", "", management34);
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser8.register("", "hi!", "", management39);
        java.lang.String str41 = maintainUser8.path;
        java.util.ArrayList<userTypes.User> userList42 = maintainUser8.users;
        maintainUser0.users = userList42;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test171");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        userTypes.User user8 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test172");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        maintainUser17.path = "hi!";
        maintaining.MaintainUser maintainUser20 = new maintaining.MaintainUser();
        userTypes.User[] userArray21 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList22 = new java.util.ArrayList<userTypes.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList22, userArray21);
        maintainUser20.users = userList22;
        java.util.ArrayList<userTypes.User> userList25 = maintainUser20.users;
        userTypes.User user28 = maintainUser20.login("hi!", "hi!");
        structure.Management management32 = null;
        userTypes.User user33 = maintainUser20.register("hi!", "", "hi!", management32);
        maintainUser20.path = "";
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        maintainUser20.users = userList41;
        maintainUser17.users = userList41;
        maintainUser0.users = userList41;
        java.util.ArrayList<userTypes.User> userList45 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test173");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList6 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test174");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser0.register("hi!", "hi!", "", management21);
        userTypes.User user25 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test175");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList10 = maintainUser0.users;
        java.lang.String str11 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test176");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test177");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str18 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test178");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        structure.Management management10 = null;
        userTypes.User user11 = maintainUser0.register("", "", "hi!", management10);
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test179");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintaining.MaintainUser maintainUser6 = new maintaining.MaintainUser();
        maintainUser6.path = "hi!";
        java.lang.String str9 = maintainUser6.path;
        userTypes.User user12 = maintainUser6.login("hi!", "hi!");
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser6.register("", "", "hi!", management16);
        maintainUser6.path = "";
        maintaining.MaintainUser maintainUser20 = new maintaining.MaintainUser();
        userTypes.User[] userArray21 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList22 = new java.util.ArrayList<userTypes.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList22, userArray21);
        maintainUser20.users = userList22;
        maintainUser6.users = userList22;
        maintainUser0.users = userList22;
        maintaining.MaintainUser maintainUser27 = new maintaining.MaintainUser();
        maintainUser27.path = "hi!";
        java.lang.String str30 = maintainUser27.path;
        userTypes.User user33 = maintainUser27.login("hi!", "hi!");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser27.register("", "", "hi!", management37);
        maintainUser27.path = "";
        java.util.ArrayList<userTypes.User> userList41 = maintainUser27.users;
        maintainUser0.users = userList41;
        java.lang.String str43 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test180");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.lang.Class<?> wildcardClass56 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test181");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser69 = new maintaining.MaintainUser();
        userTypes.User[] userArray70 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList71 = new java.util.ArrayList<userTypes.User>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList71, userArray70);
        maintainUser69.users = userList71;
        java.util.ArrayList<userTypes.User> userList74 = maintainUser69.users;
        userTypes.User user77 = maintainUser69.login("hi!", "hi!");
        structure.Management management81 = null;
        userTypes.User user82 = maintainUser69.register("", "hi!", "", management81);
        maintaining.MaintainUser maintainUser83 = new maintaining.MaintainUser();
        userTypes.User[] userArray84 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList85 = new java.util.ArrayList<userTypes.User>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList85, userArray84);
        maintainUser83.users = userList85;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser83.users;
        maintainUser69.users = userList88;
        java.lang.String str90 = maintainUser69.path;
        java.util.ArrayList<userTypes.User> userList91 = maintainUser69.users;
        maintainUser0.users = userList91;
        java.util.ArrayList<userTypes.User> userList93 = maintainUser0.users;
        java.util.ArrayList<userTypes.User> userList94 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList94);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test182");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        userTypes.User user25 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList26 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test183");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser0.register("", "hi!", "", management15);
        userTypes.User user19 = maintainUser0.login("hi!", "");
        java.lang.String str20 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test184");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        java.util.ArrayList<userTypes.User> userList8 = maintainUser3.users;
        userTypes.User user11 = maintainUser3.login("hi!", "hi!");
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser3.register("hi!", "", "hi!", management15);
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        userTypes.User[] userArray20 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList21 = new java.util.ArrayList<userTypes.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList21, userArray20);
        maintainUser19.users = userList21;
        java.util.ArrayList<userTypes.User> userList24 = maintainUser19.users;
        maintainUser3.users = userList24;
        maintainUser0.users = userList24;
        maintaining.MaintainUser maintainUser27 = new maintaining.MaintainUser();
        maintainUser27.path = "hi!";
        java.util.ArrayList<userTypes.User> userList30 = maintainUser27.users;
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser27.register("hi!", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        userTypes.User user43 = maintainUser36.login("hi!", "hi!");
        java.lang.String str44 = maintainUser36.path;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "hi!", "", management48);
        userTypes.User user52 = maintainUser36.login("", "hi!");
        java.util.ArrayList<userTypes.User> userList53 = maintainUser36.users;
        maintainUser27.users = userList53;
        maintainUser0.users = userList53;
        java.lang.Class<?> wildcardClass56 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test185");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser0.register("", "", "hi!", management22);
        maintainUser0.path = "";
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "hi!", "", management29);
        java.lang.String str31 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test186");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        userTypes.User user19 = maintainUser0.login("", "");
        userTypes.User user22 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList23 = maintainUser0.users;
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test187");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        userTypes.User user24 = maintainUser0.login("hi!", "hi!");
        structure.Management management28 = null;
        userTypes.User user29 = maintainUser0.register("hi!", "hi!", "hi!", management28);
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test188");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintaining.MaintainUser maintainUser6 = new maintaining.MaintainUser();
        userTypes.User[] userArray7 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList8 = new java.util.ArrayList<userTypes.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList8, userArray7);
        maintainUser6.users = userList8;
        java.util.ArrayList<userTypes.User> userList11 = maintainUser6.users;
        userTypes.User user14 = maintainUser6.login("hi!", "hi!");
        structure.Management management18 = null;
        userTypes.User user19 = maintainUser6.register("", "hi!", "", management18);
        maintaining.MaintainUser maintainUser20 = new maintaining.MaintainUser();
        userTypes.User[] userArray21 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList22 = new java.util.ArrayList<userTypes.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList22, userArray21);
        maintainUser20.users = userList22;
        java.util.ArrayList<userTypes.User> userList25 = maintainUser20.users;
        maintainUser6.users = userList25;
        java.lang.String str27 = maintainUser6.path;
        java.util.ArrayList<userTypes.User> userList28 = maintainUser6.users;
        maintaining.MaintainUser maintainUser29 = new maintaining.MaintainUser();
        userTypes.User[] userArray30 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList31 = new java.util.ArrayList<userTypes.User>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList31, userArray30);
        maintainUser29.users = userList31;
        java.util.ArrayList<userTypes.User> userList34 = maintainUser29.users;
        userTypes.User user37 = maintainUser29.login("hi!", "hi!");
        structure.Management management41 = null;
        userTypes.User user42 = maintainUser29.register("hi!", "", "hi!", management41);
        maintainUser29.path = "";
        maintaining.MaintainUser maintainUser45 = new maintaining.MaintainUser();
        userTypes.User[] userArray46 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList47 = new java.util.ArrayList<userTypes.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList47, userArray46);
        maintainUser45.users = userList47;
        java.util.ArrayList<userTypes.User> userList50 = maintainUser45.users;
        maintainUser29.users = userList50;
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        maintainUser29.users = userList54;
        maintainUser6.users = userList54;
        maintainUser0.users = userList54;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test189");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test190");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser69 = new maintaining.MaintainUser();
        userTypes.User[] userArray70 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList71 = new java.util.ArrayList<userTypes.User>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList71, userArray70);
        maintainUser69.users = userList71;
        java.util.ArrayList<userTypes.User> userList74 = maintainUser69.users;
        userTypes.User user77 = maintainUser69.login("hi!", "hi!");
        structure.Management management81 = null;
        userTypes.User user82 = maintainUser69.register("", "hi!", "", management81);
        maintaining.MaintainUser maintainUser83 = new maintaining.MaintainUser();
        userTypes.User[] userArray84 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList85 = new java.util.ArrayList<userTypes.User>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList85, userArray84);
        maintainUser83.users = userList85;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser83.users;
        maintainUser69.users = userList88;
        java.lang.String str90 = maintainUser69.path;
        java.util.ArrayList<userTypes.User> userList91 = maintainUser69.users;
        maintainUser0.users = userList91;
        java.util.ArrayList<userTypes.User> userList93 = maintainUser0.users;
        structure.Management management97 = null;
        userTypes.User user98 = maintainUser0.register("", "", "", management97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user98);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test191");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test192");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("hi!", "");
        userTypes.User user19 = maintainUser0.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList20 = maintainUser0.users;
        java.lang.String str21 = maintainUser0.path;
        userTypes.User user24 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test193");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser8 = new maintaining.MaintainUser();
        userTypes.User[] userArray9 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList10 = new java.util.ArrayList<userTypes.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList10, userArray9);
        maintainUser8.users = userList10;
        java.util.ArrayList<userTypes.User> userList13 = maintainUser8.users;
        userTypes.User user16 = maintainUser8.login("hi!", "hi!");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser8.register("", "hi!", "", management20);
        maintaining.MaintainUser maintainUser22 = new maintaining.MaintainUser();
        userTypes.User[] userArray23 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList24 = new java.util.ArrayList<userTypes.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList24, userArray23);
        maintainUser22.users = userList24;
        java.util.ArrayList<userTypes.User> userList27 = maintainUser22.users;
        maintainUser8.users = userList27;
        java.lang.String str29 = maintainUser8.path;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser8.users;
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintaining.MaintainUser maintainUser54 = new maintaining.MaintainUser();
        userTypes.User[] userArray55 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList56 = new java.util.ArrayList<userTypes.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList56, userArray55);
        maintainUser54.users = userList56;
        maintainUser31.users = userList56;
        maintainUser8.users = userList56;
        maintainUser0.users = userList56;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser0.users;
        structure.Management management66 = null;
        userTypes.User user67 = maintainUser0.register("hi!", "hi!", "", management66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass68 = user67.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user67);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test194");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        userTypes.User user21 = maintainUser0.login("", "");
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList24 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test195");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("hi!", "");
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test196");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        structure.Management management8 = null;
        userTypes.User user9 = maintainUser0.register("", "", "", management8);
        structure.Management management13 = null;
        userTypes.User user14 = maintainUser0.register("", "", "hi!", management13);
        maintainUser0.path = "";
        userTypes.User user19 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test197");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test198");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList7 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test199");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        maintainUser17.path = "";
        structure.Management management28 = null;
        userTypes.User user29 = maintainUser17.register("hi!", "", "", management28);
        java.lang.String str30 = maintainUser17.path;
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser17.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.lang.Class<?> wildcardClass57 = userList56.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test200");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        java.lang.String str16 = maintainUser0.path;
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser0.register("", "", "", management20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test201");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser17.register("hi!", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser17.register("hi!", "hi!", "hi!", management31);
        userTypes.User user35 = maintainUser17.login("hi!", "hi!");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser17.register("", "", "hi!", management39);
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("hi!", "", "hi!", management53);
        maintainUser41.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser57.users;
        maintainUser41.users = userList62;
        maintainUser17.users = userList62;
        maintainUser0.users = userList62;
        java.util.ArrayList<userTypes.User> userList66 = maintainUser0.users;
        java.lang.String str67 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test202");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        java.lang.String str31 = maintainUser0.path;
        userTypes.User user34 = maintainUser0.login("", "");
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user34);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test203");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        userTypes.User[] userArray33 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList34 = new java.util.ArrayList<userTypes.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList34, userArray33);
        maintainUser32.users = userList34;
        java.util.ArrayList<userTypes.User> userList37 = maintainUser32.users;
        structure.Management management41 = null;
        userTypes.User user42 = maintainUser32.register("hi!", "", "", management41);
        structure.Management management46 = null;
        userTypes.User user47 = maintainUser32.register("hi!", "hi!", "hi!", management46);
        userTypes.User user50 = maintainUser32.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser51 = new maintaining.MaintainUser();
        userTypes.User[] userArray52 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList53 = new java.util.ArrayList<userTypes.User>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList53, userArray52);
        maintainUser51.users = userList53;
        userTypes.User user58 = maintainUser51.login("hi!", "hi!");
        java.lang.String str59 = maintainUser51.path;
        structure.Management management63 = null;
        userTypes.User user64 = maintainUser51.register("hi!", "hi!", "", management63);
        userTypes.User user67 = maintainUser51.login("", "hi!");
        maintaining.MaintainUser maintainUser68 = new maintaining.MaintainUser();
        maintainUser68.path = "hi!";
        maintaining.MaintainUser maintainUser71 = new maintaining.MaintainUser();
        userTypes.User[] userArray72 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList73 = new java.util.ArrayList<userTypes.User>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList73, userArray72);
        maintainUser71.users = userList73;
        java.util.ArrayList<userTypes.User> userList76 = maintainUser71.users;
        userTypes.User user79 = maintainUser71.login("hi!", "hi!");
        structure.Management management83 = null;
        userTypes.User user84 = maintainUser71.register("hi!", "", "hi!", management83);
        maintainUser71.path = "";
        maintaining.MaintainUser maintainUser87 = new maintaining.MaintainUser();
        userTypes.User[] userArray88 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList89 = new java.util.ArrayList<userTypes.User>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList89, userArray88);
        maintainUser87.users = userList89;
        java.util.ArrayList<userTypes.User> userList92 = maintainUser87.users;
        maintainUser71.users = userList92;
        maintainUser68.users = userList92;
        maintainUser51.users = userList92;
        maintainUser32.users = userList92;
        maintainUser0.users = userList92;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test204");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        maintainUser32.path = "hi!";
        java.lang.String str35 = maintainUser32.path;
        userTypes.User user38 = maintainUser32.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser39 = new maintaining.MaintainUser();
        userTypes.User[] userArray40 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList41 = new java.util.ArrayList<userTypes.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList41, userArray40);
        maintainUser39.users = userList41;
        java.util.ArrayList<userTypes.User> userList44 = maintainUser39.users;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser39.register("hi!", "", "", management48);
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser39.register("hi!", "hi!", "hi!", management53);
        userTypes.User user57 = maintainUser39.login("hi!", "hi!");
        structure.Management management61 = null;
        userTypes.User user62 = maintainUser39.register("", "", "hi!", management61);
        maintaining.MaintainUser maintainUser63 = new maintaining.MaintainUser();
        userTypes.User[] userArray64 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList65 = new java.util.ArrayList<userTypes.User>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList65, userArray64);
        maintainUser63.users = userList65;
        java.util.ArrayList<userTypes.User> userList68 = maintainUser63.users;
        userTypes.User user71 = maintainUser63.login("hi!", "hi!");
        structure.Management management75 = null;
        userTypes.User user76 = maintainUser63.register("hi!", "", "hi!", management75);
        maintainUser63.path = "";
        maintaining.MaintainUser maintainUser79 = new maintaining.MaintainUser();
        userTypes.User[] userArray80 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList81 = new java.util.ArrayList<userTypes.User>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList81, userArray80);
        maintainUser79.users = userList81;
        java.util.ArrayList<userTypes.User> userList84 = maintainUser79.users;
        maintainUser63.users = userList84;
        maintainUser39.users = userList84;
        maintainUser32.users = userList84;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser32.users;
        maintainUser0.users = userList88;
        java.util.ArrayList<userTypes.User> userList90 = maintainUser0.users;
        java.lang.Class<?> wildcardClass91 = userList90.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test205");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        structure.Management management15 = null;
        userTypes.User user16 = maintainUser0.register("", "hi!", "", management15);
        userTypes.User user19 = maintainUser0.login("hi!", "");
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test206");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser0.users;
        java.lang.String str57 = maintainUser0.path;
        maintaining.MaintainUser maintainUser58 = new maintaining.MaintainUser();
        userTypes.User[] userArray59 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList60 = new java.util.ArrayList<userTypes.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList60, userArray59);
        maintainUser58.users = userList60;
        java.util.ArrayList<userTypes.User> userList63 = maintainUser58.users;
        userTypes.User user66 = maintainUser58.login("hi!", "hi!");
        structure.Management management70 = null;
        userTypes.User user71 = maintainUser58.register("", "hi!", "", management70);
        userTypes.User user74 = maintainUser58.login("", "");
        java.util.ArrayList<userTypes.User> userList75 = maintainUser58.users;
        maintainUser0.users = userList75;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass82 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test207");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser0.register("", "hi!", "", management20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test208");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        userTypes.User user35 = maintainUser0.login("", "");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser0.register("hi!", "hi!", "", management39);
        maintainUser0.path = "hi!";
        java.lang.String str43 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test209");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        java.lang.String str41 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test210");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        maintaining.MaintainUser maintainUser34 = new maintaining.MaintainUser();
        userTypes.User[] userArray35 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList36 = new java.util.ArrayList<userTypes.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList36, userArray35);
        maintainUser34.users = userList36;
        java.util.ArrayList<userTypes.User> userList39 = maintainUser34.users;
        maintainUser0.users = userList39;
        maintainUser0.path = "hi!";
        java.lang.String str43 = maintainUser0.path;
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test211");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        userTypes.User user25 = maintainUser0.login("", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        maintaining.MaintainUser maintainUser32 = new maintaining.MaintainUser();
        maintainUser32.path = "hi!";
        java.lang.String str35 = maintainUser32.path;
        userTypes.User user38 = maintainUser32.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser39 = new maintaining.MaintainUser();
        userTypes.User[] userArray40 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList41 = new java.util.ArrayList<userTypes.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList41, userArray40);
        maintainUser39.users = userList41;
        java.util.ArrayList<userTypes.User> userList44 = maintainUser39.users;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser39.register("hi!", "", "", management48);
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser39.register("hi!", "hi!", "hi!", management53);
        userTypes.User user57 = maintainUser39.login("hi!", "hi!");
        structure.Management management61 = null;
        userTypes.User user62 = maintainUser39.register("", "", "hi!", management61);
        maintaining.MaintainUser maintainUser63 = new maintaining.MaintainUser();
        userTypes.User[] userArray64 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList65 = new java.util.ArrayList<userTypes.User>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList65, userArray64);
        maintainUser63.users = userList65;
        java.util.ArrayList<userTypes.User> userList68 = maintainUser63.users;
        userTypes.User user71 = maintainUser63.login("hi!", "hi!");
        structure.Management management75 = null;
        userTypes.User user76 = maintainUser63.register("hi!", "", "hi!", management75);
        maintainUser63.path = "";
        maintaining.MaintainUser maintainUser79 = new maintaining.MaintainUser();
        userTypes.User[] userArray80 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList81 = new java.util.ArrayList<userTypes.User>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList81, userArray80);
        maintainUser79.users = userList81;
        java.util.ArrayList<userTypes.User> userList84 = maintainUser79.users;
        maintainUser63.users = userList84;
        maintainUser39.users = userList84;
        maintainUser32.users = userList84;
        java.util.ArrayList<userTypes.User> userList88 = maintainUser32.users;
        maintainUser0.users = userList88;
        maintainUser0.path = "";
        structure.Management management95 = null;
        userTypes.User user96 = maintainUser0.register("", "", "", management95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user96);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test212");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        userTypes.User user19 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test213");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser3 = new maintaining.MaintainUser();
        userTypes.User[] userArray4 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList5 = new java.util.ArrayList<userTypes.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList5, userArray4);
        maintainUser3.users = userList5;
        maintaining.MaintainUser maintainUser8 = new maintaining.MaintainUser();
        maintainUser8.path = "hi!";
        java.lang.String str11 = maintainUser8.path;
        userTypes.User user14 = maintainUser8.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser15 = new maintaining.MaintainUser();
        userTypes.User[] userArray16 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList17 = new java.util.ArrayList<userTypes.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList17, userArray16);
        maintainUser15.users = userList17;
        java.util.ArrayList<userTypes.User> userList20 = maintainUser15.users;
        structure.Management management24 = null;
        userTypes.User user25 = maintainUser15.register("hi!", "", "", management24);
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser15.register("hi!", "hi!", "hi!", management29);
        userTypes.User user33 = maintainUser15.login("hi!", "hi!");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser15.register("", "", "hi!", management37);
        maintaining.MaintainUser maintainUser39 = new maintaining.MaintainUser();
        userTypes.User[] userArray40 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList41 = new java.util.ArrayList<userTypes.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList41, userArray40);
        maintainUser39.users = userList41;
        java.util.ArrayList<userTypes.User> userList44 = maintainUser39.users;
        userTypes.User user47 = maintainUser39.login("hi!", "hi!");
        structure.Management management51 = null;
        userTypes.User user52 = maintainUser39.register("hi!", "", "hi!", management51);
        maintainUser39.path = "";
        maintaining.MaintainUser maintainUser55 = new maintaining.MaintainUser();
        userTypes.User[] userArray56 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList57 = new java.util.ArrayList<userTypes.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList57, userArray56);
        maintainUser55.users = userList57;
        java.util.ArrayList<userTypes.User> userList60 = maintainUser55.users;
        maintainUser39.users = userList60;
        maintainUser15.users = userList60;
        maintainUser8.users = userList60;
        java.util.ArrayList<userTypes.User> userList64 = maintainUser8.users;
        maintainUser3.users = userList64;
        maintainUser3.path = "";
        maintainUser3.path = "";
        maintainUser3.path = "";
        maintaining.MaintainUser maintainUser72 = new maintaining.MaintainUser();
        userTypes.User[] userArray73 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList74 = new java.util.ArrayList<userTypes.User>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList74, userArray73);
        maintainUser72.users = userList74;
        java.util.ArrayList<userTypes.User> userList77 = maintainUser72.users;
        userTypes.User user80 = maintainUser72.login("hi!", "hi!");
        structure.Management management84 = null;
        userTypes.User user85 = maintainUser72.register("", "hi!", "", management84);
        maintaining.MaintainUser maintainUser86 = new maintaining.MaintainUser();
        userTypes.User[] userArray87 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList88 = new java.util.ArrayList<userTypes.User>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList88, userArray87);
        maintainUser86.users = userList88;
        java.util.ArrayList<userTypes.User> userList91 = maintainUser86.users;
        maintainUser72.users = userList91;
        java.lang.String str93 = maintainUser72.path;
        java.util.ArrayList<userTypes.User> userList94 = maintainUser72.users;
        maintainUser3.users = userList94;
        java.util.ArrayList<userTypes.User> userList96 = maintainUser3.users;
        maintainUser0.users = userList96;
        java.util.ArrayList<userTypes.User> userList98 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList98);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test214");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.lang.Class<?> wildcardClass5 = userList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test215");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        userTypes.User user17 = maintainUser0.login("hi!", "hi!");
        userTypes.User user20 = maintainUser0.login("", "");
        structure.Management management24 = null;
        userTypes.User user25 = maintainUser0.register("hi!", "hi!", "", management24);
        userTypes.User user28 = maintainUser0.login("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test216");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintaining.MaintainUser maintainUser17 = new maintaining.MaintainUser();
        userTypes.User[] userArray18 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList19 = new java.util.ArrayList<userTypes.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList19, userArray18);
        maintainUser17.users = userList19;
        java.util.ArrayList<userTypes.User> userList22 = maintainUser17.users;
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser17.register("hi!", "", "", management26);
        structure.Management management31 = null;
        userTypes.User user32 = maintainUser17.register("hi!", "hi!", "hi!", management31);
        userTypes.User user35 = maintainUser17.login("hi!", "hi!");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser17.register("", "", "hi!", management39);
        maintaining.MaintainUser maintainUser41 = new maintaining.MaintainUser();
        userTypes.User[] userArray42 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList43 = new java.util.ArrayList<userTypes.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList43, userArray42);
        maintainUser41.users = userList43;
        java.util.ArrayList<userTypes.User> userList46 = maintainUser41.users;
        userTypes.User user49 = maintainUser41.login("hi!", "hi!");
        structure.Management management53 = null;
        userTypes.User user54 = maintainUser41.register("hi!", "", "hi!", management53);
        maintainUser41.path = "";
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        userTypes.User[] userArray58 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList59 = new java.util.ArrayList<userTypes.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList59, userArray58);
        maintainUser57.users = userList59;
        java.util.ArrayList<userTypes.User> userList62 = maintainUser57.users;
        maintainUser41.users = userList62;
        maintainUser17.users = userList62;
        maintainUser0.users = userList62;
        userTypes.User user68 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user68);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test217");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        maintaining.MaintainUser maintainUser34 = new maintaining.MaintainUser();
        userTypes.User[] userArray35 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList36 = new java.util.ArrayList<userTypes.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList36, userArray35);
        maintainUser34.users = userList36;
        java.util.ArrayList<userTypes.User> userList39 = maintainUser34.users;
        maintainUser0.users = userList39;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test218");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        userTypes.User user65 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList66 = maintainUser0.users;
        java.lang.Class<?> wildcardClass67 = userList66.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test219");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test220");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser9 = new maintaining.MaintainUser();
        userTypes.User[] userArray10 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList11 = new java.util.ArrayList<userTypes.User>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList11, userArray10);
        maintainUser9.users = userList11;
        java.util.ArrayList<userTypes.User> userList14 = maintainUser9.users;
        userTypes.User user17 = maintainUser9.login("hi!", "hi!");
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser9.register("hi!", "", "hi!", management21);
        java.util.ArrayList<userTypes.User> userList23 = maintainUser9.users;
        maintainUser0.users = userList23;
        maintaining.MaintainUser maintainUser25 = new maintaining.MaintainUser();
        userTypes.User[] userArray26 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList27 = new java.util.ArrayList<userTypes.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList27, userArray26);
        maintainUser25.users = userList27;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser25.users;
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser25.register("hi!", "", "", management34);
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser25.register("hi!", "hi!", "hi!", management39);
        userTypes.User user43 = maintainUser25.login("hi!", "hi!");
        structure.Management management47 = null;
        userTypes.User user48 = maintainUser25.register("", "hi!", "hi!", management47);
        maintainUser25.path = "hi!";
        java.util.ArrayList<userTypes.User> userList51 = maintainUser25.users;
        maintainUser0.users = userList51;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test221");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test222");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.lang.String str3 = maintainUser0.path;
        userTypes.User user6 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser7 = new maintaining.MaintainUser();
        userTypes.User[] userArray8 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList9 = new java.util.ArrayList<userTypes.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList9, userArray8);
        maintainUser7.users = userList9;
        java.util.ArrayList<userTypes.User> userList12 = maintainUser7.users;
        structure.Management management16 = null;
        userTypes.User user17 = maintainUser7.register("hi!", "", "", management16);
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser7.register("hi!", "hi!", "hi!", management21);
        userTypes.User user25 = maintainUser7.login("hi!", "hi!");
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser7.register("", "", "hi!", management29);
        maintaining.MaintainUser maintainUser31 = new maintaining.MaintainUser();
        userTypes.User[] userArray32 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList33 = new java.util.ArrayList<userTypes.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList33, userArray32);
        maintainUser31.users = userList33;
        java.util.ArrayList<userTypes.User> userList36 = maintainUser31.users;
        userTypes.User user39 = maintainUser31.login("hi!", "hi!");
        structure.Management management43 = null;
        userTypes.User user44 = maintainUser31.register("hi!", "", "hi!", management43);
        maintainUser31.path = "";
        maintaining.MaintainUser maintainUser47 = new maintaining.MaintainUser();
        userTypes.User[] userArray48 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList49 = new java.util.ArrayList<userTypes.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList49, userArray48);
        maintainUser47.users = userList49;
        java.util.ArrayList<userTypes.User> userList52 = maintainUser47.users;
        maintainUser31.users = userList52;
        maintainUser7.users = userList52;
        maintainUser0.users = userList52;
        userTypes.User user58 = maintainUser0.login("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user58);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test223");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser0.register("", "hi!", "hi!", management22);
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        java.util.ArrayList<userTypes.User> userList29 = maintainUser24.users;
        maintainUser24.path = "";
        structure.Management management35 = null;
        userTypes.User user36 = maintainUser24.register("hi!", "", "", management35);
        java.util.ArrayList<userTypes.User> userList37 = maintainUser24.users;
        maintainUser0.users = userList37;
        java.lang.Class<?> wildcardClass39 = userList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test224");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        java.lang.String str41 = maintainUser0.path;
        maintaining.MaintainUser maintainUser42 = new maintaining.MaintainUser();
        userTypes.User[] userArray43 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList44 = new java.util.ArrayList<userTypes.User>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList44, userArray43);
        maintainUser42.users = userList44;
        java.util.ArrayList<userTypes.User> userList47 = maintainUser42.users;
        userTypes.User user50 = maintainUser42.login("hi!", "hi!");
        structure.Management management54 = null;
        userTypes.User user55 = maintainUser42.register("hi!", "", "hi!", management54);
        java.util.ArrayList<userTypes.User> userList56 = maintainUser42.users;
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        maintainUser57.path = "hi!";
        java.util.ArrayList<userTypes.User> userList60 = maintainUser57.users;
        maintainUser42.users = userList60;
        maintainUser0.users = userList60;
        maintainUser0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test225");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        structure.Management management23 = null;
        userTypes.User user24 = maintainUser0.register("", "", "", management23);
        structure.Management management28 = null;
        userTypes.User user29 = maintainUser0.register("", "", "", management28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test226");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass19 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test227");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        userTypes.User user19 = maintainUser0.login("", "");
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass22 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test228");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        java.lang.String str21 = maintainUser0.path;
        structure.Management management25 = null;
        userTypes.User user26 = maintainUser0.register("", "", "hi!", management25);
        java.util.ArrayList<userTypes.User> userList27 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test229");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList10 = maintainUser0.users;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test230");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        java.lang.String str6 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList7 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test231");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("", "", "hi!", management9);
        userTypes.User user13 = maintainUser0.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        java.util.ArrayList<userTypes.User> userList15 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test232");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        java.lang.String str19 = maintainUser0.path;
        structure.Management management23 = null;
        userTypes.User user24 = maintainUser0.register("hi!", "", "", management23);
        userTypes.User user27 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList28 = maintainUser0.users;
        userTypes.User user31 = maintainUser0.login("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user31);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test233");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        userTypes.User user23 = maintainUser0.login("hi!", "hi!");
        userTypes.User user26 = maintainUser0.login("hi!", "");
        java.lang.String str27 = maintainUser0.path;
        userTypes.User user30 = maintainUser0.login("hi!", "hi!");
        java.util.ArrayList<userTypes.User> userList31 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test234");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        userTypes.User user19 = maintainUser0.login("", "");
        userTypes.User user22 = maintainUser0.login("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test235");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "hi!", "hi!", management14);
        userTypes.User user18 = maintainUser0.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser19 = new maintaining.MaintainUser();
        maintainUser19.path = "hi!";
        java.lang.String str22 = maintainUser19.path;
        userTypes.User user25 = maintainUser19.login("hi!", "hi!");
        userTypes.User user28 = maintainUser19.login("hi!", "");
        java.util.ArrayList<userTypes.User> userList29 = maintainUser19.users;
        maintainUser0.users = userList29;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test236");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        maintainUser0.path = "";
        maintaining.MaintainUser maintainUser16 = new maintaining.MaintainUser();
        userTypes.User[] userArray17 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList18 = new java.util.ArrayList<userTypes.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList18, userArray17);
        maintainUser16.users = userList18;
        java.util.ArrayList<userTypes.User> userList21 = maintainUser16.users;
        maintainUser0.users = userList21;
        maintaining.MaintainUser maintainUser23 = new maintaining.MaintainUser();
        userTypes.User[] userArray24 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList25 = new java.util.ArrayList<userTypes.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList25, userArray24);
        maintainUser23.users = userList25;
        maintainUser0.users = userList25;
        java.lang.String str29 = maintainUser0.path;
        userTypes.User user32 = maintainUser0.login("", "");
        userTypes.User user35 = maintainUser0.login("", "");
        structure.Management management39 = null;
        userTypes.User user40 = maintainUser0.register("hi!", "", "hi!", management39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test237");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        maintaining.MaintainUser maintainUser5 = new maintaining.MaintainUser();
        maintainUser5.path = "hi!";
        java.lang.String str8 = maintainUser5.path;
        userTypes.User user11 = maintainUser5.login("hi!", "hi!");
        maintaining.MaintainUser maintainUser12 = new maintaining.MaintainUser();
        userTypes.User[] userArray13 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList14 = new java.util.ArrayList<userTypes.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList14, userArray13);
        maintainUser12.users = userList14;
        java.util.ArrayList<userTypes.User> userList17 = maintainUser12.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser12.register("hi!", "", "", management21);
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser12.register("hi!", "hi!", "hi!", management26);
        userTypes.User user30 = maintainUser12.login("hi!", "hi!");
        structure.Management management34 = null;
        userTypes.User user35 = maintainUser12.register("", "", "hi!", management34);
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        userTypes.User user44 = maintainUser36.login("hi!", "hi!");
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser36.register("hi!", "", "hi!", management48);
        maintainUser36.path = "";
        maintaining.MaintainUser maintainUser52 = new maintaining.MaintainUser();
        userTypes.User[] userArray53 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList54 = new java.util.ArrayList<userTypes.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList54, userArray53);
        maintainUser52.users = userList54;
        java.util.ArrayList<userTypes.User> userList57 = maintainUser52.users;
        maintainUser36.users = userList57;
        maintainUser12.users = userList57;
        maintainUser5.users = userList57;
        java.util.ArrayList<userTypes.User> userList61 = maintainUser5.users;
        maintainUser0.users = userList61;
        userTypes.User user65 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList66 = maintainUser0.users;
        java.util.ArrayList<userTypes.User> userList67 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test238");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintainUser0.path = "hi!";
        java.lang.String str19 = maintainUser0.path;
        maintaining.MaintainUser maintainUser20 = new maintaining.MaintainUser();
        userTypes.User[] userArray21 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList22 = new java.util.ArrayList<userTypes.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList22, userArray21);
        maintainUser20.users = userList22;
        java.util.ArrayList<userTypes.User> userList25 = maintainUser20.users;
        userTypes.User user28 = maintainUser20.login("hi!", "hi!");
        structure.Management management32 = null;
        userTypes.User user33 = maintainUser20.register("hi!", "", "hi!", management32);
        maintainUser20.path = "";
        maintaining.MaintainUser maintainUser36 = new maintaining.MaintainUser();
        userTypes.User[] userArray37 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList38 = new java.util.ArrayList<userTypes.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList38, userArray37);
        maintainUser36.users = userList38;
        java.util.ArrayList<userTypes.User> userList41 = maintainUser36.users;
        maintainUser20.users = userList41;
        maintainUser0.users = userList41;
        java.lang.String str44 = maintainUser0.path;
        structure.Management management48 = null;
        userTypes.User user49 = maintainUser0.register("", "hi!", "hi!", management48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user49);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test239");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        userTypes.User user17 = maintainUser0.login("hi!", "hi!");
        userTypes.User user20 = maintainUser0.login("", "");
        structure.Management management24 = null;
        userTypes.User user25 = maintainUser0.register("hi!", "hi!", "", management24);
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("", "", "", management29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test240");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        structure.Management management17 = null;
        userTypes.User user18 = maintainUser0.register("hi!", "", "hi!", management17);
        maintainUser0.path = "hi!";
        maintaining.MaintainUser maintainUser21 = new maintaining.MaintainUser();
        userTypes.User[] userArray22 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList23 = new java.util.ArrayList<userTypes.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList23, userArray22);
        maintainUser21.users = userList23;
        java.util.ArrayList<userTypes.User> userList26 = maintainUser21.users;
        maintainUser21.path = "";
        structure.Management management32 = null;
        userTypes.User user33 = maintainUser21.register("hi!", "", "", management32);
        java.lang.String str34 = maintainUser21.path;
        maintaining.MaintainUser maintainUser35 = new maintaining.MaintainUser();
        userTypes.User[] userArray36 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList37 = new java.util.ArrayList<userTypes.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList37, userArray36);
        maintainUser35.users = userList37;
        java.util.ArrayList<userTypes.User> userList40 = maintainUser35.users;
        userTypes.User user43 = maintainUser35.login("hi!", "hi!");
        structure.Management management47 = null;
        userTypes.User user48 = maintainUser35.register("hi!", "", "hi!", management47);
        maintainUser35.path = "";
        maintaining.MaintainUser maintainUser51 = new maintaining.MaintainUser();
        userTypes.User[] userArray52 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList53 = new java.util.ArrayList<userTypes.User>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList53, userArray52);
        maintainUser51.users = userList53;
        java.util.ArrayList<userTypes.User> userList56 = maintainUser51.users;
        maintainUser35.users = userList56;
        maintainUser21.users = userList56;
        maintaining.MaintainUser maintainUser59 = new maintaining.MaintainUser();
        maintainUser59.path = "hi!";
        java.lang.String str62 = maintainUser59.path;
        userTypes.User user65 = maintainUser59.login("hi!", "hi!");
        structure.Management management69 = null;
        userTypes.User user70 = maintainUser59.register("", "", "hi!", management69);
        maintainUser59.path = "";
        java.util.ArrayList<userTypes.User> userList73 = maintainUser59.users;
        maintainUser21.users = userList73;
        maintainUser0.users = userList73;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test241");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        userTypes.User user17 = maintainUser0.login("hi!", "hi!");
        userTypes.User user20 = maintainUser0.login("", "");
        structure.Management management24 = null;
        userTypes.User user25 = maintainUser0.register("hi!", "hi!", "", management24);
        structure.Management management29 = null;
        userTypes.User user30 = maintainUser0.register("hi!", "", "hi!", management29);
        java.lang.String str31 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test242");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("hi!", "hi!", "hi!", management37);
        structure.Management management42 = null;
        userTypes.User user43 = maintainUser0.register("hi!", "", "hi!", management42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user43);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test243");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "");
        java.util.ArrayList<userTypes.User> userList17 = maintainUser0.users;
        structure.Management management21 = null;
        userTypes.User user22 = maintainUser0.register("hi!", "hi!", "", management21);
        userTypes.User[] userArray23 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList24 = new java.util.ArrayList<userTypes.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList24, userArray23);
        maintainUser0.users = userList24;
        java.lang.Class<?> wildcardClass27 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test244");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        java.lang.String str17 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test245");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("hi!", "", "", management9);
        java.util.ArrayList<userTypes.User> userList11 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test246");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        java.lang.String str41 = maintainUser0.path;
        maintaining.MaintainUser maintainUser42 = new maintaining.MaintainUser();
        userTypes.User[] userArray43 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList44 = new java.util.ArrayList<userTypes.User>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList44, userArray43);
        maintainUser42.users = userList44;
        java.util.ArrayList<userTypes.User> userList47 = maintainUser42.users;
        userTypes.User user50 = maintainUser42.login("hi!", "hi!");
        structure.Management management54 = null;
        userTypes.User user55 = maintainUser42.register("hi!", "", "hi!", management54);
        java.util.ArrayList<userTypes.User> userList56 = maintainUser42.users;
        maintaining.MaintainUser maintainUser57 = new maintaining.MaintainUser();
        maintainUser57.path = "hi!";
        java.util.ArrayList<userTypes.User> userList60 = maintainUser57.users;
        maintainUser42.users = userList60;
        maintainUser0.users = userList60;
        java.lang.String str63 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test247");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.lang.String str5 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test248");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        userTypes.User user7 = maintainUser0.login("hi!", "hi!");
        java.lang.String str8 = maintainUser0.path;
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("", "hi!");
        maintainUser0.path = "";
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser0.register("hi!", "hi!", "hi!", management22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test249");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        java.lang.String str21 = maintainUser0.path;
        userTypes.User user24 = maintainUser0.login("", "hi!");
        userTypes.User user27 = maintainUser0.login("hi!", "hi!");
        maintainUser0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test250");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        java.lang.String str31 = maintainUser0.path;
        userTypes.User user34 = maintainUser0.login("", "");
        maintaining.MaintainUser maintainUser35 = new maintaining.MaintainUser();
        userTypes.User[] userArray36 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList37 = new java.util.ArrayList<userTypes.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList37, userArray36);
        maintainUser35.users = userList37;
        java.util.ArrayList<userTypes.User> userList40 = maintainUser35.users;
        maintainUser35.path = "";
        structure.Management management46 = null;
        userTypes.User user47 = maintainUser35.register("hi!", "", "", management46);
        java.lang.String str48 = maintainUser35.path;
        maintaining.MaintainUser maintainUser49 = new maintaining.MaintainUser();
        userTypes.User[] userArray50 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList51 = new java.util.ArrayList<userTypes.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList51, userArray50);
        maintainUser49.users = userList51;
        java.util.ArrayList<userTypes.User> userList54 = maintainUser49.users;
        userTypes.User user57 = maintainUser49.login("hi!", "hi!");
        structure.Management management61 = null;
        userTypes.User user62 = maintainUser49.register("hi!", "", "hi!", management61);
        maintainUser49.path = "";
        maintaining.MaintainUser maintainUser65 = new maintaining.MaintainUser();
        userTypes.User[] userArray66 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList67 = new java.util.ArrayList<userTypes.User>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList67, userArray66);
        maintainUser65.users = userList67;
        java.util.ArrayList<userTypes.User> userList70 = maintainUser65.users;
        maintainUser49.users = userList70;
        maintainUser35.users = userList70;
        userTypes.User user75 = maintainUser35.login("", "");
        java.lang.String str76 = maintainUser35.path;
        maintaining.MaintainUser maintainUser77 = new maintaining.MaintainUser();
        userTypes.User[] userArray78 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList79 = new java.util.ArrayList<userTypes.User>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList79, userArray78);
        maintainUser77.users = userList79;
        java.util.ArrayList<userTypes.User> userList82 = maintainUser77.users;
        userTypes.User user85 = maintainUser77.login("hi!", "hi!");
        structure.Management management89 = null;
        userTypes.User user90 = maintainUser77.register("hi!", "", "hi!", management89);
        java.util.ArrayList<userTypes.User> userList91 = maintainUser77.users;
        maintaining.MaintainUser maintainUser92 = new maintaining.MaintainUser();
        maintainUser92.path = "hi!";
        java.util.ArrayList<userTypes.User> userList95 = maintainUser92.users;
        maintainUser77.users = userList95;
        maintainUser35.users = userList95;
        maintainUser0.users = userList95;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList95);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test251");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        maintainUser0.users = userList19;
        maintainUser0.path = "";
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser0.register("hi!", "hi!", "", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test252");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("hi!", "", "hi!", management12);
        java.util.ArrayList<userTypes.User> userList14 = maintainUser0.users;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        structure.Management management22 = null;
        userTypes.User user23 = maintainUser0.register("", "hi!", "hi!", management22);
        maintaining.MaintainUser maintainUser24 = new maintaining.MaintainUser();
        userTypes.User[] userArray25 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList26 = new java.util.ArrayList<userTypes.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList26, userArray25);
        maintainUser24.users = userList26;
        java.util.ArrayList<userTypes.User> userList29 = maintainUser24.users;
        maintainUser24.path = "";
        structure.Management management35 = null;
        userTypes.User user36 = maintainUser24.register("hi!", "", "", management35);
        java.util.ArrayList<userTypes.User> userList37 = maintainUser24.users;
        maintainUser0.users = userList37;
        java.lang.String str39 = maintainUser0.path;
        java.util.ArrayList<userTypes.User> userList40 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test253");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        java.util.ArrayList<userTypes.User> userList28 = maintainUser14.users;
        maintainUser0.users = userList28;
        java.util.ArrayList<userTypes.User> userList30 = maintainUser0.users;
        userTypes.User user33 = maintainUser0.login("hi!", "");
        structure.Management management37 = null;
        userTypes.User user38 = maintainUser0.register("hi!", "hi!", "hi!", management37);
        userTypes.User user41 = maintainUser0.login("", "hi!");
        java.lang.String str42 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test254");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        maintainUser0.path = "hi!";
        java.util.ArrayList<userTypes.User> userList3 = maintainUser0.users;
        maintainUser0.path = "hi!";
        structure.Management management9 = null;
        userTypes.User user10 = maintainUser0.register("", "", "hi!", management9);
        structure.Management management14 = null;
        userTypes.User user15 = maintainUser0.register("hi!", "", "hi!", management14);
        java.util.ArrayList<userTypes.User> userList16 = maintainUser0.users;
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser0.register("hi!", "hi!", "", management20);
        java.lang.String str22 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test255");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        userTypes.User user8 = maintainUser0.login("hi!", "hi!");
        structure.Management management12 = null;
        userTypes.User user13 = maintainUser0.register("", "hi!", "", management12);
        userTypes.User user16 = maintainUser0.login("hi!", "");
        structure.Management management20 = null;
        userTypes.User user21 = maintainUser0.register("hi!", "hi!", "", management20);
        structure.Management management25 = null;
        userTypes.User user26 = maintainUser0.register("hi!", "", "hi!", management25);
        java.util.ArrayList<userTypes.User> userList27 = maintainUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaintainUserTest.test256");
        maintaining.MaintainUser maintainUser0 = new maintaining.MaintainUser();
        userTypes.User[] userArray1 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList2 = new java.util.ArrayList<userTypes.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList2, userArray1);
        maintainUser0.users = userList2;
        java.util.ArrayList<userTypes.User> userList5 = maintainUser0.users;
        maintainUser0.path = "";
        structure.Management management11 = null;
        userTypes.User user12 = maintainUser0.register("hi!", "", "", management11);
        java.lang.String str13 = maintainUser0.path;
        maintaining.MaintainUser maintainUser14 = new maintaining.MaintainUser();
        userTypes.User[] userArray15 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList16 = new java.util.ArrayList<userTypes.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList16, userArray15);
        maintainUser14.users = userList16;
        java.util.ArrayList<userTypes.User> userList19 = maintainUser14.users;
        userTypes.User user22 = maintainUser14.login("hi!", "hi!");
        structure.Management management26 = null;
        userTypes.User user27 = maintainUser14.register("hi!", "", "hi!", management26);
        maintainUser14.path = "";
        maintaining.MaintainUser maintainUser30 = new maintaining.MaintainUser();
        userTypes.User[] userArray31 = new userTypes.User[] {};
        java.util.ArrayList<userTypes.User> userList32 = new java.util.ArrayList<userTypes.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<userTypes.User>) userList32, userArray31);
        maintainUser30.users = userList32;
        java.util.ArrayList<userTypes.User> userList35 = maintainUser30.users;
        maintainUser14.users = userList35;
        maintainUser0.users = userList35;
        userTypes.User user40 = maintainUser0.login("", "");
        java.lang.String str41 = maintainUser0.path;
        maintainUser0.path = "";
        structure.Management management47 = null;
        userTypes.User user48 = maintainUser0.register("", "", "hi!", management47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user48);
    }
}

