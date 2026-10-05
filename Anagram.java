import java.util.Arrays;
import java.util.Scanner;

class Anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char a[] = word1.toCharArray();
        char b[] = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
        {
            System.out.println("Both words are Anagram");
        }
        else
        {
            System.out.println("Both words are not Anagram");
        }

        sc.close();
    }
}
    

