public class MatrixOperationValidation {
    
    //we can validate a matrix is an inverse matrix if we multiply the orignal matrix by the inverse we should get the idenity matrix
    public static Boolean validate_inverse(Matrix original, Matrix inverse){

        //we can first check if the dimensions match the original and the inverse 
        if(!MatrixValidation.check_same_dimensions(original, inverse)){
            return false; 
        }

        //calcuate the idenity matrix 
        Matrix idenity = MatrixGenerator.idenMatrix(original); 
        
        //need to write a method that validates they matricies are the same 
            

        return true; 
    }



}
