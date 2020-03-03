package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="SearchFeature", glue= "stepSearch")
public class runnersearch {
	
}
