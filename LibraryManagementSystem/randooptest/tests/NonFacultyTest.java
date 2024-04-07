package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonFacultyTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test001");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        double double9 = nonFaculty4.getFine();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test002");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test003");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setId(0);
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test004");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test005");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test006");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test007");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test008");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.Class<?> wildcardClass7 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test009");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=hi!, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test010");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test011");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setEmail("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test012");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test013");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str13.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test015");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass13 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test016");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        java.lang.Class<?> wildcardClass6 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test017");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "User [email=hi!, password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test018");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        java.lang.Class<?> wildcardClass15 = rentList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test019");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        java.lang.String str8 = nonFaculty4.getPassword();
        userTypes.NonFaculty nonFaculty13 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = nonFaculty13.getRentals();
        nonFaculty4.calculateFines(rentList14);
        java.lang.String str17 = nonFaculty4.update("hi!");
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test020");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = nonFaculty16.getRentals();
        nonFaculty4.calculateFines(rentList17);
        java.lang.Class<?> wildcardClass19 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test021");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test022");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test023");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.String str14 = nonFaculty4.getUserType();
        java.lang.String str15 = nonFaculty4.getUserType();
        int int16 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test024");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test025");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setPassword("");
        nonFaculty4.setPassword("hi!");
        nonFaculty4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test026");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty11 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty11.getRentals();
        nonFaculty4.calculateFines(rentList12);
        java.lang.Class<?> wildcardClass14 = rentList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test027");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        nonFaculty4.setNumOfOverdue((int) (short) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test028");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str17.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test029");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        int int10 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test030");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        java.util.ArrayList<actions.Rent> rentList7 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test031");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test032");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.update("");
        int int11 = nonFaculty4.getNumOfOverdue();
        int int12 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test033");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test034");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setId(0);
        nonFaculty4.setNumOfOverdue((int) (byte) 10);
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test035");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test036");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.String str14 = nonFaculty4.getUserType();
        int int15 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test037");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        nonFaculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test038");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("hi!");
        java.lang.String str10 = nonFaculty4.getEmail();
        java.lang.String str11 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test039");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("hi!");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass14 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test040");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test041");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test042");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        java.lang.String str14 = nonFaculty4.getUserType();
        int int15 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test043");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 1);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId((int) (byte) 0);
        actions.Rent rent21 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent21, maintainPhysicalItems22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test044");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 100, "", "User [email=hi!, password=,id=-1]", "");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test045");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        nonFaculty4.setId(100);
        nonFaculty4.setNumOfOverdue((int) ' ');
        java.lang.Class<?> wildcardClass10 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test046");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        double double14 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test047");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test048");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test049");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        actions.Rent rent6 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent6, maintainPhysicalItems7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test050");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test051");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test052");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test053");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.Class<?> wildcardClass9 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test054");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        nonFaculty4.setUserType("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test055");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty11 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty11.getRentals();
        nonFaculty4.calculateFines(rentList12);
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test056");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=-1]", "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test057");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 1);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId((int) (byte) 0);
        nonFaculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test058");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test059");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 1);
        int int17 = nonFaculty4.getId();
        nonFaculty4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test060");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test061");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("");
        double double15 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test062");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 100, "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test063");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test064");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        java.lang.String str12 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test065");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = nonFaculty4.getFine();
        double double6 = nonFaculty4.getFine();
        java.lang.String str7 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test066");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        int int6 = nonFaculty4.getId();
        nonFaculty4.setNumOfOverdue(0);
        userTypes.NonFaculty nonFaculty13 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str15 = nonFaculty13.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty20 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = nonFaculty20.getRentals();
        nonFaculty13.calculateFines(rentList21);
        nonFaculty4.calculateFines(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test067");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test068");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) ' ', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test069");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        java.lang.String str8 = nonFaculty4.getPassword();
        userTypes.NonFaculty nonFaculty13 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = nonFaculty13.getRentals();
        nonFaculty4.calculateFines(rentList14);
        nonFaculty4.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test070");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setNumOfOverdue((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test071");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        nonFaculty4.calculateFines(rentList10);
        int int13 = nonFaculty4.getId();
        nonFaculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        nonFaculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test072");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test073");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        int int14 = nonFaculty4.getId();
        userTypes.NonFaculty nonFaculty19 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str21 = nonFaculty19.update("");
        java.lang.String str22 = nonFaculty19.getUserType();
        java.lang.String str23 = nonFaculty19.toString();
        java.lang.String str24 = nonFaculty19.toString();
        java.lang.String str26 = nonFaculty19.update("");
        userTypes.NonFaculty nonFaculty31 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList32 = nonFaculty31.getRentals();
        nonFaculty19.calculateFines(rentList32);
        nonFaculty4.calculateFines(rentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str23.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str24.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList32);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test074");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        nonFaculty4.calculateFines(rentList10);
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test075");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test076");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) '#', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        nonFaculty4.setPassword("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test077");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = nonFaculty4.getPassword();
        double double18 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test078");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("hi!");
        java.lang.String str10 = nonFaculty4.getEmail();
        userTypes.NonFaculty nonFaculty15 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = nonFaculty15.update("");
        java.lang.String str18 = nonFaculty15.getUserType();
        java.lang.String str19 = nonFaculty15.toString();
        java.lang.String str20 = nonFaculty15.toString();
        java.lang.String str22 = nonFaculty15.update("");
        userTypes.NonFaculty nonFaculty27 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = nonFaculty27.getRentals();
        nonFaculty15.calculateFines(rentList28);
        nonFaculty4.calculateFines(rentList28);
        double double31 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str19.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str20.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test079");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test080");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        java.lang.Class<?> wildcardClass13 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test081");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test082");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 100, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test083");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        java.lang.String str14 = nonFaculty4.getUserType();
        java.lang.Class<?> wildcardClass15 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test084");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str13 = nonFaculty4.getUserType();
        int int14 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test085");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test086");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "", "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test087");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        java.lang.String str8 = nonFaculty4.getPassword();
        userTypes.NonFaculty nonFaculty13 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty13.setPassword("");
        nonFaculty13.setId(0);
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        nonFaculty13.calculateFines(rentList19);
        nonFaculty4.calculateFines(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test088");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str10.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test089");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.String str14 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str14.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test090");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.getEmail();
        java.lang.String str12 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test091");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.toString();
        double double11 = nonFaculty4.getFine();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test092");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setNumOfOverdue(10);
        nonFaculty4.setEmail("hi!");
        java.lang.String str11 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test093");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=-1]", "", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test094");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(100, "", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test095");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test096");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = nonFaculty4.getId();
        int int11 = nonFaculty4.getNumOfOverdue();
        int int12 = nonFaculty4.getId();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test097");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(1, "User [email=hi!, password=,id=-1]", "", "User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setEmail("hi!");
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test098");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 1, "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=-1]");
        java.lang.String str5 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str5.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test099");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass14 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test100");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        int int15 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test101");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.String str14 = nonFaculty4.getUserType();
        java.lang.String str15 = nonFaculty4.getUserType();
        userTypes.NonFaculty nonFaculty20 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = nonFaculty20.getRentals();
        nonFaculty20.setUserType("hi!");
        java.lang.String str24 = nonFaculty20.getPassword();
        userTypes.NonFaculty nonFaculty29 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList30 = nonFaculty29.getRentals();
        nonFaculty20.calculateFines(rentList30);
        nonFaculty4.calculateFines(rentList30);
        java.lang.Class<?> wildcardClass33 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test102");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.toString();
        nonFaculty4.setId(10);
        int int13 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test103");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 1);
        int int17 = nonFaculty4.getId();
        actions.Rent rent18 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent18, maintainPhysicalItems19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test104");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test105");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test106");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        int int6 = nonFaculty4.getId();
        nonFaculty4.setNumOfOverdue(0);
        nonFaculty4.setNumOfOverdue((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test107");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.toString();
        int int8 = nonFaculty4.getId();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str7.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test108");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test109");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        nonFaculty4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test110");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 10, "User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test111");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) '4', "User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test112");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) '#', "", "", "");
        java.lang.String str5 = nonFaculty4.getPassword();
        java.lang.String str6 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=35]" + "'", str6.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test113");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        nonFaculty4.calculateFines(rentList7);
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test114");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        double double14 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test115");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setNumOfOverdue(10);
        java.lang.Class<?> wildcardClass9 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test116");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.toString();
        double double11 = nonFaculty4.getFine();
        java.lang.String str13 = nonFaculty4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test117");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        int int14 = nonFaculty4.getNumOfOverdue();
        nonFaculty4.setId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test118");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 100);
        nonFaculty4.setNumOfOverdue((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test119");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test120");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = nonFaculty4.toString();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str15 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=User [email=hi!, password=,id=-1], password=,id=-1]" + "'", str15.equals("User [email=User [email=hi!, password=,id=-1], password=,id=-1]"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test121");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        int int12 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test122");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        userTypes.NonFaculty nonFaculty18 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str20 = nonFaculty18.update("");
        nonFaculty18.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str23 = nonFaculty18.toString();
        nonFaculty18.setNumOfOverdue(1);
        int int26 = nonFaculty18.getId();
        userTypes.NonFaculty nonFaculty31 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str33 = nonFaculty31.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty38 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = nonFaculty38.getRentals();
        nonFaculty31.calculateFines(rentList39);
        nonFaculty18.calculateFines(rentList39);
        nonFaculty4.calculateFines(rentList39);
        java.lang.Class<?> wildcardClass43 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str23.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str33.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test123");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        int int7 = nonFaculty4.getId();
        java.lang.String str8 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test124");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        double double14 = nonFaculty4.getFine();
        nonFaculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test125");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) '#', "", "", "");
        java.lang.String str5 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test126");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        java.lang.String str16 = nonFaculty4.toString();
        java.util.ArrayList<actions.Rent> rentList17 = nonFaculty4.getRentals();
        java.lang.String str18 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str16.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test127");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.getUserType();
        java.lang.String str10 = nonFaculty4.update("User [email=, password=,id=0]");
        int int11 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, password=,id=0]" + "'", str10.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test128");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setEmail("hi!");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test129");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setNumOfOverdue(10);
        nonFaculty4.setEmail("hi!");
        nonFaculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test130");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = nonFaculty4.getFine();
        nonFaculty4.setNumOfOverdue(100);
        nonFaculty4.setUserType("");
        int int10 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test131");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = nonFaculty4.getPassword();
        java.lang.String str6 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test132");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty4.getRentals();
        java.lang.String str14 = nonFaculty4.update("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList15 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=User [email=hi!, password=,id=-1], password=,id=-1]" + "'", str14.equals("User [email=User [email=hi!, password=,id=-1], password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test133");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        java.lang.String str8 = nonFaculty4.getPassword();
        userTypes.NonFaculty nonFaculty13 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = nonFaculty13.getRentals();
        nonFaculty4.calculateFines(rentList14);
        java.lang.Class<?> wildcardClass16 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test134");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=, password=,id=35]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test135");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        java.lang.String str13 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test136");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = nonFaculty4.getId();
        int int11 = nonFaculty4.getNumOfOverdue();
        int int12 = nonFaculty4.getId();
        java.lang.String str13 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str13.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test137");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test138");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        java.lang.String str14 = nonFaculty4.getUserType();
        java.lang.String str16 = nonFaculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str16.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test139");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = nonFaculty4.getNumOfOverdue();
        nonFaculty4.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test140");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        nonFaculty4.setId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test141");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = nonFaculty4.getNumOfOverdue();
        java.lang.String str6 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test142");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.toString();
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty16.setPassword("");
        nonFaculty16.setId(0);
        nonFaculty16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        nonFaculty16.calculateFines(rentList24);
        nonFaculty4.calculateFines(rentList24);
        java.util.ArrayList<actions.Rent> rentList28 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.calculateFines(rentList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"totalRentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str11.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test143");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        double double15 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test144");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        actions.Rent rent16 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent16, maintainPhysicalItems17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test145");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test146");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=, password=,id=35]", "", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test147");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setId(0);
        nonFaculty4.setNumOfOverdue((int) (byte) 10);
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("");
        nonFaculty4.setId(0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test148");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        nonFaculty4.setId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test149");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test150");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        int int6 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test151");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setId(0);
        nonFaculty4.setNumOfOverdue((int) (byte) 10);
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("");
        java.lang.String str15 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test152");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList10 = nonFaculty4.getRentals();
        nonFaculty4.setPassword("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass13 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test153");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty11 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty11.getRentals();
        nonFaculty4.calculateFines(rentList12);
        java.lang.String str14 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test154");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass8 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test155");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        nonFaculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = nonFaculty4.getRentals();
        int int14 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test156");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("hi!");
        java.lang.String str10 = nonFaculty4.getEmail();
        nonFaculty4.setId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test157");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.getEmail();
        java.lang.Class<?> wildcardClass11 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test158");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.getEmail();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        nonFaculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.String str15 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str12.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str15.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test159");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test160");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test161");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test162");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("hi!");
        java.lang.String str10 = nonFaculty4.getEmail();
        userTypes.NonFaculty nonFaculty15 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = nonFaculty15.update("");
        java.lang.String str18 = nonFaculty15.getUserType();
        java.lang.String str19 = nonFaculty15.toString();
        java.lang.String str20 = nonFaculty15.toString();
        java.lang.String str22 = nonFaculty15.update("");
        userTypes.NonFaculty nonFaculty27 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = nonFaculty27.getRentals();
        nonFaculty15.calculateFines(rentList28);
        nonFaculty4.calculateFines(rentList28);
        nonFaculty4.setNumOfOverdue(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str19.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str20.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test163");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        double double7 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test164");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.String str7 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test165");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=, password=,id=35]", "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test166");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setId((int) (byte) 1);
        userTypes.NonFaculty nonFaculty15 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList16 = nonFaculty15.getRentals();
        nonFaculty15.setUserType("hi!");
        nonFaculty15.setEmail("hi!");
        java.lang.String str21 = nonFaculty15.getEmail();
        userTypes.NonFaculty nonFaculty26 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str28 = nonFaculty26.update("");
        java.lang.String str29 = nonFaculty26.getUserType();
        java.lang.String str30 = nonFaculty26.toString();
        java.lang.String str31 = nonFaculty26.toString();
        java.lang.String str33 = nonFaculty26.update("");
        userTypes.NonFaculty nonFaculty38 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = nonFaculty38.getRentals();
        nonFaculty26.calculateFines(rentList39);
        nonFaculty15.calculateFines(rentList39);
        nonFaculty4.calculateFines(rentList39);
        nonFaculty4.setEmail("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str30.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str31.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test167");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 1, "User [email=, password=,id=0]", "User [email=hi!, password=,id=0]", "hi!");
        int int5 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test168");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        nonFaculty4.calculateFines(rentList10);
        int int13 = nonFaculty4.getId();
        nonFaculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        double double16 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test169");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        nonFaculty4.setPassword("");
        java.lang.String str8 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, password=,id=-1], password=,id=1]" + "'", str8.equals("User [email=User [email=hi!, password=,id=-1], password=,id=1]"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test170");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        double double8 = nonFaculty4.getFine();
        java.lang.String str9 = nonFaculty4.getEmail();
        nonFaculty4.setPassword("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test171");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        java.lang.String str11 = nonFaculty4.getUserType();
        java.lang.String str12 = nonFaculty4.getUserType();
        java.lang.String str13 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str13.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test172");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        double double15 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test173");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        double double13 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test174");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int17 = nonFaculty4.getId();
        int int18 = nonFaculty4.getNumOfOverdue();
        actions.Rent rent19 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent19, maintainPhysicalItems20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test175");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        double double8 = nonFaculty4.getFine();
        nonFaculty4.setId((int) (short) 0);
        nonFaculty4.setPassword("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test176");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        userTypes.NonFaculty nonFaculty18 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str20 = nonFaculty18.update("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty25 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList26 = nonFaculty25.getRentals();
        nonFaculty18.calculateFines(rentList26);
        nonFaculty4.calculateFines(rentList26);
        java.lang.Class<?> wildcardClass29 = rentList26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str20.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test177");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        int int10 = nonFaculty4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass11 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test178");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.update("");
        int int11 = nonFaculty4.getNumOfOverdue();
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty16.setPassword("");
        nonFaculty16.setId(0);
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        nonFaculty16.calculateFines(rentList22);
        nonFaculty4.calculateFines(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test179");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test180");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        java.util.ArrayList<actions.Rent> rentList16 = nonFaculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList17 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test181");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 100, "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test182");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        nonFaculty4.setId((int) (byte) -1);
        nonFaculty4.setId((int) (byte) -1);
        double double9 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test183");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        nonFaculty4.setId(0);
        double double9 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test184");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setEmail("hi!");
        double double13 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test185");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = nonFaculty4.getUserType();
        java.lang.String str7 = nonFaculty4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test186");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test187");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        nonFaculty4.setPassword("User [email=, password=,id=35]");
        java.lang.String str17 = nonFaculty4.update("User [email=, password=,id=0]");
        nonFaculty4.setNumOfOverdue((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, password=,id=0]" + "'", str17.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test188");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = nonFaculty16.getRentals();
        nonFaculty4.calculateFines(rentList17);
        int int19 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test189");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        int int7 = nonFaculty4.getId();
        java.lang.String str8 = nonFaculty4.getEmail();
        nonFaculty4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList11 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test190");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        nonFaculty4.setNumOfOverdue(1);
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty16.setPassword("");
        nonFaculty16.setId(0);
        nonFaculty16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        nonFaculty16.calculateFines(rentList24);
        nonFaculty4.calculateFines(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test191");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        java.lang.String str14 = nonFaculty4.getUserType();
        java.lang.String str15 = nonFaculty4.getUserType();
        java.lang.String str16 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test192");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        java.lang.String str11 = nonFaculty4.getUserType();
        nonFaculty4.setId((int) (short) 1);
        nonFaculty4.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test193");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("", "User [email=, password=,id=0]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test194");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        int int7 = nonFaculty4.getId();
        java.lang.String str8 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test195");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        java.lang.String str11 = nonFaculty4.getUserType();
        nonFaculty4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList14 = nonFaculty4.getRentals();
        double double15 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test196");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) 0, "User [email=, password=,id=35]", "", "User [email=hi!, password=,id=0]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test197");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("hi!");
        java.lang.String str11 = nonFaculty4.getUserType();
        int int12 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test198");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        java.lang.String str16 = nonFaculty4.toString();
        nonFaculty4.setNumOfOverdue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str16.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test199");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("hi!");
        java.lang.String str10 = nonFaculty4.getEmail();
        nonFaculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test200");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setPassword("");
        java.lang.String str15 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test201");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) 10, "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test202");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "User [email=, password=,id=35]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test203");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        double double15 = nonFaculty4.getFine();
        java.util.ArrayList<actions.Rent> rentList16 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test204");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setId((int) (byte) 1);
        double double11 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test205");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        nonFaculty4.setId((int) (byte) 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test206");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = nonFaculty4.update("");
        int int7 = nonFaculty4.getId();
        java.lang.String str8 = nonFaculty4.getEmail();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str11 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test207");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty4.getRentals();
        int int13 = nonFaculty4.getId();
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        userTypes.NonFaculty nonFaculty20 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty20.setPassword("");
        nonFaculty20.setId(0);
        java.util.ArrayList<actions.Rent> rentList25 = nonFaculty20.getRentals();
        nonFaculty4.calculateFines(rentList25);
        nonFaculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test208");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str5.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test209");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test210");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 100);
        java.lang.String str10 = nonFaculty4.getPassword();
        java.lang.String str11 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test211");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = nonFaculty4.getId();
        nonFaculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test212");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        userTypes.NonFaculty nonFaculty10 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty10.setPassword("");
        nonFaculty10.setId(0);
        java.lang.String str16 = nonFaculty10.update("");
        java.util.ArrayList<actions.Rent> rentList17 = nonFaculty10.getRentals();
        nonFaculty4.calculateFines(rentList17);
        java.lang.String str19 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test213");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.util.ArrayList<actions.Rent> rentList9 = nonFaculty4.getRentals();
        nonFaculty4.setId((int) (short) 0);
        java.lang.String str13 = nonFaculty4.update("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str13.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test214");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test215");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("");
        java.lang.String str15 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test216");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = nonFaculty4.toString();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        nonFaculty4.setNumOfOverdue(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test217");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.toString();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str11.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test218");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        int int10 = nonFaculty4.getId();
        userTypes.NonFaculty nonFaculty15 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = nonFaculty15.update("");
        java.lang.String str18 = nonFaculty15.getUserType();
        nonFaculty15.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = nonFaculty15.toString();
        java.lang.String str22 = nonFaculty15.toString();
        userTypes.NonFaculty nonFaculty27 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty27.setPassword("");
        nonFaculty27.setId(0);
        nonFaculty27.setEmail("");
        actions.Rent[] rentArray34 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList35 = new java.util.ArrayList<actions.Rent>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList35, rentArray34);
        nonFaculty27.calculateFines(rentList35);
        nonFaculty15.calculateFines(rentList35);
        nonFaculty4.calculateFines(rentList35);
        java.lang.String str40 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str21.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str22.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str40.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test219");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        double double5 = nonFaculty4.getFine();
        userTypes.NonFaculty nonFaculty10 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty10.setPassword("");
        nonFaculty10.setId(0);
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        nonFaculty10.calculateFines(rentList16);
        nonFaculty4.calculateFines(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test220");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.getUserType();
        java.lang.String str10 = nonFaculty4.update("User [email=, password=,id=0]");
        java.lang.String str11 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, password=,id=0]" + "'", str10.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str11.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test221");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.getEmail();
        nonFaculty4.setEmail("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test222");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test223");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(100, "", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=, password=,id=35]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test224");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        int int14 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test225");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.getUserType();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test226");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        java.lang.String str14 = nonFaculty4.update("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str14.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test227");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "", "");
        nonFaculty4.setId((int) (byte) -1);
        int int7 = nonFaculty4.getNumOfOverdue();
        java.lang.String str8 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test228");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        int int7 = nonFaculty4.getId();
        java.lang.String str9 = nonFaculty4.update("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str9.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test229");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.toString();
        int int12 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test230");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.getPassword();
        java.lang.String str9 = nonFaculty4.getUserType();
        int int10 = nonFaculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test231");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test232");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setPassword("");
        nonFaculty4.setPassword("hi!");
        java.lang.String str17 = nonFaculty4.getUserType();
        java.util.ArrayList<actions.Rent> rentList18 = nonFaculty4.getRentals();
        java.lang.String str20 = nonFaculty4.update("User [email=, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str17.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, password=,id=0]" + "'", str20.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test233");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.getEmail();
        nonFaculty4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test234");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        nonFaculty4.calculateFines(rentList10);
        nonFaculty4.setNumOfOverdue((int) (short) 10);
        nonFaculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test235");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        nonFaculty4.setUserType("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getEmail();
        java.lang.String str14 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 1);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId((int) (byte) 0);
        java.util.ArrayList<actions.Rent> rentList21 = nonFaculty4.getRentals();
        java.lang.String str22 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test236");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        double double5 = nonFaculty4.getFine();
        double double6 = nonFaculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test237");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = nonFaculty4.getRentals();
        int int13 = nonFaculty4.getId();
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        nonFaculty4.setId(97);
        java.lang.String str18 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test238");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        nonFaculty4.setPassword("hi!");
        nonFaculty4.setUserType("");
        nonFaculty4.setId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test239");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        int int9 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test240");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        double double14 = nonFaculty4.getFine();
        java.lang.String str15 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test241");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        java.lang.String str16 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test242");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = nonFaculty4.getRentals();
        java.lang.String str6 = nonFaculty4.getEmail();
        int int7 = nonFaculty4.getId();
        java.lang.String str8 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test243");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        double double7 = nonFaculty4.getFine();
        java.lang.String str8 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test244");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        java.lang.String str11 = nonFaculty4.toString();
        nonFaculty4.setNumOfOverdue(0);
        nonFaculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test245");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.util.ArrayList<actions.Rent> rentList11 = nonFaculty4.getRentals();
        nonFaculty4.setNumOfOverdue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test246");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.getEmail();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass13 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str12.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test247");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        int int10 = nonFaculty4.getId();
        nonFaculty4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test248");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str9 = nonFaculty4.getPassword();
        java.lang.String str10 = nonFaculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test249");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.getEmail();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nonFaculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str12.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test250");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("hi!");
        nonFaculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test251");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        int int5 = nonFaculty4.getId();
        int int6 = nonFaculty4.getNumOfOverdue();
        nonFaculty4.setUserType("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test252");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str12 = nonFaculty4.update("User [email=hi!, password=,id=-1]");
        nonFaculty4.setUserType("");
        int int15 = nonFaculty4.getId();
        java.lang.String str16 = nonFaculty4.toString();
        java.lang.String str18 = nonFaculty4.update("hi!");
        nonFaculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int21 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str12.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str16.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test253");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList11 = nonFaculty4.getRentals();
        userTypes.NonFaculty nonFaculty16 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str18 = nonFaculty16.update("");
        nonFaculty16.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = nonFaculty16.toString();
        int int22 = nonFaculty16.getId();
        userTypes.NonFaculty nonFaculty27 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str29 = nonFaculty27.update("");
        java.lang.String str30 = nonFaculty27.getUserType();
        nonFaculty27.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str33 = nonFaculty27.toString();
        java.lang.String str34 = nonFaculty27.toString();
        userTypes.NonFaculty nonFaculty39 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty39.setPassword("");
        nonFaculty39.setId(0);
        nonFaculty39.setEmail("");
        actions.Rent[] rentArray46 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList47 = new java.util.ArrayList<actions.Rent>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList47, rentArray46);
        nonFaculty39.calculateFines(rentList47);
        nonFaculty27.calculateFines(rentList47);
        nonFaculty16.calculateFines(rentList47);
        nonFaculty4.calculateFines(rentList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str21.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str33.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str34.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test254");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("hi!");
        java.lang.String str13 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.lang.String str16 = nonFaculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test255");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = nonFaculty4.getUserType();
        nonFaculty4.setNumOfOverdue((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test256");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("hi!", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test257");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        userTypes.NonFaculty nonFaculty9 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str11 = nonFaculty9.update("");
        java.lang.String str12 = nonFaculty9.getUserType();
        nonFaculty9.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = nonFaculty9.toString();
        java.lang.String str16 = nonFaculty9.toString();
        userTypes.NonFaculty nonFaculty21 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty21.setPassword("");
        nonFaculty21.setId(0);
        nonFaculty21.setEmail("");
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        nonFaculty21.calculateFines(rentList29);
        nonFaculty9.calculateFines(rentList29);
        nonFaculty4.calculateFines(rentList29);
        nonFaculty4.setNumOfOverdue((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str16.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test258");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test259");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        java.lang.String str11 = nonFaculty4.getPassword();
        java.lang.String str12 = nonFaculty4.getPassword();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test260");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        nonFaculty4.setId((int) (byte) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test261");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        java.lang.String str13 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test262");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.toString();
        java.lang.Class<?> wildcardClass12 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str11.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test263");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = nonFaculty4.getEmail();
        nonFaculty4.setUserType("User [email=, password=hi!,id=0]");
        java.lang.String str20 = nonFaculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, password=,id=0]" + "'", str20.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test264");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = nonFaculty4.getNumOfOverdue();
        int int14 = nonFaculty4.getNumOfOverdue();
        java.lang.String str15 = nonFaculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test265");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        java.lang.String str8 = nonFaculty4.toString();
        java.lang.String str9 = nonFaculty4.toString();
        java.lang.String str11 = nonFaculty4.update("");
        nonFaculty4.setNumOfOverdue((int) (byte) 100);
        nonFaculty4.setEmail("User [email=hi!, password=,id=-1]");
        nonFaculty4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test266");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty(0, "", "hi!", "");
        java.lang.String str5 = nonFaculty4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        nonFaculty4.calculateFines(rentList7);
        nonFaculty4.setNumOfOverdue((int) (byte) 100);
        double double12 = nonFaculty4.getFine();
        nonFaculty4.setId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test267");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        nonFaculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = nonFaculty4.toString();
        int int10 = nonFaculty4.getNumOfOverdue();
        java.lang.String str11 = nonFaculty4.getPassword();
        nonFaculty4.setId((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str11.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test268");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        java.lang.String str7 = nonFaculty4.getPassword();
        nonFaculty4.setId((int) (short) 100);
        java.lang.String str10 = nonFaculty4.getPassword();
        java.lang.Class<?> wildcardClass11 = nonFaculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test269");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        nonFaculty4.calculateFines(rentList12);
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str17.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test270");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        java.lang.String str10 = nonFaculty4.update("");
        nonFaculty4.setPassword("");
        int int13 = nonFaculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test271");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = nonFaculty4.update("");
        java.lang.String str7 = nonFaculty4.getUserType();
        nonFaculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = nonFaculty4.getId();
        int int11 = nonFaculty4.getNumOfOverdue();
        int int12 = nonFaculty4.getId();
        nonFaculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test272");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty("User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test273");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setPassword("");
        nonFaculty4.setId(0);
        nonFaculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NonFacultyTest.test274");
        userTypes.NonFaculty nonFaculty4 = new userTypes.NonFaculty((int) (short) -1, "hi!", "", "hi!");
        nonFaculty4.setId(100);
        java.lang.String str7 = nonFaculty4.getPassword();
        java.lang.String str8 = nonFaculty4.getPassword();
        java.lang.String str9 = nonFaculty4.getUserType();
        java.util.ArrayList<actions.Rent> rentList10 = nonFaculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }
}

