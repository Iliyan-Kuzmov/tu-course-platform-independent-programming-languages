import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class upr1 {

    public static String[] justifyText(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int  i =0;
        while(i < words.length){
            int j = i;
            int currLineLength = 0;
            currLineLength = words[i].length();
            j++;
            while(j < words.length){
                if (currLineLength + 1 + words[j].length() <= maxWidth){
                    currLineLength += 1+words[j].length();
                    j++;
                }
                else{
                    break;
                }
            }
            List<String> currLineWords = new ArrayList<>();
            for (int k = i; k < j;k++){
                currLineWords.add(words[k]);

            }
            int wordsLength = currLineWords.stream().mapToInt(String::length).sum();
            boolean isLastLine = (j == words.length);
            boolean isSingleWordLine = (currLineWords.size() == 1);
            if (isLastLine || isSingleWordLine){
                result.add(formatLeftJustified(currLineWords, maxWidth));

            }
            else {
              
                result.add(formatFullyJustified(currLineWords, wordsLength, maxWidth));
            }

            
            i = j;
        }

        return result.toArray(new String[0]);

        }

    
    private static String formatLeftJustified(List<String> lineWords, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        // Добавяме думите с един интервал между тях.
        for (int k = 0; k < lineWords.size(); k++) {
            sb.append(lineWords.get(k));
            if (k < lineWords.size() - 1) {
                sb.append(" ");
            }
        }
        
        // Допълваме до maxWidth с интервали отдясно.
        int padding = maxWidth - sb.length();
        for (int k = 0; k < padding; k++) {
            sb.append(" ");
        }
        
        return sb.toString();
    }
    private static String formatFullyJustified(List<String> lineWords, int wordsLength, int maxWidth) {
        // Брой интервални "междини" между думите.
        int gaps = lineWords.size() - 1;
        // Общ брой интервали, които трябва да се вмъкнат.
        int totalSpaces = maxWidth - wordsLength;

        // Брой основни интервали за всяка междина (минимум).
        int spacesPerGap = totalSpaces / gaps;
        // Брой допълнителни интервали, които трябва да се разпределят отляво надясно (остатък).
        int extraSpaces = totalSpaces % gaps;
        
      
        
        StringBuilder sb = new StringBuilder();
        
        for (int k = 0; k < lineWords.size(); k++) {
            sb.append(lineWords.get(k));
            
            if (k < lineWords.size() - 1) {
               
                int currentSpaces = spacesPerGap;
                
                if (k < extraSpaces) {
                    currentSpaces++; 
                }
                
                
                for (int l = 0; l < currentSpaces; l++) {
                    sb.append(" ");
                }
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String[] words = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
        int maxWidth = 11;

        System.out.println("Input Words: " + String.join(", ", words));
        System.out.println("Max Width: " + maxWidth);
        System.out.println("--- Formatted Text ---");

        String[] justifiedText = justifyText(words, maxWidth);

        for (String line : justifiedText) {
            System.out.println("\"" + line + "\" (Length: " + line.length() + ")");
        }

        System.out.println("----------------------\n");

        // Допълнителен пример
        String[] words2 = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth2 = 16;
        
        System.out.println("Input Words: " + String.join(", ", words2));
        System.out.println("Max Width: " + maxWidth2);
        System.out.println("--- Formatted Text ---");

        String[] justifiedText2 = justifyText(words2, maxWidth2);

        for (String line : justifiedText2) {
            System.out.println("\"" + line + "\" (Length: " + line.length() + ")");
        }
        System.out.println("----------------------");
    }

    
}