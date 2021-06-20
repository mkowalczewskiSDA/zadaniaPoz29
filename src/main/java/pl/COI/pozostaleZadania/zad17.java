package pl.COI.pozostaleZadania;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class zad17 {
    public static void main(String[] args) {

        String adult = "96082501234";
        var age2 = adult.substring(0,6);
        String[] splitMe = adult.split("(?!^)");

        ArrayList<String> splitIdNumber = new ArrayList<String>();

        for (int i = 0; i < splitMe.length; i++) {
            splitIdNumber.add(splitMe[i]);
        }

        int yearOfBirth = Integer.parseInt(splitMe[0] + splitMe[1]);
        int monthOfBirth = Integer.parseInt(splitMe[2] + splitMe[3]);
        int dayOfBirth = Integer.parseInt(splitMe[4] + splitMe[5]);
        String fullYear;

        //wybór dwóch pierwszych cyfr pełnego roku urodzenia
        switch (splitMe[6]) {
            case "8": {
                fullYear = "18" + yearOfBirth;
                break;
            }
            case "0": {
                fullYear = "19" + yearOfBirth;
                break;
            }
            case "2": {
                fullYear = "20" + yearOfBirth;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + splitMe[6]);
        }

        LocalDate birthdate = LocalDate.of(Integer.parseInt(fullYear), monthOfBirth, dayOfBirth);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthdate, now).getYears();
        if (age >= 18) {
            System.out.println("Osoba pełnoletnia");
        } else {
            System.out.println("Osoba niepełnoletnia");
        }
    }
}
