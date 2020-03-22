import java.util.Scanner;
import java.util.HashMap;

public class ymirworld {
    public static void main(String[] args) {

        HashMap<String, worlddata> ymirWorlds = new HashMap<String, worlddata>();

        boolean quit = false;
        String strWorld ="" , strWorld2 ="" ;
        Scanner sc= new Scanner(System.in);

        System.out.println("** Add new world by writing add world **");
        System.out.println("** Get name of all world by writing get **");
        System.out.println("** quite application by writing quit **");
        //reads string
        while (!quit) {
            System.out.println("** Waiting for new input **");
            String str= sc.nextLine();
            switch (str) {
                case "add world":
                    System.out.println("** Give world a name **");
                    strWorld= sc.nextLine();
                    worlddata worlddataTemp = new worlddata();
                    ymirWorlds.put(strWorld, worlddataTemp);
                    System.out.println("** New worlds name is now; " + strWorld + " **");
                    break;
                case "get worlds":
                    for (String i : ymirWorlds.keySet()) {
                        System.out.println(i);
                    }
                    break;
                case "clear worlds":
                    ymirWorlds.clear();
                    System.out.println("** All ymir worlds is now deleted **");
                    break;
                case "quit":
                    System.out.println("** Quiting application **");
                    quit = true;
                default:
                    System.out.println("** write world1, world2, get or quit **");
            }
        }

    }
}
