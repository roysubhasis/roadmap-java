package practise.interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFinder{

  static boolean isAnagram(String str1, String str2){

    if(str1.length()==str2.length()){
      char[] temp1  =str1.toCharArray();
      char[] temp2  =str2.toCharArray();
      Arrays.sort(temp1);
      Arrays.sort(temp2);
      return Arrays.equals(temp1,temp2);
    }else{
      return false;
    }
  }

  static void findAnagrams(String[] arr, int arrLength)
  {
    List<String> lst = new ArrayList<String>();
    for (int i = 0; i < arrLength; i++) {
      for (int j = i + 1; j < arrLength; j++) {
        if (arr[i].length() == arr[j].length())
          if (isAnagram(arr[i], arr[j])) {
            System.out.println(arr[i] + " is anagram of " + arr[j]);
            lst.add(arr[i]);
            lst.add(arr[j]);
          }
      }
    }
    System.out.println("lst :" +lst);
  }


  public static void main(String[] args)
  {
    String[] myArray = {"cheap", "trap", "peach", "part", "tap", "pat", "tarp" };
    // output should be like --> "cheap, peach, trap, part, tarp, tap, pat"
    int arrLength = myArray.length;
    findAnagrams(myArray, arrLength);
  }
}
