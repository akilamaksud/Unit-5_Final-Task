package transformations;

import constants.Languages;
import io.cucumber.java.ParameterType;

public class Transformations {
    @ParameterType("Spanish")
    public Languages language(String languageName) {
        return Languages.valueOf(languageName.toUpperCase());
    }
}
