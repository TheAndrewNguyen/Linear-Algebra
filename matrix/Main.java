package matrix; 



public class Main {
    public static void main(String[] args){  
        Matrix test = new Matrix(2, 5); 
        test = MatrixGenerator.random_matrix(test); 
        
        test.print_matrix();

        System.out.println(); 
        test = MatrixGenerator.transpose(test); 
        test.print_matrix();
    }   
}
