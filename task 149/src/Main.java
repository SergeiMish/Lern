import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       int [] array = {1, 2, 3, 4, 15, 17, 18, 22};
       int IndexPoison = 2;
       int newValue = 7;

        System.out.println("Original array " + Arrays.toString(array));

        for (int i = array.length; i > IndexPoison; i--){
            array[i] = array[i-1];}
        array[IndexPoison] = newValue;
        System.out.println("New Array " + Arrays.toString(array));
        }
    }
