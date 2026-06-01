# Installing Git on macOS

## What is Git?

Git is a tool that helps programmers track changes in their code.

It is used by millions of developers around the world.

---

## Step 1: Open Terminal

1. Press **Command + Space**
2. Type:

   ```
   Terminal
   ```

3. Press **Enter**

---

## Step 2: Install Git

Type:

```bash
brew install git
```

Press **Enter**.

Homebrew will download and install Git.

---

## Step 3: Check the Installation

Type:

```bash
git --version
```

Press **Enter**.

You should see something similar to:

```text
git version 2.51.0
```

The version number may be different.

---

## Step 4: Tell Git Your Name

Replace `Your Name` with your own name:

```bash
git config --global user.name "Your Name"
```

Example:

```bash
git config --global user.name "Alice"
```

---

## Step 5: Tell Git Your Email

Replace the email with your own email address:

```bash
git config --global user.email "you@example.com"
```

Example:

```bash
git config --global user.email "alice@example.com"
```

---

## Step 6: Check Your Settings

Type:

```bash
git config --list
```

Press **Enter**.

You should see your name and email.

---

## Checkpoint

By the end of this lesson, you should be able to:

- ✅ Install Git
- ✅ Check the Git version
- ✅ Set your name
- ✅ Set your email
- ✅ View your Git settings

You are now ready to use Git to track your code changes.