package rocks.zipcode.quiz4.collections;

import rocks.zipcode.quiz4.arrays.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounter {
    String [] strings;
    public WordCounter(String... strings) {
        this.strings=strings;
    }

    public Map<String, Integer> getWordCountMap(){

      Map<String,Integer> hmap=new HashMap<String, Integer>();
      int count=0;
      for(int i=0;i<strings.length;i++){
         count=0;
          for(int j=0;j<strings.length;j++){
              if(strings[i]==strings[j])
                  count++;
          }hmap.put(strings[i],count);
      }

        return hmap;
    }
}
