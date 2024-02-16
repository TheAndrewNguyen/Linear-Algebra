package matrix; 

public class MatrixOperationValidation {
    
    //we can validate a matrix is an inverse matrix if we multiply the orignal matrix by the inverse we should get the idenity matrix
    public static Boolean validate_inverse(Matrix original, Matrix inverse){

        //we can first check if the dimensions match the original and the inverse 
        if(!MatrixPropertiesValidation.check_same_dimensions(original, inverse)){
            return false; 
        }

        //calcuate the idenity matrix 
        Matrix idenity = MatrixGenerator.idenMatrix(original); 
        

        //calculate the multiplicatoin of original and inverse 
        Matrix original_multiplied_inverse = MatrixOperations.multiplMatrix(original, inverse);  

        //need to write a method that validates the identity matrix and the original matrix multipleid by the inverse are the same 
        //if they are the same it will return true 
        //else it will return false 
        Boolean result = MatrixPropertiesValidation.areMatriciesEqual(idenity, original_multiplied_inverse); 

        //return the result 
        return result; 
    }



}
