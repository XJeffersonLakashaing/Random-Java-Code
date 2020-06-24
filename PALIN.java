/*
 * 
 */
public class PALIN{
    public static void main(String args[]){
        String str="LOOL";
        String st="";
        String check="";
        int l=str.length();
        int k=0,R=0; 
        char chr;
        for(int i=0;i<l;i++){
            chr=str.charAt(i);
            st=chr+st;
        }
        check=st; 
        if(check==st)
        k=1;
        if(k==1)
        System.out.println(st);
        else 
        System.out.println("NO");
    }
}
            
        