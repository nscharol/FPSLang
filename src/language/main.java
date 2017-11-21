package language;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mrowland on 11/15/2017 for FPSLang.
 */

public class main {
    public static Stack<Integer> operatingStack = new Stack<>();
    public static LanguageMap languageMap;

    public static void main (String[] args) {
        languageMap= new LanguageMap();

        String filepath = "sourceFile.txt";

        Scanner sourceFile = null;
        try {
            sourceFile = new Scanner(new File(filepath));
        } catch (FileNotFoundException exception) {
            System.out.println("File not found. " + exception);
        }

        assert (sourceFile != null);

        LanguageParser parser = new LanguageParser(sourceFile);

        while (parser.hasNextLine()) {
            String[] currentLine = parser.getNextLine();
            if (languageMap.getValueForMapKey(currentLine[0]) == "comment")
                continue;
            else for (int i = 0; i < currentLine.length; i++) {
                evaluateNextOperation(currentLine[i]);
            }
        }

    }

    public static Integer testIfStringIsInteger (String str) {
        Integer intTest = null;
        try {
            intTest = new Integer(str);
        } catch (NumberFormatException exception) {

        }

        return intTest;

    }

    public static String evaluateNextOperation(String key) {

        int currentStackContents = operatingStack.size();

        Integer integer = new Integer(testIfStringIsInteger(key));

        if (integer != null) {
            operatingStack.push(integer);
        } else {

            switch (languageMap.getValueForMapKey(key)) {
                case "-":
                    //subtract();

                    break;
                case "+":
                    //add();

                    break;
                default:

            }

        }

        String lastOperation = key;
        return lastOperation;
    }
}
