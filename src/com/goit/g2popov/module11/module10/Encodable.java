package com.goit.g2popov.module11.module10;

/**
 * Interface {@code Encodable} specifies a service for text coding
 * This service is able to code/decode a phrase using Caesar algorithm
 * @author  Andrii Popov
 */

public interface Encodable {

        char[] ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int MAX_INDEX = ALPHABET_LOWER.length;
        int MIN_SHIFT = 3;

        /**
         * Returns the coded string by the mean of Caesar algorithm
         * @return
         */
        String cipher();

        /**
         * Returns the decoded string that was coded by the mean of Caesar algorithm
         * @return
         */
        String decipher();
}
