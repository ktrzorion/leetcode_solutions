// Time Complexity = O(N)
// Space Complexity = O(1)

class Solution{
  public int romanToInt(String s){
    // Writing string according to their values in descending order.
    String symbol = "MDCLXVI";
    // Alloting values to letter by index.
    int{} value = {1000, 500, 100, 50, 10, 5, 1}
    
      //The loop for iterating Roman String.
      for(int i = s.length()-1, i>=0; i--){
        int current = value[symbol.indexOf(s.charAt(i))]
          if(past <= current) num += current;
          else (num -= current);
          past = current;
      }
    return num;
  }
}
