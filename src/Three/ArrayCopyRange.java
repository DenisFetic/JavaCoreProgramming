package Three;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        char[] copyFrom = {
                'd', 'f', 'c', 'a', 'f',
                'f', 'e', 't', 'i', 'n',
                'e', 'e', 'j'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 11);
        System.out.println(copyTo);

    }
}
