package matrix; 



public class Main {
    public static void main(String[] args){  
        Matrix result = new Matrix(2,2); 
        result = MatrixGenerator.random_matrix(result);   
        result.print_matrix();    
    }   
}
