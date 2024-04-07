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
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        double double9 = faculty4.getFine();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test002");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test003");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setId(0);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test004");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test005");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test007");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test008");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test009");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=hi!, password=,id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test010");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test011");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setEmail("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test012");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test013");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test015");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test016");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test017");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=hi!, password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test018");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
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
            System.out.format("%n%s%n", "FacultyTest.test019");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str8 = faculty4.getPassword();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = faculty13.getRentals();
        faculty4.calculateFines(rentList14);
        java.lang.String str17 = faculty4.update("hi!");
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test020");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty16.getRentals();
        faculty4.calculateFines(rentList17);
        java.lang.Class<?> wildcardClass19 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test021");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setId((int) (short) 10);
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
            System.out.format("%n%s%n", "FacultyTest.test022");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test023");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str14 = faculty4.getUserType();
        java.lang.String str15 = faculty4.getUserType();
        int int16 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test024");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test025");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setPassword("");
        faculty4.setPassword("hi!");
        faculty4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test026");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty11 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = faculty11.getRentals();
        faculty4.calculateFines(rentList12);
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
            System.out.format("%n%s%n", "FacultyTest.test027");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        faculty4.setNumOfOverdue((int) (short) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test028");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test029");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        int int10 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test030");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList7 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test031");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "hi!", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test032");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str10 = faculty4.update("");
        int int11 = faculty4.getNumOfOverdue();
        int int12 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test033");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
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
            System.out.format("%n%s%n", "FacultyTest.test034");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (byte) 10);
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test035");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test036");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str14 = faculty4.getUserType();
        int int15 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test037");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        faculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test038");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        faculty4.setEmail("hi!");
        java.lang.String str10 = faculty4.getEmail();
        java.lang.String str11 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test039");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("hi!");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test040");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = faculty4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test041");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test042");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        java.lang.String str14 = faculty4.getUserType();
        int int15 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test043");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setId((int) (byte) 0);
        actions.Rent rent21 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems22 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent21, maintainPhysicalItems22);
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
            System.out.format("%n%s%n", "FacultyTest.test044");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "", "User [email=hi!, password=,id=-1]", "");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test045");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setId(100);
        faculty4.setNumOfOverdue((int) ' ');
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test046");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        double double14 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test047");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test048");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test049");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        actions.Rent rent6 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent6, maintainPhysicalItems7);
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
            System.out.format("%n%s%n", "FacultyTest.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test051");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        faculty4.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test052");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test053");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test054");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        faculty4.setUserType("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test055");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty11 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = faculty11.getRentals();
        faculty4.calculateFines(rentList12);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test056");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=-1]", "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test057");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setId((int) (byte) 0);
        faculty4.setUserType("hi!");
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
            System.out.format("%n%s%n", "FacultyTest.test058");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test059");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        int int17 = faculty4.getId();
        faculty4.setPassword("hi!");
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
            System.out.format("%n%s%n", "FacultyTest.test060");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test061");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("");
        double double15 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test062");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 100, "hi!", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test063");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test064");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        java.lang.String str12 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test065");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = faculty4.getFine();
        double double6 = faculty4.getFine();
        java.lang.String str7 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test066");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        int int6 = faculty4.getId();
        faculty4.setNumOfOverdue(0);
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str15 = faculty13.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty20 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = faculty20.getRentals();
        faculty13.calculateFines(rentList21);
        faculty4.calculateFines(rentList21);
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
            System.out.format("%n%s%n", "FacultyTest.test067");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test068");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) ' ', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test069");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str8 = faculty4.getPassword();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = faculty13.getRentals();
        faculty4.calculateFines(rentList14);
        faculty4.setId((int) ' ');
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
            System.out.format("%n%s%n", "FacultyTest.test070");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (byte) -1);
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
            System.out.format("%n%s%n", "FacultyTest.test071");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        faculty4.calculateFines(rentList10);
        int int13 = faculty4.getId();
        faculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        faculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test072");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test073");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        int int14 = faculty4.getId();
        userTypes.Faculty faculty19 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str21 = faculty19.update("");
        java.lang.String str22 = faculty19.getUserType();
        java.lang.String str23 = faculty19.toString();
        java.lang.String str24 = faculty19.toString();
        java.lang.String str26 = faculty19.update("");
        userTypes.Faculty faculty31 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList32 = faculty31.getRentals();
        faculty19.calculateFines(rentList32);
        faculty4.calculateFines(rentList32);
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
            System.out.format("%n%s%n", "FacultyTest.test074");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        faculty4.calculateFines(rentList10);
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test075");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = faculty4.getPassword();
        faculty4.setNumOfOverdue((-1));
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
            System.out.format("%n%s%n", "FacultyTest.test076");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        faculty4.setPassword("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test077");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = faculty4.getPassword();
        double double18 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test078");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        faculty4.setEmail("hi!");
        java.lang.String str10 = faculty4.getEmail();
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = faculty15.update("");
        java.lang.String str18 = faculty15.getUserType();
        java.lang.String str19 = faculty15.toString();
        java.lang.String str20 = faculty15.toString();
        java.lang.String str22 = faculty15.update("");
        userTypes.Faculty faculty27 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = faculty27.getRentals();
        faculty15.calculateFines(rentList28);
        faculty4.calculateFines(rentList28);
        double double31 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test079");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test080");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test081");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("hi!");
        faculty4.setId((int) (byte) 100);
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
            System.out.format("%n%s%n", "FacultyTest.test082");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=, password=,id=0]", "", "User [email=, password=,id=0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test083");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        java.lang.String str14 = faculty4.getUserType();
        java.lang.Class<?> wildcardClass15 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test084");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str13 = faculty4.getUserType();
        int int14 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test085");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        faculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str9.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test086");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "", "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test087");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str8 = faculty4.getPassword();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty13.setPassword("");
        faculty13.setId(0);
        actions.Rent[] rentArray18 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList19 = new java.util.ArrayList<actions.Rent>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList19, rentArray18);
        faculty13.calculateFines(rentList19);
        faculty4.calculateFines(rentList19);
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
            System.out.format("%n%s%n", "FacultyTest.test088");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str10.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test089");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str14 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test090");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.getEmail();
        java.lang.String str12 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test091");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test092");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        faculty4.setNumOfOverdue(10);
        faculty4.setEmail("hi!");
        java.lang.String str11 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test093");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=-1]", "", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test094");
        userTypes.Faculty faculty4 = new userTypes.Faculty(100, "", "User [email=hi!, password=,id=-1]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test095");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test096");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = faculty4.getId();
        int int11 = faculty4.getNumOfOverdue();
        int int12 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test097");
        userTypes.Faculty faculty4 = new userTypes.Faculty(1, "User [email=hi!, password=,id=-1]", "", "User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setEmail("hi!");
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
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test098");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 1, "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=-1]");
        java.lang.String str5 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]" + "'", str5.equals("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test099");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test100");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
        int int15 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test101");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str14 = faculty4.getUserType();
        java.lang.String str15 = faculty4.getUserType();
        userTypes.Faculty faculty20 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList21 = faculty20.getRentals();
        faculty20.setUserType("hi!");
        java.lang.String str24 = faculty20.getPassword();
        userTypes.Faculty faculty29 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList30 = faculty29.getRentals();
        faculty20.calculateFines(rentList30);
        faculty4.calculateFines(rentList30);
        java.lang.Class<?> wildcardClass33 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test102");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.toString();
        faculty4.setId(10);
        int int13 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test103");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        int int17 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test104");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test105");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=-1]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test106");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        int int6 = faculty4.getId();
        faculty4.setNumOfOverdue(0);
        faculty4.setNumOfOverdue((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test107");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.toString();
        int int8 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test108");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test109");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        faculty4.setPassword("");
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
            System.out.format("%n%s%n", "FacultyTest.test110");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 10, "User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test111");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '4', "User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=, password=,id=0]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test112");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.getPassword();
        java.lang.String str6 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, password=,id=35]" + "'", str6.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test113");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        faculty4.calculateFines(rentList7);
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
        org.junit.Assert.assertNotNull(rentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test114");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        double double14 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test115");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        faculty4.setNumOfOverdue(10);
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test116");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.toString();
        double double11 = faculty4.getFine();
        java.lang.String str13 = faculty4.update("");
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
            System.out.format("%n%s%n", "FacultyTest.test117");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        int int14 = faculty4.getNumOfOverdue();
        faculty4.setId((int) (byte) 0);
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
            System.out.format("%n%s%n", "FacultyTest.test118");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setId((int) (short) 100);
        faculty4.setNumOfOverdue((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test119");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=0]", "User [email=, password=,id=0]", "User [email=hi!, password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test120");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = faculty4.toString();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str15 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test121");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        int int12 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test122");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        userTypes.Faculty faculty18 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str20 = faculty18.update("");
        faculty18.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str23 = faculty18.toString();
        faculty18.setNumOfOverdue(1);
        int int26 = faculty18.getId();
        userTypes.Faculty faculty31 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str33 = faculty31.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty38 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = faculty38.getRentals();
        faculty31.calculateFines(rentList39);
        faculty18.calculateFines(rentList39);
        faculty4.calculateFines(rentList39);
        java.lang.Class<?> wildcardClass43 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test123");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test124");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        double double14 = faculty4.getFine();
        faculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test125");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) '#', "", "", "");
        java.lang.String str5 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=,id=35]" + "'", str5.equals("User [email=, password=,id=35]"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test126");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        java.lang.String str16 = faculty4.toString();
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
        java.lang.String str18 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test127");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getUserType();
        java.lang.String str10 = faculty4.update("User [email=, password=,id=0]");
        int int11 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test128");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str10 = faculty4.update("");
        faculty4.setEmail("hi!");
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
            System.out.format("%n%s%n", "FacultyTest.test129");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        faculty4.setNumOfOverdue(10);
        faculty4.setEmail("hi!");
        faculty4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test130");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        double double5 = faculty4.getFine();
        faculty4.setNumOfOverdue(100);
        faculty4.setUserType("");
        int int10 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test131");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = faculty4.getPassword();
        java.lang.String str6 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str6.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test132");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        java.lang.String str14 = faculty4.update("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList15 = faculty4.getRentals();
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
            System.out.format("%n%s%n", "FacultyTest.test133");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        java.lang.String str8 = faculty4.getPassword();
        userTypes.Faculty faculty13 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList14 = faculty13.getRentals();
        faculty4.calculateFines(rentList14);
        java.lang.Class<?> wildcardClass16 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test134");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=, password=,id=35]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test135");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        java.lang.String str13 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test136");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = faculty4.getId();
        int int11 = faculty4.getNumOfOverdue();
        int int12 = faculty4.getId();
        java.lang.String str13 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test137");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test138");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        java.lang.String str14 = faculty4.getUserType();
        java.lang.String str16 = faculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test139");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = faculty4.getNumOfOverdue();
        faculty4.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test140");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        faculty4.setId((int) (byte) 10);
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
            System.out.format("%n%s%n", "FacultyTest.test141");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int5 = faculty4.getNumOfOverdue();
        java.lang.String str6 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test142");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str11 = faculty4.toString();
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty16.setPassword("");
        faculty16.setId(0);
        faculty16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        faculty16.calculateFines(rentList24);
        faculty4.calculateFines(rentList24);
        java.util.ArrayList<actions.Rent> rentList28 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.calculateFines(rentList28);
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
            System.out.format("%n%s%n", "FacultyTest.test143");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        double double15 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test144");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test145");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test146");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test147");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (byte) 10);
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("");
        faculty4.setId(0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test148");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        faculty4.setId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test149");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=0]", "User [email=hi!, password=,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test150");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        int int6 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test151");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setId(0);
        faculty4.setNumOfOverdue((int) (byte) 10);
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("");
        java.lang.String str15 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str15.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test152");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
        faculty4.setPassword("User [email=, password=,id=0]");
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test153");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty11 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = faculty11.getRentals();
        faculty4.calculateFines(rentList12);
        java.lang.String str14 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test154");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test155");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        faculty4.setPassword("hi!");
        java.util.ArrayList<actions.Rent> rentList13 = faculty4.getRentals();
        int int14 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test156");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        faculty4.setEmail("hi!");
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setId(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test157");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test158");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.getEmail();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        faculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.String str15 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test159");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=, password=,id=35]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test160");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test161");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test162");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        faculty4.setEmail("hi!");
        java.lang.String str10 = faculty4.getEmail();
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = faculty15.update("");
        java.lang.String str18 = faculty15.getUserType();
        java.lang.String str19 = faculty15.toString();
        java.lang.String str20 = faculty15.toString();
        java.lang.String str22 = faculty15.update("");
        userTypes.Faculty faculty27 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList28 = faculty27.getRentals();
        faculty15.calculateFines(rentList28);
        faculty4.calculateFines(rentList28);
        faculty4.setNumOfOverdue(97);
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
            System.out.format("%n%s%n", "FacultyTest.test163");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        double double7 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test164");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.String str7 = faculty4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test165");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=35]", "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test166");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setId((int) (byte) 1);
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList16 = faculty15.getRentals();
        faculty15.setUserType("hi!");
        faculty15.setEmail("hi!");
        java.lang.String str21 = faculty15.getEmail();
        userTypes.Faculty faculty26 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str28 = faculty26.update("");
        java.lang.String str29 = faculty26.getUserType();
        java.lang.String str30 = faculty26.toString();
        java.lang.String str31 = faculty26.toString();
        java.lang.String str33 = faculty26.update("");
        userTypes.Faculty faculty38 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList39 = faculty38.getRentals();
        faculty26.calculateFines(rentList39);
        faculty15.calculateFines(rentList39);
        faculty4.calculateFines(rentList39);
        faculty4.setEmail("User [email=, password=,id=35]");
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
            System.out.format("%n%s%n", "FacultyTest.test167");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 1, "User [email=, password=,id=0]", "User [email=hi!, password=,id=0]", "hi!");
        int int5 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test168");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        faculty4.calculateFines(rentList10);
        int int13 = faculty4.getId();
        faculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        double double16 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test169");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 1, "User [email=hi!, password=,id=-1]", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.setPassword("");
        java.lang.String str8 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str5.equals("User [email=hi!, password=,id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, password=,id=-1], password=,id=1]" + "'", str8.equals("User [email=User [email=hi!, password=,id=-1], password=,id=1]"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test170");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        double double8 = faculty4.getFine();
        java.lang.String str9 = faculty4.getEmail();
        faculty4.setPassword("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "FacultyTest.test171");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("hi!");
        java.lang.String str11 = faculty4.getUserType();
        java.lang.String str12 = faculty4.getUserType();
        java.lang.String str13 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test172");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        faculty4.setEmail("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        double double15 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test173");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        double double13 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test174");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int17 = faculty4.getId();
        int int18 = faculty4.getNumOfOverdue();
        actions.Rent rent19 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems20 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.returnRental(rent19, maintainPhysicalItems20);
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
            System.out.format("%n%s%n", "FacultyTest.test175");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        double double8 = faculty4.getFine();
        faculty4.setId((int) (short) 0);
        faculty4.setPassword("User [email=, password=,id=35]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test176");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        userTypes.Faculty faculty18 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str20 = faculty18.update("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty25 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList26 = faculty25.getRentals();
        faculty18.calculateFines(rentList26);
        faculty4.calculateFines(rentList26);
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
            System.out.format("%n%s%n", "FacultyTest.test177");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        int int10 = faculty4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test178");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str10 = faculty4.update("");
        int int11 = faculty4.getNumOfOverdue();
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty16.setPassword("");
        faculty16.setId(0);
        actions.Rent[] rentArray21 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList22 = new java.util.ArrayList<actions.Rent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList22, rentArray21);
        faculty16.calculateFines(rentList22);
        faculty4.calculateFines(rentList22);
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
            System.out.format("%n%s%n", "FacultyTest.test179");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test180");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        java.util.ArrayList<actions.Rent> rentList16 = faculty4.getRentals();
        java.util.ArrayList<actions.Rent> rentList17 = faculty4.getRentals();
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
            System.out.format("%n%s%n", "FacultyTest.test181");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 100, "User [email=hi!, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test182");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        faculty4.setId((int) (byte) -1);
        faculty4.setId((int) (byte) -1);
        double double9 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test183");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        faculty4.setId(0);
        double double9 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test184");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str10 = faculty4.update("");
        faculty4.setEmail("hi!");
        double double13 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test185");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = faculty4.getUserType();
        java.lang.String str7 = faculty4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test186");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 10);
        java.lang.String str17 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test187");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        faculty4.setPassword("User [email=, password=,id=35]");
        java.lang.String str17 = faculty4.update("User [email=, password=,id=0]");
        faculty4.setNumOfOverdue((int) '4');
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
            System.out.format("%n%s%n", "FacultyTest.test188");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList17 = faculty16.getRentals();
        faculty4.calculateFines(rentList17);
        int int19 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test189");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
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
            System.out.format("%n%s%n", "FacultyTest.test190");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        faculty4.setNumOfOverdue(1);
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty16.setPassword("");
        faculty16.setId(0);
        faculty16.setEmail("");
        actions.Rent[] rentArray23 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList24 = new java.util.ArrayList<actions.Rent>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList24, rentArray23);
        faculty16.calculateFines(rentList24);
        faculty4.calculateFines(rentList24);
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
            System.out.format("%n%s%n", "FacultyTest.test191");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        int int13 = faculty4.getNumOfOverdue();
        java.lang.String str14 = faculty4.getUserType();
        java.lang.String str15 = faculty4.getUserType();
        java.lang.String str16 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test192");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("hi!");
        java.lang.String str11 = faculty4.getUserType();
        faculty4.setId((int) (short) 1);
        faculty4.setId(0);
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
            System.out.format("%n%s%n", "FacultyTest.test193");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("", "User [email=, password=,id=0]", "User [email=, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test194");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test195");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("hi!");
        java.lang.String str11 = faculty4.getUserType();
        faculty4.setId((int) (short) 1);
        java.util.ArrayList<actions.Rent> rentList14 = faculty4.getRentals();
        double double15 = faculty4.getFine();
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
            System.out.format("%n%s%n", "FacultyTest.test196");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) 0, "User [email=, password=,id=35]", "", "User [email=hi!, password=,id=0]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test197");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("hi!");
        java.lang.String str11 = faculty4.getUserType();
        int int12 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test198");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        java.lang.String str16 = faculty4.toString();
        faculty4.setNumOfOverdue((int) (short) 100);
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
            System.out.format("%n%s%n", "FacultyTest.test199");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        faculty4.setUserType("hi!");
        faculty4.setEmail("hi!");
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test200");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setPassword("");
        java.lang.String str15 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test201");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) 10, "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test202");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "User [email=, password=,id=35]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test203");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        double double15 = faculty4.getFine();
        java.util.ArrayList<actions.Rent> rentList16 = faculty4.getRentals();
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
            System.out.format("%n%s%n", "FacultyTest.test204");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setId((int) (byte) 1);
        double double11 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test205");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        faculty4.setId((int) (byte) 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test206");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        java.lang.String str6 = faculty4.update("");
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str11 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test207");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        int int13 = faculty4.getId();
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        userTypes.Faculty faculty20 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty20.setPassword("");
        faculty20.setId(0);
        java.util.ArrayList<actions.Rent> rentList25 = faculty20.getRentals();
        faculty4.calculateFines(rentList25);
        faculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test208");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str5.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test209");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=,id=0]", "User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test210");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setId((int) (short) 100);
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test211");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = faculty4.getId();
        faculty4.setUserType("hi!");
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
            System.out.format("%n%s%n", "FacultyTest.test212");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        userTypes.Faculty faculty10 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty10.setPassword("");
        faculty10.setId(0);
        java.lang.String str16 = faculty10.update("");
        java.util.ArrayList<actions.Rent> rentList17 = faculty10.getRentals();
        faculty4.calculateFines(rentList17);
        java.lang.String str19 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test213");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.util.ArrayList<actions.Rent> rentList9 = faculty4.getRentals();
        faculty4.setId((int) (short) 0);
        java.lang.String str13 = faculty4.update("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=,id=0]" + "'", str13.equals("User [email=hi!, password=,id=0]"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test214");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str9.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test215");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("");
        java.lang.String str15 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test216");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setNumOfOverdue((int) (short) 1);
        java.lang.String str10 = faculty4.toString();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setNumOfOverdue(1);
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
            System.out.format("%n%s%n", "FacultyTest.test217");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test218");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        int int10 = faculty4.getId();
        userTypes.Faculty faculty15 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str17 = faculty15.update("");
        java.lang.String str18 = faculty15.getUserType();
        faculty15.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = faculty15.toString();
        java.lang.String str22 = faculty15.toString();
        userTypes.Faculty faculty27 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty27.setPassword("");
        faculty27.setId(0);
        faculty27.setEmail("");
        actions.Rent[] rentArray34 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList35 = new java.util.ArrayList<actions.Rent>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList35, rentArray34);
        faculty27.calculateFines(rentList35);
        faculty15.calculateFines(rentList35);
        faculty4.calculateFines(rentList35);
        java.lang.String str40 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test219");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "hi!", "", "User [email=hi!, password=,id=-1]");
        double double5 = faculty4.getFine();
        userTypes.Faculty faculty10 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty10.setPassword("");
        faculty10.setId(0);
        actions.Rent[] rentArray15 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList16 = new java.util.ArrayList<actions.Rent>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList16, rentArray15);
        faculty10.calculateFines(rentList16);
        faculty4.calculateFines(rentList16);
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
            System.out.format("%n%s%n", "FacultyTest.test220");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getUserType();
        java.lang.String str10 = faculty4.update("User [email=, password=,id=0]");
        java.lang.String str11 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test221");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setEmail("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str10.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test222");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test223");
        userTypes.Faculty faculty4 = new userTypes.Faculty(100, "", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=, password=,id=35]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test224");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
        int int14 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test225");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.getUserType();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test226");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        java.lang.String str14 = faculty4.update("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "FacultyTest.test227");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "", "");
        faculty4.setId((int) (byte) -1);
        int int7 = faculty4.getNumOfOverdue();
        java.lang.String str8 = faculty4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=,id=-1]" + "'", str8.equals("User [email=hi!, password=,id=-1]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test228");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        int int7 = faculty4.getId();
        java.lang.String str9 = faculty4.update("User [email=hi!, password=,id=0]");
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
            System.out.format("%n%s%n", "FacultyTest.test229");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.toString();
        int int12 = faculty4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test230");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getUserType();
        int int10 = faculty4.getId();
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
            System.out.format("%n%s%n", "FacultyTest.test231");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=, password=,id=0]", "User [email=User [email=hi!, password=,id=-1], password=,id=1]", "User [email=hi!, password=,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test232");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setPassword("");
        faculty4.setPassword("hi!");
        java.lang.String str17 = faculty4.getUserType();
        java.util.ArrayList<actions.Rent> rentList18 = faculty4.getRentals();
        java.lang.String str20 = faculty4.update("User [email=, password=,id=0]");
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
            System.out.format("%n%s%n", "FacultyTest.test233");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setPassword("");
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
            System.out.format("%n%s%n", "FacultyTest.test234");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        actions.Rent[] rentArray9 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList10 = new java.util.ArrayList<actions.Rent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList10, rentArray9);
        faculty4.calculateFines(rentList10);
        faculty4.setNumOfOverdue((int) (short) 10);
        faculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test235");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        faculty4.setUserType("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        faculty4.setId((int) (short) 1);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        faculty4.setId((int) (byte) 0);
        java.util.ArrayList<actions.Rent> rentList21 = faculty4.getRentals();
        java.lang.String str22 = faculty4.getPassword();
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
            System.out.format("%n%s%n", "FacultyTest.test236");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (byte) -1, "", "User [email=hi!, password=,id=-1]", "hi!");
        double double5 = faculty4.getFine();
        double double6 = faculty4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test237");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = faculty4.getRentals();
        int int13 = faculty4.getId();
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        faculty4.setId(97);
        java.lang.String str18 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test238");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        faculty4.setPassword("hi!");
        faculty4.setUserType("");
        faculty4.setId((int) '4');
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
            System.out.format("%n%s%n", "FacultyTest.test239");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        int int9 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test240");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        double double14 = faculty4.getFine();
        java.lang.String str15 = faculty4.getPassword();
        faculty4.setId((int) (short) -1);
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
            System.out.format("%n%s%n", "FacultyTest.test241");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        java.lang.String str16 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test242");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = faculty4.getRentals();
        java.lang.String str6 = faculty4.getEmail();
        int int7 = faculty4.getId();
        java.lang.String str8 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test243");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        double double7 = faculty4.getFine();
        java.lang.String str8 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test244");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        java.lang.String str11 = faculty4.toString();
        faculty4.setNumOfOverdue(0);
        faculty4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, password=,id=0]" + "'", str11.equals("User [email=, password=,id=0]"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test245");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        faculty4.setNumOfOverdue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test246");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.getEmail();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test247");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        int int10 = faculty4.getId();
        faculty4.setEmail("");
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
            System.out.format("%n%s%n", "FacultyTest.test248");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test249");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        java.lang.String str10 = faculty4.getEmail();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test250");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("hi!");
        faculty4.setEmail("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test251");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        int int5 = faculty4.getId();
        int int6 = faculty4.getNumOfOverdue();
        faculty4.setUserType("User [email=hi!, password=,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test252");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str12 = faculty4.update("User [email=hi!, password=,id=-1]");
        faculty4.setUserType("");
        int int15 = faculty4.getId();
        java.lang.String str16 = faculty4.toString();
        java.lang.String str18 = faculty4.update("hi!");
        faculty4.setUserType("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
        int int21 = faculty4.getNumOfOverdue();
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
            System.out.format("%n%s%n", "FacultyTest.test253");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.getEmail();
        java.util.ArrayList<actions.Rent> rentList11 = faculty4.getRentals();
        userTypes.Faculty faculty16 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str18 = faculty16.update("");
        faculty16.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str21 = faculty16.toString();
        int int22 = faculty16.getId();
        userTypes.Faculty faculty27 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str29 = faculty27.update("");
        java.lang.String str30 = faculty27.getUserType();
        faculty27.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str33 = faculty27.toString();
        java.lang.String str34 = faculty27.toString();
        userTypes.Faculty faculty39 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty39.setPassword("");
        faculty39.setId(0);
        faculty39.setEmail("");
        actions.Rent[] rentArray46 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList47 = new java.util.ArrayList<actions.Rent>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList47, rentArray46);
        faculty39.calculateFines(rentList47);
        faculty27.calculateFines(rentList47);
        faculty16.calculateFines(rentList47);
        faculty4.calculateFines(rentList47);
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
            System.out.format("%n%s%n", "FacultyTest.test254");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("hi!");
        java.lang.String str13 = faculty4.getUserType();
        faculty4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
        java.lang.String str16 = faculty4.getEmail();
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
            System.out.format("%n%s%n", "FacultyTest.test255");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) 'a', "hi!", "User [email=hi!, password=,id=-1]", "hi!");
        java.lang.String str5 = faculty4.getUserType();
        faculty4.setNumOfOverdue((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test256");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("hi!", "User [email=, password=,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test257");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        userTypes.Faculty faculty9 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str11 = faculty9.update("");
        java.lang.String str12 = faculty9.getUserType();
        faculty9.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = faculty9.toString();
        java.lang.String str16 = faculty9.toString();
        userTypes.Faculty faculty21 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty21.setPassword("");
        faculty21.setId(0);
        faculty21.setEmail("");
        actions.Rent[] rentArray28 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList29 = new java.util.ArrayList<actions.Rent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList29, rentArray28);
        faculty21.calculateFines(rentList29);
        faculty9.calculateFines(rentList29);
        faculty4.calculateFines(rentList29);
        faculty4.setNumOfOverdue((int) '4');
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
            System.out.format("%n%s%n", "FacultyTest.test258");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]", "User [email=User [email=hi!, password=,id=-1], password=,id=-1]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test259");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getPassword();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str15 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test260");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        faculty4.setId((int) (byte) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test261");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        java.lang.String str13 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test262");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str10 = faculty4.toString();
        java.lang.String str11 = faculty4.toString();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test263");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = faculty4.getEmail();
        faculty4.setUserType("User [email=, password=hi!,id=0]");
        java.lang.String str20 = faculty4.toString();
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
            System.out.format("%n%s%n", "FacultyTest.test264");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int13 = faculty4.getNumOfOverdue();
        int int14 = faculty4.getNumOfOverdue();
        java.lang.String str15 = faculty4.getUserType();
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
            System.out.format("%n%s%n", "FacultyTest.test265");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        java.lang.String str8 = faculty4.toString();
        java.lang.String str9 = faculty4.toString();
        java.lang.String str11 = faculty4.update("");
        faculty4.setNumOfOverdue((int) (byte) 100);
        faculty4.setEmail("User [email=hi!, password=,id=-1]");
        faculty4.setEmail("");
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
            System.out.format("%n%s%n", "FacultyTest.test266");
        userTypes.Faculty faculty4 = new userTypes.Faculty(0, "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        actions.Rent[] rentArray6 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList7 = new java.util.ArrayList<actions.Rent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList7, rentArray6);
        faculty4.calculateFines(rentList7);
        faculty4.setNumOfOverdue((int) (byte) 100);
        double double12 = faculty4.getFine();
        faculty4.setId((int) '#');
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
            System.out.format("%n%s%n", "FacultyTest.test267");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        faculty4.setPassword("User [email=hi!, password=,id=-1]");
        java.lang.String str9 = faculty4.toString();
        int int10 = faculty4.getNumOfOverdue();
        java.lang.String str11 = faculty4.getPassword();
        faculty4.setId((-1));
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
            System.out.format("%n%s%n", "FacultyTest.test268");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setId((int) (short) 100);
        java.lang.String str10 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
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
            System.out.format("%n%s%n", "FacultyTest.test269");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setEmail("");
        actions.Rent[] rentArray11 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList12 = new java.util.ArrayList<actions.Rent>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList12, rentArray11);
        faculty4.calculateFines(rentList12);
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        java.lang.String str17 = faculty4.getUserType();
        faculty4.setUserType("User [email=User [email=hi!, password=,id=-1], password=,id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test270");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        java.lang.String str10 = faculty4.update("");
        faculty4.setPassword("");
        int int13 = faculty4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test271");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        java.lang.String str6 = faculty4.update("");
        java.lang.String str7 = faculty4.getUserType();
        faculty4.setUserType("User [email=hi!, password=,id=-1]");
        int int10 = faculty4.getId();
        int int11 = faculty4.getNumOfOverdue();
        int int12 = faculty4.getId();
        faculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
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
            System.out.format("%n%s%n", "FacultyTest.test272");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Faculty faculty4 = new userTypes.Faculty("User [email=User [email=hi!, password=,id=-1], password=,id=1]", "hi!", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test273");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setPassword("");
        faculty4.setId(0);
        faculty4.setPassword("User [email=hi!, password=User [email=hi!, password=,id=-1],id=-1]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyTest.test274");
        userTypes.Faculty faculty4 = new userTypes.Faculty((int) (short) -1, "hi!", "", "hi!");
        faculty4.setId(100);
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getUserType();
        java.util.ArrayList<actions.Rent> rentList10 = faculty4.getRentals();
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

