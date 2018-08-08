package org.prime.number;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N = 10;
		    int x = 2;

		    for(int i = 0; i <= N; i++)
		    {
		        int count = 0;

		        for(int j = 1; j <= x; j++)
		        {
		            if(x%j == 0)
		                count++;
		        }
		        if(count == 2)
		            System.out.print(x + " ");
		        
		        x++;
		    }

}
}