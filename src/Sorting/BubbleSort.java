package Sorting;

public class BubbleSort {
    public static void main(String[] args)
    {
        BubbleSort sort=new BubbleSort();
        sort.bubbleSort();
        sort.insertionSort();
    }
    public void insertionSort()
    {
        int[] list={10,9,8,7,6,5,4,3,2,1,0};
        int tmp;
        int index=0;
        int i;
        int n;
        for (i=0;i<list.length;i++)
        {
            tmp=list[i];
            index=i;
            for (n=i+1;n<list.length;n++)
            {
                if (list[n]<tmp)
                {
                    tmp=list[n];
                    index=n;
                }
            }
            list[index]=list[i];
            list[i]=tmp;
        }

        for( int e:list){
            System.out.print(e+" ");
        }
    }

    public void bubbleSort()
    {
        int[] list={10,9,8,7,6,5,4,3,2,1,0};
        int tmp=0;
        for(int i=0;i+1<list.length;i++)
        {
            for(int n=0;n+1<list.length;n++)
            {
                if (list[n]>list[n+1])
                {
                    tmp=list[n];
                    list[n]=list[n+1];
                    list[n+1]=tmp;
                }

            }
        }
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println("");

    }
}
