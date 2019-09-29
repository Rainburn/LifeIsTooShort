import java.util.Scanner;

public class main {

    static boolean LifeGoesOn(int[] currentStat) {
        int hygiene, energy, fun;
        hygiene = currentStat[0];
        energy = currentStat[1];
        fun = currentStat[2];
        if ((hygiene == 15) && (energy == 15) && (fun == 15)) {
            return false;
        }
        else if ((hygiene == 0) && (energy == 0) && (fun == 0)) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        int i, hygiene, energy, fun;
        String command, action, type;
        int myStat[] = new int[3];
        /*
        Hygiene = myStat[0]
        Energy = myStat[1]
        Fun = myStat[2]
        */

        type = "";

        Scanner scanAction = new Scanner(System.in);
        Action getAction = new Action();

        myStat[0] = 0;
        myStat[1] = 10;
        myStat[2] = 0;


        while (LifeGoesOn(myStat)) {
            command = scanAction.nextLine();
            String[] commandSplit = command.split(" ");

            action = commandSplit[0];

            if ( action.equals("Tidur") || action.equals("Makan") || action.equals("Minum") || action.equals("Membaca")) {
                type = commandSplit[1];

                if (action == "Tidur") {
                    myStat = getAction.Tidur(myStat, type);
                }
                else if (action.equals("Makan")) {
                    myStat = getAction.Makan(myStat, type);
                }
                else if (action.equals("Minum")) {
                    myStat = getAction.Minum(myStat, type);
                }
                else if (action.equals("Membaca")) {
                    myStat = getAction.Baca(myStat, type);
                }
            }

            else if (action.equals("Bermain")) {
                type = commandSplit[1];

                if (type.equals("Media")) {
                    myStat = getAction.MainSocMed(myStat);
                }
                else if (type.equals("Komputer")) {
                    myStat = getAction.MainKomputer(myStat);
                }

            }

            else if (action.equals("Buang")) {
                type = commandSplit[2];
                myStat = getAction.BuangAir(myStat, type);
            }
            else if (action.equals("Bersosialisasi") || action.equals("Mandi") || action.equals("Cuci") || action.equals("Mendengarkan")) {
                if (action.equals("Bersosialisasi")) {
                    myStat = getAction.GoToCafe(myStat);
                }
                else if (action.equals("Mandi")) {
                    myStat = getAction.Mandi(myStat);
                }
                else if (action.equals("Cuci")) {
                    myStat = getAction.CuciTangan(myStat);
                }
                else if (action.equals("Mendengarkan")) {
                    myStat = getAction.DengarMusik(myStat);
                }
            }

            System.out.println("");

        } // Looping your Action


    }


}