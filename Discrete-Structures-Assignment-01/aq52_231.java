import java.util.Scanner;

public class aq52_231 {
	public static void main(String[] args) {
        int ver,first,second,ver_sub;
        boolean count = true;
        String check;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE INFORMATION FOR THE FIRST TREE");
        System.out.println("Enter the Number of Vertices in the First Tree:");
        System.out.println();
        ver = scan.nextInt();
       GraphAjdacencyMatrix graph = new GraphAjdacencyMatrix(ver);
       System.out.println("Please enter the order of edges in the tree");
       
       
       for(int i =0 ; i<ver-1;i++)
        {  
            int temp;
            temp = i + 1;
         System.out.println("Enter the first vertex of the edge" + temp);
          first = scan.nextInt();
            System.out.println("Enter the second vertex of the edge" + temp);
           second = scan.nextInt();
            graph.addEdge(first, second);
           
           
        }
       
           
       System.out.println("The Adjacency matrix of the First Tree is as follows");
        graph.printGraph();
        System.out.println();
        System.out.println("ENTER THE INFORMATION OF THE SECOND TREE ");
         System.out.println("Enter the no of vertices in the second tree ");
         ver_sub = scan.nextInt();
         if(ver_sub>=ver)
         {
             System.out.println("Since the number of vertices in the Second Tree is greater than or equal to the vertices First Tree, Therefore, It is not a Sub-Tree");
             System.exit(0);
         }
         GraphAjdacencyMatrix graph1 = new GraphAjdacencyMatrix(ver);
         
         for(int i =0 ; i<ver_sub-1;i++)
          { int temp;
          temp = i+1;
             System.out.println("enter the first vertex of the edge " + temp);
          first = scan.nextInt();
            System.out.println("enter the second vertex of the edge " + temp);
           second = scan.nextInt();
           graph1.addEdge(first, second);
           
           graph.subTreeChecker(first,second);
           
               
       }
       if (graph.checker == 1)
       {
          System.out.println();
           System.out.println("The Adjacency Matrix of the Second Tree is ");
           graph1.printGraph();
           System.out.println();
            System.out.println("The Second Tree is a Sub-Tree of the First Tree");
       }
       
       
       
          }
}
class GraphAjdacencyMatrix {
    int vertex;
    int matrix[][];
    int checker;
   

    public GraphAjdacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination]=1;
        matrix[destination][source] = 1;
       
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertex ; j++) {
                if(matrix[i][j]==1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
   
    public void subTreeChecker(int a , int b){
        if(matrix[a][b]!=1)
        {
            System.out.println("this edge is not present in the tree hence the given graph is not a sub-tree");
            System.exit(0);
            }
            else
            checker =1;
       
    }
     
   
 }

