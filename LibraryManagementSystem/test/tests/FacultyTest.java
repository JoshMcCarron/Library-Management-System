package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test001");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test003");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test004");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test005");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test006");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test007");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        faculty4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test008");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        double double11 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test009");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setEmail("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test010");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=0]", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test011");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test012");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setUserType("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test013");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test014");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test015");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "User [email=, password=,id=35]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test016");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getUserType();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test017");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.lang.String str11 = faculty4.update("User [email=, password=,id=35]");
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=35]" + "'", str11.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test018");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getId();
        faculty4.setId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test019");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "hi!", "", "");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test020");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test021");
        userTypes.Faculty faculty4 = new userTypes.Faculty((-1), "hi!", "hi!", "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test022");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.toString();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test023");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (byte) 100);
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test024");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test025");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test026");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.lang.String str11 = faculty4.update("User [email=, password=,id=35]");
        boolean boolean12 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=35]" + "'", str11.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test027");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 1, "User [email=, password=,id=35]", "User [email=, password=,id=0]", "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test028");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "User [email=, password=,id=35]", "User [email=, password=,id=0]", "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test029");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        java.lang.String str6 = faculty4.getPassword();
        actions.Rent rent7 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent7, maintainPhysicalItems8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test030");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        int int10 = faculty4.getId();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test031");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str12 = faculty4.getEmail();
        faculty4.setPassword("User [email=, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test032");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "hi!", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test033");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        double double5 = faculty4.getFine();
        java.lang.String str6 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test034");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test035");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) ' ', "hi!", "", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test036");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        boolean boolean8 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test037");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test038");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setNumOfOverdue(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test039");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        int int10 = faculty4.getId();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test040");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setId((int) '#');
        faculty4.setUserType("User [email=, password=,id=35]");
        double double17 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test041");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        int int10 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test042");
        userTypes.Faculty faculty4 = new userTypes.Faculty((-1), "User [email=, password=,id=0]", "hi!", "hi!");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test043");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=, password=,id=0]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test044");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 10, "", "", "");
        userTypes.Faculty faculty9 = new userTypes.Faculty((int) '#', "", "", "");
        faculty9.setId(0);
        faculty9.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList14 = faculty9.getRentals();
        faculty4.calculateFines(rentList14);
        java.lang.Class<?> wildcardClass16 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test045");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.String str14 = faculty4.update("User [email=, password=,id=0]");
        faculty4.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test046");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        faculty4.setEmail("");
        boolean boolean14 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test047");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setNumOfOverdue(0);
        java.lang.String str13 = faculty4.update("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=35]" + "'", str13.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test048");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        double double10 = faculty4.getFine();
        java.lang.String str12 = faculty4.update("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=-1]" + "'", str12.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test049");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        java.lang.String str11 = faculty4.toString();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=-1]" + "'", str11.equals("User [email=, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test050");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setUserType("User [email=, password=,id=35]");
        int int12 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test051");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=-1]", "hi!", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test052");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test053");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setId((int) '#');
        boolean boolean15 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test054");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getId();
        faculty4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test055");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        faculty4.setPassword("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test056");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) '#', "", "", "");
        faculty16.setId(0);
        java.lang.String str20 = faculty16.update("");
        java.util.ArrayList<actions.Rent> rentList21 = faculty16.getRentals();
        faculty16.setPassword("");
        int int24 = faculty16.getId();
        faculty16.setNumOfOverdue(1);
        faculty16.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList29 = faculty16.getRentals();
        faculty4.calculateFines(rentList29);
        java.lang.Class<?> wildcardClass31 = rentList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test057");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        faculty4.setEmail("User [email=, password=,id=0]");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test058");
        userTypes.Faculty faculty4 = new userTypes.Faculty((-1), "User [email=, password=,id=0]", "hi!", "hi!");
        faculty4.setUserType("");
        faculty4.setUserType("User [email=, password=,id=0]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test059");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setNumOfOverdue((int) (short) -1);
        boolean boolean8 = faculty4.getValidate();
        faculty4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test060");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setUserType("hi!");
        java.lang.String str7 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test061");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        faculty4.setNumOfOverdue((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test062");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setNumOfOverdue((int) (short) -1);
        int int8 = faculty4.getId();
        double double9 = faculty4.getFine();
        userTypes.Faculty faculty14 = new userTypes.Faculty((int) '#', "", "", "");
        faculty14.setId(0);
        java.lang.String str18 = faculty14.update("");
        java.lang.String str20 = faculty14.update("");
        userTypes.Faculty faculty25 = new userTypes.Faculty((int) '#', "", "", "");
        faculty25.setId(0);
        faculty25.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList30 = faculty25.getRentals();
        faculty14.calculateFines(rentList30);
        faculty4.calculateFines(rentList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList30);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test063");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setPassword("hi!");
        faculty4.setNumOfOverdue((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test064");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setUserType("");
        faculty4.setId((int) (short) 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test065");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test066");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.toString();
        double double13 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test067");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test068");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "hi!", "User [email=, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test069");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        java.lang.String str12 = faculty4.getPassword();
        java.lang.String str13 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test070");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        double double10 = faculty4.getFine();
        int int11 = faculty4.getId();
        faculty4.setUserType("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test071");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        java.lang.String str15 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=User [email=, password=,id=0], password=,id=-1]" + "'", str15.equals("User [email=User [email=, password=,id=0], password=,id=-1]"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test072");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setEmail("");
        double double12 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test073");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        boolean boolean11 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test074");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setId((int) '#');
        faculty4.setUserType("User [email=, password=,id=35]");
        faculty4.setId((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test075");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test076");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=-1]", "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=User [email=, password=,id=0], password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test077");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test078");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test079");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.Class<?> wildcardClass13 = rentList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test080");
        userTypes.Faculty faculty4 = new userTypes.Faculty(35, "User [email=User [email=, password=,id=0], password=,id=-1]", "User [email=, password=,id=-1]", "User [email=, password=,id=0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test081");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "hi!", "User [email=, password=,id=-1]", "User [email=, password=,id=-1]");
        java.lang.String str5 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=-1]" + "'", str5.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test082");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setEmail("");
        faculty4.setId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test083");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        int int12 = faculty4.getNumOfOverdue();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test084");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test085");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        faculty4.setNumOfOverdue((int) '#');
        java.lang.String str11 = faculty4.toString();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test086");
        userTypes.Faculty faculty4 = new userTypes.Faculty(35, "User [email=, password=,id=0]", "User [email=, password=,id=0]", "");
        int int5 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test087");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test088");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=User [email=, password=,id=0], password=hi!,id=100]" + "'", str7.equals("User [email=User [email=, password=,id=0], password=hi!,id=100]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test089");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = faculty4.getEmail();
        int int14 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test090");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=0]", "User [email=, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test091");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        faculty4.setUserType("User [email=, password=,id=0]");
        int int9 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test092");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        int int11 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test093");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        double double10 = faculty4.getFine();
        int int11 = faculty4.getId();
        faculty4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test094");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setNumOfOverdue((int) (short) -1);
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test095");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setEmail("");
        java.lang.String str12 = faculty4.update("");
        java.lang.String str13 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test096");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setUserType("User [email=, password=,id=35]");
        faculty4.setId((int) (byte) 100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test097");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.toString();
        faculty4.setUserType("");
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test098");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setNumOfOverdue((int) (short) -1);
        int int8 = faculty4.getId();
        double double9 = faculty4.getFine();
        userTypes.Faculty faculty14 = new userTypes.Faculty((int) '#', "", "", "");
        faculty14.setId(0);
        java.lang.String str18 = faculty14.update("");
        java.util.ArrayList<actions.Rent> rentList19 = faculty14.getRentals();
        faculty14.setPassword("");
        int int22 = faculty14.getId();
        faculty14.setNumOfOverdue(1);
        faculty14.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = faculty14.getRentals();
        faculty4.calculateFines(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test099");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setEmail("");
        faculty4.setNumOfOverdue(1);
        java.lang.String str13 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test100");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setUserType("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test101");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (byte) 100);
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test102");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        userTypes.Faculty faculty12 = new userTypes.Faculty((int) '#', "", "", "");
        faculty12.setId(0);
        faculty12.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList17 = faculty12.getRentals();
        faculty4.calculateFines(rentList17);
        faculty4.setEmail("User [email=, password=,id=35]");
        java.lang.String str22 = faculty4.update("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User [email=, password=,id=35]" + "'", str22.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test103");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getUserType();
        java.lang.String str10 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test104");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "User [email=User [email=, password=,id=0], password=,id=-1]", "User [email=User [email=, password=,id=0], password=hi!,id=100]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test105");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.getEmail();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test106");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setPassword("hi!");
        java.lang.String str11 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str11.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test107");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 1, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
        faculty4.setNumOfOverdue((int) (short) 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test108");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        faculty4.setId(35);
        java.lang.String str17 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test109");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "", "User [email=User [email=, password=,id=0], password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test110");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        java.lang.String str13 = faculty4.getUserType();
        int int14 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test111");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        faculty4.setNumOfOverdue((int) '#');
        java.lang.String str11 = faculty4.toString();
        double double12 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test112");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str14 = faculty4.toString();
        int int15 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=User [email=, password=,id=0], password=,id=0]" + "'", str14.equals("User [email=User [email=, password=,id=0], password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test113");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList6 = faculty4.getRentals();
        boolean boolean7 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test114");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        faculty4.setId(35);
        faculty4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test115");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        int int15 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test116");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "hi!", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test117");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setId((int) (byte) 1);
        faculty4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList15 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test118");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (byte) 100);
        faculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test119");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        userTypes.Faculty faculty12 = new userTypes.Faculty((int) '#', "", "", "");
        faculty12.setId(0);
        faculty12.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList17 = faculty12.getRentals();
        faculty4.calculateFines(rentList17);
        java.lang.String str19 = faculty4.toString();
        java.lang.Class<?> wildcardClass20 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=, password=,id=35]" + "'", str19.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test120");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setPassword("");
        faculty4.setId((int) ' ');
        faculty4.setNumOfOverdue(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test121");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setId((int) 'a');
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test122");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        faculty4.setUserType("");
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test123");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setUserType("hi!");
        java.lang.String str13 = faculty4.getUserType();
        boolean boolean14 = faculty4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = faculty4.getRentals();
        java.lang.String str16 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=, password=,id=52]" + "'", str16.equals("User [email=, password=,id=52]"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test124");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.getPassword();
        faculty4.setNumOfOverdue(10);
        int int12 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, password=,id=0]" + "'", str8.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test125");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        java.lang.String str11 = faculty4.update("hi!");
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str17 = faculty16.toString();
        java.lang.String str18 = faculty16.getPassword();
        java.util.ArrayList<actions.Rent> rentList19 = faculty16.getRentals();
        faculty4.calculateFines(rentList19);
        userTypes.Faculty faculty25 = new userTypes.Faculty((int) '#', "", "", "");
        faculty25.setId(0);
        java.lang.String str29 = faculty25.update("");
        java.util.ArrayList<actions.Rent> rentList30 = faculty25.getRentals();
        faculty25.setPassword("");
        int int33 = faculty25.getId();
        faculty25.setNumOfOverdue(1);
        faculty25.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList38 = faculty25.getRentals();
        faculty4.calculateFines(rentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, password=,id=35]" + "'", str17.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test126");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.lang.String str13 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=hi!,id=52]" + "'", str13.equals("User [email=, password=hi!,id=52]"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test127");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        faculty4.setEmail("User [email=, password=,id=52]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test128");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        java.lang.String str6 = faculty4.getPassword();
        boolean boolean7 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test129");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "", "", "User [email=, password=,id=0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test130");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.toString();
        int int14 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test131");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=52]", "", "User [email=, password=,id=52]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test132");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        int int10 = faculty4.getId();
        faculty4.setUserType("hi!");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str15 = faculty4.update("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, password=,id=-1]" + "'", str15.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test133");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getUserType();
        java.lang.String str11 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test134");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setUserType("User [email=, password=,id=35]");
        java.lang.String str11 = faculty4.getEmail();
        faculty4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test135");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getEmail();
        int int8 = faculty4.getId();
        double double9 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, password=,id=0]" + "'", str7.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test136");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.String str14 = faculty4.update("User [email=, password=,id=0]");
        java.lang.String str16 = faculty4.update("User [email=, password=,id=35]");
        java.lang.String str17 = faculty4.getEmail();
        int int18 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=, password=,id=35]" + "'", str16.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test137");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=User [email=, password=,id=0], password=hi!,id=100]" + "'", str13.equals("User [email=User [email=, password=,id=0], password=hi!,id=100]"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test138");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getId();
        java.lang.String str13 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=52]" + "'", str13.equals("User [email=, password=,id=52]"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test139");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        int int13 = faculty4.getId();
        faculty4.setId((int) ' ');
        actions.Rent rent16 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent16, maintainPhysicalItems17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test140");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 10, "", "", "");
        userTypes.Faculty faculty9 = new userTypes.Faculty((int) '#', "", "", "");
        faculty9.setId(0);
        faculty9.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList14 = faculty9.getRentals();
        faculty4.calculateFines(rentList14);
        double double16 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test141");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test142");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        boolean boolean11 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test143");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getEmail();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test144");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        java.lang.String str13 = faculty4.getUserType();
        java.lang.String str14 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test145");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 1, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
        boolean boolean5 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test146");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        int int10 = faculty4.getNumOfOverdue();
        double double11 = faculty4.getFine();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test147");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getId();
        int int13 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test148");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getEmail();
        int int12 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test149");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setUserType("User [email=, password=,id=35]");
        java.lang.String str12 = faculty4.toString();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test150");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        faculty4.setPassword("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test151");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getEmail();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test152");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        double double8 = faculty4.getFine();
        faculty4.setUserType("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test153");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setUserType("User [email=, password=,id=35]");
        java.lang.String str12 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=35]" + "'", str12.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test154");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setEmail("");
        faculty4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test155");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        faculty4.setPassword("hi!");
        faculty4.setEmail("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test156");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        faculty4.setUserType("User [email=, password=,id=-1]");
        java.lang.String str8 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, password=,id=-1]" + "'", str8.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test157");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        int int15 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test158");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) '#', "", "", "");
        faculty13.setId(0);
        java.lang.String str17 = faculty13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = faculty13.getRentals();
        faculty13.setPassword("");
        int int21 = faculty13.getId();
        faculty13.setNumOfOverdue(1);
        faculty13.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList26 = faculty13.getRentals();
        faculty4.calculateFines(rentList26);
        java.lang.String str28 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test159");
        userTypes.Faculty faculty4 = new userTypes.Faculty(35, "User [email=, password=,id=0]", "User [email=, password=,id=0]", "");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test160");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        int int10 = faculty4.getId();
        double double11 = faculty4.getFine();
        faculty4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test161");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "hi!");
        java.lang.String str5 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test162");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setUserType("hi!");
        faculty4.setId((int) (short) 100);
        double double9 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test163");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test164");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=52]", "User [email=, password=,id=52]", "User [email=, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test165");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) '#', "", "", "");
        faculty16.setId(0);
        java.lang.String str20 = faculty16.update("");
        java.util.ArrayList<actions.Rent> rentList21 = faculty16.getRentals();
        faculty16.setPassword("");
        int int24 = faculty16.getId();
        faculty16.setNumOfOverdue(1);
        faculty16.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList29 = faculty16.getRentals();
        faculty4.calculateFines(rentList29);
        java.lang.String str31 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test166");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        java.lang.String str6 = faculty4.getPassword();
        java.util.ArrayList<actions.Rent> rentList7 = faculty4.getRentals();
        java.lang.Class<?> wildcardClass8 = rentList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test167");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getUserType();
        java.lang.String str10 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test168");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        int int8 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test169");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        java.lang.String str12 = faculty4.getPassword();
        double double13 = faculty4.getFine();
        int int14 = faculty4.getNumOfOverdue();
        faculty4.setNumOfOverdue((int) (byte) 0);
        int int17 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test170");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        faculty4.setUserType("hi!");
        int int10 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test171");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 10, "", "", "");
        int int5 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test172");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setEmail("");
        faculty4.setNumOfOverdue(1);
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test173");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        int int10 = faculty4.getNumOfOverdue();
        java.lang.String str11 = faculty4.getUserType();
        java.lang.String str12 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test174");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "User [email=, password=,id=0]", "User [email=, password=,id=35]", "User [email=, password=,id=52]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test175");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setId((int) (short) 100);
        int int9 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test176");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=User [email=, password=,id=0], password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test177");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        java.lang.String str12 = faculty4.getPassword();
        double double13 = faculty4.getFine();
        faculty4.setNumOfOverdue(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test178");
        userTypes.Faculty faculty4 = new userTypes.Faculty(1, "User [email=User [email=, password=,id=0], password=,id=0]", "", "User [email=, password=,id=0]");
        double double5 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test179");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str12 = faculty4.getEmail();
        java.lang.String str13 = faculty4.getUserType();
        faculty4.setUserType("User [email=, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test180");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        faculty4.setEmail("User [email=, password=,id=0]");
        faculty4.setUserType("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test181");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        java.lang.String str11 = faculty4.update("User [email=, password=,id=0]");
        boolean boolean12 = faculty4.getValidate();
        java.lang.String str13 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test182");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.String str13 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test183");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setEmail("");
        faculty4.setPassword("hi!");
        faculty4.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test184");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) '#', "", "", "");
        faculty15.setId(0);
        faculty15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = faculty15.getRentals();
        faculty4.calculateFines(rentList20);
        double double22 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test185");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        java.lang.String str11 = faculty4.update("hi!");
        java.lang.String str12 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test186");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setNumOfOverdue(35);
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test187");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        java.lang.String str11 = faculty4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=User [email=, password=,id=0], password=hi!,id=100]" + "'", str11.equals("User [email=User [email=, password=,id=0], password=hi!,id=100]"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test188");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        userTypes.Faculty faculty10 = new userTypes.Faculty((int) '#', "", "", "");
        faculty10.setId(0);
        boolean boolean13 = faculty10.getValidate();
        faculty10.setUserType("");
        java.lang.String str17 = faculty10.update("hi!");
        userTypes.Faculty faculty22 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str23 = faculty22.toString();
        java.lang.String str24 = faculty22.getPassword();
        java.util.ArrayList<actions.Rent> rentList25 = faculty22.getRentals();
        faculty10.calculateFines(rentList25);
        faculty4.calculateFines(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=, password=,id=35]" + "'", str23.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test189");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setUserType("User [email=, password=,id=0]");
        faculty4.setUserType("User [email=, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test190");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.String str14 = faculty4.update("User [email=, password=,id=0]");
        int int15 = faculty4.getId();
        faculty4.setEmail("User [email=, password=,id=35]");
        actions.Rent rent18 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent18, maintainPhysicalItems19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test191");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setEmail("");
        java.lang.String str12 = faculty4.getPassword();
        int int13 = faculty4.getId();
        faculty4.setNumOfOverdue((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test192");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) '#', "", "", "");
        faculty15.setId(0);
        faculty15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = faculty15.getRentals();
        faculty4.calculateFines(rentList20);
        faculty4.setId(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test193");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setNumOfOverdue((int) (short) 1);
        boolean boolean13 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test194");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setId((int) 'a');
        faculty4.setNumOfOverdue((int) '4');
        double double16 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test195");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test196");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = faculty4.update("");
        boolean boolean7 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test197");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) ' ', "User [email=User [email=, password=,id=0], password=hi!,id=100]", "User [email=, password=,id=-1]", "User [email=, password=hi!,id=52]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test198");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setNumOfOverdue(0);
        java.lang.String str12 = faculty4.toString();
        int int13 = faculty4.getId();
        java.util.ArrayList<actions.Rent> rentList14 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test199");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setEmail("");
        faculty4.setNumOfOverdue((int) (byte) 10);
        java.lang.String str13 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test200");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test201");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("hi!");
        faculty4.setId(35);
        faculty4.setPassword("hi!");
        java.lang.String str14 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test202");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) '#', "", "", "");
        faculty15.setId(0);
        faculty15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = faculty15.getRentals();
        faculty4.calculateFines(rentList20);
        java.lang.Class<?> wildcardClass22 = rentList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test203");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.toString();
        java.lang.String str12 = faculty4.getUserType();
        userTypes.Faculty faculty17 = new userTypes.Faculty((int) '#', "", "", "");
        faculty17.setId(0);
        double double20 = faculty17.getFine();
        faculty17.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList23 = faculty17.getRentals();
        double double24 = faculty17.getFine();
        userTypes.Faculty faculty29 = new userTypes.Faculty((int) '#', "", "", "");
        faculty29.setId(0);
        java.lang.String str33 = faculty29.update("");
        java.util.ArrayList<actions.Rent> rentList34 = faculty29.getRentals();
        faculty29.setPassword("");
        int int37 = faculty29.getId();
        faculty29.setNumOfOverdue(1);
        faculty29.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList42 = faculty29.getRentals();
        faculty17.calculateFines(rentList42);
        faculty4.calculateFines(rentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList42);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test204");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        faculty4.setNumOfOverdue(1);
        faculty4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test205");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        userTypes.Faculty faculty12 = new userTypes.Faculty((int) '#', "", "", "");
        faculty12.setId(0);
        int int15 = faculty12.getId();
        double double16 = faculty12.getFine();
        faculty12.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList19 = faculty12.getRentals();
        java.util.ArrayList<actions.Rent> rentList20 = faculty12.getRentals();
        faculty4.calculateFines(rentList20);
        java.lang.String str22 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test206");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.String str7 = faculty4.update("User [email=, password=,id=35]");
        int int8 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, password=,id=35]" + "'", str7.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test207");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        int int13 = faculty4.getId();
        int int14 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test208");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        java.lang.String str11 = faculty4.update("User [email=, password=,id=0]");
        boolean boolean12 = faculty4.getValidate();
        int int13 = faculty4.getNumOfOverdue();
        faculty4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test209");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setEmail("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test210");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) '#', "", "", "");
        faculty13.setId(0);
        java.lang.String str17 = faculty13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = faculty13.getRentals();
        faculty4.calculateFines(rentList18);
        int int20 = faculty4.getId();
        boolean boolean21 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test211");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.toString();
        faculty4.setUserType("User [email=User [email=, password=,id=0], password=,id=-1]");
        faculty4.setUserType("hi!");
        faculty4.setUserType("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test212");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setNumOfOverdue(35);
        faculty4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test213");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) '#', "", "", "");
        faculty15.setId(0);
        boolean boolean18 = faculty15.getValidate();
        double double19 = faculty15.getFine();
        userTypes.Faculty faculty24 = new userTypes.Faculty((int) '#', "", "", "");
        faculty24.setId(0);
        java.lang.String str28 = faculty24.update("");
        java.util.ArrayList<actions.Rent> rentList29 = faculty24.getRentals();
        faculty15.calculateFines(rentList29);
        faculty4.calculateFines(rentList29);
        faculty4.setPassword("User [email=User [email=, password=,id=0], password=,id=-1]");
        int int34 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test214");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getEmail();
        double double8 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test215");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        userTypes.Faculty faculty17 = new userTypes.Faculty((int) '#', "", "", "");
        faculty17.setId(0);
        boolean boolean20 = faculty17.getValidate();
        double double21 = faculty17.getFine();
        userTypes.Faculty faculty26 = new userTypes.Faculty((int) '#', "", "", "");
        faculty26.setId(0);
        java.lang.String str30 = faculty26.update("");
        java.util.ArrayList<actions.Rent> rentList31 = faculty26.getRentals();
        faculty26.setPassword("");
        int int34 = faculty26.getId();
        faculty26.setNumOfOverdue(1);
        faculty26.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList39 = faculty26.getRentals();
        faculty17.calculateFines(rentList39);
        faculty4.calculateFines(rentList39);
        java.lang.Class<?> wildcardClass42 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test216");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setEmail("");
        int int12 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test217");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        faculty4.setNumOfOverdue(1);
        faculty4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
        java.lang.String str18 = faculty4.getUserType();
        java.lang.String str19 = faculty4.getEmail();
        java.lang.String str20 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test218");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setUserType("");
        faculty4.setNumOfOverdue((-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test219");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        int int5 = faculty4.getNumOfOverdue();
        java.lang.String str6 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=0]" + "'", str6.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test220");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        int int5 = faculty4.getId();
        boolean boolean6 = faculty4.getValidate();
        faculty4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
        java.lang.String str9 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test221");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setEmail("");
        java.lang.String str13 = faculty4.update("User [email=, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test222");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setNumOfOverdue((int) (byte) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test223");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (byte) 100);
        faculty4.setPassword("User [email=, password=,id=35]");
        java.lang.String str10 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, password=User [email=, password=,id=35],id=35]" + "'", str10.equals("User [email=, password=User [email=, password=,id=35],id=35]"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test224");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str14 = faculty4.toString();
        java.lang.String str15 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=User [email=, password=,id=0], password=,id=0]" + "'", str14.equals("User [email=User [email=, password=,id=0], password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test225");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        int int9 = faculty4.getNumOfOverdue();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setId((int) '#');
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test226");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = faculty4.update("");
        int int7 = faculty4.getId();
        int int8 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test227");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 10, "", "User [email=, password=,id=35]", "User [email=, password=,id=35]");
        java.lang.String str5 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test228");
        userTypes.Faculty faculty4 = new userTypes.Faculty(10, "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=, password=,id=35]", "User [email=, password=,id=52]");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test229");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        double double10 = faculty4.getFine();
        faculty4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getEmail();
        faculty4.setId((int) (short) 10);
        faculty4.setNumOfOverdue((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test230");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setUserType("");
        faculty4.setPassword("User [email=, password=,id=0]");
        faculty4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = faculty4.getUserType();
        boolean boolean14 = faculty4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test231");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        faculty4.setEmail("User [email=, password=,id=35]");
        java.lang.String str16 = faculty4.getPassword();
        java.lang.String str17 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test232");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getEmail();
        userTypes.Faculty faculty12 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str13 = faculty12.toString();
        java.lang.String str14 = faculty12.getPassword();
        java.util.ArrayList<actions.Rent> rentList15 = faculty12.getRentals();
        faculty4.calculateFines(rentList15);
        double double17 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=35]" + "'", str13.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test233");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setUserType("hi!");
        java.lang.String str13 = faculty4.getUserType();
        boolean boolean14 = faculty4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = faculty4.getRentals();
        faculty4.setId((int) (byte) -1);
        java.lang.String str18 = faculty4.toString();
        faculty4.setEmail("User [email=, password=,id=0]");
        faculty4.setPassword("User [email=User [email=, password=,id=0], password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User [email=, password=,id=-1]" + "'", str18.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test234");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.getEmail();
        boolean boolean14 = faculty4.getValidate();
        int int15 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test235");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) '#', "", "", "");
        faculty13.setId(0);
        java.lang.String str17 = faculty13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = faculty13.getRentals();
        faculty4.calculateFines(rentList18);
        int int20 = faculty4.getId();
        int int21 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test236");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setId((int) (byte) 1);
        double double13 = faculty4.getFine();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test237");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getEmail();
        int int8 = faculty4.getId();
        int int9 = faculty4.getId();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, password=,id=0]" + "'", str7.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test238");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) '#', "", "", "");
        faculty13.setId(0);
        java.lang.String str17 = faculty13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = faculty13.getRentals();
        faculty4.calculateFines(rentList18);
        int int20 = faculty4.getId();
        java.lang.String str21 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test239");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        faculty4.setNumOfOverdue((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test240");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str12 = faculty4.getEmail();
        faculty4.setUserType("hi!");
        java.lang.String str16 = faculty4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=User [email=, password=,id=0], password=hi!,id=100]" + "'", str16.equals("User [email=User [email=, password=,id=0], password=hi!,id=100]"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test241");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setPassword("");
        faculty4.setId((int) ' ');
        faculty4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test242");
        userTypes.Faculty faculty4 = new userTypes.Faculty(52, "User [email=, password=hi!,id=52]", "hi!", "User [email=, password=,id=35]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test243");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setEmail("");
        faculty4.setPassword("hi!");
        faculty4.setPassword("User [email=, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test244");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str9 = faculty4.getUserType();
        faculty4.setPassword("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test245");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setId((int) 'a');
        faculty4.setNumOfOverdue((int) '4');
        faculty4.setPassword("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test246");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        faculty4.setUserType("");
        int int12 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test247");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getId();
        faculty4.setEmail("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test248");
        userTypes.Faculty faculty4 = new userTypes.Faculty(1, "hi!", "User [email=, password=,id=-1]", "User [email=, password=,id=-1]");
        java.lang.String str5 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=-1]" + "'", str5.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test249");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        faculty4.setId(10);
        java.lang.String str7 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=hi!, password=User [email=, password=,id=0],id=10]" + "'", str7.equals("User [email=hi!, password=User [email=, password=,id=0],id=10]"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test250");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getEmail();
        java.lang.String str12 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, password=,id=0]" + "'", str12.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test251");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        java.lang.String str8 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setPassword("");
        int int12 = faculty4.getId();
        faculty4.setNumOfOverdue(1);
        faculty4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
        java.lang.String str18 = faculty4.getUserType();
        java.lang.String str19 = faculty4.getEmail();
        java.lang.String str21 = faculty4.update("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str21.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test252");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        int int7 = faculty4.getId();
        double double8 = faculty4.getFine();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        int int13 = faculty4.getNumOfOverdue();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test253");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "", "User [email=, password=,id=0]", "User [email=, password=hi!,id=0]");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test254");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        double double5 = faculty4.getFine();
        java.lang.String str6 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=0]" + "'", str6.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test255");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setUserType("hi!");
        java.lang.String str13 = faculty4.getUserType();
        boolean boolean14 = faculty4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = faculty4.getRentals();
        faculty4.setId((int) (byte) -1);
        actions.Rent rent18 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent18, maintainPhysicalItems19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test256");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        java.lang.String str12 = faculty4.getPassword();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test257");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        faculty4.setUserType("hi!");
        userTypes.Faculty faculty14 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str15 = faculty14.toString();
        java.lang.String str16 = faculty14.getPassword();
        java.util.ArrayList<actions.Rent> rentList17 = faculty14.getRentals();
        faculty4.calculateFines(rentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, password=,id=35]" + "'", str15.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test258");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        faculty4.setUserType("hi!");
        faculty4.setId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test259");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        java.lang.String str11 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=52]" + "'", str11.equals("User [email=, password=,id=52]"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test260");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) '4');
        double double10 = faculty4.getFine();
        faculty4.setId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test261");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        double double11 = faculty4.getFine();
        int int12 = faculty4.getNumOfOverdue();
        int int13 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test262");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 10, "User [email=hi!, password=User [email=, password=,id=0],id=10]", "User [email=, password=hi!,id=0]", "User [email=, password=,id=-1]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test263");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        boolean boolean10 = faculty4.getValidate();
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setEmail("User [email=, password=,id=0]");
        int int14 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test264");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        faculty4.setUserType("");
        java.lang.String str11 = faculty4.update("hi!");
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str17 = faculty16.toString();
        java.lang.String str18 = faculty16.getPassword();
        java.util.ArrayList<actions.Rent> rentList19 = faculty16.getRentals();
        faculty4.calculateFines(rentList19);
        faculty4.setUserType("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, password=,id=35]" + "'", str17.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test265");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) 'a');
        double double8 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test266");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        boolean boolean7 = faculty4.getValidate();
        double double8 = faculty4.getFine();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) '#', "", "", "");
        faculty13.setId(0);
        java.lang.String str17 = faculty13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = faculty13.getRentals();
        faculty13.setPassword("");
        int int21 = faculty13.getId();
        faculty13.setNumOfOverdue(1);
        faculty13.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList26 = faculty13.getRentals();
        faculty4.calculateFines(rentList26);
        java.util.ArrayList<actions.Rent> rentList28 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList28);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test267");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        faculty4.setId(0);
        double double7 = faculty4.getFine();
        faculty4.setId((int) (byte) -1);
        java.lang.String str10 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }
}

