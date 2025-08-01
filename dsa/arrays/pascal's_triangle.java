class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansf = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ansf.add(gen(i));  // generate i-th row
        }
        return ansf;
    }

    public static List<Integer> gen(int rowIndex) {
        List<Integer> ansrow = new ArrayList<>();
        long ans = 1;
        ansrow.add(1);  

        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1) / i;
            ansrow.add((int) ans);
        }

        return ansrow;
    }
}