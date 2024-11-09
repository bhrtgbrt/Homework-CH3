import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P43 {


	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入字串");
		
		BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
		
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        int ans = Math.max(Integer.parseInt(str1), Integer.parseInt(str2));
        System.out.println(Integer.parseInt(str1) +" 與 "+ Integer.parseInt(str2) +" 中較大的是 "+ ans);
	}

}
