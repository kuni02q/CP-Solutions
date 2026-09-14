class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int[] answer = new int[friends.length];

        int n = 0;
        for (int i = 0; i < order.length; i++) {

            for (int j = 0; j < friends.length; j++) {

                if (order[i] == friends[j]) {
                    answer[n] = order[i];
                    n++;
                }
            }

        }

        return answer;

    }
}