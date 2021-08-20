package homework2;

public class Problem4 {

    public int countHi(String str) {
        int count = 0;
        if (str.length() ==1 && str.charAt(0) == 'h')
        count = 0;
  else
        {
            for(int i = 0;i <str.length();i++) {
                if ( (str.charAt(i) == 'h') && (str.charAt(i+1) == 'i') )
                count +=1;
            }
        }
        return count;
    }

}
