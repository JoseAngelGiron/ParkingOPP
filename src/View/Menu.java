package View;

public class Menu {
    //Vista no puede devolver nada relacionado con el modelo, NUNCA
    public static int mainMenu(){
        System.out.println("Bienvenido a ParkingSoft v0.1");
        System.out.println("1. Listar coches");
        System.out.println("2. Cuantos coches hay");
        System.out.println("3. Aparcar un coche");
        System.out.println("4. Sacar un coches");
        System.out.println("5. Salir");
        return UI.readInt("Elija una opción");

    }
    public static String parkingMenu_Step1(){

        return UI.readString("Inserte la matrícula");
    }
    public static String parkingMenu_Step2(){

        return UI.readString("Inserte el modelo");
    }
    public static int parkingMenu_Step3(){

        return UI.readInt("Inserte la edad");
    }

    public static  String unparkingMenu(){

        return UI.readString("Inserte la matricula");

    }
}
