import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static sun.util.calendar.CalendarUtils.mod;

/**
 * Created by Asus on 9/29/2017.
 */
public class OK {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    private static   String s="";

    //String s = "";


    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void main(String[] args) throws IOException {



                //method 1

        /*Scanner scn=new Scanner(System.in);
        Integer i=scn.nextInt();

        Random r = new Random();

        Integer Low = i/6;
        Integer High = i/4;
        for (Integer j = 0; j <8 ; j++) {
            Integer Result = r.nextInt(High-Low) + Low;
            System.out.println(Result);
        }
*/
        //int checkerstudent_no=mod(1*5+mod(i,1000)+60,122)+1;

        //int exercise_no=mod(1*20+mod(i,1000),26)+1;
        //System.out.println(checkerstudent_no+"\n"+exercise_no);

                //format timestamp
                //System.out.println(sdf.format(timestamp));


        File fnew=new File("F:\\J\\test\\src\\abc.txt");
        FileInputStream fin=new FileInputStream(fnew);
        BufferedInputStream bis=new BufferedInputStream(fin);
        byte[] component;
        int chunkSize=8;
        component=new byte[chunkSize];
        bis.read(component,0,chunkSize);



        for (int i = 0; i <chunkSize ; i++) {
            System.out.println((char)component[i]);
            System.out.println((int) component[i]);
            System.out.println(Integer.toBinaryString( (int) component[i]));
            s+=Integer.toBinaryString( (int) component[i]);

        }
        System.out.println(s);
        System.out.println(s.length());
        //System.out.println("There r 8 bytes , do u want to Change?[reply 'y'/'n' or to continue 'c' or to break 'b'");


        //String rply=scn.nextLine();;

        int j=-1;
        while (j<0) {
            System.out.println("ase");
            System.out.println("There r 8 bytes , do u want to Change?[reply 'y'/'n' or to continue 'c' or to break 'b'");
            Scanner scn=new Scanner(System.in);
            String rply=scn.nextLine();
            if (rply.equals("y")) {
                System.out.println("Put byte no");
                int bte = scn.nextInt();
                System.out.println("Put bit no");
                int bit = scn.nextInt();
                int pos = (bte - 1) * 8 + bit - 1;
                if (s.charAt(pos) == '0') {
                    String su = changeCharInPosition(pos,'1',s);
                    //s = su;
                    System.out.println(su);
                    System.out.println(su.length());


                }
                else {
                    String su = changeCharInPosition(pos,'0',s);
                    //s = su;
                    System.out.println(su);
                    System.out.println(su.length());

                }

            }
            else  break;


        }


        //s+="1111010101010101111";
        System.out.println(s);
        String frame="010101";
        String stuff=frame+s.replaceAll("1111","011110")+frame;
        //System.out.println(stuff);



        }

    }


