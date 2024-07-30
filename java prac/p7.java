
public class p7 {

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 5, 5, 6, 7, 9, 4, 9, 9 };
        int n = arr.length;
        int k = 9;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        System.out.println("number 9 is repites at " + count + " times.");
        System.out.println("\n23DIT010_harsh donda");
    }
}
