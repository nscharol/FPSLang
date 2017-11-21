package language;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrowland on 11/19/2017 for FPSLang.
 */

public class LanguageMap {
    private Map<String, String> langMap;

    public LanguageMap () {
        langMap = new HashMap<>();

        langMap.put("forward", "add");
        langMap.put("back" , "subtract");
        langMap.put("jump", "multiply");
        langMap.put("crouch", "divide");
        langMap.put("spawn", "print");
        langMap.put("$", "comment");
    }

    public String getValueForMapKey(String key) {
        return langMap.get(key);
    }

    public void addVariableToMap (String key, String value) {
        langMap.put(key, value);
    }

    public void updateVariableInMap (String key, String value) {
        langMap.replace(key, value);
    }

}
