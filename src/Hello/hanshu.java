package Hello;
import java.util.Scanner;  
public class hanshu {  
      
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner in = new Scanner(System.in);  
          
        String now = null;  
        String str = in.nextLine();  
        String end = new String("END");  
        String start = new String("$GPRMC");  
        while(!str.equals(end))
        {  
            String[] ss = str.split(",");
                if(!ss[0].equals(start))
                {
                 str=in.nextLine();
                 continue;
                }  
            boolean tag=false;  
            int i,result=0;  
            char ch;  
            ch=str.charAt(1);
            for(result=str.charAt(1),i=2;ch!='*';i++,ch=str.charAt(i))
            {  
                ch=str.charAt(i);  
                result^=(int)ch;  
            }  
            result%=65536;  
            String num = str.substring(i+1, i+3);
              
            char state = ss[2].charAt(0);  
            num=num.toLowerCase();
            if(num.equals(Integer.toHexString(result))&&state=='A')
            {
            	now=ss[1];  
            }
            str=in.nextLine();  
        }  
        if(now==null)
        {
        	System.exit(0);
        }  
        String hh=now.substring(0, 2);  
        String mm =now.substring(2, 4);  
        String ss =now.substring(4, 6);  
        int hour = Integer.parseInt(hh);  
        hour=(hour+8)%24;  
        if(hour<10)  
            {
        	System.out.print(0); 
            } 
        System.out.println(hour+":"+mm+":"+ss);
    }  
}  
