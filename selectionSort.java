class selectionSort{
   public void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
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
        selectionSort s=new selectionSort();
        int arr[]={1,2,7,4,6,0};
        s.sort(arr);
         
        
    }
    
}
