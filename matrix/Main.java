package matrix; 



public class Main {
    public static void main(String[] args){  

        Matrix m = new Matrix(3,3);
        m = MatrixGenerator.random_matrix(m);
        
        m.print_matrix();
        double total = MatrixGetValue.Trace(m); 
        System.out.println(total);
    }
}
