# Development Environment Setup Guide

This guide lists everything you need to install before your first lesson.

Follow each step **in order**. Each tool builds on the one before it.

---

## Steps

| Step | Tool | Guide | Purpose |
|------|------|-------|---------|
| 1 | Homebrew | [homebrew.md](homebrew.md) | Installs and manages software from the Terminal |
| 2 | Java | [java.md](java.md) | The programming language used in this course |
| 3 | VS Code | [vscode.md](vscode.md) | The code editor you will write programs in |
| 4 | Git | [git.md](git.md) | Saves and tracks changes to your code |

---

## Final Checklist

Go through each item before your first lesson:

- ✅ Terminal opens without errors
- ✅ `brew --version` shows a version number
- ✅ `java --version` shows a version number
- ✅ `javac --version` shows a version number
- ✅ VS Code is installed and opens correctly
- ✅ The **Extension Pack for Java** is installed in VS Code
- ✅ `git --version` shows a version number
- ✅ `git config --global --list` shows your name and email

---

## Troubleshooting

**Homebrew command not found after install**

After installing Homebrew, run the two commands shown at the end of the installer output. They look like:

```bash
echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> ~/.zprofile
eval "$(/opt/homebrew/bin/brew shellenv)"
```

Then close and reopen Terminal.

**`java` or `javac` command not found**

Run the following to link Java to your system path:

```bash
sudo ln -sfn $(brew --prefix openjdk)/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
```

Then close and reopen Terminal, and try `java --version` again.

**VS Code won't open**

Right-click **Visual Studio Code** in the Applications folder, select **Open**, and confirm the security prompt.
