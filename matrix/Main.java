package matrix; 



public class Main {
    public static void main(String[] args){  
        Matrix test = new Matrix(2, 2); 
        test = MatrixGenerator.set_1(test);
        test = RowOperations.add(test, 0, 1); 

        test.print_matrix();
    }   
}
