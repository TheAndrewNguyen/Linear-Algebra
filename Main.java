

public class Main {
    public static void main(String[] args){        

        Matrix a = new Matrix(3, 3); 
        a = MatrixGenerator.random_matrix(a); 

        a.print_matrix();

        try{
            a = MatrixGenerator.idenMatrix(a); 
            a.print_matrix();
            
        } catch (IllegalArgumentException e){
            System.out.println(e); 
        }
    }   
}
