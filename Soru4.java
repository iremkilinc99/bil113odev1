import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word: ");
        String word = scanner.nextLine();

        String occurencesIndex = "";
        int occurences = 0;

        for (int i = 0 ; i< sentence.length(); i++) {
            if (sentence.charAt(i) == word.charAt(0)) {
                int currentIndex = i ;
                for(int j = 0; j < word.length(); j++) {
                    if (sentence.charAt(currentIndex) == word.charAt(j)){
                        occurences++;
                    }
                        currentIndex++;
                }
                   if (occurences == word.length()) {
                       occurencesIndex = i + " " + occurencesIndex ;
                   }
                   occurences = 0;
            }
        }

         if(occurencesIndex.length() == 0) {
             System.out.println("-1");
         }else
             for (int i = 0; i < occurencesIndex.length() ; i++) {
                if(occurencesIndex.charAt(i) != ' ')
                 System.out.print(occurencesIndex.charAt(i));
                else
                    System.out.println("");
             }
    }
}
