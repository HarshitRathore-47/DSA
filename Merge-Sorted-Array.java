1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m-1;
4        int j = n-1;
5        int k = m + n-1;
6
7        if (m == 0 && n > 0) {
8            for(int p=0;p<n;p++)
9            nums1[p] = nums2[p];
10        }
11
12        if(m==0 && n==0);
13
14        if (m > 0 && n > 0) {
15            while (j >= 0) {
16                if (i < 0) {
17                    nums1[k] = nums2[j];
18                    j--;
19                    k--;
20                } else if (nums1[i] < nums2[j]) {
21                    nums1[k] = nums2[j];
22                    j--;
23                    k--;
24                } else {
25                    nums1[k] = nums1[i];
26                    i--;
27                    k--;
28                }
29
30            }
31
32        }
33
34    }
35}