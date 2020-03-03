package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features="LoginFeatures", glue= "stepLogin")
public class runnerlogin {

}
