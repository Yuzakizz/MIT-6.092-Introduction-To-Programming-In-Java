class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        System.out.println("The best runner is " + names[findBestRunner(times)] + ": " + times[findBestRunner(times)]);
        System.out.println("The second best runner is " + names[findSecondBestRunner(times)] + ": " + times[findSecondBestRunner(times)]);
    }

    public static int findBestRunner(int[] arr) {
        int bestRunnerIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[bestRunnerIndex]) {
                bestRunnerIndex = i;
            }
        }
        return bestRunnerIndex;
    }

    public static int findSecondBestRunner(int[] arr) {
        int secondBestRunnerIndex = -1;
        int bestRunnerIndex = findBestRunner(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == bestRunnerIndex) {
                continue;
            }
            if (secondBestRunnerIndex == -1 || arr[i] < arr[secondBestRunnerIndex]) {
                secondBestRunnerIndex = i;
            }
        }
        return secondBestRunnerIndex;
    }
} 
