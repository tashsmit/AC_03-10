package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/10/15.
 */

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {

        String bigText = "We must include in any language with which we hope to describe complex data-processing " +
                "situations the capability for describing data. We must also include a mechanism for determining the " +
                "priorities to be applied to the data. These priorities are not fixed and are indicated in many cases" +
                " by the data. Thus we must have a language and a structure that will take care of the data " +
                "descriptions and priorities, as well as the operations we wish to perform. If we think seriously about " +
                "these problems, we find that we cannot work with procedures alone, since they are sequential. We need to " +
                "define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has " +
                "been studying the structure of languages that can be used to describe data-processing problems. The Group " +
                "started out by trying to design a language for stating procedures, but soon discovered that what was really " +
                "required was a description of the data and a statement of the relationships between the data sets. The Group " +
                "has since begun writing an algebra of processes, the background for a theory of data processing. Clearly, " +
                "we must break away from the sequential and not limit the computers. We must state definitions and provide " +
                "for priorities and descriptions of data. We must state relationships, not procedures.";

        String smallWord;
        int wordCount = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("What world would you like to look for?");
        smallWord = input.nextLine();

        for (int i = 0; i < bigText.length() - smallWord.length() + 1; i++) {

            //todo figure this out because you are a genius (sorta)

            if (bigText.charAt(i) == smallWord.charAt(0) && bigText.charAt(i+1) == smallWorld.CharAt && bigText.charAt
                    (i+2) == 't' && bigText.charAt (i+3) == 'a')
                wordCount++;


        }
        System.out.println("The number of times data is in this paragraph: " + wordCount);

    }
}
