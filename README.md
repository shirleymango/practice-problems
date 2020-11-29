# Practice Problems
Practice problems that I solve for fun!

Problem Descriptions:

dec2Fact: Decimal to Factorial and Back.
Coding decimal numbers with factorials is a way of writing out numbers in a base system that depends on factorials, rather than powers of numbers. In this system, the last digit is always 0 and is in base 0!. The digit before that is either 0 or 1 and is in base 1!. The digit before that is either 0, 1, or 2 and is in base 2!, etc. More generally, the nth-to-last digit is always 0, 1, 2, ..., n and is in base n!. There are two functions. The first one will receive a decimal number and return a string with the factorial representation.

josephusPermutation: Josephus' Permutation.
This problem takes its name from the ancient historian Josephus: according to his tale, he and his 40 soldiers were trapped in a cave by the Romans during a siege.
Refusing to surrender to the enemy, they instead opted for mass suicide, with a twist: they formed a circle and proceeded to kill one man every three, until one last man was left (and that it was supposed to kill himself to end the act).
This function returns a Josephus permutation, taking as parameters the initial array/list of items to be permuted as if they were in a circle and counted out every k places until none remained.

largestDifference: Write a function which takes an array data of numbers and returns the largest difference in indexes j - i such that data[i] <= data[j].
Consider all of the pairs of numbers in the array where the first one is less than or equal to the second one. From these, find a pair where their positions in the array are farthest apart. Return the difference between the indexes of the two array elements in this pair.

maze: Help Kate find way out of maze. 
For a given maze and Kate's position find if there is a way out. Your function should return True or False. Each maze is defined as a list of strings, where each char stays for a single maze "cell". ' ' (space) can be stepped on, '#' means wall and 'k' stays for Kate's starting position. Note that the maze may not always be square or even rectangular. Kate can move left, up, right or down only.

nextLargest: Next bigger number with the same digits.
Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits.

nextSmaller: Next smaller number with the same digits.
Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

perimeterOfSquares: Perimeter of squares in a rectangle.
Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing https://i.imgur.com/EYcuB1wm.jpg? 

playWithTwoStrings: Play with two Strings.
Input Strings a and b: For every character in string a swap the casing of every occurrence of the same character in string b. Then do the same casing swap with the inputs reversed. Return a single string consisting of the changed version of a followed by the changed version of b. A char of a is in b regardless if it's in upper or lower case - see the testcases too.

recoverSecret: Recover a secret string from random triplets.
There is a secret string which is unknown to you. 
Given a collection of random triplets from the string, recover the original string. A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in the given string. "whi" is a triplet for the string "whatisup".

rectangleRotation: Rectangle Rotation.
A rectangle with sides equal to even integers a and b is drawn on the Cartesian plane. Its center (the intersection point of its diagonals) coincides with the point (0, 0), but the sides of the rectangle are not parallel to the axes; instead, they are forming 45 degree angles with the axes. 
How many points with integer coordinates are located inside the given rectangle (including on its sides)?

Spiralizor: Create a NxN spiral with a given size.
Return value should contain array of arrays, of 0 and 1. The snake made with '1' cannot touch to itself.
