package sample;

import java.io.*;

/**
 * Created by Asus on 9/29/2017.
 */
public class fileStore {



    String sender;
    String fName;
    String cName;
    Integer receive;

    long fileSize;
    byte[] store;

    FileOutputStream fos;
    BufferedOutputStream bos;

    public String hCode()
    {
        return fName+cName+sender;
    }


    public fileStore(String i,int j,String k,String l)
    {
        this.sender=l;
        this.fName=i;
        this.fileSize=j;
        this.cName=k;
        store = new byte[0];
    }
    void makebyte(byte[] b) {
        byte[] result = new byte[store.length + b.length];
        System.arraycopy(store, 0, result, 0, store.length);
        System.arraycopy(b, 0, result, store.length, b.length);
        store=result;
        //return result;
    }

    public void flush() throws IOException {
        int i=10;
        File fn=new File("F:\\J\\test\\src\\"+fName+i);
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(fn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(store,0,receive);
        bos.flush();

        bos.close();
        fos.close();
        i++;
    }


}
