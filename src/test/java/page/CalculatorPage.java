package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class CalculatorPage {
    private final SelenideElement zeroButton = $x("//td[@role='none']//div[text()='0']");
    private final SelenideElement oneButton = $x("//td[@role='none']//div[text()='1']");
    private final SelenideElement twoButton = $x("//td[@role='none']//div[text()='2']");
    private final SelenideElement threeButton = $x("//td[@role='none']//div[text()='3']");
    private final SelenideElement fourButton = $x("//td[@role='none']//div[text()='4']");
    private final SelenideElement fiveButton = $x("//td[@role='none']//div[text()='5']");
    private final SelenideElement sixButton = $x("//td[@role='none']//div[text()='6']");
    private final SelenideElement sevenButton = $x("//td[@role='none']//div[text()='7']");
    private final SelenideElement eightButton = $x("//td[@role='none']//div[text()='8']");
    private final SelenideElement nineButton = $x("//td[@role='none']//div[text()='9']");
    private final SelenideElement equalsButton = $x("//div[@aria-label='равно']");
    private final SelenideElement additionButton = $x("//div[@aria-label='сложение']");
    private final SelenideElement subtractionButton = $x("//div[@aria-label='вычитание']");
    private final SelenideElement multiplicationButton = $x("//div[@aria-label='умножение']");
    private final SelenideElement divisionButton = $x("//div[@aria-label='деление']");
    private final SelenideElement commaButton = $x("//div[@aria-label='запятая']");

    public CalculatorPage openCalculator() {
        open("search?q=calculator");
        return this;
    }

    public CalculatorPage verifyResult(String expectedValue) {
        $x(String.format("//div[@role='presentation']//*[text()='%s']", expectedValue)).shouldBe(visible);
    return this;
    }

    public CalculatorPage clickZeroButton() {
        zeroButton.click();
        return this;
    }

    public CalculatorPage clickOneButton() {
        oneButton.click();
        return this;
    }

    public CalculatorPage clickTwoButton() {
        twoButton.click();
        return this;
    }

    public CalculatorPage clickThreeButton() {
        threeButton.click();
        return this;
    }

    public CalculatorPage clickFourButton() {
        fourButton.click();
        return this;
    }

    public CalculatorPage clickFiveButton() {
        fiveButton.click();
        return this;
    }

    public CalculatorPage clickSixButton() {
        sixButton.click();
        return this;
    }

    public CalculatorPage clickSevenButton() {
        sevenButton.click();
        return this;
    }

    public CalculatorPage clickEightButton() {
        eightButton.click();
        return this;
    }

    public CalculatorPage clickNineButton() {
        nineButton.click();
        return this;
    }

    public CalculatorPage clickEqualsButton() {
        equalsButton.click();
        return this;
    }

    public CalculatorPage clickAdditionButton() {
        additionButton.click();
        return this;
    }

    public CalculatorPage clickSubtractionButton() {
        subtractionButton.click();
        return this;
    }

    public CalculatorPage clickMultiplicationButton() {
        multiplicationButton.click();
        return this;
    }

    public CalculatorPage clickDivisionButton() {
        divisionButton.click();
        return this;
    }

    public CalculatorPage clickCommaButton() {
        commaButton.click();
        return this;
    }
}