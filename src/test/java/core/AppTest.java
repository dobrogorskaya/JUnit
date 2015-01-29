package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

@BeforeClass
public static void BeforeClass() throws Exception {
System.out.println("BeforeClass method will be executed before first test method starts");
       }

@AfterClass
public static void AfterClass() throws Exception {
System.out.println("AfterClass method will be executed after last test method completed");
       }

@Before
public void Before() throws Exception {
       System.out.println("Before method will execute before every test method");
       }

@After
public void After() throws Exception {
       System.out.println("After method will execute after every test method");
       }

@Test 
public void Test_01_assertEquals_Positive() {
       System.out.println("Test_01_assertEquals_Positive");
       String s = "ok";
   	assertEquals("test case failure - strings are not equal","ok","ok");
}

@Test
public void Test_02_assertEquals_Negative() {
       System.out.println("Test_02_assertEquals_Negative");
       String s = "ok";
   	assertEquals("test case failure - strings are not equal","ok","ooook");
       }

@Ignore
@Test
public void Test_03_assertEquals_Ignored() {
       System.out.println("Test_03_assertEquals_Ignored");
       String s = "ok";
   	assertEquals("test case failure - strings are not equal","ok","b");
       }

@Test
public void Test_04_AssertSame_Positive() {
       System.out.println("Test_04_AssertSame_Positive");
       int i = 1;
      	assertEquals("test case failure - should be same",1,1);
       }

@Test
public void Test_05_AssertSame_Negative() {
       System.out.println("Test_05_AssertSame_Negative");
       int i = 1;
     	assertEquals("test case failure - should be same",1,2);
       }

@Ignore
@Test
public void Test_06_AssertSame_Ignored() {
       System.out.println("Test_06_AssertSame_Ignored");
       int i = 1;
    	assertEquals("test case failure - should be same",1,1000);
       }

@Test
public void Test_07_assertFalse_Positive() {
       System.out.println("Test_07_assertFalse_Positive");
       boolean b = false;
      	assertEquals("test case failure - should be false", false,false);
       }

@Test
public void Test_08_assertFalse_Negative() {
       System.out.println("Test_08_assertFalse_Negative");
       boolean b = false;
     	assertEquals("test case failure - should be false",false,true);
       }

@Test
public void Test_09_assertTrue_Positive() {
       System.out.println("Test_09_assertTrue_Positive");
       boolean bo = true;
     	assertEquals("test case failure - sshould be true ",true,true);
       }

@Test
public void Test_10_assertTrue_Negative() {
       System.out.println("Test_10_assertTrue_Negative");
       boolean bo = true;
     	assertEquals("test case failure - should be true",true, false);
       }
}

