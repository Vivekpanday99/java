package stringshort;

public class stringone {
    public static void main(string[] args){
        String[]str=["A","C","B"];
        for(int i=0;i<Str.length-1;i++)
        {
          for(int j=0;j<Str.length-i-1;j++)
          {
            if ((int)str [j].charAt(0)>(int)str[j+1].charAt(0)){B
                Sring temp=str[i];
                str[j]=str[j+1];
                str[j+1]=temp;
             }
          }
        }
    }
    
    
}
