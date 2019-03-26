package day05;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String sally = "She sells seashells by the seashore. The shells she sells are surely seashells. So if she sells shells on the seashore, I'm sure she sells seashore shells";

        String[] sallyArray = sally.split(" ");
        int count = 0;

        for(int i = 0; i < sallyArray.length; i++){
            if(sallyArray[i].equals("sells")){
                count++;
                continue;
            }

        }
        System.out.println("Sells " + count);

        //System.out.println(sallyArray);

        int random = (int)(Math.random() * 7 + 1);

        switch(random){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error");
                break;
        }

        String[] fruit = new String[]{"apple", "banana", "pear"};
        for( String i : fruit)
            System.out.println(i);

        System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));

        int[] hello = new int[]{1,2,3,4,5,6,7};

        System.out.println(Arrays.hashCode(hello));
        System.out.println(Arrays.stream(hello));
        Arrays.parallelSort(hello);

        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{6,7,8,9,10};

        //2nd element in 1st by 3rd element in 2nd

        int y = array1[1] * array2[2];
        System.out.println(y);

        //row first, then column

        int[][] magicSquare =
                {
                        {2,6,9,2},
                        {7,34,34,79},
                        {3354,781,773,567},
                        {234,678,23,98}

                };
        System.out.println(magicSquare[0][1]);
        System.out.println(magicSquare[2][0]);
        System.out.println(magicSquare[3][0] * magicSquare[2][2]);

        for (int row = 0; row < magicSquare.length; row++){
            System.out.println("Row:" + row);
            for (int column = 0; column < magicSquare[row].length; column++){
                System.out.println("Column:" + column);
                System.out.println("[ row: " + row + " ][ column: " + column + " ]:"+ magicSquare[row][column] + "\n");
            }
        }

        //turn ordinary number into big number
        BigInteger big = BigInteger.valueOf(1004330885);
        System.out.println(big);

        //BigInteger c = a.add(b); //c = a + b
        //BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); //d = c * (b + 2)

        //division by zero throws an ArithmeticException, and division of a negative by a positive yields
        // a negative (or zero) remainder

        //BigInteger class is used for mathematical operation which involves very big integer calculations
        //that are outside the limit of all available primitive data types.
    }

}
