public class lab2 {
    public static void main(String[] args) {
        int levels = 6; // Задайте кількість рівнів ялинки тут
        
        printTree(levels);
    }
    
    public static void printTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            // Виводимо пробіли для вирівнювання
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            
            // Виводимо '*' для поточного рівня (спереду)
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            
            // Виводимо '*' для поточного рівня (ззаду)
            for (int k = i - 1; k > 0; k--) {
                System.out.print("*");
            }
            
            // Перехід на новий рівень
            System.out.println();
        }
    }
}
