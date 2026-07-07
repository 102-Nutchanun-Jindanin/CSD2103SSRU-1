public class Findzero {
    public static int findZeroIndex(int[] a1, int[] a2) {
        int low = 0;
        int high = a2.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;


            if (a2[mid] == 0) {
                return mid;
            }

            if (mid < a1.length && a1[mid] == a2[mid]) {
                low = mid + 1;
            } else {

                high = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
        int[] a2 = {1, 3, 0, 4, 6, 7, 8, 9, 20};

        int result = findZeroIndex(a1, a2);
        System.out.println("ตำแหน่งของ 0 ใน a2 คือ index ที่ : " + result); 
   
    }
}