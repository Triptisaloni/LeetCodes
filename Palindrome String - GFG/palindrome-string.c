// { Driver Code Starts
//Initial Template for C

#include <stdio.h>
#include <string.h>
#include <stdbool.h>


 // } Driver Code Ends
//User function Template for C

int isPalindrome(char S[])
{
    // Your code goes here
    // int n = S.size();
    int i=0;
    int j=strlen(S)-1;
    
    while(i<j)
    {
        if(S[i]!=S[j])
        return 0;
        
        i++;
        j--;
    }
    
    return 1;
}

// { Driver Code Starts.

int main() 
{
   	int t;
   	scanf("%d", &t);
   	while(t--)
   	{
   		char s[100000];
   		scanf("%s", s);


   		printf("%d\n", isPalindrome(s));
   	}

    return 0;
}  // } Driver Code Ends