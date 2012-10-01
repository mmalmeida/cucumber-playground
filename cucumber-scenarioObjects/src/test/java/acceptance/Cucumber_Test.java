package acceptance;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		features={"classpath:features"},
		glue = {"cucumber.runtime.java.spring.hooks","acceptance"})
public class Cucumber_Test {

}
