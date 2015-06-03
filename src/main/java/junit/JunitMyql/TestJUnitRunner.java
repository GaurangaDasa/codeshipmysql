package junit.JunitMyql;


import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestJUnitRunner {

	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(TestJUnit.class);
		List<Failure> li = rs.getFailures();
		for(Failure f : li) {
			System.out.println(f.getMessage());
			System.out.println(f);
		}
		System.out.println(rs.wasSuccessful());
		
	//	System.out.println( System.getenv("PATH") );

	}

}
