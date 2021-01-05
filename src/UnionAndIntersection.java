public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        unioun(arr1,arr2);
        System.out.println();
        intersection(arr1,arr2);
    }

    static void unioun(int arr1[],int arr2[] ){
        int m = arr1.length;
        int n = arr2.length;

        System.out.println("Union  ");

        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if(arr1[i] < arr2[j])
                System.out.print(arr1[i++]+ " ");
            else if(arr2[j] < arr1[i])
                System.out.print(arr2[j++]+" ");
            else{
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }

        while(i < m)
            System.out.print(arr1[i++]+" ");
        while(j < n)
            System.out.print(arr2[j++]+" ");

    }

    static void intersection(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;

        System.out.println("Intersection");
        while (i < m && j < n){
            if(arr1[i] < arr2[j])
                i++;
            else if(arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }
    }
}
