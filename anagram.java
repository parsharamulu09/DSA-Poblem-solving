public class anagram {
    public static boolean areAnagrams(String s1, String s2) {
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }else{
            return false;
        }
    }
}
