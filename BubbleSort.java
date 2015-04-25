class BubbleSort {
public static void BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
}

public static void main(String [] args) {
	int intArray[] = { 10, 3, 5, 2, 11, 232, 2, 0};

	BubbleSort(intArray);
	for(int i: intArray){
		System.out.print(i + " ");
	}
	System.out.println(" ");
}
 
}
