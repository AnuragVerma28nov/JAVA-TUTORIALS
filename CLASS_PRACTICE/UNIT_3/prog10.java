// Base 64 Encoding and Decoding

package UNIT_3;

import java.util.*;

public class prog10 {
    public static void main(String[] args) {
        String originalInput = "Hello Base 64";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        String decodedString = new String(Base64.getDecoder().decode(encodedString));

        System.out.println("Original: " + originalInput);
        System.out.println("Encoded: " + encodedString);
        System.out.println("Decoded: " + decodedString);
    }
}

// Original: Hello Base 64
// Encoded: SGVsbG8gQmFzZSA2NA==
// Decoded: Hello Base 64