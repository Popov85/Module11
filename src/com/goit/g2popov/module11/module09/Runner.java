package com.goit.g2popov.module11.module09;

import com.goit.g2popov.module11.module10.CipherEngine;
import com.goit.g2popov.module11.module10.Encodable;

/**
 * Class {@code Runner} Module 09
 * Task. Encrypt/decrypt objects from module03 by means of Caesar algorithm
 **/
public class Runner {
        public static void main(String[] args) {

                final String STATEMENT = "The quick brown fox jumps over the lazy dog";
                Encodable engine = new CipherEngine(STATEMENT,5);
                System.out.println(engine.cipher().toString());

                /*List<Client> clients = new ArrayList<Client>();
                try {
                        Client client = new Client("Mr Jack", "Simpson", "Canada, Toronto, Portland ave., 15/96", "jacky.simpson90@gmail.com");
                        clients.add(client);
                        System.out.println("Encrypted personal info: ");
                        System.out.println(client.toString());
                        System.out.println("Decrypted personal info: ");
                        System.out.println(client.decrypt());
                        Client client2 = new Client("Mrs Amanda", "Stivenson", "USA, New York, Embankment ave., 21/75", "amanda.stivensom95@gmail.com");
                        clients.add(client2);
                        System.out.println("Clents are: "+Arrays.toString(clients.toArray()));
                } catch (IllegalArgumentException e) {
                        System.out.println("Failed to create a CipherEngine object. Shift is out of the range!");
                }*/
        }
}
