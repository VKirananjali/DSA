class bubbleSort{
   public void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                    int temp =a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
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
        bubbleSort b=new bubbleSort();
        int arr[]={1,2,7,4,6,0};
        b.sort(arr);
         
        
    }
    
}

