package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

class SwapAllOddAndEvenBits {

     static boolean checkSetBit(long n, int bit)
    {
        long mask = (1L << bit);  // Note: changed `1l` to `1L` for clarity
        return (n & mask) != 0;
    }

    static long setBit(long n, int bit)
    {
        long mask = (1L << bit);
        return (n | mask);
    }

    // Swap all odd and even bits of a 64-bit number
    public long swapBits(long n) 
    {
        long evenBits = n & 0xAAAAAAAAAAAAAAAAL; // Mask for even bit positions (0xA...)
        long oddBits = n & 0x5555555555555555L;  // Mask for odd bit positions (0x5...)
        
        // Right shift even bits and left shift odd bits
        evenBits >>= 1;
        oddBits <<= 1;

        // Combine the shifted bits to get the final result
        return (evenBits | oddBits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long result = new SwapAllOddAndEvenBits().swapBits(n);
        System.out.println(result);
    }
}
