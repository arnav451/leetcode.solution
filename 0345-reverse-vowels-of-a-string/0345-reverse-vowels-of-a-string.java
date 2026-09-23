class Solution {
    public String reverseVowels(String s) {
        Set<Character> st = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (st.contains(arr[i]) && st.contains(arr[j])) {            
              char temp = arr[i];
             arr[i] = arr[j];
              arr[j] = temp;
                i++;
                j--;
            }
            else if (st.contains(arr[i])&&!st.contains(arr[j])) {
                j--;
            }
            else if (!st.contains(arr[i])&& st.contains(arr[j])) {
                i++;
            }
            else if (!st.contains(arr[i]) && !st.contains(arr[j])) {
                i++;
                j--;
            }
        }
   return String.valueOf(arr);
    }
}
