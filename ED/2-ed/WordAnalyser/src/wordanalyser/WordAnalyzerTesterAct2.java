/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordanalyser;

/**
 *
 * @author rutvac
 */
public class WordAnalyzerTesterAct2
{
    public static void main(String[] args)
    {
        test("mississippiii"); // expect: 4 (ss, ss, pp, iii)
        test("test"); // expect: 0 (no repeated letters)
        test("aaaaabbcdaaaaaabbbb"); // expect: 4 (aa, bb, aaaa, bb)
    }

    public static void test(String s)
    {
        WordAnalyser_1 wa = new WordAnalyser_1(s);
        int result = wa.countRepeatedCharacters();
        System.out.println(result + " repeated characters.");
    }
}