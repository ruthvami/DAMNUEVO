/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordanalyser;

/**
 *
 * @author rutvac
 */
public class WordAnalyzerTesterAct1
{
    public static void main(String[] args)
    {
        test("aardvark"); // expect: a
        test("roommate"); // expect: o (not m)
        test("mate"); // expect: 0 (no duplicate letters)
        test("test"); // expect: 0 (the t isn't repeating)
    }

    static void test(String text)
    {
        WordAnalyser_1 wa = new WordAnalyser_1(text);
        char result = wa.firstRepeatedCharacter();

        if (result == 0) {
            System.out.println("No repeated character.");
        } else {
            System.out.println("First repeated character = " + result);
        }
    }
}
