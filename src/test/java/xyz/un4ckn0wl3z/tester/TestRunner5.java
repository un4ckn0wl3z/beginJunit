package xyz.un4ckn0wl3z.tester;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner5 {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJunit5ExtendResult.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  	
