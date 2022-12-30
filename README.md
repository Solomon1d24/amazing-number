### Description
In number theory, a happy number is a number that reaches 1 after a sequence during which the number is replaced by the sum of each digit squares. For example, 13 is a happy number, as 12 + 32 = 10 which leads to 12 + 02 = 1. On the other hand, 4 is not a happy number because the sequence starts with 42 = 16, 12 + 62 = 37, and finally reaches 22 + 02 = 4. This is the number that started the sequence, so the process goes on in an infinite cycle. 
A number that is not happy is called Sad (or Unhappy).

Our program is finished. It can indicate many interesting properties of numbers, it knows how to calculate them. Now, when prompted, a user can have a list of number properties. To complete the program, let's add an ability to exclude a property from the search query. If a user puts a minus (-) before the property, exclude this property from the search query. 
For example, if a user specifies palindromic -duck, it means that they are looking for Palindromic numbers that are not Ducks.

### Objectives
Program should process the user requests. In this stage, your program should:

Welcome users;<br/>
Display the instructions;<br/>
Ask for a request;<br/>
1.If a user enters an empty request, print the instructions;<br/>
2.If the user enters zero, terminate the program;<br/>
3.If numbers are not natural, print the error message;<br/>
4.If an incorrect property is specified, print the error message and the list of available properties;<br/>
5.For one number, print the properties of the number;<br/>
6.For two numbers, print the properties of all numbers in the list;<br/>
7.For two numbers and two properties, print the list of numbers that contain the specified properties;<br/>
8.If a property is preceded by a minus, this property should not be present in a number;<br/>
9.If the user specifies mutually exclusive properties, abort the request and warn the user.<br/>
Once the request is processed, continue execution from step 3.<br/>

In this stage, property names include even, odd, buzz, duck, palindromic, gapful, spy, sunny, square, jumping, sad, and happy. Mutually exclusive properties are even/odd, duck/spy, sunny/square, sad/happy pairs, as well as direct opposites 
(property and -property). The test won't check the order of properties, their indentation, and spaces.

### Instructions
```
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
    * the first parameter represents a starting number;
    * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.
```

### Error messages

```
The first parameter should be a natural number or zero.
The second parameter should be a natural number.
The property [SUN] is wrong.
Available properties:
[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]
The properties [HOT, SUN] are wrong.
Available properties:
[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]
The request contains mutually exclusive properties: [HAPPY, SAD]
There are no numbers with these properties
The request contains mutually exclusive properties: [-HAPPY, -SAD]
There are no numbers with these properties.
The request contains mutually exclusive properties: [GAPFUL, -GAPFUL]
There are no numbers with these properties.
```

## Example
```
Welcome to Amazing Numbers!

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be processed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: 1 10

               1 is odd, palindromic, spy, square, jumping, happy
               2 is even, palindromic, spy, jumping, sad
               3 is odd, palindromic, spy, sunny, jumping, sad
               4 is even, palindromic, spy, square, jumping, sad
               5 is odd, palindromic, spy, jumping, sad
               6 is even, palindromic, spy, jumping, sad
               7 is odd, buzz, palindromic, spy, jumping, happy
               8 is even, palindromic, spy, sunny, jumping, sad
               9 is odd, palindromic, spy, square, jumping, sad
              10 is even, duck, jumping, happy

Enter a request: 1 5 -odd

               2 is even, palindromic, spy, jumping, sad
               4 is even, palindromic, spy, square, jumping, sad
               6 is even, palindromic, spy, jumping, sad
               8 is even, palindromic, spy, sunny, jumping, sad
              10 is even, duck, jumping, happy

Enter a request: 1 5 -even

               1 is odd, palindromic, spy, square, jumping, happy
               3 is odd, palindromic, spy, sunny, jumping, sad
               5 is odd, palindromic, spy, jumping, sad
               7 is odd, buzz, palindromic, spy, jumping, happy
               9 is odd, palindromic, spy, square, jumping, sad

Enter a request: 1 5 -odd -even gapful

The request contains mutually exclusive properties: [-ODD, -EVEN]
There are no numbers with these properties.

Enter a request: 1 5 odd square -odd

The request contains mutually exclusive properties: [-ODD, ODD]
There are no numbers with these properties.

Enter a request: 1 5 sunny square

The request contains mutually exclusive properties: [SQUARE, SUNNY]
There are no numbers with these properties.

Enter a request: 1 5 -sunny -square

               2 is even, palindromic, spy, jumping, sad
               5 is odd, palindromic, spy, jumping, sad
               6 is even, palindromic, spy, jumping, sad
               7 is odd, buzz, palindromic, spy, jumping, happy
              10 is even, duck, jumping, happy
```




