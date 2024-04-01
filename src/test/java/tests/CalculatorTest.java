package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.CalculatorPage;

import static io.qameta.allure.Allure.step;


public class CalculatorTest extends TestBase {

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка деления")
    void divisionTest() {
        CalculatorPage calculatorPage = new CalculatorPage();
        step("Открываем cтраницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Нажимаем на кнопку с цифрой восемь", () -> {
            calculatorPage.clickEightButton();
        });
        step("Нажимаем на кнопку деления",() -> {
            calculatorPage.clickDivisionButton();
        });
        step("Нажимаем на кнопку с цифрой два",() -> {
               calculatorPage.clickTwoButton();
        });
        step("Нажимаем на кнопку равно",() -> {
                calculatorPage.clickEqualsButton();
        });
        step("Проверяем результат деления",() -> {
                calculatorPage.verifyResult("4");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка деления на ноль")
    void divisionByZeroTest() {
        CalculatorPage calculatorPage = new CalculatorPage();
        step("Открываем страницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Нажимаем на кнопку с цифрой пять", () -> {
            calculatorPage.clickFiveButton();
        });
        step("Нажимаем на кнопку деления", () -> {
            calculatorPage.clickDivisionButton();
        });
        step("Нажимаем на кнопку с нулем", () -> {
            calculatorPage.clickZeroButton();
        });
        step("Нажимаем на кнопку равно", () -> {
            calculatorPage.clickEqualsButton();
        });
        step("Проверяем результат деления", () -> {
            calculatorPage.verifyResult("Infinity");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка двойного деления")
    void doubleDivisionTest() {
        CalculatorPage calculatorPage = new CalculatorPage();
        step("Открываем страницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Нажимаем на кнопку с цифрой девять", () -> {
            calculatorPage.clickNineButton();
        });
        step("Нажимаем на кнопку деления", () -> {
            calculatorPage.clickDivisionButton();
        });
        step("Нажимаем на кнопку с цифрой три", () -> {
            calculatorPage.clickThreeButton();
        });
        step("Нажимаем на кнопку деления", () -> {
            calculatorPage.clickDivisionButton();
        });
        step("Нажимаем на кнопку с цифрой три", () -> {
            calculatorPage.clickThreeButton();
        });
        step("Нажимаем на кнопку равно", () -> {
            calculatorPage.clickEqualsButton();
        });
        step("Проверяем результат деления", () -> {
            calculatorPage.verifyResult("1");
        });
    }
}

