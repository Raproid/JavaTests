/*
Brainer:
Implement a method that given two arrays as parameters will find the starting index where the second parameter occurs as a sub-array in the array given as the first parameter.
If given sub-array (second parameter) occurs more than once, then the method should return the starting index of the last occurrence
Your implementations should return -1 if the sub-array cannot be found.

_____________________________________________

[4,9,3,7,8] and [3,7] should return 2.
[1,3,5] and [1] should return 0.
[7,8,9] and [8,9,10] should return -1.
[4,9,3,7,8,3,7,1] and [3,7] should return 5.
_____________________________________________

*/




/**
 * Created by raproid on 8/26/17.
 */

public class MyFindArray
{
    public static int findArray(int[] array, int[] subArray)
    {

        int SubArrayLenght = subArray.length;
        int ArrayLength = array.length;

        if(SubArrayLenght == 0)
        {
            return -1;
        }

        int Resid = ArrayLength - SubArrayLenght;

        for (int i = 0; i < Resid; i++)
        {
            boolean GotSubArray = true;

            for (int j = 0; j < SubArrayLenght; j++)
            {
                if (subArray[j] != array[i+j])
                {
                    GotSubArray = false;
                    break;
                }

                if(GotSubArray)
                {
                    return i;
                }
            }

        }
        return -1;
    }

    /**
     * Testing the logic
     */
    public static void main(String[] args)
    {
        int[] array = {4,9,3,7,8};
        int[] subArray = {3,7};
        System.out.println("Result: " + findArray(array,subArray));
    }

}


