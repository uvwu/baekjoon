import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b7795 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int[] arr1 = new int[n];
      int[] arr2 = new int[m];

      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++)
        arr1[j] = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++)
        arr2[j] = Integer.parseInt(st.nextToken());
      Arrays.sort(arr2);

      int ans = 0;

      for (int j = 0; j < n; j++) {
        for(int k = 0; k < m; k++) {
          if (arr1[j] > arr2[k]) ans++;
          else break;
        }
      }
      System.out.println(ans);
    }
  }
}
