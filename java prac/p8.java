
public class p8 {

    public static void main(String[] args) {
        String s1 = "harsh";
        int size1 = s1.length();
        str(s1, size1);
    }

    public static void str(String s1, int size1) {
        char[] s2 = new char[size1 * 2];
        int j = 0;
        for (int i = 0; i < size1; i++) {
            s2[j++] = s1.charAt(i);
            // j++;
            s2[j++] = s1.charAt(i);
            // j++;
        }
        String result = new String(s2);
        System.out.println(result);
        System.out.println("\n23DIT010_harsh donda");
    }
}
