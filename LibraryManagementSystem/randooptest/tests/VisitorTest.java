package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VisitorTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test002");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("hi!", "", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test003");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test004");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.util.ArrayList<actions.Rent> rentList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.calculateFines(rentList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"totalRentals\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test005");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        actions.Rent[] rentArray5 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList6 = new java.util.ArrayList<actions.Rent>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList6, rentArray5);
        visitor4.calculateFines(rentList6);
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test006");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test007");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        actions.Rent rent8 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent8, maintainPhysicalItems9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test008");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test009");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        double double10 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test010");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("hi!", "User [email=hi!, password=hi!,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test011");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str6 = visitor4.update("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test012");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test013");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=0]", "", "User [email=hi!, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test014");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        actions.Rent[] rentArray5 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList6 = new java.util.ArrayList<actions.Rent>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList6, rentArray5);
        visitor4.calculateFines(rentList6);
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test015");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        userTypes.Visitor visitor11 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor11.getRentals();
        visitor4.calculateFines(rentList12);
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test016");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("", "", "User [email=hi!, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test017");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) 'a', "hi!", "", "hi!");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test018");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        double double5 = visitor4.getFine();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test019");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setUserType("");
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test020");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        visitor4.setNumOfOverdue((int) 'a');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test021");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        userTypes.Visitor visitor11 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor11.getRentals();
        visitor4.calculateFines(rentList12);
        int int14 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test022");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        java.lang.String str9 = visitor4.update("");
        java.lang.String str10 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test023");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test024");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (byte) 0);
        visitor4.setUserType("hi!");
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test025");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        actions.Rent rent6 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems7 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent6, maintainPhysicalItems7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test026");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("hi!", "", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test027");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        userTypes.Visitor visitor11 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor11.getRentals();
        visitor4.calculateFines(rentList12);
        visitor4.setNumOfOverdue((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test028");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 10, "", "", "");
        java.lang.String str5 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test029");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getUserType();
        java.lang.Class<?> wildcardClass12 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test030");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        userTypes.Visitor visitor11 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        actions.Rent[] rentArray12 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList13 = new java.util.ArrayList<actions.Rent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList13, rentArray12);
        visitor11.calculateFines(rentList13);
        visitor4.calculateFines(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test031");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test032");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        int int11 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test033");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.toString();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test034");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test035");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getId();
        java.util.ArrayList<actions.Rent> rentList8 = visitor4.getRentals();
        java.lang.String str10 = visitor4.update("hi!");
        int int11 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test036");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        visitor4.setUserType("hi!");
        int int8 = visitor4.getId();
        double double9 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test037");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        visitor4.setId((int) '4');
        visitor4.setPassword("hi!");
        java.lang.String str12 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=52]" + "'", str12.equals("User [email=hi!, password=hi!,id=52]"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test038");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test039");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=52]", "User [email=hi!, password=hi!,id=52]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test040");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getPassword();
        java.lang.String str12 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test041");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=52]", "User [email=hi!, password=hi!,id=52]", "User [email=, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test042");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        int int8 = visitor4.getNumOfOverdue();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test043");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setPassword("");
        java.lang.String str10 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test044");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("", "User [email=, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test045");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str14 = visitor13.getUserType();
        java.lang.String str15 = visitor13.getUserType();
        java.lang.String str16 = visitor13.getUserType();
        java.lang.String str18 = visitor13.update("hi!");
        visitor13.setNumOfOverdue((int) (short) 0);
        java.lang.String str21 = visitor13.toString();
        java.lang.String str22 = visitor13.getPassword();
        java.lang.String str24 = visitor13.update("hi!");
        java.util.ArrayList<actions.Rent> rentList25 = visitor13.getRentals();
        visitor4.calculateFines(rentList25);
        java.lang.String str27 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str21.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test046");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (byte) 0);
        java.lang.String str10 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test047");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) '4', "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=52]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test048");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 1, "", "hi!", "");
        visitor4.setId((int) (byte) 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test049");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        java.lang.String str6 = visitor4.getUserType();
        int int7 = visitor4.getNumOfOverdue();
        visitor4.setNumOfOverdue(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test050");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setUserType("");
        double double8 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test051");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=0]", "", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test052");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=hi!,id=52]" + "'", str11.equals("User [email=hi!, password=hi!,id=52]"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test053");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        int int12 = visitor4.getId();
        int int13 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test054");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        int int10 = visitor4.getId();
        int int11 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test055");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.setEmail("");
        visitor4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test056");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test057");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (byte) 0);
        visitor4.setUserType("hi!");
        visitor4.setId((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test058");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getPassword();
        userTypes.Visitor visitor22 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList23 = visitor22.getRentals();
        visitor15.calculateFines(rentList23);
        visitor4.calculateFines(rentList23);
        int int26 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test059");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        java.lang.String str12 = visitor4.toString();
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test060");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) 'a', "User [email=hi!, password=hi!,id=0]", "hi!", "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test061");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str8 = visitor4.update("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test062");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        int int11 = visitor4.getNumOfOverdue();
        visitor4.setUserType("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test063");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        java.lang.String str11 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass12 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test064");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        int int7 = visitor4.getNumOfOverdue();
        visitor4.setId(0);
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test065");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 1);
        java.lang.String str8 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test066");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test067");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test068");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        java.lang.String str11 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test069");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor9 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str10 = visitor9.getUserType();
        java.lang.String str12 = visitor9.update("hi!");
        visitor9.setEmail("hi!");
        java.lang.String str15 = visitor9.getEmail();
        java.lang.String str16 = visitor9.getEmail();
        userTypes.Visitor visitor21 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor21.setNumOfOverdue(100);
        int int24 = visitor21.getId();
        java.util.ArrayList<actions.Rent> rentList25 = visitor21.getRentals();
        visitor9.calculateFines(rentList25);
        visitor4.calculateFines(rentList25);
        visitor4.setEmail("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test070");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        visitor4.setUserType("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test071");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        double double7 = visitor4.getFine();
        visitor4.setNumOfOverdue((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test072");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setId((int) (byte) 0);
        double double10 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test073");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        double double13 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test074");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        java.lang.String str12 = visitor4.toString();
        int int13 = visitor4.getNumOfOverdue();
        java.lang.String str15 = visitor4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test075");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        visitor4.setPassword("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test076");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        java.lang.String str11 = visitor4.getUserType();
        int int12 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test077");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setId((int) (short) 1);
        int int9 = visitor4.getId();
        visitor4.setNumOfOverdue((int) '4');
        java.lang.String str12 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test078");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        java.lang.String str12 = visitor4.toString();
        java.lang.String str13 = visitor4.getPassword();
        java.lang.String str15 = visitor4.update("hi!");
        java.util.ArrayList<actions.Rent> rentList16 = visitor4.getRentals();
        int int17 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test079");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        visitor4.setEmail("hi!");
        java.lang.String str14 = visitor4.update("");
        java.lang.String str15 = visitor4.toString();
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str15.equals("User [email=hi!, password=hi!,id=100]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test080");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        visitor4.setUserType("hi!");
        java.lang.String str13 = visitor4.update("hi!");
        visitor4.setPassword("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test081");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor16 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor16.setNumOfOverdue(100);
        int int19 = visitor16.getId();
        java.util.ArrayList<actions.Rent> rentList20 = visitor16.getRentals();
        visitor4.calculateFines(rentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test082");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        double double13 = visitor4.getFine();
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test083");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        visitor4.setId((-1));
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test084");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test085");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.setEmail("");
        int int14 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test086");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=100]", "hi!", "User [email=hi!, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test087");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (byte) 1);
        java.lang.String str10 = visitor4.toString();
        double double11 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str10.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test088");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test089");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        double double5 = visitor4.getFine();
        java.lang.String str6 = visitor4.getPassword();
        actions.Rent rent7 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent7, maintainPhysicalItems8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test090");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor15.setNumOfOverdue(100);
        int int18 = visitor15.getId();
        java.util.ArrayList<actions.Rent> rentList19 = visitor15.getRentals();
        visitor4.calculateFines(rentList19);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test091");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        java.lang.String str11 = visitor4.getUserType();
        double double12 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test092");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str14 = visitor13.getUserType();
        java.lang.String str15 = visitor13.getUserType();
        java.lang.String str16 = visitor13.getUserType();
        java.lang.String str18 = visitor13.update("hi!");
        visitor13.setNumOfOverdue((int) (short) 0);
        java.lang.String str21 = visitor13.toString();
        java.lang.String str22 = visitor13.getPassword();
        java.lang.String str24 = visitor13.update("hi!");
        java.util.ArrayList<actions.Rent> rentList25 = visitor13.getRentals();
        visitor4.calculateFines(rentList25);
        userTypes.Visitor visitor31 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.util.ArrayList<actions.Rent> rentList32 = visitor31.getRentals();
        visitor4.calculateFines(rentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str21.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList32);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test093");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        java.lang.String str12 = visitor4.toString();
        java.lang.String str13 = visitor4.getPassword();
        java.lang.String str15 = visitor4.update("hi!");
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test094");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 1, "", "hi!", "");
        java.lang.String str5 = visitor4.getPassword();
        java.lang.String str6 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test095");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        double double12 = visitor4.getFine();
        visitor4.setUserType("User [email=hi!, password=hi!,id=52]");
        visitor4.setEmail("");
        actions.Rent rent17 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems18 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent17, maintainPhysicalItems18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test096");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getId();
        visitor4.setNumOfOverdue((int) (short) 1);
        int int10 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test097");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=0]", "User [email=, password=hi!,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test098");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        visitor4.setUserType("hi!");
        int int13 = visitor4.getId();
        visitor4.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test099");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        int int7 = visitor4.getNumOfOverdue();
        visitor4.setId(0);
        java.lang.String str10 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test100");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getId();
        java.util.ArrayList<actions.Rent> rentList8 = visitor4.getRentals();
        java.lang.String str10 = visitor4.update("hi!");
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test101");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=hi!, password=hi!,id=52]", "User [email=, password=hi!,id=0]", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test102");
        userTypes.Visitor visitor4 = new userTypes.Visitor(97, "", "", "User [email=hi!, password=hi!,id=52]");
        java.lang.String str5 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=hi!,id=52]" + "'", str5.equals("User [email=hi!, password=hi!,id=52]"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test103");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        visitor4.setUserType("hi!");
        int int8 = visitor4.getId();
        visitor4.setNumOfOverdue(97);
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test104");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 1, "User [email=hi!, password=hi!,id=0]", "", "User [email=hi!, password=hi!,id=0]");
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test105");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setNumOfOverdue((int) (byte) 100);
        userTypes.Visitor visitor14 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str15 = visitor14.getUserType();
        java.lang.String str16 = visitor14.getUserType();
        java.lang.String str17 = visitor14.getUserType();
        java.lang.String str19 = visitor14.update("hi!");
        visitor14.setNumOfOverdue((int) (short) 0);
        java.lang.String str22 = visitor14.toString();
        java.lang.String str23 = visitor14.getPassword();
        userTypes.Visitor visitor28 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList29 = visitor28.getRentals();
        visitor14.calculateFines(rentList29);
        visitor4.calculateFines(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str22.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test106");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        double double12 = visitor4.getFine();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test107");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 1, "User [email=hi!, password=hi!,id=0]", "", "User [email=hi!, password=hi!,id=0]");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test108");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (byte) 0);
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test109");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        visitor4.setUserType("hi!");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test110");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        double double12 = visitor4.getFine();
        visitor4.setUserType("User [email=hi!, password=hi!,id=52]");
        visitor4.setEmail("");
        java.lang.String str17 = visitor4.toString();
        visitor4.setNumOfOverdue((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, password=hi!,id=100]" + "'", str17.equals("User [email=, password=hi!,id=100]"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test111");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=, password=hi!,id=100]", "User [email=hi!, password=hi!,id=0]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test112");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) 'a', "hi!", "", "hi!");
        int int5 = visitor4.getId();
        int int6 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test113");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        double double7 = visitor4.getFine();
        userTypes.Visitor visitor12 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str13 = visitor12.getUserType();
        java.lang.String str14 = visitor12.getUserType();
        java.lang.String str15 = visitor12.getEmail();
        visitor12.setUserType("");
        userTypes.Visitor visitor22 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str23 = visitor22.getUserType();
        visitor22.setId((int) (byte) 100);
        java.lang.String str27 = visitor22.update("User [email=hi!, password=hi!,id=0]");
        int int28 = visitor22.getNumOfOverdue();
        userTypes.Visitor visitor33 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor33.setNumOfOverdue(100);
        int int36 = visitor33.getId();
        java.util.ArrayList<actions.Rent> rentList37 = visitor33.getRentals();
        visitor22.calculateFines(rentList37);
        visitor12.calculateFines(rentList37);
        visitor4.calculateFines(rentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str27.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList37);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test114");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        visitor4.setId((int) '4');
        visitor4.setPassword("hi!");
        visitor4.setEmail("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test115");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.lang.String str5 = visitor4.getEmail();
        visitor4.setNumOfOverdue((int) 'a');
        java.lang.String str8 = visitor4.toString();
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str5.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]" + "'", str8.equals("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test116");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        int int7 = visitor4.getNumOfOverdue();
        java.lang.String str8 = visitor4.getUserType();
        java.lang.String str10 = visitor4.update("User [email=, password=hi!,id=100]");
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, password=hi!,id=100]" + "'", str10.equals("User [email=, password=hi!,id=100]"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test117");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setEmail("User [email=, password=hi!,id=0]");
        visitor4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test118");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("");
        visitor4.setId((int) (byte) -1);
        visitor4.setPassword("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test119");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        visitor4.setId((-1));
        visitor4.setNumOfOverdue((int) '4');
        visitor4.setPassword("User [email=hi!, password=hi!,id=100]");
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test120");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        java.lang.Class<?> wildcardClass12 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test121");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor15.setNumOfOverdue(100);
        int int18 = visitor15.getId();
        java.util.ArrayList<actions.Rent> rentList19 = visitor15.getRentals();
        visitor4.calculateFines(rentList19);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        visitor4.setId((int) (byte) 1);
        visitor4.setNumOfOverdue((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test122");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test123");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        visitor4.setUserType("hi!");
        java.lang.String str13 = visitor4.update("hi!");
        java.lang.String str14 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str14.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test124");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getPassword();
        java.lang.String str12 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=10]" + "'", str12.equals("User [email=hi!, password=hi!,id=10]"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test125");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("hi!", "", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test126");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getPassword();
        userTypes.Visitor visitor22 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList23 = visitor22.getRentals();
        visitor15.calculateFines(rentList23);
        visitor4.calculateFines(rentList23);
        userTypes.Visitor visitor30 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor30.setNumOfOverdue(100);
        java.lang.String str34 = visitor30.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str35 = visitor30.getPassword();
        visitor30.setId((int) (short) 100);
        double double38 = visitor30.getFine();
        userTypes.Visitor visitor43 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.util.ArrayList<actions.Rent> rentList44 = visitor43.getRentals();
        visitor30.calculateFines(rentList44);
        visitor4.calculateFines(rentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str34.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList44);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test127");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        visitor4.setUserType("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test128");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        java.lang.String str8 = visitor4.getPassword();
        int int9 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test129");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        userTypes.Visitor visitor10 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str11 = visitor10.getUserType();
        java.lang.String str13 = visitor10.update("hi!");
        visitor10.setEmail("hi!");
        java.lang.String str16 = visitor10.getEmail();
        java.lang.String str17 = visitor10.getEmail();
        java.util.ArrayList<actions.Rent> rentList18 = visitor10.getRentals();
        visitor4.calculateFines(rentList18);
        java.lang.String str21 = visitor4.update("User [email=hi!, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str21.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test130");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        visitor4.setUserType("");
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test131");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test132");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getId();
        java.lang.String str8 = visitor4.getPassword();
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test133");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.toString();
        visitor4.setEmail("hi!");
        java.lang.String str11 = visitor4.update("User [email=hi!, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str7.equals("User [email=, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str11.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test134");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setId((int) (short) 1);
        int int9 = visitor4.getId();
        visitor4.setPassword("User [email=, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test135");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        int int7 = visitor4.getNumOfOverdue();
        visitor4.setPassword("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test136");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        visitor4.setNumOfOverdue((int) '4');
        int int13 = visitor4.getId();
        double double14 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test137");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str14 = visitor13.getUserType();
        java.lang.String str15 = visitor13.getUserType();
        java.lang.String str16 = visitor13.getUserType();
        java.lang.String str18 = visitor13.update("hi!");
        visitor13.setNumOfOverdue((int) (short) 0);
        java.lang.String str21 = visitor13.toString();
        java.lang.String str22 = visitor13.getPassword();
        java.lang.String str24 = visitor13.update("hi!");
        java.util.ArrayList<actions.Rent> rentList25 = visitor13.getRentals();
        visitor4.calculateFines(rentList25);
        int int27 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str21.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test138");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int9 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test139");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getUserType();
        int int12 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test140");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        visitor4.setEmail("hi!");
        java.lang.String str14 = visitor4.update("");
        java.lang.String str15 = visitor4.toString();
        visitor4.setPassword("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str15.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test141");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setPassword("");
        visitor4.setUserType("hi!");
        java.lang.String str12 = visitor4.getEmail();
        java.util.ArrayList<actions.Rent> rentList13 = visitor4.getRentals();
        int int14 = visitor4.getId();
        visitor4.setEmail("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test142");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getUserType();
        java.lang.String str18 = visitor15.getUserType();
        java.lang.String str20 = visitor15.update("hi!");
        visitor15.setNumOfOverdue((int) (short) 0);
        java.lang.String str23 = visitor15.toString();
        java.lang.String str24 = visitor15.getPassword();
        java.lang.String str26 = visitor15.update("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = visitor15.getRentals();
        visitor4.calculateFines(rentList27);
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        int int31 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str23.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test143");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        visitor4.setId((int) (short) -1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test144");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.lang.String str5 = visitor4.getEmail();
        java.util.ArrayList<actions.Rent> rentList6 = visitor4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str5.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test145");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getUserType();
        java.lang.String str18 = visitor15.getUserType();
        java.lang.String str20 = visitor15.update("hi!");
        visitor15.setNumOfOverdue((int) (short) 0);
        java.lang.String str23 = visitor15.toString();
        java.lang.String str24 = visitor15.getPassword();
        java.lang.String str26 = visitor15.update("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = visitor15.getRentals();
        visitor4.calculateFines(rentList27);
        java.lang.String str29 = visitor4.getPassword();
        java.lang.String str30 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str23.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test146");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        actions.Rent rent12 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems13 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent12, maintainPhysicalItems13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test147");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        visitor4.setNumOfOverdue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test148");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        visitor4.setUserType("hi!");
        visitor4.setEmail("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test149");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        int int8 = visitor4.getId();
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        visitor4.setPassword("User [email=hi!, password=hi!,id=100]");
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test150");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.toString();
        actions.Rent rent7 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent7, maintainPhysicalItems8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test151");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.lang.String str5 = visitor4.getEmail();
        visitor4.setNumOfOverdue((int) 'a');
        userTypes.Visitor visitor12 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str13 = visitor12.getUserType();
        java.lang.String str14 = visitor12.getUserType();
        visitor12.setId((int) (short) 1);
        int int17 = visitor12.getId();
        java.util.ArrayList<actions.Rent> rentList18 = visitor12.getRentals();
        visitor4.calculateFines(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str5.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test152");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test153");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        visitor4.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test154");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        visitor4.setPassword("");
        visitor4.setUserType("User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test155");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getUserType();
        java.lang.String str12 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test156");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) '#', "", "User [email=hi!, password=hi!,id=52]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test157");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.toString();
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str7.equals("User [email=, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test158");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        double double5 = visitor4.getFine();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setId((int) (short) 10);
        visitor4.setEmail("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test159");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setEmail("User [email=, password=hi!,id=0]");
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test160");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getId();
        java.lang.String str9 = visitor4.update("");
        int int10 = visitor4.getId();
        int int11 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test161");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        int int8 = visitor4.getId();
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        visitor4.setEmail("User [email=, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test162");
        userTypes.Visitor visitor4 = new userTypes.Visitor(10, "hi!", "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]", "User [email=hi!, password=hi!,id=10]");
        actions.Rent rent5 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent5, maintainPhysicalItems6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test163");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        visitor4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test164");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "User [email=hi!, password=hi!,id=100]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]");
        int int5 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test165");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor9 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str10 = visitor9.getUserType();
        java.lang.String str12 = visitor9.update("hi!");
        visitor9.setEmail("hi!");
        java.lang.String str15 = visitor9.getEmail();
        java.lang.String str16 = visitor9.getEmail();
        userTypes.Visitor visitor21 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor21.setNumOfOverdue(100);
        int int24 = visitor21.getId();
        java.util.ArrayList<actions.Rent> rentList25 = visitor21.getRentals();
        visitor9.calculateFines(rentList25);
        visitor4.calculateFines(rentList25);
        userTypes.Visitor visitor32 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor32.setNumOfOverdue(100);
        java.lang.String str36 = visitor32.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str37 = visitor32.getPassword();
        int int38 = visitor32.getNumOfOverdue();
        userTypes.Visitor visitor43 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str44 = visitor43.getUserType();
        java.lang.String str45 = visitor43.getPassword();
        userTypes.Visitor visitor50 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList51 = visitor50.getRentals();
        visitor43.calculateFines(rentList51);
        visitor32.calculateFines(rentList51);
        visitor4.calculateFines(rentList51);
        int int55 = visitor4.getNumOfOverdue();
        visitor4.setPassword("User [email=, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str36.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test166");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        double double5 = visitor4.getFine();
        int int6 = visitor4.getNumOfOverdue();
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test167");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]", "hi!", "User [email=hi!, password=hi!,id=52]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test168");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        double double7 = visitor4.getFine();
        visitor4.setEmail("User [email=hi!, password=hi!,id=100]");
        int int10 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test169");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        java.lang.String str11 = visitor4.getEmail();
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        visitor4.setPassword("User [email=, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test170");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList6 = visitor4.getRentals();
        int int7 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test171");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getUserType();
        java.lang.String str9 = visitor4.update("hi!");
        visitor4.setNumOfOverdue((int) (short) 0);
        java.lang.String str12 = visitor4.toString();
        java.lang.String str13 = visitor4.getPassword();
        userTypes.Visitor visitor18 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList19 = visitor18.getRentals();
        visitor4.calculateFines(rentList19);
        visitor4.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test172");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor15.setNumOfOverdue(100);
        int int18 = visitor15.getId();
        java.util.ArrayList<actions.Rent> rentList19 = visitor15.getRentals();
        visitor4.calculateFines(rentList19);
        int int21 = visitor4.getNumOfOverdue();
        int int22 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test173");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        java.lang.String str8 = visitor4.getPassword();
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str14 = visitor13.getUserType();
        java.lang.String str15 = visitor13.getUserType();
        java.lang.String str16 = visitor13.getEmail();
        double double17 = visitor13.getFine();
        java.util.ArrayList<actions.Rent> rentList18 = visitor13.getRentals();
        visitor4.calculateFines(rentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test174");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        int int11 = visitor4.getNumOfOverdue();
        java.lang.String str12 = visitor4.toString();
        java.lang.String str14 = visitor4.update("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test175");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.toString();
        int int8 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]" + "'", str7.equals("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test176");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        double double7 = visitor4.getFine();
        double double8 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test177");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        java.util.ArrayList<actions.Rent> rentList10 = visitor4.getRentals();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.setEmail("");
        int int14 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test178");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        int int11 = visitor4.getNumOfOverdue();
        java.lang.String str12 = visitor4.toString();
        visitor4.setId((int) 'a');
        java.lang.String str15 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str12.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test179");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test180");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getEmail();
        java.lang.String str11 = visitor4.getEmail();
        userTypes.Visitor visitor16 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor16.setNumOfOverdue(100);
        int int19 = visitor16.getId();
        java.util.ArrayList<actions.Rent> rentList20 = visitor16.getRentals();
        visitor4.calculateFines(rentList20);
        visitor4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList20);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test181");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        java.lang.String str7 = visitor4.update("");
        java.lang.String str8 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test182");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        int int7 = visitor4.getNumOfOverdue();
        visitor4.setPassword("User [email=hi!, password=hi!,id=10]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test183");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=, password=hi!,id=100]", "User [email=hi!, password=hi!,id=0]", "User [email=, password=hi!,id=0]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test184");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        int int13 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test185");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=52]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=52]" + "'", str8.equals("User [email=hi!, password=hi!,id=52]"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test186");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        double double13 = visitor4.getFine();
        int int14 = visitor4.getNumOfOverdue();
        actions.Rent rent15 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems16 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent15, maintainPhysicalItems16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test187");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        java.lang.String str11 = visitor4.getUserType();
        visitor4.setEmail("User [email=, password=hi!,id=0]");
        double double14 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test188");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.lang.String str5 = visitor4.getEmail();
        visitor4.setNumOfOverdue((int) 'a');
        java.lang.String str8 = visitor4.toString();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str5.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]" + "'", str8.equals("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test189");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str10 = visitor4.toString();
        actions.Rent rent11 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent11, maintainPhysicalItems12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str10.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test190");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]", "User [email=hi!, password=hi!,id=52]", "User [email=hi!, password=hi!,id=52]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test191");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        userTypes.Visitor visitor14 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList15 = visitor14.getRentals();
        visitor4.calculateFines(rentList15);
        java.lang.String str17 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str17.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test192");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=, password=hi!,id=100]", "", "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test193");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        int int8 = visitor4.getNumOfOverdue();
        visitor4.setId((int) (short) 0);
        visitor4.setNumOfOverdue((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test194");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        double double12 = visitor4.getFine();
        visitor4.setUserType("User [email=hi!, password=hi!,id=52]");
        java.lang.String str16 = visitor4.update("User [email=hi!, password=hi!,id=100]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str16.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test195");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        java.lang.String str13 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str13.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test196");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor13.setNumOfOverdue(100);
        java.lang.String str17 = visitor13.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str18 = visitor13.getPassword();
        visitor13.setId((int) (short) 100);
        double double21 = visitor13.getFine();
        userTypes.Visitor visitor26 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=0]", "hi!", "User [email=hi!, password=hi!,id=0]");
        java.util.ArrayList<actions.Rent> rentList27 = visitor26.getRentals();
        visitor13.calculateFines(rentList27);
        visitor4.calculateFines(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str17.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test197");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "");
        userTypes.Visitor visitor9 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str10 = visitor9.getUserType();
        java.lang.String str11 = visitor9.getUserType();
        visitor9.setId((int) (short) 1);
        int int14 = visitor9.getId();
        java.util.ArrayList<actions.Rent> rentList15 = visitor9.getRentals();
        visitor4.calculateFines(rentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test198");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=52]", "User [email=, password=hi!,id=0]", "");
        visitor4.setNumOfOverdue(0);
        visitor4.setId((int) (short) 1);
        int int9 = visitor4.getId();
        userTypes.Visitor visitor14 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str15 = visitor14.getUserType();
        visitor14.setId((int) (byte) 100);
        java.lang.String str19 = visitor14.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str21 = visitor14.update("hi!");
        java.util.ArrayList<actions.Rent> rentList22 = visitor14.getRentals();
        visitor4.calculateFines(rentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str19.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test199");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        userTypes.Visitor visitor11 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor11.getRentals();
        visitor4.calculateFines(rentList12);
        java.lang.String str14 = visitor4.getPassword();
        visitor4.setNumOfOverdue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test200");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setId((int) (short) 1);
        int int9 = visitor4.getId();
        visitor4.setEmail("User [email=hi!, password=hi!,id=52]");
        java.lang.String str12 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=User [email=hi!, password=hi!,id=52], password=hi!,id=1]" + "'", str12.equals("User [email=User [email=hi!, password=hi!,id=52], password=hi!,id=1]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test201");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=52]", "User [email=, password=hi!,id=0]", "");
        visitor4.setNumOfOverdue(0);
        int int7 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test202");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test203");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        int int8 = visitor4.getNumOfOverdue();
        visitor4.setId((int) (short) 0);
        visitor4.setEmail("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test204");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test205");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setEmail("");
        java.lang.String str8 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str8.equals("User [email=, password=hi!,id=0]"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test206");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        visitor4.setUserType("");
        java.lang.String str11 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str11.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test207");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        double double10 = visitor4.getFine();
        java.lang.String str12 = visitor4.update("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        visitor4.setId((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]" + "'", str12.equals("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test208");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getUserType();
        java.lang.String str18 = visitor15.getUserType();
        java.lang.String str20 = visitor15.update("hi!");
        visitor15.setNumOfOverdue((int) (short) 0);
        java.lang.String str23 = visitor15.toString();
        java.lang.String str24 = visitor15.getPassword();
        java.lang.String str26 = visitor15.update("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = visitor15.getRentals();
        visitor4.calculateFines(rentList27);
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        java.lang.String str32 = visitor4.update("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str23.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]" + "'", str32.equals("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test209");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test210");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        visitor4.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test211");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        visitor4.setUserType("");
        int int11 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test212");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setUserType("");
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test213");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        visitor4.setId((int) (byte) -1);
        java.lang.String str7 = visitor4.getPassword();
        int int8 = visitor4.getId();
        visitor4.setEmail("");
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test214");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setPassword("");
        visitor4.setUserType("hi!");
        java.lang.String str12 = visitor4.getEmail();
        java.util.ArrayList<actions.Rent> rentList13 = visitor4.getRentals();
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test215");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getPassword();
        userTypes.Visitor visitor22 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList23 = visitor22.getRentals();
        visitor15.calculateFines(rentList23);
        visitor4.calculateFines(rentList23);
        java.lang.String str26 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test216");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setId((int) (short) 1);
        visitor4.setUserType("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str11.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test217");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        visitor4.setUserType("");
        userTypes.Visitor visitor14 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str15 = visitor14.getUserType();
        visitor14.setId((int) (byte) 100);
        java.lang.String str19 = visitor14.update("User [email=hi!, password=hi!,id=0]");
        int int20 = visitor14.getNumOfOverdue();
        userTypes.Visitor visitor25 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor25.setNumOfOverdue(100);
        int int28 = visitor25.getId();
        java.util.ArrayList<actions.Rent> rentList29 = visitor25.getRentals();
        visitor14.calculateFines(rentList29);
        visitor4.calculateFines(rentList29);
        java.lang.String str32 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str19.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test218");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test219");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        java.lang.String str5 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList6 = visitor4.getRentals();
        java.lang.String str8 = visitor4.update("User [email=, password=hi!,id=0]");
        double double9 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, password=hi!,id=0]" + "'", str8.equals("User [email=, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test220");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        visitor4.setId((int) (byte) -1);
        java.lang.String str7 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test221");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("", "User [email=, password=hi!,id=100]", "hi!", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test222");
        userTypes.Visitor visitor4 = new userTypes.Visitor((-1), "User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]", "User [email=, password=hi!,id=0]", "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test223");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor15.setNumOfOverdue(100);
        int int18 = visitor15.getId();
        java.util.ArrayList<actions.Rent> rentList19 = visitor15.getRentals();
        visitor4.calculateFines(rentList19);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        visitor4.setId((int) (short) 100);
        visitor4.setId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList19);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test224");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 10, "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=100]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test225");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        visitor4.setPassword("");
        visitor4.setUserType("hi!");
        java.lang.String str12 = visitor4.getEmail();
        java.util.ArrayList<actions.Rent> rentList13 = visitor4.getRentals();
        visitor4.setNumOfOverdue((int) (short) 100);
        java.lang.String str16 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test226");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getFine();
        java.util.ArrayList<actions.Rent> rentList9 = visitor4.getRentals();
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        visitor15.setId((int) (byte) 100);
        java.lang.String str20 = visitor15.update("User [email=hi!, password=hi!,id=0]");
        int int21 = visitor15.getNumOfOverdue();
        userTypes.Visitor visitor26 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str27 = visitor26.getUserType();
        java.lang.String str28 = visitor26.getUserType();
        java.lang.String str29 = visitor26.getUserType();
        java.lang.String str31 = visitor26.update("hi!");
        visitor26.setNumOfOverdue((int) (short) 0);
        java.lang.String str34 = visitor26.toString();
        java.lang.String str35 = visitor26.getPassword();
        java.lang.String str37 = visitor26.update("hi!");
        java.util.ArrayList<actions.Rent> rentList38 = visitor26.getRentals();
        visitor15.calculateFines(rentList38);
        visitor4.calculateFines(rentList38);
        java.lang.String str41 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str20.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str34.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test227");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        java.lang.String str6 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str6.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test228");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        int int5 = visitor4.getNumOfOverdue();
        visitor4.setUserType("hi!");
        int int8 = visitor4.getId();
        visitor4.setNumOfOverdue(97);
        visitor4.setUserType("");
        actions.Rent rent13 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent13, maintainPhysicalItems14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test229");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getUserType();
        double double12 = visitor4.getFine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test230");
        structure.Management management3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTypes.Visitor visitor4 = new userTypes.Visitor("User [email=, password=hi!,id=100]", "", "", management3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"structure.Management.validate()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test231");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 10, "User [email=hi!, password=hi!,id=52]", "User [email=, password=hi!,id=0]", "");
        java.lang.String str5 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test232");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 1, "User [email=hi!, password=hi!,id=0]", "", "User [email=hi!, password=hi!,id=0]");
        int int5 = visitor4.getNumOfOverdue();
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        visitor4.setNumOfOverdue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test233");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) '4', "User [email=hi!, password=hi!,id=0]", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList5 = visitor4.getRentals();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test234");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("hi!");
        visitor4.setUserType("User [email=User [email=hi!, password=hi!,id=0], password=User [email=hi!, password=hi!,id=0],id=-1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test235");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        double double12 = visitor4.getFine();
        double double13 = visitor4.getFine();
        int int14 = visitor4.getNumOfOverdue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test236");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) '#', "hi!", "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]");
        int int5 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test237");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 0, "User [email=hi!, password=hi!,id=52]", "User [email=hi!, password=hi!,id=0]", "");
        java.lang.String str5 = visitor4.toString();
        java.lang.String str6 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]" + "'", str5.equals("User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]" + "'", str6.equals("User [email=User [email=hi!, password=hi!,id=52], password=User [email=hi!, password=hi!,id=0],id=0]"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test238");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        int int8 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor13 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str14 = visitor13.getUserType();
        java.lang.String str15 = visitor13.getUserType();
        java.lang.String str16 = visitor13.getEmail();
        double double17 = visitor13.getFine();
        java.util.ArrayList<actions.Rent> rentList18 = visitor13.getRentals();
        visitor4.calculateFines(rentList18);
        visitor4.setPassword("User [email=User [email=hi!, password=hi!,id=52], password=hi!,id=1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test239");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        actions.Rent rent10 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent10, maintainPhysicalItems11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test240");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 1, "", "hi!", "");
        userTypes.Visitor visitor9 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str10 = visitor9.getUserType();
        java.lang.String str11 = visitor9.getPassword();
        visitor9.setPassword("User [email=hi!, password=hi!,id=0]");
        visitor9.setPassword("User [email=hi!, password=hi!,id=52]");
        userTypes.Visitor visitor20 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor20.setNumOfOverdue(100);
        int int23 = visitor20.getId();
        java.util.ArrayList<actions.Rent> rentList24 = visitor20.getRentals();
        visitor9.calculateFines(rentList24);
        visitor4.calculateFines(rentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList24);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test241");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getUserType();
        java.lang.String str18 = visitor15.getUserType();
        java.lang.String str20 = visitor15.update("hi!");
        visitor15.setNumOfOverdue((int) (short) 0);
        java.lang.String str23 = visitor15.toString();
        java.lang.String str24 = visitor15.getPassword();
        java.lang.String str26 = visitor15.update("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = visitor15.getRentals();
        visitor4.calculateFines(rentList27);
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str23.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test242");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        visitor4.setId((-1));
        visitor4.setNumOfOverdue((int) '4');
        visitor4.setPassword("User [email=hi!, password=hi!,id=100]");
        int int16 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test243");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        visitor4.setEmail("hi!");
        java.lang.String str13 = visitor4.toString();
        visitor4.setEmail("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=hi!, password=hi!,id=100]" + "'", str13.equals("User [email=hi!, password=hi!,id=100]"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test244");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        java.lang.String str11 = visitor4.getUserType();
        int int12 = visitor4.getNumOfOverdue();
        java.lang.String str13 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test245");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) -1, "User [email=hi!, password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]", "hi!");
        actions.Rent[] rentArray5 = new actions.Rent[] {};
        java.util.ArrayList<actions.Rent> rentList6 = new java.util.ArrayList<actions.Rent>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<actions.Rent>) rentList6, rentArray5);
        visitor4.calculateFines(rentList6);
        visitor4.setNumOfOverdue((int) (short) 10);
        visitor4.setEmail("User [email=, password=hi!,id=0]");
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test246");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "", "hi!", "hi!");
        visitor4.setId((int) (byte) -1);
        java.lang.String str7 = visitor4.getPassword();
        java.lang.String str8 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test247");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (byte) 0, "User [email=hi!, password=hi!,id=0]", "hi!", "");
        double double5 = visitor4.getFine();
        visitor4.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test248");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=10]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test249");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        visitor4.setUserType("");
        userTypes.Visitor visitor14 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str15 = visitor14.getUserType();
        visitor14.setId((int) (byte) 100);
        java.lang.String str19 = visitor14.update("User [email=hi!, password=hi!,id=0]");
        int int20 = visitor14.getNumOfOverdue();
        userTypes.Visitor visitor25 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor25.setNumOfOverdue(100);
        int int28 = visitor25.getId();
        java.util.ArrayList<actions.Rent> rentList29 = visitor25.getRentals();
        visitor14.calculateFines(rentList29);
        visitor4.calculateFines(rentList29);
        visitor4.setUserType("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str19.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList29);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test250");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor4.getRentals();
        int int13 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test251");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        visitor4.setId((int) (short) 1);
        actions.Rent rent9 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent9, maintainPhysicalItems10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test252");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getPassword();
        userTypes.Visitor visitor11 = new userTypes.Visitor(0, "", "hi!", "hi!");
        java.util.ArrayList<actions.Rent> rentList12 = visitor11.getRentals();
        visitor4.calculateFines(rentList12);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.toString();
        java.lang.String str16 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str15.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str16.equals("User [email=hi!, password=hi!,id=0]"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test253");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "User [email=hi!, password=hi!,id=100]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]");
        java.lang.String str5 = visitor4.toString();
        double double6 = visitor4.getFine();
        java.lang.String str7 = visitor4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=hi!, password=hi!,id=100], password=User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0],id=0]" + "'", str5.equals("User [email=User [email=hi!, password=hi!,id=100], password=User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0],id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=User [email=hi!, password=hi!,id=100], password=User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0],id=0]" + "'", str7.equals("User [email=User [email=hi!, password=hi!,id=100], password=User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0],id=0]"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test254");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (short) 10);
        java.lang.String str9 = visitor4.update("");
        java.lang.String str10 = visitor4.getUserType();
        java.lang.String str11 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test255");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        java.lang.String str9 = visitor4.getEmail();
        visitor4.setNumOfOverdue(0);
        visitor4.setEmail("User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test256");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        visitor4.setNumOfOverdue(100);
        java.lang.String str8 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setId((int) (short) 100);
        int int12 = visitor4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str8.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test257");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) ' ', "User [email=hi!, password=hi!,id=100]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "User [email=hi!, password=hi!,id=0]");
        visitor4.setId((int) ' ');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test258");
        userTypes.Visitor visitor4 = new userTypes.Visitor(35, "hi!", "User [email=User [email=hi!, password=hi!,id=100], password=User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0],id=0]", "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test259");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        java.lang.String str11 = visitor4.update("");
        visitor4.setId((int) (byte) -1);
        actions.Rent rent14 = null;
        maintaining.MaintainPhysicalItems maintainPhysicalItems15 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.returnRental(rent14, maintainPhysicalItems15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"actions.Rent.getRentalId()\" because \"rental\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test260");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        double double13 = visitor4.getFine();
        int int14 = visitor4.getNumOfOverdue();
        visitor4.setUserType("User [email=hi!, password=hi!,id=52]");
        visitor4.setNumOfOverdue((int) (short) 1);
        java.lang.String str20 = visitor4.update("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test261");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        visitor4.setId((int) (byte) 100);
        java.lang.String str9 = visitor4.update("User [email=hi!, password=hi!,id=0]");
        int int10 = visitor4.getNumOfOverdue();
        userTypes.Visitor visitor15 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str16 = visitor15.getUserType();
        java.lang.String str17 = visitor15.getUserType();
        java.lang.String str18 = visitor15.getUserType();
        java.lang.String str20 = visitor15.update("hi!");
        visitor15.setNumOfOverdue((int) (short) 0);
        java.lang.String str23 = visitor15.toString();
        java.lang.String str24 = visitor15.getPassword();
        java.lang.String str26 = visitor15.update("hi!");
        java.util.ArrayList<actions.Rent> rentList27 = visitor15.getRentals();
        visitor4.calculateFines(rentList27);
        java.lang.String str29 = visitor4.getPassword();
        java.lang.String str30 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass31 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str9.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User [email=hi!, password=hi!,id=0]" + "'", str23.equals("User [email=hi!, password=hi!,id=0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test262");
        userTypes.Visitor visitor4 = new userTypes.Visitor((int) (short) 10, "User [email=User [email=hi!, password=hi!,id=0], password=hi!,id=0]", "", "User [email=, password=hi!,id=0]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test263");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        visitor4.setNumOfOverdue((int) '4');
        int int13 = visitor4.getId();
        java.lang.String str14 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test264");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getUserType();
        java.util.ArrayList<actions.Rent> rentList7 = visitor4.getRentals();
        visitor4.setId((int) '4');
        visitor4.setPassword("User [email=hi!, password=hi!,id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rentList7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VisitorTest.test265");
        userTypes.Visitor visitor4 = new userTypes.Visitor(0, "hi!", "hi!", "");
        java.lang.String str5 = visitor4.getUserType();
        java.lang.String str7 = visitor4.update("hi!");
        visitor4.setEmail("hi!");
        double double10 = visitor4.getFine();
        visitor4.setNumOfOverdue((int) '4');
        int int13 = visitor4.getId();
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

