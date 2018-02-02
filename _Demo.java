import com.wallyfaye.array.Array;
class _Demo {

	public static void main(String[] args){

		int arraySize = 16;
		Array array = new Array(arraySize);

		for(int i = 0; i < arraySize; i++){
			if(array.insertValue(i * 2)){
				System.out.println("Inserted value " + (i * 2));
			}
		}

		array.deleteValue(10);
		System.out.println("Deleted value " + 10);
		array.deleteValue(12);
		System.out.println("Deleted value " + 12);
		array.deleteValue(14);
		System.out.println("Deleted value " + 14);
		array.deleteValue(16);
		System.out.println("Deleted value " + 16);
		array.deleteValue(18);
		System.out.println("Deleted value " + 18);

		for(int i = 0; i < arraySize; i++){
			if(array.getValueByIndex(i) != 0){
				System.out.println("Reading value " + array.getValueByIndex(i));
			}
		}

	}

}