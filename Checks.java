public class Checks {
    
    //method checks if the matrix dimensions are the same 
    public static Boolean check_same_dimensions(Matrix a, Matrix b){
        if(a.get_rows() != b.get_rows() || a.get_columns() != b.get_columns()){
            return false; 
        }

        return true; 
    }



}
