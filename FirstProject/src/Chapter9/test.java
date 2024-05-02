package Chapter9;

public class test {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = str;
        str1 = "world";
        System.out.println(str+str1);

        char[] arr = new char[10];
        System.out.println(arr[0]);
        char [] arr1 = arr;
        arr1[0] = 78;
        System.out.println(arr[0]);

        // double d = 'd';
      
    }
}
