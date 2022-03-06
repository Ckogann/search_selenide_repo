package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int NUMBER = 68;

    @Test
    public void lambdaLabelsStepTest() {
    }

    @Test
    @Owner("eroshenkoam")
    @Feature("Issues")
    @Story("Создание Issue со страницы репозитория")
    @DisplayName("Создание Issue для авторизованного юзера")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://github.com")
    public void annotatedLabelsTest() {
    }
}