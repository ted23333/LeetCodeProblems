import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       String str = "abcca";
       int re = char_index(str);
        System.out.println(re);
    }
    public static int char_index(String str)
    {
        int len = str.length();
         HashMap<Character,Integer> record = new HashMap<>();

        HashMap<Character,Integer> position = new HashMap<>();
        for(int i = 0;i<len;i++)
        {
            char c = str.charAt(i);
            record.putIfAbsent(c,0);
            record.compute(c,(k,v)->v+1);
            if(!position.containsKey(c)) position.put(c,i);
        }
        int result = -1;
        for(Map.Entry<Character,Integer> entry: record.entrySet())
        {
         if(entry.getValue()==1)
         {result = position.get(entry.getKey());
         break;}
        }
        return result;
    }
}
