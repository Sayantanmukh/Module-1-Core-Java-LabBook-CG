package lab3;

import java.io.*;
public class FileDemo  {
	

String fname;
    
    public static void main(String args[])
    {
       String fname ;//= args[0];
       File f = new File("notepad.txt");
       System.out.println("File name :    "+f.getName());
       System.out.println("Parent directory name :    "+f.getParent());
       System.out.println("Absolute path name :    "+f.getAbsolutePath());
       System.out.println("File modified last on :    "+String.valueOf(f.lastModified()));
       System.out.println("File length :    "+f.length());
       System.out.println("File Readable?  :    " + (f.canRead()? "true":"false"));
    }

}
