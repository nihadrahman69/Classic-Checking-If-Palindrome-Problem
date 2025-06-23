# 🔁 Palindrome Number Checker in Java

This repository contains two Java solutions for checking whether a given integer is a **palindrome** — meaning it reads the same forward and backward.

## 📌 Problem Description

Given an integer `num`, determine whether it is a **palindromic number**.

> A number is a palindrome if it remains the same when its digits are reversed.  
> Negative numbers and numbers ending in 0 (except 0 itself) are **not** considered palindromes.

---

## 📁 Files

| File Name     | Description                                        | Time Complexity |
|---------------|----------------------------------------------------|------------------|
| `pal.java`    | ✅ Optimized solution using half-reversal logic     | O(log n)         |
| `palbf.java`  | 🐢 Brute-force solution with full digit reversal    | O(log n)         |

---

## 💡 Approach Summary

### ✅ `pal.java` (Optimized)
- Reverses only **half** of the number.
- Compares the first half with the reversed second half.
- Handles both even and odd digit lengths efficiently.
- Includes early checks for negative numbers and invalid cases.
- **O(log₁₀ n)** time, **O(1)** space — optimal.

### 🐢 `palbf.java` (Brute Force)
- Reverses the **entire number** digit by digit.
- Compares the result with the original.
- Straightforward but doesn’t account for potential overflow in very large numbers.
- Good for understanding the basic logic.

---

🎯 Educational Value

    Understand how integer digit reversal works

    Practice mathematical logic and flow control in Java

    Learn performance trade-offs between brute-force and optimized approaches

📜 License

This project is licensed under the MIT License.
🙌 Contribute

Suggestions, improvements, and extensions are welcome!
Ideas:

    Extend to check string palindromes

    Add input via scanner or from the command line

    Write unit tests or handle large inputs gracefully

Happy coding! ✨


---

Let me know if:
- You want to add `Scanner` support for dynamic input
- You want a template for unit testing or CLI arguments
- You’d like a `LICENSE` or `.gitignore` file for completeness

## ▶️ How to Run

Make sure Java is installed (`java -version`), then:

```bash
javac pal.java
java pal

🧠 Sample Input
int num = 12321;
// Output: Number is palindrome

int num = -121;
// Output: Number is not a palindrome



