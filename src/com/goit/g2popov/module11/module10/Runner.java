package com.goit.g2popov.module11.module10;

/**
 * Class {@code Runner} Module 10
 * Task. Encrypt/decrypt text files
 *  Writes into a file line by line
 *  You enter lines from keyboard line by line
 **/
public class Runner {

        private static final String PATH_WAY = "C:\\ActualFile.txt";

        public static void main(String[] args) {
                FileCipher fileCipher = new FileCipher(PATH_WAY);
                fileCipher.writeByLineCoded();
                fileCipher.readByLineDecoded();
        }
}
