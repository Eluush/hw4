public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний ");
        } else   {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия,нужно немного подождать");
        }

        int degrees = 2;
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов,можно идти без шапки ");
        } else   {
            System.out.println("На улице " + degrees + " градусов,нужно надеть шапку ");
        }

        int speed = 55;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }

        int year = 30;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " ,то есму нужно ходить в детский сад");
        } else if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " ,то ему нужно ходить в школу ");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " ,то его место в университете");
        } else if (year > 24) {
            System.out.println("Если возраст человека равен " + year + " ,то ему пора ходить на работу");
        }

        int annum = 13;
        if (annum < 5) {
            System.out.println("Если возраст ребенка равен " + annum + " ,то ему нельзя кататься на аттракционе");
        } else if (annum > 5 && annum <= 14) {
            System.out.println("Если возраст ребенка равен " + annum + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (annum > 14) {
            System.out.println("Если возраст ребенка равен " + annum + " ,то ему можно кататься на аттракционах без сопровождения взрослых");
        }

        int carCapasity = 102;
        int seatPlace = 60;
        int standPlace = carCapasity - seatPlace;
        int passenger = 120;
        if (passenger < 60) {
            System.out.println("В вагоне есть сидячие места ");
        } else if (passenger > 60 && passenger < 120) {
            System.out.println("То в вагоне есть стоячие места ");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        int one = 10;
        int two = 9;
        int tree = 8;
        if (one > two && one > tree) {
            System.out.println("первое число наибольшее");
        } else if (two > tree){
            System.out.println("второе число больше");
        }else {
            System.out.println("третье число больше");
        }


    }
}