package com.BlanC;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{

    public static void main(String[] args) throws IOException
    {
	// write your code here
        System.out.print("hi");
        Farmer ft = new Farmer("a","b",123, "afs");
        System.out.println(ft.Name + ft.SurName + ft.RyotCode + ft.Address);

       // Entry();
    }

    public static void Entry() throws IOException {
           /* PrintWriter PW = new PrintWriter("Farmer.csv");
            PW.print("Name "); PW.println("RollNum");
            PW.print("Dhanush "); PW.println(123);
            PW.print("Guru "); PW.println(456);
            PW.print("QWERTY "); PW.println(567);

            PW.close(); */

        File fs = new File("Farmer.csv");
        CsvWriter cw = new CsvWriter(new FileWriter("Farmer.csv",true),',');

        //Writing Headers
        cw.write("Name");
        cw.write("ID");
        cw.endRecord();

        //writing Records


        cw.write("Dhanush");
        cw.write("123");
        cw.endRecord();

        cw.write("Guru");
        cw.write("456");
        cw.endRecord();

        cw.write("Dan");
        cw.write("789");
        cw.endRecord();

        cw.close();

        //Some problem in reading a file, showing FileNotFound exception

            try {
                CsvReader cr = new CsvReader("Farmers.csv");
                System.out.println(cr.get("Name"));
            }
            catch (FileNotFoundException fe)
            {
                fe.printStackTrace();

            }


    }
}
