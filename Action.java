public class Action {

    

    static void printStat(int[] Stat) {
        System.out.println("Hygiene = " + Stat[0]);
        System.out.println("Energy = " + Stat[1]);
        System.out.println("Fun = " + Stat[2]);
        System.out.println("");
    }

    static int[] Tidur(int[] currentStat, String type) {

        int postEnergy;
        if (type.equals("Malam")) {
            postEnergy = currentStat[1] + 15;
            if (postEnergy > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }

        }
        else if (type.equals("Siang")) {
            postEnergy = currentStat[1] + 10;
            if (postEnergy > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }
        }
        return currentStat;
    } // End of Aksi Tidur
    
    static int[] Makan(int[] currentStat, String type) {
        int postEnergy;

        if (type.equals("Hamburger")) {
            postEnergy = currentStat[1] + 5;
            if (postEnergy > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }
        }
        else if (type.equals("Pizza")) {
            postEnergy = currentStat[1] + 10;
            if (postEnergy > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }
        }
        else if (type.equals("Steak and Beans")) {
            postEnergy = currentStat[1] + 15;
            if (postEnergy > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }
        }
        return currentStat;
    } // End of Aksi Makan


    static int[] Minum(int[] currentStat, String type) {
        int postHygiene, postEnergy;

        if (type.equals("Air")) {
            postHygiene = currentStat[0] - 5;
            if (postHygiene < 0) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[0]= postHygiene;
                printStat(currentStat);
            }
        }
        else if (type.equals("Kopi")) {
            postEnergy = currentStat[1] + 5;
            postHygiene = currentStat[0] - 10;
            if ((postEnergy > 15) || (postHygiene < 0)) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                currentStat[0] = postHygiene;
                printStat(currentStat);
            }
        }
        else if (type.equals("Jus")) {
            postEnergy = currentStat[1] + 10;
            postHygiene = currentStat[0] - 5;
            if ((postEnergy > 15) || (postHygiene < 0)) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                currentStat[0] = postHygiene;
                printStat(currentStat);
            }
        }
        return currentStat;

    } // End of Aksi Minum

    static int[] BuangAir(int[] currentStat, String type) {
        int postEnergy, postHygiene;

        if (type.equals("Kecil")) {
            postHygiene = currentStat[0] + 5;
            if (postHygiene > 15) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[0] = postHygiene;
                printStat(currentStat);
            }
        }
        else if (type.equals("Besar")) {
            postEnergy = currentStat[1] - 5;
            postHygiene = currentStat[0] + 10;
            if ((postEnergy < 0) || (postHygiene > 15)) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                currentStat[0] = postHygiene;
                printStat(currentStat);
            }
        }
        return currentStat;
    } // End of BuangAir

    static int[] GoToCafe (int[] currentStat) {
        int postEnergy, postHygiene, postFun;
        postEnergy = currentStat[1] - 10;
        postHygiene = currentStat[0] - 5;
        postFun = currentStat[2] + 15;
        if ((postEnergy < 0) || (postHygiene < 0) || (postFun > 15)) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[1] = postEnergy;
            currentStat[0] = postHygiene;
            currentStat[2] = postFun;
            printStat(currentStat);
        }
        return currentStat;
    } // End of GoToCafe

    static int[] MainSocMed(int[] currentStat) {
        int postEnergy, postFun;
        postEnergy = currentStat[1] - 10;
        postFun = currentStat[2] + 10;
        
        if((postEnergy < 0) || (postEnergy > 15)) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[1] = postEnergy;
            currentStat[2] = postFun;
            printStat(currentStat);
        }
        return currentStat;
    } // End of MainSocMed

    static int[] MainKomputer(int[] currentStat) {
        int postEnergy, postFun;
        postEnergy = currentStat[1] - 10;
        postFun = currentStat[2] + 15;

        if ((postEnergy < 0) || (postFun > 15)) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[1] = postEnergy;
            currentStat[2] = postFun;
            printStat(currentStat);
        }
        return currentStat;
    } // End of MainKomputer

    static int[] Mandi(int[] currentStat) {
        int postHygiene, postEnergy;
        postEnergy = currentStat[1] - 5;
        postHygiene = currentStat[0] + 15;

        if ((postEnergy < 0) || (postHygiene > 15)) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[1] = postEnergy;
            currentStat[0] = postHygiene;
            printStat(currentStat);
        }
        return currentStat;
    } // End of Mandi

    static int[] CuciTangan(int[] currentStat) {
        int postHygiene;
        postHygiene = currentStat[0] + 5;
        if (postHygiene > 15) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[0] = postHygiene;
            printStat(currentStat);
        }
        return currentStat;
    } // End of CuciTangan

    static int[] DengarMusik(int[] currentStat) {
        int postFun, postEnergy;
        postFun = currentStat[2] + 10;
        postEnergy = currentStat[1] - 5;

        if ((postEnergy < 0) || (postFun > 15)) {
            System.out.println("Aksi tidak valid!");
        }
        else {
            currentStat[1] = postEnergy;
            currentStat[2] = postFun;
            printStat(currentStat);
        }
        return currentStat;
    } // End of DengarMusik

    static int[] Baca(int[] currentStat, String type) {
        int postFun, postEnergy;
        
        if (type.equals("Koran")) {
            postEnergy = currentStat[1]- 5;
            postFun = currentStat[2] + 5;
            if ((postFun > 15) || (postEnergy < 0)) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[1] = postEnergy;
                currentStat[2] = postFun;
                printStat(currentStat);
            }
        }
        else if (type.equals("Novel")) {
            postEnergy = currentStat[1] - 5;
            postFun = currentStat[2] + 10;
            if ((postFun > 15) || (postEnergy < 0)) {
                System.out.println("Aksi tidak valid!");
            }
            else {
                currentStat[2] = postFun;
                currentStat[1] = postEnergy;
                printStat(currentStat);
            }
        }
        return currentStat;
    } // End of Baca


}