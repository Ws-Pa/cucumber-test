package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DodawanieSteps {

    Calculator calculator;
    double wynik;

    @Given("Uzytkownik ma kalkulator")
    public void uzytkownik_ma_kalkulator() {
        calculator = new Calculator();
    }

    @When("Uzytkownik dodaje liczby {int} i {int}")
    public void uzytkownik_dodaje_liczby_i(Integer int1, Integer int2) {
        wynik = calculator.add(int1, int2);
    }

    @Then("Uzytkownik otrzymuje wynik {int}")
    public void uzytkownik_otrzymuje_wynik(Integer int1) {
        Assert.assertEquals(int1, wynik, 0);
        System.out.println("Wynik " + int1 + " jest prawidłowy.");
    }

    @When("Uzytkownik wpisuje pierwsza wartosc {int}")
    public void uzytkownik_wpisuje_pierwsza_wartosc(Integer int1) {
       calculator.setA(int1);
    }

    @When("Uzytkownik wpisuje druga wartosc {int}")
    public void uzytkownik_wpisuje_druga_wartosc(Integer int1) {
       calculator.setB(int1);
    }

    @When("Uzytkownik uruchamia dodawanie")
    public void uzytkownik_uruchamia_dodawanie() {
        wynik = calculator.add();
    }

}
