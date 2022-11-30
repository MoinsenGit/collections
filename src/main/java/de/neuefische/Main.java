package de.neuefische;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // LIST
        List<String> weekday = new ArrayList<>();
        weekday.add("Monday");
        weekday.add("Tuesday");

        System.out.println(weekday);
        for (String day : weekday) {  // verkürzte Form von LANGE VERSION String day deklariert = Element der Liste aus der Liste weekday
            System.out.println(day);
        }

        // LANGE VERSION
        for (int i = 0; i < weekday.size(); i++) {
            System.out.println(weekday.get(i));
        }

        List<String> months = new ArrayList<>(
                Arrays.asList(                   // Arrays.asList ist nicht erweiterbar
                        "January",
                        "February",
                        "March"
                )
        );

        System.out.println(months);

        // SET
        Set<Integer> numbers = new HashSet<>(); // gleiche Einträge (Duplikate) werden ignoriert -
        // genutzt zum Beispiel, wenn man die Daten auslesen will, die nicht doppelt sind
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);



    // MAP
    Map<Integer, String> catNames = new HashMap<>();
    catNames.put(1, "Fischi");
    catNames.put(2, "Meatball");
    catNames.putIfAbsent(4, "Meta");
    catNames.put(6, "Mimi");
    System.out.println(catNames);
    System.out.println(catNames.keySet());

    Map<Integer, String> dogNames = Map.of(
            1, "Rex",
            2, "Wuffi"
    );
        System.out.println(dogNames);
}
}