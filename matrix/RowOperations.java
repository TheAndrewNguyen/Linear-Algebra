package matrix; 
import java.util.*;


public class RowOperations{

    //method to swap rows in a matrix r1 <--> r2
    public static Matrix swap(Matrix m, int r1, int r2){


        //error handling
        if(!isRowInRange(m, r1) || !isRowInRange(m, r2)){
            throw new IllegalArgumentException("Matrix dimensions not in bounds"); 
        }

        //queue to store temp values 
        Queue<Double> temp = new LinkedList<>();
        

        int col = m.get_columns(); 

        //add row 1 into the tempoary 
        for(int i = 0; i < col; i++){
            temp.offer(m.get_cell(r1, i)); 
        }
        
        //r2 --> r1 
        for(int i = 0; i < col; i++){
            m.set_cell(r1, i, m.get_cell(r2, i)); 
        }

        //temp --> r2 
        int current_col = 0; //pointer 
        while(!temp.isEmpty()){
            m.set_cell(r2, current_col, temp.poll()); //set r2 to r1s value 
            current_col++; 
        }

        return m; 

    }

    //transposing is flipping over the diagonal if square 
    //if not square just put the rows 
    public static void transpose(Matrix a){
        
    }


    //scale a row aR
    public static Matrix scale(Matrix m, int row, int scalar){

        //error handing 
        if(!isRowInRange(m, row)){
            throw new IllegalArgumentException("row not in range of matrix");
        }          

        //scale the row using a for loop 
        for(int i = 0; i < m.get_rows(); i++){
            double scaled = m.get_cell(row, i) * scalar; 
            m.set_cell(row, i, scaled); 
        }

        return m; 
    }
    

    //row additoin function r1 + r2 --> r1 
    public static Matrix add(Matrix a, int r1, int r2){
        //check for errors
        if(!isRowInRange(a, r1) || !isRowInRange(a, r2)){
            throw new IllegalArgumentException("row not in range of matrix"); 
        }

        //perform row additon 
        for(int i = 0; i < a.get_columns(); i++){
            double value = a.get_cell(r1, i) + a.get_cell(r2, i); //r1 + r2 
            a.set_cell(r1, i, value); //set row 1's values to the value | --> r1         
        }
        
        return a; //return the transformed matrix
    }


    //row subtraction r1 - r2 --> r1 
    public static Matrix subtract(Matrix a, int r1, int r2){
        if(!isRowInRange(a, r1) || !isRowInRange(a, r2)){
            throw new IllegalArgumentException("Matrix operation could not be preformed row not in range"); 
        }
        
        //perform row subtraction 
        for(int i = 0; i < a.get_columns(); i++){
            double value = a.get_cell(r1, i) - a.get_cell(r2, i); //r1-r2 
            a.set_cell(r1, i, value); //--> r1 
        }

        return a; //return adjusted matrix 
    }

    //check if the row is witin range 
    private static Boolean isRowInRange(Matrix m, int row){

        //if rows out of bounds return false 
        if(row < 0 || row > m.get_rows() - 1){ //-1 because our arrays are 0-indexed 
            return false; 
        }

        return true; //if reached here it is in bounds 
    }
}
