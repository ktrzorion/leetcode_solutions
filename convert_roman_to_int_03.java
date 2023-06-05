// Time Complexity = O(n)
// Space Complexity = O(1)

class Convert{
  public int romanToInt(String s){
    HashMap < Character, Integer > map = new HashMap <>();
    
    // Mapping
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    
    // Initialize value
    int value = map.get(s.charAt(s.length()-1));
    
    // Loop to iterate string
    for(int i = s.length()-2; i>=0; i--){
      if(map.get(s.charAt(i)) <  map.get(s.charAt(i+1))){
        value -= map.get(s.charAt(i));
      }
       else{
         value += map.get(s.charAt(i));
      }
    }
    return value;
  }
}
