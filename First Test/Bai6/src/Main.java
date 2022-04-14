public class Main {
    static int[] nums1 = {4, 5, 6, 0, 0, 0};
    static int m       = 3;

    static int[] nums2 = {1, 2, 3};
    static int n       = 3;

    public static void main(String[] args) {

        merge(nums1, m, nums2, n);

        System.out.println("Phan tu o giua = " + getMiddleElement(nums1));
    }

    // Tạo ra vị trí trống để ghép mảng
    public void appendArray(int[] nums2)
    {
        for(int i = 0; i < nums2.length; i++)
        {
            nums1[nums1.length] = 0;
        }
    }



    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            insert(i, nums1, m);
            ++m;
        }
    }

    private static void insert(int i, int[] nums1, int m) {
        boolean isMax = true;
        for(int j = 0; j < m; j++)
        {
            if(i < nums1[j])
            {
                isMax = false;
                for(int k = nums1.length - 1; k > j; k--)
                {
                    nums1[k] = nums1[k-1];
                }
                nums1[j] = i;
                break;
            }
        }
        if(isMax)
        {
            nums1[m] = i;
        }
    }

    public static int getMiddleElement(int[] arr) {
        return arr[arr.length/2];
    }
}
