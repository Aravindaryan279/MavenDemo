package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class ParameterizedEx {

 @ParameterizedTest
 @ValueSource(ints= {2,8,10,4,24} )

 
 
 public void test_intArray1(int arg) {
  System.out.println(" args: "+arg);
  Assertions.assertTrue(arg%2==0);
  
  
 }
 public void checkForarray()
 {
  Integer intArray[] = {2,3,7,10};
  Assertions.assertAll();
 }

}

