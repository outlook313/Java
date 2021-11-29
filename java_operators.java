
class java_operators
  {
   public static void main(String args[]) 
    {


//Arithmetic Operation
/*Arithmetic operators include addition, subtraction, multiplication, and division. They are indicated by +, -, *, and /. These operations can be used on values of any numeric type: byte, short, int, long, float, or double. When the computer actually calculates one of these operations, the two values that it combines must be of the same type. If your program tells
the computer to combine two values of different types, the computer will convert one of the values from one type to another. For example, to compute 37.4 + 10, the computer will convert the integer 10 to a real number 10.0 and will then compute 37.4 + 10.0. This is called a type conversion. Ordinarily, you don’t have to worry about type conversion in expressions, becausethe computer does it automatically.*/
//example
     int m=10;
     double n=20.0;
     System.out.println("m+n:"+(m+n));//see our output in form of type bouble that is 30.0

//Increment and Decrement Operator
/*adding 1 to a variable is an extremely common operation in programming.
Subtracting 1 from a variable is also pretty common. You might perform the operation of
adding 1 to a variable with assignment statements such as
             
                        counter = counter + 1;

The effect of the assignment statement x = x + 1 is to take the old value of the variable
x, compute the result of adding 1 to that value, and store the answer as the new value of
x. The same operation can be accomplished by writing x++ (or, if you prefer, ++x). This
actually changes the value of x, so that it has the same effect as writing “x = x + 1”. The statement above could be written
                 
                       conter++;
Similarly, you could write x-- (or --x) to subtract 1 from x. That is, x-- performs the same
computation as x = x - 1. Adding 1 to a variable is called incrementing that variable,
and subtracting 1 is called decrementing . The operators ++ and -- are called the increment
operator and the decrement operator, respectively.*/
//example
       
         int x=100;
         System.out.println("X :"+x);
         x++;
         System.out.println("x++:"+x);
         x--;
         System.out.println("x--:"+x);

//Relational operator
/*
Relational operators are used to test
whether two values are equal, whether one value is greater than another, and so forth. The
relational operators in Java are: ==, !=, <, >, <=, and >=. The meanings of these operators are:

    a==b  a"equal to" b?
    a!=b  a"not equal to" b?
    a<b   a "less than" b?
    a>b   a "greater than" b?
    a<=b  a"less than or equal to" b?
    a>=b  a"greater than or equal to" b?   */

//examples

     int a=10;
     int b=20;
         System.out.println("a and b :"+a+" "+b);
         if (a==b)
          {
           System.out.println("a and b are euqal");
           }
        else{
            System.out.println("a and b are not equal");
            }

          if(a>b)
           {
             System.out.println("a is greaterthan b");
           }
         else
            {
             System.out.println("a is not greaterthan b");

             }

//Boolean OPerator

/*
In Java, the boolean operator “and” is represented by &&. The && operator is used to
combine two boolean values. The result is also a boolean value. The result is true if both
of the combined values are true, and the result is false if either of the combined values is
false. For example, “(x == 0) && (y == 0)” is true if and only if both x is equal to 0 and
y is equal to 0.

The boolean operator “or” is represented by ||. (That’s supposed to be two of the vertical
line characters, |.) The expression “A || B” is true if either A is true or B is true, or if both are true. “A || B” is false only if both A and B are false.

*/
//example
          String humidity="HIGH";
          int temperature=50;
          if (humidity=="HIGH" && temperature >= 50)
             {
                System.out.println("You cant play tennis");
             }
          else
             {
               System.out.println("Play tennis");
             }


         String gender="female";
         String background="Computer Science";
         if (gender=="female" || background=="Computer Science")
             {
               System.out.println("You can select BCA course");
             }
        else
             {
                System.out.println("You cant select BCA course");

              }
    }
  }
