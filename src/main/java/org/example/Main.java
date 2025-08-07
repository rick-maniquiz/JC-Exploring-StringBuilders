package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Exercise 1 ---");
        {
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(", Cadets!");
            System.out.println(sb);

            System.out.println("-- Additional Instructions --");
            sb.append(" Welcome to ")
                    .append(2025)
                    .append('.');
            System.out.println(sb);
        }

        System.out.println("\n--- Exercise 2 ---");
        {
            StringBuilder sb = new StringBuilder("Java is great!");
            sb.insert(8, "really ");
            System.out.println(sb);
        }

        System.out.println("\n--- Exercise 3 ---");
        {
            StringBuilder sb = new StringBuilder("This is a test sentence.");
            // Actually deletes "a test s" instead of "a test"
            sb.delete(8, 16);
            System.out.println("After delete(8, 16): " + sb);

            sb.deleteCharAt(4);
            System.out.println("After deleteCharAt(4): " + sb);
        }

        System.out.println("\n--- Exercise 4 ---");
        {
            StringBuilder sb = new StringBuilder("I like programming in Python.");
            sb.replace(24, 300, "Java");
            System.out.println(sb);
        }

        System.out.println("\n--- Exercise 5 ---");
        {
            StringBuilder sb = new StringBuilder("Start");
            sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
            System.out.println(sb);
        }

        System.out.println("\n--- Exercise 6 ---");
        {
            StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");

            String sub = sb.substring(16, 19);
            System.out.println("Substring: " + sub);

            int indexOfFox = sb.indexOf("fox");
            System.out.println("Index of 'fox': " + indexOfFox);

            int indexOfCat = sb.indexOf("cat");
            System.out.println("Index of 'cat': " + indexOfCat);
        }

        System.out.println("\n--- Exercise 7 ---");
        {
            StringBuilder sb = new StringBuilder("Status: ");
            sb.append("Pending");

            String finalStatus = sb.toString();

            sb.append(" - Approved");

            System.out.println("StringBuilder: " + sb);
            System.out.println("Final String: " + finalStatus);
        }
    }
}