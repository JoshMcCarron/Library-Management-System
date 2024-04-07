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
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        double double9 = student4.getFine();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test002");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test003");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setId(0);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test004");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test005");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test007");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test008");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test009");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=hi!, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test010");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test011");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setEmail("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test012");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test013");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test015");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test016");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test017");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=hi!, password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test018");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
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
            System.out.format("%n%s%n", "StudentTest.test019");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str8 = student4.getPassword();
        userTypes.Student student13 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = student13.getRentals();
        student4.calculateFines(rentList14);
        java.lang.String str17 = student4.update("hi!");
        student4.setEmail("User [email=hi!, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test020");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student16.getRentals();
        student4.calculateFines(rentList17);
        java.lang.Class<?> wildcardClass19 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test021");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setId((int) (short) 10);
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
            System.out.format("%n%s%n", "StudentTest.test022");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test023");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getUserType();
        int int16 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test024");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test025");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setPassword("");
        student4.setPassword("hi!");
        student4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test026");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student11 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = student11.getRentals();
        student4.calculateFines(rentList12);
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
            System.out.format("%n%s%n", "StudentTest.test027");
        userTypes.Student student4 = new userTypes.Student(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        student4.setNumOfOverdue((int) (short) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test028");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test029");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        int int10 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test030");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList7 = student4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test031");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test032");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str10 = student4.update("");
        int int11 = student4.getNumOfOverdue();
        int int12 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test033");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
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
            System.out.format("%n%s%n", "StudentTest.test034");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setId(0);
        student4.setNumOfOverdue((int) (byte) 10);
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test035");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test036");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str14 = student4.getUserType();
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test037");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        student4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test038");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        student4.setEmail("hi!");
        java.lang.String str10 = student4.getEmail();
        java.lang.String str11 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test039");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("hi!");
        int int13 = student4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test040");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = student4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test041");
        userTypes.Student student4 = new userTypes.Student(0, "hi!", "", "User [email=hi!, password=,id=-1]");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test042");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        java.lang.String str14 = student4.getUserType();
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test043");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setId((int) (short) 1);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setId((int) (byte) 0);
        actions.Rent rent21 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent21, maintainPhysicalItems22);
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
            System.out.format("%n%s%n", "StudentTest.test044");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "", "User [email=hi!, password=,id=-1]", "");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test045");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        student4.setId(100);
        student4.setNumOfOverdue((int) ' ');
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test046");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        double double14 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test047");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test048");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test049");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        actions.Rent rent6 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent6, maintainPhysicalItems7);
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
            System.out.format("%n%s%n", "StudentTest.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test051");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        student4.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test052");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test053");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test054");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        student4.setUserType("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test055");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student11 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = student11.getRentals();
        student4.calculateFines(rentList12);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test056");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=-1]", "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test057");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setId((int) (short) 1);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setId((int) (byte) 0);
        student4.setUserType("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test058");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test059");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setId((int) (short) 1);
        int int17 = student4.getId();
        student4.setPassword("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test060");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test061");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setEmail("");
        double double15 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test062");
        userTypes.Student student4 = new userTypes.Student((int) (short) 100, "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test063");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test064");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        java.lang.String str12 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test065");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = student4.getFine();
        double double6 = student4.getFine();
        java.lang.String str7 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test066");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        int int6 = student4.getId();
        student4.setNumOfOverdue(0);
        userTypes.Student student13 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str15 = student13.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student20 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = student20.getRentals();
        student13.calculateFines(rentList21);
        student4.calculateFines(rentList21);
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
            System.out.format("%n%s%n", "StudentTest.test067");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test068");
        userTypes.Student student4 = new userTypes.Student((int) ' ', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test069");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str8 = student4.getPassword();
        userTypes.Student student13 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = student13.getRentals();
        student4.calculateFines(rentList14);
        student4.setId((int) ' ');
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
            System.out.format("%n%s%n", "StudentTest.test070");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.toString();
        student4.setNumOfOverdue((int) (byte) -1);
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
            System.out.format("%n%s%n", "StudentTest.test071");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        student4.calculateFines(rentList10);
        int int13 = student4.getId();
        student4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        student4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test072");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test073");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        int int14 = student4.getId();
        userTypes.Student student19 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str21 = student19.update("");
        java.lang.String str22 = student19.getUserType();
        java.lang.String str23 = student19.toString();
        java.lang.String str24 = student19.toString();
        java.lang.String str26 = student19.update("");
        userTypes.Student student31 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList32 = student31.getRentals();
        student19.calculateFines(rentList32);
        student4.calculateFines(rentList32);
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
            System.out.format("%n%s%n", "StudentTest.test074");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        student4.calculateFines(rentList10);
        student4.setPassword("User [email=hi!, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test075");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = student4.getPassword();
        student4.setNumOfOverdue((-1));
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
            System.out.format("%n%s%n", "StudentTest.test076");
        userTypes.Student student4 = new userTypes.Student((int) '#', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        student4.setPassword("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test077");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = student4.getPassword();
        double double18 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test078");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        student4.setEmail("hi!");
        java.lang.String str10 = student4.getEmail();
        userTypes.Student student15 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = student15.update("");
        java.lang.String str18 = student15.getUserType();
        java.lang.String str19 = student15.toString();
        java.lang.String str20 = student15.toString();
        java.lang.String str22 = student15.update("");
        userTypes.Student student27 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = student27.getRentals();
        student15.calculateFines(rentList28);
        student4.calculateFines(rentList28);
        double double31 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test079");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "User [email=hi!, password=,id=-1]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test080");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        java.lang.Class<?> wildcardClass13 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test081");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("hi!");
        student4.setId((int) (byte) 100);
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
            System.out.format("%n%s%n", "StudentTest.test082");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test083");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        java.lang.String str14 = student4.getUserType();
        java.lang.Class<?> wildcardClass15 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test084");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str13 = student4.getUserType();
        int int14 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test085");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test086");
        userTypes.Student student4 = new userTypes.Student(0, "", "", "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test087");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str8 = student4.getPassword();
        userTypes.Student student13 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student13.setPassword("");
        student13.setId(0);
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        student13.calculateFines(rentList19);
        student4.calculateFines(rentList19);
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
            System.out.format("%n%s%n", "StudentTest.test088");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str10.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test089");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str14 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test090");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test091");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test092");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        student4.setNumOfOverdue(10);
        student4.setEmail("hi!");
        java.lang.String str11 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test093");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=-1]", "", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test094");
        userTypes.Student student4 = new userTypes.Student(100, "", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test095");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test096");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = student4.getId();
        int int11 = student4.getNumOfOverdue();
        int int12 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test097");
        userTypes.Student student4 = new userTypes.Student(1, "User [email=hi!, password=,id=-1]", "", "User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setEmail("hi!");
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
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test098");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 1, "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=-1]");
        java.lang.String str5 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str5.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test099");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        student4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test100");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
        int int15 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test101");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getUserType();
        userTypes.Student student20 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = student20.getRentals();
        student20.setUserType("hi!");
        java.lang.String str24 = student20.getPassword();
        userTypes.Student student29 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList30 = student29.getRentals();
        student20.calculateFines(rentList30);
        student4.calculateFines(rentList30);
        java.lang.Class<?> wildcardClass33 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test102");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.toString();
        student4.setId(10);
        int int13 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test103");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setId((int) (short) 1);
        int int17 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test104");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test105");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test106");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        int int6 = student4.getId();
        student4.setNumOfOverdue(0);
        student4.setNumOfOverdue((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test107");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.toString();
        int int8 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test108");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setEmail("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test109");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        student4.setPassword("");
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
            System.out.format("%n%s%n", "StudentTest.test110");
        userTypes.Student student4 = new userTypes.Student((int) (short) 10, "User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test111");
        userTypes.Student student4 = new userTypes.Student((int) '4', "User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test112");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=35]" + "'", str6.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test113");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        student4.calculateFines(rentList7);
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
        org.junit.Assert.assertNotNull(rentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test114");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        double double14 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test115");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        student4.setNumOfOverdue(10);
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test116");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.toString();
        double double11 = student4.getFine();
        java.lang.String str13 = student4.update("");
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
            System.out.format("%n%s%n", "StudentTest.test117");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        int int14 = student4.getNumOfOverdue();
        student4.setId((int) (byte) 0);
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
            System.out.format("%n%s%n", "StudentTest.test118");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.String str7 = student4.getPassword();
        student4.setId((int) (short) 100);
        student4.setNumOfOverdue((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test119");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test120");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = student4.toString();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str15 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test121");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        int int12 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test122");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        userTypes.Student student18 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str20 = student18.update("");
        student18.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str23 = student18.toString();
        student18.setNumOfOverdue(1);
        int int26 = student18.getId();
        userTypes.Student student31 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str33 = student31.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student38 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = student38.getRentals();
        student31.calculateFines(rentList39);
        student18.calculateFines(rentList39);
        student4.calculateFines(rentList39);
        java.lang.Class<?> wildcardClass43 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test123");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        int int7 = student4.getId();
        java.lang.String str8 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test124");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        double double14 = student4.getFine();
        student4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test125");
        userTypes.Student student4 = new userTypes.Student((int) '#', "", "", "");
        java.lang.String str5 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test126");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        java.lang.String str16 = student4.toString();
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
        java.lang.String str18 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test127");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getUserType();
        java.lang.String str10 = student4.update("User [email=, password=,id=0]");
        int int11 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test128");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str10 = student4.update("");
        student4.setEmail("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test129");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        student4.setNumOfOverdue(10);
        student4.setEmail("hi!");
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test130");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = student4.getFine();
        student4.setNumOfOverdue(100);
        student4.setUserType("");
        int int10 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test131");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test132");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        java.lang.String str14 = student4.update("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList15 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test133");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        java.lang.String str8 = student4.getPassword();
        userTypes.Student student13 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = student13.getRentals();
        student4.calculateFines(rentList14);
        java.lang.Class<?> wildcardClass16 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test134");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=, password=,id=35]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test135");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        java.lang.String str13 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test136");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = student4.getId();
        int int11 = student4.getNumOfOverdue();
        int int12 = student4.getId();
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test137");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test138");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        java.lang.String str14 = student4.getUserType();
        java.lang.String str16 = student4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test139");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = student4.getNumOfOverdue();
        student4.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test140");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        student4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        student4.setId((int) (byte) 10);
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
            System.out.format("%n%s%n", "StudentTest.test141");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = student4.getNumOfOverdue();
        java.lang.String str6 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test142");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.toString();
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student16.setPassword("");
        student16.setId(0);
        student16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        student16.calculateFines(rentList24);
        student4.calculateFines(rentList24);
        java.util.ArrayList<actions.Rent> rentList28 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.calculateFines(rentList28);
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
            System.out.format("%n%s%n", "StudentTest.test143");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        double double15 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test144");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test145");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test146");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test147");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setId(0);
        student4.setNumOfOverdue((int) (byte) 10);
        student4.setPassword("User [email=hi!, password=,id=-1]");
        student4.setEmail("");
        student4.setId(0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test148");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        student4.setId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test149");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test150");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        int int6 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test151");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setId(0);
        student4.setNumOfOverdue((int) (byte) 10);
        student4.setPassword("User [email=hi!, password=,id=-1]");
        student4.setEmail("");
        java.lang.String str15 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test152");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
        student4.setPassword("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test153");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student11 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = student11.getRentals();
        student4.calculateFines(rentList12);
        java.lang.String str14 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test154");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test155");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        student4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = student4.getRentals();
        int int14 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test156");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        student4.setEmail("hi!");
        java.lang.String str10 = student4.getEmail();
        student4.setId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test157");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.getEmail();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test158");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getEmail();
        java.lang.String str12 = student4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        student4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.String str15 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test159");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test160");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test161");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test162");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        student4.setEmail("hi!");
        java.lang.String str10 = student4.getEmail();
        userTypes.Student student15 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = student15.update("");
        java.lang.String str18 = student15.getUserType();
        java.lang.String str19 = student15.toString();
        java.lang.String str20 = student15.toString();
        java.lang.String str22 = student15.update("");
        userTypes.Student student27 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = student27.getRentals();
        student15.calculateFines(rentList28);
        student4.calculateFines(rentList28);
        student4.setNumOfOverdue(97);
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
            System.out.format("%n%s%n", "StudentTest.test163");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        double double7 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test164");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.String str7 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test165");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=35]", "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test166");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setId((int) (byte) 1);
        userTypes.Student student15 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList16 = student15.getRentals();
        student15.setUserType("hi!");
        student15.setEmail("hi!");
        java.lang.String str21 = student15.getEmail();
        userTypes.Student student26 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str28 = student26.update("");
        java.lang.String str29 = student26.getUserType();
        java.lang.String str30 = student26.toString();
        java.lang.String str31 = student26.toString();
        java.lang.String str33 = student26.update("");
        userTypes.Student student38 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = student38.getRentals();
        student26.calculateFines(rentList39);
        student15.calculateFines(rentList39);
        student4.calculateFines(rentList39);
        student4.setEmail("User [email=, password=,id=35]");
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
            System.out.format("%n%s%n", "StudentTest.test167");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 1, "User [email=, password=,id=0]", "User [email=hi!, password=,id=0]", "hi!");
        int int5 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test168");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        student4.calculateFines(rentList10);
        int int13 = student4.getId();
        student4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        double double16 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test169");
        userTypes.Student student4 = new userTypes.Student((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        java.lang.String str5 = student4.getEmail();
        student4.setPassword("");
        java.lang.String str8 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, password=,id=-1], password=,id=1]" + "'", str8.equals("User [email=User [email=hi!, password=,id=-1], password=,id=1]"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test170");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        double double8 = student4.getFine();
        java.lang.String str9 = student4.getEmail();
        student4.setPassword("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test171");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("hi!");
        java.lang.String str11 = student4.getUserType();
        java.lang.String str12 = student4.getUserType();
        java.lang.String str13 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test172");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        student4.setEmail("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        double double15 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test173");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        double double13 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test174");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int17 = student4.getId();
        int int18 = student4.getNumOfOverdue();
        actions.Rent rent19 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = null;
        // The following exception was thrown during execution in test generation
        try {
            student4.returnRental(rent19, maintainPhysicalItems20);
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
            System.out.format("%n%s%n", "StudentTest.test175");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        double double8 = student4.getFine();
        student4.setId((int) (short) 0);
        student4.setPassword("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test176");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        userTypes.Student student18 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str20 = student18.update("User [email=hi!, password=,id=-1]");
        userTypes.Student student25 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList26 = student25.getRentals();
        student18.calculateFines(rentList26);
        student4.calculateFines(rentList26);
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
            System.out.format("%n%s%n", "StudentTest.test177");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test178");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str10 = student4.update("");
        int int11 = student4.getNumOfOverdue();
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student16.setPassword("");
        student16.setId(0);
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        student16.calculateFines(rentList22);
        student4.calculateFines(rentList22);
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
            System.out.format("%n%s%n", "StudentTest.test179");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        student4.setEmail("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test180");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        java.util.ArrayList<actions.Rent> rentList16 = student4.getRentals();
        java.util.ArrayList<actions.Rent> rentList17 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test181");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 100, "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test182");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        student4.setId((int) (byte) -1);
        student4.setId((int) (byte) -1);
        double double9 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test183");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        student4.setId(0);
        double double9 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test184");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str10 = student4.update("");
        student4.setEmail("hi!");
        double double13 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test185");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = student4.getUserType();
        java.lang.String str7 = student4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test186");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test187");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        student4.setPassword("User [email=, password=,id=35]");
        java.lang.String str17 = student4.update("User [email=, password=,id=0]");
        student4.setNumOfOverdue((int) '4');
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
            System.out.format("%n%s%n", "StudentTest.test188");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = student16.getRentals();
        student4.calculateFines(rentList17);
        int int19 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test189");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test190");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        student4.setNumOfOverdue(1);
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student16.setPassword("");
        student16.setId(0);
        student16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        student16.calculateFines(rentList24);
        student4.calculateFines(rentList24);
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
            System.out.format("%n%s%n", "StudentTest.test191");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        int int13 = student4.getNumOfOverdue();
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getUserType();
        java.lang.String str16 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test192");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("hi!");
        java.lang.String str11 = student4.getUserType();
        student4.setId((int) (short) 1);
        student4.setId(0);
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
            System.out.format("%n%s%n", "StudentTest.test193");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("", "User [email=, password=,id=0]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test194");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        int int7 = student4.getId();
        java.lang.String str8 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test195");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("hi!");
        java.lang.String str11 = student4.getUserType();
        student4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList14 = student4.getRentals();
        double double15 = student4.getFine();
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
            System.out.format("%n%s%n", "StudentTest.test196");
        userTypes.Student student4 = new userTypes.Student((int) (short) 0, "User [email=, password=,id=35]", "", "User [email=hi!, password=,id=0]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test197");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("hi!");
        java.lang.String str11 = student4.getUserType();
        int int12 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test198");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        java.lang.String str16 = student4.toString();
        student4.setNumOfOverdue((int) (short) 100);
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
            System.out.format("%n%s%n", "StudentTest.test199");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        student4.setUserType("hi!");
        student4.setEmail("hi!");
        java.lang.String str10 = student4.getEmail();
        student4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test200");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setPassword("");
        java.lang.String str15 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test201");
        userTypes.Student student4 = new userTypes.Student((int) (byte) 10, "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test202");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "User [email=, password=,id=35]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test203");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        double double15 = student4.getFine();
        java.util.ArrayList<actions.Rent> rentList16 = student4.getRentals();
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
            System.out.format("%n%s%n", "StudentTest.test204");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setId((int) (byte) 1);
        double double11 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test205");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        student4.setId((int) (byte) 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test206");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        java.lang.String str6 = student4.update("");
        int int7 = student4.getId();
        java.lang.String str8 = student4.getEmail();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str11 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test207");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        int int13 = student4.getId();
        student4.setPassword("User [email=hi!, password=,id=-1]");
        userTypes.Student student20 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student20.setPassword("");
        student20.setId(0);
        java.util.ArrayList<actions.Rent> rentList25 = student20.getRentals();
        student4.calculateFines(rentList25);
        student4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test208");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str5.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test209");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test210");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.String str7 = student4.getPassword();
        student4.setId((int) (short) 100);
        java.lang.String str10 = student4.getPassword();
        java.lang.String str11 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test211");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = student4.getId();
        student4.setUserType("hi!");
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
            System.out.format("%n%s%n", "StudentTest.test212");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        userTypes.Student student10 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student10.setPassword("");
        student10.setId(0);
        java.lang.String str16 = student10.update("");
        java.util.ArrayList<actions.Rent> rentList17 = student10.getRentals();
        student4.calculateFines(rentList17);
        java.lang.String str19 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test213");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.util.ArrayList<actions.Rent> rentList9 = student4.getRentals();
        student4.setId((int) (short) 0);
        java.lang.String str13 = student4.update("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str13.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test214");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test215");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setEmail("");
        java.lang.String str15 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test216");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = student4.toString();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        student4.setNumOfOverdue((int) (short) 10);
        student4.setNumOfOverdue(1);
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
            System.out.format("%n%s%n", "StudentTest.test217");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test218");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getId();
        userTypes.Student student15 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = student15.update("");
        java.lang.String str18 = student15.getUserType();
        student15.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = student15.toString();
        java.lang.String str22 = student15.toString();
        userTypes.Student student27 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student27.setPassword("");
        student27.setId(0);
        student27.setEmail("");
        actions.Rent[] rentArray34 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList35 = new java.util.ArrayList<actions.Rent>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList35, rentArray34);
        student27.calculateFines(rentList35);
        student15.calculateFines(rentList35);
        student4.calculateFines(rentList35);
        java.lang.String str40 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test219");
        userTypes.Student student4 = new userTypes.Student(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        double double5 = student4.getFine();
        userTypes.Student student10 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student10.setPassword("");
        student10.setId(0);
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        student10.calculateFines(rentList16);
        student4.calculateFines(rentList16);
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
            System.out.format("%n%s%n", "StudentTest.test220");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getUserType();
        java.lang.String str10 = student4.update("User [email=, password=,id=0]");
        java.lang.String str11 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test221");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.getEmail();
        student4.setEmail("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test222");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setPassword("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test223");
        userTypes.Student student4 = new userTypes.Student(100, "", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=, password=,id=35]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test224");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
        int int14 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test225");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.getUserType();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test226");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        java.lang.String str14 = student4.update("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test227");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "", "");
        student4.setId((int) (byte) -1);
        int int7 = student4.getNumOfOverdue();
        java.lang.String str8 = student4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test228");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        int int7 = student4.getId();
        java.lang.String str9 = student4.update("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test229");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.toString();
        int int12 = student4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test230");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getUserType();
        int int10 = student4.getId();
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
            System.out.format("%n%s%n", "StudentTest.test231");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test232");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setPassword("");
        student4.setPassword("hi!");
        java.lang.String str17 = student4.getUserType();
        java.util.ArrayList<actions.Rent> rentList18 = student4.getRentals();
        java.lang.String str20 = student4.update("User [email=, password=,id=0]");
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
            System.out.format("%n%s%n", "StudentTest.test233");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getEmail();
        student4.setPassword("");
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
            System.out.format("%n%s%n", "StudentTest.test234");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        student4.calculateFines(rentList10);
        student4.setNumOfOverdue((int) (short) 10);
        student4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test235");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str13 = student4.getEmail();
        java.lang.String str14 = student4.getPassword();
        student4.setId((int) (short) 1);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        student4.setId((int) (byte) 0);
        java.util.ArrayList<actions.Rent> rentList21 = student4.getRentals();
        java.lang.String str22 = student4.getPassword();
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
            System.out.format("%n%s%n", "StudentTest.test236");
        userTypes.Student student4 = new userTypes.Student((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        double double5 = student4.getFine();
        double double6 = student4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test237");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = student4.getRentals();
        int int13 = student4.getId();
        student4.setPassword("User [email=hi!, password=,id=-1]");
        student4.setId(97);
        java.lang.String str18 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test238");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        student4.setPassword("hi!");
        student4.setUserType("");
        student4.setId((int) '4');
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
            System.out.format("%n%s%n", "StudentTest.test239");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        int int9 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test240");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        double double14 = student4.getFine();
        java.lang.String str15 = student4.getPassword();
        student4.setId((int) (short) -1);
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
            System.out.format("%n%s%n", "StudentTest.test241");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        java.lang.String str16 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test242");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = student4.getRentals();
        java.lang.String str6 = student4.getEmail();
        int int7 = student4.getId();
        java.lang.String str8 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test243");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        double double7 = student4.getFine();
        java.lang.String str8 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test244");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        java.lang.String str11 = student4.toString();
        student4.setNumOfOverdue(0);
        student4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test245");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        student4.setNumOfOverdue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test246");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getEmail();
        java.lang.String str12 = student4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test247");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getId();
        student4.setEmail("");
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
            System.out.format("%n%s%n", "StudentTest.test248");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str9 = student4.getPassword();
        java.lang.String str10 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test249");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getEmail();
        java.lang.String str12 = student4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test250");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("hi!");
        student4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test251");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        int int5 = student4.getId();
        int int6 = student4.getNumOfOverdue();
        student4.setUserType("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test252");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str12 = student4.update("User [email=hi!, password=,id=-1]");
        student4.setUserType("");
        int int15 = student4.getId();
        java.lang.String str16 = student4.toString();
        java.lang.String str18 = student4.update("hi!");
        student4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int21 = student4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "StudentTest.test253");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        student4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.getEmail();
        java.util.ArrayList<actions.Rent> rentList11 = student4.getRentals();
        userTypes.Student student16 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str18 = student16.update("");
        student16.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = student16.toString();
        int int22 = student16.getId();
        userTypes.Student student27 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str29 = student27.update("");
        java.lang.String str30 = student27.getUserType();
        student27.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str33 = student27.toString();
        java.lang.String str34 = student27.toString();
        userTypes.Student student39 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student39.setPassword("");
        student39.setId(0);
        student39.setEmail("");
        actions.Rent[] rentArray46 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList47 = new java.util.ArrayList<actions.Rent>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList47, rentArray46);
        student39.calculateFines(rentList47);
        student27.calculateFines(rentList47);
        student16.calculateFines(rentList47);
        student4.calculateFines(rentList47);
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
            System.out.format("%n%s%n", "StudentTest.test254");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("hi!");
        java.lang.String str13 = student4.getUserType();
        student4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.lang.String str16 = student4.getEmail();
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
            System.out.format("%n%s%n", "StudentTest.test255");
        userTypes.Student student4 = new userTypes.Student((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = student4.getUserType();
        student4.setNumOfOverdue((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test256");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("hi!", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test257");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        userTypes.Student student9 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str11 = student9.update("");
        java.lang.String str12 = student9.getUserType();
        student9.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = student9.toString();
        java.lang.String str16 = student9.toString();
        userTypes.Student student21 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student21.setPassword("");
        student21.setId(0);
        student21.setEmail("");
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        student21.calculateFines(rentList29);
        student9.calculateFines(rentList29);
        student4.calculateFines(rentList29);
        student4.setNumOfOverdue((int) '4');
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
            System.out.format("%n%s%n", "StudentTest.test258");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test259");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        java.lang.String str11 = student4.getPassword();
        java.lang.String str12 = student4.getPassword();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test260");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        student4.setId((int) (byte) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test261");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        java.lang.String str13 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test262");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.toString();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test263");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = student4.getEmail();
        student4.setUserType("User [email=, password=hi!,id=0]");
        java.lang.String str20 = student4.toString();
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
            System.out.format("%n%s%n", "StudentTest.test264");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = student4.getNumOfOverdue();
        int int14 = student4.getNumOfOverdue();
        java.lang.String str15 = student4.getUserType();
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
            System.out.format("%n%s%n", "StudentTest.test265");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str11 = student4.update("");
        student4.setNumOfOverdue((int) (byte) 100);
        student4.setEmail("User [email=hi!, password=,id=-1]");
        student4.setEmail("");
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
            System.out.format("%n%s%n", "StudentTest.test266");
        userTypes.Student student4 = new userTypes.Student(0, "", "hi!", "");
        java.lang.String str5 = student4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        student4.calculateFines(rentList7);
        student4.setNumOfOverdue((int) (byte) 100);
        double double12 = student4.getFine();
        student4.setId((int) '#');
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
            System.out.format("%n%s%n", "StudentTest.test267");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        student4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getNumOfOverdue();
        java.lang.String str11 = student4.getPassword();
        student4.setId((-1));
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
            System.out.format("%n%s%n", "StudentTest.test268");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        java.lang.String str7 = student4.getPassword();
        student4.setId((int) (short) 100);
        java.lang.String str10 = student4.getPassword();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
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
            System.out.format("%n%s%n", "StudentTest.test269");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        student4.calculateFines(rentList12);
        student4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = student4.getUserType();
        student4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test270");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        java.lang.String str10 = student4.update("");
        student4.setPassword("");
        int int13 = student4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test271");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = student4.update("");
        java.lang.String str7 = student4.getUserType();
        student4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = student4.getId();
        int int11 = student4.getNumOfOverdue();
        int int12 = student4.getId();
        student4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "StudentTest.test272");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Student student4 = new userTypes.Student("User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test273");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setPassword("");
        student4.setId(0);
        student4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StudentTest.test274");
        userTypes.Student student4 = new userTypes.Student((int) (short) -1, "hi!", "", "hi!");
        student4.setId(100);
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getUserType();
        java.util.ArrayList<actions.Rent> rentList10 = student4.getRentals();
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

