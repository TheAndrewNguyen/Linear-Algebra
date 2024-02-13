

public class Main {
    public static void main(String[] args){        

        Matrix test = new Matrix(2, 2); 
        test.random_matrix();

        Matrix c = MatrixOperations.inverse(test); 


        Matrix a = MatrixOperations.multiplMatrix(test, c); 

        a.print_matrix();
        

    }
}
