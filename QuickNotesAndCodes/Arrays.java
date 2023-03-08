public class Arrays{
    public static void main(String[] args) {
        int[] arr1 = new int[100];//Intialized with 0s
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        for(int num:arr1){
            System.out.println(num);
        }
    }
}
/*
    arrays eg,int[] are static memory locations.
    So we need to specify the size of arrays everytime we declare it
* */