package com.company.stream;

import java.io.*;


public class DocNum {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Doc.txt"));
            BufferedWriter writerDoc = new BufferedWriter(new FileWriter("LogDoc.txt"));
            BufferedWriter writerEx = new BufferedWriter(new FileWriter("LogEx.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (isChecked(line)) {
                    writerDoc.write(line + "\n");
                    writerDoc.flush();

                } else {
                    writerEx.write(line + " - " +reason(line)+ "\n");
                    writerEx.flush();
                }
                line = reader.readLine();
            }
            reader.close();
            writerDoc.close();
            writerEx.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static boolean isChecked(String docNum) {
        return (docNum.startsWith("docnum") || docNum.startsWith("contract")) && docNum.matches("[A-Za-z0-9]{15}");
    }

    static String reason(String docNum) {
        boolean is = true;
        String str = "";
        String regEx = "\\w+";
                while (is) {
            if (!docNum.startsWith("docnum") && !docNum.startsWith("contract")) {
                str = str.concat("номер документа не начинается с docnum или contract/ ");
            }
            if (!docNum.matches(regEx)) {
                str = str.concat("содержит не допустимый символ/ ");
            }
            if (docNum.length() != 15) {
                str = str.concat("длина номера документа не равна 15 символам/ ");
            }
            is = false;

        }
        return str;
    }

}
