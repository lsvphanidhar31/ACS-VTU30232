class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int f : freq) {
            if (f > 0)
                pq.add(f);
        }

        int time = 0;

        while (!pq.isEmpty()) {
            int cycle = n + 1;
            int count = 0;
            int[] temp = new int[26];

            while (cycle > 0 && !pq.isEmpty()) {
                int f = pq.poll();

                if (f > 1)
                    temp[count++] = f - 1;

                cycle--;
                time++;
            }

            for (int i = 0; i < count; i++) {
                pq.add(temp[i]);
            }

            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}
