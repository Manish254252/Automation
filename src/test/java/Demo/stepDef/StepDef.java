package Demo.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;



public class StepDef {
    private int result;


    @Given("User wants to add")
    public void user_wants_to_add() {

        System.out.println("done");
    }
    @When("Add {int} and {int}")
    public void add_and(int int1, int int2) {

        result=int1+int2;
    }
   
    @Given("User wants to Sub")
    public void userWantsToSub() {
        System.out.println("Subtraction");
    }

    @When("Sub {int} and {int}")
    public void subAnd(int arg0, int arg1) {
        result = arg0-arg1;
    }

    

    @Given("User wants to Multi")
    public void userWantsToMult() {
        System.out.println("Multiplication");
    }

    @When("Multi {int} and {int}")
    public void multAnd(int arg0, int arg1) {
       
      result=arg0*arg1;
    }

    @Then("It should return {int}")
    public void itShouldReturn(int arg0) {
        System.out.println(result);
        assertEquals(arg0,result);
    }

   

    @Given("User wants to Divide")
    public void userWantsToDivide() {
        System.out.println("Divide");
    }

    @When("Divide {int} and {int}")
    public void divideAnd(int arg0, int arg1) {
        result=arg0/arg1;
    }

   
}
