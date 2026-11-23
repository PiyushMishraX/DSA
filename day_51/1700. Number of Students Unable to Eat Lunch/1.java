class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] preferenceCount = new int[2];

        for (int preference : students) {
            preferenceCount[preference]++;
        }

        for (int topSandwich : sandwiches) {
            if (preferenceCount[topSandwich] == 0) {
                break;
            }
            preferenceCount[topSandwich]--;
        }

        return preferenceCount[0] + preferenceCount[1];
    }
}