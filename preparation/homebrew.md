# Installing Homebrew on macOS

## What is Homebrew?

Homebrew is a tool that helps us install software using simple commands.

We will use Homebrew to install Java and other development tools.

---

## Step 1: Open Terminal

1. Press **Command + Space**
2. Type:

   ```
   Terminal
   ```

3. Press **Enter**

A Terminal window will open.

---

## Step 2: Install Homebrew

Copy and run the following command:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

Press **Enter**.

You may be asked to enter your Mac password.

The installation may take several minutes.

---

## Step 3: Verify the Installation

Type:

```bash
brew --version
```

Press **Enter**.

You should see something similar to:

```text
Homebrew 4.x.x
```

---

## Step 4: Try Your First Homebrew Command

Type:

```bash
brew list
```

Press **Enter**.

This command shows the software installed by Homebrew.

---

## Checkpoint

By the end of this lesson, you should be able to:

- ✅ Open Terminal
- ✅ Install Homebrew
- ✅ Run commands in Terminal
- ✅ Check the Homebrew version

You are now ready to install Java using Homebrew.