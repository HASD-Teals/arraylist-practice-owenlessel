import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List myList = new ArrayList();

        System.out.println(myList);

        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");

        System.out.println(myList);

        myList.add(2, "Cat");

        System.out.println(myList);

        myList.set(2, "Crab");

        System.out.println(myList);

        myList.remove(1);

        System.out.println(myList);

        System.out.println(myList.size());

        System.out.println(myList.get(2));

        System.out.println(myList);

        removeEvenLength(myList);

        System.out.println(myList);

        averageVowels(myList);

        // int lengthAnimalname = (myList.get(1)).toString().length();
        // System.out.println(lengthAnimalname);
    }

    public static void removeEvenLength(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() % 2 == 0) {
                myList.remove(i);
            }
        }
    }

    public static double averageVowels(List<String> myList) {
        double averageNumVowels = 0.0;
        int vowels=0;
        for (String s : myList) {
            String temp=s.toLowerCase();
            for (char c : temp.toCharArray()) {
                    if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                        vowels=vowels+1;
                    }
                }
            }
        
        averageNumVowels=vowels/myList.size();
        return averageNumVowels;
    }
}
