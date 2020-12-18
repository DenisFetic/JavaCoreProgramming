package Three;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {
                'd', 'f', 'c', 'a', 'f',
                'f', 'e', 't', 'i', 'n',
                'e', 'e', 'j'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);
    }
}
