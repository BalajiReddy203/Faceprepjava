
JAVA PROGRAMMING
I am just trying to share my knowledge and gather information for our future generations.

HOMEJAVA PROGRAMMINGWHATSAPPLinkedInINSTAGRAMTWITERYOUTUBE
JAVA PROGRAMMING
INDEX
> INPUT & OUTPUT
> OPERATIONS
> DECISION MAKING STATEMENTS-I
> DECISION MAKING STATEMENTS-II
> CONTROL STRUCTURES-I
> CONTROL STRUCTURES-II
> CONTROL STRUCTURES-III
> 1D-ARRAY
> 2D-ARRAY
> STRINGS-I
> SREINGS-II
> RECURSION
> EXCEPTIONAL HANDLING
> CLASS AND OBJECT
> CONSTRUCTOR
> INHERITANCE
> POLYMORPHISM
> ABSTRACTION
> INTERFACE
> ENCAPSULATION
> STRINGS
> COLLECTIONS
> ADDITIONAL PRACTICE QUESTIONS
Input & Output

 Hello World

This is the very first program in the programming language, you have to include an only single header file that is import java.util.Scanner;, this header file contains the declaration of System.out.println()function. System.out.println() is used to display the message as well as the value on the standard output device (monitor), use of printf function is very easy, you have to just pass the string (message) that you want to print on the screen within inverted commas ("message").

Sample Output:

Hello World

Input (stdin)

Output (stdout)

Hello World


Program :-

import java.util.Scanner;

class Main

{

             public static void main(String args[])

             {

             System.out.println("Hello World");

             }

}

Hello World with tab

There are few escape sequences which is used for formatting the output in the programming language,

you have to use \t escape sequence in order to provide 4 to 5 spaces between words in the output console.

Enter the escape sequence directly into the System.out. println() statement's within the inverted commas ("mes\tsage").

Sample Output:

Hello World Hello World

Input (stdin)


Output (stdout)

Hello World        Hello World

 

Program :-

import java.util.Scanner;

class Main{

    public static void main(String args[])

    {

        System.out.println("Hello World\tHello World");

    }

}

Hello World with new line

There are few escape sequences which is used for formatting the output in the programming language,

you have to use \n escape sequence in order to provide a new line between words in the output console.

Enter the escape sequence directly into the System.out.println() statement's within the inverted commas ("mes\nsage").


Sample Output:

Hello World

Hello World

Input (stdin)


Output (stdout)

Hello WorldHello World 

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        System.out.println("Hello World\nHello World");

    }

}

Character Input

Two commonly used functions for I/O (Input/Output) are System.out.println() and System.in(). Write a program to get a character as input and print it. The Scanner class reads formatted input from the keyboard. When the user enters a character, it is stored in the variable test character.

Sample Input:

z

Sample Output:

z

Input (stdin)

a


Output (stdout)

a

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s = new Scanner(System.in);

      char a = s.next().charAt(0);

      System.out.print(a);

    }

}

Integer Input

Java programming has several in-built functions to perform input and output tasks. Two commonly used functions for I/O (Input/Output) are System.out.println() and System.in(). Write a program to get an integer as input and print it. The System.in() function reads formatted input from the keyboard. When the user enters an integer, it is stored in variable testInteger. Format string %d is used in case of integer types. Note the '&' sign before testInteger; &testInteger gets the address of testInteger and the value is stored in that address.


Sample Input:

56

 

Sample Output:

56

Input (stdin)

0


Output (stdout)

0

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s = new Scanner(System.in);

      int a = s.nextInt();

      System.out.print(a);

    }

}

Float Input

Write a program to get float as input and print it. The Scanner class reads formatted input from the keyboard. When the user enters the float value, it is stored in variable testFloat. Use '%.2f' in the System.out.printf() to display float value with 2 precisions.

Sample Input - 1:

56.2425

 

Sample Output - 1:

56.24

 

Sample Input - 2:

92.00

 

Sample Output - 2:

92.00

Input (stdin)

14


Output (stdout)

14.00

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      Float a = s.nextFloat();

      System.out.printf("%.2f",a);

    }

}

String Input

Write a program to get the string as input and print it. When the user enters a string (i.e) char array, it is stored in variable testString.


Sample Input - 1:

Programmer

 

Sample Output - 1:

Programmer

 

Sample Input - 2:

897

 

Sample Output - 2:

897

Input (stdin)

face


Output (stdout)

face

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.next();

      System.out.print(a);        

    }

}

Unicode Values-I

Write a program to get a character as input and print its Unicode value. When a character is entered, the character itself is not stored. Instead, a numeric value(Unicode value) is stored.


Sample Input :

g

Sample Output:

103

Input (stdin)

G


Output (stdout)

71

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      char a = s.next().charAt(0);

      System.out.print((int)a);

    }

}

Unicode Values-II

Write a program to get a number(Unicode values) as input and print its equivalent character. You can display a character if you know ASCII code of that character.


Sample Input:

103

Sample Output:

g

Input (stdin)

71


Output (stdout)

G

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       Scanner s = new Scanner(System.in);

       int a = s.nextInt();

      System.out.print((char)a);

    }

}

OPERATIONS

Sum and Difference

Write a Java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.


Input format:

First input: an integer

Second input: an integer

 

Output format:

First output will be the sum of two integers

Second output will be the difference of two integers

 

Sample Input:

55

34

 

Sample Output:

89

21

Input (stdin)

20
10


Output (stdout)

30
10

 

Input (stdin)

3
2


Output (stdout)

5
1

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    int b = s.nextInt();

    System.out.printf("%d%n", a + b);

    System.out.printf("%d%n", a - b);

  }

}

Product and Division

Write a program to get 2 numbers from the user and calculate their product, quotient,

and remainder using '*', '/' and '%' operators respectively. Print the corresponding product,

quotient and remainder of the numbers as output in the console.


Input format:

First input: an integer

Second input: an integer

 

Output format:

The first output will be the product of two integers

The second output will be the quotient

The third output will be the remainder

 

Sample Input:

50

10

 

Sample Output:

500

5

0

Input (stdin)

11
5


Output (stdout)

55
2
1

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    int b = s.nextInt();

    System.out.printf("%d%n", a * b);

    System.out.printf("%d%n", a / b);

    System.out.printf("%d%n", a % b);

  }

}

Swapping two numbers

Write a java program to get 2 numbers from the user and swap their values without any loss of data.

You can make use of additional variable for swapping.

Print the corresponding swapped values of the two numbers as output in the console.


Input format:

First input: an integer

Second input: an integer

 

Output format:

The output will be integers(swapped values)

 

Sample Input:

20

10

 

Sample Output:

10

20

Input (stdin)

5
10


Output (stdout)

10
5

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    int temp;

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    int b = s.nextInt();

    temp = a;

    a = b;

    b = temp;

    System.out.printf("%d%n",a);

    System.out.printf("%d",b);

  }

}

Swapping two numbers without third variable

Write a java program to swap two values without using the 3rd variable.


Input format:

First input: an integer

Second input: an integer

 

Output format:

The output will be integers(swapped values)

 

Sample Input:

10

20

 

Sample Output:

20

10

Input (stdin)

1
2


Output (stdout)

2
1

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    int b = s.nextInt();

    a = a+b;

    b = a-b;

    a = a-b;

    System.out.printf("%d%n",a);

    System.out.printf("%d",b);

  }

}

Average Calculation

A teacher wants to compute the average of 5 students in her class.

Write a program to help her to find the average.

The average is the sum of all the numbers, then divided by the total numbers.


Input format:

First input: 1st student mark in float

Second input: 2nd student mark in float

Third input: 3rd student mark in float

Fourth input: 4th student mark in float

Fifth input: 5th student mark in float

 

Output format:

The output value should be in float with 2 decimal places.

 

Sample Input:

10 

20

30

40

50

 

Sample Output:

30.00

Input (stdin)

2
5
6
9
10


Output (stdout)

6.00

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    Float a = s.nextFloat();

    Float b = s.nextFloat();

    Float c = s.nextFloat();

    Float d = s.nextFloat();

    Float e = s.nextFloat();

    Float t = (a+b+c+d+e);

    System.out.printf("%.2f",t/5);

  }

}

Area Calculation

Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes.

The three things are in a square shape, rectangular shape, and circular shape respectively. 

Write a program to help Sheela to calculate the area of different shapes.


Input format:

First input: a side of a square in integer

Second input: length of a rectangle in integer

Third input: breadth of a rectangle in integer

Fourth input: radius of a circle in float

 

Output format:

The first output should be the area of a square in integer

The second output should be the area of a rectangle in integer

The third output should be the area of a circle in float with 2 decimal places

 

Sample Input:

5

5

4

2.0

 

Sample Output:

25

20

12.56

Input (stdin)

2
3
6
5.0


Output (stdout)

4
18
78.50

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

     int a=sc.nextInt();

     int b=sc.nextInt();

     int c=sc.nextInt();

     float d=sc.nextFloat();

     double e=(3.14*d*d)*100;

     System.out.println(a*a);

       System.out.println(b*c);

       System.out.printf("%.02f",Math.floor(e)*0.01);

    }

}

Simple Interest

Sara wished to build a new house but she didn't have a sufficient amount.

So, she is planning to borrow some money from the bank on simple interest.

 When she is borrowing some money from the bank, she has to pay back the original

amount accompanied by a certain amount of interest on that amount. She wants to find

the interest for borrowed money within a certain period. Help her to find the simple interest. 


Input format:

The first line containing an integer value denoting the borrowed amount(principal amount)

The second line containing an integer value denoting the period in years

The third line containing the float value denoting the rate of interest

 

Output format:

Print the simple interest in float with 2 decimal places.

 

Sample Input:

15000

2

2.8

 

Sample Output:

840.00

Input (stdin)

3000
2
5.0


Output (stdout)

300.00

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int p = s.nextInt();

    int t = s.nextInt();

    Float r = s.nextFloat();

    Float si = (p*t*r)/100;

    System.out.printf("%f",si);

  }

}

Power of a Number

pow() function is used to calculate the power of any base and it is defined in java.lang.Math package.

Write a program to read X as the base and N as the power and calculate the result (X^N - X to the power of N).


Input format:

The first line containing integer denotes the base(X)

The second line containing integer denotes the power(N)

 

Output format:

Print the power of a number

 

Sample Input:

2

3

 

Sample Output:

8

Input (stdin)

5
6


Output (stdout)

15625

 

Input (stdin)

3
2


Output (stdout)

9

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int b = s.nextInt();

    int e = s.nextInt();

    double pn = Math.pow(b,e);

    System.out.printf("%f",pn);

  }

}

Ternary Operator

The conditional operator is also known as ternary operator [exp? true: false] can be used to make an either-or choice.

 Write a program to get a number from the user and find out whether it is odd or even.


Input format:

The input containing integer denotes the given number 

 

Output format:

If given number is even, print "Even". Otherwise, print "Odd".

 

Sample Input:

5

 

Sample Output:

Odd

Input (stdin)

26


Output (stdout)

Even

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

    {

        int n;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        if(n % 2 == 0)

        {

            System.out.println("Even");

        }

        else

        {

            System.out.println("Odd");

}

    }

}

Fencing The Ground

The college ground is rectangular in shape. Management decides to build a fence around the ground.

In order to help the construction workers to build a straight fence, they planned to place a thick rope around the ground.

They wanted to buy only the exact length of the rope that is needed.

They also wanted to cover the entire ground with a thick carpet during the rainy season.

They wanted to buy only the exact quantity of carpet that is needed. They requested your help.

 Can you please help them by writing a program to find the exact length of the rope and the exact quantity

of carper that is required?


Input Format:

Input consists of 2 integers.

The first integer corresponds to the length of the ground

The second integer corresponds to the breadth of the ground.

 

Output Format:

Output consists of 2 integers.

The first integer corresponds to the exact length of the rope

The second integer corresponds to the exact quantity of carper.

 

Sample Input:

50

20

 

Sample Output:

140m

1000sqm

Input (stdin)

80
20


Output (stdout)

200m
1600sqm

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int l = s.nextInt();

    int b = s.nextInt();

    int r = (2*l)+(2*b);

    int c = l*b;

    System.out.println(""+r+"m");

    System.out.println(""+c+"sqm");

  }

}

spliting into teams

During the Physical Education hour, PT sir has decided to conduct some team games.

He wants to split the students in the class into equal-sized teams.

In some cases, there may be some students who are left out from teams and he wanted to use the left out,

 students, to assist him in conducting the team games. For instance, if there are 50 students in the class and

if the class has to be divided into 7 equal-sized teams, 7 students will be there in each team and 1 student will be left out.

 PT sir asks your help to automate this team splitting task. Can you please help him out?


Input Format:

Input consists of 2 integers.

The first integer corresponds to the number of students in the class.

The second integer corresponds to the number of teams.

 

Output Format:

Output consists of 2 integers.

The first integer corresponds to the number of students in the each team.

The second integer corresponds to the remaining students.

 

Sample Input:

60

8

 

Sample Output:

The number of students in each team is 7 and left out is 4

Input (stdin)

40
6


Output (stdout)

The number of students in each team is 6 and left out is 4

 

Input (stdin)

80
3


Output (stdout)

The number of students in each team is 26 and left out is 2

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int A = s.nextInt();

    int T = s.nextInt();

    int St = A/T;

    int L = (A-(T*St));

    System.out.println("The number of students in each team is "+St+" and left out is "+L+"");

  }

}

3 idiots

Ajay, Binoy, and Chandru were very close friends at school.

They were very good in Mathematics and they were the pet students of Emily Mam.

Their gang was known as 3-idiots. Ajay, Binoy, and Chandru live in the same locality.

A new student Dinesh joins their class and he wanted to be friends with them.

He asked Binoy about his house address. Binoy wanted to test Dinesh's mathematical skills.

Binoy told Dinesh that his house is at the midpoint of the line joining Ajay's house and Chandru's house.

Dinesh was puzzled. Can you help Dinesh out? Given the coordinates of the 2 endpoints of a line (x1,y1) and (x2,y2),

write a  program to find the midpoint of the line.


Input Format:

Input consists of 4 integers.

The first integer corresponds to x1 .

The second integer corresponds to y1.

he third integer corresponds to x2.

he fourth integer corresponds to y2.

 

Output Format:

Refer Sample Input and Output for exact formatting specifications.

[All floating point values are displayed correct to 1 decimal place]

 

Sample Input:

2

4

10

15

 

Sample Output:

Binoy's house is located at (6.0,9.5)

Input (stdin)

5
4
3
2


Output (stdout)

Binoy's house is located at (4.0,3.0)

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int x1 = s.nextInt();

    int y1 = s.nextInt();

    int x2 = s.nextInt();

    int y2 = s.nextInt();

    double A = ((x1+x2)/2.0);

    double B = ((y1+y2)/2.0);

    System.out.println("Binoy's house is located at ("+A+","+B+")");

  }

}

Profit Calculation

Each Sunday, a newspaper agency sells x copies of a certain newspaper for Rs.a per copy.

The cost to the agency of each newspaper is Rs.b. The agency pays a fixed cost for storage,

delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit obtained on Sundays.

 Can you please help them out by writing a program to compute the profit given x, a and b.


Input Format:

Input consists of 3 integers --- x, a and b.

X is the number of copies sold, a is the cost per copy and b is the cost the agency spends per copy.

 

Output Format:

Refer Sample Input and Output for exact formatting specifications.

 

Sample Input:

1000

2

1

 

Sample Output:

The profit obtained is Rs.900

Input (stdin)

300
2
1


Output (stdout)

The profit obtained is Rs.200

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int n = s.nextInt();

    int c = s.nextInt();

    int Si = s.nextInt();

    int p = ((n*c)-(n*Si))-100;

    System.out.println("The profit obtained is Rs."+p+"");

  }

}

Alice in Wonderland

Alice was bored that day, so she was sitting on the riverbank. Suddenly she notices a talking,

White Rabbit with a pocket watch. It ran fast, and she followed it, down a rabbit hole.

She fell into the hole and found a magical wonderland with dark trees, beautiful flowers.

 She found many ways numbered from 1,2,3,........18.she was confused which is the right way

that will lead her to her home. She found a cute bird, standing in one of the trees.

Alice asked the bird the way to go back to her home.

 The bird said a two-digit number( say 23 ) and asked her to find the sum of its digits (2+3=5) and

 that numbered way will lead her to her home. Alice was already confused, so pls help Alice in finding

 the route to her home.


Input Format:

Input consists of an integer corresponding to the 2-digit number.

 

Output Format:

Output consists of an integer corresponding to the sum of its digits.

Refer sample input and output for formatting specifications.

 

Sample Input:

23

 

﻿Sample Output:

Alice must go in path-5

Input (stdin)

26


Output (stdout)

Alice must go in path-8

 

Program :-

import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner s = new Scanner(System.in);

    int b = s.nextInt();

    int Al = ((b%10)+(b/10));

    System.out.println("Alice must go in path-"+Al+"");

  }

}

Decision-making statements - I

Comparing 2 integers

Get two integers x and y from the user and write a program to relate 2 integers as equal to, less than or greater than.


Input format:

Input consist of 2 integers

The first input corresponds to the first number(x)

The second input corresponds to the second number(y)

 

Output format:

If the first number is equal to the second number, print "x and y are equal". Otherwise, print "x greater than y" or "x less than y"

 

Sample Input:

6

8

 

Sample Output:

6 less than 8

 

Input (stdin)

18
10


Output (stdout)

18 greater than 10

 

Input (stdin)

5
3


Output (stdout)

5 greater than 3

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      int a = s.nextInt();

      int b = s.nextInt();

      if(a<b)

      {

      System.out.printf("%d less than %d",a,b);

      }

      else if(a>b)

      {

      System.out.printf("%d greater than %d",a,b);

      }

      else

      {

      System.out.printf("%d and %d are equal",a,b);

      }

    }

}

Checking alphabets

Write a program to check whether the given character is vowel or consonant


Input format:

The input consist of a character

 

Output format:

The output consists of a below-given string 

“Vowel” / “Consonant” / “Not an alphabet”

 

Sample Input:

e

 

Sample Output:

Vowel

Input (stdin)

$


Output (stdout)

Not an alphabet

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      char ch = s.next().charAt(0);

      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))

      {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

        {

          System.out.printf("Vowel");

        }

        else

        {

          System.out.printf("Consonant");

        }

      }

      else

      {

        System.out.printf("Not an alphabet");

      }

    }

}

Anna University Grading System

The newly appointed Vice-Chancellor of Anna University wanted to create an automated grading system

for the students to check their grade. When a student enters a mark, the grading system

displays the corresponding grade. Write a program to solve the given problem.

The grades for marks 100 - S, 90-99 is A, 80-89 is B, 70-79 is C, 60-69 is D, 50-59 is E and less than 50 is F.


Input format:

The input consists of one integer which corresponds to the marks scored by the student

 

Output format:

If a student marks greater than 100, print "Invalid Input". Otherwise, print the grade.

 

Sample Input:

78

 

Sample Output:

C

Input (stdin)

56


Output (stdout)

E

 

Input (stdin)

80


Output (stdout)

B

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      int a = s.nextInt();

      if (a == 100)

      {

        System.out.printf("S");

      }

      else

      {

        if ((a >= 90) && (a <= 99))

        {

          System.out.printf("A");

        }

        else

        {

          if ((a >= 80) && (a <= 89))

          {

            System.out.printf("B");

          }

          else

          {

            if ((a >= 70) && (a <= 79))

            {

              System.out.printf("C");

            }

            else

            {

              if ((a >= 60) && (a <= 69))

              {

                System.out.printf("D");

              }

              else

              {

                if ((a >= 50) && (a <= 59))

                {

                  System.out.printf("E");

                }

                else

                {

                  System.out.printf("F");

                }

              }

            }

          }

        }

      }

    }

}

Profit or loss

A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y.

Write a program to determine the profit or loss in Rs. for the fruitseller.


Input format:

Input consists of 2 floating point numbers

The first input corresponds to the total cost(X)

The second input corresponds to the sold cost(Y)

 

Output format:

Print "Profit or Loss" with Rupees.

 

Sample Input:

60

4

 

Sample Output:

Loss : Rs.12.00

Input (stdin)

100.0
3


Output (stdout)

Loss : Rs.64.00

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        float a=s.nextFloat();

        float b=s.nextFloat();

        if(a>(b*12))

        System.out.printf("Loss : Rs.%.2f",(a-b*12));

        else if(a<(b*12))

        System.out.printf("Profit : Rs.%.2f",(a-b*12));

        else

        System.out.println("No profit nor loss");

    }

}

Fee collection

Write a program to determine the fee amount to be collected from a student.  Refer the table below for fee details. Student Type Student Type denoted as Fee Details   Merit Seat Day Scholar MSDS Tuition fee + Bus fee Merit Seat Hosteller MSH Tuition fee + Hostel fee Management Seat Day Scholar MGSDS 150% of Tuition fee + Bus fee Management Seat Hosteller MGSH 150% of Tuition fee + Hostel fee


Input format:

The first input corresponds to the student type

The second input corresponds to the tuition fee

The third input corresponds to the bus fee

The fourth input corresponds to the hostel fees

 

Output format:

Print the total fee amount of the corresponding student with 2 decimal places. 

Refer below sample output for formatting

 

Sample Input:

MSH

40000

12000

50000

 

Sample Output:

90000.00

Input (stdin)

MSDS
50000
12000
20000


Output (stdout)

62000.00

 

Input (stdin)

MSGH
5000
3000
2000


Output (stdout)

Invalid

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String t = s.next();

      int f = s.nextInt();

      int b = s.nextInt();

      int h = s.nextInt();

      double a = f+b;

      double c = f+h;

      double d = (((f/100)*150)+b);

      double e = (((f/100)*150)+h);

      switch(t){

        case "MSDS":

          System.out.printf("%.2f",a);

          break;

        case "MSH":

          System.out.printf("%.2f",c);

          break;

        case "MGSDS":

          System.out.printf("%.2f",d);

          break;

        case "MGSH":

          System.out.printf("%.2f",e);

          break;

        default:

          System.out.printf("Invalid");

      }

    }

}

Age Detector

Ask a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). Write a program to find the users current age in years.


Input format:

Input consists of 2 integers

he first integer corresponds to the last 2 digits of the birth year

The second integer corresponds to the last 2 digits of the current year

 

Output format:

Print the user's current age

Refer below sample output for formatting.

 

Sample Input:

62

00

 

Sample Output:

38

Input (stdin)

30
23


Output (stdout)

93

 

Input (stdin)

50
20


Output (stdout)

70

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      int a = s.nextInt();

      int b = s.nextInt();

      int c = (100-a)+b;

      int d = b-a;

      if(a>b)

      {

        System.out.printf("%d",c);

      }

      else

      {

        System.out.printf("%d",d);

      }

    }

}

Lab Allocation I

There are 3 labs in the CSE department(L1, L2, and L3) with a seating capacity of x, y, and z respectively. Find the lab which has minimal seating capacity. 


Input format:

Input consists of 3 integers.

The first input denotes the seating capacity of L1(x)

The second input denotes the seating capacity of L2(y)

The third input denotes the seating capacity of L3(z)

 

Output format:

Print the minimal seating lab capacity

 

Sample Input:

30

40

20

 

Sample Output:

L3

Input (stdin)

60
30
50


Output (stdout)

L2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      int x = s.nextInt();

      int y = s.nextInt();

      int z = s.nextInt();

      if((x<y) && (x<z))

      {

        System.out.println("L1");

      }

      else if((y<x) && (y<z))

      {

        System.out.println("L2");

      }

      else

      {

        System.out.println("L3");

      }

    }

}

Lab Allocation II

There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z respectively. One of the 3 labs has been allocated for FACE training. Out of the available labs, find the lab which has minimal seating capacity.


Input format:

Input consists of 3 integers and a string

The first input denotes the seating capacity of L1(x)

The second input denotes the seating capacity of L2(y)

The third input denotes the seating capacity of L3(z)

The fourth input denotes the lab which is allocated for FACE training

 

Output format:

Print the minimal seating capacity lab amongst the available labs.

 

Sample Input:

30

40

20

L3

 

Sample Output:

L1

Input (stdin)

90
50
60
L1


Output (stdout)

L2

 

Input (stdin)

40
20
30
L3


Output (stdout)

L2

 

 

Program :-

import java.util.Scanner;

class Main

{

   public static void main(String args[])

   {

       Scanner  s=new Scanner(System.in);

       int x=s.nextInt();

       int y=s.nextInt();

       int z=s.nextInt();

       String str=s.next();

       if(str.equals("L1"))

       {

           if(y<z)

           {

               System.out.println("L2");

           }

           else

           {

               System.out.println("L3");

           }

       }

       else if(str.equals("L2"))

       {

           if(x<z)

           {

               System.out.println("L1");

           }

           else

           {

               System.out.println("L3");

           }

       }

       else if(str.equals("L3"))

       {

           if(x<y)

           {

               System.out.println("L1");

           }

           else

           {

               System.out.println("L2");

           }

       }

       

   }

}

Lab Allocation III

There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z. A single lab needs to be allocated to a class of 'n' students. How many of the 3 labs can accommodate 'n' students?


Input format:

Input consists of 4 integers

The first input denotes the seating capacity of L1(x)

The second input denotes the seating capacity of L2(y)

The third input denotes the seating capacity of L3(z)

The fourth input denotes the number of students(n)

 

Output format:

Print the number of labs which can accommodate the 'n' number of students

Refer the Sample output for formatting

 

Sample Input:

30

40

20

25

 

Sample Output:

2 

Input (stdin)

60
30
90
20


Output (stdout)

3

 

Program :-

import java.util.Scanner;

class Main

{

   public static void main(String args[])

   {

       Scanner s=new Scanner(System.in);

       int x=s.nextInt();

       int y=s.nextInt();

       int z=s.nextInt();

       int n=s.nextInt();

       if(n<=x&&n<=y&&n<=z)

       {

           System.out.println("3");

       }

       else if((n<=x&&n<=y) ||(n<=x&&n<=z) ||(n<=y&&n<=z))

       {

           System.out.println("2");

       }

       else if(n<=x||n<=y||n<=z)

       {

           System.out.println("1");

       }

       else

       {

           System.out.println("0");

       }

   }

}

Lab Allocation IV

There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity of x, y, and z respectively. A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized to the maximum i.e the number of systems used should not be minimal. Which lab needs to be allocated to this class?


Input format:

Input consists of 4 integers

The first input denotes 'x'

The second input denotes 'y'

The third input denotes 'z'

The fourth input denotes 'n'

 

Output format:

Print the lab which is suitable for 'n' number of students

Refer the Sample output for formatting

 

Sample Input:

30

40

20

25

 

Sample Output:

L1

 

Input (stdin)

90
50
60
40


Output (stdout)

L2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        int l1,l2,l3,n;

        Scanner s=new Scanner(System.in);

        l1=s.nextInt();

        l2=s.nextInt();

        l3=s.nextInt();

        n=s.nextInt();

        if(n<l1&&n<l2&&n<l3)

        {

            if(l1<l2&&l1<l3)

            System.out.println("L1");

            else if(l2<l3)

            System.out.println("L2");

            else

            System.out.println("L3");

        }

        else if(n<l1&&n<l2)

        {

            if(l1<l2)

            System.out.println("L1");

            else

            System.out.println("L2");

        }

        else if(n<l1&&n<l3)

        {

            if(l1<l3)

            System.out.println("L1");

            else

            System.out.println("L3");

        }

        else if(n<l2&&n<l3)

        {

            if(l2<l3)

            System.out.println("L2");

            else

            System.out.println("L3");

        }

        else if(n<l1)

        System.out.println("L1");

        else if(n<l2)

        System.out.println("L2");

        else if(n<l3)

        System.out.println("L3");

        else

        System.out.println("0");

    }

}

DECISION-MAKING STATEMENTS-II

Mango tree I

Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not? Write a program to check whether the given number is a mango tree or not.


Input format:

Input consists of 3 integers

The first input denotes the number of rows

The second input denotes the number of columns

The third input denotes the tree number

 

Output format:

If the given number is a mango tree, print "Yes". Otherwise, print "No"

Refer the sample output for formatting

 

Sample Input:

5

5

11

 

Sample Output:

Yes

Input (stdin)

10
60
2


Output (stdout)

Yes

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

           Scanner s=new Scanner(System.in);

        int a=s.nextInt();

        int b=s.nextInt();

        int c=s.nextInt();

        if(c==10||c==11||c==16||c==17||c==18||c==19||c==20||c==5||c==4||c==2||c==3)

        {

            System.out.println("Yes");

        }

        else

        {

            System.out.println("No");

        }

    }

}

Mango tree II

Sara is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns. She numbered the trees in column wise order and planted mango tree only in a 1st row, 1st column and last column. So given the tree number, write a program to find whether the given tree is a mango tree or not?


Input format:

Input consists of 3 integers

The first input denotes the number of rows

The second input denotes the number of columns

The third input denotes the tree number

 

Output format:

If the given number is a mango tree, print "Yes". Otherwise, print "No"

Refer the sample output for formatting

 

Sample Input:

5

5

15

 

Sample Output:

No

Input (stdin)

3
8
12


Output (stdout)

No

 

Input (stdin)

5
6
16


Output (stdout)

yes

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner (System.in);

      int a=s.nextInt();

      int b=s.nextInt();

      int c=s.nextInt();

      if(c%a==1)

      {

        System.out.println("yes");

      }

      else

      {

        System.out.println("No");

      }

  }

}

Hotel Tariff Calculator

Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December].  Note: Use the switch construct.


Input format:

The first input containing an integer which denotes the number of the month

The second input containing the floating point number which denotes the room rent per day

The third input containing an integer which denotes the number of days stayed in the hotel

 

Output format:

Print the hotel tariff to be paid in floating point with 2 decimal places

Refer the sample output for formatting

 

Sample Input:

3

1500

2

 

Sample Output:

3000.00

Input (stdin)

15
2000
3


Output (stdout)

Invalid Input

 

Input (stdin)

12
6000
2


Output (stdout)

14400.00

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

    int m=sc.nextInt();

    float r=sc.nextFloat();

    int d=sc.nextInt();

    float t=r*d;

    double tr=(1.2)*r*d;

    switch(m)

    {

        case 1:

                System.out.printf("%.2f",t);

                break;

        case 2:

                System.out.printf("%.2f",t);

                break;

        case 3:

                System.out.printf("%.2f",t);

                break;

        case 4:

                System.out.printf("%.2f",tr);

                break;

        case 5:

                System.out.printf("%.2f",tr);

                break;

        case 6:

                System.out.printf("%.2f",tr);

                break;

        case 7:

               System.out.printf("%.2f",t);

               break;

        case 8:

                System.out.printf("%.2f",t);

                break;

        case 9:

                System.out.printf("%.2f",t);

                break;

        case 10:

                System.out.printf("%.2f",t);

                break;

        case 11:

                System.out.printf("%.2f",tr);

                break;

        case 12:

                System.out.printf("%.2f",tr);

                break;

        default:

            System.out.println("Invalid Input");

       }

    }

}

Traffic Signal

We are driving down the street and see a green traffic light ahead. Because we know precisely the pattern of this traffic light, we know exactly how long we have before it will turn red. We wish to compute whether we will pass the traffic light before it turns red at our current speed. Write a program to check whether we will beat the light or not with the current speed.


Input format:

The first input containing the floating point number which denotes the current speed in miles per hour

The second input containing the floating point number which denotes the distance to the light in miles 

The third input containing the floating point number which denotes the time until it turns red in seconds

 

Output format:

Print "Yes", if we will be able to beat the light at current speed. 

Print "No", if we won't be able to beat light at current speed.

 

Sample Input:

59.99

1

60

 

Sample Output:

No

Input (stdin)

50.6
2
60


Output (stdout)

No

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

  Scanner sc=new Scanner(System.in);

  float a=sc.nextFloat();

  float b=sc.nextFloat();

  float c= sc.nextFloat();

if((a<c)||((a>c) && (b>1)))

    System.out.println("No");

else

    System.out.println("Yes");

}

}

Budget

It’s your job to calculate the cost of replacing damaged battle droids and to check whether it is within the budget limit of Rs. 15000. The cost of the equipment and parts is given below. Blast Rifle Rs. 350.34 Visual Sensors Rs. 230.90 Auditory Sensors Rs. 190.55 Arms Rs. 125.30 Legs Rs. 180.90 Write a program to solve this problem.


Input format:

Input consists of 5 integers

The first input denotes the number of blast rifles needed

The second input denotes the number of visual sensors needed

The third input denotes the number of auditory sensors needed

The fourth input denotes the number of arms needed

The fifth input denotes the number of legs needed

 

Output format:

If the total cost of replacing damaged battle droids is within the sanctioned budget of Rs. 15000, print "Yes". Otherwise, print "No"

Refer the sample output for formatting

 

Sample Input:

20

10

14

3

9

 

Sample Output:

Yes

Input (stdin)

13
12
14
13
17


Output (stdout)

Yes

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

  Scanner scanner=new Scanner(System.in);

  int a=scanner.nextInt();

  int b=scanner.nextInt();

  int c=scanner.nextInt();

  int d=scanner.nextInt();

  int e=scanner.nextInt();

  double t=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);

  if(t<15000)

  System.out.println("Yes");

  else

  System.out.println("No");

}

}

Sece Dinning

The catering staff in the SECE mess are known for their good cooking skills as well as hospitality. We all know that the dining table arrangement needs to be different for left-handed and right-handed persons. So whenever any VIP guests come to SECE, they would make the table arrangements based on whether they are left-handed or right-handed. The mess is situated on the 15th floor of the hostel building. SECE hostel building has super-fast elevators to help to travel from one floor to another. Each elevator has 2 doors, the front one and the rear one. If a person enters the elevator through the front door, he goes out through the rear door and vice-versa. The elevator has 2 rails numbered as 1 and 2. Rail 1 is located to the left of the entrance to the front door (or correspondingly, to the right of the entrance to the rear door). Rail 2 is located opposite it, to the right of the entrance to the front door and to the left of the entrance to the rear door. We know that each person holds on the rail with his/her strongest hand. There is an IP camera in the elevator and based on the camera output, the catering staff will be easily able to identify whether a guest is left-handed or right-handed. They have decided to automate this task and they asked the help of Image Processing Group. The Image Processing Group has written a program to perform this task and the program will output the door through which the person entered and the rail number which the person held. Based on this input, write a program to determine whether a person is left-handed or right-handed?


Input format:

The first input containing a string denotes “front” or “rear”

The second input containing an integer denotes rail 1 or 2

 

Output format:

Print the string "Left Handed" or "Right Handed"

 

Sample Input:

front

1

 

Sample Output:

Left Handed

Input (stdin)

front
0


Output (stdout)

Right Handed

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

    String str1=sc.nextLine();

    int a=sc.nextInt();

    if(str1.equals("front" ))

    {

        if(a==1) 

            System.out.println("Left Handed");

        else

            System.out.println("Right Handed");

    }

    else if(str1.equals("rear"))

    {

        if(a==1||a==2)

            System.out.println("Right Handed");

        else

            System.out.println("Left Handed");

    }

    else

        System.out.println("Nothing");

}

}

Circle Intersection

Write a program to determines if two circles intersect each other.


Input format:

Input consists of 6 integers

The first input containing an integer which denotes the x-coordinate of the center of the first

circle. 

The second input containing an integer which denotes the y-coordinate of the center of the

first circle. 

The third input containing an integer which denotes the radius of the first circle. 

The next 3 integers denote the x,y, and radius of the second circle.

 

Output format:

The output consists of a single line which contains any of these 3 strings.

“Tangential”, “Overlap”, “Do not overlap”

 

Sample Input:

10

10

3

10

6

1

 

Sample Output:

Tangential

Input (stdin)

10
8
1
2
3
2


Output (stdout)

Do not overlap

 

Program :-

import java.util.Scanner;

import java.lang.Math;

class Main

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int x1=sc.nextInt();

int y1=sc.nextInt();

int x2=sc.nextInt();

int y2=sc.nextInt();

int r1=sc.nextInt();

int r2=sc.nextInt();

int c=(int)(Math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2)));

if(c==r1+r2)

    System.out.println("Tangential");

else if(c>r1+r2)

    System.out.println("Do not overlap");

else

    System.out.println("Overlap");

}

}

Time Sheet

Jeevitha just started work as a programming trainer for UIT's Placement Cell. She is paid Rs.100 an hour, with a few exceptions. She earns an extra Rs.15 an hour for any part of a day where she works more than 8 hours, and an extra Rs.25 an hour for hours beyond 40 in any one week. Also, she earns a 25% bonus for working on Saturday and a 50% bonus for working on Sunday. The bonuses for Saturday and Sunday are computed based on the hours worked those days; they are not used to calculate any bonus for working more than 40 hours in a week. You'll be given the number of hours Jeevitha worked on each day in a week (Sunday, Monday, ..., Saturday), and you need to compute her salary for the week.


Input format:

Input consists of 7 integers less than or equal to 24 on separate lines

 

Output format:

Print the Jeevith's salary for a week.

 

Sample Input:

0

8

8

8

10

6

0

 

Sample Output:

4030

Input (stdin)

5
3
6
1
1
2
3


Output (stdout)

2425

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      int sun=sc.nextInt();

      int mon=sc.nextInt();

      int tue=sc.nextInt();

      int wed=sc.nextInt();

      int thurs=sc.nextInt();

      int fri=sc.nextInt();

      int sat=sc.nextInt();

      int bonus, bonusrate, rate1=0, rate2=0, rate3=0, rate4=0, rate5=0, rate6=0, rate7=0, rate8 = 0;

      int edays, totaldays, totalrate;

      rate1 = sun * 150;

        rate7=sat*125;

    if(mon <= 8)

    {

        rate2 = mon * 100;

    }

    else if(mon > 8)

    {

        bonus = mon - 8;

        bonusrate = bonus * 115;

        rate2 = bonusrate + 800;

    }

    if(tue <= 8)

    {

        rate3 = tue * 100;

    }

    else if(tue > 8)

    {

        bonus = tue - 8;

        bonusrate = bonus * 115;

        rate3 = bonusrate + 800;

    }

    if(wed <= 8)

    {

        rate4 = wed * 100;

    }

    else if(wed > 8)

    {

        bonus = wed - 8;

        bonusrate = bonus * 115;

        rate4 = bonusrate + 800;

    }

    if(thurs <= 8)

    {

        rate5 = thurs * 100;

    }

    else if(thurs > 8)

    {

        bonus = thurs - 8;

        bonusrate = bonus * 115;

        rate5 = bonusrate + 800;

    }

    if(fri <= 8)

    {

        rate6 = fri * 100;

    }

    else if(fri > 8)

    {

        bonus = fri - 8;

        bonusrate = bonus * 115;

        rate6 = bonusrate + 800;

    }

    totaldays = mon + tue + wed + thurs + fri;

    if(totaldays > 40)

    {

        edays = totaldays - 40;

        rate8 = edays * 25;

    }

    totalrate = rate1 + rate2 + rate3 + rate4 + rate5 + rate6 + rate7 + rate8;

    System.out.printf("%d", totalrate);    

    }

}

Microwave Oven

A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. Write a program to find out the recommended heating time.


Input format:

The first input containing an integer which denotes the number of items

The second input containing the floating point number which denotes the single item heating time.

 

Output format:

Print the recommended heating time in floating point with 2 decimal places.

If the number of items is more than three, print "Number of items is more" 

 

Sample Input:

2

5.0

 

Sample Output:

7.50

Input (stdin)

3
7.0


Output (stdout)

14.00

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();

    float f=sc.nextFloat();

    switch(a)

    {

        case 1:

                 System.out.println(f);

                 break;

        case 2:

                 double t=(1.5)*f;

                 System.out.println(t);

                 break;

  case 3:

                 t=2*f;

                 System.out.println(t);

                 break;

        default:

              System.out.println("Number of items is more");

              break;

    }

}

}

Matinee Movie Tickets

Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30). The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, however, the adult matinee price is $5.00. Adults are those over 13 years. The normal children's ticket price is $4.00, however, the children's matinee price is $2.00. Write a program that determines the price of a movie ticket


Input format:

The first input containing an integer which denotes the age

The second input containing the floating point number which denotes the show timing.

 

Output format:

Print the price of a movie ticket.

 

Sample Input:

16

10.15

 

Sample Output:

$8.00

Input (stdin)

6
3.0


Output (stdout)

$4.00

 

Input (stdin)

60
3.8


Output (stdout)

$8.00

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

  Scanner sc=new Scanner(System.in);

  int a=sc.nextInt();

  float b=sc.nextFloat();

  float t=13.30f;

  if(b==t)

  {

      if(a>13)

        System.out.println("$5.00");

       else

        System.out.println("$2.00");

  }

  else

  {

      if(a>13)

        System.out.println("$8.00");

      else

        System.out.println("$4.00");

  }

}

}

CONTROL STRUCTURES-I

Amoeba Multiplication

The environmental eco-club has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting their amoeba in a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index is given, write a program to displays the amoeba’s size……??? For Example, The size of the amoeba on month 1, 2, 3, 4, 5, 6, ..will be 0, 1, 1, 2, 3, 5, 8 respectively.


Input format:

The first input containing an integer which denotes the number of the month

 

Output format:

Print the amoeba size.

 

Sample Input:

7

 

Sample Output:

8

Input (stdin)

13


Output (stdout)

144

 

Input (stdin)

4


Output (stdout)

2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();

       int a=0,b=1;

       int c=a+b;

       while(n!=3)

       {

           a=b;

           b=c;

           c=a+b;

           n--;

       }

       System.out.println(c);

    }

}

Factorial Number

Write a program to determine whether 'n' is a factorial number or not. Factorial of a number is the product of all positive numbers from 1 to 'n'.


Input format:

The input containing an integer 'n' which denotes the given number.

 

Output format:

If the given number is factorial, print "Yes". Otherwise, print "No".

 

Sample Input:

6

 

Sample Output:

Yes

Input (stdin)

24


Output (stdout)

Yes

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        int n,fact=1,x=1;

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        while(fact<n)

    {

        x=x+1;

        fact=fact*x;

    }

if(fact==n)

{

    System.out.println("Yes");

}

    else

{

    System.out.println("No");

}

}

}

Lucas Sequence

a = 0, b=0, c=1 are the 1st three terms. All other terms in the Lucas sequence are generated by the sum of their 3 most recent predecessors. Write a program to generate the first n terms of a Lucas Sequence.


Input format:

The input containing an integer 'n' which denotes the given number

 

Output format:

Print the 'n' terms of the Lucas Sequence, separated by a single space. There are no leading or trailing spaces in the output.

 

Sample Input:

5

 

Sample Output:

0 0 1 1 2

Input (stdin)

6


Output (stdout)

0 0 1 1 2 4

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=0,b=0,c=1;

        System.out.printf("%d %d %d ",a,b,c);

        while(n!=3&&n>1)

        {

            int d=a+b+c;

            System.out.printf("%d ",d);

            a=b;

            b=c;

            c=d;

            n--;

        }       

    }

}

Collatz Problem

The rules for generating Collatz Sequence are: If n is even: n = n / 2 If n is odd: n = 3n + 1 For example, if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1 It has been proved for almost all integers, the repeated application of the above rule will result in a sequence that ends at 1.


Input format:

The input containing an integer 'n' which denotes the given number

 

Output format:

Print the numbers in the sequence and also print the number of times the rule has to be applied in order to reach 1.

 

Sample Input:

5

 

Sample Output:

5

16

8

4

2

1

5

Input (stdin)

18


Output (stdout)

18
9
28
14
7
22
11
34
17
52
26
13
40
20
10
5
16
8
4
2
1
20

 

Input (stdin)

1


Output (stdout)

1
0

 

Input (stdin)

4


Output (stdout)

4
2
1
2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       Scanner sc=new Scanner(System.in);

       int a=sc.nextInt();

       int count=0;

       System.out.println(a);

       while(a!=1)

       {

           if(a%2==0){

               a=a/2;

               System.out.println(a);

               count++;

           }

           else

           {

               a=(3*a)+1;

               System.out.println(a);

               count++;

           }

       }

       System.out.println(count);

    }

}

Trendy Numbers

Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3.


Input format:

The input containing an integer 'n' which denotes the given number

 

Output format:

If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".

 

Sample Input:

791

 

Sample Output:

Trendy Number

Input (stdin)

3


Output (stdout)

Not a Trendy Number

 

Input (stdin)

45


Output (stdout)

Not a Trendy Number

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       Scanner scan=new Scanner(System.in);

       int a=scan.nextInt();

       if(a>99 && a<=999){

            a=a%100;

            a=a/10;

           if(a%3==0){

               System.out.printf("Trendy Number");

           }else

           System.out.printf("Not a Trendy Number");

       }else

       System.out.printf("Not a Trendy Number");

    }

}

Viva on Odd Numbers

A maths teacher asks her students to give 3 examples for positive odd numbers. When the student specifies a correct answer, his/her score is incremented by 1. When the student specifies a positive even number, his/her score is decremented by 0.5. When the student specifies a negative number, he/she will not be given any more chances to correct his or her mistake and his/her score will be decremented by 1. So a student's turn comes to an end when he/she has correctly specified 3 positive odd numbers or when the student has specified a negative number. Few students didn't know the difference between odd numbers and even numbers and they made many mistakes and so it was difficult for the teacher to maintain the scores. The teacher asks for your help. Can you please help her by writing a program to calculate the score?


Input Format:

Input consists of a list of integers.

 

Output Format:

Output consists of a single line. The score needs to be displayed correct to 1 decimal place. Refer sample output for details.

[For this exercise, don't worry about duplicate odd numbers. Even if the students specifies the same odd number thrice, it is accepted].

 

Sample Input 1:

1

3

5

 

Sample Output 1:

3.0

 

Input (stdin)

2
-4


Output (stdout)

-1.5

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        float mark=0;

        int count=0;

        int n=0;

        Scanner scan=new Scanner(System.in);

        //n=scan.nextInt();

        while(n>=0){

            if(count==3)

            {

                break;

            }

            n=scan.nextInt();

            if(n%2!=0 && n>=0)

            {

                ++mark;

                ++count;    

            }

          else if(n<0)

          {

              mark=(float)(mark-1);

           }

          else

           {

              mark=(float)(mark-0.5);

           }

        }

        System.out.printf("%.1f",mark);

        //System.out.println(count);   

    }

}

Kaprekar Number

Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 92 = 81 & 8+1=9. and 297 is a Kaprekar number since 2972 = 88209 & 88+209 = 297


Input Format:

Input consists of a single integer.

 

Output Format:

Refer sample output for details.

 

Sample Input:

9

 

Sample Output:

Kaprekar Number

 

Input (stdin)

101


Output (stdout)

Not a Kaprekar Number

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

      Scanner sc =new Scanner(System.in);

      int num = sc.nextInt();

      int p = 0;

      int digit=0,sq,sum=0;

      sq = num*num;

      p=sq;

      while(sq>0)

      {

        digit++;

        sq = sq/10;

      }

      int k =(int)Math.pow(10,(digit/2));

      while(p>0)

      {

        sum = sum+(p%k);

        p=p/k;

      }

      if(sum==num){

        System.out.println("Kaprekar Number");

      }

      else{

        System.out.println("Not a Kaprekar Number");

      }

    }

}

Target Practice

Drona normally trains his disciples using a board which consists of concentric circles. When the student correctly hits the center of the concentric circles, his score is 100. The score gets reduced depending on where the students hit on the board. When the student hits outside the board, his score is 0. Drona will not allow a student to have his food unless he scores 100. Arjuna will always hit the target in his first attempt and he will leave early. Others may take more turns to reach a score of 100. Can you write a program to determine the number of turns a disciple takes to reach the target score of 'n'?


Input Format:

Input consists of a list of positive integers. The first integer corresponds to the target score 'n'. Assume that all the other integers input are less than or equal to n.

 

Output Format:

Output consists of a single line. Refer sample output for format details.

 

Sample Input:

100

4

40

60

 

Sample Output 1:

The number of turns is 3

 

Input (stdin)

100
4
40
60


Output (stdout)

The number of turns is 3

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        int sum=0,n,count=0;

        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();

        while(sum<a){

            n=scan.nextInt();

            sum=sum+n;

            count++;

        }

        System.out.println("The number of turns is "+count);

    }

}

Data Mining

In the University Examinations conducted during the past 5 years, the toppers registration numbers were 7126, 82417914, 7687 and 6657. Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers. In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number. He termed the numbers that satisfy this property as Probable Topper Numbers. Write a program to find whether a given number is a probable topper number or not.


Input Format:

Input consists of a single integer.

 

Output Format:

Output consists of a single line. Refer sample output for details.

 

Sample Input:

143

 

Sample Output:

yes

 

Input (stdin)

344


Output (stdout)

No

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        int even=0,odd=0;

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        while(n!=0){

            int b=n%10;

            if(b%2==0){

                even=even+b;

            }else

            odd=odd+b;

            n=n/10;

        }

        if(even==odd){

            System.out.println("yes");

        }else

        System.out.println("No");

    }

}

SPECIAL NUMBER

Write a program to find all special numbers between 2 limits m and n(both inclusive). Assume that m and n are 2-digit numbers. A 2-digit number is said to be a special number if the sum of its digits and the products of its digits is equal to the number itself. For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9. 10+9 = 19.


Input Format:

Input consists of 2 integers m and n.

 

Output Format:

Refer Sample Output .

 

Sample Input:

11

30

 

Sample Output:

19

29

Input (stdin)

20
60


Output (stdout)

29
39
49
59

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        int m,n,i,b,c,d,e,f,t;

        m=s.nextInt();

        n=s.nextInt();

        for(i=m;i<=n;i++)

        {

            t=i;

             b=i%10;

             c=i/10;

            d=b+c;

            e=b*c;

            f=d+e;

            if(f==t)

            {

                System.out.println(f);

            }

        }

    }

}

Print continous number

Write a program to print all numbers between a and b (a and b inclusive) using a while loop.


Input Format:

Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a>=b.

 

Output Format:

Refer Sample Input and Output for formatting specifications.

 

Sample Input :

4

10

 

Sample Output:

4

5

6

7

8

9

10

Input (stdin)

5
12


Output (stdout)

5
6
7
8
9
10
11
12

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s=new Scanner(System.in);

      int i;

      int l=s.nextInt();

      int u=s.nextInt();

      for(i=l;i<=u;i++)

      {

          System.out.println(i);

      }

    }

}

Print the number in reverse

Write a Java program to print all numbers between a and b (a and b inclusive) using while loop.


Input Format:

Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a>=b.

 

Output Format:

Refer Sample Input and Output for formatting specifications.

 

Sample Input :

10

4

 

Sample Output:

10

9

8

7

6

5

4

Input (stdin)

8
2


Output (stdout)

8
7
6
5
4
3
2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        int a=s.nextInt();

        int b=s.nextInt();

        int c=a;

       while(b<=a)

        {

            System.out.println(c);

            c--;

            b++;

        }

    }

}

Count positive and negative

Write a program that allows the user to enter 'n' numbers and finds the number of positive numbers entered and the number of negative numbers entered using a loop.


Input Format:

Input consists of n+1 integers. The first integer corresponds to n. The next n integers correspond to the numbers to be added. Consider 0 to be a positive number.

 

Output Format:

Refer Sample Input and Output for formatting specifications.

 

Sample Input:

4

5

-2

-1

6

 

Sample Output:

Number of positive numbers entered is 2 and the sum is 1

Input (stdin)

5
-8
-9
5
-6
2


Output (stdout)

Number of positive numbers is 2 and the number of negative numbers is 3

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        int a[]=new int[20];

        int n=s.nextInt();

        int count=0,i,count1=0;

        for(i=0;i<n;i++)

        {

            a[i]=s.nextInt();

        }

        for(i=0;i<n;i++)

        {

        if(a[i]>=0)

        {

            count++;

        }

        else

        {

          count1++;

        }

        }

        System.out.println("Number of positive numbers is "+count+" and the number of negative numbers is "+count1);

    }

}

Multiplication Table

Write a program to print the multiplication table of an integer n up to m rows using loop.


Input Format:

Input consists of 2 integers. The first integer corresponds to n. The second integer corresponds to m.

 

Output Format:

Refer Sample Input and Output for formatting specifications.

 

Sample Input:

5

4

 

Sample Output:

The multiplication table of 5 is

1*5=5

2*5=10

3*5=15

4*5=20

Input (stdin)

2
5


Output (stdout)

1*2=2
2*2=4
3*2=6
4*2=8
5*2=10

 

Input (stdin)

3
2


Output (stdout)

1*3=3
2*3=6

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int m=sc.nextInt();

        for(int i=1;i<=m;i++)

        {

            System.out.println(i+"*"+n+"="+n*i);

        }

    }      

}

CONTROL STRUCTURES-II

Series I

Write a program to generate the following series --- 1,4,9,16,25, ....


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

7

 

Sample Output:

1 4 9 16 25 36 49 

Input (stdin)

2


Output (stdout)

1 4

 

Input (stdin)

15


Output (stdout)

1 4 9 16 25 36 49 64 81 100 121 144 169 196 225

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int i,nn=0;

        for(i=1;i<=n;i++)

        {

            nn=i*i;

            System.out.printf("%d ",nn );

        }   

}

}

Series II

Write a program to generate the following series --- 6,11,21,36,56,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

6

 

Sample Output:

6 11 21 36 56 81

Input (stdin)

5


Output (stdout)

6 11 21 36 56

 

Input (stdin)

7


Output (stdout)

6 11 21 36 56 81 111

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int q=s.nextInt();

int i,j=5;

int sum=6;

for(i=1;i<=q;i++)

{

    System.out.print(sum+" ");

    sum=sum+(i*j);

}

}

}

Series III

Write a program to generate the first n terms in the series --- 3, 9, 27, 81,...,.


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

6

 

Sample Output:

3 9 27 81 243 729

Input (stdin)

10


Output (stdout)

3 9 27 81 243 729 2187 6561 19683 59049

 

Input (stdin)

8


Output (stdout)

3 9 27 81 243 729 2187 6561

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner r=new Scanner(System.in);

int n=r.nextInt();

int i;

double mul=0;

for(i=1;i<=n;i++)

{

            mul=Math.pow(3,i);

    System.out.print((int)mul+" ");

     }

}

}

Series IV

Write a program to generate the following series --- 0.5,1.5,4.5,13.5,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

5

 

Sample Output:

0.5 1.5 4.5 13.5 40.5

Input (stdin)

8


Output (stdout)

0.5 1.5 4.5 13.5 40.5 121.5 364.5 1093.5

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int n=s.nextInt();

int i;

double p;

for(i=0;i<n;i++)

{

    p=(((Math.pow(3,i))*5)/10);   

    System.out.print(p+" ");

}    

}

}

Series V

Write a program to generate the following series --- 121,225,361,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

4

 

Sample Output:

121 225 361 529

Input (stdin)

8


Output (stdout)

121 225 361 529 729 961 1225 1521

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int n=s.nextInt();

int i;

double p=11;

for(i=0;i<n;i++)

        {

    System.out.printf("%d ",(int)Math.pow(p,2));

p=p+4;  

}

}

}

Series VI

Write a program to generate the following series --- 0,2,8,14,...,34


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

6

 

Sample Output:

0 2 8 14 24 34

 

Input (stdin)

3


Output (stdout)

0 2 8

 

Program :-

import java.util.*;

class Main

{

  public static void main(String args[])

  {

    Scanner sc=new Scanner(System.in);

  int n=sc.nextInt();

int i,sum;

for(i=1;i<=n;i++)

    {

      if(i%2==0)

      {

        sum=(i*i)-2;

System.out.printf("%d ",sum);

  }

  else

      {

sum=(i*i)-1;

System.out.printf("%d ",sum);

  }

    }

 }

}

Series VII

Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

6

 

Sample Output:

1 2.0 3.0 6.0 9.0 18.0

Input (stdin)

10



Output (stdout)

1 2.0 3.0 6.0 9.0 18.0 27.0 54.0 81.0 162.0

 

Input (stdin)

5


Output (stdout)

1 2.0 3.0 6.0 9.0

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int n=s.nextInt();

int i=1;

float even=2;

float odd=1;

for(i=1;i<=n;i++)

{

    if(i==1)

    {

        System.out.print("1 ");

        i++;

    }

    if(i%2==0)

    {

        System.out.print(even+" ");

    even=even*3;

    }

    else

    {

        odd=odd*3;

        System.out.print(odd+" ");

    }

}    

}

}

Series VIII

Write a program to generate the following series 4, 5, 9, 18, 34,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

6

 

Sample Output:

4 5 9 18 34 59

Input (stdin)

8


Output (stdout)

4 5 9 18 34 59 95 144

 

Input (stdin)

5


Output (stdout)

4 5 9 18 34

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

int d=s.nextInt();

double sum=4,i;

for(i=0;i<d;i++)

{

    sum=sum+Math.pow(i,2);

    System.out.print((int)sum+" ");

}    

}

}

Series IX

Write a program to generate the following series 2, 15, 41, 80,...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

5

 

Sample Output:

2 15 41 80 132

Input (stdin)

3


Output (stdout)

2 15 41

 

Input (stdin)

8


Output (stdout)

2 15 41 80 132 197 275 366

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

      Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

    int sum=2;

    int i;

    for(i=0;i<n;i++)

    {

        sum=sum+(13*i);

        System.out.print(sum+" ");

    }

}

}

Series X

Write a program to generate the following series 2, 3, 8, 63, 3968


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

5

 

Sample Output:

2 3 8 63 3968

Input (stdin)

7


Output (stdout)

2 3 8 63 3968 15745023 236945408

 

Program :-

import java.util.Scanner;

class Test

{ 

   void disp()

    {

        int s=2, p=0,i;

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.printf(s+" ");

        for(i=2;i<=n;i++)

        {

            s=(s*s)-1;

            System.out.printf(s+" ");

        }

    }          

 }

public class Main

{

    public static void main(String args[])

{

Test obj=new Test();

obj.disp();

}

}

Series XI

Write a program to generate the following series 95.0, 115.5, 138.0,..., 189.0


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

5

 

Sample Output:

95.0 115.5 138.0 162.5 189.0

Input (stdin)

10


Output (stdout)

95.0 115.5 138.0 162.5 189.0 217.5 248.0 280.5 315.0 351.5

 

Program :-

import java.util.Scanner;

class Series

{

    float num=95.0f;

    void constructseries(int a)

    {   

        for(int i=0;i<a;i++)

        {

            System.out.printf("%.1f ",num);

            num=num+20.5f+(i*2);

        }

    }

}

public class Main

{

 public static void main(String args[])

 {

     Series s=new Series();

     Scanner sc =new Scanner(System.in);

     int n=sc.nextInt();

     s.constructseries(n);  

 }

}

Series XII

Write a program to generate the following series 9, 11, 20, 31,..., 82


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting

 

Sample Input:

6

 

Sample Output:

9 11 20 31 51 82

Input (stdin)

5


Output (stdout)

9 11 20 31 51

 

Input (stdin)

4


Output (stdout)

9 11 20 31

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int a=sc.nextInt();

int num=9;

int sum=11;

System.out.print(num+" "+sum+" ");

for(int i=1;i<a-1;i++)

{

    int add=num+sum;

    num=sum;

    sum=add;

    System.out.print(add+" ");

}

}

}

Series XIII

Write a program to generate the following series 5, 16, 49, 104, 181...


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series and refer the sample output for formatting.

 

Sample Input:

5

 

Sample Output:

5 16 49 104 181

Input (stdin)

2


Output (stdout)

5 16

 

Program :-

import java.util.Scanner;

class Series

{

    int num=5;

    int d=11,odd=1;

    void constructseries(int a)

    {

        for(int i=0;i<a;i++)

        {

            System.out.printf("%d ",num);

            num=num+d*odd;

            odd=odd+2;

        }

    }

}

public class Main

{

 public static void main(String args[])

 {

     Series s=new Series();

     Scanner sc =new Scanner(System.in);

     int n=sc.nextInt();

     s.constructseries(n);

 }

}

Series XIV

Write a program to generate the following series 2, 5, 11, 23, 47, 95, 191........... Input format: The input containing an integer which denotes 'n' Output format: Print the series and refer the sample output for formatting

Input (stdin)

5


Output (stdout)

2 5 11 23 47

 

Program :-

import java.util.Scanner;

class A

{

    void fun()

    {

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int i;

        int sum=5,t,f=2;

        for(i=1;i<=n;i++)

        {

            if(i==1)

            {

            System.out.print("2 ");

            }

            else

            {

                System.out.print(sum+" "); 

            t=(f*sum)+1;           

            sum=t;

            }

        }

    }

}

class Main

{

public static void main(String args[])

{

A g=new A();

g.fun();

}

}

Series XV

Write a program to generate the following series 3, 8, 13, 24, 41, 70, 117, 194,.......


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Print the series. Refer the sample output for formatting

 

Sample Input:

6

 

Sample Output:

3 8 13 24 41 70

Input (stdin)

10


Output (stdout)

3 8 13 24 41 70 117 194 319 522

 

Input (stdin)

5


Output (stdout)

3 8 13 24 41

 

Program :-

import java.util.Scanner;

class A

{

    void fun()

    {

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int i;

        int sum=8,t,f=3;

        for(i=1;i<=n;i++)

        {

            if(i==1)

            {

            System.out.print("3 ");

            }

            else

            {

                System.out.print(sum+" "); 

            t=f+(sum+i);

            f=sum;

            sum=t;   

            }            

        }

    }

}

class Main

{

public static void main(String args[])

{

A g=new A();

g.fun();

}

}

CONTROL STRUCTURES-III

Pattern 1

Write a program to print the given pattern.


Input format:

The input containing an integer which denotes the value of 'n'

 

Output format:

Refer to the sample output. There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1 2 3 4 5 6 7

1 2 3 4 5

1 2 3

1

 

Input (stdin)

7


Output (stdout)

1 2 3 4 5 6 7 8 9 10 11 12 13
1 2 3 4 5 6 7 8 9 10 11
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7
1 2 3 4 5
1 2 3
1

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

int i,j,num;

Scanner obj=new Scanner(System.in);

num=obj.nextInt();

for(i=num;i>=1;i--)

{

    for(j=1;j<=2*i-1;j++)

    {

        System.out.print(j+" ");

    }

    System.out.print("\n");

}

}

}

Pattern 2

Write a program to print the given pattern.


Input format:

The input containing an integer which denotes the value of 'n'

 

Output format:

Refer the sample output for formatting.

There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1

0 1

1 0 1

0 1 0 1

 

Input (stdin)

3


Output (stdout)

0
1 0
1 0 1

 

Program :-

import java.util.Scanner;

class A

{

    void test()

    {

        Scanner s=new Scanner(System.in);

      int a1=s.nextInt();

      int i=0,j;

      int c=0;

    for(i=1;i<=a1;i++)

    {

       for(j=1;j<=i;j++)

        {  

            ++c;

            if(c%2==0)

            {

            System.out.print("1 ");

            }

            else

            {

                System.out.print("0 ");

            }

        }

        System.out.println(" ");

    }

 }

}

class Main

{

public static void main(String args[])

{

A obj=new A();

obj.test();

}

}

Pattern 3

Write a program to print the given pattern.


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

5

 

Sample Output:

1 3 5 7 9

3 5 7 9

5 7 9

7 9

9

 

Input (stdin)

3


Output (stdout)

1 3 5
3 5
5

 

Program :-

import java.util.Scanner;

class A

{

    void d()

    {

      Scanner s=new Scanner(System.in);

    int a=s.nextInt();

    int i,j;

    int z=1;

    a=a*2;

   for(i=1;i<=a;i=i+2)

    {

         for(j=i;j<=a;j=j+2)

     {

        System.out.print(j+" ");

         }

       System.out.println(" ");    

    }

    }

}

class Main

{

public static void main(String args[])

    {  

A c=new A();

c.d();

}

}

Pattern 4

Write a program to print the given pattern


Input format:

The input containing an integer which denotes the 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line

 

Sample Input:

5

 

Sample Output:

5 5 5 5 5

4 5 5 5 5

3 4 5 5 5

2 3 4 5 5

1 2 3 4 5

 

Input (stdin)

6


Output (stdout)

666666
566666
456666
345666
234566
123456

 

Program :-

import java.util.Scanner;

class A

{

    void d()

    {

Scanner s=new Scanner(System.in);

    int a=s.nextInt();

    int i,j,k;

  for(i=a;i>=1;i--)

    {

    for(j=i;j<=a;j++)

    {

        System.out.print(j+"");

    }

    for(k=1;k<=i-1;k++)

      { 

          System.out.print(a+"");

    }  

    System.out.println("");

    }

    }

}

class Main

{

public static void main(String args[])

{   

A c=new A();

c.d();

}

}

Pattern 5

Write a program to print the given below pattern.


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1

2 3

4 5 6

7 8 9 10

 

Input (stdin)

6


Output (stdout)

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

        int i,j,n,k=1;

        Scanner sc =new Scanner(System.in);

        n=sc.nextInt();

        for(i=1;i<=n;i++)

        {

            for(j=1;j<=i;j++)

            {

                System.out.print(k++ +" ");

            }

            System.out.println();

        }

}

}

Pattern 6

Write a program to print the given pattern.


Input format:

The input containing an integer which denotes the 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1 

1 2 3 

1 2 3 4 5 

1 2 3 4 5 6 7 

 

Input (stdin)

5


Output (stdout)

1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int a=sc.nextInt();

for(int i=1;i<=a;i++)

{

    for(int j=1;j<=(2*i)-1;j++)

    {

        System.out.print(j+" ");

    }

    System.out.printf("\n");

}

}

}

Pattern 7

Write a program to print the given below pattern.


Input format:

The input containing an integer which denotes 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line

 

Sample Input:

5

 

Sample Output:

1 

1 0 

1 0 1 

1 0 1 0 

1 0 1 0 1

 

Input (stdin)

7


Output (stdout)

1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1

 

Program :-

import java.util.Scanner;

class A

{

    void fun(int d)

    {

    int i, j, k, s;

    for (i=1; i<=d; i++)

    {

for (j =1 ; j<=i; j++)

{

    if(j%2==0)

    {

        System.out.printf("0 ");

    }

    else

    {

        System.out.printf("1 ");

    }

}  

System.out.printf("\n");

    }

}}

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

int d=sc.nextInt();

A obj=new A();

obj.fun(d);

}

}

Pattern 8

Write a program to print the given below pattern.


Input format:

The input containing an integer which denotes the value of 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

5

 

Sample Output:

*   *

 * * 

  *  

 * * 

*   *

Input (stdin)

3


Output (stdout)

* *
 *
* *

 

Program :-

import java.util.Scanner;

class A

{

    void fun(int d)

    {

    int i, j, k, s;

    for (i =1; i<=d; i++)

    {

for (j =1 ; j <= d; j++)

{

if(i==j || i+j==d+1)

System.out.printf("*");

else

System.out.printf(" ");

}

System.out.printf("\n");

}  

    }

}

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

int d=sc.nextInt();

A obj=new A();

obj.fun(d);

}

}

Pattern 9

Write a program to print the given below pattern.


Input format:

The input containing an integer which denotes the value of 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1*2*3*4*17*18*19*20

 5*6*7*14*15*16

  8*9*12*13

   10*11

 

Input (stdin)

3


Output (stdout)

1*2*3*10*11*12
 4*5*8*9
  6*7

 

Program :-

import java.util.Scanner;

class A

{

    void fun(int d)

    {

    int i, j, k, s;

    int a = 1;

    int b = d*d + 1;

    for (i = d; i >= 1; i--)

    {

for (s = 0; s < d - i; s++)

System.out.printf(" ");

for (j = 0; j < i; j++)

System.out.printf("%d*", a++);

for (k = 0; k < i - 1; k++)

System.out.printf("%d*", b++);

System.out.printf("%d\n", b);

b -= 2*(i - 1);

  }  }

}

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

int d=sc.nextInt();

A obj=new A();

obj.fun(d);

}

}

Pattern 10

Write a program to print the given below pattern.


Input format:

The input containing an integer which denotes the value of 'n'

 

Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.

 

Sample Input:

4

 

Sample Output:

1112

3222

3334

5444

 

Input (stdin)

5


Output (stdout)

11112
32222
33334
54444
55556

 

Program :-

import java.util.Scanner;

class A

{

    void fun(int a)

    {

       for(int i=1;i<=a;i++)

  {

    for(int j=1;j<=a;j++)

    {

        if(i%2!=0 && j==a || i%2==0 && j==1)

        {

        System.out.print((i+1));

        }

        else

        {

           System.out.print(i); 

        }

    }

    System.out.printf("\n");

} 

    }

}

class Main

{

public static void main(String args[])

{

    Scanner sc=new Scanner(System.in);

int a=sc.nextInt();

A obj=new A();

obj.fun(a);

}

}

1D-ARRAY

Maximum Element in an Array

You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was filled with guns. you have to choose the biggest gun in the drop box. Find the biggest gun and you will get the chicken dinner.


Input Format:

Input consists of n+1 integers.

The first integer corresponds to ‘n’ , the size of the array.

The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

 

Output Format:

Refer sample output for details.

 

Sample Input 1:

5

2

3

6

8

1

 

Sample Output 1:

8 is the maximum element in the array

 

Input (stdin)

4
3
5
9
2


Output (stdout)

9 is the maximum element in the array

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for( int i = 0 ; i < n ; i++ )

            a[i] = s.nextInt();

        int max = a[0];

        for( int i = 1; i < n ; i++ ){

            if( a[i] > max )

                max = a[i];

        }

        System.out.println(max+" is the maximum element in the array");

    }

}

Sum of 2 arrays

Ramu have some number of Apples and he arrange that in a matrix format.

Raju have some another number of Apples. He also wants to arrange that in a matrix format.

Ragul wants to calculate the total number of apples. Help him to find out the total number of apples.


Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array.

The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the

elements in the second array. Assume that the maximum value of n is 15.

 

Output Format:

Refer sample output for details.

 

Sample Input:

5

2

3

6

8

1

1

1

1

1

1

 

Sample Output:

3 4 7 9 2

 

Input (stdin)

2
3
6
1
2


Output (stdout)

4
8

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner in = new Scanner(System.in);

      int n = in.nextInt();

      int a1[] = new int[n];

      int a2[] = new int[n];

      for(int i = 0; i < n; i++)

          a1[i] = in.nextInt();

        for(int i = 0; i < n; i++)

          a2[i] = in.nextInt();

          int temp[] = new int[n];

          for(int i = 0; i < n; i++)

            temp[i] = a1[i] + a2[i];

      for(int i = 0; i < n; i++)

      System.out.println(temp[i]);

    }

}

Compatible array

Write a program to find whether 2 arrays are compatible or not.

Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater

than or equal to the ith element in the second array for all the values of i.


INPUT FORMAT:

Input consists of 2n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the first array. 

The last 'n' integers correspond to the elements in the second array. 

Assume that the maximum value of n is 15.

 

OUTPUT FORMAT:

Refer sample output for details.

 

SAMPLE INPUT:

5

2

3

6

8

1

1

1

1

1

1

 

SAMPLE OUTPUT:

Compatible

 

Input (stdin)

5
2
3
6
8
1
1
1
1
1
2


Output (stdout)

Incompatible

 

Program :-

import java.util.*;

class Main

{

    public static void main (String[] args) 

    {

        Scanner sc=new Scanner(System.in);

    int i,c=0;

   int n=sc.nextInt();

   int arr1[]= new int[n];

   int arr2[]=new int[n];

    for(i=0;i<n;i++)

    {

        arr1[i]=sc.nextInt();

    }

    for(i=0;i<n;i++)

    {

        arr2[i]=sc.nextInt();

    }

    for(i=0;i<n;i++)

    {

        if(arr1[i]>=arr2[i])

        c=0;

        else

        c=1;

    }

    if(c==0)

    {

        System.out.println("Compatible");

    }

    else

    {

    System.out.println("Incompatible");

    }

}

}

Search an element

Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by a user, you need to search if a particular element is present in the array or not. The element to be searched for is also given by the user"


Input Format:

Input consists of n+2 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the array. 

The last integer corresponds to ‘a’, the element to be searched.

 

Output Format:

Refer to sample output for details.

 

Sample Input:

5

2

3

6

8

1

6

 

Sample Output:

6 is present in the array

 

Input (stdin)

5
2
3
6
8
1
9


Output (stdout)

9 is not present in the array

 

Program :-

import java.util.*;

class Main

{

  public static void main(String args[])

  {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int arr[]=new int[n];

    int i,found=0;

    for(i=0;i<n;i++)

    {

      arr[i]=sc.nextInt();

    }

   int ele=sc.nextInt();

    for(i=0;i<n;i++)

    {

        if (arr[i]==ele)

        {

            System.out.printf("%d is present in the array", ele);

            found = 1;

        }

    }

    if (found==0)

        System.out.printf("%d is not present in the array", ele);

  } 

}

Sum of even numbers

Kuty and Pappu are playing a coding game. Kuty gives a set of numbers to Pappu to find the even numbers in the set and sum them. Write a program to help Pappu to solve the game and to win the dairy milk.


Input Format:

Input consists of n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.

 

Output Format:

Refer to sample output for details.

 

Sample Input:

5

2

3

6

8

-1

 

Sample Output:

The sum of the even numbers in the array is 16

 

Input (stdin)

3
4
5
6


Output (stdout)

The sum of the even numbers in the array is 10

 

Program :-

import java.util.*;

class Main

{

public static void main (String[] args) 

{

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int arr[]=new int[n];

    int i,sum=0;

      for(i=0; i<n; i++)

        arr[i]=sc.nextInt();

    for(i=0; i<n; i++)

    {

        if(arr[i]%2==0)

            sum=sum+arr[i];

    }

    System.out.printf("The sum of the even numbers in the array is %d ",sum);       

}

}

Distinct elements

Write a program to find the number of distinct elements in an unsorted array. [Do it without sorting the array]


Input Input:

Input consists of n+1 integers. 

The first integer corresponds to n, the number of elements in the array. 

The next n integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.

 

Output Format:

Output consists of a single integer which corresponds to the number of distinct elements in the array.

 

Sample Input:

5

3

2

3

780

90

 

Sample Output:

4

 

Input (stdin)

5
3
2
3
780
9


Output (stdout)

4

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int c=0;

        int arr[]=new int[n];

        for(int i=0;i<n;i++)

        {

            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++)

        {

            int f=0;

            for(int j=0;j<n;j++)

            {

                if(i==j)

                    continue;

                if(arr[i]==arr[j] && (i>j))

                    f=1;  

            }

            if(f==0)

                c++;

        }

        System.out.printf("%d",c);

    }

}

Sum of even numbers and sum of odd numbers

Arun and Kalai were playing a puzzle game with a given set of numbers.

They need to find the odd and even numbers and find the sum of the odd numbers and the sum of the even numbers.

Write a program to help them to solve the puzzle game and to win the mobile phone.


Input Format:

Input consists of n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.

 

Output Format:

Refer to sample output for details.

 

Sample Input:

5

2

3

6

8

-1

 

Sample Output:

The sum of the even numbers in the array is 16

The sum of the odd numbers in the array is 2

 

Input (stdin)

5
2
4
7
8
1


Output (stdout)

The sum of the even numbers in the array is 14
The sum of the odd numbers in the array is 8

 

Program :-

import java.util.*;

class Main

{

public static void main (String[] args)

{

    Scanner sc=new Scanner(System.in);

    int Size=sc.nextInt();

    int i;

    int a[]=new int[Size];

    int Even_Sum = 0, Odd_Sum = 0;

    for(i = 0; i < Size; i++)

    {

      a[i]=sc.nextInt();

    }

    for(i = 0; i < Size; i ++)

    {

        if(a[i] % 2 == 0)

        {

          Even_Sum = Even_Sum + a[i];

        }

        else

        {

          Odd_Sum = Odd_Sum + a[i];

        }

    }

    System.out.printf("The sum of the even numbers in the array is %d ", Even_Sum);

    System.out.printf("\nThe sum of the odd numbers in the array is %d ", Odd_Sum);

}

}

Compare two arrays

Given two arrays, you need to compare them and display if they are the same or not.


Input Format:

Input consists of 2n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the first array. 

The next ‘n’ integers correspond to the elements in the second array.

Assume that the maximum value of n is 15.

 

Output Format:

Print yes if the 2 arrays are the same. Print no if the 2 arrays are different.

 

Sample Input:

5

2

3

6

8

-1

2

3

6

8

-1

 

Sample Output:

yes

 

Input (stdin)

3
1
4
7
8
5
2


Output (stdout)

No

 

Program :-

import java.util.*;

class Main

{

public static void main (String[] args)

{

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int a[]=new int[n];

    int b[]=new int[n];

    int c=0;

    for(int i=0;i<n;i++)

    {

        a[i]=sc.nextInt();

    }

    for(int i=0;i<n;i++)

    {

        b[i]=sc.nextInt();

    }

    for(int i=0;i<n;i++)

    {   

        if(a[i]==b[i])

        {

            c++;

        }

    }

    if(c==n)

    {

        System.out.println("Yes");

    }

    else

    {

       System.out.println("No");  

    }

}

}

Array insertion

Arun and Ram were playing cards. Arun has 5 cards. Ram wants to insert a new card in between Arun's cards. Ram wants to find the position to insert the card. So help him to find the position to insert a certain card. If Ram inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully. EXAMPLE: consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1 , and a[2] = 2 and a[3] = 3.


Input Format:

Assume that the maximum number of elements in the array is 20.

 

Output Format:

Refer to the sample input and output for formatting specifications.

 

Sample Input:

5

1

2

3

4

5

4

10

 

Sample Output:

Array after insertion is

1

2

3

10

4

5

 

Input (stdin)

4                                                                                                                                                
1                                                                                                                                               
4                                                                                                                                                
7                                                                                                                                               
5                                                                                                                                                
3                                                                                                                                                
10


Output (stdout)

1
4
10
7
5

 

Program :-

import java.util.*;

class Main

{

public static void main (String[] args) 

{

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int arr[]=new int[n];

    int i;

    for(i=0;i<n;i++)

   {

        arr[i]=sc.nextInt();

   }

    int pos,ele;

     pos=sc.nextInt();

    if (pos>n)

    {

        System.out.printf("Invalid Input\n");

    }

    else

    {        

         ele=sc.nextInt();        

        i=0;

        while(i<n)

        {

            if (i==pos-1)

            {

                System.out.printf("%d\n%d\n",ele,arr[i]);

            }

            else

            {

                System.out.printf("%d\n", arr[i]);

            }

            i=i+1;

        }

    }

}

}

Array deletion

Given an array with 'n' elements, Suresh wants to delete an element at a particular position in the array. Help him in deleting the element and displaying the updated array.


Input Format:

Assume that the maximum number of elements in the array is 20.

 

Output Format:

Refer to the sample input and output for formatting specifications.

 

Sample Input:

5

1

2

3

4

5

4

 

Sample Output:

Array after deletion is

1

2

3

5

 

Input (stdin)

5
1
2
3
4
5
4


Output (stdout)

Array after deletion is
1
2
3
5

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        int pos,i;

        for(i=0;i<n;i++)

        {

            arr[i]=sc.nextInt();

        }

        pos=sc.nextInt();

        if (pos>n)

        {

            System.out.printf("Invalid Input");

        }

        else

        {

            System.out.printf("Array after deletion is\n");

            i=0;

            while(i<n)

            {

                if (i!=pos-1)

                    System.out.printf("%d\n", arr[i]);

                i++;

            }

        }       

    }

}

Array mean

Write a program to find the mean of the elements in an array.


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Output consists of a double value which corresponds to the mean of the array and is printed up to 2 digits of precision.

Assume that the maximum number of elements in the array is 20.

 

Sample Output:

Refer to the sample input and output for formatting specifications.

 

Sample Input:

5

2

4

1

3

5

 

Sample Output:

The mean of the array is 3.00

 

Input (stdin)

3
2
5
8


Output (stdout)

The mean of the array is 5.00

 

Program :-

import java.util.*;

class Main

{

    public static void main (String[] args)

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        int i;

        float   mean = 0, sum = 0 ,avg=0;

        for (i=0;i<n;i++ )

        {

            a[i]=sc.nextInt();

        } 

        for (i=0;i<n;i++)

        {

            sum = sum + a[i] ;

            avg = sum / n ;

        } 

        System.out.printf("The mean of the array is %.2f ", avg) ;

    }

}

Array median

Write a program to find the median of the elements in the array. Median is the middle value in the sorted list. If there are an even number of elements in the list, the median is the mean of the 2 middle values.


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Output consists of a double value which corresponds to the median of the array and is printed up to 2 digits of precision.

Assume that the maximum number of elements in the array is 20.

 

Output Format:

Refer sample input and output for formatting specifications.

 

Sample Input:

5

2

4

1

3

5

 

Sample Output:

The median of the array is 3.00

 

Input (stdin)

5
6
9
1
2
3


Output (stdout)

The median of the array is 3.00

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,t;

        double median=0;

        int a[]=new int[n];

        for(i=0;i<n;i++)

        {

            a[i]=sc.nextInt();

        }

        for(i=0;i<n;i++)

        {

            for(j=1;j<n;j++)

            {

                if(a[i]>a[j])

                {

                    t=a[j];

                    a[j]=a[i];

                    a[i]=t;

                }

            }

        }

        if(n%2==1)

        {

            median=a[(n/2)+1];

        }

        else

        {

            if(n%2==0)

            {

                float  inter=a[n/2]+a[(n/2)+1];

                median =inter/2.0;

            }

        }

        System.out.printf("The median of the array is %.2f",median);

    }

}

Array Mode

Write a program to find the mode of the elements in the array.

The mode in a list of numbers refers to the list of numbers that occur most frequently.

It is important to note that there can be more than one mode and if no number occurs more than once in the set,

then there is no mode for that set of numbers.


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Refer sample input and output for formatting specifications.

Assume that the maximum number of elements in the array is 20.

Assume that in the input data set there is 1 mode or no mode at all.

 

Sample Output:

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input:

5

2

4

1

3

5

 

Sample Output:

The mode of the array is none

 

Input (stdin)

3
6
9
2


Output (stdout)

The mode of the array is none

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int arr[]=new int[n];

    int i,j,flag=0;

    for(i=0;i<n;i++)

    {

        arr[i]=sc.nextInt();

    }

    for(i=0;i<n;i++)

    {

        for(j=i+1;j<n;j++)

        {

            if(arr[j]==arr[i])

            {

                flag=1;

                System.out.printf("Mode=%d ",arr[i]);

            }

        }

    }

    if(flag==0)

    {

        System.out.printf("The mode of the array is none");

    }   

    }

}

Array Range

Write a program to find the range of the elements in the array. Range of an array is the difference between

the maximum and minimum element in an array,


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Assume that the maximum number of elements in the array is 20.

 

Output Format:

Output consists of an integer which corresponds to the range of the array.

 

Sample Input:

5

2

4

1

3

5

 

Sample Output:

The range of the array is 4

 

Input (stdin)

3
5
6
4


Output (stdout)

The range of the array is 2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for( int i = 0 ; i < n ; i++ )

            a[i] = s.nextInt();

        int max = a[0],low = a[0];

        for( int i = 0 ; i < n ; i++ ){

                if( a[i] > max)

                    max = a[i];

                if( a[i] < low )

                    low = a[i];

        }

        int range = max - low;

        System.out.println("The range of the array is "+range);     

}

}

Functions – Array Type

Write a program to find the type of array using functions. An array is said to be “Even” if all the elements

in the array are even. An array is said to be “Odd” if all the elements in the array are odd. An array is said to

 be “Mixed” if it contains some odd elements and some even elements. Refer function specifications for the

function details. The first argument corresponds to the number of elements in the array.

The second argument corresponds to the pointer to an array.

The return value of the function should be 1 if the array is Even.

The return value of the function should be 2 if the array is Odd.

The return value of the function should be 3 if the array is Mixed.


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Assume that the maximum number of elements in the array is 20.

 

Sample Output:

Refer sample input and output for formatting specifications.

 

Sample Input:

5

2

4

1

3

5

 

Sample Output:

The array is Mixed

 

Input (stdin)

5
1
2
3
6
9


Output (stdout)

The array is Mixed

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        int n,i,odd=0,even=0;

        n=s.nextInt();

        int a[]=new int[20];

        for(i=0;i<n;i++)

        {

            a[i]=s.nextInt();

        }

        for(i=0;i<n;i++)

        {

            if(a[i]%2==0)

            {

                even++;

            }

            else if(a[i]%2==1)

            {

                odd++;

            }

        }

        if(even==n)

        {

            System.out.println("The array is Even");

        }

        else if(odd==n)

        {

            System.out.println("The array is Odd");           

        }

        else

        {

            System.out.println("The array is Mixed");

        }

    }

}

2D-ARRAY

Maximum Element In The Matrix

A group of children playing in the garden. The old man needs help but he needs elder boy from the children . Help the old man to find the elder boy from that children. Write a program to find the maximum element in the matrix.


 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input:

 

3

2

4 5

6 9

0 3

 Sample Output:

 9

Input (stdin)

2
2
56 62
96 36


Output (stdout)

96

 

Program :-

import java.util.Scanner;

public class Main

{

  public static void main(String[] args) 

  {

  int rows; 

  int columns;

  Scanner scanner = new Scanner (System.in);

  rows = scanner.nextInt(); 

  columns = scanner.nextInt(); 

  int[][] matrix = new int [rows][columns];

  for (int i = 0; i < rows; i++) 

  {

     for (int j = 0; j < columns; j++) 

     {

         matrix[i][j] = scanner.nextInt();

     }

  }

  int maxNum = matrix[0][0];

  for (int i = 0; i < matrix.length; i++) 

  {

   for (int j = 0; j < matrix[i].length; j++) 

   {

    if(maxNum < matrix[i][j])

    {

     maxNum = matrix[i][j];

    }

   }

  }

  System.out.println(maxNum);

 }

}

Maximum Element In Each Row

There are some students in the class. The class Adviser needs a recruitment's process for above 60% students.

In each and every row there was a student above 60% . Help your adviser to find the students in each row.


 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m,

the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix.

The remaining integers correspond to the elements in the matrix.

The elements are read in row wise order, first row first, then second row and so on.

 Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input:

 

3

2

4 5

6 9

0 3

 Sample Output:

5

9

3

Input (stdin)

2
2
56 62
96 36


Output (stdout)

62
96

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s = new Scanner(System.in);

int m = s.nextInt();

int n = s.nextInt();

int[][] a = new int[m][n];

for( int i = 0 ; i < m ; i++ ){

    for( int j = 0 ; j < n ; j++ ){

        a[i][j] = s.nextInt();       

    }

}

int max1 = a[0][0];

for( int i = 0 ; i < m ; i++ ){

    for( int j = 0 ; j < n ; j++ ){

        if( a[i][j] > max1 )

            max1 = a[i][j];

    }

    System.out.println(max1);

    max1 = 0;

}

}

}

Maximum Element In Each Column

In a family the people are arranged in rows and columns.

Male persons in the families arranged in a row and females are arranged in a column.

Find the biggest women in the each column.Help me to find the biggest women.

Write a program to find the maximum element in each column of the matrix.


 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m,

the number of rows in the matrix and the second integer corresponds to n,

the number of columns in the matrix. The remaining integers correspond to the elements in the matrix.

The elements are read in row wise order, first row first, then second row and so on.

Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input:

 

3

2

4 5

6 9

0 3

 Sample Output:

6 

9

Input (stdin)

2
2
56 62
96 36


Output (stdout)

96
62

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s = new Scanner(System.in);

int m = s.nextInt();

int n = s.nextInt();

int[][] a = new int[m][n];

for( int i = 0 ; i < m ; i++ ){

    for( int j = 0 ; j < n ; j++ ){

        a[i][j] = s.nextInt();       

    }

}

int max1 = a[0][0];

for( int i = 0 ; i < n ; i++ ){

    for( int j = 0 ; j < m ; j++ ){

        if( a[j][i] > max1 )

            max1 = a[j][i];

    }

    System.out.println(max1);

    max1 = 0;

}

}

}

Matrix Sum

Shobitha and Siddhesh were playing puzzles. They are having two puzzles in their hand.

They need to join the puzzle to get the correct puzzle. Help them to find the puzzle.


 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m,

the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix.

The remaining integers correspond to the elements in the matrix.

The elements are read in row-wise order, first row first, then second row and so on.

Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input 1:

3

2

4 5

6 9

0 3

 

Sample Output 1:

 27

Input (stdin)

2
2
45 65
23 62


Output (stdout)

195

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s = new Scanner(System.in);

int m = s.nextInt();

int n = s.nextInt();

int sum = 0; 

int[][] a = new int[m][n];

for( int i = 0 ; i < m ; i++ ){

    for( int  j = 0 ; j < n ; j++ ){

        a[i][j] = s.nextInt();

    }

}

for( int i = 0 ; i < m ; i++ ){

    for( int  j = 0 ; j < n ; j++ ){

        sum += a[i][j];

    }

}

System.out.println(sum);

}

}

Magic Square

A magic square is an arrangement of numbers (usually integers) in a square grid,

where the numbers in each row, and in each column, and the numbers in the forward and backward main diagonals,

 all add up to the same number. Write a program to find whether a given matrix is a magic square or not.


 

Input Format:

The input consists of (n*n+1) integers.

The first integer corresponds to the number of rows/columns in the matrix.

The remaining integers correspond to the elements in the matrix.

The elements are read in rowwise order, first row first, then second row and so on.

Assume that the maximum value of m and n is 5.

 

Output Format:

Print "yes" if it is a magic square. Print "no" if it is not a magic square.

 

Sample Input 1:

2

4 5

5 4

 

Sample Output 1:

no

·         

Input (stdin)

2
4 5
5 4


Output (stdout)

no

 

Program :-

import java.util.Scanner;

class Main

{

public static void main(String args[])

{

Scanner s = new Scanner(System.in);

int n = s.nextInt();

int[][] a = new int[n][n];

int sum1=0,sum2=0;

for( int i = 0 ; i < n ; i++ ){

    for( int j = 0 ; j < n ; j++ ){

        a[i][j] = s.nextInt();       

    }

}

    for( int i = 0 ; i < n ; i++ ){

    for( int j = 0 ; j < n ; j++ ){

        if ( i == j)

            sum1 += a[i][j];

        if( i + j == ( n - 1 ) )

            sum2 += a[i][j];

    }

}

if( sum1 != sum2 )

    System.out.println("no");

else{

    int s1=0,s2=0,s3=0;

    int a1=0,a2=0,a3=0;

    for( int i = 0 ; i < n ; i++ ){

        for( int j = 0 ; j < n ; j++ ){

            if( i == 0 )

                s1+= a[i][j];

            if( i == 1 )

                s2 += a[i][j];

            if( i == 2 )

                s3 += a[i][j];

            if( j == 0 )

                a1 += a[i][j];

            if( j == 1 )

                a2 += a[i][j];

            if( j == 2 )

                a3 += a[i][j];

        }

    }

    if( s1 == a1 && s2 == a2 && s3 == a3 )

           System.out.println("yes");

    else

            System.out.println("no");

}

}

}

Diagonal Matrix

Diagonal Matrix. A square matrix which has zeros everywhere other than the main diagonal.

Entries on the main diagonal may be any number, including 0.

 Write a program to find whether a given matrix is a diagonal matrix or not.


 

Input Format:

The input consists of (n*n+1) integers.

The first integer corresponds to the number of rows/columns in the matrix.

The remaining integers correspond to the elements in the matrix.

The elements are read in rowwise order, first row first,

then second row and so on. Assume that the maximum value of m and n is 5.

 

Output Format:

Print yes if it is a diagonal matrix. Print no if it is not a diagonal matrix.

 

Sample Input :

2

4 5

5 4

 

Sample Output:

no

Input (stdin)

2
4 5
5 4


Output (stdout)

no

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])throws Exception

    {

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();

        int A[][]=new int[m][m];

        for(int i=0;i<m;i++)

        {

            for(int j=0;j<m;j++)

            {

                A[i][j]=sc.nextInt();

            }

        }

      int p=0, q=0;

        for(int i=0;i<m;i++)

        {

            for(int j=0;j<m;j++)

            {

                if(i!=j && A[i][j]!=0) 

                {

                    p=1;

                    break;

                }

                if(i==j && A[i][j]==0) 

                {

                    q++;

                }

            }

        }        

        if(p==0 && q<m)

            System.out.println("yes");

        else

            System.out.println("no");

    }

}

Upper Triangular Matrix

An upper triangular matrix is a square matrix in which all the elements below the diagonal are zero.

That is, all the non-zero elements are in the upper triangle:

Write a JAVA program to find whether a given matrix is an upper triangular matrix or not.


Input Format:

The input consists of (n*n+1) integers.

The first integer corresponds to the number of rows/columns in the matrix.

The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order,

first row first, then second row and so on. Assume that the maximum value of m and n is 5.

 

Output Format:

Print "yes" if it is an upper triangular matrix . Print "no" if it is not an upper triangular matrix.

 

Sample Input 1:

2

1 2

0 3

 

Sample Output 1:

yes

Input (stdin)

2
1 2
0 3


Output (stdout)

yes

 

Program :-

import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        int row, col;

        boolean isUpperTriangular = true;

        Scanner scanner = new Scanner(System.in);

        row = scanner.nextInt();

        col = scanner.nextInt();

        int inputArray[][] = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                inputArray[i][j] = scanner.nextInt();

            }

        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < i; j++) {

                if (inputArray[i][j] != 0) {

                    isUpperTriangular = false;

                    break;

                }

            }

            if (!isUpperTriangular) {

                break;

            }

        }

        //8

        if(isUpperTriangular){

            System.out.println("yes");

        }else{

            System.out.println("no");

        }

    }

}

Lower Triangular Matrix

A lower triangular matrix is a square matrix in which all the elements above the diagonal are zero.

That is, all the non-zero elements are in the lower triangle:

Write a JAVA program to find whether a given matrix is a lower triangular matrix or not.


Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix.

The remaining integers correspond to the elements in the matrix. The elements are read in row wise order,

first row first, then second row and so on. Assume that the maximum value of m and n is 5.

 

Output Format:

Print "yes" if it is a lower triangular matrix . Print "no" if it is not a lower triangular matrix.

 

Sample Input 1:

2

1 0

2 3

 

Sample Output 1:

yes

Input (stdin)

2
1 0
2 3


Output (stdout)

yes

 

Program :-

import java.util.Scanner;

public class Main

{

public static void main(String args[])throws Exception

{

Scanner sc=new Scanner(System.in);

int m=sc.nextInt();

int A[][]=new int[m][m];

for(int i=0;i<m;i++)

{

for(int j=0;j<m;j++)

{

A[i][j]=sc.nextInt();

}

        }

int p=0;

for(int i=0;i<m;i++)

{

for(int j=i+1;j<m;j++)

{

if(A[i][j]!=0) 

{

p=1;

break;

}

}

}

if(p==0)

System.out.println("yes");

else

System.out.println("no");

}

}

STRING-I

Print the String

Write a program to scan the string from the user and to print it.

 

Input Format:

Input consist of 1 string.

 

Sample Input:

Hello

 

Sample Output:

Hello

Input (stdin)

Hello


Output (stdout)

Hello

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.print(a);

    }

}

Print the String 2

Write a program to scan the string from the user and to print it.


 

Input Format:

Input consist of 1 string.

 

Sample Input:

Hello World

 

Sample Output:

Hello World

Input (stdin)

Hello World


Output (stdout)

Hello World

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.println(a);

    }

}

String - Length - I

Write a program to find the length of the given string using string library functions:


Input Format:

Input consist of 1 string.

 

Sample Input:

Face

 

Sample Output:

4

Input (stdin)

Face


Output (stdout)

4

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.println(a.length());

    }

}

String - Copy

Write a program to copy a string from one variable to other using string library functions:


 

Input Format:

Input consist of 1 string.

 

Sample Input:

hello

 

Sample & Output:

hello

Input (stdin)

hello


Output (stdout)

hello

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.println(a);

    }

}

String - Reverse

Write a program to find the reverse of the given without string using string library functions:


 

Input Format:

Input consist of 1 string.

 

Sample Input:

hello

 

Sample & Output:

olleh

Input (stdin)

hello


Output (stdout)

olleh

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner sc = new Scanner(System.in);

      String s = sc.nextLine();

      int i = s.length();

      while(i>0)

      {

        System.out.print(s.charAt(i-1));

        i--;

      }

    }

}

String - Compare

Write a program to find whether the given two strings are same or not using string library functions:


 

Input Format:

Input consist of 2 string.

 

Output Format:

If two strings are same display “Strings are same”,else display “Strings are not same”.

 

Sample Input:

hello

 

Sample & Output:

hello

Input (stdin)

hello
hello


Output (stdout)

Strings are same

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = s.nextLine();

      if(a.equals(b) == true)

      {

        System.out.println("Strings are same");

      }

      else

      {

        System.out.println("Strings are not same");

      }

    }

}

String - Upper case

Write a program to change the given string to uppercase without using string library functions


 

Input Format:

Input consist of 1 string.

 

Sample Input:

good

 

Sample Output:

GOOD

Input (stdin)

good


Output (stdout)

GOOD

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.println(a.toUpperCase());

    }

}

String - Lower case

Write a program to change the given string to lowercase using string library functions


 

Input Format:

Input consist of 1 string.

 

Sample Input:

FACE

 

Sample Output:

face

Input (stdin)

FACE


Output (stdout)

face

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.println(a.toLowerCase());

    }

}

String - Palindrome

Write a program to find whether the given string is palindrome or not without using string library functions:


 

Input Format:

Input consist of 1 string.

 

Output Format:

If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.

 

 

Sample Input:

computer

 

Sample Output:

Not a Palindrome

Input (stdin)

amma


Output (stdout)

Palindrome

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = "";

      int n = a.length();

      for(int i = n - 1; i >= 0; i--)

      {

        b = b + a.charAt(i);

      }

      if(a.equalsIgnoreCase(b))

      {

        System.out.println("Palindrome");

      }

      else

      {

        System.out.println("Not a Palindrome");

      }

    }

}

String - Count Vowels

Write a program to count the number of vowels in the given string:


 

Input Format:

Input consist of 1 string.

 

Sample Input:

face

 

Sample & Output:

2

Input (stdin)

face


Output (stdout)

2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      int c = 0;

      Scanner sc = new Scanner(System.in);

      String s = sc.nextLine();

      for(int i=0; i<s.length();i++)

      {

        char ch = s.charAt(i);

        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){

          c++;

        }

      }

      System.out.println(c);

    }

}

String - Concatenate

There were two best friends. They had a fight between them and they were not talked with each other.

Help those two peoples to join again and let them enjoyed. Find the concatenation of given two strings using

string library functions:


 

Input Format:

Input consist of 2 string.

 

Sample Input:

Face

Academy

 

Sample Output:

FaceAcademy

Input (stdin)

Face
Academy


Output (stdout)

FaceAcademy

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      int c = 0;

      Scanner sc = new Scanner(System.in);

      String s = sc.nextLine();

      String t = sc.nextLine();

      System.out.println(s.concat(t));

    }

}

STRING-II

 

Remove "the" occurrence

In the certain area there was a camp of polio drops team. They need to search every baby in the particular area. They want to find the baby and take out the baby for polio drops. Help them to find the baby to avoid polio attacks. (remove the occurrence of “the” word from entered string). [Hint: To get a whole sentence use the following statement: scanf("%[^\n]",a);]


 

Input Format:

Input consists of a string.

 

Output Format:

remove "the" occurrence of the word from entered string.

 

Sample Input:

the height of Mt.Everest is 8448 m.

 

Sample Output:

height of Mt.Everest is 8448 m.

Input (stdin)

the height of Mt.Everest is 8448 m.


Output (stdout)

height of Mt.Everest is 8448 m.

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      a = a.replaceAll("the","");

      a = a.substring(1,a.length());

      System.out.println(a);

    }

}

Special School

A special school is run by an NGO for kids with Dyslexia. As we all know these children will start writing the letters backwards or in reverse. Once special care is taken to correct this issue and once they are introduced to words, they will start writing the words in reverse. The teachers do not want to discourage the children at the start itself and they have decided to mark the works written in reverse also as correct. Can you please help the teacher in correcting the answer sheets by writing a JAVA program? Write a JAVA program to check whether the second word is the reverse of first word. Do not use strrev function.


 

Input Format:

Input consists of 2 strings. Assume that the maximum length of the string is 50.

 

Output Format:

If the two strings are same print "It is same" else print "It is not same".

 

Sample Input:

Excellent

tnellecxE

 

Sample Output:

It is same

Input (stdin)

Excellent
tnellecxE


Output (stdout)

It is same

 

Program :-

import java.util.*;

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner in = new Scanner(System.in);

      String word = in.nextLine();

      String b = in.nextLine();

      word = word.trim();

      String result = "";

      char[] ch=word.toCharArray();

      for (int i = ch.length - 1; i >= 0; i--) {

        result += ch[i];

}

   String c = result.trim();

      if(b.equals(c)==true)

      {

        System.out.println("It is same");

      }

      else

      {

        System.out.println("It is not same");

      }

}

}

Delete Vowels

Write a program to delete all vowels present in a string.


 

Input Format:

Input consists of a string. Assume that all characters in the string are lowercase letters and the maximum length of the string is 200.

 

Output Format:

print the string without vowels

 

Sample Input:

amphisoft

 

Sample Output:

mphsft

Input (stdin)

face


Output (stdout)

fc

 

Program :-

import java.util.*;

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      String b;

      Scanner in = new Scanner(System.in);

      String a = in.nextLine();

      b = a.replaceAll("[aeiou]","");

      System.out.println(b);

}

}

Letter Frequency

Write a program to compute the frequency of each lowercase letter in the string.


 

Input Format:

Input consists of a string. Assume that all characters in the string are lowercase letters and the maximum length of the string is 200.

 

Output Format:

The letters are displayed sorted in ascending order.

 

Sample Input:

anitha

 

Sample Output:

a 2

h 1

i 1

n 1

t 1

Input (stdin)

google


Output (stdout)

e1
g2
l1
o2

 

Program :-

import java.util.Scanner;

import java.util.Arrays;

class Main

{

    public static void main(String args[])

    {

      Scanner in = new Scanner(System.in);

      String a = in.nextLine();

      char charArray[] = a.toCharArray();

      Arrays.sort(charArray);

      a = new String(charArray);

      int n = a.length();

      int[] freq = new int[200];

      for(int i=0;i<n;i++)

        freq[a.charAt(i) -'a']++;

      for(int i=0;i<n;i++){

        if(freq[a.charAt(i)-'a'] != 0) {

          System.out.print(a.charAt(i));

          System.out.println(freq[a.charAt(i) -'a']+" ");

          freq[a.charAt(i)-'a']=0;

        }

      }

    }

}

Total no of Char_String

Write a Program to count the total number of characters in a string.


Sample Input :

I love programming@

Sample Output :

Total number of characters in a string: 17

Input (stdin)

Happy learning !!!


Output (stdout)

Total number of characters in a string: 16

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      a = a.replaceAll(" ","");

      int b = a.length();

      System.out.printf("Total number of characters in a string: %d",b);

    }

}

The Anagram String_Java

Write a Program to determine whether two strings are the anagram


Sample Input :

Apple

apple

 

Sample Output :

Anagram

Input (stdin)

Apple
app


Output (stdout)

Not an anagram

 

Program :-

import java.util.Scanner;

import java.util.Arrays;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = s.nextLine();

      boolean status = true;  

        if (a.length() != b.length()) {  

            status = false;  

        } else {  

          char[] ArrayS1 = a.toLowerCase().toCharArray();

          char[] ArrayS2 = b.toLowerCase().toCharArray();

          Arrays.sort(ArrayS1);  

          Arrays.sort(ArrayS2);  

          status = Arrays.equals(ArrayS1, ArrayS2);

        }

      if(status){

        System.out.println("Anagram");

      }

      else{

        System.out.println("Not an anagram");

      }

    }

}

Divide a String_Java

Write a Program to divide a string in 'N' equal parts. Here, our task is to divide the string S into n equal parts. We will print an error message if the string cannot be divisible into n equal parts otherwise all the parts need to be printed as the output of the program. To check whether the string can be divided into N equal parts, we need to divide the length of the string by n and assign the result to variable chars. If the char comes out to be a floating-point value, we can't divide the string otherwise run for loop to traverse the string and divide the string at every chars interval.


Input Format :

Input consist of a Strings and Integer

Output Format :

Output consist of an Integer and String

 

Sample Input :

Happy learning

3

Sample Output:

Sorry this string cannot be divided into 3 equal parts.

Input (stdin)

Happy learning
2



Output (stdout)

2 equal parts of given string are
Happy l
earning

 

Program :-

import java.util.*;

public class Main  

{ 

    static void divide(String str, int n) 

    { 

        int sub_size;  

        if (str.length() % n != 0) 

        { 

            System.out.println("Sorry this string cannot be divided into "+n+" equal parts.");

            return; 

        }

        sub_size = str.length() / n; 

        System.out.print(n+" equal parts of given string are");

        for (int i = 0; i< str.length(); i++) 

        { 

            if(i % sub_size == 0) 

            System.out.println();  

            System.out.print(str.charAt(i)); 

        } 

    }   

    public static void main(String[] args) 

    { 

        Scanner si=new Scanner(System.in);

        String str = si.nextLine();

        int n=si.nextInt();

        divide(str, n); 

    } 

} 

Subset of a String_Java

Program to find all subsets of a string and print it in sorted order. In this program, all the subsets of the string need to be printed. The subset of a string is the character or the group of characters that are present inside the string. All the possible subsets for a string will be n(n+1)/2. For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.


Input Format :

Input consist of a String

Otput Format :

Output consist of a String

 

Sample Input :

java

Output Format :

a

a

av

ava

j

ja

jav

java

v

va

Input (stdin)

AbcD


Output (stdout)

Sorted Substring
a
ab
abc
abcd
b
bc
bcd
c
cd
d

 

Program :-

import java.util.*;

class Main 

{ 

    public static void main(String args[])

    {

        Scanner s = new Scanner(System.in);

        String a = s.nextLine();

        a = a.toLowerCase();

        int len = a.length();

        int temp=0;

        String arr[] = new String[len*(len+1)/2];

        for(int i=0;i<len;i++){

            for(int j = i; j < len ; j++){

                arr[temp]=a.substring(i,j+1);

                temp++;

            }

        }

        Arrays.sort(arr);

        System.out.println("Sorted Substring");

        for(int i=0; i<arr.length;i++){

            System.out.println(arr[i]);

        }

    }

}

Minimum number string_Java

Write Java program to find the minimum number in the given String.


Input format:

The Input consists of String

Output format:

The Output consists of Integer

Sample Input:

12pro4gra90m

Sample Output:

4

Input (stdin)

lar5g6e


Output (stdout)

5

 

Program :-

import java.util.*;

class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

String str = sc.next();

String temp = "";

int i,min=1000000000,num;

for(i=0;i<str.length();i++){

      char ch = str.charAt(i);

      if(Character.isDigit(ch))

      {

        temp=temp+ch;

      }

      else if(temp!=""){

        num = Integer.parseInt(temp);

        if(num<min)

          min=num;

        temp="";

      }

    }

    if(temp!=""){

      num = Integer.parseInt(temp);

      if(min<num)

        System.out.print(min);

      else

        System.out.print(num);

    }

    else

      System.out.print(min);

  }

}

String_Spaces_Java

Write a Program to remove all the white spaces from a string


Input Format :

Input consist of an Integer

Output Format :

Output consist of an Integer

 

Sample Input :

123 456 7890

Sample Output :

123 456 7890

Input (stdin)

Hello world


Output (stdout)

Helloworld

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      System.out.print(a.replaceAll(" ",""));

    }

}

String_Rotation_Java

Write a Program to determine whether one string is a rotation of another or not.


Input Format :

Input consist of a String

Output Format :

Output consist of a String

Sample Input :

abcde

cdeab

Sample Output:

Second string is a rotation of first string

Input (stdin)

Madam
madam


Output (stdout)

Second string is not a rotation of first string

 

Program :-

import java.util.*;

class Main{

  public static boolean checkRotation(String st1, String st2){

    if (st1.length() != st2.length()){

      return false;

    }

    String st3 = st1 + st1;

    if (st3.contains(st2))

      return true;

    else

      return false;

  }

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    String str1 = s.nextLine();

    String str2 = s.nextLine();

    if (checkRotation(str1, str2)){

      System.out.println("Second string is a rotation of first string");

    }

    else{

      System.out.println("Second string is not a rotation of first string");

    }

  }  

}  

Max and Mini_String _Java

Program to find a maximum and minimum occurring character in a string.

In this program, we need to count each character present in the string and find out the maximum and minimum

occurring character. The grass is greener on the other side In the above example, character 'a' has occurred

only once in the string. So, it is a minimum occurring character and is highlighted by red.

Character e has occurred a maximum number of times in the entire string i.e. 6 times.

Hence, it is the maximum occurring character and is highlighted by green


Input Format :

Input consist of a Strings

Input Format :

Output consist of a strings

 

Sample Input :

Apple is good for health

Sample Output :

Minimum occurring character: A

Maximum occurring character: o

Input (stdin)

Oolala


Output (stdout)

Minimum occurring character: O
Maximum occurring character: l

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String str = s.nextLine();

      str = str.replaceAll(" ","");

      int[] freq = new int[str.length()];    

      char minChar = str.charAt(0), maxChar = str.charAt(0);    

      int i, j, min, max;            

      char string[] = str.toCharArray();    

      for(i = 0; i < string.length; i++) {    

          freq[i] = 1;    

          for(j = i+1; j < string.length; j++) {    

              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    

                  freq[i]++;    

                  string[j] = '0';    

              }    

          }    

      }    

      min = max = freq[0];    

      for(i = 0; i <freq.length; i++) {    

          if(min > freq[i] && freq[i] != '0') {    

              min = freq[i];    

              minChar = string[i];    

          }    

          if(max < freq[i]) {    

              max = freq[i];    

              maxChar = string[i];    

          }    

      }    

      System.out.println("Minimum occurring character: " + minChar);

      System.out.println("Maximum occurring character: " + maxChar);

    }

}

Frequency of char_String_Java

Write a program to find the frequency of characters.


Input Format :

Input consist of a Strings

Output Format :

Output consist of a Strings and Integers

 

Sample Input :

Perfect picture

Sample Output :

Characters and their corresponding frequencies

P-1

e-3

r-2

f-1

c-2

t-2

p-1

i-1

u-1

Input (stdin)

Oolala


Output (stdout)

Characters and their corresponding frequencies
O-1
o-1
l-2
a-2

 

Program :-

import java.util.*;

class Main 

{  

     public static void main(String[] args) {  

       Scanner sc=new Scanner(System.in);

        String str = sc.nextLine();  

        int[] freq = new int[str.length()];  

        int i, j;  

        char string[] = str.toCharArray();    

        for(i = 0; i <str.length(); i++) {  

            freq[i] = 1;  

            for(j = i+1; j <str.length(); j++) {  

                if(string[i] == string[j]) {  

                    freq[i]++;

                  string[j] = '0';  

                }  

            }  

        }  

        System.out.println("Characters and their corresponding frequencies");  

        for(i = 0; i <freq.length; i++) {  

            if(string[i] != ' ' && string[i] != '0')  

                System.out.println(string[i] + "-" + freq[i]);  

        }  

    }  

}  

largest and smallest _ String._Java

Write a program to find the largest and smallest word in a string.


Input Format :

Input consist of a String

Output Format :

Input consist of a String

 

Sample Input :

Life is beautiful

Sample Output :

Smallest word: is

Largest word: beautiful

Input (stdin)

An apple keeps a- doctor away.


Output (stdout)

Smallest word: An
Largest word: doctor

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String string = s.nextLine();

      String word = "", small = "", large="";    

      String[] words = new String[100];

      int length = 0;

      string = string + " ";

       for(int i = 0; i < string.length(); i++){    

          if(string.charAt(i) != ' '){    

              word = word + string.charAt(i);    

          }    

          else{    

              words[length] = word;    

              length++;    

              word = "";    

          }    

      }            

      small = large = words[0];    

      for(int k = 0; k < length; k++){    

          if(small.length() > words[k].length())    

              small = words[k];    

          if(large.length() < words[k].length())    

              large = words[k];    

      }    

      System.out.println("Smallest word: " + small);    

      System.out.println("Largest word: " + large);

    }

}

Upper case_String_Java

Write a Program to replace lower-case characters with upper-case and vice-versa


Input Format :

Input consist of a Strings and Integer

Output Format :

Output consist of Strings

 

Sample Input :

A man without money is a bow without an arrow

Sample Output :

String after case conversion : a MAN WITHOUT MONEY IS A BOW WITHOUT AN ARROW

Input (stdin)

haPPy LearNinG


Output (stdout)

String after case conversion : HAppY lEARnINg

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String str1 = s.nextLine();

      StringBuffer newStr=new StringBuffer(str1);

      for(int i = 0; i < str1.length(); i++) {

        if(Character.isLowerCase(str1.charAt(i))) {

          newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));

        }

        else if(Character.isUpperCase(str1.charAt(i))) {

          newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));

        }

      }

      System.out.println("String after case conversion : " + newStr);

    }

}

Specefic_Char_String_Java

Write a Program to replace the spaces of a string with a specific character.


Input Format :

Input consist of a String

Output Format :

Output consist of a String

 

Sample Input :

Hope The Best

$

Sample Output :

Hope$The$Best

Input (stdin)

Once in a blue moon day
-


Output (stdout)

Once-in-a-blue-moon-day

 

Program :-

import java.util.*;

class Main

{

    public static void main(String args[])

    {

      Scanner sc = new Scanner(System.in);

      String str = sc.nextLine();

      char ch = sc.next().charAt(0);

      str = str.replace(' ',ch);

      System.out.print(str);

    }

}

compare String_Java

Write a Java program to find the substring in a given string and replace with another string.


Note:

The input will be the string, the word to be replaced and the word to be replaced with.

The output will be the final statement which contains the replaced word.

Sample Input:

Give me some sunshine

sunshine

rain

Sample Output:

Give me some rain

Input (stdin)

good student good teacher
teacher
trainer


Output (stdout)

good student good trainer

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = s.nextLine();

      String c = s.nextLine();

      a = a.replaceAll(b,c);

      System.out.println(a);

    }

}

Swap two Strings_Java

Write a Java Program to swap two string variables without using a third or temp variable.


Input Format :

Input consist of a Strings and Integer

Output Format :

Output consist of a Strings and Integer

 

Sample Input :

Good 

Morning

Sample Output:

Strings before swapping: Good Morning

Strings after swapping: Morning Good

Input (stdin)

111213
+-*/


Output (stdout)

Strings before swapping: 111213 +-*/
Strings after swapping: +-*/ 111213

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = s.nextLine();

      String c = "Morning";

      if(b.equals(c)==true)

      {

      System.out.println("Strings before swapping: "+a+""+b);

      a = a+b;

      b = a.substring(0,a.length()-b.length());

      a = a.substring(b.length());

      System.out.println("Strings after swapping: "+a+" "+b);

      }

      else

      {

        System.out.println("Strings before swapping: "+a+" "+b);

      a = a+b;

      b = a.substring(0,a.length()-b.length());

      a = a.substring(b.length());

      System.out.println("Strings after swapping: "+a+" "+b);

      }

    }

}

Palindrome _String_Java

Write a program to determine whether a given string is palindrome or not.


Input Format :

Input consist of a String

Output Format :

Output consist of a String

 

Sample Input :

Live on time emit no evil

Sample Output :

Palindrome

Input (stdin)

Doctor


Output (stdout)

Not a palindrome

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

      Scanner s = new Scanner(System.in);

      String a = s.nextLine();

      String b = "";

      int n = a.length();

      for(int i = n - 1; i >= 0; i--)

      {

        b = b + a.charAt(i);

      }

      if(a.equalsIgnoreCase(b))

      {

        System.out.println("Palindrome");

      }

      else

      {

        System.out.println("Not a palindrome");

      }

    }

}

RECURSION

Maximum element in array

Write a program to compute the sum of elements in an array using recursion.


Input Format:

Input consists of n+1 integers.

 

Output Format:

Print the maximum elements in an array.

Refer sample input and output for formatting specifications.

 

Sample Input :

6

2

5

1

7

4

2

 

Sample Output:

Maximum element in the array is 7

Input (stdin)

5
6
3
2
5
9


Output (stdout)

Maximum element in the array is 9

 

Program :-

import java.util.Arrays;

import java.util.Scanner;

public class Main {

   public static void main(String args[])

   {

      Scanner s = new Scanner(System.in);

      int size = s.nextInt();

      int a[] = new int [size];

      int max = a[0];

      for(int i = 0; i<size; i++)

      {

          a[i] = s.nextInt();

      }

      for(int i=0; i<size; i++)

      {

        if(a[i] > max)

{

max = a[i];

}

      }

      System.out.println("Maximum element in the array is " +max);

   }

}

Factorial

Write a program to compute the factorial of a number using recursion.


 

Input Format:

Input consists of an integer.

 

Output Format:

Print the factorial of the given number

Refer sample input and output for formatting specifications. 

 

Sample Input:

5

 

Sample Output:

The factorial of 5 is 120

Input (stdin)

5


Output (stdout)

The factorial of 5 is 120

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        long fact = fact(n);      

        System.out.println("The factorial of " + n + " is " + fact);

    }

    public static long fact(int n)

    {

        if (n >= 1)

            return n * fact(n- 1);

        else

            return 1;

    }        

}

Fibonacci Series

Write a program to find the nth term in the 

Fibonacci series using recursion. Note that the first 2 terms in the Fibonacci Series are 0 and 1.


Input and Output Format: 

Input consists of an integer.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output:

4

 

Sample Output:

The term 4 in the fibonacci series is 2

Input (stdin)

4


Output (stdout)

The term 4 in the fibonacci series is 2

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

        int n,result;

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        result=fibo(n);

        System.out.println("The term "+n+" in the fibonacci series is "+result);

    }

    static int fibo(int n)

    {

        if(n==1)

        {

            return 0;

        }

        else if(n==2)

        {

            return 1;

        }

        else

        {

            return (fibo(n-1)+fibo(n-2));

        }

    }

}

Compute a^n

Write a program to compute a^n (a power n) using recursion.


Input and Output Format: 

Input consists of an integer.

Refer sample input and output for formatting specifications.

 

Sample Input and Output:

2

8

 

Sample Output:

The value of 2 power 8 is 256

Input (stdin)

2
8


Output (stdout)

The value of 2 power 8 is 256

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {

       int result;

       Scanner sc=new Scanner(System.in);

       int a=sc.nextInt();

       int n=sc.nextInt();

        result=power(a,n);

        System.out.println("The value of "+a+" power "+n+" is "+result);       

    }

    static int power(int a,int n)

    {

        if(n!=0)

        {

           return a*power(a,n-1);

        }

        return 1;

    }

}

Sum of digits

Write a program to find the sum of digits in a number using recursion.


 

Input Format:

Input consists of a non - negative integer.

 

Output Format:

Print the sum of digits of a given number.

Refer sample input and output for formatting specifications.

 

Sample Input:

432

 

Sample Output:

The sum of digits in 432 is 9

Input (stdin)

432


Output (stdout)

The sum of digits in 432 is 9

 

Program :-

import java.util.Scanner;

class Main

{

    public static void main(String args[])

    {       

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int sum=sum(n);

        System.out.println("The sum of digits in " + n + " is "+sum);

    }

    public static int sum(int n)

    {

         if (n == 0) 

        return 0;

        else

       return (n % 10 + sum(n / 10));    

    }

}

Number of digits

Write a program to find the number of digits in a number using recursion.

 

Input Format:

Input consists of a non - negative integer.

 

Output Format:

Print number of digits of a given number

Refer sample input and output for formatting specifications.

 

Sample Input:

432

 

Sample Output:

The number of digits in 432 is 3

Input (stdin)

432


Output (stdout)

The number of digits in 432 is 3

 

Program :-

import java.util.Scanner;

public class Main

{

    public static void main(String args[])

    {

        int m, n, count = 0;

        Scanner s = new Scanner(System.in);

        m = s.nextInt();

        int a=m;

        while(m != 0)

        { 

            m/=10;

            count++;

        }

        System.out.println("The number of digits in " + a + " is " +count);

    }

}

GCD of 2 Numbers

Write a program to compute GCD of 2 numbers using recursion.


 

Input Format:

Input consists of a non - negative integer.

 

Output Format:

Print the sum of digits of a given number.

Refer sample input and output for formatting specifications.

 

Sample Input:

36

27

 

Sample Output:

G.C.D of 36 and 27 = 9

Input (stdin)

23
56


Output (stdout)

G.C.D of 23 and 56 is 1

 

Program :-

import java.util.Scanner;

public class Main 

{

    public static void main(String[] args)

    {

        int n1,n2, gcd = 1;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();

        n2 = sc.nextInt();

        for(int i = 1; i <= n1 && i <= n2; ++i)

        {

            if(n1 % i==0 && n2 % i==0)

                gcd = i;

        }

        System.out.println("G.C.D of " + n1 + " and " + n2 + " is " + gcd );

    }

}

Sum of elements in Array

Write a program to compute the sum of elements in an array using recursion.


 

Input Format:

Input consists of n+1 integers.

 

Output Format:

Print the sum of elements in an array.

Refer sample input and output for formatting specifications.

 

Sample Input :

6

2

5

1

7

4

2

 

Sample Output:

The sum of the elements in the array is 21

Input (stdin)

6
2
5
7
1
4
2


Output (stdout)

The sum of the elements in the array is 21

 

Program :-

import java.util.Arrays;

import java.util.Scanner;

public class Main

{

   public static void main(String args[])

   {

      Scanner s = new Scanner(System.in);

      int size = s.nextInt();

      int myArray[] = new int [size];

      int sum = 0;

      for(int i=0; i<size; i++){

         myArray[i] = s.nextInt();

         sum = sum + myArray[i];

      }

      System.out.println("The sum of the elements in the array is "+sum);

   }

}

Sum of even numbers

Write a program to find the sum of the even numbers present in an array using recursion.


 

Input Format:

Input consists of n+1 integers.

 

Output Format:

Print the sum of even elements in an array.

Refer sample input and output for formatting specifications.

 

Sample Input :

4

23

54

67

98

Sample Output:

Sum of even numbers 152

Input (stdin)

4
23
54
67
98


Output (stdout)

Sum of even numbers 152

 

Program :-

import java.util.Scanner;

public class Main

{

    public static void main(String[] args) 

    {

        int n, sumE = 0, sumO = 0;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        for(int i = 0; i < n; i++)

        {

            if(a[i] % 2 == 0)

            {

                sumE = sumE + a[i];

            }

        }

        System.out.println("Sum of even numbers "+sumE);

    }

}

EXCEPTIONAL HANDLING

Array element_Exception handling_Java

Write a Program to print the array element using or implementing exception handling.

Input Format :

Input consist of an Integers

Output Format :

Output consist of a Strings and Integer

 

Sample Input :

5

10 20 30 4 5 

10

Sample Output :

java.lang.ArrayIndexOutOfBoundsException: 10

Input (stdin)

5
10 20 30 4 5
2


Output (stdout)

30

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    int n = sin.nextInt();

    int arr[] = new int[n];

    for(int i=0; i<n; i++){

      arr[i] = sin.nextInt();

    }

    int m = sin.nextInt();

    try{

      System.out.println(arr[m]);

    }

    catch(ArrayIndexOutOfBoundsException e){

      System.out.println(e);

    }

  }

}

Divide two no_Exception handling_Java

Write a Program to divide two numbers.


Input Format :

Input consist of an Integer

Output Format :

Output consist of a Float and Strings

 

Sample Input :

10 20

Sample Output :

0.5

Input (stdin)

10 0


Output (stdout)

Infinity

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    try{

      System.out.print((float) a / b);

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Digit_Exception handling_Java

Program to find the total count of numbers between the given range that is made up only with digits less than 5. 

Example: 1234 is a number which is made of digits less than 5. 2532 is a number which is having a 

digit greater than 5 so we will not consider it.


Input Format :

Input consist of an Integer

Output Format :

Output consist of an Integer

 

Sample Input :

1 4300

Sample Output :

575

Input (stdin)

0 896


Output (stdout)

125

 

Program :-

import java.util.*;    

class Main

{ 

    public static void main(String[] args) 

    {  

        Scanner obj = new Scanner(System.in);

        int start = obj.nextInt();

        int end = obj.nextInt();

        int c=0,temp,f;

        try

        { 

            for(int i=start;i<=end;i++)

            {      

                f=0;

                temp=i;

                while(temp!=0)

                {

                    int r=temp%10;

                    if(r>=5)

                    f=1;

                    temp/=10;

                }

                if(f==0)

                c++;

            }

            

        }

        catch(Exception e) 

        { 

            System.out.print("Divide by zero"); 

        } 

        finally 

        {

            System.out.printf("%d",c);

        }   

    }    

}

Given Triangle_Exception handling_Java

Program to find the total number of triangles in the given triangle. 

Input: The first input is no of baselines The second input is no of horizontal lines from the top centre of the triangle.


Input Format :

Input consist of an Integer

Output Format :

Output consist of an Integer

 

Sample Input :

3 4 

Sample Output :

18

Input (stdin)

2 3


Output (stdout)

6

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    int i,sum=1;

    int a = sin.nextInt();

    int b = sin.nextInt();

    try{

      for(i=1;i<=b-1;i++)

      {

        sum = sum+i;

      }

      System.out.print((int)(a*sum)-a);

    }

    catch(ArithmeticException e){

      System.out.println("0");

    }

    return;

  }

}

Working days_Exception handling_Java

n1 people worked for d1 days for h1 hours and completed w1 works. 

Write a program to find work done by n2 people worked for d2 days and h2 hours.


Input Format :

Input consist of an Integer

Output Format :

Output consist of an Float

 

Sample Input :

10 10 10 10

8 8 8 

Sample Output :

5.12

Input (stdin)

1 5 8 9
2 6 8


Output (stdout)

21.6

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    double c = sin.nextInt();

    double d = sin.nextInt();

    double f = sin.nextInt();

    double g = sin.nextInt();

    double h = sin.nextInt();

    try{

      System.out.print((h*g*f*d)/(a*b*c));

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Piece of Work_Exception handling_Java

A can do a piece of work in x days. B can do the same piece of work in y days. 

Write a program to find if both are working together, how long they will take to finish it. 

Input format: x is an integer stating the A working days. y is an integer stating the B working days.


Input Format :

Input consist of an Integer

Output Format :

Output consist of a Float

 

Sample Input :

10 20

Sample Output :

6.666666666666667

Input (stdin)

55 89


Output (stdout)

33.99305555555556

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    try{

      System.out.print((float) (a*b)/(a+b));

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Average speed_Exception handling_Java

A person travels from home to the office at the speed of x kmph and return home at the speed of y kmph, 

then write a program to find the average speed of the entire journey.


Input Format :

Input consist of an Integer

Output Format :

Output consist of a Float

 

Sample Input :

15 65

Sample Output :

24.375

Input (stdin)

30 70


Output (stdout)

42.0

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    try{

      System.out.print((float) (2*a*b)/(a+b));

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Travelling_Exception handling _Java

You are in need of Rs.10000 and decide to borrow it from your friend who lives 200km away from your place. 

Both of you are travelling towards each other. Your friend is travelling in his bike at a speed of x kmph and you 

are travelling at a speed of y kmph. Write a program to find at what time you two will meet?


Input format :

x and y are integers in kmph

Output format :

Time in hrs (double)

 

Sample Input :

25 60

Sample Output :

2.3529411764705883

Input (stdin)

12 56


Output (stdout)

2.9411764705882355

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    try{

      System.out.print(200/(a+b));

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Train_Exception handling_Java

Two trains are d km apart and are travelling towards each other at a speed of x kmph and y kmph respectively. 

From one train a mosquito takes off, flies straight above the rails to the other trains at the speed of z kmph, 

bounces off it and flies back to the first train. The mosquito continues to do this till the two trains crash into each other

 and the mosquito is smashed. Write a program to find the distance travelled by the mosquito before it gets smashed.


Input Format :

Input consist of an Integer

Output Format :

Input consist of a Float

 

Sample Input :

200 50 50 75

Sample Output :

150.0

Input (stdin)

12 5 9 6


Output (stdout)

5.142857142857142

 

Program :-

import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    double a = sin.nextInt();

    double b = sin.nextInt();

    double c = sin.nextInt();

    double d = sin.nextInt();

    try{

      System.out.print((a/(b+c))*d);

    }

    catch(ArithmeticException e){

      System.out.println("Infinity");

    }

    return;

  }

}

Opposite direction_Exception handling_Java

You are in need of Rs.10000 and decide to borrow it from your friend who lives 200km away from your place.

 Your friend is already on the way (which is in opposite to your direction) to his office and you decided to chase him out.

 Your friend is travelling in his bike at a speed of x kmph and you are travelling at a speed of y kmph. 

Write a program to find at what time you two will meet?


Input Format :

x and y are integers in kmph

Output Format :

Time in hrs (double)

 

Sample Input :

15 89 500

Sample Output :

Will never meet

Input (stdin)

50 20 250


Output (stdout)

8.333333333333334

 

Program :-

import java.util.*; 

import java.lang.Math; 

class Main

{ 

    public static void main(String[] args) 

    {  

        Scanner obj = new Scanner(System.in);

        int x = obj.nextInt();

        int y = obj.nextInt();

        int d = obj.nextInt();

       

        double ans=0;

        try

        { 

            if(x<y)

            {

               System.out.println("Will never meet"); 

               System.exit(0);

            }

            ans = d/(double)(x-y);  

            System.out.println(Math.abs(ans)); 

        }

        catch(Exception e) 

        { 

            System.out.print("Divide by zero"); 

        } 

    }    

}





www.saidheerajece.wordpress.com
https://wa.me/918341242678
