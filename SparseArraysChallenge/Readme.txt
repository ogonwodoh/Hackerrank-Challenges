***I optimized the scope of this code but allowing the value of N and Q to be as large as possible and the value of the String can be as large as possible. This problem could also be optimized with a Balanced Binary Tree which would make queries much faster. See the challenge description below. ***


There are N  strings. Each string's length is no more than  characters. There are also Q  queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains N , the number of strings.
The next N lines each contain a string.
The N+2nd line contains Q , the number of queries.
The following  lines each contain a query string.

Constraints
1<=N<=1000
1<=Q<=1000
 1<=length of any String <=20
Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output
2
1
0
Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
