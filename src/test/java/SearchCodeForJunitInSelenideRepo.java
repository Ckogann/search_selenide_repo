import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchCodeForJunitInSelenideRepo {
    @Test
    void searchJunitCodeInGithub() {
        open ("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Layout-sidebar").$(withText("more page")).click();
        $(".Layout-sidebar").$(byText("SoftAssertions")).click();
        $(byText("Using JUnit5 extend test class:")).parent().sibling(0)
                .shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}