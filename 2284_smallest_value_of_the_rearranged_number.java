class Solution {
    public long smallestNumber(long num) {
        String s = Long.toString(Math.abs(num));
        char[] ch = s.toCharArray();
        
        // Sort in ascending
        Arrays.sort(ch);

        if (num > 0) {
            if (ch[0] == '0') {
                for (int i=1; i<ch.length;i++) {
                    // swap first 0 with first non-zero digit
                    if(ch[i] != '0') {
                        char temp = ch[0];
                        ch[0] = ch[i];
                        ch[i] = temp;
                        break;
                    }
                }
            }
        } else {
            // simply reverse the array if negative num
            int si = 0;
            int ei = ch.length-1;

            while(si < ei) {
                char temp = ch[si];
                ch[si] = ch[ei];
                ch[ei] = temp;

                si++;
                ei--;
            }
        }

        // Convert char[] to String, then parse
        long n = Long.parseLong(new String(ch));

        return num > 0 ? n : -n;
    }
}