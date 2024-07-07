import java.util.*;
public class ArrayListExample{
    public static void main(String[] ar){
        List<String> strList=new ArrayList<>();

        //add elements
        strList.add("IBM");
        strList.add("TCS");
        strList.add("CTS");
        strList.add("CTS");
        System.out.println(strList);
        //Size
        System.out.println("Size="+strList.size());
        strList.add(2,"OPENTEXT");
        System.out.println(strList);
        strList.remove(3);
        System.out.println(strList);
        System.out.println("Element at index 3="+strList.get(3));

        for(String str:strList){
            System.out.println(str);
        }
        

    }
}