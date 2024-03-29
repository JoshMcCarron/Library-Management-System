package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test001");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test003");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test004");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test005");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent9, maintainPhysicalItems10);
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
            System.out.format("%n%s%n", "StudentTest.test006");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent8, maintainPhysicalItems9);
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
            System.out.format("%n%s%n", "StudentTest.test007");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        student4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test008");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        double double11 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test009");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setEmail("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test010");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=0]", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test011");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test012");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setUserType("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test013");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent10, maintainPhysicalItems11);
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
            System.out.format("%n%s%n", "StudentTest.test014");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.lang.String str11 = student4.getPassword();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test015");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "User [email=, password=,id=35]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test016");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getUserType();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
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
            System.out.format("%n%s%n", "StudentTest.test017");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.lang.String str11 = student4.update("User [email=, password=,id=35]");
        java.lang.Class<?> wildcardClass12 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test018");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getId();
        student4.setId((int) '#');
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
            System.out.format("%n%s%n", "StudentTest.test019");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "hi!", "", "");
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test020");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test021");
        userTypes.Student student4 = new userTypes.Student((-1), "hi!", "hi!", "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test022");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.toString();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test023");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        student4.setNumOfOverdue((int) (byte) 100);
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent8, maintainPhysicalItems9);
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
            System.out.format("%n%s%n", "StudentTest.test024");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
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
            System.out.format("%n%s%n", "StudentTest.test025");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
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
            System.out.format("%n%s%n", "StudentTest.test026");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.lang.String str11 = student4.update("User [email=, password=,id=35]");
        boolean boolean12 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test027");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 1, "User [email=, password=,id=35]", "User [email=, password=,id=0]", "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test028");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "User [email=, password=,id=35]", "User [email=, password=,id=0]", "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test029");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getPassword();
        actions.Rent rent7 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent7, maintainPhysicalItems8);
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
            System.out.format("%n%s%n", "StudentTest.test030");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        int int10 = student4.getId();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test031");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str12 = student4.getEmail();
        student4.setPassword("User [email=, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test032");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "hi!", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test033");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        double double5 = student4.getFine();
        java.lang.String str6 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test034");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent10, maintainPhysicalItems11);
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
            System.out.format("%n%s%n", "StudentTest.test035");
        userTypes.Student student4 = new userTypes.Student((int) ' ', "hi!", "", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test036");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        boolean boolean8 = student4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test037");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test038");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        student4.setNumOfOverdue(35);
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
            System.out.format("%n%s%n", "StudentTest.test039");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        int int10 = student4.getId();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
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
            System.out.format("%n%s%n", "StudentTest.test040");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        student4.setPassword("User [email=, password=,id=0]");
        student4.setId((int) '#');
        student4.setUserType("User [email=, password=,id=35]");
        double double17 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test041");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        int int10 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test042");
        userTypes.Student student4 = new userTypes.Student((-1), "User [email=, password=,id=0]", "hi!", "hi!");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test043");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=, password=,id=0]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test044");
        userTypes.Student student4 = new userTypes.Student((int) (short) 10, "", "", "");
        userTypes.Student student9 = new userTypes.Student((int) '#', "", "", "");
        student9.setId(0);
        student9.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList14 = student9.getRentals();
        student4.calculateFines(rentList14);
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test045");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        java.lang.String str14 = student4.update("User [email=, password=,id=0]");
        student4.setId((int) (short) 10);
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
            System.out.format("%n%s%n", "StudentTest.test046");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        student4.setEmail("");
        boolean boolean14 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test047");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getUserType();
        student4.setNumOfOverdue(0);
        java.lang.String str13 = student4.update("User [email=, password=,id=35]");
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
            System.out.format("%n%s%n", "StudentTest.test048");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        double double10 = student4.getFine();
        java.lang.String str12 = student4.update("User [email=, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test049");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        java.lang.String str11 = student4.toString();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test050");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        student4.setUserType("User [email=, password=,id=35]");
        int int12 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test051");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=-1]", "hi!", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test052");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test053");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        student4.setPassword("User [email=, password=,id=0]");
        student4.setId((int) '#');
        boolean boolean15 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test054");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getId();
        student4.setPassword("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test055");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        student4.setPassword("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test056");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        userTypes.Student student16 = new userTypes.Student((int) '#', "", "", "");
        student16.setId(0);
        java.lang.String str20 = student16.update("");
        java.util.ArrayList<actions.Rent> rentList21 = student16.getRentals();
        student16.setPassword("");
        int int24 = student16.getId();
        student16.setNumOfOverdue(1);
        student16.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList29 = student16.getRentals();
        student4.calculateFines(rentList29);
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
            System.out.format("%n%s%n", "StudentTest.test057");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        student4.setEmail("User [email=, password=,id=0]");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test058");
        userTypes.Student student4 = new userTypes.Student((-1), "User [email=, password=,id=0]", "hi!", "hi!");
        student4.setUserType("");
        student4.setUserType("User [email=, password=,id=0]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test059");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setNumOfOverdue((int) (short) -1);
        boolean boolean8 = student4.getValidate();
        student4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test060");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setUserType("hi!");
        java.lang.String str7 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test061");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        student4.setNumOfOverdue((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test062");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setNumOfOverdue((int) (short) -1);
        int int8 = student4.getId();
        double double9 = student4.getFine();
        userTypes.Student student14 = new userTypes.Student((int) '#', "", "", "");
        student14.setId(0);
        java.lang.String str18 = student14.update("");
        java.lang.String str20 = student14.update("");
        userTypes.Student student25 = new userTypes.Student((int) '#', "", "", "");
        student25.setId(0);
        student25.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList30 = student25.getRentals();
        student14.calculateFines(rentList30);
        student4.calculateFines(rentList30);
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
            System.out.format("%n%s%n", "StudentTest.test063");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setPassword("hi!");
        student4.setNumOfOverdue((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test064");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        student4.setUserType("");
        student4.setId((int) (short) 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test065");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test066");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.toString();
        double double13 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test067");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent8, maintainPhysicalItems9);
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
            System.out.format("%n%s%n", "StudentTest.test068");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "hi!", "User [email=, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test069");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        java.lang.String str12 = student4.getPassword();
        java.lang.String str13 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test070");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        double double10 = student4.getFine();
        int int11 = student4.getId();
        student4.setUserType("User [email=, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test071");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        java.lang.String str15 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test072");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setEmail("");
        double double12 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test073");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        boolean boolean11 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test074");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        student4.setPassword("User [email=, password=,id=0]");
        student4.setId((int) '#');
        student4.setUserType("User [email=, password=,id=35]");
        student4.setId((int) '#');
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
            System.out.format("%n%s%n", "StudentTest.test075");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test076");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=-1]", "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=User [email=, password=,id=0], password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test077");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test078");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test079");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test080");
        userTypes.Student student4 = new userTypes.Student(35, "User [email=User [email=, password=,id=0], password=,id=-1]", "User [email=, password=,id=-1]", "User [email=, password=,id=0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test081");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "hi!", "User [email=, password=,id=-1]", "User [email=, password=,id=-1]");
        java.lang.String str5 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=-1]" + "'", str5.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test082");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        student4.setEmail("");
        student4.setId(10);
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
            System.out.format("%n%s%n", "StudentTest.test083");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        int int12 = student4.getNumOfOverdue();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent13, maintainPhysicalItems14);
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
            System.out.format("%n%s%n", "StudentTest.test084");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test085");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        student4.setNumOfOverdue((int) '#');
        java.lang.String str11 = student4.toString();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test086");
        userTypes.Student student4 = new userTypes.Student(35, "User [email=, password=,id=0]", "User [email=, password=,id=0]", "");
        int int5 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test087");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test088");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=User [email=, password=,id=0], password=hi!,id=100]" + "'", str7.equals("User [email=User [email=, password=,id=0], password=hi!,id=100]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test089");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = student4.getEmail();
        int int14 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test090");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=0]", "User [email=, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test091");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        student4.setUserType("User [email=, password=,id=0]");
        int int9 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test092");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        int int11 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test093");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        double double10 = student4.getFine();
        int int11 = student4.getId();
        student4.setEmail("");
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
            System.out.format("%n%s%n", "StudentTest.test094");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setNumOfOverdue((int) (short) -1);
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test095");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setEmail("");
        java.lang.String str12 = student4.update("");
        java.lang.String str13 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test096");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        student4.setUserType("User [email=, password=,id=35]");
        student4.setId((int) (byte) 100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test097");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.toString();
        student4.setUserType("");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test098");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setNumOfOverdue((int) (short) -1);
        int int8 = student4.getId();
        double double9 = student4.getFine();
        userTypes.Student student14 = new userTypes.Student((int) '#', "", "", "");
        student14.setId(0);
        java.lang.String str18 = student14.update("");
        java.util.ArrayList<actions.Rent> rentList19 = student14.getRentals();
        student14.setPassword("");
        int int22 = student14.getId();
        student14.setNumOfOverdue(1);
        student14.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = student14.getRentals();
        student4.calculateFines(rentList27);
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
            System.out.format("%n%s%n", "StudentTest.test099");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setEmail("");
        student4.setNumOfOverdue(1);
        java.lang.String str13 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test100");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        student4.setUserType("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test101");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        student4.setNumOfOverdue((int) (byte) 100);
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test102");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        userTypes.Student student12 = new userTypes.Student((int) '#', "", "", "");
        student12.setId(0);
        student12.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList17 = student12.getRentals();
        student4.calculateFines(rentList17);
        student4.setEmail("User [email=, password=,id=35]");
        java.lang.String str22 = student4.update("User [email=, password=,id=35]");
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
            System.out.format("%n%s%n", "StudentTest.test103");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getUserType();
        java.lang.String str10 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test104");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "User [email=User [email=, password=,id=0], password=,id=-1]", "User [email=User [email=, password=,id=0], password=hi!,id=100]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test105");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.getEmail();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent14, maintainPhysicalItems15);
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
            System.out.format("%n%s%n", "StudentTest.test106");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setPassword("hi!");
        java.lang.String str11 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test107");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 1, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
        student4.setNumOfOverdue((int) (short) 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test108");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        student4.setId(35);
        java.lang.String str17 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test109");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "", "User [email=User [email=, password=,id=0], password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test110");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        java.lang.String str13 = student4.getUserType();
        int int14 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test111");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        student4.setNumOfOverdue((int) '#');
        java.lang.String str11 = student4.toString();
        double double12 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test112");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        java.lang.String str11 = student4.getPassword();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str14 = student4.toString();
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test113");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList6 = student4.getRentals();
        boolean boolean7 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test114");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        student4.setId(35);
        student4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test115");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test116");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "hi!", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test117");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setId((int) (byte) 1);
        student4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList15 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test118");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        student4.setNumOfOverdue((int) (byte) 100);
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test119");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        userTypes.Student student12 = new userTypes.Student((int) '#', "", "", "");
        student12.setId(0);
        student12.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList17 = student12.getRentals();
        student4.calculateFines(rentList17);
        java.lang.String str19 = student4.toString();
        java.lang.Class<?> wildcardClass20 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test120");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setPassword("");
        student4.setId((int) ' ');
        student4.setNumOfOverdue(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test121");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        student4.setId((int) 'a');
        java.lang.Class<?> wildcardClass14 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test122");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        student4.setUserType("");
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
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
            System.out.format("%n%s%n", "StudentTest.test123");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setUserType("hi!");
        java.lang.String str13 = student4.getUserType();
        boolean boolean14 = student4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = student4.getRentals();
        java.lang.String str16 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test124");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.getPassword();
        student4.setNumOfOverdue(10);
        int int12 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test125");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        java.lang.String str11 = student4.update("hi!");
        userTypes.Student student16 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str17 = student16.toString();
        java.lang.String str18 = student16.getPassword();
        java.util.ArrayList<actions.Rent> rentList19 = student16.getRentals();
        student4.calculateFines(rentList19);
        userTypes.Student student25 = new userTypes.Student((int) '#', "", "", "");
        student25.setId(0);
        java.lang.String str29 = student25.update("");
        java.util.ArrayList<actions.Rent> rentList30 = student25.getRentals();
        student25.setPassword("");
        int int33 = student25.getId();
        student25.setNumOfOverdue(1);
        student25.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList38 = student25.getRentals();
        student4.calculateFines(rentList38);
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
            System.out.format("%n%s%n", "StudentTest.test126");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setPassword("hi!");
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test127");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        student4.setEmail("User [email=, password=,id=52]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test128");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getPassword();
        boolean boolean7 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test129");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "", "", "User [email=, password=,id=0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test130");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.toString();
        int int14 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test131");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=52]", "", "User [email=, password=,id=52]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test132");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        int int10 = student4.getId();
        student4.setUserType("hi!");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str15 = student4.update("User [email=, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test133");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getUserType();
        java.lang.String str11 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test134");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        student4.setUserType("User [email=, password=,id=35]");
        java.lang.String str11 = student4.getEmail();
        student4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent14, maintainPhysicalItems15);
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
            System.out.format("%n%s%n", "StudentTest.test135");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getEmail();
        int int8 = student4.getId();
        double double9 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test136");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        java.lang.String str14 = student4.update("User [email=, password=,id=0]");
        java.lang.String str16 = student4.update("User [email=, password=,id=35]");
        java.lang.String str17 = student4.getEmail();
        int int18 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test137");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = student4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
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
            System.out.format("%n%s%n", "StudentTest.test138");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getId();
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test139");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        int int13 = student4.getId();
        student4.setId((int) ' ');
        actions.Rent rent16 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems17 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent16, maintainPhysicalItems17);
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
            System.out.format("%n%s%n", "StudentTest.test140");
        userTypes.Student student4 = new userTypes.Student((int) (short) 10, "", "", "");
        userTypes.Student student9 = new userTypes.Student((int) '#', "", "", "");
        student9.setId(0);
        student9.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList14 = student9.getRentals();
        student4.calculateFines(rentList14);
        double double16 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test141");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setNumOfOverdue((int) (short) -1);
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test142");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        boolean boolean11 = student4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test143");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = student4.getPassword();
        java.lang.String str10 = student4.getPassword();
        java.lang.String str11 = student4.getEmail();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test144");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        java.lang.String str13 = student4.getUserType();
        java.lang.String str14 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test145");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 1, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
        boolean boolean5 = student4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test146");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        int int10 = student4.getNumOfOverdue();
        double double11 = student4.getFine();
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent12, maintainPhysicalItems13);
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
            System.out.format("%n%s%n", "StudentTest.test147");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getId();
        int int13 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test148");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = student4.getPassword();
        java.lang.String str10 = student4.getPassword();
        java.lang.String str11 = student4.getEmail();
        int int12 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test149");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        student4.setUserType("User [email=, password=,id=35]");
        java.lang.String str12 = student4.toString();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent13, maintainPhysicalItems14);
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
            System.out.format("%n%s%n", "StudentTest.test150");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        student4.setPassword("User [email=User [email=, password=,id=0], password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test151");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getEmail();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent14, maintainPhysicalItems15);
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
            System.out.format("%n%s%n", "StudentTest.test152");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        double double8 = student4.getFine();
        student4.setUserType("User [email=, password=,id=35]");
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
            System.out.format("%n%s%n", "StudentTest.test153");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        student4.setUserType("User [email=, password=,id=35]");
        java.lang.String str12 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test154");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        student4.setEmail("");
        student4.setPassword("");
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
            System.out.format("%n%s%n", "StudentTest.test155");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        student4.setPassword("hi!");
        student4.setEmail("User [email=, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test156");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        student4.setUserType("User [email=, password=,id=-1]");
        java.lang.String str8 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, password=,id=-1]" + "'", str8.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test157");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test158");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        userTypes.Student student13 = new userTypes.Student((int) '#', "", "", "");
        student13.setId(0);
        java.lang.String str17 = student13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = student13.getRentals();
        student13.setPassword("");
        int int21 = student13.getId();
        student13.setNumOfOverdue(1);
        student13.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList26 = student13.getRentals();
        student4.calculateFines(rentList26);
        java.lang.String str28 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test159");
        userTypes.Student student4 = new userTypes.Student(35, "User [email=, password=,id=0]", "User [email=, password=,id=0]", "");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test160");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        int int10 = student4.getId();
        double double11 = student4.getFine();
        student4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test161");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "hi!");
        java.lang.String str5 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test162");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setUserType("hi!");
        student4.setId((int) (short) 100);
        double double9 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test163");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent13, maintainPhysicalItems14);
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
            System.out.format("%n%s%n", "StudentTest.test164");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=52]", "User [email=, password=,id=52]", "User [email=, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test165");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        userTypes.Student student16 = new userTypes.Student((int) '#', "", "", "");
        student16.setId(0);
        java.lang.String str20 = student16.update("");
        java.util.ArrayList<actions.Rent> rentList21 = student16.getRentals();
        student16.setPassword("");
        int int24 = student16.getId();
        student16.setNumOfOverdue(1);
        student16.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList29 = student16.getRentals();
        student4.calculateFines(rentList29);
        java.lang.String str31 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test166");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getPassword();
        java.util.ArrayList<actions.Rent> rentList7 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test167");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getUserType();
        java.lang.String str10 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test168");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
        int int8 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test169");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        java.lang.String str12 = student4.getPassword();
        double double13 = student4.getFine();
        int int14 = student4.getNumOfOverdue();
        student4.setNumOfOverdue((int) (byte) 0);
        int int17 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test170");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
        student4.setUserType("hi!");
        int int10 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test171");
        userTypes.Student student4 = new userTypes.Student((int) (short) 10, "", "", "");
        int int5 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test172");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setEmail("");
        student4.setNumOfOverdue(1);
        java.lang.Class<?> wildcardClass13 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test173");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        int int10 = student4.getNumOfOverdue();
        java.lang.String str11 = student4.getUserType();
        java.lang.String str12 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test174");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "User [email=, password=,id=0]", "User [email=, password=,id=35]", "User [email=, password=,id=52]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test175");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setId((int) (short) 100);
        int int9 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test176");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=User [email=, password=,id=0], password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test177");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        java.lang.String str12 = student4.getPassword();
        double double13 = student4.getFine();
        student4.setNumOfOverdue(1);
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
            System.out.format("%n%s%n", "StudentTest.test178");
        userTypes.Student student4 = new userTypes.Student(1, "User [email=User [email=, password=,id=0], password=,id=0]", "", "User [email=, password=,id=0]");
        double double5 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test179");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str12 = student4.getEmail();
        java.lang.String str13 = student4.getUserType();
        student4.setUserType("User [email=, password=hi!,id=52]");
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
            System.out.format("%n%s%n", "StudentTest.test180");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        student4.setEmail("User [email=, password=,id=0]");
        student4.setUserType("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test181");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        java.lang.String str11 = student4.update("User [email=, password=,id=0]");
        boolean boolean12 = student4.getValidate();
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test182");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        java.lang.String str13 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test183");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setEmail("");
        student4.setPassword("hi!");
        student4.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test184");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        userTypes.Student student15 = new userTypes.Student((int) '#', "", "", "");
        student15.setId(0);
        student15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = student15.getRentals();
        student4.calculateFines(rentList20);
        double double22 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test185");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        java.lang.String str11 = student4.update("hi!");
        java.lang.String str12 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test186");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        student4.setNumOfOverdue(35);
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent10, maintainPhysicalItems11);
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
            System.out.format("%n%s%n", "StudentTest.test187");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        java.lang.String str11 = student4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
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
            System.out.format("%n%s%n", "StudentTest.test188");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        userTypes.Student student10 = new userTypes.Student((int) '#', "", "", "");
        student10.setId(0);
        boolean boolean13 = student10.getValidate();
        student10.setUserType("");
        java.lang.String str17 = student10.update("hi!");
        userTypes.Student student22 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str23 = student22.toString();
        java.lang.String str24 = student22.getPassword();
        java.util.ArrayList<actions.Rent> rentList25 = student22.getRentals();
        student10.calculateFines(rentList25);
        student4.calculateFines(rentList25);
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
            System.out.format("%n%s%n", "StudentTest.test189");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setUserType("User [email=, password=,id=0]");
        student4.setUserType("User [email=, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test190");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        java.lang.String str14 = student4.update("User [email=, password=,id=0]");
        int int15 = student4.getId();
        student4.setEmail("User [email=, password=,id=35]");
        actions.Rent rent18 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent18, maintainPhysicalItems19);
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
            System.out.format("%n%s%n", "StudentTest.test191");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setEmail("");
        java.lang.String str12 = student4.getPassword();
        int int13 = student4.getId();
        student4.setNumOfOverdue((int) (short) 10);
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
            System.out.format("%n%s%n", "StudentTest.test192");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        userTypes.Student student15 = new userTypes.Student((int) '#', "", "", "");
        student15.setId(0);
        student15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = student15.getRentals();
        student4.calculateFines(rentList20);
        student4.setId(52);
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
            System.out.format("%n%s%n", "StudentTest.test193");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setNumOfOverdue((int) (short) 1);
        boolean boolean13 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test194");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        student4.setId((int) 'a');
        student4.setNumOfOverdue((int) '4');
        double double16 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test195");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        student4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, password=,id=0]" + "'", str14.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test196");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = student4.update("");
        boolean boolean7 = student4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test197");
        userTypes.Student student4 = new userTypes.Student((int) ' ', "User [email=User [email=, password=,id=0], password=hi!,id=100]", "User [email=, password=,id=-1]", "User [email=, password=hi!,id=52]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test198");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getUserType();
        student4.setNumOfOverdue(0);
        java.lang.String str12 = student4.toString();
        int int13 = student4.getId();
        java.util.ArrayList<actions.Rent> rentList14 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test199");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setEmail("");
        student4.setNumOfOverdue((int) (byte) 10);
        java.lang.String str13 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test200");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test201");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("hi!");
        student4.setId(35);
        student4.setPassword("hi!");
        java.lang.String str14 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test202");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        userTypes.Student student15 = new userTypes.Student((int) '#', "", "", "");
        student15.setId(0);
        student15.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList20 = student15.getRentals();
        student4.calculateFines(rentList20);
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
            System.out.format("%n%s%n", "StudentTest.test203");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getUserType();
        userTypes.Student student17 = new userTypes.Student((int) '#', "", "", "");
        student17.setId(0);
        double double20 = student17.getFine();
        student17.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList23 = student17.getRentals();
        double double24 = student17.getFine();
        userTypes.Student student29 = new userTypes.Student((int) '#', "", "", "");
        student29.setId(0);
        java.lang.String str33 = student29.update("");
        java.util.ArrayList<actions.Rent> rentList34 = student29.getRentals();
        student29.setPassword("");
        int int37 = student29.getId();
        student29.setNumOfOverdue(1);
        student29.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList42 = student29.getRentals();
        student17.calculateFines(rentList42);
        student4.calculateFines(rentList42);
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
            System.out.format("%n%s%n", "StudentTest.test204");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        student4.setNumOfOverdue(1);
        student4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
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
            System.out.format("%n%s%n", "StudentTest.test205");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        userTypes.Student student12 = new userTypes.Student((int) '#', "", "", "");
        student12.setId(0);
        int int15 = student12.getId();
        double double16 = student12.getFine();
        student12.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList19 = student12.getRentals();
        java.util.ArrayList<actions.Rent> rentList20 = student12.getRentals();
        student4.calculateFines(rentList20);
        java.lang.String str22 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test206");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        java.lang.String str7 = student4.update("User [email=, password=,id=35]");
        int int8 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.update("");
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
            System.out.format("%n%s%n", "StudentTest.test207");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        int int13 = student4.getId();
        int int14 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test208");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        java.lang.String str11 = student4.update("User [email=, password=,id=0]");
        boolean boolean12 = student4.getValidate();
        int int13 = student4.getNumOfOverdue();
        student4.setEmail("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test209");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setEmail("User [email=User [email=, password=,id=0], password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test210");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        userTypes.Student student13 = new userTypes.Student((int) '#', "", "", "");
        student13.setId(0);
        java.lang.String str17 = student13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = student13.getRentals();
        student4.calculateFines(rentList18);
        int int20 = student4.getId();
        boolean boolean21 = student4.getValidate();
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
            System.out.format("%n%s%n", "StudentTest.test211");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.toString();
        student4.setUserType("User [email=User [email=, password=,id=0], password=,id=-1]");
        student4.setUserType("hi!");
        student4.setUserType("User [email=, password=hi!,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test212");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
        student4.setNumOfOverdue(35);
        student4.setEmail("");
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
            System.out.format("%n%s%n", "StudentTest.test213");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        userTypes.Student student15 = new userTypes.Student((int) '#', "", "", "");
        student15.setId(0);
        boolean boolean18 = student15.getValidate();
        double double19 = student15.getFine();
        userTypes.Student student24 = new userTypes.Student((int) '#', "", "", "");
        student24.setId(0);
        java.lang.String str28 = student24.update("");
        java.util.ArrayList<actions.Rent> rentList29 = student24.getRentals();
        student15.calculateFines(rentList29);
        student4.calculateFines(rentList29);
        student4.setPassword("User [email=User [email=, password=,id=0], password=,id=-1]");
        int int34 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test214");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test215");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        userTypes.Student student17 = new userTypes.Student((int) '#', "", "", "");
        student17.setId(0);
        boolean boolean20 = student17.getValidate();
        double double21 = student17.getFine();
        userTypes.Student student26 = new userTypes.Student((int) '#', "", "", "");
        student26.setId(0);
        java.lang.String str30 = student26.update("");
        java.util.ArrayList<actions.Rent> rentList31 = student26.getRentals();
        student26.setPassword("");
        int int34 = student26.getId();
        student26.setNumOfOverdue(1);
        student26.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList39 = student26.getRentals();
        student17.calculateFines(rentList39);
        student4.calculateFines(rentList39);
        java.lang.Class<?> wildcardClass42 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test216");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setEmail("");
        int int12 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test217");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        student4.setNumOfOverdue(1);
        student4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
        java.lang.String str18 = student4.getUserType();
        java.lang.String str19 = student4.getEmail();
        java.lang.String str20 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test218");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        student4.setUserType("");
        student4.setNumOfOverdue((-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test219");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        int int5 = student4.getNumOfOverdue();
        java.lang.String str6 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=0]" + "'", str6.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test220");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        int int5 = student4.getId();
        boolean boolean6 = student4.getValidate();
        student4.setUserType("User [email=User [email=, password=,id=0], password=,id=0]");
        java.lang.String str9 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test221");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getEmail();
        student4.setEmail("");
        java.lang.String str13 = student4.update("User [email=, password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test222");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        student4.setNumOfOverdue((int) (byte) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test223");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        student4.setNumOfOverdue((int) (byte) 100);
        student4.setPassword("User [email=, password=,id=35]");
        java.lang.String str10 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, password=User [email=, password=,id=35],id=35]" + "'", str10.equals("User [email=, password=User [email=, password=,id=35],id=35]"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test224");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        java.lang.String str11 = student4.getPassword();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str14 = student4.toString();
        java.lang.String str15 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test225");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        int int9 = student4.getNumOfOverdue();
        java.lang.String str10 = student4.getEmail();
        student4.setPassword("User [email=, password=,id=0]");
        student4.setId((int) '#');
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test226");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = student4.update("");
        int int7 = student4.getId();
        int int8 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test227");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 10, "", "User [email=, password=,id=35]", "User [email=, password=,id=35]");
        java.lang.String str5 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test228");
        userTypes.Student student4 = new userTypes.Student(10, "User [email=User [email=, password=,id=0], password=,id=0]", "User [email=, password=,id=35]", "User [email=, password=,id=52]");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test229");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        double double10 = student4.getFine();
        student4.setEmail("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getEmail();
        student4.setId((int) (short) 10);
        student4.setNumOfOverdue((int) (byte) 0);
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
            System.out.format("%n%s%n", "StudentTest.test230");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setUserType("");
        student4.setPassword("User [email=, password=,id=0]");
        student4.setUserType("User [email=, password=,id=0]");
        java.lang.String str13 = student4.getUserType();
        boolean boolean14 = student4.getValidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, password=,id=0]" + "'", str13.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test231");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.lang.String str11 = student4.getPassword();
        student4.setId((int) (short) 1);
        student4.setEmail("User [email=, password=,id=35]");
        java.lang.String str16 = student4.getPassword();
        java.lang.String str17 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test232");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getEmail();
        userTypes.Student student12 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str13 = student12.toString();
        java.lang.String str14 = student12.getPassword();
        java.util.ArrayList<actions.Rent> rentList15 = student12.getRentals();
        student4.calculateFines(rentList15);
        double double17 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test233");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setUserType("hi!");
        java.lang.String str13 = student4.getUserType();
        boolean boolean14 = student4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = student4.getRentals();
        student4.setId((int) (byte) -1);
        java.lang.String str18 = student4.toString();
        student4.setEmail("User [email=, password=,id=0]");
        student4.setPassword("User [email=User [email=, password=,id=0], password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test234");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.getEmail();
        boolean boolean14 = student4.getValidate();
        int int15 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test235");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        userTypes.Student student13 = new userTypes.Student((int) '#', "", "", "");
        student13.setId(0);
        java.lang.String str17 = student13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = student13.getRentals();
        student4.calculateFines(rentList18);
        int int20 = student4.getId();
        int int21 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test236");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setId((int) (byte) 1);
        double double13 = student4.getFine();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent14, maintainPhysicalItems15);
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
            System.out.format("%n%s%n", "StudentTest.test237");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "hi!", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getEmail();
        int int8 = student4.getId();
        int int9 = student4.getId();
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent10, maintainPhysicalItems11);
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
            System.out.format("%n%s%n", "StudentTest.test238");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        userTypes.Student student13 = new userTypes.Student((int) '#', "", "", "");
        student13.setId(0);
        java.lang.String str17 = student13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = student13.getRentals();
        student4.calculateFines(rentList18);
        int int20 = student4.getId();
        java.lang.String str21 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test239");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        student4.setNumOfOverdue((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test240");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str12 = student4.getEmail();
        student4.setUserType("hi!");
        java.lang.String str16 = student4.update("User [email=User [email=, password=,id=0], password=hi!,id=100]");
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
            System.out.format("%n%s%n", "StudentTest.test241");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setPassword("");
        student4.setId((int) ' ');
        student4.setEmail("User [email=User [email=, password=,id=0], password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test242");
        userTypes.Student student4 = new userTypes.Student(52, "User [email=, password=hi!,id=52]", "hi!", "User [email=, password=,id=35]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test243");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setEmail("");
        student4.setPassword("hi!");
        student4.setPassword("User [email=, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test244");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str9 = student4.getUserType();
        student4.setPassword("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test245");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        student4.setId((int) 'a');
        student4.setNumOfOverdue((int) '4');
        student4.setPassword("User [email=, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test246");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        student4.setUserType("");
        int int12 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test247");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getId();
        student4.setEmail("User [email=, password=hi!,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test248");
        userTypes.Student student4 = new userTypes.Student(1, "hi!", "User [email=, password=,id=-1]", "User [email=, password=,id=-1]");
        java.lang.String str5 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=-1]" + "'", str5.equals("User [email=, password=,id=-1]"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test249");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        student4.setId(10);
        java.lang.String str7 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=hi!, password=User [email=, password=,id=0],id=10]" + "'", str7.equals("User [email=hi!, password=User [email=, password=,id=0],id=10]"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test250");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str9 = student4.getPassword();
        java.lang.String str10 = student4.getPassword();
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test251");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        java.lang.String str8 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setPassword("");
        int int12 = student4.getId();
        student4.setNumOfOverdue(1);
        student4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
        java.lang.String str18 = student4.getUserType();
        java.lang.String str19 = student4.getEmail();
        java.lang.String str21 = student4.update("User [email=, password=hi!,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test252");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        int int7 = student4.getId();
        double double8 = student4.getFine();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        int int13 = student4.getNumOfOverdue();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent14, maintainPhysicalItems15);
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
            System.out.format("%n%s%n", "StudentTest.test253");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "", "User [email=, password=,id=0]", "User [email=, password=hi!,id=0]");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test254");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "hi!", "User [email=, password=,id=0]", "");
        double double5 = student4.getFine();
        java.lang.String str6 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=0]" + "'", str6.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test255");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setUserType("hi!");
        java.lang.String str13 = student4.getUserType();
        boolean boolean14 = student4.getValidate();
        java.util.ArrayList<actions.Rent> rentList15 = student4.getRentals();
        student4.setId((int) (byte) -1);
        actions.Rent rent18 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems19 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent18, maintainPhysicalItems19);
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
            System.out.format("%n%s%n", "StudentTest.test256");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        java.lang.String str12 = student4.getPassword();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent13, maintainPhysicalItems14);
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
            System.out.format("%n%s%n", "StudentTest.test257");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
        student4.setUserType("hi!");
        userTypes.Student student14 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str15 = student14.toString();
        java.lang.String str16 = student14.getPassword();
        java.util.ArrayList<actions.Rent> rentList17 = student14.getRentals();
        student4.calculateFines(rentList17);
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
            System.out.format("%n%s%n", "StudentTest.test258");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
        student4.setUserType("hi!");
        student4.setId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test259");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        java.lang.String str11 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test260");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) '4');
        double double10 = student4.getFine();
        student4.setId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test261");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        double double11 = student4.getFine();
        int int12 = student4.getNumOfOverdue();
        int int13 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test262");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 10, "User [email=hi!, password=User [email=, password=,id=0],id=10]", "User [email=, password=hi!,id=0]", "User [email=, password=,id=-1]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test263");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        boolean boolean10 = student4.getValidate();
        java.lang.String str11 = student4.getPassword();
        student4.setEmail("User [email=, password=,id=0]");
        int int14 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test264");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        student4.setUserType("");
        java.lang.String str11 = student4.update("hi!");
        userTypes.Student student16 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str17 = student16.toString();
        java.lang.String str18 = student16.getPassword();
        java.util.ArrayList<actions.Rent> rentList19 = student16.getRentals();
        student4.calculateFines(rentList19);
        student4.setUserType("User [email=, password=hi!,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test265");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setNumOfOverdue((int) 'a');
        double double8 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test266");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        boolean boolean7 = student4.getValidate();
        double double8 = student4.getFine();
        userTypes.Student student13 = new userTypes.Student((int) '#', "", "", "");
        student13.setId(0);
        java.lang.String str17 = student13.update("");
        java.util.ArrayList<actions.Rent> rentList18 = student13.getRentals();
        student13.setPassword("");
        int int21 = student13.getId();
        student13.setNumOfOverdue(1);
        student13.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList26 = student13.getRentals();
        student4.calculateFines(rentList26);
        java.util.ArrayList<actions.Rent> rentList28 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test267");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        student4.setId(0);
        double double7 = student4.getFine();
        student4.setId((int) (byte) -1);
        java.lang.String str10 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }
}

