# Cracking The Coding Interview Solutions

These are the solutions to the questions in the book "Cracking The Coding Interview" by Gayle Laakmann McDowelltha that I've been developing to keep practicing algorithm problem solving

## Solved Questions

### Chapter 1


**1.2 Check Permutation:** Given two strings, write a method to decide if one is a permutation of the
other

**Answer:** interviewquestions.chapter1.question2.StringRotation

---

**1.3 URLify:** Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)

EXAMPLE
", 13
Input: "Mr John Smith
Output: "Mr%20John%20Smith"

**Answer:** interviewquestions.chapter1.question3.StringHelper

---

**1.4 Palindrome Permutation:** Given a string, write a function to check if it is a permutation of a palin­
drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)

**Answer:** interviewquestions.chapter1.question4.PalindromePermutationChecker

---

**1.5 One Away:** There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.

EXAMPLE
->
pales, pale ->
pale, bale ->
pale, bake ->
pale,
ple
true
true
true
false

**Answer:** interviewquestions.chapter1.question5.EditChecker

---

**1.6 String Compression:** Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

**Answer:** interviewquestions.chapter1.question6.StringCompressor

---

**1.7 Rotate Matrix:** Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

**Answer:** interviewquestions.chapter1.question7.ImageHandler

---

**1.9 String Rotation:** Assume you have a method isSubstringwhich checks if one word is a substring
of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

**Answer:** interviewquestions.chapter1.question9.StringRotation

---

### Chapter 2

**2.1 Romove Dups:** Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

**Answer:** interviewquestions.chapter2.question1.NodeTest

---

**2.3 Delete Middle Node:** Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
lnput:the node c from the linked lista->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a->b->d->e- >f

**Answer:** interviewquestions.chapter2.question3.ElementDeleter

---

### Chapter 3

**3.2 Stack Min:** How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.

**Answer:** interviewquestions.chapter3.question2.StackMin

---

**3.3 Stack of Plates:** Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetO-fStacks should be
composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks. push() and SetOfStacks. pop() should behave identically to a single stack
(that is, pop () should return the same values as it would if there were just a single stack).
FOLLOW UP
Implement a function popAt ( int index) which performs a pop operation on a specific sub-stack.

**Answer:** interviewquestions.chapter3.question3.StackMin

---

### Chapter 4

**4.1 Route Between Nodes:** Given a directed graph, design an algorithm to find out whether there is a
route between two nodes.

**Answer:** interviewquestions.chapter4.question1.Graph

---

**4.2 Minimal Tree:** Given a sorted (increasing order) array with unique integer elements, write an algo­
rithm to create a binary search tree with minimal height.

**Answer:** interviewquestions.chapter4.question2.Tree

---

**4.3 List of Depths:** Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

**Answer:** interviewquestions.chapter4.question3.Tree

---

**4.4 Check Balanced:** Implement a function to check if a binary tree is balanced. For the purposes of
this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
node never differ by more than one.

**Answer:** interviewquestions.chapter4.question4.Tree

