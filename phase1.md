# Phase 1: Fundamentals + Java

## Goals

Students will:

- Understand computers, software, AI, and modern development workflows
- Learn beginner Java programming
- Build debugging skills
- Learn how developers work with AI tools
- Build engineering-oriented thinking

The first class includes full software installation and environment setup.

---

## Lesson 1: Development Environment and the Programming World

### Part 1

#### Topics

1. Self Introduction
   - Instructor background
   - Engineering and software development experience
   - Course expectations

2. Introduction to Computer Science
   - What computer science is
   - What software engineers do
   - Relationship between software and robotics

3. AI and Its Impact
   - How AI is changing software development
   - Why engineering fundamentals still matter
   - Human roles in AI-assisted development

4. Introduction to Programming Languages
   - What programming languages are
   - Why different languages exist
   - Java vs Python overview
   - Why FTC/FRC commonly uses Java
   - Why AI development commonly uses Python

5. Development Environment Setup
   - VS Code installation
   - Java JDK installation
   - Java runtime configuration
   - Java extensions
   - Git installation
   - GitHub account setup
   - Terminal basics
   - Files and folders

### Important Notes

Do not assume students already know:

- How to install software
- How to unzip files
- How to configure PATH variables
- How to use terminals
- How files and folders work
- How GitHub works

### Recommendations

Instructor should demonstrate everything live.

Prepare in advance:

- Installation packages
- Setup instructions
- Troubleshooting checklist
- GitHub signup guide

### Goal

Students should:

- Successfully configure their development environment
- Understand the overall direction of the course
- Understand how software, robotics, and AI connect together
- Feel comfortable exploring software development

### Part 2

#### Topics

1. First Java Program
   - Hello World
   - Running a Java program

2. Modify and Run
   - Edit source code
   - Re-run program
   - Observe changes

3. Project Folder Concepts
   - Files and folders
   - Source files
   - Working directory
   - Local vs cloud

4. Introduction to Versioning
   - Why version control exists
   - Save vs commit
   - Project history
   - Recovering old versions

5. Introduction to Git and GitHub
   - What Git is
   - What GitHub is
   - Repository concepts
   - Local repository vs remote repository

6. Basic Git Workflow
   - Modify
   - Run
   - Commit
   - History
   - Diff

7. Push and Pull
   - Upload changes
   - Download changes
   - Basic collaboration concepts

#### In-Class Practice

- Modify Hello World
- Fix intentional errors
- Run programs independently
- Create first GitHub repository
- Commit code changes
- Create multiple commits
- View commit history
- Compare file differences
- Checkout previous commit
- Switch back to HEAD
- Push code to GitHub

#### Pre-class Preparation

- Bring laptop and charger
- Create GitHub account if possible before class
- Install VS Code if possible before class
- Install Git if possible before class
- Install Java JDK if possible before class

#### Post-class Assignment

- Reinstall development environment independently
- Create and run a second Java program
- Create a GitHub repository and upload code
- Customize Hello World with personal interests
- Create at least 3 commits with meaningful commit messages
- Take a screenshot of commit history and explain what changed

---

## Lesson 2: Java Primitive Concepts

### Goals

Students revisit the small Java program created in Lesson 1 and deeply understand every concept involved.

The focus is not writing more code.

The focus is building correct mental models of how Java programs work.

### Part 1

#### Topics

- Revisiting the first Java program
- Program execution flow
- What a class is
- What an object is
- Variables
- Primitive types
  - int
  - double
  - boolean
  - String
- String concatenation
- Basic output formatting
- Methods
- Method calls
- Parameters and return values

### Demonstrations

- Following execution line by line
- Calling methods
- Modifying variables
- Printing variable values
- Reading and explaining existing code
- Predicting program output
- Understanding String concatenation and formatting

### Part 2

#### Topics

- References
- Objects in memory
- null concept
- Mutable state
- Arrays
- Basic data organization
- Compilation vs execution revisited
- Program structure revisited

### Demonstrations

- Multiple variables pointing to the same object
- Modifying arrays
- NullPointerException examples
- Tracing execution flow

#### Pre-class Preparation

- Review Lesson 1 Java program
- Practice running and modifying code

#### Post-class Assignment

- Modify the original Java program
- Add at least one method with parameters
- Create and modify an array
- Explain class vs object in simple language
- Create a small "Robot Status" program using variables and arrays
- Draw a simple memory/reference diagram by hand or digitally

---

## Lesson 3: Condition and Loop

### Goals

Students learn how programs make decisions and repeat actions.

Students also begin understanding how robot logic is built from conditions and loops.

### Part 1

#### Topics

- if
- else
- else if
- Comparison operators
- Logical operators
- Boolean thinking
- while loops
- for loops
- Basic console input using Scanner

### Demonstrations

- Robot decision logic
- Repeating movement behavior
- Input validation examples
- Interactive console programs
- Reading user input from terminal

### Part 2

#### Topics

- Nested conditions
- Nested loops
- Loop debugging
- Infinite loops
- Problem decomposition
- Robot state logic

### Exercises

- Robot obstacle logic
- Repeating movement patterns
- Menu systems
- Interactive text programs

#### Pre-class Preparation

- Review Lesson 2 concepts

#### Post-class Assignment

- Build a simple interactive text program using Scanner
- Create at least one nested loop example
- Simulate a traffic light system
- Create a text-based robot patrol behavior
- Add one intentional logic bug and ask a classmate to find it
- Read an existing example program and explain execution flow

---

## Lesson 4: Exception and Error Handling

### Goals

Students learn that software errors are normal and learn how to understand and handle failures.

### Part 1

#### Topics

- Syntax errors
- Runtime errors
- Logic errors
- Exceptions
- Reading stack traces
- Line numbers
- Common Java exceptions

### Demonstrations

- NullPointerException
- ArrayIndexOutOfBoundsException
- Division by zero

### Part 2

#### Topics

- try/catch
- Error handling mindset
- Defensive programming
- Understanding failure states
- Exception debugging workflow

### Exercises

- Intentionally broken programs
- Fixing runtime problems
- Reading stack traces

#### Pre-class Preparation

- Review previous Java programs

#### Post-class Assignment

- Create one intentionally broken program
- Fix and explain the issue
- Document one runtime exception
- Create an "Error Museum" with 3 different Java exceptions
- Explain which error was hardest to understand and why

---

## Lesson 5: Debugging

### Goals

Students learn systematic debugging skills and become comfortable analyzing software behavior.

### Part 1

#### Topics

- Print debugging
- Logging concepts
- Why logs are important
- Reading logs
- Breakpoints
- Step over
- Step into
- Variable inspection
- Call stack

### Demonstrations

- Tracing execution flow
- Watching variable changes
- Following method calls
- Comparing logs vs debugger behavior

### Part 2

#### Topics

- Debugging workflow
- Breaking large problems into smaller problems
- Reading logs
- Writing useful logs
- Debugging with logs vs breakpoints
- Reading unfamiliar code
- Multi-file project structure
- Understanding src and project folders
- Terminal-based debugging
- Debugging robot logic
- AI-assisted debugging
- Verification mindset

### Exercises

- Diagnose intentionally broken projects
- Debug robot behavior simulations
- Compare expected vs actual behavior

#### Pre-class Preparation

- Review exceptions and stack traces

#### Post-class Assignment

- Debug a provided broken program
- Write a short debugging report
- Add logging statements to trace program behavior
- Record a short screen capture or screenshots showing the debugging process
- Explain the root cause of one bug in simple language
