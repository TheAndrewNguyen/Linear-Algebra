package matrix;

public class MatrixGetValue {

    //the trace is the total of the matricies diagonals 
    public static double Trace(Matrix a){

        //validate that the matrix is a square matrix otherwise throw an error 
        if(!MatrixPropertiesValidation.check_square(a)){
            throw new IllegalArgumentException("Trace could not be calculated: Matrix is not square");
        }

        int current_col = 0; //variable for current column  
        double total = 0; //keep track of the total 

        //loop through the matrix 
        for(int i = 0; i < a.get_rows(); i++){
            total += a.get_cell(i, current_col); 
            current_col++; //shift right for every row we go down to get      
        }

        return total; //return the total  
    }

    //calculate the 2x2 determinant 
    public static double det2x2(Matrix matrixa){

        if(matrixa.get_rows() != 2 || matrixa.get_columns() != 2){
            throw new IllegalArgumentException("Computation error: determinant with 2x2 matrix"); 
        }

        //set the result variable 
        double result = 0;
        double a = matrixa.get_cell(0, 0); 
        double b = matrixa.get_cell(0, 1); 
        double c = matrixa.get_cell(1, 0); 
        double d = matrixa.get_cell(1, 1); 

        result = (a * d) - (b * c); 

        return result; 
        
    }   







    
}
