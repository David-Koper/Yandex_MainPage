package tests;


import com.codeborne.selenide.Driver;
import helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {
    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://yandex.ru/'", () ->
                open("https://yandex.ru/"));

        step("Page title should have text 'Яндекс'", () -> {
            String expectedTitle = "Яндекс";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://yandex.ru/'", () ->
                open("https://yandex.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}

