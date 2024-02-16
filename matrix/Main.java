package matrix; 



public class Main {
    public static void main(String[] args){  
        Matrix test = new Matrix(2, 2); 
        test = MatrixGenerator.set_1(test);
        test.print_matrix();

        test = RowOperations.scale(test, 0, 5); 
        test.print_matrix();
    }   
}
