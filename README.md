# Student Grades - Simple Java Project

**Aim:** Build a simple console-based Java program that accepts student names and marks, then calculates total, average, and grade.

**Tools:** Java (JDK 8+), any text editor or IDE (IntelliJ, Eclipse, VS Code), Git.

**Description:**  
A lightweight command-line Java application that:
- Reads student name and marks for 3 subjects from user input.
- Calculates total marks and average.
- Assigns grade based on average:
  - 90-100: A
  - 75-89 : B
  - 50-74 : C
  - &lt;50  : F

**Files:**
- `src/Main.java` - main program.
- `README.md` - this file.
- `.gitignore` - common ignores.

**How to build & run (commands):**
1. Open terminal in project root where `src` folder is present.
2. Compile:
```
javac -d out src/Main.java
```
3. Run:
```
java -cp out Main
```

**Notes for submission:**
- This README contains no external links or other people's names.
- If you want to change the grading rules, edit `Main.java`.
