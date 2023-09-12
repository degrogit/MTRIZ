public class lab22 {
    public static void main(String[] args) {
        int rows = 3; // Кількість рядків
        int cols = 3; // Кількість стовпців
        int initialValue = 1; // Початкове значення
        
        int[][] array = generateArray(rows, cols, initialValue);
        printArray(array);
    }
    
    public static int[][] generateArray(int rows, int cols, int initialValue) {
        int[][] result = new int[rows][cols];
        int value = initialValue;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = value;
                value += 3; // Збільшуємо значення на 3 для наступного елемента
            }
        }
        
        return result;
    }
    
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}