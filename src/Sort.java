import java.util.ArrayList;

class Sort {
    public static void merge(ArrayList<Item> vector, int start, int end) {
        if (start >= end)
            return;
        int middle = (start + end) / 2;
        Sort.merge(vector, start, middle);
        Sort.merge(vector, middle + 1, end);
        Sort.combine(vector, start, middle, end);
    }

    private static void combine(ArrayList<Item> vector, int start, int middle, int end) {
        Item[] temp = new Item[vector.size()];
        for (int index = 0; index <= end; index++)
            temp[index] = vector.get(index);
        int leftSubArrayIndex = start;
        int rightSubArrayIndex = middle + 1;
        for (int index = start; index <= end; index++) {
            if (leftSubArrayIndex > middle) {
                vector.set(index, temp[rightSubArrayIndex++]);
                continue;
            }
            if (rightSubArrayIndex > end) {
                vector.set(index, temp[leftSubArrayIndex++]);
                continue;
            }
            if (temp[leftSubArrayIndex].getWineServings() < temp[rightSubArrayIndex].getWineServings())
                vector.set(index, temp[leftSubArrayIndex++]);
            else
                vector.set(index, temp[rightSubArrayIndex++]);
        }
    }
}