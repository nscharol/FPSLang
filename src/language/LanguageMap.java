package language;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrowland on 11/19/2017 for FPSLang.
 */

public class LanguageMap {
    private Map<String, String> langMap;
    private Map<String, String> varMap;

    public LanguageMap() {
        langMap = new HashMap<>();
        varMap = new HashMap<>();

        langMap.put("forward", "add");
        langMap.put("back" , "subtract");
        langMap.put("jump", "multiply");
        langMap.put("crouch", "divide");
        langMap.put("zerg", "power");
        langMap.put("spawn", "print");
        langMap.put("$", "comment");
        langMap.put("/$", "endComment");
        langMap.put("newPlayer", "newVar");
        langMap.put("changePlayer" , "updateVar");
        langMap.put("levelUp", "power");
    }

    public String getValueForMapKey(String key) {
        if (languageMapContainsKey(key))
            return langMap.get(key);
        if (variableMapContainsKey(key))
            return varMap.get(key);
        throw new IllegalArgumentException("");
    }

    public void addToVariableMap(String key, String value) {
        varMap.put(key, value);
    }

    public void updateVariableInVariableMap(String key, String value) {
        varMap.replace(key, value);
    }

    public boolean languageMapContainsKey(String key) {
        return langMap.containsKey(key);
    }

    public boolean variableMapContainsKey(String key) {
        return varMap.containsKey(key);
    }

}
