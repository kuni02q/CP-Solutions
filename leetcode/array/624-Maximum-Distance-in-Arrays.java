class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        int answer = 0;

        for (int i = 1; i < arrays.size(); i++) {
            int minRecent = arrays.get(i).get(0);
            int maxRecent = arrays.get(i).get(arrays.get(i).size() - 1);

            answer = Math.max(answer,maxRecent - min);
            answer = Math.max(answer, max - minRecent);

            min = Math.min(min, minRecent);

            max = Math.max(max, maxRecent);

        }

        return answer;
    }
}