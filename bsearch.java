int [] data;
int size;

public boolean bsearch(int key){
	int low = 0;
	int high = size - 1;
	while(high > low) {
		int mid  = (low + high)/2;
		if(data[mid] == key)
			return true;
		if(data[mid] < key)
			high = mid - 1;
		if(data[mid] > key)
			low = mid + 1;
		}
	return false;
}
