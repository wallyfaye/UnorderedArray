import com.wallyfaye.array.Array;
class _Demo {

	public static void main(String[] args){

		int arraySize = 16;
		Array array = new Array(arraySize);

		for(int i = 0; i < arraySize; i++){
			if(array.push(i * 2)){
				System.out.println("Inserted value " + (i * 2) + " at index " + i);
			}
		}

		for(int i = 0; i < arraySize; i++){
			System.out.println("Reading value " + array.get(i) + " at index " + i);
		}

	}

}