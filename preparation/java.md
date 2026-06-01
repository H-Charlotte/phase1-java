# Installing Java on macOS

## What is Java?

Java is the programming language we will use in this course.

Now that Homebrew is installed, we can use it to install Java.

---

## Step 1: Open Terminal

1. Press **Command + Space**
2. Type:

   ```
   Terminal
   ```

3. Press **Enter**

---

## Step 2: Install Java

Type the following command:

```bash
brew install openjdk
```

Press **Enter**.

Homebrew will download and install Java automatically.

This may take a few minutes.

---

## Step 3: Check the Java Version

Type:

```bash
java --version
```

Press **Enter**.

You should see something similar to:

```text
openjdk 21
```

The version number may be different.

---

## Step 4: Check the Java Compiler

Type:

```bash
javac --version
```

Press **Enter**.

You should see something similar to:

```text
javac 21
```

The version number may be different.

---

## What Are These Commands?

| Command | Purpose |
|----------|----------|
| `java --version` | Shows the Java version |
| `javac --version` | Shows the Java compiler version |

`java` runs Java programs.

`javac` converts Java source code into a format that the computer can run.

---

## Checkpoint

By the end of this lesson, you should be able to:

- ✅ Install Java using Homebrew
- ✅ Check the Java version
- ✅ Check the Java compiler version
- ✅ Understand the difference between `java` and `javac`

You are now ready to write your first Java program.