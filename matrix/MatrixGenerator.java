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
    public static Matrix idenMatrix(int dimensions){

        //create the result matrix with the dimensions given  
        Matrix result = new Matrix(dimensions, dimensions);

        int column_count = 0; //column count to keep track of which column we are in 

        //loop through the rows and place a 1 in the column_count position 
        for(int i = 0; i < result.get_rows(); i++){
            result.set_cell(i, column_count, 1); 
            column_count++; 
        }

        return result;         
    }


    //find the idenity matrix given a matrix
    //we can tack onto the previous method after confirming the dimensions
    public static Matrix idenMatrix(Matrix m){

        //check if the matrix is square if not throw and error 
        if(!MatrixPropertiesValidation.check_square(m)){
            throw new IllegalArgumentException("Error: Matrix is not invertible b/c of the dimensions"); 
        }

        //if the matrix is square we can pull any dimension either row or column to form an idenity matrix 
        //make a call to the method that takes in a dimension to create the matrix 
        Matrix result = idenMatrix(m.get_rows()); 

        return result; //return the result  
    }


    //transposal of a matrix  
    public static Matrix transpose(Matrix a){   
        
        double[][] result = new double[a.get_columns()][a.get_rows()]; 
        
        //swap the rows and columns 
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                result[i][j] = a.get_cell(j, i); 
            }
        }

        return new Matrix(result); //return the result in matrix form 
    }



    //reduced row echelon form 
    public static Matrix rref(Matrix m){
        
        return new Matrix();

    }
    




}


