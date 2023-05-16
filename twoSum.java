class twoSum{


    public void push(int[] newArr, int num){
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = num;
        }
    }

    public int[] getTwoSum(int[] nums, int target){
        // create an index that will define where the elements will be placed
        int[] newArr = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length - 1; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println(i);
                    System.out.println(j);

                    newArr[0] = i;
                    newArr[1] = j;
                }
                
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){

        int[] myArr = {11,15, 7, 2};
       // int[] newArr = new int[2];
        
        twoSum ans = new twoSum();

        for ( int i =0; i < 5; i++){
            for (int j = 1; j < 5; j++){

                System.out.println("i: " + i + " j: " + j);
            }
        }
        
        
       // System.out.println(ans.getTwoSum(myArr, 9));

        
    }




}