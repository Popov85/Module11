package com.goit.g2popov.module11.module09;

import com.goit.g2popov.module11.module10.CipherEngine;

/**
 * Class {@code Client} keeps info about a buyer of the online shop
 * @author  Andrii Popov
 */

public class Client {
        private static final int SHIFT = 3;
        private static final CipherEngine encryptionEngine = new CipherEngine("", SHIFT);;

        private final String name;
        private final String surname;
        private final String address;
        private final String email;

        public Client(String name, String surname, String address, String email) {
                encryptionEngine.setStatement(name);
                this.name = encryptionEngine.cipher();
                encryptionEngine.setStatement(surname);
                this.surname = encryptionEngine.cipher();
                encryptionEngine.setStatement(address);
                this.address = encryptionEngine.cipher();
                encryptionEngine.setStatement(email);
                this.email = encryptionEngine.cipher();
        }

        public String getName() {
                encryptionEngine.setStatement(this.name);
                return encryptionEngine.decipher();
        }


        public String getSurname() {
                encryptionEngine.setStatement(this.surname);
                return encryptionEngine.decipher();
        }

        public String getAddress() {
                encryptionEngine.setStatement(this.address);
                return encryptionEngine.decipher();
        }

        public String getEmail() {
                encryptionEngine.setStatement(this.email);
                return encryptionEngine.decipher();
        }

        @Override
        public String toString() {
                return "Name: ["+this.name+"] " + "Surname: ["+this.surname+"] "
                                + "Address: [" + this.address + "] " + "E-mail: [" + this.email+"]";
        }

        public String decrypt() {
                return "Name: ["+this.getName()+"] " + "Surname: ["+this.getSurname()+"] "
                                + "Address: [" + this.getAddress() + "] " + "E-mail: [" + this.getEmail()+"]";
        }
}
