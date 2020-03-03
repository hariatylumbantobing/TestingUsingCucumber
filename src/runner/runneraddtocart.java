package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="AddToCartFeature", glue= "stepAddToCart")
public class runneraddtocart {

}
