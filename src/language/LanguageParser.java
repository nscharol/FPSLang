package language;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mrowland on 11/15/2017 for FPSLang.
 */

public class LanguageParser {
    private List<String[]> lineList;
    private int currentLine = -1;

    public LanguageParser(Scanner file) {
        lineList = new ArrayList<>();
        while(file.hasNextLine()) {
            lineList.add(file.nextLine().split("[\n\t ]"));
        }
    }

    public int numberOfLines() {
        return lineList.size();
    }

    public String[] getNextLine() {
        currentLine++;
        return lineList.get(currentLine);
    }

    public boolean hasNextLine() {
        return (currentLine++ <= lineList.size()-1);
    }
}
