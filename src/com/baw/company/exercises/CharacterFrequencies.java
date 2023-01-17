package com.baw.company.exercises;

public class CharacterFrequencies {


//    if we have to use array only
//
//   -create array of length = 127 .. so that each
//    index represent one char .. the value of the
//    item in each index is the frequency of the char
//
//   -for each char in the text, find the proper
//    index by getting the ASCII decimal code for
//    the char then increase the item value by 1
//
//   - print the array


//    Inputs: text [ASCII letters only]
//    Output: the frequency of each unique character
//
//    Example:
//
//    inputs: "internet"
//
//    output:i n t e r
//           1 2  2 2 1
//
//    Example:
//
//    inputs: "hello world"
//
//    outputs:h e  l o w r d
//             1  1 3 2 1 1 1  1



    public void ASCIIMethod (String massage){

        System.out.println("ASCIIMethod");

        int [] frequencies =new int[127];

        for (int i =0 ;i<massage.length(); i++){

            int current_code=massage.charAt(i);
            frequencies[current_code]++;

        }

        for (int i =0;i < frequencies.length; i++) {

            if (frequencies[i] > 0) {
                char character=(char) i;
                System.out.println(character +" " + frequencies[i]);
            }
        }


    }

    public static void main(String[] args) {

        CharacterFrequencies cf=new CharacterFrequencies();
        String massage="hello world";
        cf.ASCIIMethod(massage);



    }

}
