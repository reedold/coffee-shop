package leetcode;

public class AddBinary {
    public static void main(String[] args) {
String s = "Hello   World  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
s = s.trim();
int lastSpace = s.lastIndexOf(" ");
return s.length()-1- lastSpace;
}}
