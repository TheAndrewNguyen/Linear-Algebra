package matrix; 
import java.util.*; 

//random matrix generator
public class Matrix {

    //define the class variables 
    private int rows; 
    private int columns; 
    private double[][] matrix; 
    private int max_digits; 
    
    //just create a blank matrix 
    public Matrix(){
        this.rows = 0; 
        this.columns = 0;
        update_matrix();
    }

    //first constructor taking in rows and columns 
    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns; 
        update_matrix(); 
    }

    //consturctor for an already made matrix
    public Matrix(double[][] matrix){
        this.matrix = matrix; 
        this.rows = matrix.length; 
        this.columns = matrix[0].length; 
    }


    //update the matrix size 
    private void update_matrix(){
        this.matrix = new double[this.rows][this.columns]; 
    }

    //updates teh max_digits class variable 
    private void update_max_digits(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){

                double cell = this.matrix[i][j]; 
                int length = String.valueOf(cell).length(); 

                if(length > this.max_digits){
                    this.max_digits = length; 
                }
            }
        }
    }

    //method to edit matrix size
    public void create_matrix(){

        //initalize new scanner 
        Scanner scan = new Scanner(System.in); 

        //start the matrix creation program: 
        System.out.println("Create a matrix: \n ---------------");

        System.out.print("How many rows: ");
        int rows = scan.nextInt(); 
        
        System.out.print("How many columns: " ); 
        int columns = scan.nextInt();
        
        
        this.rows = rows; 
        this.columns = columns; 
        update_matrix();

        scan.close(); 
    }


    /*Setters */
    public void set_rows(int rows){
        this.rows = rows; 
        update_matrix();
    }

    public void set_columns(int columns){
        this.columns = columns;
        update_matrix(); 
    }

    //setting specific spot in the matrix 
    public void set_cell(int row, int column, double value){
        //error handling 
        if(row < 0 || row > this.rows || column < 0 || column > this.columns){
            System.out.println("The dimensions of this matrix are " + get_dimensions() + " Invalid input"); 
            return; 

        } else{ //if no error set the matrix's area value  
            this.matrix[row][column] = value; 
        }
    }

    public double get_cell(int row, int column){
        return this.matrix[row][column]; 
    }




    /*Getters*/
    public int get_rows(){
        return this.rows; 
    }

    public int get_columns(){
        return this.columns; 
    }

    //returns the dimension of the array in array format 
    public int[] get_dimensions(){
        return new int[]{this.rows, this.columns}; 
        
    }

    //to string 
    public void print_matrix(){

        if(this.rows == 0 || this.columns == 0){
            System.out.println("You have a blank matrix! "); 
        }


        //update the matrix max before printing out
        update_max_digits();


        //traverse through the matrix to print it out 
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.matrix[i].length; j++){

                double value = matrix[i][j]; 

                System.out.print(value + ";");


                int digits = String.valueOf(value).length(); 

                int difference = this.max_digits - digits; 
                
                for(int t = 0; t < difference + 1; t++){
                    System.out.print(" "); 
                }
                System.out.print(" "); 
            }

            System.out.println(); 
        }
    }
}
