#QUESTION

Write a program that determines if a relation R represented by its
matrix is a partial order. (checking if the relation is a POSET or not )

#Sample Input to the program

ENTER THE NUMBER OF VERTICES [THE NUMBER OF ELEMENTS IN THTE RELATION]: 3
ENTER THE ELEMENTS IN THE ORDER IN AN ARRAY: 
0 1 1
1 0 0
1 1 1

FINAL MATRIX OF THE RELATION
  1 2 3 
1 0 1 1 
2 1 0 0 
3 1 1 1 
Vertex 1 is connected to:2 3 
Vertex 2 is connected to:1 
Vertex 3 is connected to:1 2 3 

CHECKING THE REQUIRED CONDITIONS FOR POSET
-It is not reflexive hence the relation is not a POSET
-It is not transitive hence the relation is not a POSET
-It is not anti-symmetric hence the relation is not a POSET
