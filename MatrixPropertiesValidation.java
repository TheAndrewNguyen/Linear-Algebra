public class MatrixPropertiesValidation {
    
    //method checks if the matrix dimensions are the same 
    public static Boolean check_same_dimensions(Matrix a, Matrix b){
        if(a.get_rows() != b.get_rows() || a.get_columns() != b.get_columns()){
            return false; 
        }

        return true; 
    }

    //check if the matrix dimensions are square
    public static Boolean check_square(Matrix a){

        //check if the rows and colulmns match up 
        if(a.get_rows() != a.get_columns()){
            return false; 
        }

        return true; //otherwise return true
    }

    //method compares two matricies/arrays and see if their dimensions, positions of values in cells are the same
    public static Boolean areMatriciesEqual(Matrix a, Matrix b){
        
        //check if the dimensions are the same 
        if(!check_same_dimensions(a, b)) return false; 

        //check if the values are in corresponding cells

        return true; //end result if pass all tests 


    }



}
