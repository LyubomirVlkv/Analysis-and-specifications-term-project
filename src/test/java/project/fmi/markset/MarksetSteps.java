package project.fmi.markset;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.fmi.markset.model.MarkSetModel;
import project.fmi.models.Lecturer;

public class MarksetSteps {
	private MarkSetModel model;
	
	@Given("^учителят по предмета отваря екрана за нанасяне на оценка по предмета$")
	public void openSubjectScreen()  {
	    model = new MarkSetModel();
	   
	}
	
	/* @Given("^Въведе \"([^\"]*)\" предмет, по който ще сложи оценка$")
	public void въведе_предмет_по_който_ще_сложи_оценка(String subjectName) throws Throwable {
	    model.setSubjectName(subjectName);
	}
	*/
	
	@Given("^Въведе предмет, по който ще сложи оценка$")
	public void въведе_предмет_по_който_ще_сложи_оценка() throws Throwable {
	    model.setSubjectName("Physics");
	}

	@Given("^Въведе грешен предмет, по който ще сложи оценка$")
	public void въведе_грешен_предмет_по_който_ще_сложи_оценка() throws Throwable {
	    model.setSubjectName("Chemistry");
	}
	
	/*@Given("^Въведе \"([^\"]*)\" потребителското си име$")
	public void въведе_потребителското_си_име(String username) throws Throwable {
		model.setUsername((username));
	}
	*/
	@Given("^Въведе потребителското си име$")
	public void въведе_потребителското_си_име() throws Throwable {
	    model.setUsername("i.ivanov");
	}

	@Given("^Въведе грешно потребителското си име$")
	public void въведе_грешно_потребителското_си_име() throws Throwable {
	    model.setUsername("v.simeonov");
	}

	
	
	@When("^Въведе (\\d+) като оценка$")
	public void въведе_като_оценка(int mark) throws Throwable {
	    model.setSubjectMark(mark);
	}


	@When("^натисне бутона за запазване на оценката$")
	public void clickSaveButton() throws Throwable {
	    model.clickSaveButton();
	}
	

	
	@Then("^вижда \"([^\"]*)\"$")
	public void вижда(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, model.getMessage());
	}

	


}

