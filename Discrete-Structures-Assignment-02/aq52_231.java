package DiscreteProject2;
import java.util.Scanner;

public class aq52_231 {
	
	public static void main(String[] args) {
        boolean reflex = false ,transitive = false ,antisym = false;
        PosetChecker a = new PosetChecker();
        a.arrayinput();
        if(a.reflexivityChecker()){
            reflex = true;
            System.out.println("Given relation is reflexive");
        }
        else
        {   System.out.println("-It is not reflexive hence the relation is not a POSET");
        //System.exit(1);
            }

        if(a.transativityChecker()){
            transitive = true ;
            System.out.println("- Given relation is transitive");

        }
        else
        {System.out.println("-It is not transitive hence the relation is not a POSET");
        //System.exit(1);
        }


        if(a.antisymmetricChecker()){
            antisym = true;
            System.out.println(" Given relation is anti-symmetric");

        }
        else
        {  System.out.println("-It is not anti-symmetric hence the relation is not a POSET");
        //System.exit(1);
        }

        if(reflex && transitive && antisym){
            System.out.println(" All 3 properties are satisfied in the given relation , Therefore it is a POSET");
        }

    }
}


class PosetChecker {
    int[][] matrix;
    int vertex;
    int[][] transpose_matrix;

    public void arrayinput() {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF VERTICES [THE NUMBER OF ELEMENTS IN THTE RELATION]: ");
        vertex = sc.nextInt();
        matrix = new int[vertex + 1][vertex + 1];
        System.out.println("ENTER THE ELEMENTS IN THE ORDER IN AN ARRAY: ");
        for (i = 1; i <= vertex; i++) {
            for (j = 1; j <= vertex; j++)
                matrix[i][j] = sc.nextInt();
        }
        printGraph();
    }

    public void printGraph() {
        System.out.println();
        System.out.println("FINAL MATRIX OF THE RELATION");
        System.out.print("  ");
        for (int i = 1; i <= vertex; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 1; i <= vertex; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= vertex; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= vertex; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 1; j <= vertex; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("CHECKING THE REQUIRED CONDITIONS FOR POSET");
    }

    public boolean reflexivityChecker() {
        boolean flag = true;
        for (int i = 1; i <= vertex; i++) {
            for (int j = 1; j <= vertex; j++) {
                if (i == j && matrix[i][j] != 1) {
                    flag = false;
                    break;
                }

            }
        }

        return flag;
    }

    public boolean transativityChecker() {
        for (int i = 1; i <= vertex; i++) {
            for (int j = 1; j <= vertex; j++) {
                if (matrix[i][j] == 1) {
                    for (int k = 1; k <= vertex; k++) {
                        if ((matrix[j][k] == 1) && (matrix[i][k] != 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }


    public boolean antisymmetricChecker() {
        boolean antisymmetric = true;
        for (int i = 1; i <= vertex; i++){
            for (int j = 1; j <= vertex; j++){
                if ((matrix[i][j] == matrix[j][i]) && (i != j) && (matrix[i][j]!=0 && matrix[j][i]!=0)) {
                    antisymmetric = false;
                    break;
                }
                }}
        return antisymmetric;

    }
}


