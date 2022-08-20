class Solution {
    public String multiply(String num1, String num2) {
        if(num1 == "" || num2 == ""){
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] res = new int[n + m];
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                int mul = (num1.charAt(i) -'0') * (num2.charAt(j)-'0');
                int p1 = i + j;
                int p2 = i + j + 1;
                
                int sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
        }
        
        int i = 0;
        while(i < m + n && res[i] == 0 ){
            i++;
        }
        
        StringBuilder res_string = new StringBuilder();
        for(; i < m + n; i++){
            res_string.append(String.valueOf(res[i]));
        }
        
        return res_string.toString().equals("") ? "0" : res_string.toString();
    }
}