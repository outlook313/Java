public class string_operations
{
public static void main(String[] args) 
  {
   String s0;
   s0 = "Seize the day!";
   System.out.println( "lenght of the string is:"+ s0.length() );

/*s0.length(), as mentioned above, is an integer-valued function that gives the number of
characters in s0*/

/*s1.equals(s2) is a function that returns a boolean value. It returns true if s1 consists
of exactly the same sequence of characters as s2, and returns false otherwise.*/

   String s1="Malayalam";
   String s2="Malayalam";
   if (s1.equals(s2))
    {
     System.out.println("String S1 and s2 are equal");

    }

/*s1.equalsIgnoreCase(s2) is another boolean-valued function that checks whether s1
is the same string as s2, but this function considers upper and lower case letters
to be equivalent. Thus, if s1 is “cat”, then s1.equals("Cat") is false, while
s1.equalsIgnoreCase("Cat") is true.*/

   String str1="MalAyalam";
   String str2="malayalaM";
   if (str1.equalsIgnoreCase(str2))
    {
     System.out.println("String str1 and str2 are equal");

    }

//s1.charAt(N), where N is an integer, returns a value of type char. It returns the N-th character in the string.

   String s3="Festival";
   System.out.println("str:"+s3);
   System.out.println("5th character of str is:"+ s3.charAt(5));



/*s4.substring(N,M), where N and M are integers, returns a value of type String. The
returned value consists of the characters in s1 in positions N, N+1,. . . , M-1. Note that the
character in position M is not included. The returned value is called a substring of s4.*/

      String s4="Good Morning";
      System.out.println(s4.substring(5,12));

/*s5.compareTo(s4) is an integer-valued function that compares the two strings.*/
       
      String s5="Good Morning";
      int res=s5.compareTo(s4);
      if (res==0)
          {
            System.out.println("s4 and S5 are equal");
           }

/*s6.toUpperCase() is a String -valued function that returns a new string that is equal to s1,
except that any lower case letters in s1 have been converted to upper case. For example,
"Cat".toUpperCase() is the string "CAT". There is also a function s6.toLowerCase().*/

       String s6="HELLO JAVA PROGRAMMING";
       System.out.println("After toLowerCase():"+s6.toLowerCase());
       System.out.println("After toLowerCase():"+s6.toUpperCase());

  } 

}
