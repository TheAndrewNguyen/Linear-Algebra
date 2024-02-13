public class MatrixOperations {
    
    //matrix add operation 
    public static Matrix add(Matrix a, Matrix b){

        if(!Checks.check_same_dimensions(a, b)){
            throw new IllegalArgumentException("Matricies dimensions do not match cannot add matricies"); 
        }

        //we can do an inplace operation and add everything to a and return matrix a 
        for(int i = 0; i < a.get_rows(); i++){
            for(int j = 0; j < a.get_columns(); j++){
                double value = a.get_cell(i, j) + b.get_cell(i, j); 
                a.set_cell(i, j, value); 
            }
        }

        return a;  
    }

    //matrix subtract operation 
    public static Matrix subtract(Matrix a, Matrix b){

        for(int i = 0; i < a.get_rows(); i++){
            for(int j = 0; j < a.get_columns(); j++){
                double value = a.get_cell(i, j) - b.get_cell(i, j); 
                a.set_cell(i, j, value); 
            }
        }

        return a;         
    }

    //matrix multiplication 
    public static Matrix multiplMatrix(Matrix a, Matrix b){

        //do a check if the columns on matrix a and the rows on matrix b match 
        //if not throw an exceptoin error 
        if(a.get_columns() != b.get_rows()){
            throw new IllegalArgumentException("The operation could not be preformed.  Matrix dimensions do not fit criteria for matrix multiplication."); 
        }
        
        //the result of matrix multiplication is new matrix with rowa x colb dimensions 
        Matrix result = new Matrix(a.get_rows(), b.get_columns()); 
        
        //naive algorithm
        for(int i = 0; i < result.get_rows(); i++){
            for(int j = 0; j < result.get_columns(); j++){
                for(int k = 0; k < a.get_rows(); k++){
                    double value = result.get_cell(i, j) +  a.get_cell(i, k) * b.get_cell(k, j);
                    result.set_cell(i, j, value);
                }   
            }
        }   

        return result;

    }


    //method returns matrix that has been multiplied by a scalar 
    public static Matrix scalMulti(double scalar, Matrix matrix){

        Matrix result = new Matrix(matrix.get_rows(), matrix.get_columns()); 

        for(int i = 0; i < matrix.get_rows(); i++){
            for(int j = 0; j < matrix.get_columns(); j++){
                double value = matrix.get_cell(i, j) * scalar; 
                result.set_cell(i, j, value); 
            }
        }

        return result; 
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



    //returns the inverse of a matrix 
    public static Matrix inverse(Matrix matrix){

        //get the determinant 
        double det = det2x2(matrix); 

        //check if the determinant if it is == 0 
        // 1. if it is we throw an error we can't calcuate the inverse 
        if(det== 0){
            throw new IllegalArgumentException("Matrix operation could not be performed: matrix does not fit criteria for matrix inverse"); 
        }

        //
        Matrix result = new Matrix(matrix.get_rows(), matrix.get_columns());
        
        //get values of the original matrix 
        double a = matrix.get_cell(0, 0); 
        double b = matrix.get_cell(0, 1); 
        double c = matrix.get_cell(1, 0); 
        double d = matrix.get_cell(1, 1); 

        //make the adjacent matrix 
        result.set_cell(0, 0, d); 
        result.set_cell(0, 1, -b); 
        result.set_cell(1, 0, -c); 
        result.set_cell(1, 1, a); 

        //multiplly the current result matrix by 1/determinant to obtain the 
        double one_over_det = 1/det; 
        result = scalMulti(one_over_det, result); 

        return result; 
    }
}
