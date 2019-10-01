import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tiara {

    public static void main(String[] args) {
        printState();

    }

    static boolean isSameArray(int[] states, int[] copystates) {
        int i;
        boolean same = true;
        for (i = 0; i < states.length; i++) {
            if (states[i] != copystates[i]) {
                same = false;
            }
        }
        return same;
    }

        
    static void printState() {
        String fileName;
        int i, j, k, l;
        int[] states = new int[3];
        int[] copystates = new int[3];
        int[] poststates = new int[3];

        Action getAction = new Action();

        Scanner input = new Scanner(System.in);
        System.out.print("Save file with name : ");
        fileName = input.nextLine();
        File myFile = new File(fileName + ".txt");


        try {
            if (!(myFile.exists())) {
                myFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(myFile, true));
            out.append("State            "); // 5 Spaces, 17 chars
            i = 1;
            while (i <= 18) {
                switch(i) {
                    case 1:
                    out.append("Tidur Siang     "); 
                    break;

                    case 2:
                    out.append("Tidur Malam     "); 
                    break;

                    case 3:
                    out.append("Makan Hamburger "); 
                    break;

                    case 4:
                    out.append("Makan Pizza     "); 
                    break;

                    case 5:
                    out.append("Makan Steak and Beans"); 
                    break;

                    case 6:
                    out.append("Minum Air       "); 
                    break;

                    case 7:
                    out.append("Minum Kopi      "); 
                    break;

                    case 8:
                    out.append("Minum Jus       "); 
                    break;

                    case 9:
                    out.append("Buang Air Kecil "); 
                    break;

                    case 10:
                    out.append("Buang Air Besar "); 
                    break;

                    case 11:
                    out.append("Bersosialisasi ke kafe"); 
                    break;

                    case 12:
                    out.append("Bermain MedSos  "); 
                    break;

                    case 13:
                    out.append("Bermain Komputer"); 
                    break;

                    case 14:
                    out.append("Mandi           "); 
                    break;

                    case 15:
                    out.append("Cuci Tangan     "); 
                    break;

                    case 16:
                    out.append("Dengan Musik    "); 
                    break;

                    case 17:
                    out.append("Baca Koran      "); 
                    break;

                    case 18:
                    out.append("Baca Novel      "); 
                    break;
                }
                i++;
            }
            out.append("\n");


            for (i = 0; i <= 15; i = i+5) {
                for (j = 0; j <= 15; j = j+5) {
                    for (k = 0; k <= 15; k = k+5) {
                        // Now get the Actions
                        l = 1;
                        out.append("[" + i + "," + j + "," + k + "]          ");
                        while (l <= 18) {
                            states[0] = i;
                            states[1] = j;
                            states[2] = k;
                            copystates[0] = i;
                            copystates[1] = j;
                            copystates[2] = k;
                            switch(l) {
                                case 1:
                                    poststates = getAction.Tidur(states, "Siang");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 2:
                                    poststates = getAction.Tidur(states, "Malam");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 3:
                                    poststates = getAction.Makan(states, "Hamburger");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 4:
                                    poststates = getAction.Makan(states, "Pizza");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 5:
                                    poststates = getAction.Makan(states, "Steak and Beans");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 6:
                                    poststates = getAction.Minum(states, "Air");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 7:
                                    poststates = getAction.Minum(states, "Kopi");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 8:
                                    poststates = getAction.Minum(states, "Jus");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 9:
                                    poststates = getAction.BuangAir(states, "Kecil");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 10:
                                    poststates = getAction.BuangAir(states, "Besar");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 11:
                                    poststates = getAction.GoToCafe(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 12:
                                    poststates = getAction.MainSocMed(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 13:
                                    poststates = getAction.MainKomputer(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 14:
                                    poststates = getAction.Mandi(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 15:
                                    poststates = getAction.CuciTangan(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 16:
                                    poststates = getAction.DengarMusik(states);
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 17:
                                    poststates = getAction.Baca(states, "Koran");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;

                                case 18:
                                    poststates = getAction.Baca(states, "Novel");
                                    if (isSameArray(poststates, copystates)) {
                                        out.append("NotValid");
                                    }
                                    else {
                                        out.append("[" + states[0] + "," + states[1] + "," + states[2] + "]          ");
                                    }
                                break;
                            } // End of switch
                            l++;
                        } // end of while
                        out.append("\n");
                    }

                }

            }

            out.close();
        }  catch(Exception e) {
            System.out.println("Error!");
        }

    }


}