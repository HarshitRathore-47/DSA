1class Solution {
2    public int romanToInt(String s) {
3        int num = 0;
4        int n = s.length();
5
6        for (int i = 0; i < n; i++) {
7            if (s.charAt(i) == 'I') {
8
9                if (i + 1 < n && s.charAt(i + 1) == 'V') {
10                    num += 4;
11                    i++;
12                } else if (i + 1 < n && s.charAt(i + 1) == 'X') {
13                    num += 9;
14                    i++;
15                } else {
16                    num += 1;
17                }
18
19            } else if (s.charAt(i) == 'X') {
20
21                if (i + 1 < n && s.charAt(i + 1) == 'L') {
22                    num += 40;
23                    i++;
24                } else if (i + 1 < n && s.charAt(i + 1) == 'C') {
25                    num += 90;
26                    i++;
27                } else {
28                    num += 10;
29                }
30
31            } else if (s.charAt(i) == 'C') {
32
33                if (i + 1 < n && s.charAt(i + 1) == 'D') {
34                    num += 400;
35                    i++;
36                } else if (i + 1 < n && s.charAt(i + 1) == 'M') {
37                    num += 900;
38                    i++;
39                } else {
40                    num += 100;
41                }
42
43            } else if (s.charAt(i) == 'V') {
44                num += 5;
45            } else if (s.charAt(i) == 'L') {
46                num += 50;
47            } else if (s.charAt(i) == 'D') {
48                num += 500;
49            } else if (s.charAt(i) == 'M') {
50                num += 1000;
51            }
52        }
53        return num;
54    }
55
56}