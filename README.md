# TermFreqGolf - Code Golf Style

## Overview
`TermFreqGolf.java` is a compact, minimalist Java program written in a **Code Golf** style. The main goal of this implementation is **brevity**—expressing functionality in as few lines of code as possible while still producing correct output.

This version:
- Loads stop words in a single chained expression.
- Extracts and filters words from the input file using regex.
- Computes word frequencies using Java Streams.
- Outputs the top 25 most frequent non-stop words—all within the `main` method.

The entire logic is condensed using Java’s core APIs (e.g., `Files`, `Pattern`, `Stream`, `Collectors`), avoiding extra methods or verbosity.

## Design Constraints
- **Single-method implementation** (everything in `main`).
- Heavy use of **Streams** and **lambda expressions**.
- No intermediate variable declarations unless essential.
- Prioritizes **expression chaining** and **API efficiency** over clarity.
- Suitable for demonstrating concise, one-shot logic, **not** maintainability.

## Project Folder Structure
Place the following files in the same folder:

- `Seven.java`
- `stop_words.txt` — Comma-separated stop word list (e.g., `a,an,the,and,...`)
- `pride-and-prejudice.txt` — Input text file for analysis

## How to Compile and Run

1. Open Terminal or Command Prompt

2. Navigate to the folder:
   cd path\to\your\folder

3. Compile the Java program:
   javac Seven.java

4. Run the program:
   java Seven pride-and-prejudice.txt

## Expected Output
---------------
Top 25 most frequent non-stop words in the input file, printed in descending order:

Example:
mr - 786
elizabeth - 635
very - 488
darcy - 418
such - 395
mrs - 343
much - 329
