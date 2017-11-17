import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mrowland on 11/15/2017 for FPSLang.
 */

public class LangParser {
    private List<String[]> lineList;
    public LangParser (Scanner file) {
        lineList = new ArrayList<>();
        while(file.hasNextLine()) {
            lineList.add(file.nextLine().split(" "));
        }
    }
}
