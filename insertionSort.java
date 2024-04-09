class insertionSort{
   public void sort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
      print(a);
    }
    void print(int a[]){
        int n=a.length;
        for (int i=0; i<n;i++){
            System.out.print(a[i]+" ");
       }
    }
    public static void main(String args[]){
        insertionSort i=new insertionSort();
        int arr[]={1,2,7,4,6,0};
        i.sort(arr);
         
        
    }
    
}
