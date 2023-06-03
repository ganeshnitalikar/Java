// real time example
//


class RAM {
	static int memoryAvailable = 1024; //total memory available on ram

	int processID = 1233; //instance variable for process
	int memoryOccupied = 50;  //memory occupied by each process

	int updateMemory(){
		memoryAvailable -= memoryOccupied;  //appends static variable 
		return memoryAvailable;
	}
}

class Main{
	public static void main(String args[]){
		RAM p1 = new RAM();
		RAM p2 = new RAM();
		System.out.println("Process ID = " + p1.processID);
		System.out.println("Memory Occupied By process p1 : " + p1.memoryOccupied);
		System.out.println("=======================================================");

		p2.processID = 43242;
		p2.memoryOccupied = 100;

		System.out.println("Process ID = " + p2.processID); // gives process id as updated value
		System.out.println("Memory Occupied By process p2 : " + p2.memoryOccupied); 

		System.out.println("=======================================================");

		System.out.println("Memory available before update : " +p1.memoryAvailable); //memory visible for process  p1 
		p2.updateMemory();    //memory updated by process p2
		System.out.println("Memory available after update : "+p1.memoryAvailable); // change in static variable by p2 is visible to p1 also
	}
}
