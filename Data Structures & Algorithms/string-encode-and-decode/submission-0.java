class Solution {

    int[] encodedLen;

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        encodedLen = new int[strs.size()];

        for(int i = 0; i < strs.size(); i++) {
            String str = strs.get(i);
            sb.append(str);
            encodedLen[i] = str.length();
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int prev = 0;
        for(int i = 0 ; i < encodedLen.length; i++) {
            String chunk = str.substring(prev, prev + encodedLen[i]);
            decoded.add(chunk);
            prev = encodedLen[i];
        }
        return decoded;
    }
}
