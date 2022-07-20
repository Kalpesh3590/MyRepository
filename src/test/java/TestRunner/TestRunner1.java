package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src//main//resources//Features1",
//glue= {"stepdefination"})
//public class TestRunner1 
//{
//	
//}
@CucumberOptions(features="src//main//resources//Features1",
glue= {"stepdefination"},
plugin= {"pretty","html:target/htmlreports.html","json:target/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Reports/junit_report.xml"},monochrome= true)
public class TestRunner1 extends AbstractTestNGCucumberTests
{
	
}
