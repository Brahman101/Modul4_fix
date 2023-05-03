package modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Operator {
    String codeName, ruangan, job;
    int opID;

    public Operator(String cd, String rm, String jb, int id){
        codeName = cd;
        ruangan =rm;
        job = jb;
        opID = id;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Operator> op = new HashMap<>();
        String input;
        Operator data;

        op.put("1", new Operator("Thorns", "Dorm", "Guard", 20211));
        op.put("2", new Operator("Nian", "Workshop", "Defender", 20212));
        op.put("3", new Operator("Chen", "Training Ground", "Sniper", 20213));

        System.out.println("Operator ID : ");
        input = in.nextLine();
        data = op.get(input);
        if (data != null){
            System.out.println("Data Operator : "+data.codeName+ ", ruangan : "+ data.ruangan+
                    ", Job : "+data.job+", Operator ID : "+data.opID);
        }
    }
}
