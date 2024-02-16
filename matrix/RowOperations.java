package matrix; 
import java.util.*;


public class RowOperations{



    //method to swap rows in a matrix
    public static Matrix swap(Matrix m, int r1, int r2){


        //error handling
        if(r1 > m.get_rows() || r1 < 0 || r2 > m.get_rows() || r2 < 0){
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

    //transposing is flipping over the diagonal 
    public static void transpose(){
        
    }

    public static void scale(){
        
    }

    public static void add(){

    }

    public static void subtract(){

    }


}
