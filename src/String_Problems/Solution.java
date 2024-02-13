package String_Problems;



class Solution {
    public static void main(String[] args) {
//        System.out.println(zoho(new int[]{3,1,7,11}));
//        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
//        System.out.println(zoho("aA","aAAbbbb"))
//        System.out.println(zoho(new int[]{1,0,0,0,1} ,1 ));
//        System.out.println(Arrays.toString(zoho(5)));
        //System.out.println(Arrays.toString(zoho(new int[]{6, 5, 4, 8})));
//        System.out.println(zoho(new int[]{0,3,2,1}));
//        System.out.println(zoho(new int[]{1,3,5,6} , 7));
//        System.out.println(zoho("abca"));


    }
//    public int zoho(int[] nums) {
//    Pair<Integer, Boolean> a = new Pair<Integer, Boolean>(-1, false);
//    Pair<Integer, Boolean> b = new Pair<Integer, Boolean>(-1, false);
//    Pair <Integer, Booleans> c = new Pair<Integer, Boolean> (-1, false);
//    for (int num: nums){
//        if ((a.getValue() && a.getKey() == num) ||
//                (b.getValue() && b.getKey() == num) ||
//                (c.getValue() && c.getKey() == num)) {
//            continue;
//        }
//        if(!a.getValue()||a.getKey()<=num) {
//            c = b;
//            b = a;
//            a = new Pair<Integer, Boolean>(num, true);
//        }else if(!b.getValue()||b.getKey()<=num){
//            c=b;
//            b=new Pair<Integer,Boolean>(num,true);
//        }else if(!c.getValue()||c.getKey()<=num){
//            c=new Pair<Integer,Boolean>(num,true);
//    }
//        if(!c.getValue()){
//            return a.getKey();
//        }
//        return c.getKey();
}
//    public static boolean zoho(String s){
//    int i = 0;
//    int j = s.length() - 1;
//    while(i <= j){
//        if(s.charAt(i) == s.charAt(i))
//            i++;
//        else return help(s, i + 1, j) || help(s, i, j- 1);
//    }
//        return true;
//}
//    public static boolean help(String s, int i, int j){
//         while(i <= j){
//             if(s.charAt(i) == s.charAt(j)){
//                 i++;j--;
//             }else return false;
//         }
//        return true;
//    }




//    public static int zoho(int[]A, int target){
//        int low =0; int hi = A.length-1;
//        while(low<=hi){
//            int mid = (low+hi)/2;
//            if(A[mid]==target)return mid;
//            else if (A[mid]>target) hi=mid+1;
//            else low=mid+1;
//
//        }
//        return low;
//    }
//    public static boolean zoho(int[]arr){
//        if(arr.length<3)return false;
//        int l=0;
//        int r=arr.length-1;
//        while(l+1<arr.length-1 && arr[l]<arr[l+1])l++;
//        while(r-l>0&&arr[r]<arr[r-1])l++;
//        return l==r;
//    }

//    public static int[]zoho(int [] nums){
//        int[]temp=new int[101];
//        for(int i=0; i<nums.length; i++)
//            temp[nums[i]] +=1;
//        for(int j=1; j<= 100; j++)
//            temp[j] += temp[j-1];
//        for(int k=0;k< nums.length; k++){
//            int pos = nums[k];
//            nums[k] = pos==0? 0 : temp[pos-1];
//        }
//        return nums;
//
//    }

//    public static int[] zoho(int num){
//        int[]f=new int[num+1];
//        for(int i=1;i<=num;i++){
//            f[i]=f[i>>1]+(i&1);
//        }
//        return f;
//    }
//    public static boolean zoho(int[]arr , int n){
//        int count = 0;
//        for (int i = 0;i< arr.length; i++){
//            if (arr[i] == 0){
//                boolean l = (i== 0) || (arr[i- 1] == 0);
//                boolean r = (i== arr.length-1) || (arr[i+1] == 0);
//                if(l&&r){
//                    arr[i]=1;
//                    count++;
//                }
//            }
//        }
//        return count>=n;
//    }
//    public static int zoho(String str1, String str2){
//            int num = 0;
//            for (int i = 0;i < str2.length(); i ++) {
//                if(str1.indexOf(str2.charAt(i))!=-1)
//                    num++;
//            }
//        return num;
//
//        }

//    private static int[] buildArray(int[] nums) {
//        int[] ans = new int[nums.length];
//        for(int i = 0;i< nums.length;i++)
//            ans[i] = nums[nums[i]];
//        return ans;
//    }

//    public static boolean zoho(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            int target = 2 * arr[i];
//            int lo = 0, hi = arr.length - 1;
//            while (lo <= hi) {
//                int mid = lo + (hi - lo) / 2;
//                if (arr[mid] == target && mid != i)
//                    return true;
//                else if (arr[mid] < target)
//                    lo = mid + 1;
//                else
//                    hi = mid - 1;
//            }
//        }
//        return false;
//    }
