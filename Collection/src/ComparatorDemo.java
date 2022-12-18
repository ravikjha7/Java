import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1 < i2) return 1;
        if(i1 > i2) return -1;
        return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        int arr[] = {7,3,8,99,1};
        int brr[] = {7,3,8,99,1};

        // Compare Returns 0 if same, 1 if 1st array is larger, -1 if 2nd array is larger
        System.out.println(Arrays.compare(arr,brr));

        // copyOf makes a Copy of Passed array upto given length
        int crr[] = Arrays.copyOf(arr,arr.length);
        Arrays.fill(crr,10);

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr,90));

        for(int x : crr) System.out.print(x + " ");
        System.out.println();

        Integer a[] = {7,3,99,8,1};

        Arrays.sort(a,new My());

        for(Integer x : a) System.out.print(x + " ");
        System.out.println();
    }
}
