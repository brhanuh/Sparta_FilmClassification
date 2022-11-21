package org.example;

public class FilmClassifications {
    public static String availableClassifications(int ageOfViewer)

    {
        String result;
        if(ageOfViewer < 0 || ageOfViewer > 120){
            result = "Age does not exist";
        }
        else if(ageOfViewer < 4){
            result = "No films are available.";
        }
        else if(ageOfViewer < 8){
            result = "U films are available";
        }
        else if (ageOfViewer < 12)
        {
            result = "U, PG films are available.";
        }

        else if (ageOfViewer < 15)
        {
            result = "U, PG, 12A, 12 films are available.";
        }
        else if (ageOfViewer < 18){
            result = "U, PG, 12A, 12, 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;

    }
}
