package Leetcode97;

public class Solutions {

        public boolean isInterleave(String s1, String s2, String s3) {
             int n = s1.length(),m = s2.length(),t = s3.length();
            if(n+m!=t) return false;
           boolean [][]f = new boolean[n+1][m+1];
           // 动态规划表示s1的n个字符和s2的m个字符能否匹配
            f[0][0] = true;
            for(int i = 0;i<=n;++i)
            {
                for(int j = 0;j<=m;++j)
                {
                    int p = i+j-1;
                    if(i>0)
                    {
                        f[i][j] = f[i][j]||(f[i-1][j]&&s1.charAt(i-1)==s3.charAt(p));
                    }
                    if(j>0)
                    {
                        f[i][j] = f[i][j]||(f[i][j-1]&&s2.charAt(j-1)==s3.charAt(p));
                    }
                    // 这里或是为了避免覆盖掉为真的结果
                }
            }
            return f[n][m];
        }

    }

