
import java.io.*;
import java.util.Scanner;

public class reverseArrayOrString {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        char[] ch = input.toCharArray();
        reverse(ch, 0, input.length() - 1);

        System.out.println(String.valueOf(ch));
    }

    static void reverse(char arr[], int start, int end) {
        char temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
