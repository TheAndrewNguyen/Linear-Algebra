

public class Main {
    public static void main(String[] args){        

        Matrix test = new Matrix(2, 2); 
        test = MatrixGenerator.random_matrix(test); 


        test = MatrixOperations.inverse(test); 
        test.print_matrix();
    }
}
