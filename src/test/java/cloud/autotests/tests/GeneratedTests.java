package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Вкусвилл")
    void generatedTest() {
        step("открыть https://vkusvill.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("проверить, что на странице в шапке есть слово вкусвилл", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://vkusvill.ru/'", () ->
            open("https://vkusvill.ru/"));

        step("Page title should have text 'ВкусВилл — интернет-магазин продуктов для здорового питания с доставкой на дом | Москва и область'", () -> {
            String expectedTitle = "ВкусВилл — интернет-магазин продуктов для здорового питания с доставкой на дом | Москва и область";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://vkusvill.ru/'", () ->
            open("https://vkusvill.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}