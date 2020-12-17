public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        int length = haystack.length() + 1;
        for (int i = 0; i < length; i++){
            if (haystack.substring(0,i).contains(needle)){
                return (i - needle.length());
            }
        }
        return 0;
    }
}
