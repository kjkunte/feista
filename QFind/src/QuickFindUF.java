public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        N = 10;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        p = 2;
        q = 3;
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {

            if (id[i] == pid) {
                System.out.println("TRUE");
                id[i] = qid;
            }

        }
    }
}