import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class ReduntantLetter {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int len = line.length();
        char a[] = line.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        int count=0;
        for(int i=0;i<len;i++)
        {
        	if(!set.contains(a[i]))
        	{
        		set.add(a[i]);
        	}
        	else
        	{
        		count++;
        	}
        }
        
        System.out.println(count);
    }
}
