import java.lang.*;
import java.util.*;
import java.io.*;

class Codechef
{
	final static FastReader fr = new FastReader();
	final static PrintWriter out = new PrintWriter(System.out);

    static void solve()
    {
        int n = fr.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = fr.nextInt();

        int []v = new int[n + 1];
        for(int i = 0; i <= n; i++) v[i] = -1;

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int last = v[arr[i]];

            int left = i;
            int right = n - 1 - i;
            int tot = 0;
            if(left + right + 1 >= arr[i]) {
                tot = Math.min(n - arr[i] + 1,Math.min(Math.min(left,right) + 1,arr[i]));
                ans += tot;
            }

            if(last != -1 && i - last < arr[i]) {
                ans -= Math.min(tot,(arr[i] - (i - last)));
            }
            v[arr[i]] = i;
            out.print(ans + " ");
        }
        out.println();
        out.println(ans);
    }
	public static void main(String[] args)
	{
		int t = fr.nextInt();
        while(t-- > 0)
        {
            solve();
        }
        out.close();
	}

	static class FastReader
	{
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}