import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List myList = new ArrayList();

        System.out.println(myList);

        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");

        // System.out.println(myList);

        myList.add(2, "Cat");

        // System.out.println(myList);

        myList.set(2, "Crab");

        // myList.add("Dog");

        System.out.println(myList);

        // removeDuplicates(myList);

        doubleList(myList);

        System.out.println(myList);

        // System.out.println(noDupList);
        // myList.remove(1);

        // System.out.println(myList);

        // System.out.println(myList.size());

        // System.out.println(myList.get(2));

        // System.out.println(myList);

        // removeEvenLength(myList);

        // System.out.println(myList);

        // averageVowels(myList);

        // int lengthAnimalname = (myList.get(1)).toString().length();
        // System.out.println(lengthAnimalname);

        List intList = new ArrayList<Integer>();
        intList.add(9);
        intList.add(3);
        intList.add(1);
        intList.add(8);

        System.out.println(intList);

        minToFront(intList);

        System.out.println(intList);
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
        int vowels = 0;
        for (String s : myList) {
            String temp = s.toLowerCase();
            for (char c : temp.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels = vowels + 1;
                }
            }
        }

        averageNumVowels = vowels / myList.size();
        return averageNumVowels;
    }

    public static void removeDuplicates(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++)
                if (myList.get(i).equals(myList.get(j))) {
                    myList.remove(j);
                    j--;
                }
        }
    }

    public static void doubleList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            myList.add(i, myList.get(i));
            i++;
        }
    }

    public static void minToFront(List<Integer> intList) {
        int minValue = intList.get(0);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < minValue) {
                minValue = intList.get(i);
            }

        }
        for(int i=0;i<intList.size();i++){
            if(intList.get(i).equals(minValue)){
                intList.remove(i);
            }
        }
        intList.add(0,minValue);
    }
}