package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.CalculatorPage;
import static io.qameta.allure.Allure.step;


public class CalculatorTest extends TestBase {
    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка деления целого числа на другое целое число")
    void divisionTest() {
        step("Открываем cтраницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 8 на 2", () -> {
            calculatorPage.clickEightButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickTwoButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверяем результат деления", () -> {
            calculatorPage.verifyResult("4");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка деления на ноль")
    void divisionByZeroTest() {
        step("Открываем страницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 5 на 0", () -> {
            calculatorPage.clickFiveButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickZeroButton();
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
        step("Открываем страницу с калькулятором", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 9 на 3 и еще раз на 3", () -> {
            calculatorPage.clickNineButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickThreeButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickThreeButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверяем результат деления", () -> {
            calculatorPage.verifyResult("1");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление числа с плавающей точкой на целое число")
    void divisionOfFloatingPointNumberByIntegerTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 5.5 на 2", () -> {
            calculatorPage.clickFiveButton();
            calculatorPage.clickCommaButton();
            calculatorPage.clickFiveButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickTwoButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат деления", () -> {
            calculatorPage.verifyResult("2.75");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление числа с плавающей точкой на другое число с плавающей точкой")
    void divisionOfFloatingPointNumberByAnotherTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 7.5 на 1.5", () -> {
            calculatorPage.clickSevenButton();
            calculatorPage.clickCommaButton();
            calculatorPage.clickFiveButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickOneButton();
            calculatorPage.clickCommaButton();
            calculatorPage.clickFiveButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат", () -> {
            calculatorPage.verifyResult("5");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление числа на очень маленькое число, близкое к нулю")
    void divisionByVerySmallNumberTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 1 на 0.0001", () -> {
            calculatorPage.clickOneButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickCommaButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickOneButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат деления", () -> {
            calculatorPage.verifyResult("10000");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление очень большого числа на очень маленькое число")
    void divisionOfVeryLargeNumberByVerySmallNumberTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 1000000 на 0.00001", () -> {
            calculatorPage.clickOneButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickCommaButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickZeroButton();
            calculatorPage.clickOneButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат деления", () -> {
            calculatorPage.verifyResult("100000000000");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление отрицательного числа на положительное")
    void divisionOfNegativeNumberByPositiveNumberTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление -8 на 2", () -> {
            calculatorPage.clickSubtractionButton();
            calculatorPage.clickEightButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickTwoButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат деления", () -> {
            calculatorPage.verifyResult("-4");
        });
    }

    @Test
    @Owner("Denis Nikitin")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Деление положительного числа на отрицательное")
    void divisionOfPositiveNumberByNegativeNumberTest() {
        step("Открыть страницу калькулятора", () -> {
            calculatorPage.openCalculator();
        });
        step("Выполнить деление 8 на -2", () -> {
            calculatorPage.clickEightButton();
            calculatorPage.clickDivisionButton();
            calculatorPage.clickSubtractionButton();
            calculatorPage.clickTwoButton();
            calculatorPage.clickEqualsButton();
        });
        step("Проверить результат деления", () -> {
            calculatorPage.verifyResult("-4");
        });
    }
}