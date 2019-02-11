package kosta.Mission_Dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Dos implements Serializable {

    FileInputStream ips = null;
    FileOutputStream ops = null;
    Scanner sc = new Scanner(System.in);

    // lsReadAll()
    public void readAll(File source) throws Exception {
        
        File[] fileList = source.listFiles();
        
        System.out.println("**************************");
        for (int i = 0; i < fileList.length; i++) {
            File sourceFile = fileList[i];
            if (sourceFile.isDirectory()) {
//                System.out.println(fileList[i]);
                System.out.println(fileList[i].getName());
//                System.out.println(source);
//                System.out.println(sourceFile);
//                System.out.println(sourceFile.getName());
                File s_File = new File(source, fileList[i].getName());
                
            }else {
                readFile(source);
                System.out.println("**************************");
                break;
            }
//                System.out.println("else=> " + sourceFile);
//                System.out.println("else=> " + sourceFile.getName());
        }
    }

    // readDirecToryFile()
    public void readDirecToryFile(File source) throws Exception {
        File[] fileList = source.listFiles();
        String str = "";

        for (int i = 0; i < fileList.length; i++) {
            File sourceFile = fileList[i];

            if (fileList[i].isDirectory()) {
                File s_File = new File(source, sourceFile.getName());
                System.out.println();
//                System.out.println(source.getName());
//                System.out.println(sourceFile.getName());
//                System.out.println(fileList[i].getName());
//                System.out.println(fileList[i+1].getName());
                System.out.println(fileList[i].getName().trim());
                
                
                
//                for(int j=0; j<fileList.length; j++){
//                	System.out.println(fileList[j]);
//                	System.out.println(fileList[j].getName());
//                }
//                System.out.println(fileList[i+1]);

                str = sc.nextLine();
                if (fileList[i].getName().equals(str)) {
                    readFile(s_File);
                }
            }
        }
        
    }
    
    
    // readFile
    public void readFile(File source) throws Exception {
        
        File[] fileList = source.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            File sourceFile = fileList[i];
            if (sourceFile.isFile()) {
                System.out.println(sourceFile.getName());
            }
        }
    }
    

    // cd 지정 디렉터리 들어가기

    // ---------------------
}
