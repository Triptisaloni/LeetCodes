import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        
        
        int n = salary.length;
        
        Arrays.sort(salary);
        int sum=0;
        
        for(int i =1; i<n-1; i++)
            sum=sum+salary[i];
        
        double d = (n-2) * 1.0;
        
        double res = sum/d;
        // sum = sum/(n-2);
        
        return res;
    }
}