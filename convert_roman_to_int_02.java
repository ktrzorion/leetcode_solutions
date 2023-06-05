// Time Complexity = O(N)
// Space Complexity = O(1)

public class Convert{
  public int romanToInt(String s){
    int value = 0, num = 0;
    
    // Initialized loop to iterate roman string.
   for (int i=s.length()-1; i>=0; i--){
     
     // Convert string to upper case letter.
     char ch = Character.toUpperCase(s.charAt(i));
     // Assign switch cases and values.
     switch(ch){
       case 'I': num = 1;
         break;
       case 'V': num = 5;
         break;
       case 'X': num = 10;
         break;
       case 'L': num = 50;
         break;
       case 'C': num = 100;
         break;
       case 'D': num = 500;
         break;
       case 'M': num = 1000;
         break;
     }
     
     if (4 * num < value) value-= num;
     else
       value += num;
   }
    return value;
  }
}
