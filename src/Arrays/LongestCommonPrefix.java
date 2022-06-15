package Arrays;


// Problem Link: https://leetcode.com/problems/longest-common-prefix/
class LongestCommonPrefix {
    public static String findCommonPrefix(String temp, String currentStr){
        System.out.println("find() Current: "+currentStr+" length: "+ currentStr.length()+" temp: "+temp);
    
        // Strings are of equal length
        String commonPrefix = "";
        if(temp.length() == currentStr.length()){

            for(int i=0; i<temp.length(); i++){
                if(temp.charAt(i) == currentStr.charAt(i)){
                    commonPrefix += temp.charAt(i);
                }else{
                    return commonPrefix;
                }
            }
        }
        return commonPrefix;
    }
    public static String longestCommonPrefix(String[] strs) {
        
        String longestCommonPre = "";
        if(strs.length == 1){
            return strs[0];
        }
        if(strs.length > 1){
            longestCommonPre = strs[0];
        }
        for(int i=1; i < strs.length; i++){
            String currentStr = strs[i];

            // If length of both strings are equal
            if(longestCommonPre.length() == currentStr.length()){
                System.out.println(" if Current: "+currentStr+" length: "+ currentStr.length()+" longestcommon: "+longestCommonPre);
                
                // Compare the two strings
                if(longestCommonPre.equals(currentStr)){
                    // If they are equal then longest common prefix till now
                    longestCommonPre = currentStr;
                }else{
                    longestCommonPre = findCommonPrefix(longestCommonPre, currentStr);
                }
            }else if(longestCommonPre.length() > currentStr.length()){
                System.out.println("else if Current: "+currentStr+" length: "+ currentStr.length()+" longestcommon: "+longestCommonPre);
                // If length of longest common prefix till now is greater than the current string
                
                // if longest commong prefix length is more than the new current string
                String temp = longestCommonPre.substring(0, currentStr.length());
                if(temp.equals(currentStr)){
                    // If they are equal then longest common prefix till now
                    longestCommonPre = currentStr;
                }else{
                    longestCommonPre = findCommonPrefix(temp, currentStr);
                }
                
            }else{
                // If length of longest common prefix till now is less than the current string
                System.out.println("else Current: "+currentStr+" length: "+ currentStr.length()+" longestcommon: "+longestCommonPre);
                String temp = currentStr.substring(0, longestCommonPre.length());
                if(temp.equals(longestCommonPre)){
                    // If they are equal then longest common prefix till now
                    longestCommonPre = temp;
                }else{
                    longestCommonPre = findCommonPrefix(temp, longestCommonPre);
                }
            }   
        }
        return longestCommonPre;
        
    }
    // Optimizes Solution Horizontal Scanning
    public static String longestCommonPrefix_optimized(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }        
        return prefix;
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        int i =0 ;
        String temp = strs[i].substring(0, strs[i].length() - 2);
        System.out.println(strs[i]);
        System.out.println(strs[i].length());
        System.out.println(temp);
        String common = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(common);

        System.out.println(longestCommonPrefix_optimized(strs));
        System.out.println("flower".indexOf("flow"));
    }
}
