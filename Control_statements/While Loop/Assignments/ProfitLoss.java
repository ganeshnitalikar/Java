//Calculate profit loss 
 
class ProfitLoss{
	public static void main(String args[]){
		float costPrice = 1000f;
		float sellingPrice = 1200f;
		float cal ;

		if(sellingPrice > costPrice){
			cal = sellingPrice - costPrice;
			System.out.println("Profit Is : " + cal);
		}else if(sellingPrice < costPrice){
			cal = costPrice - sellingPrice;
			System.out.println("Loss Is : " + cal);
		}else {
			System.out.println("No Profit,No  Loss");
		}
	}
}


