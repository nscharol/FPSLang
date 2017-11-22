package language;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mrowland on 11/15/2017 for FPSLang.
 */

public class LanguageParser {
    private List<String> tokenList;
    // private List<String[]> lineList;
    private int currentTokenIndex = -1;

    public LanguageParser(Scanner file) {
        tokenList = new ArrayList<>();
        /*while(file.hasNextToken()) {
            lineList.add(file.nextLine().split("[\n\t ]"));
        }
         */

        while(file.hasNext())
            tokenList.add(file.next());
    }

    public int numberOfLines() {
        return tokenList.size();
    }

    /*
    public String[] getNextLine() {
        currentTokenIndex++;
        return lineList.get(currentTokenIndex);
    }
    */

    public String getNextToken() {
        currentTokenIndex++;
        return tokenList.get(currentTokenIndex);
    }

    public boolean hasNextToken() {
        return (currentTokenIndex++ <= tokenList.size()-1);
    }

    public int currentTokenIndex() {
        return currentTokenIndex;
    }

}
