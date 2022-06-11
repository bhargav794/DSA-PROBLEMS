//Didn't pass all the test cases due to time limit 


// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        int c = 0;
        boolean x[] = new boolean[n];
        Arrays.fill(x,false);
        for(int i=0;i< n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                
                if(arr[i]==arr[j]){
                    x[i] = true;
                    x[j] = true;
                    count++;
                }
                
            }
            if(count==1 && c==0 && !x[i]){
                c =arr[i];
            }
        }
        return c;
    }  
    
}

