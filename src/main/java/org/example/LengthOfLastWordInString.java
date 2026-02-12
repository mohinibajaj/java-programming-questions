package org.example;

public class LengthOfLastWordInString {
        public static void main(String[] args) {

            String s = "  HELLO  MOHINI BAJAJ  ";
            System.out.println(s);
            int count = 0;
            String s1 = s.trim();
            System.out.println("trimmed string " + s1);

            char array[] = s1.toCharArray();

            //  for (int i = array.length -1; i > = 0 ; i--)
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] != ' ')
                {
                    count ++ ;
                }
                else break;
                }

            System.out.println("count for last word    : " + count);

        }
        }

