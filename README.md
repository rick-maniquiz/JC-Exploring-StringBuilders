# JC-Exploring-StringBuilders

## Cadet Name: Rafael Nico T. Maniquiz

-----

## Exercise 1: `append()` - Appending Content

The `append()` method adds content to the end of the `StringBuilder`.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
    }
}
```

**1. Prediction:**


```
Hello, Cadets!
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/1.png"/>


-----

## Exercise 2: `insert()` - Inserting Content at a Position

The `insert()` method adds content at a specific index, shifting existing characters to the right.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is great!");
        sb.insert(8, "really ");
        System.out.println(sb);
    }
}
```

**1. Prediction:**

```
Java is really great!
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/2.png"/>

-----

## Exercise 3: `delete()` - Deleting Content

The `delete()` and `deleteCharAt()` methods remove characters from the `StringBuilder`.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test sentence.");
        // Actually deletes "a test s" instead of "a test"
        sb.delete(8, 16);
        System.out.println("After delete(8, 16): " + sb);
        // Deletes the character at index 4 (the ' ')
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb);
    }
}
```

**1. Prediction:**

```
After delete(8, 16): This is entence.
After deleteCharAt(4): Thisis entence

```

**2. Observation:**


<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/3.png"/>

-----

## Exercise 4: `replace()` - Replacing a Section

The `replace()` method substitutes a portion of the `StringBuilder` with another string.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like programming in Python.");
        sb.replace(24, 30, "Java");
        System.out.println(sb);
    }
}
```

**1. Prediction:**

```
I like programming in PyJava
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/4.png"/>

-----

## Exercise 5: Method Chaining

Because `StringBuilder` methods return a reference to the same object, you can "chain" calls together in a single, fluent statement.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");
        sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(sb);
    }
}
```

**1. Prediction:**

```
Ready, Set, rt...
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/5.png"/>

-----

## Exercise 6: `substring()`, `indexOf()`, and Non-Existing Words

You can query a `StringBuilder` just like a `String`, but remember the key difference: `substring()` on a `StringBuilder` returns a `String`, not another `StringBuilder`.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");

        // Substring returns a String, it does not modify the StringBuilder
        String sub = sb.substring(16, 19);
        System.out.println("Substring: " + sub);

        // indexOf works just like in String
        int indexOfFox = sb.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        // Searching for a word that doesn't exist
        int indexOfCat = sb.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
    }
}
```

**1. Prediction:**

```
Substring: fox
Index of 'fox': 16
Index of 'cat': -1
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/6.png"/>

-----

## Exercise 7: `toString()` - Converting back to a `String`

The `toString()` method is essential for getting the final, immutable `String` object from the `StringBuilder`.

**Code Snippet:**

```java
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Status: ");
        sb.append("Pending");

        // Now, we need a final, unchangeable String
        String finalStatus = sb.toString();

        // Let's try to change the StringBuilder again
        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb);
        System.out.println("Final String: " + finalStatus);
    }
}
```

**1. Prediction:**

```
StringBuilder: Status: Pending - Approved
Final String: Status: Pending
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-StringBuilders/blob/c3f3b55904cc113e418ef965a9ce61494fb4a25d/screenshots/7.png"/>