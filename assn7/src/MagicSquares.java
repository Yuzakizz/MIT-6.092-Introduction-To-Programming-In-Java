import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
        public static void main(String[] args) throws IOException {
            FileReader fr = new FileReader("assn7/Luna.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            int constant=-1;
            while ((line = br.readLine()) != null) {
               // System.out.println(line);
                String[] strings =line.split("\t");//这一行存为字符串数组
                if(constant==-1){
                    constant=getSum(strings);
                }
                else if(getSum(strings)!=constant)
                {
                    System.out.println("not equal");
                    break;
                }
            }
            System.out.println("sum is "+constant);
            br.close();
        }
        public static int getSum(String[] string){
               int constant=0;
               // constant += Integer.parseInt(string);
            for(String str:string){
                constant +=Integer.valueOf(str);
            }
                return constant;
        }
}