package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test001");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test002");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test003");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        java.lang.Class<?> wildcardClass15 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test004");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        int int15 = course10.getFacultyId();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test005");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setFacultyId((int) 'a');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test006");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.lang.String str11 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test007");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        boolean boolean14 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test008");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.setCourseId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test009");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.time.LocalDate localDate16 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test010");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test011");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setCourseName("hi!");
        course10.checkTextStatus();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test012");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getStudentId2();
        java.lang.Class<?> wildcardClass16 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test013");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        userTypes.Observer observer14 = course10.Observer();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer14);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test014");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        boolean boolean15 = course10.isTextAvail();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test015");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setTextbookStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test016");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (short) 10, (int) 'a', (int) (short) -1, (int) '4', (int) '4', "hi!", "", localDate7, localDate8, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test017");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        course10.setStudentId3(10);
        course10.setStudentId3((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test018");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        course10.setTextbookStatus("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test019");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.Class<?> wildcardClass16 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test020");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        int int16 = course10.getFacultyId();
        boolean boolean17 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test021");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        java.lang.String str16 = course10.getCourseName();
        java.lang.String str17 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test022");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getStudentId1();
        java.lang.Class<?> wildcardClass16 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test023");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        java.lang.Class<?> wildcardClass19 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test024");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getNewEditionMessage();
        int int17 = course10.getStudentId3();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test025");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = null;
        course10.setStartDate(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test026");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        course10.setCourseId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test027");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbookStatus();
        int int19 = course10.getStudentId1();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test028");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getNewEditionMessage();
        java.lang.String str17 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test029");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        java.lang.String str19 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ": , start date: null, end date: null" + "'", str19.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test030");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 10, (int) (short) 10, 0, (int) (byte) 100, 10, "", ": , start date: null, end date: null", localDate7, localDate8, ": , start date: null, end date: null");
        course10.setTextbook("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test031");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        course10.setTextbook("");
        java.lang.String str17 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test032");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ": , start date: null, end date: null" + "'", str13.equals(": , start date: null, end date: null"));
    }

//    @Test
//    public void test033() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "CourseTest.test033");
//        java.time.LocalDate localDate7 = null;
//        java.time.LocalDate localDate8 = null;
//        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
//        course10.setTextbookStatus("");
//        java.lang.String str13 = course10.getTextbook();
//        java.time.LocalDate localDate14 = course10.getEndDate();
//        boolean boolean15 = course10.isTextAvail();
//        java.lang.String str16 = course10.getTextbook();
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertNull(localDate14);
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
//        // Regression assertion (captures the current behavior of the code)
//        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
//    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test034");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setTextbook(": , start date: null, end date: null");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test035");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        course10.checkTextStatus();
        java.lang.String str14 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test036");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        userTypes.Observer observer11 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test037");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        java.time.LocalDate localDate15 = course10.getStartDate();
        java.lang.String str16 = course10.getTextbookStatus();
        java.lang.Class<?> wildcardClass17 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test038");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test039");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.checkTextStatus();
        int int15 = course10.getStudentId2();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test040");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        course10.setFacultyId(0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test041");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        java.lang.Class<?> wildcardClass15 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test042");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setFacultyId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test043");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        int int18 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test044");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getFacultyId();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test045");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) '4', (int) (byte) 1, (int) (short) 100, 0, (int) '4', "", "", localDate7, localDate8, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test046");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        boolean boolean15 = course10.isTextAvail();
        int int16 = course10.getStudentId3();
        java.lang.String str17 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test047");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        course10.setStudentId2((int) '#');
        java.time.LocalDate localDate18 = null;
        course10.setEndDate(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test048");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        int int14 = course10.getStudentId3();
        int int15 = course10.getStudentId1();
        course10.setStudentId1((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test049");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getStudentId2();
        course10.setTextAvail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test050");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        boolean boolean14 = course10.isTextAvail();
        java.lang.String str15 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test051");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        course10.setCourseId((int) (byte) 100);
        course10.setStudentId3((int) 'a');
        userTypes.Observer observer22 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test052");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        boolean boolean12 = course10.isTextAvail();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test053");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getStudentId2();
        course10.setStudentId3((int) ' ');
        int int18 = course10.getStudentId3();
        int int19 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test054");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        int int15 = course10.getStudentId3();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test055");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        int int14 = course10.getCourseId();
        userTypes.Observer observer15 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test056");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        int int15 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test057");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = course10.getStartDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test058");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        java.lang.String str15 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ": , start date: null, end date: null" + "'", str15.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test059");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test060");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        course10.setCourseId((int) (short) 100);
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test061");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getNewEditionMessage();
        course10.setFacultyId((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test062");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        course10.setStudentId1((int) (byte) 100);
        course10.setTextbook("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test063");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        java.lang.String str16 = course10.getCourseName();
        java.lang.Class<?> wildcardClass17 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test064");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getStudentId2();
        course10.setTextbook(": , start date: null, end date: null");
        java.lang.Class<?> wildcardClass21 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test065");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        course10.setStudentId2((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test066");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        int int13 = course10.getCourseId();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test067");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getStudentId2();
        course10.setTextbookStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test068");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        course10.setCourseName("");
        int int20 = course10.getStudentId3();
        java.lang.String str21 = course10.getCourseName();
        java.lang.String str22 = course10.getNewEditionMessage();
        java.time.LocalDate localDate23 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test069");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test070");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setCourseName("hi!");
        java.lang.String str18 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!: , start date: null, end date: null" + "'", str18.equals("hi!: , start date: null, end date: null"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test071");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        java.lang.String str16 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test072");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        userTypes.Observer observer13 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test073");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        course10.setCourseId((int) (byte) 100);
        int int20 = course10.getFacultyId();
        int int21 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test074");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getNewEditionMessage();
        course10.setStudentId1((int) (byte) -1);
        int int17 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test075");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setCourseId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test076");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) '4', (-1), 97, (int) (short) 0, (int) (byte) 1, "", "hi!", localDate7, localDate8, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test077");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getTextbook();
        course10.setTextbookStatus(": , start date: null, end date: null");
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test078");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        course10.setCourseId((int) (byte) 100);
        int int20 = course10.getFacultyId();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test079");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        int int15 = course10.getCourseId();
        java.time.LocalDate localDate16 = null;
        course10.setEndDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test080");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        course10.checkTextStatus();
        int int16 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test081");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        course10.checkTextStatus();
        course10.setCourseId((int) '#');
        java.lang.Class<?> wildcardClass22 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test082");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getFacultyId();
        java.lang.String str20 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test083");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.lang.String str12 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ": , start date: null, end date: null" + "'", str12.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test084");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) ' ', 0, 100, "", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = null;
        course10.setEndDate(localDate11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test085");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        boolean boolean13 = course10.isTextAvail();
        course10.setStudentId3((int) ' ');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test086");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        java.lang.String str18 = course10.toString();
        java.time.LocalDate localDate19 = course10.getStartDate();
        course10.setCourseName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test087");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = null;
        course10.setStartDate(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test088");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.Class<?> wildcardClass15 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test089");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        course10.setTextbookStatus("");
        java.lang.String str18 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test090");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        int int15 = course10.getFacultyId();
        course10.setTextbookStatus("hi!: , start date: null, end date: null");
        int int18 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test091");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        int int15 = course10.getFacultyId();
        userTypes.Observer observer16 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test092");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        java.lang.String str18 = course10.toString();
        java.time.LocalDate localDate19 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test093");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        course10.setCourseId((int) (byte) 100);
        course10.setStudentId3((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!: , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test094");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        course10.setStudentId1(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test095");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        course10.setStudentId3(10);
        course10.setTextbook("");
        java.lang.String str20 = course10.getNewEditionMessage();
        course10.setStudentId3((int) (byte) 10);
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test096");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, ": , start date: null, end date: null", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setEndDate(localDate11);
        java.lang.String str13 = course10.toString();
        course10.setCourseName(": : , start date: null, end date: null, start date: null, end date: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ": : , start date: null, end date: null, start date: null, end date: null" + "'", str13.equals(": : , start date: null, end date: null, start date: null, end date: null"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test097");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        course10.setCourseName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test098");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        course10.checkTextStatus();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test099");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        boolean boolean20 = course10.isTextAvail();
        userTypes.Observer observer21 = course10.Observer();
        course10.checkTextStatus();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer21);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test100");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test101");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) '4', 1, (int) (byte) 1, 10, 100, "hi!", "hi!", localDate7, localDate8, "hi!");
        course10.setStudentId3((int) (byte) 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test102");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        int int13 = course10.getStudentId2();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test103");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        java.time.LocalDate localDate15 = course10.getStartDate();
        java.time.LocalDate localDate16 = null;
        course10.setStartDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test104");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(1, (int) (byte) 0, 32, (int) (byte) 1, (int) (short) 1, ": : , start date: null, end date: null, start date: null, end date: null", "", localDate7, localDate8, ": , start date: null, end date: null");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test105");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, ": , start date: null, end date: null", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setEndDate(localDate11);
        java.lang.String str13 = course10.toString();
        course10.setStudentId3((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ": : , start date: null, end date: null, start date: null, end date: null" + "'", str13.equals(": : , start date: null, end date: null, start date: null, end date: null"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test106");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(false);
        int int18 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test107");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(0, 100, 1, (int) (short) -1, (int) ' ', "hi!: , start date: null, end date: null", ": : , start date: null, end date: null, start date: null, end date: null", localDate7, localDate8, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test108");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        java.lang.String str14 = course10.getTextbookStatus();
        course10.setFacultyId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test109");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getFacultyId();
        int int19 = course10.getStudentId3();
        course10.setTextAvail(false);
        course10.setStudentId2((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test110");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        userTypes.Observer observer11 = course10.Observer();
        course10.checkTextStatus();
        course10.setCourseName(": , start date: null, end date: null");
        int int15 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test111");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        java.time.LocalDate localDate14 = null;
        course10.setStartDate(localDate14);
        course10.setTextbookStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test112");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        int int15 = course10.getStudentId3();
        java.time.LocalDate localDate16 = null;
        course10.setStartDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test113");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        java.time.LocalDate localDate16 = course10.getEndDate();
        int int17 = course10.getStudentId1();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test114");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        course10.setCourseName("");
        course10.setCourseId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test115");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        int int14 = course10.getCourseId();
        java.lang.String str15 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test116");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (short) 100, 100, (int) (short) 10, 0, (int) (byte) 0, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!: , start date: null, end date: null");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test117");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        course10.checkTextStatus();
        java.time.LocalDate localDate19 = null;
        course10.setEndDate(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test118");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getStudentId1();
        course10.setTextbook("");
        java.time.LocalDate localDate18 = course10.getStartDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test119");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        course10.setStudentId1((int) (byte) 100);
        java.time.LocalDate localDate20 = null;
        course10.setStartDate(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test120");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getFacultyId();
        java.time.LocalDate localDate16 = course10.getEndDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDate16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test121");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        course10.setStudentId2((int) (short) 10);
        course10.setStudentId2(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test122");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getNewEditionMessage();
        int int17 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test123");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        java.lang.String str15 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test124");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        int int18 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test125");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        course10.checkTextStatus();
        java.lang.String str16 = course10.getCourseName();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test126");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, 97, 1, (int) (byte) 10, 52, ": , start date: null, end date: null", "", localDate7, localDate8, ": , start date: null, end date: null");
        int int11 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test127");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getStudentId1();
        int int19 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test128");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        boolean boolean14 = course10.isTextAvail();
        java.lang.String str15 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test129");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.Class<?> wildcardClass14 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test130");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        java.lang.String str15 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test131");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 100, 0, (int) (byte) 1, 1, (int) (byte) 0, "hi!", ": : , start date: null, end date: null, start date: null, end date: null", localDate7, localDate8, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test132");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        java.time.LocalDate localDate16 = course10.getEndDate();
        java.lang.String str17 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ": , start date: null, end date: null" + "'", str17.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test133");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getNewEditionMessage();
        course10.setTextbook("hi!");
        course10.setStudentId1((int) (short) -1);
        course10.setStudentId3((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test134");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getStudentId2();
        course10.setFacultyId((int) (byte) 10);
        java.time.LocalDate localDate18 = null;
        course10.setStartDate(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test135");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        java.time.LocalDate localDate18 = course10.getEndDate();
        course10.setTextbookStatus("hi!");
        java.time.LocalDate localDate21 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test136");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        course10.setCourseName("");
        course10.setStudentId1((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test137");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getStudentId1();
        course10.setTextbook("");
        course10.setTextbookStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test138");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        int int14 = course10.getStudentId3();
        int int15 = course10.getStudentId1();
        userTypes.Observer observer16 = course10.Observer();
        java.lang.String str17 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test139");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        java.time.LocalDate localDate15 = null;
        course10.setStartDate(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test140");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        course10.setStudentId1(0);
        userTypes.Observer observer15 = course10.Observer();
        int int16 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test141");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', 10, (int) (short) 100, (int) (short) 100, (int) (short) 1, "", "hi!", localDate7, localDate8, "hi!");
        int int11 = course10.getStudentId1();
        int int12 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test142");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        course10.setCourseName("hi!: , start date: null, end date: null");
        java.time.LocalDate localDate16 = null;
        course10.setEndDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test143");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = null;
        course10.setEndDate(localDate11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test144");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        int int15 = course10.getCourseId();
        java.lang.String str16 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ": , start date: null, end date: null" + "'", str16.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test145");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        int int13 = course10.getStudentId1();
        course10.setStudentId3(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test146");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        course10.setCourseName("hi!");
        course10.setCourseName(": : , start date: null, end date: null, start date: null, end date: null");
        java.lang.String str19 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test147");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getNewEditionMessage();
        course10.setStudentId1((int) (byte) -1);
        java.time.LocalDate localDate17 = null;
        course10.setStartDate(localDate17);
        course10.setStudentId2((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test148");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        java.time.LocalDate localDate14 = null;
        course10.setStartDate(localDate14);
        int int16 = course10.getFacultyId();
        java.time.LocalDate localDate17 = null;
        course10.setEndDate(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test149");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.time.LocalDate localDate15 = course10.getStartDate();
        course10.checkTextStatus();
        int int17 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test150");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbookStatus();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test151");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        course10.setCourseId(100);
        int int20 = course10.getStudentId1();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test152");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        course10.setCourseId((int) (short) 1);
        int int15 = course10.getStudentId2();
        java.time.LocalDate localDate16 = null;
        course10.setEndDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test153");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        course10.checkTextStatus();
        java.lang.String str20 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test154");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.time.LocalDate localDate15 = null;
        course10.setEndDate(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test155");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        userTypes.Observer observer11 = course10.Observer();
        java.lang.String str12 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test156");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test157");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        course10.setFacultyId((int) (byte) 10);
        course10.setStudentId2((int) 'a');
        java.lang.Class<?> wildcardClass17 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test158");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        java.lang.String str18 = course10.toString();
        java.lang.String str19 = course10.getTextbook();
        java.lang.String str20 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test159");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        java.lang.Class<?> wildcardClass18 = course10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test160");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        java.time.LocalDate localDate18 = course10.getEndDate();
        course10.setStudentId1(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test161");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (short) 100, 10, 97, (int) (short) 100, (int) (byte) 0, "", "", localDate7, localDate8, ": , start date: null, end date: null");
        int int11 = course10.getStudentId1();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test162");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        course10.setCourseName(": , start date: null, end date: null");
        int int16 = course10.getCourseId();
        userTypes.Observer observer17 = course10.Observer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test163");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getCourseId();
        int int16 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test164");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        java.lang.String str19 = course10.getTextbookStatus();
        int int20 = course10.getStudentId2();
        java.lang.String str21 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test165");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setCourseName("hi!");
        int int18 = course10.getStudentId2();
        course10.setFacultyId((int) (byte) 100);
        java.lang.String str21 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test166");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) '4', (int) ' ', (int) ' ', (int) '#', 0, "hi!: , start date: null, end date: null", ": : , start date: null, end date: null, start date: null, end date: null", localDate7, localDate8, "hi!: , start date: null, end date: null");
        boolean boolean11 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test167");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getNewEditionMessage();
        course10.setFacultyId((int) (byte) 10);
        int int18 = course10.getCourseId();
        course10.setStudentId2((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test168");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, ": , start date: null, end date: null", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test169");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getTextbook();
        course10.setCourseName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test170");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setStudentId3(0);
        java.lang.String str23 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!: , start date: null, end date: null" + "'", str23.equals("hi!: , start date: null, end date: null"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test171");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        java.lang.String str19 = course10.getTextbookStatus();
        course10.setStudentId2((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test172");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbookStatus();
        int int19 = course10.getStudentId1();
        java.time.LocalDate localDate20 = course10.getEndDate();
        java.lang.String str21 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ": , start date: null, end date: null" + "'", str21.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test173");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getTextbook();
        course10.setStudentId2(10);
        course10.setTextbook("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test174");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        course10.setCourseName(": , start date: null, end date: null");
        int int16 = course10.getCourseId();
        boolean boolean17 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test175");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.lang.String str17 = course10.getNewEditionMessage();
        course10.setCourseName("");
        java.lang.String str20 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ": , start date: null, end date: null" + "'", str20.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test176");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        userTypes.Observer observer11 = course10.Observer();
        course10.checkTextStatus();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test177");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        int int14 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test178");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        course10.checkTextStatus();
        java.lang.String str16 = course10.toString();
        boolean boolean17 = course10.isTextAvail();
        java.lang.String str18 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ": , start date: null, end date: null" + "'", str16.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test179");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        course10.setStudentId1((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test180");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) '4', 1, (int) (byte) 1, 10, 100, "hi!", "hi!", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test181");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test182");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        course10.setTextbookStatus("");
        boolean boolean18 = course10.isTextAvail();
        int int19 = course10.getFacultyId();
        course10.setTextAvail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test183");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        course10.setFacultyId((int) (byte) 100);
        course10.setCourseId(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test184");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        course10.setTextbook("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test185");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        course10.setCourseId(0);
        course10.setStudentId1(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test186");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        course10.setCourseId((int) (short) 100);
        java.lang.String str22 = course10.getCourseName();
        java.lang.String str23 = course10.toString();
        java.time.LocalDate localDate24 = null;
        course10.setStartDate(localDate24);
        course10.setFacultyId((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ": , start date: null, end date: null" + "'", str23.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test187");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        int int20 = course10.getCourseId();
        java.lang.String str21 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test188");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 1, 52, (int) ' ', 0, (int) (byte) 1, "hi!: , start date: null, end date: null", "hi!", localDate7, localDate8, "hi!: , start date: null, end date: null");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test189");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        course10.setStudentId1((int) (byte) 100);
        java.lang.String str20 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test190");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        java.time.LocalDate localDate17 = course10.getEndDate();
        java.lang.String str18 = course10.toString();
        java.time.LocalDate localDate19 = course10.getStartDate();
        java.time.LocalDate localDate20 = null;
        course10.setStartDate(localDate20);
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test191");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getNewEditionMessage();
        int int16 = course10.getStudentId1();
        java.lang.String str17 = course10.getCourseName();
        java.lang.String str18 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test192");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getStudentId2();
        course10.setStudentId3((int) ' ');
        course10.setTextbook("hi!");
        course10.setStudentId3((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test193");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        course10.setFacultyId((int) (short) 1);
        course10.setCourseId(100);
        course10.setStudentId3((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test194");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getNewEditionMessage();
        int int16 = course10.getStudentId1();
        java.lang.String str17 = course10.getCourseName();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test195");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(0, 10, (int) (byte) 10, (int) (byte) 0, (int) '#', "", "", localDate7, localDate8, "hi!: , start date: null, end date: null");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test196");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.time.LocalDate localDate15 = course10.getStartDate();
        int int16 = course10.getFacultyId();
        course10.setTextAvail(true);
        course10.setCourseId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test197");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.time.LocalDate localDate15 = course10.getStartDate();
        course10.checkTextStatus();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": : , start date: null, end date: null, start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test198");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(false);
        course10.setCourseName("");
        course10.setStudentId2((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test199");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        course10.setStudentId2((int) ' ');
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test200");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        course10.setStudentId1((int) (byte) 0);
        java.time.LocalDate localDate19 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test201");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', 10, (int) (short) 100, (int) (short) 100, (int) (short) 1, "", "hi!", localDate7, localDate8, "hi!");
        int int11 = course10.getStudentId1();
        java.time.LocalDate localDate12 = null;
        course10.setStartDate(localDate12);
        course10.setTextbook("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test202");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": : , start date: null, end date: null, start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test203");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        course10.setFacultyId((int) (byte) 100);
        course10.setCourseName("hi!");
        java.time.LocalDate localDate22 = null;
        course10.setStartDate(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test204");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        boolean boolean20 = course10.isTextAvail();
        java.lang.String str21 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test205");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        course10.setTextAvail(true);
        int int17 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test206");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextbookStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test207");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setStudentId3((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test208");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.checkTextStatus();
        course10.checkTextStatus();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test209");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getNewEditionMessage();
        course10.setStudentId1((int) (byte) -1);
        java.time.LocalDate localDate17 = null;
        course10.setStartDate(localDate17);
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test210");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) ' ', 0, 100, "", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.checkTextStatus();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test211");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        course10.setCourseName(": , start date: null, end date: null");
        int int16 = course10.getStudentId3();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test212");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextbookStatus("hi!");
        java.lang.String str18 = course10.getTextbookStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test213");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        course10.setStudentId2((int) (short) 10);
        java.time.LocalDate localDate21 = null;
        course10.setEndDate(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test214");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getNewEditionMessage();
        course10.setStudentId1((int) (byte) 0);
        java.time.LocalDate localDate19 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test215");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        java.time.LocalDate localDate15 = course10.getStartDate();
        java.lang.String str16 = course10.getTextbookStatus();
        course10.setTextbook("hi!");
        int int19 = course10.getStudentId2();
        course10.setTextbookStatus("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test216");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.lang.String str15 = course10.getNewEditionMessage();
        boolean boolean16 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test217");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        java.time.LocalDate localDate15 = course10.getStartDate();
        java.lang.String str16 = course10.getTextbookStatus();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver(": , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test218");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        course10.checkTextStatus();
        course10.setCourseName("hi!");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test219");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setStudentId3(0);
        int int23 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test220");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        course10.setCourseId((int) (byte) 100);
        course10.setStudentId3((int) 'a');
        int int22 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test221");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        course10.setCourseName("hi!");
        course10.setCourseName(": : , start date: null, end date: null, start date: null, end date: null");
        course10.checkTextStatus();
        int int20 = course10.getStudentId1();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test222");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.lang.String str18 = course10.getNewEditionMessage();
        java.time.LocalDate localDate19 = course10.getStartDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test223");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        int int16 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test224");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        boolean boolean20 = course10.isTextAvail();
        userTypes.Observer observer21 = course10.Observer();
        course10.checkTextStatus();
        course10.setStudentId2(10);
        int int25 = course10.getStudentId1();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test225");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test226");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.lang.String str13 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test227");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setStudentId3(0);
        course10.setFacultyId(52);
        course10.setTextAvail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test228");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        int int14 = course10.getStudentId1();
        course10.checkTextStatus();
        course10.setTextbook("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test229");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setCourseName("hi!");
        int int18 = course10.getStudentId2();
        course10.setFacultyId((int) (byte) 100);
        course10.setCourseId(0);
        java.time.LocalDate localDate23 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test230");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        java.time.LocalDate localDate19 = null;
        course10.setStartDate(localDate19);
        java.lang.String str21 = course10.getNewEditionMessage();
        course10.setStudentId2(0);
        course10.setStudentId1(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test231");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        java.time.LocalDate localDate15 = null;
        course10.setEndDate(localDate15);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test232");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setFacultyId((int) (short) -1);
        java.time.LocalDate localDate18 = course10.getStartDate();
        course10.setCourseName("hi!");
        course10.setStudentId3(0);
        course10.setFacultyId(52);
        course10.setStudentId2(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test233");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        course10.setTextAvail(false);
        java.lang.String str16 = course10.getTextbook();
        userTypes.Observer observer17 = course10.Observer();
        course10.checkTextStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test234");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbookStatus();
        java.lang.String str19 = course10.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test235");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        course10.setStudentId2((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test236");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        java.lang.String str19 = course10.getTextbookStatus();
        java.lang.String str20 = course10.getNewEditionMessage();
        course10.setTextbook("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test237");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        boolean boolean14 = course10.isTextAvail();
        int int15 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test238");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setCourseId((int) (short) 1);
        int int13 = course10.getStudentId2();
        java.time.LocalDate localDate14 = course10.getStartDate();
        int int15 = course10.getStudentId1();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test239");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getFacultyId();
        int int19 = course10.getStudentId3();
        int int20 = course10.getFacultyId();
        course10.setTextbook(": , start date: null, end date: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test240");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.lang.String str14 = course10.getTextbook();
        java.lang.String str15 = course10.getNewEditionMessage();
        java.lang.String str16 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test241");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.checkTextStatus();
        course10.checkTextStatus();
        java.lang.String str16 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test242");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        int int15 = course10.getCourseId();
        java.lang.String str16 = course10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ": , start date: null, end date: null" + "'", str16.equals(": , start date: null, end date: null"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test243");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        int int15 = course10.getStudentId2();
        course10.setFacultyId((int) (byte) 10);
        java.lang.String str18 = course10.toString();
        boolean boolean19 = course10.isTextAvail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ": , start date: null, end date: null" + "'", str18.equals(": , start date: null, end date: null"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test244");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.time.LocalDate localDate15 = course10.getStartDate();
        course10.checkTextStatus();
        java.time.LocalDate localDate17 = null;
        course10.setEndDate(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test245");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(97, 0, (int) (short) 1, (int) (byte) 100, (-1), "hi!", ": , start date: null, end date: null", localDate7, localDate8, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test246");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, ": , start date: null, end date: null", "hi!", localDate7, localDate8, "");
        course10.setCourseName(": , start date: null, end date: null");
        course10.setCourseId((int) ' ');
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test247");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        java.lang.String str15 = course10.getTextbook();
        course10.setStudentId2(10);
        course10.setCourseName(": : , start date: null, end date: null, start date: null, end date: null");
        course10.setCourseId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test248");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        int int14 = course10.getStudentId1();
        java.time.LocalDate localDate15 = course10.getStartDate();
        java.lang.String str16 = course10.getTextbookStatus();
        course10.setStudentId3(1);
        int int19 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test249");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) 'a', (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, ": , start date: null, end date: null", ": , start date: null, end date: null", localDate7, localDate8, "hi!");
        course10.setStudentId1((int) '4');
        java.time.LocalDate localDate13 = null;
        course10.setEndDate(localDate13);
        course10.setStudentId3((-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test250");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        course10.setStudentId1((int) (byte) 1);
        course10.setTextbook("");
        int int18 = course10.getFacultyId();
        course10.checkTextStatus();
        course10.setCourseId((int) '#');
        course10.setStudentId1((int) (byte) -1);
        java.lang.String str24 = course10.getTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test251");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getStudentId2();
        java.time.LocalDate localDate14 = null;
        course10.setStartDate(localDate14);
        java.time.LocalDate localDate16 = course10.getEndDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test252");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        int int18 = course10.getStudentId2();
        userTypes.Observer observer19 = course10.Observer();
        java.time.LocalDate localDate20 = course10.getEndDate();
        course10.setTextbook("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(observer19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test253");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.lang.String str18 = course10.getTextbook();
        course10.checkTextStatus();
        course10.setTextbookStatus("");
        course10.setCourseId((int) (short) 0);
        java.time.LocalDate localDate24 = null;
        course10.setStartDate(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test254");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        course10.setCourseId((int) (short) 1);
        int int15 = course10.getStudentId2();
        int int16 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test255");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        int int14 = course10.getStudentId2();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test256");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        int int13 = course10.getFacultyId();
        java.lang.String str14 = course10.getCourseName();
        course10.setTextbook("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test257");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        boolean boolean15 = course10.isTextAvail();
        course10.setTextAvail(true);
        java.lang.String str18 = course10.getNewEditionMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test258");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(100, 10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, ": , start date: null, end date: null", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setEndDate(localDate11);
        course10.setTextbookStatus("hi!: , start date: null, end date: null");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test259");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (short) 1, (int) (byte) 0, (int) (short) 1, 0, 0, ": : , start date: null, end date: null, start date: null, end date: null", "", localDate7, localDate8, ": : , start date: null, end date: null, start date: null, end date: null");
        int int11 = course10.getCourseId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test260");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getCourseName();
        java.lang.String str14 = course10.getNewEditionMessage();
        int int15 = course10.getStudentId3();
        int int16 = course10.getStudentId3();
        // The following exception was thrown during execution in test generation
        try {
            course10.notifyObserver("hi!: , start date: null, end date: null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userTypes.Observer.update(String)\" because \"this.observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test261");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (short) 0, (int) (short) 100, 0, 100, 0, "hi!: , start date: null, end date: null", ": : , start date: null, end date: null, start date: null, end date: null", localDate7, localDate8, ": , start date: null, end date: null");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test262");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        int int20 = course10.getCourseId();
        course10.setTextbook("");
        course10.setFacultyId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test263");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course(52, 10, (int) (short) 1, (int) ' ', 100, "hi!", "hi!", localDate7, localDate8, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test264");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        java.time.LocalDate localDate15 = course10.getStartDate();
        course10.setFacultyId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test265");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        course10.setTextbookStatus("");
        java.lang.String str13 = course10.getTextbook();
        java.time.LocalDate localDate14 = course10.getEndDate();
        int int15 = course10.getStudentId3();
        course10.setStudentId2((int) (byte) 10);
        java.time.LocalDate localDate18 = course10.getStartDate();
        int int19 = course10.getStudentId2();
        course10.setCourseId((int) (short) 100);
        java.lang.String str22 = course10.getCourseName();
        int int23 = course10.getFacultyId();
        course10.setTextAvail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test266");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) -1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, "", "hi!", localDate7, localDate8, "");
        java.time.LocalDate localDate11 = null;
        course10.setStartDate(localDate11);
        java.time.LocalDate localDate13 = null;
        course10.setStartDate(localDate13);
        java.time.LocalDate localDate15 = null;
        course10.setStartDate(localDate15);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseTest.test267");
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        course.Course course10 = new course.Course((int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100, "hi!", "", localDate7, localDate8, "hi!");
        java.time.LocalDate localDate11 = course10.getEndDate();
        java.time.LocalDate localDate12 = null;
        course10.setEndDate(localDate12);
        int int14 = course10.getCourseId();
        course10.setStudentId1((int) '4');
        int int17 = course10.getFacultyId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}
