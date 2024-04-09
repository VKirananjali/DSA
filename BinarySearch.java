class BinarySearch{
    int search(int arr[],int x,int f,int l){
        if(f<=l){
        int mid=(f+l)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]<x){
           return search(arr,x,mid+1,l);
        }
        return search(arr,x,f,mid-1);
    }
    return -1;
    }
    public static void main(String args[]){
        BinarySearch s=new BinarySearch();
        int arr[]={10,20,30,40,50,60};
        int r=s.search(arr,20,0,5);
       if(r!=-2)
       { System.out.println("element is at index: "+r);}
       else{
           System.out.println("element not found");
       }
       
    }
}
