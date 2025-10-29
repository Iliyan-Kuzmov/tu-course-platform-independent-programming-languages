public class TaskDistributor {

    /**
     * Намира минималната възможна разлика между сумите на двете групи задачи.
     * Проблемът се решава чрез Динамично Оптимизиране (Subset Sum Problem),
     * като се търси най-голямата постижима сума S1 <= TotalSum / 2.
     *
     * @param tasks Масив от времена за изпълнение на задачите.
     * @return Минималната разлика |S2 - S1|.
     */
    public static int minDifference(int[] tasks) {
        if (tasks == null || tasks.length == 0) {
            return 0; // Ако няма задачи, разликата е 0.
        }

        // 1. Изчисляване на общата сума на времената.
        int totalSum = 0;
        for (int time : tasks) {
            totalSum += time;
        }

        // 2. Целева сума (таргет): S/2. Търсим най-голямата постижима сума S1 <= target.
        int target = totalSum / 2;

        // 3. DP масив: dp[j] е true, ако сума j може да бъде постигната от подмножество.
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Сума 0 винаги е постижима.

        // 4. Попълване на DP масива.
        for (int taskTime : tasks) {
            // Итерираме от target надолу.
            for (int j = target; j >= taskTime; j--) {
                // Ако j - taskTime е постижима, то и j е постижима с добавянето на текущата задача.
                dp[j] = dp[j] || dp[j - taskTime];
            }
        }

        // 5. Намиране на най-голямата постижима сума S1.
        int team1Sum = 0;
        // Търсим от target надолу: първото true е най-голямата възможна S1.
        for (int j = target; j >= 0; j--) {
            if (dp[j]) {
                team1Sum = j;
                break;
            }
        }

        // 6. Изчисляване на минималната разлика.
        // Разлика = |TotalSum - 2 * S1|
        int minDiff = totalSum - 2 * team1Sum;

        return minDiff;
    }
}