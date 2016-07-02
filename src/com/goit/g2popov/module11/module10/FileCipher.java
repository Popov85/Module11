package com.goit.g2popov.module11.module10;

import java.io.*;
import java.util.Scanner;

/**
 * Class {@code FileCipher} codes/decodes a file by means of Caesar algorithm
 * Class is able to create encrypted files and decrypt the content
 * Limitations of the encryption algorithm:
 * It works only with English alphabet
 * Shift range lies within [3-25]
 * @author  Andrii Popov
 */

public class FileCipher {

        private static final int SHIFT = 3;
        private static final CipherEngine encryptionEngine = new CipherEngine("",SHIFT);

        private String pathway;

        public FileCipher (String pathway) {
                this.pathway = pathway;
        }

        /**
         * Writes into a file line by line
         * User enters every line which then is coded by Caesar algorithms
         * and is written into a file
         */
        public void writeByLineCoded() {
                PrintWriter writer = null;
                try {
                        writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.pathway)));
                        Scanner scanner = new Scanner(System.in);
                        String nextLine;
                        do {
                                System.out.println("Enter a line: ");
                                nextLine = scanner.nextLine();
                                if (!nextLine.equals("enough")) {
                                        writer.print(encodeLine(nextLine));
                                        writer.println();
                                }
                        } while (!nextLine.equals("enough"));
                } catch (FileNotFoundException e) {
                        System.out.println("Failed to create a file according to the pathway given!");
                } finally {
                        if (writer != null) {
                                writer.flush();
                                writer.close();
                        }

                }
        }

        private String encodeLine(String line) {
                encryptionEngine.setStatement(line);
                return encryptionEngine.cipher();
        }

        /**
         * Reads a file line by line with decoding
         */
        public void readByLineDecoded() {
                Scanner scanner = null;
                try {
                        scanner = new Scanner(new BufferedReader(new FileReader(this.pathway)));
                        while (scanner.hasNextLine()) {
                                System.out.println(decodeLine(scanner.nextLine()));
                        }
                } catch (FileNotFoundException e) {
                        System.out.println("Failed to open a file according to the pathway given!");
                } finally {
                        if (scanner != null) scanner.close();
                }
        }

        private String decodeLine(String line) {
                encryptionEngine.setStatement(line);
                return encryptionEngine.decipher();
        }
}
