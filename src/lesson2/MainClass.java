package lesson2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lesson2.exceptions.MyArrayDataException;
import lesson2.exceptions.MyArraySizeException;

public class MainClass {

    public static void main(String[] args) {

        String[][] arr = {
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "32", "33", "34"},
                {"41", "42", "43", "44"},
        };

        try {
            arraySizeException(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static void arraySizeException(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int result = 0;

        if(arr.length != 4)
            throw new MyArraySizeException("Массив должен быть размером 4х4");

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length != 4)
                throw new MyArraySizeException("Массив должен быть размером 4х4");

            for (int k = 0; k < arr[i].length; k++) {
                try {
                    result += Integer.parseInt(arr[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива из ячейки " + i + " " + k + " должен быть числом");
                }
            }

        }

        System.out.println(result);
    }

}
