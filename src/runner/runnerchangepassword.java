package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="ChangePasswordFeature", glue= "stepChangePassword")
public class runnerchangepassword {

}
