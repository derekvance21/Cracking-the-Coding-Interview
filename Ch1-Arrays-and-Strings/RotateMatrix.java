public class RotateMatrix {
    
    public static int[][] rotateMatrix(int[][] image) {
        for (int i = 0; i < image.length(); i++) {
            for (int j = 0; j < image[0].length() && j < i; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr);
        System.out.println(rotateMatrix(arr));
    }
}
