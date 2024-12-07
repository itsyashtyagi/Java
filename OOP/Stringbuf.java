public class Stringbuf
{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("yash"); 
        System.out.println(str.capacity()); 
        str.append(" tyagi"); 
        System.out.println(str); 
        
        // StringBuffer and StringBuilder are mutable and String are immutable
        // The only difference btw the StringBuffer and StringBuilder is that StringBuffer is thread safe and StringBuilder is not

    }
}