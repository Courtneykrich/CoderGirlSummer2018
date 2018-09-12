public class Temperature {


    public static void main(String[] args) {
        int rowTotal = 0;
        int columntotal = 0;
        int temps[][] = {
                {68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}

        };
        String dayOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String timeOfDay[] = {"7am", "3pm", "7pm", "3am"};
        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][0];
        }
//      System.out.println(columntotal);
        float average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[0] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][1];
        }
        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[1] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][2];
        }

        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[2] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][3];
        }

        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[3] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][4];
        }

        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[4] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][5];
        }

        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[5] + " was " + average + " degress.");

        columntotal = 0;

        for (int i = 0; i < temps.length; i++) {
            columntotal += temps[i][6];
        }

        average = columntotal / (float) temps.length;
        System.out.println("The average temperature " + dayOfWeek[6] + " was " + average + " degress.");
        System.out.println();

        rowTotal = 0;
        for (int d = 0; d < temps.length; d++) {
            rowTotal += temps[0][d];
        }
        average = rowTotal / (float) temps.length;
        System.out.println("The average temperature at " + timeOfDay[0] + " was " + average + " degrees.");

        rowTotal = 0;
        for (int d = 0; d < temps.length; d++) {
            rowTotal += temps[1][d];
        }
        average = rowTotal / (float) temps.length;
        System.out.println("The average temperature at " + timeOfDay[1] + " was " + average + " degrees.");

        rowTotal = 0;
        for (int d = 0; d < temps.length; d++) {
            rowTotal += temps[2][d];
        }
        average = rowTotal / (float) temps.length;
        System.out.println("The average temperature at " + timeOfDay[2] + " was " + average + " degrees.");

        rowTotal = 0;
        for (int d = 0; d < temps.length; d++) {
            rowTotal += temps[3][d];
        }
        average = rowTotal / (float) temps.length;
        System.out.println("The average temperature at " + timeOfDay[3] + " was " + average + " degrees.");

        System.out.println();
        int sum=0;
        int count=0;
        for (int rows=0;rows<timeOfDay.length;rows++){
            for (int columns=0;columns<dayOfWeek.length;columns++){
                sum+= temps[rows][columns];
                count++;
            }
        }
        int totalavg=(int)sum/count;
        System.out.println("The average temperature for the week was "+totalavg+" degrees.");
    }
}