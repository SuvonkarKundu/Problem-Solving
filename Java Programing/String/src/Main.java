
public class Main {
    public static void main(String[]args)
    {
      String palindrom="Dot saw I was Tod";
       int len=palindrom.length();
       char[] tempcharArray=new char[len];
        char[] charArray=new char[len];
        for(int i=0;i<len;i++)
        {
         tempcharArray[i]=palindrom.charAt(i);
        
        }
       for(int j=0;j<len;j++)
       {
         charArray[j]=tempcharArray[len-1-j];
       
       }
       String ReverseCharArray= new String(charArray);
       System.out.println(ReverseCharArray);
    
    }
}
