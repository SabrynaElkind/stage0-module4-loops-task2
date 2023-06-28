package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

       StringBuilder str = new StringBuilder();

       for (int i = 0; i<chars.length; i++){
           str.append(chars[i]);
       }
          String sentence = str.toString();
        System.out.print(sentence);

    }
}
