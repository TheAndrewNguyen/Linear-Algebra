package matrix;
import java.util.*; 


public class MatrixGenerator {
    
    //method that sets all the matrix cells to 1
    public static Matrix set_1(Matrix a){
        for(int i = 0; i < a.get_rows(); i++){
            for(int j = 0; j < a.get_columns(); j++){
                a.set_cell(i, j, 1); 
            }
        }
        
        return a; 
    }

    //generates a random matrix given the orignal matrix 
    public static Matrix random_matrix(Matrix matrix){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); 

        System.out.print("What is the range of random numbers do you want?: "); 
        int max_random = scan.nextInt(); 

        for(int i = 0; i < matrix.get_rows(); i++){
            //now traverse the rows and put it in 
            for(int j = 0; j < matrix.get_columns(); j++){
                int random_num = rand.nextInt(max_random + 1); //generate random number 

                matrix.set_cell(i, j, random_num); //put it in the matrix 
            }
        }


        scan.close(); //close the scanner 
        return matrix; //return the matrix that had been changed
    }

    //find the idenity matrix given the dimensions
    public static Matrix idenMatrix(int val){
        
        return new Matrix();         
    }


    //find the idenity matrix given a matrix
    public static Matrix idenMatrix(Matrix m){
        return new Matrix(); 
    }


}
