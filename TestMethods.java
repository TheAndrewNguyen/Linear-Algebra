public class TestMethods {
    
    //method that sets all the matrix cells to 1
    public static Matrix set_1(Matrix a){
        for(int i = 0; i < a.get_rows(); i++){
            for(int j = 0; j < a.get_columns(); j++){
                a.set_cell(i, j, 1); 
            }
        }
        
        return a; 
    }
}
