package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParametersTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int NUMBER = 68;

    @Test
    public void parametersTest() {
        Allure.parameter("Город", "Москва");
        Allure.parameter("Регион", "МО");
    }

}