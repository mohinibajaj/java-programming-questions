package org.example;


//print all the even words in a string i.e. String = "Mohini Bajaj"
// where Mohini is an EVEN word and Bajaj is an ODD word

public class EvenWordsInString {
        public static void main(String[] args) {

            String s = "JAVA is my favourite lang";

            String data[] = s.split(" ");

            //  System.out.println(data[]);

            for (String word : data) {

                int length = word.length();
                if (length % 2 == 0) {
                    System.out.println(word);
                }
            }


        }
}
